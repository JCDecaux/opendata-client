package com.jcdecaux.opendata.client.common.vls.v1;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VLSPosition {
	@JsonProperty("lat")
	private Double latitude;
	@JsonProperty("lng")
	private Double longitude;

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

}
