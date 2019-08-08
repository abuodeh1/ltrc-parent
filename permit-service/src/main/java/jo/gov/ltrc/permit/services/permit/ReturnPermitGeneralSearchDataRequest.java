package jo.gov.ltrc.permit.services.permit;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class ReturnPermitGeneralSearchDataRequest {

    @ApiModelProperty("Minimum Permit ID Parameter ") private long minpermitidparm ;
    @ApiModelProperty("Maximum Permit ID Parameter ") private long maxpermitidparm ;
    @ApiModelProperty("Permit Type Parameter ") private long permittypeparm ;
    @ApiModelProperty("Minimum Issue Date Parameter ") private Date minissuedateparm ;
    @ApiModelProperty("Maximum Issue Date Parameter ") private Date maxissuedateparm ;
    @ApiModelProperty("Minimum Delivery Date Parameter ") private Date mindeliverydateparm ;
    @ApiModelProperty("Maximum Delivery Date Parameter ") private Date maxdeliverydateparm ;
    @ApiModelProperty("Minimum Period Parameter ") private int minperiodparm ;
    @ApiModelProperty("Maximum Period Parameter ") private int maxperiodparm ;
    @ApiModelProperty("Minimum Start Working Date Parameter ") private Date minstartworkingdateparm ;
    @ApiModelProperty("Maximum Start Working Date Parameter ") private Date maxstartworkingdateparm ;
    @ApiModelProperty("Minimum End Working Date Parameter ") private Date minendworkingdateparm ;
    @ApiModelProperty("Maximum End Working Date Parameter ") private Date maxendworkingdateparm ;
    @ApiModelProperty("Province Parameter ") private long provinceparm ;
    @ApiModelProperty("Governorate Parameter ") private long governorateparm ;
    @ApiModelProperty("Municipality Parameter ") private long municipalityparm ;
    @ApiModelProperty("Route Parameter ") private long routeparm ;
    @ApiModelProperty("Minimum Number of Trips Parameter ") private int minnumberoftripsparm ;
    @ApiModelProperty("Maximum Number of Trips Parameter ") private int maxnumberoftripsparm ;
    @ApiModelProperty("Primary Drive Parameter ") private String primarydriverparm ;
    @ApiModelProperty("Alternative Drive Parameter ") private String alternativedriverparm ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;
    @ApiModelProperty("Vehicle Parameter ") private long vehicleparm ;
    @ApiModelProperty("Classification Parameter ") private int classificationparm ;
    @ApiModelProperty("Working As Parameter ") private long workingasparm ;
    @ApiModelProperty("Start Point Parameter ") private long startpointparm ;
    @ApiModelProperty("End Point Parameter ") private long endpointparm ;
    @ApiModelProperty("Line ID Parameter ") private long lineidparm ;
    @ApiModelProperty("Line Name Parameter ") private String linenameparm ;
    @ApiModelProperty("Route Name Parameter ") private String routenameparm ;
    @ApiModelProperty("Operator ID Parameter ") private long operatoridparm ;
    @ApiModelProperty("Operator Name Parameter ") private String operatornameparm ;
    @ApiModelProperty("Plate Number Parameter ") private String platenumberparm ;
    @ApiModelProperty("Plate Code Parameter ") private String platecodeparm ;

    public long getMinpermitidparm() {
        return minpermitidparm;
    }

    public void setMinpermitidparm(long minpermitidparm) {
        this.minpermitidparm = minpermitidparm;
    }

    public long getMaxpermitidparm() {
        return maxpermitidparm;
    }

    public void setMaxpermitidparm(long maxpermitidparm) {
        this.maxpermitidparm = maxpermitidparm;
    }

    public long getPermittypeparm() {
        return permittypeparm;
    }

    public void setPermittypeparm(long permittypeparm) {
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

    public int getMinperiodparm() {
        return minperiodparm;
    }

    public void setMinperiodparm(int minperiodparm) {
        this.minperiodparm = minperiodparm;
    }

    public int getMaxperiodparm() {
        return maxperiodparm;
    }

    public void setMaxperiodparm(int maxperiodparm) {
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

    public int getMinnumberoftripsparm() {
        return minnumberoftripsparm;
    }

    public void setMinnumberoftripsparm(int minnumberoftripsparm) {
        this.minnumberoftripsparm = minnumberoftripsparm;
    }

    public int getMaxnumberoftripsparm() {
        return maxnumberoftripsparm;
    }

    public void setMaxnumberoftripsparm(int maxnumberoftripsparm) {
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

    public long getLineidparm() {
        return lineidparm;
    }

    public void setLineidparm(long lineidparm) {
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

    public long getOperatoridparm() {
        return operatoridparm;
    }

    public void setOperatoridparm(long operatoridparm) {
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
}