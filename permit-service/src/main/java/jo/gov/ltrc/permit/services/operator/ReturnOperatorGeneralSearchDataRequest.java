package jo.gov.ltrc.permit.services.operator;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class ReturnOperatorGeneralSearchDataRequest {

    @ApiModelProperty("Minimum Operator ID Parameter ") private Long minoperatoridparm ;
    @ApiModelProperty("Maximum Operator ID Parameter ") private Long maxoperatoridparm ;
    @ApiModelProperty("Operator Classification Parameter ") private Long operatorclassificationparm ;
    @ApiModelProperty("Operator Category Parameter ") private Long operatorcategoryparm ;
    @ApiModelProperty("Province Parameter ") private Long provinceparm ;
    @ApiModelProperty("Governorate Parameter ") private Long governorateparm ;
    @ApiModelProperty("Municipality Parameter ") private Long municipalityparm ;
    @ApiModelProperty("Territory Parameter ") private Long territoryparm ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;
    @ApiModelProperty("Employees Number Parameter ") private Integer employeesnumberparm ;
    @ApiModelProperty("Drivers Number Parameter ") private Integer driversnumberparm ;
    @ApiModelProperty("Working Cars Number Parameter ") private Integer workingcarsnumberparm ;
    @ApiModelProperty("Basic Cars Number Parameter ") private Integer basiccarsnumberparm ;
    @ApiModelProperty("Fees Status Parameter ") private Integer feesstatusparm ;
    @ApiModelProperty("Office Area Parameter ") private  Double officeareaparm ;
    @ApiModelProperty("License Purpose Parameter ") private Long licensepurposeparm ;
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
    @ApiModelProperty("Contract Period Parameter ") private  Double contractperiodparm ;
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
    @ApiModelProperty("Page Size Parameter ") private Integer pagesize ;
    @ApiModelProperty("Page Index Parameter ") private Integer pageindex ;
    @ApiModelProperty("Sort Type Parameter ") private Integer sorttype ;
    @ApiModelProperty("Sort By Parameter ") private String sortby ;

    public Long getMinoperatoridparm() {
        return minoperatoridparm;
    }

    public void setMinoperatoridparm(Long minoperatoridparm) {
        this.minoperatoridparm = minoperatoridparm;
    }

    public Long getMaxoperatoridparm() {
        return maxoperatoridparm;
    }

    public void setMaxoperatoridparm(Long maxoperatoridparm) {
        this.maxoperatoridparm = maxoperatoridparm;
    }

    public Long getOperatorclassificationparm() {
        return operatorclassificationparm;
    }

    public void setOperatorclassificationparm(Long operatorclassificationparm) {
        this.operatorclassificationparm = operatorclassificationparm;
    }

    public Long getOperatorcategoryparm() {
        return operatorcategoryparm;
    }

    public void setOperatorcategoryparm(Long operatorcategoryparm) {
        this.operatorcategoryparm = operatorcategoryparm;
    }

    public Long getProvinceparm() {
        return provinceparm;
    }

    public void setProvinceparm(Long provinceparm) {
        this.provinceparm = provinceparm;
    }

    public Long getGovernorateparm() {
        return governorateparm;
    }

    public void setGovernorateparm(Long governorateparm) {
        this.governorateparm = governorateparm;
    }

    public Long getMunicipalityparm() {
        return municipalityparm;
    }

    public void setMunicipalityparm(Long municipalityparm) {
        this.municipalityparm = municipalityparm;
    }

    public Long getTerritoryparm() {
        return territoryparm;
    }

    public void setTerritoryparm(Long territoryparm) {
        this.territoryparm = territoryparm;
    }

    public Integer getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(Integer statusparm) {
        this.statusparm = statusparm;
    }

    public Integer getEmployeesnumberparm() {
        return employeesnumberparm;
    }

    public void setEmployeesnumberparm(Integer employeesnumberparm) {
        this.employeesnumberparm = employeesnumberparm;
    }

    public Integer getDriversnumberparm() {
        return driversnumberparm;
    }

    public void setDriversnumberparm(Integer driversnumberparm) {
        this.driversnumberparm = driversnumberparm;
    }

    public Integer getWorkingcarsnumberparm() {
        return workingcarsnumberparm;
    }

    public void setWorkingcarsnumberparm(Integer workingcarsnumberparm) {
        this.workingcarsnumberparm = workingcarsnumberparm;
    }

    public Integer getBasiccarsnumberparm() {
        return basiccarsnumberparm;
    }

    public void setBasiccarsnumberparm(Integer basiccarsnumberparm) {
        this.basiccarsnumberparm = basiccarsnumberparm;
    }

    public Integer getFeesstatusparm() {
        return feesstatusparm;
    }

    public void setFeesstatusparm(Integer feesstatusparm) {
        this.feesstatusparm = feesstatusparm;
    }

    public Double getOfficeareaparm() {
        return officeareaparm;
    }

    public void setOfficeareaparm(Double officeareaparm) {
        this.officeareaparm = officeareaparm;
    }

    public Long getLicensepurposeparm() {
        return licensepurposeparm;
    }

    public void setLicensepurposeparm(Long licensepurposeparm) {
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

    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }

    public Integer getPageindex() {
        return pageindex;
    }

    public void setPageindex(Integer pageindex) {
        this.pageindex = pageindex;
    }

    public Integer getSorttype() {
        return sorttype;
    }

    public void setSorttype(Integer sorttype) {
        this.sorttype = sorttype;
    }

    public String getSortby() {
        return sortby;
    }

    public void setSortby(String sortby) {
        this.sortby = sortby;
    }

    @Override
    public String toString() {
        return "ReturnOperatorGeneralSearchDataRequest{" +
                "minoperatoridparm=" + minoperatoridparm +
                ", maxoperatoridparm=" + maxoperatoridparm +
                ", operatorclassificationparm=" + operatorclassificationparm +
                ", operatorcategoryparm=" + operatorcategoryparm +
                ", provinceparm=" + provinceparm +
                ", governorateparm=" + governorateparm +
                ", municipalityparm=" + municipalityparm +
                ", territoryparm=" + territoryparm +
                ", statusparm=" + statusparm +
                ", employeesnumberparm=" + employeesnumberparm +
                ", driversnumberparm=" + driversnumberparm +
                ", workingcarsnumberparm=" + workingcarsnumberparm +
                ", basiccarsnumberparm=" + basiccarsnumberparm +
                ", feesstatusparm=" + feesstatusparm +
                ", officeareaparm=" + officeareaparm +
                ", licensepurposeparm=" + licensepurposeparm +
                ", operatornationalidparm=" + operatornationalidparm +
                ", operatornameparm=" + operatornameparm +
                ", operatorcomercialnameparm=" + operatorcomercialnameparm +
                ", operatorclassificationnameparm=" + operatorclassificationnameparm +
                ", operatorcategorynameparm=" + operatorcategorynameparm +
                ", provincearabicnameparm=" + provincearabicnameparm +
                ", governoratearabicnameparm=" + governoratearabicnameparm +
                ", municipalityarabicnameparm=" + municipalityarabicnameparm +
                ", territoryarabicnameparm=" + territoryarabicnameparm +
                ", streetparm=" + streetparm +
                ", neighborhoodparm=" + neighborhoodparm +
                ", emailparm=" + emailparm +
                ", poboxparm=" + poboxparm +
                ", phonenumberparm=" + phonenumberparm +
                ", mobilephonenumberparm=" + mobilephonenumberparm +
                ", faxnumberparm=" + faxnumberparm +
                ", contractperiodparm=" + contractperiodparm +
                ", commercialnamerecordnumberparm=" + commercialnamerecordnumberparm +
                ", commercialnameparm=" + commercialnameparm +
                ", commercialrecordnumberparm=" + commercialrecordnumberparm +
                ", officepropertyownerparm=" + officepropertyownerparm +
                ", plotnoparm=" + plotnoparm +
                ", plotclassificationparm=" + plotclassificationparm +
                ", officefloorparm=" + officefloorparm +
                ", servicescopeparm=" + servicescopeparm +
                ", licensepurposenameparm=" + licensepurposenameparm +
                ", remarksparm=" + remarksparm +
                ", licenseissuedateparm=" + licenseissuedateparm +
                ", dateofcontractsigningparm=" + dateofcontractsigningparm +
                ", licenseexpiredateparm=" + licenseexpiredateparm +
                ", officeclosingdateparm=" + officeclosingdateparm +
                ", commercialrecorddateparm=" + commercialrecorddateparm +
                ", pagesize=" + pagesize +
                ", pageindex=" + pageindex +
                ", sorttype=" + sorttype +
                ", sortby=" + sortby +
                '}';
    }
}
