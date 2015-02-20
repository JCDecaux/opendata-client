package com.jcdecaux.opendata.client.vls.v1.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public final class ContractDTO {
    private String name;
    @JsonProperty("commercial_name")
    private String commercialName;
    private List<String> cities;
    @JsonProperty("country_code")
    private String countryCode;

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

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
