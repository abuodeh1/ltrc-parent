package jo.gov.ltrc.permit.services.route;



import io.swagger.annotations.ApiModelProperty;



public class SaveRoutePointDataRequest {

    @ApiModelProperty("Route ID Parameter ") private Long routeidparm;
    @ApiModelProperty("Point ID Parameter") private Long pointidparm ;
    @ApiModelProperty("Principal Parameter") private Long principal ;
    @ApiModelProperty("Point Order Parameter") private Integer pointorderparm ;
    @ApiModelProperty("Point Direction Parameter") private   Boolean pointdirectionparm ;
    @ApiModelProperty("IP Address") private String ipaddressparm  ;

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

    public Integer getPointorderparm() {
        return pointorderparm;
    }

    public void setPointorderparm(Integer pointorderparm) {
        this.pointorderparm = pointorderparm;
    }

    public Boolean getPointdirectionparm() {
        return pointdirectionparm;
    }

    public void setPointdirectionparm(Boolean pointdirectionparm) {
        this.pointdirectionparm = pointdirectionparm;
    }

    public String getIpaddressparm() {
        return ipaddressparm;
    }

    public void setIpaddressparm(String ipaddressparm) {
        this.ipaddressparm = ipaddressparm;
    }

    @Override
    public String toString() {
        return "SaveRoutePointDataRequest{" +
                "pointidparm=" + pointidparm +
                ", principal=" + principal +
                ", pointorderparm=" + pointorderparm +
                ", pointdirectionparm=" + pointdirectionparm +
                ", ipaddressparam=" + ipaddressparm +
                '}';
    }
}



