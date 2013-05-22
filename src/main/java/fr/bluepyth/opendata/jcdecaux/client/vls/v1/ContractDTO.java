package fr.bluepyth.opendata.jcdecaux.client.vls.v1;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContractDTO {
	private String name;
	@JsonProperty("commercial_name")
	private String commercialName;
	private List<String> cities;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCommercialName() {
		return commercialName;
	}

	public void setCommercialName(String commercialName) {
		this.commercialName = commercialName;
	}

	public List<String> getCities() {
		return cities;
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}

}
