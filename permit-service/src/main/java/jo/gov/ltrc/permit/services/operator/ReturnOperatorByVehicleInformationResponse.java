package jo.gov.ltrc.permit.services.operator;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@NamedStoredProcedureQuery(
        name = "ReturnOperatorByVehicleInformation",
        procedureName = "\"ReturnOperatorByVehicleInformation\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),


        },
        resultSetMappings = {
                "ReturnOperatorByVehicleInformationSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnOperatorByVehicleInformationSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnOperatorByVehicleInformationResponse.class)
                }
        )
})
@Entity
public class ReturnOperatorByVehicleInformationResponse implements Serializable {

    @Id
    @ApiModelProperty("Operator ID ") private long operatorid ;
    @ApiModelProperty("Operator Name ") private String operatorname ;
    @ApiModelProperty("Registration Number ") private String registrationnumber ;
    @ApiModelProperty("Plate Code ") private String platecode ;
    @ApiModelProperty("Plate Number ") private String platenumber ;
    @ApiModelProperty("Vehicle Category Name ") private String vehiclecategoryname ;
    @ApiModelProperty("Manufacture ") private String manufacturer ;
    @ApiModelProperty("Usage Purpose Name ") private String usagepurposename ;
    @ApiModelProperty("Owner National ID ") private String ownernationalid ;
    @ApiModelProperty("Owner Name ") private String ownername ;
    @ApiModelProperty("Fuel Type Name ") private String fueltypename ;
    @ApiModelProperty("Additional Descriptions ") private String addtionaldescriptions ;
    @ApiModelProperty("Permit Status ") private int permitstatus ;
    @ApiModelProperty("Delivery Date ") private Date deliverydate ;
    @ApiModelProperty("Status ") private int status ;
    @ApiModelProperty("Fees Status ") private int feesstatus ;
    @ApiModelProperty("License Expiration ") private Date licenseexpiration ;
    @ApiModelProperty("Year of Manufacture ") private int yearofmanufacture ;
    @ApiModelProperty("Passengers Number ") private int passengersnumber ;
    @ApiModelProperty("Province ") private long province ;
    @ApiModelProperty("Province Arabic Name ") private String provincearabicname ;
    @ApiModelProperty("Governorate ") private long governorate ;
    @ApiModelProperty("Governorate Arabic Name ") private String governoratearabicname ;
    @ApiModelProperty("Municipality ") private long municipality ;
    @ApiModelProperty("Municipality Arabic Name ") private String municipalityarabicname ;
    @ApiModelProperty("Territory ") private long territory ;
    @ApiModelProperty("Territory Arabic Name ") private String territoryarabicname ;
    @ApiModelProperty("Operator Category ") private long operatorcategory ;
    @ApiModelProperty("Operator Category Name ") private String operatorcategoryname ;

    public long getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(long operatorid) {
        this.operatorid = operatorid;
    }

    public String getOperatorname() {
        return operatorname;
    }

    public void setOperatorname(String operatorname) {
        this.operatorname = operatorname;
    }

    public String getRegistrationnumberparm() {
        return registrationnumber;
    }

    public void setRegistrationnumberparm(String registrationnumberparm) {
        this.registrationnumber = registrationnumberparm;
    }

    public String getPlatecode() {
        return platecode;
    }

    public void setPlatecode(String platecode) {
        this.platecode = platecode;
    }

    public String getPlatenumber() {
        return platenumber;
    }

    public void setPlatenumber(String platenumber) {
        this.platenumber = platenumber;
    }

    public String getVehiclecategoryname() {
        return vehiclecategoryname;
    }

    public void setVehiclecategoryname(String vehiclecategoryname) {
        this.vehiclecategoryname = vehiclecategoryname;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getUsagepurposename() {
        return usagepurposename;
    }

    public void setUsagepurposename(String usagepurposename) {
        this.usagepurposename = usagepurposename;
    }

    public String getOwnernationalid() {
        return ownernationalid;
    }

    public void setOwnernationalid(String ownernationalid) {
        this.ownernationalid = ownernationalid;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public String getFueltypename() {
        return fueltypename;
    }

    public void setFueltypename(String fueltypename) {
        this.fueltypename = fueltypename;
    }

    public String getAddtionaldescriptions() {
        return addtionaldescriptions;
    }

    public void setAddtionaldescriptions(String addtionaldescriptions) {
        this.addtionaldescriptions = addtionaldescriptions;
    }

    public int getPermitstatus() {
        return permitstatus;
    }

    public void setPermitstatus(int permitstatus) {
        this.permitstatus = permitstatus;
    }

    public Date getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(Date deliverydate) {
        this.deliverydate = deliverydate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getFeesstatus() {
        return feesstatus;
    }

    public void setFeesstatus(int feesstatus) {
        this.feesstatus = feesstatus;
    }

    public Date getLicenseexpiration() {
        return licenseexpiration;
    }

    public void setLicenseexpiration(Date licenseexpiration) {
        this.licenseexpiration = licenseexpiration;
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

    public long getProvince() {
        return province;
    }

    public void setProvince(long province) {
        this.province = province;
    }

    public String getProvincearabicname() {
        return provincearabicname;
    }

    public void setProvincearabicname(String provincearabicname) {
        this.provincearabicname = provincearabicname;
    }

    public long getGovernorate() {
        return governorate;
    }

    public void setGovernorate(long governorate) {
        this.governorate = governorate;
    }

    public String getGovernoratearabicname() {
        return governoratearabicname;
    }

    public void setGovernoratearabicname(String governoratearabicname) {
        this.governoratearabicname = governoratearabicname;
    }

    public long getMunicipality() {
        return municipality;
    }

    public void setMunicipality(long municipality) {
        this.municipality = municipality;
    }

    public String getMunicipalityarabicname() {
        return municipalityarabicname;
    }

    public void setMunicipalityarabicname(String municipalityarabicname) {
        this.municipalityarabicname = municipalityarabicname;
    }

    public long getTerritory() {
        return territory;
    }

    public void setTerritory(long territory) {
        this.territory = territory;
    }

    public String getTerritoryarabicname() {
        return territoryarabicname;
    }

    public void setTerritoryarabicname(String territoryarabicname) {
        this.territoryarabicname = territoryarabicname;
    }

    public long getOperatorcategory() {
        return operatorcategory;
    }

    public void setOperatorcategory(long operatorcategory) {
        this.operatorcategory = operatorcategory;
    }

    public String getOperatorcategoryname() {
        return operatorcategoryname;
    }

    public void setOperatorcategoryname(String operatorcategoryname) {
        this.operatorcategoryname = operatorcategoryname;
    }
}