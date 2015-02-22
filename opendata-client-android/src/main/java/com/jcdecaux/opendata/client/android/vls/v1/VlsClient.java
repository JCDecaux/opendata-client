package com.jcdecaux.opendata.client.android.vls.v1;

import java.util.List;

import org.apache.http.HttpHost;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;

import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.client.ApacheClient;
import retrofit.converter.JacksonConverter;

import com.jcdecaux.opendata.client.common.OpendataContext;
import com.jcdecaux.opendata.client.common.vls.v1.VLSContract;
import com.jcdecaux.opendata.client.common.vls.v1.VLSStation;

public class VlsClient implements VlsService {

	private VlsService retrofitClient;

	public VlsClient(final OpendataContext context) {

		RestAdapter.Builder builder = new RestAdapter.Builder() //
				.setEndpoint(OpendataContext.OPENDATA_BASE_URL) //
				.setConverter(new JacksonConverter()) //
				.setRequestInterceptor(new RequestInterceptor() {
					@Override
					public void intercept(RequestFacade request) {
						request.addQueryParam(OpendataContext.API_KEY_PARAM, context.apiKey);
					}
				});

		if (context.hasProxy) {
			HttpParams params = new BasicHttpParams();
			ConnRouteParams.setDefaultProxy(params, new HttpHost(context.proxyHost, context.proxyPort));

			builder.setClient(new ApacheClient(new DefaultHttpClient(params)));
		}

		this.retrofitClient = builder.build().create(VlsService.class);

	}

	@Override
	public List<VLSContract> getContracts() {
		return retrofitClient.getContracts();
	}

	@Override
	public List<VLSStation> getStations(String contractName) {
		return retrofitClient.getStations(contractName);
	}

	@Override
	public VLSStation getStation(String contractName, String stationNumber) {
		return retrofitClient.getStation(contractName, stationNumber);
	}

}
