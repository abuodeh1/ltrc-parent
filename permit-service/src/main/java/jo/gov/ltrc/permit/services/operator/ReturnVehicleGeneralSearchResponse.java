package com.etech.ltrc.permits.operator;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@NamedStoredProcedureQuery(
        name = "ReturnVehicleGeneralSearch",
        procedureName = "\"ReturnVehicleGeneralSearch\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),


        },
        resultSetMappings = {
                "ReturnVehicleGeneralSearchSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnVehicleGeneralSearchSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnVehicleGeneralSearchResponse.class)
                }
        )
})
@Entity
public class ReturnVehicleGeneralSearchResponse implements Serializable {

    @Id
    @ApiModelProperty("Vehicle ID ") private long vehicleid ;
    @ApiModelProperty("Registration Number ") private String registrationnumber ;
    @ApiModelProperty("Plate Number ") private String platenumber ;
    @ApiModelProperty("Vehicle Category ") private long vehiclecategory ;
    @ApiModelProperty("Vehicle Category Name ") private String vehiclecategoryname ;
    @ApiModelProperty("Operation ") private String operation ;
    @ApiModelProperty("Status ") private int status ;
    @ApiModelProperty("Remarks ") private String remarks  ;
    @ApiModelProperty("Year of Manufacture ") private int yearofmanufacture ;
    @ApiModelProperty("Passengers Number ") private int passengersnumber ;
    @ApiModelProperty("Manufacturer ") private String manufacturer ;
    @ApiModelProperty("Owner Name ") private String ownername ;
    @ApiModelProperty("License Expiration ") private Date licenseexpiration ;
    @ApiModelProperty("Additional Descriptions ") private String addtionaldescriptions ;
    @ApiModelProperty("Plate Code ") private String platecode ;
    @ApiModelProperty("Fees Status ") private int feesstatus ;
    @ApiModelProperty("Office ID ") private long officeid ;
    @ApiModelProperty("Office Name ") private String officename ;
    @ApiModelProperty("fuel Type ") private long fueltype ;
    @ApiModelProperty("Fuel Name ") private String fueltypename ;
    @ApiModelProperty("Vehicle Entry Date ") private Date vehicleentrydate ;
    @ApiModelProperty("Vehicle Owner ") private String vehicleowner ;
    @ApiModelProperty("Vehicle Operator ") private long vehicleoperator ;
    @ApiModelProperty("Operator Name ") private String operatorname  ;
    @ApiModelProperty("Permit Status ") private int permitstatus ;
    @ApiModelProperty("Usage Purpose ") private long usagepurpose ;
    @ApiModelProperty("Usage Purpose Name ") private String usagepurposename ;

    public long getVehicleid() {
        return vehicleid;
    }

    public void setVehicleid(long vehicleid) {
        this.vehicleid = vehicleid;
    }

    public String getRegistrationnumber() {
        return registrationnumber;
    }

    public void setRegistrationnumber(String registrationnumber) {
        this.registrationnumber = registrationnumber;
    }

    public String getPlatenumber() {
        return platenumber;
    }

    public void setPlatenumber(String platenumber) {
        this.platenumber = platenumber;
    }

    public long getVehiclecategory() {
        return vehiclecategory;
    }

    public void setVehiclecategory(long vehiclecategory) {
        this.vehiclecategory = vehiclecategory;
    }

    public String getVehiclecategoryname() {
        return vehiclecategoryname;
    }

    public void setVehiclecategoryname(String vehiclecategoryname) {
        this.vehiclecategoryname = vehiclecategoryname;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getYearofmanufacture() {
        return yearofmanufacture;
    }

    public void setYearofmanufacture(int yearofmanufacture) {
        this.yearofmanufacture = yearofmanufacture;
    }

    public int getPassengersnumber() {
        return passengersnumber;
    }

    public void setPassengersnumber(int passengersnumber) {
        this.passengersnumber = passengersnumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public Date getLicenseexpiration() {
        return licenseexpiration;
    }

    public void setLicenseexpiration(Date licenseexpiration) {
        this.licenseexpiration = licenseexpiration;
    }

    public String getAddtionaldescriptions() {
        return addtionaldescriptions;
    }

    public void setAddtionaldescriptions(String addtionaldescriptions) {
        this.addtionaldescriptions = addtionaldescriptions;
    }

    public String getPlatecode() {
        return platecode;
    }

    public void setPlatecode(String platecode) {
        this.platecode = platecode;
    }

    public int getFeesstatus() {
        return feesstatus;
    }

    public void setFeesstatus(int feesstatus) {
        this.feesstatus = feesstatus;
    }

    public long getOfficeid() {
        return officeid;
    }

    public void setOfficeid(long officeid) {
        this.officeid = officeid;
    }

    public String getOfficename() {
        return officename;
    }

    public void setOfficename(String officename) {
        this.officename = officename;
    }

    public long getFueltype() {
        return fueltype;
    }

    public void setFueltype(long fueltype) {
        this.fueltype = fueltype;
    }

    public String getFueltypename() {
        return fueltypename;
    }

    public void setFueltypename(String fueltypename) {
        this.fueltypename = fueltypename;
    }

    public Date getVehicleentrydate() {
        return vehicleentrydate;
    }

    public void setVehicleentrydate(Date vehicleentrydate) {
        this.vehicleentrydate = vehicleentrydate;
    }

    public String getVehicleowner() {
        return vehicleowner;
    }

    public void setVehicleowner(String vehicleowner) {
        this.vehicleowner = vehicleowner;
    }

    public long getVehicleoperator() {
        return vehicleoperator;
    }

    public void setVehicleoperator(long vehicleoperator) {
        this.vehicleoperator = vehicleoperator;
    }

    public String getOperatorname() {
        return operatorname;
    }

    public void setOperatorname(String operatorname) {
        this.operatorname = operatorname;
    }

    public int getPermitstatus() {
        return permitstatus;
    }

    public void setPermitstatus(int permitstatus) {
        this.permitstatus = permitstatus;
    }

    public long getUsagepurpose() {
        return usagepurpose;
    }

    public void setUsagepurpose(long usagepurpose) {
        this.usagepurpose = usagepurpose;
    }

    public String getUsagepurposename() {
        return usagepurposename;
    }

    public void setUsagepurposename(String usagepurposename) {
        this.usagepurposename = usagepurposename;
    }
}
