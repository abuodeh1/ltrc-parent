package jo.gov.ltrc.permit.services.permit;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;
import java.sql.Time;

public class SavePermitDataRequest {

    @ApiModelProperty("Permit ID Parameter ") private long permitidparm ;
    @ApiModelProperty("Permit Type Parameter ") private long permittypeparm ;
    @ApiModelProperty("Issue Date Parameter ") private Date issuedateparm ;
    @ApiModelProperty("Delivery Date Parameter ") private Date deliverydateparm ;
    @ApiModelProperty("Period Parameter ") private int periodparm ;
    @ApiModelProperty("Start Working Date Parameter ") private Date startworkingdateparm ;
    @ApiModelProperty("End Working Date Parameter ") private Date endworkingdateparm ;
    @ApiModelProperty("Province Parameter ") private long provinceparm ;
    @ApiModelProperty("Governorate Parameter ") private long governorateparm ;
    @ApiModelProperty("Municipality Parameter ") private long municipalityparm ;
    @ApiModelProperty("Route Parameter ") private long routeparm ;
    @ApiModelProperty("Departure Time Parameter ") private Time departuretimeparm ;
    @ApiModelProperty("Completion Time Parameter ") private Time completiontimeparm ;
    @ApiModelProperty("Number of Trips Parameter ") private int numberoftripsparm ;
    @ApiModelProperty("Decided Tariifa Parameter ") private double decidedtariffparm ;
    @ApiModelProperty("Primary Driver Parameter ") private String primarydriverparm ;
    @ApiModelProperty("Primary Driver Passport Parameter ") private String primarydriverpassportparm ;
    @ApiModelProperty("Alternative Driver Parameter ") private String alternativedriverparm ;
    @ApiModelProperty("Alternative Driver Passport Parameter ") private String alternativedriverpassportparm ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;
    @ApiModelProperty("Vehicle Parameter ") private long vehicleparm ;
    @ApiModelProperty("Classification Parameter ") private int classificationparm ;
    @ApiModelProperty("Working As Parameter ") private long workingasparm ;
    @ApiModelProperty("Start Point Parameter ") private long startpointparm ;
    @ApiModelProperty("End Point Parameter ") private long endpointparm ;
    @ApiModelProperty("Principal Parameter ") private long princepel ;

    public long getPermitidparm() {
        return permitidparm;
    }

    public void setPermitidparm(long permitidparm) {
        this.permitidparm = permitidparm;
    }

    public long getPermittypeparm() {
        return permittypeparm;
    }

    public void setPermittypeparm(long permittypeparm) {
        this.permittypeparm = permittypeparm;
    }

    public Date getIssuedateparm() {
        return issuedateparm;
    }

    public void setIssuedateparm(Date issuedateparm) {
        this.issuedateparm = issuedateparm;
    }

    public Date getDeliverydateparm() {
        return deliverydateparm;
    }

    public void setDeliverydateparm(Date deliverydateparm) {
        this.deliverydateparm = deliverydateparm;
    }

    public int getPeriodparm() {
        return periodparm;
    }

    public void setPeriodparm(int periodparm) {
        this.periodparm = periodparm;
    }

    public Date getStartworkingdateparm() {
        return startworkingdateparm;
    }

    public void setStartworkingdateparm(Date startworkingdateparm) {
        this.startworkingdateparm = startworkingdateparm;
    }

    public Date getEndworkingdateparm() {
        return endworkingdateparm;
    }

    public void setEndworkingdateparm(Date endworkingdateparm) {
        this.endworkingdateparm = endworkingdateparm;
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

    public long getRouteparm() {
        return routeparm;
    }

    public void setRouteparm(long routeparm) {
        this.routeparm = routeparm;
    }

    public Time getDeparturetimeparm() {
        return departuretimeparm;
    }

    public void setDeparturetimeparm(Time departuretimeparm) {
        this.departuretimeparm = departuretimeparm;
    }

    public Time getCompletiontimeparm() {
        return completiontimeparm;
    }

    public void setCompletiontimeparm(Time completiontimeparm) {
        this.completiontimeparm = completiontimeparm;
    }

    public int getNumberoftripsparm() {
        return numberoftripsparm;
    }

    public void setNumberoftripsparm(int numberoftripsparm) {
        this.numberoftripsparm = numberoftripsparm;
    }

    public double getDecidedtariffparm() {
        return decidedtariffparm;
    }

    public void setDecidedtariffparm(double decidedtariffparm) {
        this.decidedtariffparm = decidedtariffparm;
    }

    public String getPrimarydriverparm() {
        return primarydriverparm;
    }

    public void setPrimarydriverparm(String primarydriverparm) {
        this.primarydriverparm = primarydriverparm;
    }

    public String getPrimarydriverpassportparm() {
        return primarydriverpassportparm;
    }

    public void setPrimarydriverpassportparm(String primarydriverpassportparm) {
        this.primarydriverpassportparm = primarydriverpassportparm;
    }

    public String getAlternativedriverparm() {
        return alternativedriverparm;
    }

    public void setAlternativedriverparm(String alternativedriverparm) {
        this.alternativedriverparm = alternativedriverparm;
    }

    public String getAlternativedriverpassportparm() {
        return alternativedriverpassportparm;
    }

    public void setAlternativedriverpassportparm(String alternativedriverpassportparm) {
        this.alternativedriverpassportparm = alternativedriverpassportparm;
    }

    public int getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(int statusparm) {
        this.statusparm = statusparm;
    }

    public long getVehicleparm() {
        return vehicleparm;
    }

    public void setVehicleparm(long vehicleparm) {
        this.vehicleparm = vehicleparm;
    }

    public int getClassificationparm() {
        return classificationparm;
    }

    public void setClassificationparm(int classificationparm) {
        this.classificationparm = classificationparm;
    }

    public long getWorkingasparm() {
        return workingasparm;
    }

    public void setWorkingasparm(long workingasparm) {
        this.workingasparm = workingasparm;
    }

    public long getStartpointparm() {
        return startpointparm;
    }

    public void setStartpointparm(long startpointparm) {
        this.startpointparm = startpointparm;
    }

    public long getEndpointparm() {
        return endpointparm;
    }

    public void setEndpointparm(long endpointparm) {
        this.endpointparm = endpointparm;
    }

    public long getPrincepel() {
        return princepel;
    }

    public void setPrincepel(long princepel) {
        this.princepel = princepel;
    }
}