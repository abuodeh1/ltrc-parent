package jo.gov.ltrc.permit.services.operator;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@NamedStoredProcedureQuery(
        name = "ReturnOperatorByVehicleInformation",
        procedureName = "\"ReturnOperatorByVehicleInformation\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "registrationnumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "permitstatusparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "platecodeparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "platenumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "mindeliverydateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "maxdeliverydateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "vehiclecategoryparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "manufacturerparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "feesstatusparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "usagepurposeparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "minlicenseexpirationparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "maxlicenseexpirationparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "minyearofmanufactureparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "maxyearofmanufactureparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "minpassengersnumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "maxpassengersnumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ownerparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ownernameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "fueltypeparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "addtionaldescriptionsparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "pagesize"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "pageindex"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "sorttype"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "sortby"),


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
    @ApiModelProperty("Operator ID ") private Long operatorid ;
    @ApiModelProperty("Operator Name ") private String operatorname ;
    @ApiModelProperty("Registration Number ") private String registrationnumber ;
    @ApiModelProperty("Car Chassis Number ") private String carchassisnumber ;
    @ApiModelProperty("Plate Code ") private String platecode ;
    @ApiModelProperty("Plate Number ") private String platenumber ;
    @ApiModelProperty("Vehicle Category Name ") private String vehiclecategoryname ;
    @ApiModelProperty("Manufacture ") private String manufacturer ;
    @ApiModelProperty("Usage Purpose Name ") private String usagepurposename ;
    @ApiModelProperty("Owner National ID ") private String ownernationalid ;
    @ApiModelProperty("Owner Name ") private String ownername ;
    @ApiModelProperty("Fuel Type Name ") private String fueltypename ;
    @ApiModelProperty("Additional Descriptions ") private String addtionaldescriptions ;
    @ApiModelProperty("Permit Status ") private Integer permitstatus ;
    @ApiModelProperty("Delivery Date ") private Date deliverydate ;
    @ApiModelProperty("Vehicle Status ") private Integer vehiclestatus ;
    @ApiModelProperty("Status ") private Integer status ;
    @ApiModelProperty("Fees Status ") private Integer feesstatus ;
    @ApiModelProperty("License Expiration ") private Date licenseexpiration ;
    @ApiModelProperty("Year of Manufacture ") private Integer yearofmanufacture ;
    @ApiModelProperty("Passengers Number ") private Integer passengersnumber ;
    @ApiModelProperty("Province ") private Long province ;
    @ApiModelProperty("Province Arabic Name ") private String provincearabicname ;
    @ApiModelProperty("Governorate ") private Long governorate ;
    @ApiModelProperty("Governorate Arabic Name ") private String governoratearabicname ;
    @ApiModelProperty("Municipality ") private Long municipality ;
    @ApiModelProperty("Municipality Arabic Name ") private String municipalityarabicname ;
    @ApiModelProperty("Territory ") private Long territory ;
    @ApiModelProperty("Territory Arabic Name ") private String territoryarabicname ;
    @ApiModelProperty("Operator Category ") private Long operatorcategory ;
    @ApiModelProperty("Operator Category Name ") private String operatorcategoryname ;

    public Long getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(Long operatorid) {
        this.operatorid = operatorid;
    }

    public String getOperatorname() {
        return operatorname;
    }

    public void setOperatorname(String operatorname) {
        this.operatorname = operatorname;
    }

    public String getRegistrationnumber() {
        return registrationnumber;
    }

    public void setRegistrationnumber(String registrationnumber) {
        this.registrationnumber = registrationnumber;
    }

    public String getCarchassisnumber() {
        return carchassisnumber;
    }

    public void setCarchassisnumber(String carchassisnumber) {
        this.carchassisnumber = carchassisnumber;
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

    public Integer getVehiclestatus() {
        return vehiclestatus;
    }

    public void setVehiclestatus(Integer vehiclestatus) {
        this.vehiclestatus = vehiclestatus;
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

    public Integer getPermitstatus() {
        return permitstatus;
    }

    public void setPermitstatus(Integer permitstatus) {
        this.permitstatus = permitstatus;
    }

    public Date getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(Date deliverydate) {
        this.deliverydate = deliverydate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getFeesstatus() {
        return feesstatus;
    }

    public void setFeesstatus(Integer feesstatus) {
        this.feesstatus = feesstatus;
    }

    public Date getLicenseexpiration() {
        return licenseexpiration;
    }

    public void setLicenseexpiration(Date licenseexpiration) {
        this.licenseexpiration = licenseexpiration;
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

    public Long getProvince() {
        return province;
    }

    public void setProvince(Long province) {
        this.province = province;
    }

    public String getProvincearabicname() {
        return provincearabicname;
    }

    public void setProvincearabicname(String provincearabicname) {
        this.provincearabicname = provincearabicname;
    }

    public Long getGovernorate() {
        return governorate;
    }

    public void setGovernorate(Long governorate) {
        this.governorate = governorate;
    }

    public String getGovernoratearabicname() {
        return governoratearabicname;
    }

    public void setGovernoratearabicname(String governoratearabicname) {
        this.governoratearabicname = governoratearabicname;
    }

    public Long getMunicipality() {
        return municipality;
    }

    public void setMunicipality(Long municipality) {
        this.municipality = municipality;
    }

    public String getMunicipalityarabicname() {
        return municipalityarabicname;
    }

    public void setMunicipalityarabicname(String municipalityarabicname) {
        this.municipalityarabicname = municipalityarabicname;
    }

    public Long getTerritory() {
        return territory;
    }

    public void setTerritory(Long territory) {
        this.territory = territory;
    }

    public String getTerritoryarabicname() {
        return territoryarabicname;
    }

    public void setTerritoryarabicname(String territoryarabicname) {
        this.territoryarabicname = territoryarabicname;
    }

    public Long getOperatorcategory() {
        return operatorcategory;
    }

    public void setOperatorcategory(Long operatorcategory) {
        this.operatorcategory = operatorcategory;
    }

    public String getOperatorcategoryname() {
        return operatorcategoryname;
    }

    public void setOperatorcategoryname(String operatorcategoryname) {
        this.operatorcategoryname = operatorcategoryname;
    }

    @Override
    public String toString() {
        return "ReturnOperatorByVehicleInformationResponse{" +
                "operatorid=" + operatorid +
                ", operatorname= " + operatorname + 
                ", registrationnumber= " + registrationnumber + 
                ", carchassisnumber= " + carchassisnumber + 
                ", platecode= " + platecode + 
                ", platenumber= " + platenumber + 
                ", vehiclecategoryname= " + vehiclecategoryname + 
                ", manufacturer= " + manufacturer + 
                ", usagepurposename= " + usagepurposename + 
                ", ownernationalid= " + ownernationalid + 
                ", ownername= " + ownername + 
                ", fueltypename= " + fueltypename + 
                ", addtionaldescriptions= " + addtionaldescriptions + 
                ", permitstatus=" + permitstatus +
                ", deliverydate=" + deliverydate +
                ", vehiclestatus=" + vehiclestatus +
                ", status=" + status +
                ", feesstatus=" + feesstatus +
                ", licenseexpiration=" + licenseexpiration +
                ", yearofmanufacture=" + yearofmanufacture +
                ", passengersnumber=" + passengersnumber +
                ", province=" + province +
                ", provincearabicname= " + provincearabicname + 
                ", governorate=" + governorate +
                ", governoratearabicname= " + governoratearabicname + 
                ", municipality=" + municipality +
                ", municipalityarabicname= " + municipalityarabicname + 
                ", territory=" + territory +
                ", territoryarabicname= " + territoryarabicname + 
                ", operatorcategory=" + operatorcategory +
                ", operatorcategoryname= " + operatorcategoryname + 
                '}';
    }
}