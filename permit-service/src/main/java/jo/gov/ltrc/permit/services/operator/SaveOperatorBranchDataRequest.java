package jo.gov.ltrc.permit.services.operator;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class SaveOperatorBranchDataRequest {

    @ApiModelProperty("Operator Branch ID Parameter") private Long operatorbranchidparm ;
    @ApiModelProperty("Operator ID Parameter") private Long operatoridparm ;
    @ApiModelProperty("Province Parameter") private Long provinceparm ;
    @ApiModelProperty("Governorate Parameter") private Long governorateparm ;
    @ApiModelProperty("Municipality Parameter") private Long municipalityparm ;
    @ApiModelProperty("Territory Parameter") private Long territoryparm ;
    @ApiModelProperty("Neighborhood Parameter") private String neighborhoodparm ;
    @ApiModelProperty("Street Parameter") private String streetparm ;
    @ApiModelProperty("Basin Parameter") private String basinparm ;
    @ApiModelProperty("Plot No Parameter") private String plotnoparm ;
    @ApiModelProperty("Po Box Parameter") private String poboxparm ;
    @ApiModelProperty("Telephone Parameter") private String telephoneparm ;
    @ApiModelProperty("Fax Parameter") private String faxparm ;
    @ApiModelProperty("Mobile Phone Parameter") private String mobilephoneparm ;
    @ApiModelProperty("E-Mail Parameter") private String emailparm ;
    @ApiModelProperty("Agreement Reference Number Parameter") private String aggreementreferencenumberparm ;
    @ApiModelProperty("Agreement Reference Date Parameter") private Date aggreementreferencedateparm ;
    @ApiModelProperty("Vehicle Count Parameter") private Integer vehiclecountparm ;
    @ApiModelProperty("Branch Name Parameter") private String branchnameparm ;
    @ApiModelProperty("Certificate Registration Number Parameter") private String certificateregistrationnumberparm;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;
    @ApiModelProperty("Principal Parameter") private Long princepel ;

    public Long getOperatorbranchidparm() {
        return operatorbranchidparm;
    }

    public void setOperatorbranchidparm(Long operatorbranchidparm) {
        this.operatorbranchidparm = operatorbranchidparm;
    }

    public Long getOperatoridparm() {
        return operatoridparm;
    }

    public void setOperatoridparm(Long operatoridparm) {
        this.operatoridparm = operatoridparm;
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

    public String getNeighborhoodparm() {
        return neighborhoodparm;
    }

    public void setNeighborhoodparm(String neighborhoodparm) {
        this.neighborhoodparm = neighborhoodparm;
    }

    public String getStreetparm() {
        return streetparm;
    }

    public void setStreetparm(String streetparm) {
        this.streetparm = streetparm;
    }

    public String getBasinparm() {
        return basinparm;
    }

    public void setBasinparm(String basinparm) {
        this.basinparm = basinparm;
    }

    public String getPlotnoparm() {
        return plotnoparm;
    }

    public void setPlotnoparm(String plotnoparm) {
        this.plotnoparm = plotnoparm;
    }

    public String getPoboxparm() {
        return poboxparm;
    }

    public void setPoboxparm(String poboxparm) {
        this.poboxparm = poboxparm;
    }

    public String getTelephoneparm() {
        return telephoneparm;
    }

    public void setTelephoneparm(String telephoneparm) {
        this.telephoneparm = telephoneparm;
    }

    public String getFaxparm() {
        return faxparm;
    }

    public void setFaxparm(String faxparm) {
        this.faxparm = faxparm;
    }

    public String getMobilephoneparm() {
        return mobilephoneparm;
    }

    public void setMobilephoneparm(String mobilephoneparm) {
        this.mobilephoneparm = mobilephoneparm;
    }

    public String getEmailparm() {
        return emailparm;
    }

    public void setEmailparm(String emailparm) {
        this.emailparm = emailparm;
    }

    public String getAggreementreferencenumberparm() {
        return aggreementreferencenumberparm;
    }

    public void setAggreementreferencenumberparm(String aggreementreferencenumberparm) {
        this.aggreementreferencenumberparm = aggreementreferencenumberparm;
    }

    public Date getAggreementreferencedateparm() {
        return aggreementreferencedateparm;
    }

    public void setAggreementreferencedateparm(Date aggreementreferencedateparm) {
        this.aggreementreferencedateparm = aggreementreferencedateparm;
    }

    public Integer getVehiclecountparm() {
        return vehiclecountparm;
    }

    public void setVehiclecountparm(Integer vehiclecountparm) {
        this.vehiclecountparm = vehiclecountparm;
    }

    public String getBranchnameparm() {
        return branchnameparm;
    }

    public void setBranchnameparm(String branchnameparm) {
        this.branchnameparm = branchnameparm;
    }

    public String getCertificateregistrationnumberparm() {
        return certificateregistrationnumberparm;
    }

    public void setCertificateregistrationnumberparm(String certificateregistrationnumberparm) {
        this.certificateregistrationnumberparm = certificateregistrationnumberparm;
    }

    public Integer getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(Integer statusparm) {
        this.statusparm = statusparm;
    }

    public Long getPrincepel() {
        return princepel;
    }

    public void setPrincepel(Long princepel) {
        this.princepel = princepel;
    }

    @Override
    public String toString() {
        return "SaveOperatorBranchDataRequest{" +
                "operatorbranchidparm=" + operatorbranchidparm +
                ", operatoridparm=" + operatoridparm +
                ", provinceparm=" + provinceparm +
                ", governorateparm=" + governorateparm +
                ", municipalityparm=" + municipalityparm +
                ", territoryparm=" + territoryparm +
                ", neighborhoodparm=" + neighborhoodparm +
                ", streetparm=" + streetparm +
                ", basinparm=" + basinparm +
                ", plotnoparm=" + plotnoparm +
                ", poboxparm=" + poboxparm +
                ", telephoneparm=" + telephoneparm +
                ", faxparm=" + faxparm +
                ", mobilephoneparm=" + mobilephoneparm +
                ", emailparm=" + emailparm +
                ", aggreementreferencenumberparm=" + aggreementreferencenumberparm +
                ", aggreementreferencedateparm=" + aggreementreferencedateparm +
                ", vehiclecountparm=" + vehiclecountparm +
                ", branchnameparm=" + branchnameparm +
                ", certificateregistrationnumberparm=" + certificateregistrationnumberparm +
                ", statusparm=" + statusparm +
                ", princepel=" + princepel +
                '}';
    }
}
