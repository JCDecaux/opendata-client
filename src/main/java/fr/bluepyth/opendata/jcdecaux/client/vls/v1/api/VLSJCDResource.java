package fr.bluepyth.opendata.jcdecaux.client.vls.v1.api;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


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
