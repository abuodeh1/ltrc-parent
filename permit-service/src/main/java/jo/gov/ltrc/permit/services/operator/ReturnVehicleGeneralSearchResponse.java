package jo.gov.ltrc.permit.services.operator;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@NamedStoredProcedureQuery(
        name = "ReturnVehicleGeneralSearch",
        procedureName = "\"ReturnVehicleGeneralSearch\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "minvehicleidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "maxvehicleidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "registrationnumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "platenumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "vehiclecategoryparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "vehiclecategorynameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "operationparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "remarksparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "yearofmanufactureparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "passengersnumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "manufacturerparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ownernameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "licenseexpirationparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "addtionaldescriptionsparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "platecodeparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "feesstatusparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "officeidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "officenameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "fueltypeparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "fueltypenameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "vehicleentrydateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ownerparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatorparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "vehiclepermitparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "operatornameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "pagesize"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "pageindex"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "sorttype"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "sortby"),


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
    @ApiModelProperty("Vehicle ID ") private Long vehicleid ;
    @ApiModelProperty("Registration Number ") private String registrationnumber ;
    @ApiModelProperty("Plate Number ") private String platenumber ;
    @ApiModelProperty("Vehicle Category ") private Long vehiclecategory ;
    @ApiModelProperty("Vehicle Category Name ") private String vehiclecategoryname ;
    @ApiModelProperty("Operation ") private String operation ;
    @ApiModelProperty("Status ") private Integer status ;
    @ApiModelProperty("Remarks ") private String remarks  ;
    @ApiModelProperty("Year of Manufacture ") private Integer yearofmanufacture ;
    @ApiModelProperty("Passengers Number ") private Integer passengersnumber ;
    @ApiModelProperty("Manufacturer ") private String manufacturer ;
    @ApiModelProperty("Owner Name ") private String ownername ;
    @ApiModelProperty("License Expiration ") private Date licenseexpiration ;
    @ApiModelProperty("Additional Descriptions ") private String addtionaldescriptions ;
    @ApiModelProperty("Plate Code ") private String platecode ;
    @ApiModelProperty("Fees Status ") private Integer feesstatus ;
    @ApiModelProperty("Office ID ") private Long officeid ;
    @ApiModelProperty("Office Name ") private String officename ;
    @ApiModelProperty("fuel Type ") private Long fueltype ;
    @ApiModelProperty("Fuel Name ") private String fueltypename ;
    @ApiModelProperty("Vehicle Entry Date ") private Date vehicleentrydate ;
    @ApiModelProperty("Vehicle Owner ") private String vehicleowner ;
    @ApiModelProperty("Vehicle Operator ") private Long vehicleoperator ;
    @ApiModelProperty("Operator Name ") private String operatorname  ;
    @ApiModelProperty("Permit Status ") private Integer permitstatus ;
    @ApiModelProperty("Usage Purpose ") private Long usagepurpose ;
    @ApiModelProperty("Usage Purpose Name ") private String usagepurposename ;

    public Long getVehicleid() {
        return vehicleid;
    }

    public void setVehicleid(Long vehicleid) {
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

    public Long getVehiclecategory() {
        return vehiclecategory;
    }

    public void setVehiclecategory(Long vehiclecategory) {
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getYearofmanufacture() {
        return yearofmanufacture;
    }

    public void setYearofmanufacture(Integer yearofmanufacture) {
        this.yearofmanufacture = yearofmanufacture;
    }

    public Integer getPassengersnumber() {
        return passengersnumber;
    }

    public void setPassengersnumber(Integer passengersnumber) {
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

    public Integer getFeesstatus() {
        return feesstatus;
    }

    public void setFeesstatus(Integer feesstatus) {
        this.feesstatus = feesstatus;
    }

    public Long getOfficeid() {
        return officeid;
    }

    public void setOfficeid(Long officeid) {
        this.officeid = officeid;
    }

    public String getOfficename() {
        return officename;
    }

    public void setOfficename(String officename) {
        this.officename = officename;
    }

    public Long getFueltype() {
        return fueltype;
    }

    public void setFueltype(Long fueltype) {
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

    public Long getVehicleoperator() {
        return vehicleoperator;
    }

    public void setVehicleoperator(Long vehicleoperator) {
        this.vehicleoperator = vehicleoperator;
    }

    public String getOperatorname() {
        return operatorname;
    }

    public void setOperatorname(String operatorname) {
        this.operatorname = operatorname;
    }

    public Integer getPermitstatus() {
        return permitstatus;
    }

    public void setPermitstatus(Integer permitstatus) {
        this.permitstatus = permitstatus;
    }

    public Long getUsagepurpose() {
        return usagepurpose;
    }

    public void setUsagepurpose(Long usagepurpose) {
        this.usagepurpose = usagepurpose;
    }

    public String getUsagepurposename() {
        return usagepurposename;
    }

    public void setUsagepurposename(String usagepurposename) {
        this.usagepurposename = usagepurposename;
    }

    @Override
    public String toString() {
        return "ReturnVehicleGeneralSearchResponse{" +
                "vehicleid=" + vehicleid +
                ", registrationnumber=" + registrationnumber +
                ", platenumber=" + platenumber +
                ", vehiclecategory=" + vehiclecategory +
                ", vehiclecategoryname=" + vehiclecategoryname +
                ", operation=" + operation +
                ", status=" + status +
                ", remarks=" + remarks +
                ", yearofmanufacture=" + yearofmanufacture +
                ", passengersnumber=" + passengersnumber +
                ", manufacturer=" + manufacturer +
                ", ownername=" + ownername +
                ", licenseexpiration=" + licenseexpiration +
                ", addtionaldescriptions=" + addtionaldescriptions +
                ", platecode=" + platecode +
                ", feesstatus=" + feesstatus +
                ", officeid=" + officeid +
                ", officename=" + officename +
                ", fueltype=" + fueltype +
                ", fueltypename=" + fueltypename +
                ", vehicleentrydate=" + vehicleentrydate +
                ", vehicleowner=" + vehicleowner +
                ", vehicleoperator=" + vehicleoperator +
                ", operatorname=" + operatorname +
                ", permitstatus=" + permitstatus +
                ", usagepurpose=" + usagepurpose +
                ", usagepurposename=" + usagepurposename +
                '}';
    }
}
