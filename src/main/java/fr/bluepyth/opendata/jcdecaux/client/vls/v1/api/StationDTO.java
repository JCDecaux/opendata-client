package fr.bluepyth.opendata.jcdecaux.client.vls.v1.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StationDTO {
	private Long number;
	private String name;
	private String address;
	private PositionDTO position;
	private Boolean banking;
	private Boolean bonus;
	private String status;
	@JsonProperty("bike_stands")
	private Integer bikeStands;
	@JsonProperty("available_bike_stands")
	private Integer availableBikeStands;
	@JsonProperty("available_bikes")
	private Integer availableBikes;
	@JsonProperty("last_update")
	private Long lastUpdate;

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public PositionDTO getPosition() {
		return position;
	}

	public void setPosition(PositionDTO position) {
		this.position = position;
	}

	public Boolean getBanking() {
		return banking;
	}

	public void setBanking(Boolean banking) {
		this.banking = banking;
	}

	public Boolean getBonus() {
		return bonus;
	}

	public void setBonus(Boolean bonus) {
		this.bonus = bonus;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getBikeStands() {
		return bikeStands;
	}

	public void setBikeStands(Integer bikeStands) {
		this.bikeStands = bikeStands;
	}

	public Integer getAvailableBikeStands() {
		return availableBikeStands;
	}

	public void setAvailableBikeStands(Integer availableBikeStands) {
		this.availableBikeStands = availableBikeStands;
	}

	public Integer getAvailableBikes() {
		return availableBikes;
	}

	public void setAvailableBikes(Integer availableBikes) {
		this.availableBikes = availableBikes;
	}

	public Long getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Long lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}
