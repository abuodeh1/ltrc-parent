package com.etech.ltrc.permits.operator;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class ReturnVehicleGeneralSearchDataRequest {

    @ApiModelProperty("Minimum Vehicle ID Parameter ") private long minvehicleidparm ;
    @ApiModelProperty("Maximum Vehicle ID Parameter ") private long maxvehicleidparm ;
    @ApiModelProperty("Registration Number Parameter ") private String registrationnumberparm ;
    @ApiModelProperty("Plate Number Parameter ") private String platenumberparm ;
    @ApiModelProperty("Vehicle Category Parameter ") private long vehiclecategoryparm ;
    @ApiModelProperty("Vehicle Category Name Parameter ") private String vehiclecategorynameparm ;
    @ApiModelProperty("Operation Parameter ") private String operationparm ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;
    @ApiModelProperty("Remarks Parameter ") private String remarksparm ;
    @ApiModelProperty("Year of Manufacture Parameter ") private int yearofmanufactureparm ;
    @ApiModelProperty("Passengers Number Parameter ") private int passengersnumberparm ;
    @ApiModelProperty("Manufacture Parameter ") private String manufacturerparm ;
    @ApiModelProperty("Owner Name Parameter ") private String ownernameparm ;
    @ApiModelProperty("License Expiration Parameter ") private Date licenseexpirationparm ;
    @ApiModelProperty("Additional Descriptions Parameter ") private String addtionaldescriptionsparm ;
    @ApiModelProperty("Plate Code Parameter ") private String platecodeparm ;
    @ApiModelProperty("Fees Status Parameter ") private int feesstatusparm ;
    @ApiModelProperty("Office ID Parameter ") private long officeidparm ;
    @ApiModelProperty("Office Name Parameter ") private String officenameparm ;
    @ApiModelProperty("Fuel Type Parameter ") private long fueltypeparm ;
    @ApiModelProperty("Fuel Type Name Parameter ") private String fueltypenameparm ;
    @ApiModelProperty("Vehicle Entry date Parameter ") private Date vehicleentrydateparm ;
    @ApiModelProperty("Owner Parameter ") private String ownerparm ;
    @ApiModelProperty("Operator Parameter ") private long operatorparm ;
    @ApiModelProperty("Vehicle Permit Parameter ") private long vehiclepermitparm ;
    @ApiModelProperty("Operator Name Parameter ") private String operatornameparm ;
    @ApiModelProperty("Page Size Parameter ") private int pagesize ;
    @ApiModelProperty("Page Index Parameter ") private int pageindex ;
    @ApiModelProperty("Sort Type Parameter ") private int sorttype ;
    @ApiModelProperty("Sort By Parameter ") private String sortby ;


    public long getMinvehicleidparm() {
        return minvehicleidparm;
    }

    public void setMinvehicleidparm(long minvehicleidparm) {
        this.minvehicleidparm = minvehicleidparm;
    }

    public long getMaxvehicleidparm() {
        return maxvehicleidparm;
    }

    public void setMaxvehicleidparm(long maxvehicleidparm) {
        this.maxvehicleidparm = maxvehicleidparm;
    }

    public String getRegistrationnumberparm() {
        return registrationnumberparm;
    }

    public void setRegistrationnumberparm(String registrationnumberparm) {
        this.registrationnumberparm = registrationnumberparm;
    }

    public String getPlatenumberparm() {
        return platenumberparm;
    }

    public void setPlatenumberparm(String platenumberparm) {
        this.platenumberparm = platenumberparm;
    }

    public long getVehiclecategoryparm() {
        return vehiclecategoryparm;
    }

    public void setVehiclecategoryparm(long vehiclecategoryparm) {
        this.vehiclecategoryparm = vehiclecategoryparm;
    }

    public String getVehiclecategorynameparm() {
        return vehiclecategorynameparm;
    }

    public void setVehiclecategorynameparm(String vehiclecategorynameparm) {
        this.vehiclecategorynameparm = vehiclecategorynameparm;
    }

    public String getOperationparm() {
        return operationparm;
    }

    public void setOperationparm(String operationparm) {
        this.operationparm = operationparm;
    }

    public int getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(int statusparm) {
        this.statusparm = statusparm;
    }

    public String getRemarksparm() {
        return remarksparm;
    }

    public void setRemarksparm(String remarksparm) {
        this.remarksparm = remarksparm;
    }

    public int getYearofmanufactureparm() {
        return yearofmanufactureparm;
    }

    public void setYearofmanufactureparm(int yearofmanufactureparm) {
        this.yearofmanufactureparm = yearofmanufactureparm;
    }

    public int getPassengersnumberparm() {
        return passengersnumberparm;
    }

    public void setPassengersnumberparm(int passengersnumberparm) {
        this.passengersnumberparm = passengersnumberparm;
    }

    public String getManufacturerparm() {
        return manufacturerparm;
    }

    public void setManufacturerparm(String manufacturerparm) {
        this.manufacturerparm = manufacturerparm;
    }

    public String getOwnernameparm() {
        return ownernameparm;
    }

    public void setOwnernameparm(String ownernameparm) {
        this.ownernameparm = ownernameparm;
    }

    public Date getLicenseexpirationparm() {
        return licenseexpirationparm;
    }

    public void setLicenseexpirationparm(Date licenseexpirationparm) {
        this.licenseexpirationparm = licenseexpirationparm;
    }

    public String getAddtionaldescriptionsparm() {
        return addtionaldescriptionsparm;
    }

    public void setAddtionaldescriptionsparm(String addtionaldescriptionsparm) {
        this.addtionaldescriptionsparm = addtionaldescriptionsparm;
    }

    public String getPlatecodeparm() {
        return platecodeparm;
    }

    public void setPlatecodeparm(String platecodeparm) {
        this.platecodeparm = platecodeparm;
    }

    public int getFeesstatusparm() {
        return feesstatusparm;
    }

    public void setFeesstatusparm(int feesstatusparm) {
        this.feesstatusparm = feesstatusparm;
    }

    public long getOfficeidparm() {
        return officeidparm;
    }

    public void setOfficeidparm(long officeidparm) {
        this.officeidparm = officeidparm;
    }

    public String getOfficenameparm() {
        return officenameparm;
    }

    public void setOfficenameparm(String officenameparm) {
        this.officenameparm = officenameparm;
    }

    public long getFueltypeparm() {
        return fueltypeparm;
    }

    public void setFueltypeparm(long fueltypeparm) {
        this.fueltypeparm = fueltypeparm;
    }

    public String getFueltypenameparm() {
        return fueltypenameparm;
    }

    public void setFueltypenameparm(String fueltypenameparm) {
        this.fueltypenameparm = fueltypenameparm;
    }

    public Date getVehicleentrydateparm() {
        return vehicleentrydateparm;
    }

    public void setVehicleentrydateparm(Date vehicleentrydateparm) {
        this.vehicleentrydateparm = vehicleentrydateparm;
    }

    public String getOwnerparm() {
        return ownerparm;
    }

    public void setOwnerparm(String ownerparm) {
        this.ownerparm = ownerparm;
    }

    public long getOperatorparm() {
        return operatorparm;
    }

    public void setOperatorparm(long operatorparm) {
        this.operatorparm = operatorparm;
    }

    public long getVehiclepermitparm() {
        return vehiclepermitparm;
    }

    public void setVehiclepermitparm(long vehiclepermitparm) {
        this.vehiclepermitparm = vehiclepermitparm;
    }

    public String getOperatornameparm() {
        return operatornameparm;
    }

    public void setOperatornameparm(String operatornameparm) {
        this.operatornameparm = operatornameparm;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public int getPageindex() {
        return pageindex;
    }

    public void setPageindex(int pageindex) {
        this.pageindex = pageindex;
    }

    public int getSorttype() {
        return sorttype;
    }

    public void setSorttype(int sorttype) {
        this.sorttype = sorttype;
    }

    public String getSortby() {
        return sortby;
    }

    public void setSortby(String sortby) {
        this.sortby = sortby;
    }
}
