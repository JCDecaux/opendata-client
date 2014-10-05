package com.jcdecaux.opendata.client.vls.v1.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class StationDTO {

    public enum StationStatus {
        OPEN, CLOSED, DISABLED
    }

    private Integer number;
    @JsonProperty("contract_name")
    private String contractName;
    private String name;
    private String address;
    private PositionDTO position;
    private Boolean banking;
    private Boolean bonus;
    @JsonProperty("bike_stands")
    private Integer bikeStands;
    @JsonProperty("available_bike_stands")
    private Integer availableBikeStands;
    @JsonProperty("available_bikes")
    private Integer availableBikes;
    private StationStatus status;
    @JsonProperty("last_update")
    private Date lastUpdate;


    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
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

    public StationStatus getStatus() {
        return status;
    }

    public void setStatus(StationStatus status) {
        this.status = status;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
