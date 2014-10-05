package com.jcdecaux.opendata.client.vls.v1;

import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.jboss.resteasy.client.jaxrs.engines.ApacheHttpClient4Engine;

import com.jcdecaux.opendata.client.vls.v1.api.VLSResource;

public class VLSClient {

    public static final VLSResource vlsClient = getClient();

    private static VLSResource getClient() {
        // Use thread-safe client
        ResteasyClient client = new ResteasyClientBuilder()
                .httpEngine(new ApacheHttpClient4Engine(new DefaultHttpClient(new PoolingClientConnectionManager()))).build();

        ResteasyWebTarget target = client.target("https://api.jcdecaux.com/vls/v1");

        return target.proxy(VLSResource.class);
    }
}