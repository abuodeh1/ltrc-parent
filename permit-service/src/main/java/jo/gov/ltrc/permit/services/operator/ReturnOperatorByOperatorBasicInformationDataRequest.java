package jo.gov.ltrc.permit.services.operator;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class ReturnOperatorByOperatorBasicInformationDataRequest {

    @ApiModelProperty("Minimum Operator ID Parameter") private Long minoperatoridparm ;
    @ApiModelProperty("Maximum Operator ID Parameter") private Long maxoperatoridparm ;
    @ApiModelProperty("License Issue Date Parameter") private Date licenseissuedateparm ;
    @ApiModelProperty("License Expiration Date Parameter") private Date licenseexpiredateparm ;
    @ApiModelProperty("Operator Classification Parameter") private Long operatorclassificationparm ;
    @ApiModelProperty("Operator Category Parameter") private Long operatorcategoryparm ;
    @ApiModelProperty("Operator National ID Parameter") private String operatornationalidparm ;
    @ApiModelProperty("Operator Name Parameter") private String operatornameparm ;
    @ApiModelProperty("Operator Commercial Name Parameter") private String operatorcomercialnameparm ;
    @ApiModelProperty("Province Parameter") private Long provinceparm ;
    @ApiModelProperty("Governorate Parameter") private Long governorateparm ;
    @ApiModelProperty("Municipality Parameter") private Long municipalityparm ;
    @ApiModelProperty("Territory Parameter") private Long territoryparm ;
    @ApiModelProperty("Street Parameter") private String streetparm ;
    @ApiModelProperty("Neighborhood Parameter") private String neighborhoodparm ;
    @ApiModelProperty("E-Mail Parameter") private String emaiparml ;
    @ApiModelProperty("Po Box Parameter") private String poboxparm ;
    @ApiModelProperty("Phone Number Parameter") private String phonenumberparm ;
    @ApiModelProperty("Mobile Phone Number Parameter") private String mobilephonenumberparm ;
    @ApiModelProperty("Fax Number Parameter") private String faxnumberparm ;
    @ApiModelProperty("License Purpose Parameter") private Long licensepurposeparm ;
    @ApiModelProperty("Status Parameter") private Integer statusparm ;
    @ApiModelProperty("Fees Status Parameter") private Integer feesstatusparm ;

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

    public Integer getFeesstatusparm() {
        return feesstatusparm;
    }

    public void setFeesstatusparm(Integer feesstatusparm) {
        this.feesstatusparm = feesstatusparm;
    }

    @Override
    public String toString() {
        return "ReturnOperatorByOperatorBasicInformationDataRequest{" +
                "minoperatoridparm=" + minoperatoridparm +
                ", maxoperatoridparm=" + maxoperatoridparm +
                ", licenseissuedateparm=" + licenseissuedateparm +
                ", licenseexpiredateparm=" + licenseexpiredateparm +
                ", operatorclassificationparm=" + operatorclassificationparm +
                ", operatorcategoryparm=" + operatorcategoryparm +
                ", operatornationalidparm=" + operatornationalidparm +
                ", operatornameparm=" + operatornameparm +
                ", operatorcomercialnameparm=" + operatorcomercialnameparm +
                ", provinceparm=" + provinceparm +
                ", governorateparm=" + governorateparm +
                ", municipalityparm=" + municipalityparm +
                ", territoryparm=" + territoryparm +
                ", streetparm=" + streetparm +
                ", neighborhoodparm=" + neighborhoodparm +
                ", emaiparml=" + emaiparml +
                ", poboxparm=" + poboxparm +
                ", phonenumberparm=" + phonenumberparm +
                ", mobilephonenumberparm=" + mobilephonenumberparm +
                ", faxnumberparm=" + faxnumberparm +
                ", licensepurposeparm=" + licensepurposeparm +
                ", statusparm=" + statusparm +
                ", feesstatusparm=" + feesstatusparm +
                '}';
    }
}
