package fr.bluepyth.opendata.jcdecaux.client.vls.v1;

import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.jboss.resteasy.client.jaxrs.engines.ApacheHttpClient4Engine;

import fr.bluepyth.opendata.jcdecaux.client.vls.v1.api.VLSJCDResource;

public class VLSClient {
	
	public static final VLSJCDResource vlsClient = getClient();
	
	private static VLSJCDResource getClient() {
		// Use thread-safe client
		ResteasyClient client = new ResteasyClientBuilder()
			.httpEngine(new ApacheHttpClient4Engine(new DefaultHttpClient(new ThreadSafeClientConnManager()))).build();

		ResteasyWebTarget target = client.target("https://api.jcdecaux.com/vls/v1");

		return target.proxy(VLSJCDResource.class);
	}
}