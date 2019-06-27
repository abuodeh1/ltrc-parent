package jo.gov.ltrc.sharedservices.permits.route;



import io.swagger.annotations.ApiModelProperty;



public class SaveRoutePointDataRequest {

    @ApiModelProperty("Point ID Parameter") private long pointidparm ;
    @ApiModelProperty("Principal Parameter") private long principal ;
    @ApiModelProperty("Point Order Parameter") private int pointorderparm ;
    @ApiModelProperty("Point Direction Parameter") private boolean pointdirectionparm ;

    public int getPointorderparm() {
        return pointorderparm;
    }

    public void setPointorderparm(int pointorderparm) {
        this.pointorderparm = pointorderparm;
    }

    public boolean isPointdirectionparm() {
        return pointdirectionparm;
    }

    public void setPointdirectionparm(boolean pointdirectionparm) {
        this.pointdirectionparm = pointdirectionparm;
    }

    public long getPointidparm() {
        return pointidparm;
    }

    public void setPointidparm(long pointidparm) {
        this.pointidparm = pointidparm;
    }

    public long getPrincipal() {
        return principal;
    }

    public void setPrincipal(long principal) {
        this.principal = principal;
    }
}



