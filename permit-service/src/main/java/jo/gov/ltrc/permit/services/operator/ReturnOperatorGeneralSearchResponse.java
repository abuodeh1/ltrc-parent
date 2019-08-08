package jo.gov.ltrc.permit.services.operator;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@NamedStoredProcedureQuery(
        name = "ReturnOperatorGeneralSearch",
        procedureName = "\"ReturnOperatorGeneralSearch\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),



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
    @ApiModelProperty("Operator ID ") private long operatorid ;
    @ApiModelProperty("Operator National ID ") private String operatornationalid ;
    @ApiModelProperty("Operator Name ") private String operatorname ;
    @ApiModelProperty("Operator Classification ") private long operatorclassification ;
    @ApiModelProperty("Operator Classification Name ") private String operatorclassificationname ;
    @ApiModelProperty("Operator Category ") private long operatorcategory ;
    @ApiModelProperty("Operator Category Name ") private String operatorcategoryname ;
    @ApiModelProperty("Province ") private long province ;
    @ApiModelProperty("Province Arabic Name ") private String provincearabicname ;
    @ApiModelProperty("Governorate ") private long governorate ;
    @ApiModelProperty("Governorate Arabic Name ") private String governoratearabicname ;
    @ApiModelProperty("Municipality ") private long municipality ;
    @ApiModelProperty("Municipality Arabic Name ") private String municipalityarabicname ;
    @ApiModelProperty("Territory ") private long territory ;
    @ApiModelProperty("Territory Arabic Name ") private String territoryarabicname ;
    @ApiModelProperty("Street ") private String street ;
    @ApiModelProperty("Neighborhood ") private String neighborhood ;
    @ApiModelProperty("E-Mail") private String email ;
    @ApiModelProperty("Po Box") private String pobox ;
    @ApiModelProperty("Phone Number ") private String phonenumber ;
    @ApiModelProperty("Mobile Phone Number ") private String mobilephonenumber ;
    @ApiModelProperty("Fax Number ") private String faxnumber ;
    @ApiModelProperty("License Purpose ") private long licensepurpose ;
    @ApiModelProperty("License Purpose Name ") private String licensepurposename ;
    @ApiModelProperty("Status ") private int status ;
    @ApiModelProperty("Office Property Owner ") private String officepropertyowner ;
    @ApiModelProperty("Plot No") private String plotno ;
    @ApiModelProperty("Plot Classification ") private String plotclassification ;
    @ApiModelProperty("Office Area ") private double officearea ;
    @ApiModelProperty("Office Floor ") private String officefloor ;
    @ApiModelProperty("Service Scope ") private String servicescope ;
    @ApiModelProperty("Date of Contract Signing") private Date dateofcontractsigning ;
    @ApiModelProperty("Contract Period ") private String contractperiod ;
    @ApiModelProperty("Commercial Name Record Number ") private String commercialnamerecordnumber ;
    @ApiModelProperty("Commercial Name") private String commercialname ;
    @ApiModelProperty("Commercial Record Number ") private String commercialrecordnumber ;
    @ApiModelProperty("Commercial Record Date ") private Date commercialrecorddate ;
    @ApiModelProperty("Employees Number ") private int employeesnumber ;
    @ApiModelProperty("Drivers Number ") private int driversnumber ;
    @ApiModelProperty("Working Cars Number ") private int workingcarsnumber ;
    @ApiModelProperty("Basic Cars Number ") private int basiccarsnumber ;
    @ApiModelProperty("Office Closing Date ") private Date officeclosingdate ;
    @ApiModelProperty("Remarks ") private String remarks ;
    @ApiModelProperty("Fees Status ") private int feesstatus ;
    @ApiModelProperty("License ") private Date licenseissuedate ;
    @ApiModelProperty("License ") private Date licenseexpiredate ;
    @ApiModelProperty("Certification Registration Number ") private String certificateregistrationnumber ;
    @ApiModelProperty("Basin") private String basin ;


    public long getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(long operatorid) {
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

    public long getOperatorclassification() {
        return operatorclassification;
    }

    public void setOperatorclassification(long operatorclassification) {
        this.operatorclassification = operatorclassification;
    }

    public String getOperatorclassificationname() {
        return operatorclassificationname;
    }

    public void setOperatorclassificationname(String operatorclassificationname) {
        this.operatorclassificationname = operatorclassificationname;
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

    public long getLicensepurpose() {
        return licensepurpose;
    }

    public void setLicensepurpose(long licensepurpose) {
        this.licensepurpose = licensepurpose;
    }

    public String getLicensepurposename() {
        return licensepurposename;
    }

    public void setLicensepurposename(String licensepurposename) {
        this.licensepurposename = licensepurposename;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
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

    public double getOfficearea() {
        return officearea;
    }

    public void setOfficearea(double officearea) {
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

    public String getContractperiod() {
        return contractperiod;
    }

    public void setContractperiod(String contractperiod) {
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

    public int getEmployeesnumber() {
        return employeesnumber;
    }

    public void setEmployeesnumber(int employeesnumber) {
        this.employeesnumber = employeesnumber;
    }

    public int getDriversnumber() {
        return driversnumber;
    }

    public void setDriversnumber(int driversnumber) {
        this.driversnumber = driversnumber;
    }

    public int getWorkingcarsnumber() {
        return workingcarsnumber;
    }

    public void setWorkingcarsnumber(int workingcarsnumber) {
        this.workingcarsnumber = workingcarsnumber;
    }

    public int getBasiccarsnumber() {
        return basiccarsnumber;
    }

    public void setBasiccarsnumber(int basiccarsnumber) {
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

    public int getFeesstatus() {
        return feesstatus;
    }

    public void setFeesstatus(int feesstatus) {
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
}
