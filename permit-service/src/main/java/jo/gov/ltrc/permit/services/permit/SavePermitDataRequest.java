package jo.gov.ltrc.permit.services.permit;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;
import java.sql.Time;

public class SavePermitDataRequest {

    @ApiModelProperty("Permit ID Parameter ") private Long permitidparm ;
    @ApiModelProperty("Permit Type Parameter ") private Long permittypeparm ;
    @ApiModelProperty("Issue Date Parameter ") private Date issuedateparm ;
    @ApiModelProperty("Delivery Date Parameter ") private Date deliverydateparm ;
    @ApiModelProperty("Period Parameter ") private Integer periodparm ;
    @ApiModelProperty("Start Working Date Parameter ") private Date startworkingdateparm ;
    @ApiModelProperty("End Working Date Parameter ") private Date endworkingdateparm ;
    @ApiModelProperty("Province Parameter ") private Long provinceparm ;
    @ApiModelProperty("Governorate Parameter ") private Long governorateparm ;
    @ApiModelProperty("Municipality Parameter ") private Long municipalityparm ;
    @ApiModelProperty("Route Parameter ") private Long routeparm ;
    @ApiModelProperty("Departure Time Parameter ") private Time departuretimeparm ;
    @ApiModelProperty("Completion Time Parameter ") private Time completiontimeparm ;
    @ApiModelProperty("Number of Trips Parameter ") private Integer numberoftripsparm ;
    @ApiModelProperty("Decided Tariifa Parameter ") private  Double decidedtariffparm ;
    @ApiModelProperty("Primary Driver Parameter ") private String primarydriverparm ;
    @ApiModelProperty("Primary Driver Passport Parameter ") private String primarydriverpassportparm ;
    @ApiModelProperty("Alternative Driver Parameter ") private String alternativedriverparm ;
    @ApiModelProperty("Alternative Driver Passport Parameter ") private String alternativedriverpassportparm ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;
    @ApiModelProperty("Vehicle Parameter ") private Long vehicleparm ;
    @ApiModelProperty("Classification Parameter ") private Integer classificationparm ;
    @ApiModelProperty("Working As Parameter ") private Long workingasparm ;
    @ApiModelProperty("Start Point Parameter ") private Long startpointparm ;
    @ApiModelProperty("End Point Parameter ") private Long endpointparm ;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("IP Address") private String ipaddressparm  ;

    public Long getPermitidparm() {
        return permitidparm;
    }

    public void setPermitidparm(Long permitidparm) {
        this.permitidparm = permitidparm;
    }

    public Long getPermittypeparm() {
        return permittypeparm;
    }

    public void setPermittypeparm(Long permittypeparm) {
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

    public Integer getPeriodparm() {
        return periodparm;
    }

    public void setPeriodparm(Integer periodparm) {
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

    public Long getRouteparm() {
        return routeparm;
    }

    public void setRouteparm(Long routeparm) {
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

    public Integer getNumberoftripsparm() {
        return numberoftripsparm;
    }

    public void setNumberoftripsparm(Integer numberoftripsparm) {
        this.numberoftripsparm = numberoftripsparm;
    }

    public Double getDecidedtariffparm() {
        return decidedtariffparm;
    }

    public void setDecidedtariffparm(Double decidedtariffparm) {
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

    public Integer getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(Integer statusparm) {
        this.statusparm = statusparm;
    }

    public Long getVehicleparm() {
        return vehicleparm;
    }

    public void setVehicleparm(Long vehicleparm) {
        this.vehicleparm = vehicleparm;
    }

    public Integer getClassificationparm() {
        return classificationparm;
    }

    public void setClassificationparm(Integer classificationparm) {
        this.classificationparm = classificationparm;
    }

    public Long getWorkingasparm() {
        return workingasparm;
    }

    public void setWorkingasparm(Long workingasparm) {
        this.workingasparm = workingasparm;
    }

    public Long getStartpointparm() {
        return startpointparm;
    }

    public void setStartpointparm(Long startpointparm) {
        this.startpointparm = startpointparm;
    }

    public Long getEndpointparm() {
        return endpointparm;
    }

    public void setEndpointparm(Long endpointparm) {
        this.endpointparm = endpointparm;
    }

    public Long getPrincepel() {
        return princepel;
    }

    public void setPrincepel(Long princepel) {
        this.princepel = princepel;
    }

    public String getIpaddressparm() {
        return ipaddressparm;
    }

    public void setIpaddressparm(String ipaddressparm) {
        this.ipaddressparm = ipaddressparm;
    }

    @Override
    public String toString() {
        return "SavePermitDataRequest{" +
                "permitidparm=" + permitidparm +
                ", permittypeparm=" + permittypeparm +
                ", issuedateparm=" + issuedateparm +
                ", deliverydateparm=" + deliverydateparm +
                ", periodparm=" + periodparm +
                ", startworkingdateparm=" + startworkingdateparm +
                ", endworkingdateparm=" + endworkingdateparm +
                ", provinceparm=" + provinceparm +
                ", governorateparm=" + governorateparm +
                ", municipalityparm=" + municipalityparm +
                ", routeparm=" + routeparm +
                ", departuretimeparm=" + departuretimeparm +
                ", completiontimeparm=" + completiontimeparm +
                ", numberoftripsparm=" + numberoftripsparm +
                ", decidedtariffparm=" + decidedtariffparm +
                ", primarydriverparm=" + primarydriverparm +
                ", primarydriverpassportparm=" + primarydriverpassportparm +
                ", alternativedriverparm=" + alternativedriverparm +
                ", alternativedriverpassportparm=" + alternativedriverpassportparm +
                ", statusparm=" + statusparm +
                ", vehicleparm=" + vehicleparm +
                ", classificationparm=" + classificationparm +
                ", workingasparm=" + workingasparm +
                ", startpointparm=" + startpointparm +
                ", endpointparm=" + endpointparm +
                ", princepel=" + princepel +
                ", ipaddressparam=" + ipaddressparm +
                '}';
    }
}