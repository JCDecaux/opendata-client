package com.jcdecaux.opendata.client.vls.v1;

import java.util.List;

import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.jboss.resteasy.client.jaxrs.engines.ApacheHttpClient4Engine;

import com.jcdecaux.opendata.client.OpendataContext;

public class VLSClient implements VLSResource {

	private final VLSResource jaxrsClient;

	public VLSClient(OpendataContext context) {
		ResteasyClient client = new ResteasyClientBuilder() //
				.httpEngine(new ApacheHttpClient4Engine(new DefaultHttpClient(new PoolingClientConnectionManager()))) //
				.build();

		ResteasyWebTarget target = client.target(OpendataContext.OPENDATA_BASE_URL);
		target.queryParam(OpendataContext.API_KEY_PARAM, context.apiKey);

		this.jaxrsClient = target.proxy(VLSResource.class);

	}

	@Override
	public List<VLSContract> getContracts() {
		return jaxrsClient.getContracts();
	}

	@Override
	public List<VLSStation> getStations(String contractName) {
		return jaxrsClient.getStations(contractName);
	}

	@Override
	public VLSStation getStation(String contractName, String stationNumber) {
		return jaxrsClient.getStation(contractName, stationNumber);
	}

}