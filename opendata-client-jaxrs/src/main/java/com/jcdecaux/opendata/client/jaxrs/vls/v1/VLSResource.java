package com.jcdecaux.opendata.client.jaxrs.vls.v1;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.jcdecaux.opendata.client.vls.v1.VLSContract;
import com.jcdecaux.opendata.client.vls.v1.VLSStation;

@Path("/vls/v1")
public interface VLSResource {

	@GET
	@Path("/contracts")
	@Produces(MediaType.APPLICATION_JSON)
	public List<VLSContract> getContracts();

	@GET
	@Path("/stations")
	@Produces(MediaType.APPLICATION_JSON)
	public List<VLSStation> getStations(@QueryParam("contract") String contractName);

	@GET
	@Path("/stations/{number}")
	@Produces(MediaType.APPLICATION_JSON)
	public VLSStation getStation(@QueryParam("contract") String contractName, @PathParam("number") String stationNumber);
}
