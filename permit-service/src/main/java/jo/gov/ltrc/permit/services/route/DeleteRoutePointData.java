package jo.gov.ltrc.permit.services.route;


import io.swagger.annotations.ApiModelProperty;

public class DeleteRoutePointData {

    @ApiModelProperty("Route ID Parameter ") private Long routeidparm ;
    @ApiModelProperty("Point ID Parameter ") private Long pointidparm ;
    @ApiModelProperty("Principal Parameter ") private Long principal ;

    public Long getRouteidparm() {
        return routeidparm;
    }

    public void setRouteidparm(Long routeidparm) {
        this.routeidparm = routeidparm;
    }

    public Long getPointidparm() {
        return pointidparm;
    }

    public void setPointidparm(Long pointidparm) {
        this.pointidparm = pointidparm;
    }

    public Long getPrincipal() {
        return principal;
    }

    public void setPrincipal(Long principal) {
        this.principal = principal;
    }

    @Override
    public String toString() {
        return "DeleteRoutePointData{" +
                "routeidparm=" + routeidparm +
                ", pointidparm=" + pointidparm +
                ", principal=" + principal +
                '}';
    }
}



