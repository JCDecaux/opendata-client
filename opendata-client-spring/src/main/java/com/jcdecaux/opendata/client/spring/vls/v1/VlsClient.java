package com.jcdecaux.opendata.client.spring.vls.v1;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.jcdecaux.opendata.client.common.OpendataContext;
import com.jcdecaux.opendata.client.common.vls.v1.VLSContract;
import com.jcdecaux.opendata.client.common.vls.v1.VLSStation;

@Component
public class VlsClient {

	private static final String CONTRACTS_TPL = OpendataContext.OPENDATA_BASE_URL + "/vls/v1/contracts?apiKey={apiKey}";
	private static final String STATIONS_TPL = OpendataContext.OPENDATA_BASE_URL + "/vls/v1/stations?apiKey={apiKey}";
	private static final String STATIONS_BY_CONTRACT_TPL = STATIONS_TPL + "&contract={contract}";
	private static final String STATION_TPL = OpendataContext.OPENDATA_BASE_URL + "/vls/v1/stations/{number}?contract={contract}&apiKey={apiKey}";

	@Autowired
	private RestTemplate restTemplate;

	@Value("opendata.client.apiKey")
	private String apiKey;

	public List<VLSContract> getContracts() {
		return Arrays.asList(restTemplate.getForObject(CONTRACTS_TPL, VLSContract[].class, apiKey));
	}

	public List<VLSStation> getStations(String contractName) {
		if (contractName == null) {
			return Arrays.asList(restTemplate.getForObject(STATION_TPL, VLSStation[].class, apiKey));
		} else {
			return Arrays.asList(restTemplate.getForObject(STATIONS_BY_CONTRACT_TPL, VLSStation[].class, apiKey, contractName));
		}
	}

	public VLSStation getStation(String contractName, String stationNumber) {
		return restTemplate.getForObject(STATION_TPL, VLSStation.class, stationNumber, contractName, apiKey);
	}

}
