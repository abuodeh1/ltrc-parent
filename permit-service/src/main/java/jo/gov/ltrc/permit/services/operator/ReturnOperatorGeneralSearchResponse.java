package jo.gov.ltrc.permit.services.operator;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@NamedStoredProcedureQuery(
        name = "ReturnOperatorGeneralSearch",
        procedureName = "\"ReturnOperatorGeneralSearch\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "minoperatoridparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "maxoperatoridparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatorclassificationparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatorcategoryparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "provinceparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "governorateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "municipalityparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "territoryparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "employeesnumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "driversnumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "workingcarsnumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "basiccarsnumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "feesstatusparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "officeareaparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "licensepurposeparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "operatornationalidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "operatornameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "operatorcomercialnameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "operatorclassificationnameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "operatorcategorynameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "provincearabicnameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "governoratearabicnameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "municipalityarabicnameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "territoryarabicnameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "streetparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "neighborhoodparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "emailparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "poboxparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "phonenumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "mobilephonenumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "faxnumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "contractperiodparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "commercialnamerecordnumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "commercialnameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "commercialrecordnumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "officepropertyownerparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "plotnoparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "plotclassificationparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "officefloorparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "servicescopeparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "licensepurposenameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "remarksparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "licenseissuedateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "dateofcontractsigningparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "licenseexpiredateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "officeclosingdateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "commercialrecorddateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "pagesize"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "pageindex"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "sorttype"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "sortby"),



        },
        resultSetMappings = {
                "ReturnOperatorGeneralSearchSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnOperatorGeneralSearchSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnOperatorGeneralSearchResponse.class)
                }
        )
})
@Entity
public class ReturnOperatorGeneralSearchResponse implements Serializable {

    @Id
    @ApiModelProperty("Operator ID ") private Long operatorid ;
    @ApiModelProperty("Operator National ID ") private String operatornationalid ;
    @ApiModelProperty("Operator Name ") private String operatorname ;
    @ApiModelProperty("Operator Classification ") private Long operatorclassification ;
    @ApiModelProperty("Operator Classification Name ") private String operatorclassificationname ;
    @ApiModelProperty("Operator Category ") private Long operatorcategory ;
    @ApiModelProperty("Operator Category Name ") private String operatorcategoryname ;
    @ApiModelProperty("Province ") private Long province ;
    @ApiModelProperty("Province Arabic Name ") private String provincearabicname ;
    @ApiModelProperty("Governorate ") private Long governorate ;
    @ApiModelProperty("Governorate Arabic Name ") private String governoratearabicname ;
    @ApiModelProperty("Municipality ") private Long municipality ;
    @ApiModelProperty("Municipality Arabic Name ") private String municipalityarabicname ;
    @ApiModelProperty("Territory ") private Long territory ;
    @ApiModelProperty("Territory Arabic Name ") private String territoryarabicname ;
    @ApiModelProperty("Street ") private String street ;
    @ApiModelProperty("Neighborhood ") private String neighborhood ;
    @ApiModelProperty("E-Mail") private String email ;
    @ApiModelProperty("Po Box") private String pobox ;
    @ApiModelProperty("Phone Number ") private String phonenumber ;
    @ApiModelProperty("Mobile Phone Number ") private String mobilephonenumber ;
    @ApiModelProperty("Fax Number ") private String faxnumber ;
    @ApiModelProperty("License Purpose ") private Long licensepurpose ;
    @ApiModelProperty("License Purpose Name ") private String licensepurposename ;
    @ApiModelProperty("Status ") private Integer status ;
    @ApiModelProperty("Office Property Owner ") private String officepropertyowner ;
    @ApiModelProperty("Plot No") private String plotno ;
    @ApiModelProperty("Plot Classification ") private String plotclassification ;
    @ApiModelProperty("Office Area ") private  Double officearea ;
    @ApiModelProperty("Office Floor ") private String officefloor ;
    @ApiModelProperty("Service Scope ") private String servicescope ;
    @ApiModelProperty("Date of Contract Signing") private Date dateofcontractsigning ;
    @ApiModelProperty("Contract Period ") private Double contractperiod ;
    @ApiModelProperty("Commercial Name Record Number ") private String commercialnamerecordnumber ;
    @ApiModelProperty("Commercial Name") private String commercialname ;
    @ApiModelProperty("Commercial Record Number ") private String commercialrecordnumber ;
    @ApiModelProperty("Commercial Record Date ") private Date commercialrecorddate ;
    @ApiModelProperty("Employees Number ") private Integer employeesnumber ;
    @ApiModelProperty("Drivers Number ") private Integer driversnumber ;
    @ApiModelProperty("Working Cars Number ") private Long workingcarsnumber ;
    @ApiModelProperty("Basic Cars Number ") private Long basiccarsnumber ;
    @ApiModelProperty("Office Closing Date ") private Date officeclosingdate ;
    @ApiModelProperty("Remarks ") private String remarks ;
    @ApiModelProperty("Fees Status ") private Integer feesstatus ;
    @ApiModelProperty("License Issue Date ") private Date licenseissuedate ;
    @ApiModelProperty("license Expired Date ") private Date licenseexpiredate ;
    @ApiModelProperty("Certificate Registration Number ") private String certificateregistrationnumber ;
    @ApiModelProperty("Basin ") private String basin ;

    public Long getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(Long operatorid) {
        this.operatorid = operatorid;
    }

    public String getOperatornationalid() {
        return operatornationalid;
    }

    public void setOperatornationalid(String operatornationalid) {
        this.operatornationalid = operatornationalid;
    }

    public String getOperatorname() {
        return operatorname;
    }

    public void setOperatorname(String operatorname) {
        this.operatorname = operatorname;
    }

    public Long getOperatorclassification() {
        return operatorclassification;
    }

    public void setOperatorclassification(Long operatorclassification) {
        this.operatorclassification = operatorclassification;
    }

    public String getOperatorclassificationname() {
        return operatorclassificationname;
    }

    public void setOperatorclassificationname(String operatorclassificationname) {
        this.operatorclassificationname = operatorclassificationname;
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPobox() {
        return pobox;
    }

    public void setPobox(String pobox) {
        this.pobox = pobox;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getMobilephonenumber() {
        return mobilephonenumber;
    }

    public void setMobilephonenumber(String mobilephonenumber) {
        this.mobilephonenumber = mobilephonenumber;
    }

    public String getFaxnumber() {
        return faxnumber;
    }

    public void setFaxnumber(String faxnumber) {
        this.faxnumber = faxnumber;
    }

    public Long getLicensepurpose() {
        return licensepurpose;
    }

    public void setLicensepurpose(Long licensepurpose) {
        this.licensepurpose = licensepurpose;
    }

    public String getLicensepurposename() {
        return licensepurposename;
    }

    public void setLicensepurposename(String licensepurposename) {
        this.licensepurposename = licensepurposename;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOfficepropertyowner() {
        return officepropertyowner;
    }

    public void setOfficepropertyowner(String officepropertyowner) {
        this.officepropertyowner = officepropertyowner;
    }

    public String getPlotno() {
        return plotno;
    }

    public void setPlotno(String plotno) {
        this.plotno = plotno;
    }

    public String getPlotclassification() {
        return plotclassification;
    }

    public void setPlotclassification(String plotclassification) {
        this.plotclassification = plotclassification;
    }

    public Double getOfficearea() {
        return officearea;
    }

    public void setOfficearea(Double officearea) {
        this.officearea = officearea;
    }

    public String getOfficefloor() {
        return officefloor;
    }

    public void setOfficefloor(String officefloor) {
        this.officefloor = officefloor;
    }

    public String getServicescope() {
        return servicescope;
    }

    public void setServicescope(String servicescope) {
        this.servicescope = servicescope;
    }

    public Date getDateofcontractsigning() {
        return dateofcontractsigning;
    }

    public void setDateofcontractsigning(Date dateofcontractsigning) {
        this.dateofcontractsigning = dateofcontractsigning;
    }

    public Double getContractperiod() {
        return contractperiod;
    }

    public void setContractperiod(Double contractperiod) {
        this.contractperiod = contractperiod;
    }

    public String getCommercialnamerecordnumber() {
        return commercialnamerecordnumber;
    }

    public void setCommercialnamerecordnumber(String commercialnamerecordnumber) {
        this.commercialnamerecordnumber = commercialnamerecordnumber;
    }

    public String getCommercialname() {
        return commercialname;
    }

    public void setCommercialname(String commercialname) {
        this.commercialname = commercialname;
    }

    public String getCommercialrecordnumber() {
        return commercialrecordnumber;
    }

    public void setCommercialrecordnumber(String commercialrecordnumber) {
        this.commercialrecordnumber = commercialrecordnumber;
    }

    public Date getCommercialrecorddate() {
        return commercialrecorddate;
    }

    public void setCommercialrecorddate(Date commercialrecorddate) {
        this.commercialrecorddate = commercialrecorddate;
    }

    public Integer getEmployeesnumber() {
        return employeesnumber;
    }

    public void setEmployeesnumber(Integer employeesnumber) {
        this.employeesnumber = employeesnumber;
    }

    public Integer getDriversnumber() {
        return driversnumber;
    }

    public void setDriversnumber(Integer driversnumber) {
        this.driversnumber = driversnumber;
    }

    public Long getWorkingcarsnumber() {
        return workingcarsnumber;
    }

    public void setWorkingcarsnumber(Long workingcarsnumber) {
        this.workingcarsnumber = workingcarsnumber;
    }

    public Long getBasiccarsnumber() {
        return basiccarsnumber;
    }

    public void setBasiccarsnumber(Long basiccarsnumber) {
        this.basiccarsnumber = basiccarsnumber;
    }

    public Date getOfficeclosingdate() {
        return officeclosingdate;
    }

    public void setOfficeclosingdate(Date officeclosingdate) {
        this.officeclosingdate = officeclosingdate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getFeesstatus() {
        return feesstatus;
    }

    public void setFeesstatus(Integer feesstatus) {
        this.feesstatus = feesstatus;
    }

    public Date getLicenseissuedate() {
        return licenseissuedate;
    }

    public void setLicenseissuedate(Date licenseissuedate) {
        this.licenseissuedate = licenseissuedate;
    }

    public Date getLicenseexpiredate() {
        return licenseexpiredate;
    }

    public void setLicenseexpiredate(Date licenseexpiredate) {
        this.licenseexpiredate = licenseexpiredate;
    }

    public String getCertificateregistrationnumber() {
        return certificateregistrationnumber;
    }

    public void setCertificateregistrationnumber(String certificateregistrationnumber) {
        this.certificateregistrationnumber = certificateregistrationnumber;
    }

    public String getBasin() {
        return basin;
    }

    public void setBasin(String basin) {
        this.basin = basin;
    }

    @Override
    public String toString() {
        return "ReturnOperatorGeneralSearchResponse{" +
                "operatorid=" + operatorid +
                ", operatornationalid= " + operatornationalid + 
                ", operatorname= " + operatorname + 
                ", operatorclassification=" + operatorclassification +
                ", operatorclassificationname= " + operatorclassificationname + 
                ", operatorcategory=" + operatorcategory +
                ", operatorcategoryname= " + operatorcategoryname + 
                ", province=" + province +
                ", provincearabicname= " + provincearabicname + 
                ", governorate=" + governorate +
                ", governoratearabicname= " + governoratearabicname + 
                ", municipality=" + municipality +
                ", municipalityarabicname= " + municipalityarabicname + 
                ", territory=" + territory +
                ", territoryarabicname= " + territoryarabicname + 
                ", street= " + street + 
                ", neighborhood= " + neighborhood + 
                ", email= " + email + 
                ", pobox= " + pobox + 
                ", phonenumber= " + phonenumber + 
                ", mobilephonenumber= " + mobilephonenumber + 
                ", faxnumber= " + faxnumber + 
                ", licensepurpose=" + licensepurpose +
                ", licensepurposename= " + licensepurposename + 
                ", status=" + status +
                ", officepropertyowner= " + officepropertyowner + 
                ", plotno= " + plotno + 
                ", plotclassification= " + plotclassification + 
                ", officearea=" + officearea +
                ", officefloor= " + officefloor + 
                ", servicescope= " + servicescope + 
                ", dateofcontractsigning=" + dateofcontractsigning +
                ", contractperiod=" + contractperiod +
                ", commercialnamerecordnumber= " + commercialnamerecordnumber + 
                ", commercialname= " + commercialname + 
                ", commercialrecordnumber= " + commercialrecordnumber + 
                ", commercialrecorddate=" + commercialrecorddate +
                ", employeesnumber=" + employeesnumber +
                ", driversnumber=" + driversnumber +
                ", workingcarsnumber=" + workingcarsnumber +
                ", basiccarsnumber=" + basiccarsnumber +
                ", officeclosingdate=" + officeclosingdate +
                ", remarks= " + remarks + 
                ", feesstatus=" + feesstatus +
                ", licenseissuedate=" + licenseissuedate +
                ", licenseexpiredate=" + licenseexpiredate +
                ", certificateregistrationnumber= " + certificateregistrationnumber + 
                ", basin= " + basin + 
                '}';
    }
}
