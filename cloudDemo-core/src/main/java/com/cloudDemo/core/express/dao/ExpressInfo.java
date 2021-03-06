/**
 * Copyright 2018 bejson.com
 */
package com.cloudDemo.core.express.dao;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Auto-generated: 2018-07-19 22:27:22
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class ExpressInfo {

    @JsonProperty("LogisticCode")
    private String LogisticCode;
    @JsonProperty("ShipperCode")
    private String ShipperCode;
    @JsonProperty("Traces")
    private List<Traces> Traces;
    @JsonProperty("State")
    private String State;
    @JsonProperty("EBusinessID")
    private String EBusinessID;
    @JsonProperty("Success")
    private boolean Success;

    private String ShipperName;

    public void setLogisticCode(String LogisticCode) {
        this.LogisticCode = LogisticCode;
    }

    public String getLogisticCode() {
        return LogisticCode;
    }

    public void setShipperCode(String ShipperCode) {
        this.ShipperCode = ShipperCode;
    }

    public String getShipperCode() {
        return ShipperCode;
    }

    public void setTraces(List<Traces> Traces) {
        this.Traces = Traces;
    }

    public List<Traces> getTraces() {
        return Traces;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getState() {
        return State;
    }

    public void setEBusinessID(String EBusinessID) {
        this.EBusinessID = EBusinessID;
    }

    public String getEBusinessID() {
        return EBusinessID;
    }

    public void setSuccess(boolean Success) {
        this.Success = Success;
    }

    public boolean getSuccess() {
        return Success;
    }

    public String getShipperName() {
        return ShipperName;
    }

    public void setShipperName(String shipperName) {
        ShipperName = shipperName;
    }
}