package jo.gov.ltrc.permit.services.route;


import io.swagger.annotations.ApiModelProperty;

public class ChangeRouteStatusData {

    @ApiModelProperty("Status Parameter ") private Integer statusparm ;
    @ApiModelProperty("Route ID Parameter ") private Long routeidparm ;
    @ApiModelProperty("Principal Parameter ") private Long prencipal ;

    public Integer getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(Integer statusparm) {
        this.statusparm = statusparm;
    }

    public Long getRouteidparm() {
        return routeidparm;
    }

    public void setRouteidparm(Long routeidparm) {
        this.routeidparm = routeidparm;
    }

    public Long getPrencipal() {
        return prencipal;
    }

    public void setPrencipal(Long prencipal) {
        this.prencipal = prencipal;
    }

    @Override
    public String toString() {
        return "ChangeRouteStatusData{" +
                "statusparm=" + statusparm +
                ", routeidparm=" + routeidparm +
                ", prencipal=" + prencipal +
                '}';
    }
}



