package com.etech.ltrc.permits.operator;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class ReturnOperatorByOperatorBasicInformationDataRequest {

    @ApiModelProperty("Minimum Operator ID Parameter") private long minoperatoridparm ;
    @ApiModelProperty("Maximum Operator ID Parameter") private long maxoperatoridparm ;
    @ApiModelProperty("License Issue Date Parameter") private Date licenseissuedateparm ;
    @ApiModelProperty("License Expiration Date Parameter") private Date licenseexpiredateparm ;
    @ApiModelProperty("Operator Classification Parameter") private long operatorclassificationparm ;
    @ApiModelProperty("Operator Category Parameter") private long operatorcategoryparm ;
    @ApiModelProperty("Operator National ID Parameter") private String operatornationalidparm ;
    @ApiModelProperty("Operator Name Parameter") private String operatornameparm ;
    @ApiModelProperty("Operator Commercial Name Parameter") private String operatorcomercialnameparm ;
    @ApiModelProperty("Province Parameter") private long provinceparm ;
    @ApiModelProperty("Governorate Parameter") private long governorateparm ;
    @ApiModelProperty("Municipality Parameter") private long municipalityparm ;
    @ApiModelProperty("Territory Parameter") private long territoryparm ;
    @ApiModelProperty("Street Parameter") private String streetparm ;
    @ApiModelProperty("Neighborhood Parameter") private String neighborhoodparm ;
    @ApiModelProperty("E-Mail Parameter") private String emaiparml ;
    @ApiModelProperty("Po Box Parameter") private String poboxparm ;
    @ApiModelProperty("Phone Number Parameter") private String phonenumberparm ;
    @ApiModelProperty("Mobile Phone Number Parameter") private String mobilephonenumberparm ;
    @ApiModelProperty("Fax Number Parameter") private String faxnumberparm ;
    @ApiModelProperty("License Purpose Parameter") private long licensepurposeparm ;
    @ApiModelProperty("Status Parameter") private int statusparm ;
    @ApiModelProperty("Fees Status Parameter") private int feesstatusparm ;

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

    public String getEmaiparml() {
        return emaiparml;
    }

    public void setEmaiparml(String emaiparml) {
        this.emaiparml = emaiparml;
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

    public int getFeesstatusparm() {
        return feesstatusparm;
    }

    public void setFeesstatusparm(int feesstatusparm) {
        this.feesstatusparm = feesstatusparm;
    }
}
