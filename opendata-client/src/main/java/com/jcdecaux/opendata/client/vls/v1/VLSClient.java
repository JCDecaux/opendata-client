package com.jcdecaux.opendata.client.vls.v1;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.jboss.resteasy.client.jaxrs.engines.ApacheHttpClient4Engine;

import com.jcdecaux.opendata.client.vls.v1.VLSContract;
import com.jcdecaux.opendata.client.vls.v1.VLSStation;

public class VLSClient {

    public static final VLSResource vlsClient = getClient();

    private static VLSResource getClient() {
        // Use thread-safe client
        ResteasyClient client = new ResteasyClientBuilder()
                .httpEngine(new ApacheHttpClient4Engine(new DefaultHttpClient(new PoolingClientConnectionManager()))).build();

        ResteasyWebTarget target = client.target("https://api.jcdecaux.com/vls/v1");

        return target.proxy(VLSResource.class);
    }
    
    public interface VLSResource {

        @GET
        @Path("/contracts")
        @Produces(MediaType.APPLICATION_JSON)
        public List<VLSContract> getContracts(@QueryParam("apiKey") String apiKey);

        @GET
        @Path("/stations")
        @Produces(MediaType.APPLICATION_JSON)
        public List<VLSStation> getStations(@QueryParam("apiKey") String apiKey, @QueryParam("contract") String contractName);

        @GET
        @Path("/stations/{number}")
        @Produces(MediaType.APPLICATION_JSON)
        public VLSStation getStation(@QueryParam("apiKey") String apiKey, @QueryParam("contract") String contractName, @PathParam("number") String stationNumber);
    }

}