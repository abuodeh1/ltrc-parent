package jo.gov.ltrc.permit.services.operator;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@NamedStoredProcedureQuery(
        name = "ReturnOperatorBranch",
        procedureName = "\"ReturnOperatorBranch\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "minoperatorbranchidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "maxoperatorbranchidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "maxoperatoridparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "minoperatoridparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "operatornameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "provinceparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "provincearabicnameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "governorateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "governoratearabicnameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "municipalityparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "municipalityarabicnameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "territoryparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "territoryarabicnameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "neighborhoodparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "streetparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "basinparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "plotnoparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "poboxparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "telephoneparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "faxparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "mobilephoneparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "emailparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "aggreementreferencenumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "aggreementreferencedateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "minvehiclecountparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "maxvehiclecountparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "branchnameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "pagesize"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "pageindex"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "sorttype"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "sortby"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "statusparm"),


        },
        resultSetMappings = {
                "ReturnOperatorBranchSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnOperatorBranchSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnOperatorBranchResponse.class)
                }
        )
})
@Entity
public class ReturnOperatorBranchResponse implements Serializable {

    @Id
    @ApiModelProperty("Operator Branch ID ") private Long operatorbranchid ;
    @ApiModelProperty("Operator ID ") private Long operatorid ;
    @ApiModelProperty("Operator Name ") private String operatorname ;
    @ApiModelProperty("Province ") private Long province ;
    @ApiModelProperty("Province Arabic Name ") private String provincearabicname ;
    @ApiModelProperty("Governorate ") private Long governorate ;
    @ApiModelProperty("Governorate Arabic Name ") private String governoratearabicname ;
    @ApiModelProperty("Municipality ") private Long municipality ;
    @ApiModelProperty("Municipality Arabic Name ") private String municipalityarabicname ;
    @ApiModelProperty("Territory ") private Long territory ;
    @ApiModelProperty("Territory Arabic Name ") private String territoryarabicname ;
    @ApiModelProperty("Neighborhood ") private String neighborhood ;
    @ApiModelProperty("Street ") private String street ;
    @ApiModelProperty("Basin ") private String basin ;
    @ApiModelProperty("Plot No") private String plotno ;
    @ApiModelProperty("Po Box ") private String pobox ;
    @ApiModelProperty("Telephone ") private String telephone ;
    @ApiModelProperty("Fax ") private String fax ;
    @ApiModelProperty("Mobile Phone ") private String mobilephone ;
    @ApiModelProperty("E-Mail ") private String email ;
    @ApiModelProperty("Agreement Reference Number ") private String aggreementreferencenumber ;
    @ApiModelProperty("Agreement Reference Date ") private Date aggreementreferencedate ;
    @ApiModelProperty("Vehicle Count ") private Integer vehiclecount ;
    @ApiModelProperty("Branch Name ") private String branchname ;
    @ApiModelProperty("Certification Registration Number ") private String certificateregistrationnumber ;
    @ApiModelProperty("Status ") private String status ;


    public Long getOperatorbranchid() {
        return operatorbranchid;
    }

    public void setOperatorbranchid(Long operatorbranchid) {
        this.operatorbranchid = operatorbranchid;
    }

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

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBasin() {
        return basin;
    }

    public void setBasin(String basin) {
        this.basin = basin;
    }

    public String getPlotno() {
        return plotno;
    }

    public void setPlotno(String plotno) {
        this.plotno = plotno;
    }

    public String getPobox() {
        return pobox;
    }

    public void setPobox(String pobox) {
        this.pobox = pobox;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAggreementreferencenumber() {
        return aggreementreferencenumber;
    }

    public void setAggreementreferencenumber(String aggreementreferencenumber) {
        this.aggreementreferencenumber = aggreementreferencenumber;
    }

    public Date getAggreementreferencedate() {
        return aggreementreferencedate;
    }

    public void setAggreementreferencedate(Date aggreementreferencedate) {
        this.aggreementreferencedate = aggreementreferencedate;
    }

    public Integer getVehiclecount() {
        return vehiclecount;
    }

    public void setVehiclecount(Integer vehiclecount) {
        this.vehiclecount = vehiclecount;
    }

    public String getBranchname() {
        return branchname;
    }

    public void setBranchname(String branchname) {
        this.branchname = branchname;
    }

    public String getCertificateregistrationnumber() {
        return certificateregistrationnumber;
    }

    public void setCertificateregistrationnumber(String certificateregistrationnumber) {
        this.certificateregistrationnumber = certificateregistrationnumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ReturnOperatorBranchResponse{" +
                "operatorbranchid=" + operatorbranchid +
                ", operatorid=" + operatorid +
                ", operatorname=" + operatorname +
                ", province=" + province +
                ", provincearabicname=" + provincearabicname +
                ", governorate=" + governorate +
                ", governoratearabicname=" + governoratearabicname +
                ", municipality=" + municipality +
                ", municipalityarabicname=" + municipalityarabicname +
                ", territory=" + territory +
                ", territoryarabicname=" + territoryarabicname +
                ", neighborhood=" + neighborhood +
                ", street=" + street +
                ", basin=" + basin +
                ", plotno=" + plotno +
                ", pobox=" + pobox +
                ", telephone=" + telephone +
                ", fax=" + fax +
                ", mobilephone=" + mobilephone +
                ", email=" + email +
                ", aggreementreferencenumber=" + aggreementreferencenumber +
                ", aggreementreferencedate=" + aggreementreferencedate +
                ", vehiclecount=" + vehiclecount +
                ", branchname=" + branchname +
                ", certificateregistrationnumber=" + certificateregistrationnumber +
                ", status=" + status +
                '}';
    }
}
