package jo.gov.ltrc.permit.services.operator;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class SaveOperatorDataRequest {

    @ApiModelProperty("Operator ID Parameter ") private Long operatoridparm ;
    @ApiModelProperty("Operator National ID Parameter ") private String operatornationalidparm ;
    @ApiModelProperty("Operator Name Parameter ") private String operatornameparm ;
    @ApiModelProperty("Operator Classification Parameter ") private Long operatorclassificationparm ;
    @ApiModelProperty("Operator Category Parameter ") private Long operatorcategoryparm ;
    @ApiModelProperty("Province Parameter ") private Long provinceparm ;
    @ApiModelProperty("Governorate Parameter ") private Long governorateparm ;
    @ApiModelProperty("Municipality Parameter ") private Long municipalityparm ;
    @ApiModelProperty("Territory Parameter ") private Long territoryparm ;
    @ApiModelProperty("Street Parameter ") private String streetparm ;
    @ApiModelProperty("Neighborhood Parameter ") private String neighborhoodparm ;
    @ApiModelProperty("Email Parameter ") private String emailparm ;
    @ApiModelProperty("Po Box Parameter ") private String poboxparm ;
    @ApiModelProperty("Phone Number Parameter ") private String phonenumberparm ;
    @ApiModelProperty("Mobile Number Parameter ") private String mobilephonenumberparm ;
    @ApiModelProperty("Fax Number Parameter ") private String faxnumberparm ;
    @ApiModelProperty("License Purpose Parameter ") private Long licensepurposeparm ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;
    @ApiModelProperty("Office Property Owner Parameter ") private String officepropertyownerparm ;
    @ApiModelProperty("Plate No Parameter ") private String plotnoparm ;
    @ApiModelProperty("Office Area Parameter ") private  Double officeareaparm ;
    @ApiModelProperty("Service Scope Parameter ") private String servicescopeparm ;
    @ApiModelProperty("Date of Contract Singing Parameter ") private Date dateofcontractsigningparm ;
    @ApiModelProperty("Commercial Name record Number Parameter ") private String commercialnamerecordnumberparm ;
    @ApiModelProperty("Commercial Name Parameter ") private String commercialnameparm ;
    @ApiModelProperty("Commercial Record Number Parameter ") private String commercialrecordnumberparm ;
    @ApiModelProperty("Commercial Record Date Parameter ") private Date commercialrecorddateparm ;
    @ApiModelProperty("Employees Number Parameter ") private Integer employeesnumberparm ;
    @ApiModelProperty("Drivers Number Parameter ") private Integer driversnumberparm ;
    @ApiModelProperty("Working Cars Number Parameter ") private Integer workingcarsnumberparm ;
    @ApiModelProperty("Basic Cars Number Parameter ") private Integer basiccarsnumberparm ;
    @ApiModelProperty("Office Closing Date Parameter ") private Date officeclosingdateparm ;
    @ApiModelProperty("Remarks Parameter ") private String remarksparm ;
    @ApiModelProperty("Fees Status Parameter ") private Integer feesstatusparm ;
    @ApiModelProperty("License Issue Date Parameter ") private Date licenseissuedateparm ;
    @ApiModelProperty("License Expire Date Parameter ") private Date licenseexpiredateparm ;
    @ApiModelProperty("Plot Classification Parameter ") private String plotclassificationparm ;
    @ApiModelProperty("Office Floor Parameter ") private String officefloorparm ;
    @ApiModelProperty("Contract Period Parameter ") private  Double contractperiodparm ;
    @ApiModelProperty("Certification Registration Number Parameter ") private String certificateregistrationnumberparm ;
    @ApiModelProperty("Basin Parameter ") private String basinparm ;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;

    public Long getOperatoridparm() {
        return operatoridparm;
    }

    public void setOperatoridparm(Long operatoridparm) {
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

    public Long getLicensepurposeparm() {
        return licensepurposeparm;
    }

    public void setLicensepurposeparm(Long licensepurposeparm) {
        this.licensepurposeparm = licensepurposeparm;
    }

    public Integer getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(Integer statusparm) {
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

    public Double getOfficeareaparm() {
        return officeareaparm;
    }

    public void setOfficeareaparm(Double officeareaparm) {
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

    public Integer getFeesstatusparm() {
        return feesstatusparm;
    }

    public void setFeesstatusparm(Integer feesstatusparm) {
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

    public Double getContractperiodparm() {
        return contractperiodparm;
    }

    public void setContractperiodparm(Double contractperiodparm) {
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

    public Long getPrincepel() {
        return princepel;
    }

    public void setPrincepel(Long princepel) {
        this.princepel = princepel;
    }

    @Override
    public String toString() {
        return "SaveOperatorDataRequest{" +
                "operatoridparm=" + operatoridparm +
                ", operatornationalidparm=" + operatornationalidparm +
                ", operatornameparm=" + operatornameparm +
                ", operatorclassificationparm=" + operatorclassificationparm +
                ", operatorcategoryparm=" + operatorcategoryparm +
                ", provinceparm=" + provinceparm +
                ", governorateparm=" + governorateparm +
                ", municipalityparm=" + municipalityparm +
                ", territoryparm=" + territoryparm +
                ", streetparm=" + streetparm +
                ", neighborhoodparm=" + neighborhoodparm +
                ", emailparm=" + emailparm +
                ", poboxparm=" + poboxparm +
                ", phonenumberparm=" + phonenumberparm +
                ", mobilephonenumberparm=" + mobilephonenumberparm +
                ", faxnumberparm=" + faxnumberparm +
                ", licensepurposeparm=" + licensepurposeparm +
                ", statusparm=" + statusparm +
                ", officepropertyownerparm=" + officepropertyownerparm +
                ", plotnoparm=" + plotnoparm +
                ", officeareaparm=" + officeareaparm +
                ", servicescopeparm=" + servicescopeparm +
                ", dateofcontractsigningparm=" + dateofcontractsigningparm +
                ", commercialnamerecordnumberparm=" + commercialnamerecordnumberparm +
                ", commercialnameparm=" + commercialnameparm +
                ", commercialrecordnumberparm=" + commercialrecordnumberparm +
                ", commercialrecorddateparm=" + commercialrecorddateparm +
                ", employeesnumberparm=" + employeesnumberparm +
                ", driversnumberparm=" + driversnumberparm +
                ", workingcarsnumberparm=" + workingcarsnumberparm +
                ", basiccarsnumberparm=" + basiccarsnumberparm +
                ", officeclosingdateparm=" + officeclosingdateparm +
                ", remarksparm=" + remarksparm +
                ", feesstatusparm=" + feesstatusparm +
                ", licenseissuedateparm=" + licenseissuedateparm +
                ", licenseexpiredateparm=" + licenseexpiredateparm +
                ", plotclassificationparm=" + plotclassificationparm +
                ", officefloorparm=" + officefloorparm +
                ", contractperiodparm=" + contractperiodparm +
                ", certificateregistrationnumberparm=" + certificateregistrationnumberparm +
                ", basinparm=" + basinparm +
                ", princepel=" + princepel +
                '}';
    }
}
