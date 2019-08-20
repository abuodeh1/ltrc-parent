package jo.gov.ltrc.permit.services.permit;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class ReturnPermitGeneralSearchDataRequest {

    @ApiModelProperty("Minimum Permit ID Parameter ") private Long minpermitidparm ;
    @ApiModelProperty("Maximum Permit ID Parameter ") private Long maxpermitidparm ;
    @ApiModelProperty("Permit Type Parameter ") private Long permittypeparm ;
    @ApiModelProperty("Minimum Issue Date Parameter ") private Date minissuedateparm ;
    @ApiModelProperty("Maximum Issue Date Parameter ") private Date maxissuedateparm ;
    @ApiModelProperty("Minimum Delivery Date Parameter ") private Date mindeliverydateparm ;
    @ApiModelProperty("Maximum Delivery Date Parameter ") private Date maxdeliverydateparm ;
    @ApiModelProperty("Minimum Period Parameter ") private Integer minperiodparm ;
    @ApiModelProperty("Maximum Period Parameter ") private Integer maxperiodparm ;
    @ApiModelProperty("Minimum Start Working Date Parameter ") private Date minstartworkingdateparm ;
    @ApiModelProperty("Maximum Start Working Date Parameter ") private Date maxstartworkingdateparm ;
    @ApiModelProperty("Minimum End Working Date Parameter ") private Date minendworkingdateparm ;
    @ApiModelProperty("Maximum End Working Date Parameter ") private Date maxendworkingdateparm ;
    @ApiModelProperty("Province Parameter ") private Long provinceparm ;
    @ApiModelProperty("Governorate Parameter ") private Long governorateparm ;
    @ApiModelProperty("Municipality Parameter ") private Long municipalityparm ;
    @ApiModelProperty("Route Parameter ") private Long routeparm ;
    @ApiModelProperty("Minimum Number of Trips Parameter ") private Integer minnumberoftripsparm ;
    @ApiModelProperty("Maximum Number of Trips Parameter ") private Integer maxnumberoftripsparm ;
    @ApiModelProperty("Primary Drive Parameter ") private String primarydriverparm ;
    @ApiModelProperty("Alternative Drive Parameter ") private String alternativedriverparm ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;
    @ApiModelProperty("Vehicle Parameter ") private Long vehicleparm ;
    @ApiModelProperty("Classification Parameter ") private Integer classificationparm ;
    @ApiModelProperty("Working As Parameter ") private Long workingasparm ;
    @ApiModelProperty("Start Point Parameter ") private Long startpointparm ;
    @ApiModelProperty("End Point Parameter ") private Long endpointparm ;
    @ApiModelProperty("Line ID Parameter ") private Long lineidparm ;
    @ApiModelProperty("Line Name Parameter ") private String linenameparm ;
    @ApiModelProperty("Route Name Parameter ") private String routenameparm ;
    @ApiModelProperty("Operator ID Parameter ") private Long operatoridparm ;
    @ApiModelProperty("Operator Name Parameter ") private String operatornameparm ;
    @ApiModelProperty("Plate Number Parameter ") private String platenumberparm ;
    @ApiModelProperty("Plate Code Parameter ") private String platecodeparm ;

    public Long getMinpermitidparm() {
        return minpermitidparm;
    }

    public void setMinpermitidparm(Long minpermitidparm) {
        this.minpermitidparm = minpermitidparm;
    }

    public Long getMaxpermitidparm() {
        return maxpermitidparm;
    }

    public void setMaxpermitidparm(Long maxpermitidparm) {
        this.maxpermitidparm = maxpermitidparm;
    }

    public Long getPermittypeparm() {
        return permittypeparm;
    }

    public void setPermittypeparm(Long permittypeparm) {
        this.permittypeparm = permittypeparm;
    }

    public Date getMinissuedateparm() {
        return minissuedateparm;
    }

    public void setMinissuedateparm(Date minissuedateparm) {
        this.minissuedateparm = minissuedateparm;
    }

    public Date getMaxissuedateparm() {
        return maxissuedateparm;
    }

    public void setMaxissuedateparm(Date maxissuedateparm) {
        this.maxissuedateparm = maxissuedateparm;
    }

    public Date getMindeliverydateparm() {
        return mindeliverydateparm;
    }

    public void setMindeliverydateparm(Date mindeliverydateparm) {
        this.mindeliverydateparm = mindeliverydateparm;
    }

    public Date getMaxdeliverydateparm() {
        return maxdeliverydateparm;
    }

    public void setMaxdeliverydateparm(Date maxdeliverydateparm) {
        this.maxdeliverydateparm = maxdeliverydateparm;
    }

    public Integer getMinperiodparm() {
        return minperiodparm;
    }

    public void setMinperiodparm(Integer minperiodparm) {
        this.minperiodparm = minperiodparm;
    }

    public Integer getMaxperiodparm() {
        return maxperiodparm;
    }

    public void setMaxperiodparm(Integer maxperiodparm) {
        this.maxperiodparm = maxperiodparm;
    }

    public Date getMinstartworkingdateparm() {
        return minstartworkingdateparm;
    }

    public void setMinstartworkingdateparm(Date minstartworkingdateparm) {
        this.minstartworkingdateparm = minstartworkingdateparm;
    }

    public Date getMaxstartworkingdateparm() {
        return maxstartworkingdateparm;
    }

    public void setMaxstartworkingdateparm(Date maxstartworkingdateparm) {
        this.maxstartworkingdateparm = maxstartworkingdateparm;
    }

    public Date getMinendworkingdateparm() {
        return minendworkingdateparm;
    }

    public void setMinendworkingdateparm(Date minendworkingdateparm) {
        this.minendworkingdateparm = minendworkingdateparm;
    }

    public Date getMaxendworkingdateparm() {
        return maxendworkingdateparm;
    }

    public void setMaxendworkingdateparm(Date maxendworkingdateparm) {
        this.maxendworkingdateparm = maxendworkingdateparm;
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

    public Integer getMinnumberoftripsparm() {
        return minnumberoftripsparm;
    }

    public void setMinnumberoftripsparm(Integer minnumberoftripsparm) {
        this.minnumberoftripsparm = minnumberoftripsparm;
    }

    public Integer getMaxnumberoftripsparm() {
        return maxnumberoftripsparm;
    }

    public void setMaxnumberoftripsparm(Integer maxnumberoftripsparm) {
        this.maxnumberoftripsparm = maxnumberoftripsparm;
    }

    public String getPrimarydriverparm() {
        return primarydriverparm;
    }

    public void setPrimarydriverparm(String primarydriverparm) {
        this.primarydriverparm = primarydriverparm;
    }

    public String getAlternativedriverparm() {
        return alternativedriverparm;
    }

    public void setAlternativedriverparm(String alternativedriverparm) {
        this.alternativedriverparm = alternativedriverparm;
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

    public Long getLineidparm() {
        return lineidparm;
    }

    public void setLineidparm(Long lineidparm) {
        this.lineidparm = lineidparm;
    }

    public String getLinenameparm() {
        return linenameparm;
    }

    public void setLinenameparm(String linenameparm) {
        this.linenameparm = linenameparm;
    }

    public String getRoutenameparm() {
        return routenameparm;
    }

    public void setRoutenameparm(String routenameparm) {
        this.routenameparm = routenameparm;
    }

    public Long getOperatoridparm() {
        return operatoridparm;
    }

    public void setOperatoridparm(Long operatoridparm) {
        this.operatoridparm = operatoridparm;
    }

    public String getOperatornameparm() {
        return operatornameparm;
    }

    public void setOperatornameparm(String operatornameparm) {
        this.operatornameparm = operatornameparm;
    }

    public String getPlatenumberparm() {
        return platenumberparm;
    }

    public void setPlatenumberparm(String platenumberparm) {
        this.platenumberparm = platenumberparm;
    }

    public String getPlatecodeparm() {
        return platecodeparm;
    }

    public void setPlatecodeparm(String platecodeparm) {
        this.platecodeparm = platecodeparm;
    }

    @Override
    public String toString() {
        return "ReturnPermitGeneralSearchDataRequest{" +
                "minpermitidparm=" + minpermitidparm +
                ", maxpermitidparm=" + maxpermitidparm +
                ", permittypeparm=" + permittypeparm +
                ", minissuedateparm=" + minissuedateparm +
                ", maxissuedateparm=" + maxissuedateparm +
                ", mindeliverydateparm=" + mindeliverydateparm +
                ", maxdeliverydateparm=" + maxdeliverydateparm +
                ", minperiodparm=" + minperiodparm +
                ", maxperiodparm=" + maxperiodparm +
                ", minstartworkingdateparm=" + minstartworkingdateparm +
                ", maxstartworkingdateparm=" + maxstartworkingdateparm +
                ", minendworkingdateparm=" + minendworkingdateparm +
                ", maxendworkingdateparm=" + maxendworkingdateparm +
                ", provinceparm=" + provinceparm +
                ", governorateparm=" + governorateparm +
                ", municipalityparm=" + municipalityparm +
                ", routeparm=" + routeparm +
                ", minnumberoftripsparm=" + minnumberoftripsparm +
                ", maxnumberoftripsparm=" + maxnumberoftripsparm +
                ", primarydriverparm=" + primarydriverparm +
                ", alternativedriverparm=" + alternativedriverparm +
                ", statusparm=" + statusparm +
                ", vehicleparm=" + vehicleparm +
                ", classificationparm=" + classificationparm +
                ", workingasparm=" + workingasparm +
                ", startpointparm=" + startpointparm +
                ", endpointparm=" + endpointparm +
                ", lineidparm=" + lineidparm +
                ", linenameparm=" + linenameparm +
                ", routenameparm=" + routenameparm +
                ", operatoridparm=" + operatoridparm +
                ", operatornameparm=" + operatornameparm +
                ", platenumberparm=" + platenumberparm +
                ", platecodeparm=" + platecodeparm +
                '}';
    }
}