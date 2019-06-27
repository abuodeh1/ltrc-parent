package jo.gov.ltrc.sharedservices.permits.operator;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class SaveOperatorBranchDataRequest {

    @ApiModelProperty("Operator Branch ID Parameter") private long operatorbranchidparm ;
    @ApiModelProperty("Operator ID Parameter") private long operatoridparm ;
    @ApiModelProperty("Province Parameter") private long provinceparm ;
    @ApiModelProperty("Governorate Parameter") private long governorateparm ;
    @ApiModelProperty("Municipality Parameter") private long municipalityparm ;
    @ApiModelProperty("Territory Parameter") private long territoryparm ;
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
    @ApiModelProperty("Vehicle Count Parameter") private int vehiclecountparm ;

    public long getOperatorbranchidparm() {
        return operatorbranchidparm;
    }

    public void setOperatorbranchidparm(long operatorbranchidparm) {
        this.operatorbranchidparm = operatorbranchidparm;
    }

    public long getOperatoridparm() {
        return operatoridparm;
    }

    public void setOperatoridparm(long operatoridparm) {
        this.operatoridparm = operatoridparm;
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

    public int getVehiclecountparm() {
        return vehiclecountparm;
    }

    public void setVehiclecountparm(int vehiclecountparm) {
        this.vehiclecountparm = vehiclecountparm;
    }
}
