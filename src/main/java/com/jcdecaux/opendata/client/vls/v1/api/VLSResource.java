package com.jcdecaux.opendata.client.vls.v1.api;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.jcdecaux.opendata.client.vls.v1.api.dto.ContractDTO;
import com.jcdecaux.opendata.client.vls.v1.api.dto.StationDTO;

import java.util.List;


public interface VLSResource {

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
