package com.jcdecaux.opendata.client.android.vls.v1;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

import com.jcdecaux.opendata.client.common.vls.v1.VLSContract;
import com.jcdecaux.opendata.client.common.vls.v1.VLSStation;

public interface VlsService {

	@GET("/vls/v1/contracts")
	public List<VLSContract> getContracts();

	@GET("/vls/v1/stations")
	public List<VLSStation> getStations(@Query("contract") String contractName);

	@GET("/vls/v1/stations/{number}")
	public VLSStation getStation(@Query("contract") String contractName, @Path("number") String stationNumber);

}
