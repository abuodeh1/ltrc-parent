package jo.gov.ltrc.permit.services.operator;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class SaveOperatorDataRequest {

    @ApiModelProperty("Operator ID Parameter ") private long operatoridparm ;
    @ApiModelProperty("Operator National ID Parameter ") private String operatornationalidparm ;
    @ApiModelProperty("Operator Name Parameter ") private String operatornameparm ;
    @ApiModelProperty("Operator Classification Parameter ") private long operatorclassificationparm ;
    @ApiModelProperty("Operator Category Parameter ") private long operatorcategoryparm ;
    @ApiModelProperty("Province Parameter ") private long provinceparm ;
    @ApiModelProperty("Governorate Parameter ") private long governorateparm ;
    @ApiModelProperty("Municipality Parameter ") private long municipalityparm ;
    @ApiModelProperty("Territory Parameter ") private long territoryparm ;
    @ApiModelProperty("Street Parameter ") private String streetparm ;
    @ApiModelProperty("Neighborhood Parameter ") private String neighborhoodparm ;
    @ApiModelProperty("Email Parameter ") private String emailparm ;
    @ApiModelProperty("Po Box Parameter ") private String poboxparm ;
    @ApiModelProperty("Phone Number Parameter ") private String phonenumberparm ;
    @ApiModelProperty("Mobile Number Parameter ") private String mobilephonenumberparm ;
    @ApiModelProperty("Fax Number Parameter ") private String faxnumberparm ;
    @ApiModelProperty("License Purpose Parameter ") private long licensepurposeparm ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;
    @ApiModelProperty("Office Property Owner Parameter ") private String officepropertyownerparm ;
    @ApiModelProperty("Plate No Parameter ") private String plotnoparm ;
    @ApiModelProperty("Office Area Parameter ") private double officeareaparm ;
    @ApiModelProperty("Service Scope Parameter ") private String servicescopeparm ;
    @ApiModelProperty("Date of Contract Singing Parameter ") private Date dateofcontractsigningparm ;
    @ApiModelProperty("Commercial Name record Number Parameter ") private String commercialnamerecordnumberparm ;
    @ApiModelProperty("Commercial Name Parameter ") private String commercialnameparm ;
    @ApiModelProperty("Commercial Record Number Parameter ") private String commercialrecordnumberparm ;
    @ApiModelProperty("Commercial Record Date Parameter ") private Date commercialrecorddateparm ;
    @ApiModelProperty("Employees Number Parameter ") private int employeesnumberparm ;
    @ApiModelProperty("Drivers Number Parameter ") private int driversnumberparm ;
    @ApiModelProperty("Working Cars Number Parameter ") private int workingcarsnumberparm ;
    @ApiModelProperty("Basic Cars Number Parameter ") private int basiccarsnumberparm ;
    @ApiModelProperty("Office Closing Date Parameter ") private Date officeclosingdateparm ;
    @ApiModelProperty("Remarks Parameter ") private String remarksparm ;
    @ApiModelProperty("Fees Status Parameter ") private int feesstatusparm ;
    @ApiModelProperty("License Issue Date Parameter ") private Date licenseissuedateparm ;
    @ApiModelProperty("License Expire Date Parameter ") private Date licenseexpiredateparm ;
    @ApiModelProperty("Plot Classification Parameter ") private String plotclassificationparm ;
    @ApiModelProperty("Office Floor Parameter ") private String officefloorparm ;
    @ApiModelProperty("Contract Period Parameter ") private double contractperiodparm ;
    @ApiModelProperty("Certification Registration Number Parameter ") private String certificateregistrationnumberparm ;
    @ApiModelProperty("Basin Parameter ") private String basinparm ;
    @ApiModelProperty("Principal Parameter ") private long princepel ;

    public long getOperatoridparm() {
        return operatoridparm;
    }

    public void setOperatoridparm(long operatoridparm) {
        this.operatoridparm = operatoridparm;
    }

    public String getOperatornationalidparm() {
        return operatornationalidparm;
    }

    public void setOperatornationalidparm(String operatornationalidparm) {
        this.operatornationalidparm = operatornationalidparm;
    }

    public String getOperatornameparm() {
        return operatornameparm;
    }

    public void setOperatornameparm(String operatornameparm) {
        this.operatornameparm = operatornameparm;
    }

    public long getOperatorclassificationparm() {
        return operatorclassificationparm;
    }

    public void setOperatorclassificationparm(long operatorclassificationparm) {
        this.operatorclassificationparm = operatorclassificationparm;
    }

    public long getOperatorcategoryparm() {
        return operatorcategoryparm;
    }

    public void setOperatorcategoryparm(long operatorcategoryparm) {
        this.operatorcategoryparm = operatorcategoryparm;
    }

    public long getProvinceparm() {
        return provinceparm;
    }

    public void setProvinceparm(long provinceparm) {
        this.provinceparm = provinceparm;
    }

    public long getGovernorateparm() {
        return governorateparm;
    }

    public void setGovernorateparm(long governorateparm) {
        this.governorateparm = governorateparm;
    }

    public long getMunicipalityparm() {
        return municipalityparm;
    }

    public void setMunicipalityparm(long municipalityparm) {
        this.municipalityparm = municipalityparm;
    }

    public long getTerritoryparm() {
        return territoryparm;
    }

    public void setTerritoryparm(long territoryparm) {
        this.territoryparm = territoryparm;
    }

    public String getStreetparm() {
        return streetparm;
    }

    public void setStreetparm(String streetparm) {
        this.streetparm = streetparm;
    }

    public String getNeighborhoodparm() {
        return neighborhoodparm;
    }

    public void setNeighborhoodparm(String neighborhoodparm) {
        this.neighborhoodparm = neighborhoodparm;
    }

    public String getEmailparm() {
        return emailparm;
    }

    public void setEmailparm(String emailparm) {
        this.emailparm = emailparm;
    }

    public String getPoboxparm() {
        return poboxparm;
    }

    public void setPoboxparm(String poboxparm) {
        this.poboxparm = poboxparm;
    }

    public String getPhonenumberparm() {
        return phonenumberparm;
    }

    public void setPhonenumberparm(String phonenumberparm) {
        this.phonenumberparm = phonenumberparm;
    }

    public String getMobilephonenumberparm() {
        return mobilephonenumberparm;
    }

    public void setMobilephonenumberparm(String mobilephonenumberparm) {
        this.mobilephonenumberparm = mobilephonenumberparm;
    }

    public String getFaxnumberparm() {
        return faxnumberparm;
    }

    public void setFaxnumberparm(String faxnumberparm) {
        this.faxnumberparm = faxnumberparm;
    }

    public long getLicensepurposeparm() {
        return licensepurposeparm;
    }

    public void setLicensepurposeparm(long licensepurposeparm) {
        this.licensepurposeparm = licensepurposeparm;
    }

    public int getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(int statusparm) {
        this.statusparm = statusparm;
    }

    public String getOfficepropertyownerparm() {
        return officepropertyownerparm;
    }

    public void setOfficepropertyownerparm(String officepropertyownerparm) {
        this.officepropertyownerparm = officepropertyownerparm;
    }

    public String getPlotnoparm() {
        return plotnoparm;
    }

    public void setPlotnoparm(String plotnoparm) {
        this.plotnoparm = plotnoparm;
    }

    public double getOfficeareaparm() {
        return officeareaparm;
    }

    public void setOfficeareaparm(double officeareaparm) {
        this.officeareaparm = officeareaparm;
    }

    public String getServicescopeparm() {
        return servicescopeparm;
    }

    public void setServicescopeparm(String servicescopeparm) {
        this.servicescopeparm = servicescopeparm;
    }

    public Date getDateofcontractsigningparm() {
        return dateofcontractsigningparm;
    }

    public void setDateofcontractsigningparm(Date dateofcontractsigningparm) {
        this.dateofcontractsigningparm = dateofcontractsigningparm;
    }

    public String getCommercialnamerecordnumberparm() {
        return commercialnamerecordnumberparm;
    }

    public void setCommercialnamerecordnumberparm(String commercialnamerecordnumberparm) {
        this.commercialnamerecordnumberparm = commercialnamerecordnumberparm;
    }

    public String getCommercialnameparm() {
        return commercialnameparm;
    }

    public void setCommercialnameparm(String commercialnameparm) {
        this.commercialnameparm = commercialnameparm;
    }

    public String getCommercialrecordnumberparm() {
        return commercialrecordnumberparm;
    }

    public void setCommercialrecordnumberparm(String commercialrecordnumberparm) {
        this.commercialrecordnumberparm = commercialrecordnumberparm;
    }

    public Date getCommercialrecorddateparm() {
        return commercialrecorddateparm;
    }

    public void setCommercialrecorddateparm(Date commercialrecorddateparm) {
        this.commercialrecorddateparm = commercialrecorddateparm;
    }

    public int getEmployeesnumberparm() {
        return employeesnumberparm;
    }

    public void setEmployeesnumberparm(int employeesnumberparm) {
        this.employeesnumberparm = employeesnumberparm;
    }

    public int getDriversnumberparm() {
        return driversnumberparm;
    }

    public void setDriversnumberparm(int driversnumberparm) {
        this.driversnumberparm = driversnumberparm;
    }

    public int getWorkingcarsnumberparm() {
        return workingcarsnumberparm;
    }

    public void setWorkingcarsnumberparm(int workingcarsnumberparm) {
        this.workingcarsnumberparm = workingcarsnumberparm;
    }

    public int getBasiccarsnumberparm() {
        return basiccarsnumberparm;
    }

    public void setBasiccarsnumberparm(int basiccarsnumberparm) {
        this.basiccarsnumberparm = basiccarsnumberparm;
    }

    public Date getOfficeclosingdateparm() {
        return officeclosingdateparm;
    }

    public void setOfficeclosingdateparm(Date officeclosingdateparm) {
        this.officeclosingdateparm = officeclosingdateparm;
    }

    public String getRemarksparm() {
        return remarksparm;
    }

    public void setRemarksparm(String remarksparm) {
        this.remarksparm = remarksparm;
    }

    public int getFeesstatusparm() {
        return feesstatusparm;
    }

    public void setFeesstatusparm(int feesstatusparm) {
        this.feesstatusparm = feesstatusparm;
    }

    public Date getLicenseissuedateparm() {
        return licenseissuedateparm;
    }

    public void setLicenseissuedateparm(Date licenseissuedateparm) {
        this.licenseissuedateparm = licenseissuedateparm;
    }

    public Date getLicenseexpiredateparm() {
        return licenseexpiredateparm;
    }

    public void setLicenseexpiredateparm(Date licenseexpiredateparm) {
        this.licenseexpiredateparm = licenseexpiredateparm;
    }

    public String getPlotclassificationparm() {
        return plotclassificationparm;
    }

    public void setPlotclassificationparm(String plotclassificationparm) {
        this.plotclassificationparm = plotclassificationparm;
    }

    public String getOfficefloorparm() {
        return officefloorparm;
    }

    public void setOfficefloorparm(String officefloorparm) {
        this.officefloorparm = officefloorparm;
    }

    public double getContractperiodparm() {
        return contractperiodparm;
    }

    public void setContractperiodparm(double contractperiodparm) {
        this.contractperiodparm = contractperiodparm;
    }

    public String getCertificateregistrationnumberparm() {
        return certificateregistrationnumberparm;
    }

    public void setCertificateregistrationnumberparm(String certificateregistrationnumberparm) {
        this.certificateregistrationnumberparm = certificateregistrationnumberparm;
    }

    public String getBasinparm() {
        return basinparm;
    }

    public void setBasinparm(String basinparm) {
        this.basinparm = basinparm;
    }

    public long getPrincepel() {
        return princepel;
    }

    public void setPrincepel(long princepel) {
        this.princepel = princepel;
    }
}
