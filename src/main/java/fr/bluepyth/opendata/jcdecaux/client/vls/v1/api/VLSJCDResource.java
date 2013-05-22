package fr.bluepyth.opendata.jcdecaux.client.vls.v1.api;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


public interface VLSJCDResource {
	
	@GET
	@Path("/contracts")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ContractDTO> getContracts(@QueryParam("apiKey") String apiKey);
	
	@GET
	@Path("/stations")
	@Produces(MediaType.APPLICATION_JSON)
	public List<StationDTO> getStations(@QueryParam("apiKey") String apiKey, @QueryParam("contract") String contractName);
	
	@GET
	@Path("/stations/{number}")
	@Produces(MediaType.APPLICATION_JSON)
	public StationDTO getStation(@QueryParam("apiKey") String apiKey, @QueryParam("contract") String contractName, @PathParam("number") String stationNumber);
}
