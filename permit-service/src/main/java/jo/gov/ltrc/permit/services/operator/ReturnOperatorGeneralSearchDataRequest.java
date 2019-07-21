package jo.gov.ltrc.permit.services.operator;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class ReturnOperatorGeneralSearchDataRequest {

    @ApiModelProperty("Minimum Operator ID Parameter ") private long minoperatoridparm ;
    @ApiModelProperty("Maximum Operator ID Parameter ") private long maxoperatoridparm ;
    @ApiModelProperty("Operator Classification Parameter ") private long operatorclassificationparm ;
    @ApiModelProperty("Operator Category Parameter ") private long operatorcategoryparm ;
    @ApiModelProperty("Province Parameter ") private long provinceparm ;
    @ApiModelProperty("Governorate Parameter ") private long governorateparm ;
    @ApiModelProperty("Municipality Parameter ") private long municipalityparm ;
    @ApiModelProperty("Territory Parameter ") private long territoryparm ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;
    @ApiModelProperty("Employees Number Parameter ") private int employeesnumberparm ;
    @ApiModelProperty("Drivers Number Parameter ") private int driversnumberparm ;
    @ApiModelProperty("Working Cars Number Parameter ") private int workingcarsnumberparm ;
    @ApiModelProperty("Basic Cars Number Parameter ") private int basiccarsnumberparm ;
    @ApiModelProperty("Fees Status Parameter ") private int feesstatusparm ;
    @ApiModelProperty("Office Area Parameter ") private double officeareaparm ;
    @ApiModelProperty("License Purpose Parameter ") private long licensepurposeparm ;
    @ApiModelProperty("Operator National ID Parameter ") private String operatornationalidparm ;
    @ApiModelProperty("Operator Name  Parameter ") private String operatornameparm ;
    @ApiModelProperty("Operator Commercial Name Parameter ") private String operatorcomercialnameparm ;
    @ApiModelProperty("Operator Classification Name Parameter ") private String operatorclassificationnameparm ;
    @ApiModelProperty("Operator Category Name Parameter ") private String operatorcategorynameparm ;
    @ApiModelProperty("Province Arabic Name Parameter ") private String provincearabicnameparm ;
    @ApiModelProperty("Governorate Arabic Name Parameter ") private String governoratearabicnameparm ;
    @ApiModelProperty("Municipality Arabic Name Parameter ") private String municipalityarabicnameparm ;
    @ApiModelProperty("Territory Arabic Name Parameter ") private String territoryarabicnameparm ;
    @ApiModelProperty("Street Parameter ") private String streetparm ;
    @ApiModelProperty("Neighborhood Parameter ") private String neighborhoodparm ;
    @ApiModelProperty("E-Mail Parameter ") private String emailparm ;
    @ApiModelProperty("Po Box Parameter ") private String poboxparm ;
    @ApiModelProperty("Phone Number Parameter ") private String phonenumberparm ;
    @ApiModelProperty("Mobile Phone Number Parameter ") private String mobilephonenumberparm ;
    @ApiModelProperty("Fax Number Parameter ") private String faxnumberparm ;
    @ApiModelProperty("Contract Period Parameter ") private double contractperiodparm ;
    @ApiModelProperty("Commercial Name Record Number Parameter ") private String commercialnamerecordnumberparm ;
    @ApiModelProperty("Commercial Name Parameter ") private String commercialnameparm ;
    @ApiModelProperty("Commercial Record Number Parameter ") private String commercialrecordnumberparm ;
    @ApiModelProperty("Office Property Owner Parameter ") private String officepropertyownerparm ;
    @ApiModelProperty("Plot No Parameter ") private String plotnoparm ;
    @ApiModelProperty("Plot Classification Parameter ") private String plotclassificationparm ;
    @ApiModelProperty("Office Floor Parameter ") private String officefloorparm ;
    @ApiModelProperty("Service Scope Parameter ") private String servicescopeparm ;
    @ApiModelProperty("License Purpose Name Parameter ") private String licensepurposenameparm ;
    @ApiModelProperty("Remarks Parameter ") private String remarksparm ;
    @ApiModelProperty("License Issue Date Parameter ") private Date licenseissuedateparm ;
    @ApiModelProperty("Date of Contract Signing Parameter ") private Date dateofcontractsigningparm ;
    @ApiModelProperty("License Expire Date Parameter ") private Date licenseexpiredateparm ;
    @ApiModelProperty("Office Closing Date Parameter ") private Date officeclosingdateparm ;
    @ApiModelProperty("Commercial Record Date Parameter ") private Date commercialrecorddateparm ;
    @ApiModelProperty("Page Size Parameter ") private int pagesize ;
    @ApiModelProperty("Page Index Parameter ") private int pageindex ;
    @ApiModelProperty("Sort Type Parameter ") private int sorttype ;
    @ApiModelProperty("Sort By Parameter ") private String sortby ;

    public long getMinoperatoridparm() {
        return minoperatoridparm;
    }

    public void setMinoperatoridparm(long minoperatoridparm) {
        this.minoperatoridparm = minoperatoridparm;
    }

    public long getMaxoperatoridparm() {
        return maxoperatoridparm;
    }

    public void setMaxoperatoridparm(long maxoperatoridparm) {
        this.maxoperatoridparm = maxoperatoridparm;
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

    public int getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(int statusparm) {
        this.statusparm = statusparm;
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

    public int getFeesstatusparm() {
        return feesstatusparm;
    }

    public void setFeesstatusparm(int feesstatusparm) {
        this.feesstatusparm = feesstatusparm;
    }

    public double getOfficeareaparm() {
        return officeareaparm;
    }

    public void setOfficeareaparm(double officeareaparm) {
        this.officeareaparm = officeareaparm;
    }

    public long getLicensepurposeparm() {
        return licensepurposeparm;
    }

    public void setLicensepurposeparm(long licensepurposeparm) {
        this.licensepurposeparm = licensepurposeparm;
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

    public String getOperatorcomercialnameparm() {
        return operatorcomercialnameparm;
    }

    public void setOperatorcomercialnameparm(String operatorcomercialnameparm) {
        this.operatorcomercialnameparm = operatorcomercialnameparm;
    }

    public String getOperatorclassificationnameparm() {
        return operatorclassificationnameparm;
    }

    public void setOperatorclassificationnameparm(String operatorclassificationnameparm) {
        this.operatorclassificationnameparm = operatorclassificationnameparm;
    }

    public String getOperatorcategorynameparm() {
        return operatorcategorynameparm;
    }

    public void setOperatorcategorynameparm(String operatorcategorynameparm) {
        this.operatorcategorynameparm = operatorcategorynameparm;
    }

    public String getProvincearabicnameparm() {
        return provincearabicnameparm;
    }

    public void setProvincearabicnameparm(String provincearabicnameparm) {
        this.provincearabicnameparm = provincearabicnameparm;
    }

    public String getGovernoratearabicnameparm() {
        return governoratearabicnameparm;
    }

    public void setGovernoratearabicnameparm(String governoratearabicnameparm) {
        this.governoratearabicnameparm = governoratearabicnameparm;
    }

    public String getMunicipalityarabicnameparm() {
        return municipalityarabicnameparm;
    }

    public void setMunicipalityarabicnameparm(String municipalityarabicnameparm) {
        this.municipalityarabicnameparm = municipalityarabicnameparm;
    }

    public String getTerritoryarabicnameparm() {
        return territoryarabicnameparm;
    }

    public void setTerritoryarabicnameparm(String territoryarabicnameparm) {
        this.territoryarabicnameparm = territoryarabicnameparm;
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

    public Double getContractperiodparm() {
        return contractperiodparm;
    }

    public void setContractperiodparm(Double contractperiodparm) {
        this.contractperiodparm = contractperiodparm;
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

    public String getServicescopeparm() {
        return servicescopeparm;
    }

    public void setServicescopeparm(String servicescopeparm) {
        this.servicescopeparm = servicescopeparm;
    }

    public String getLicensepurposenameparm() {
        return licensepurposenameparm;
    }

    public void setLicensepurposenameparm(String licensepurposenameparm) {
        this.licensepurposenameparm = licensepurposenameparm;
    }

    public String getRemarksparm() {
        return remarksparm;
    }

    public void setRemarksparm(String remarksparm) {
        this.remarksparm = remarksparm;
    }

    public Date getLicenseissuedateparm() {
        return licenseissuedateparm;
    }

    public void setLicenseissuedateparm(Date licenseissuedateparm) {
        this.licenseissuedateparm = licenseissuedateparm;
    }

    public Date getDateofcontractsigningparm() {
        return dateofcontractsigningparm;
    }

    public void setDateofcontractsigningparm(Date dateofcontractsigningparm) {
        this.dateofcontractsigningparm = dateofcontractsigningparm;
    }

    public Date getLicenseexpiredateparm() {
        return licenseexpiredateparm;
    }

    public void setLicenseexpiredateparm(Date licenseexpiredateparm) {
        this.licenseexpiredateparm = licenseexpiredateparm;
    }

    public Date getOfficeclosingdateparm() {
        return officeclosingdateparm;
    }

    public void setOfficeclosingdateparm(Date officeclosingdateparm) {
        this.officeclosingdateparm = officeclosingdateparm;
    }

    public Date getCommercialrecorddateparm() {
        return commercialrecorddateparm;
    }

    public void setCommercialrecorddateparm(Date commercialrecorddateparm) {
        this.commercialrecorddateparm = commercialrecorddateparm;
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
