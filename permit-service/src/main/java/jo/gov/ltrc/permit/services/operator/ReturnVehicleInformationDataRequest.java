package com.etech.ltrc.permits.operator;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;


public class ReturnVehicleInformationDataRequest {

    @ApiModelProperty("Registration Number Parameter") private String registrationnumberparm ;
    @ApiModelProperty("Plate Code Parameter") private String platecodeparm ;
    @ApiModelProperty("Plate Number Parameter") private String platenumberparm ;
    @ApiModelProperty("Manufacture Parameter") private String manufacturerparm ;
    @ApiModelProperty("Office Name Parameter") private String officenameparm ;
    @ApiModelProperty("Vehicle Status Parameter") private int vehiclestatusparm ;
    @ApiModelProperty("Vehicle Category Parameter") private long vehiclecategoryparm ;
    @ApiModelProperty("Fuel Type Parameter") private long fueltypeparm ;
    @ApiModelProperty("Operator Parameter") private long operatorparm ;
    @ApiModelProperty("Permit Status Parameter") private int permitstatusparm ;
    @ApiModelProperty("Permit Parameter") private int permitidparm ;
    @ApiModelProperty("Vehicle Entry Date Parameter") private Date vehicleentrydateparm ;
    @ApiModelProperty("Delivery Date Parameter") private Date deliverydateparm ;

    public String getRegistrationnumberparm() {
        return registrationnumberparm;
    }

    public void setRegistrationnumberparm(String registrationnumberparm) {
        this.registrationnumberparm = registrationnumberparm;
    }

    public String getPlatecodeparm() {
        return platecodeparm;
    }

    public void setPlatecodeparm(String platecodeparm) {
        this.platecodeparm = platecodeparm;
    }

    public String getPlatenumberparm() {
        return platenumberparm;
    }

    public void setPlatenumberparm(String platenumberparm) {
        this.platenumberparm = platenumberparm;
    }

    public String getManufacturerparm() {
        return manufacturerparm;
    }

    public void setManufacturerparm(String manufacturerparm) {
        this.manufacturerparm = manufacturerparm;
    }

    public String getOfficenameparm() {
        return officenameparm;
    }

    public void setOfficenameparm(String officenameparm) {
        this.officenameparm = officenameparm;
    }

    public int getVehiclestatusparm() {
        return vehiclestatusparm;
    }

    public void setVehiclestatusparm(int vehiclestatusparm) {
        this.vehiclestatusparm = vehiclestatusparm;
    }

    public long getVehiclecategoryparm() {
        return vehiclecategoryparm;
    }

    public void setVehiclecategoryparm(long vehiclecategoryparm) {
        this.vehiclecategoryparm = vehiclecategoryparm;
    }

    public long getFueltypeparm() {
        return fueltypeparm;
    }

    public void setFueltypeparm(long fueltypeparm) {
        this.fueltypeparm = fueltypeparm;
    }

    public long getOperatorparm() {
        return operatorparm;
    }

    public void setOperatorparm(long operatorparm) {
        this.operatorparm = operatorparm;
    }

    public int getPermitstatusparm() {
        return permitstatusparm;
    }

    public void setPermitstatusparm(int permitstatusparm) {
        this.permitstatusparm = permitstatusparm;
    }

    public int getPermitidparm() {
        return permitidparm;
    }

    public void setPermitidparm(int permitidparm) {
        this.permitidparm = permitidparm;
    }

    public Date getVehicleentrydateparm() {
        return vehicleentrydateparm;
    }

    public void setVehicleentrydateparm(Date vehicleentrydateparm) {
        this.vehicleentrydateparm = vehicleentrydateparm;
    }

    public Date getDeliverydateparm() {
        return deliverydateparm;
    }

    public void setDeliverydateparm(Date deliverydateparm) {
        this.deliverydateparm = deliverydateparm;
    }
}
