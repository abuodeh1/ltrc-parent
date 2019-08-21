package jo.gov.ltrc.permit.services.route;


import io.swagger.annotations.ApiModelProperty;


import java.util.List;

public class SaveRouteDataRequest {

    @ApiModelProperty("Route Name Parameter") private String routenameparm ;
    @ApiModelProperty("Route Length Parameter") private  Double routelengthparm  ;
    @ApiModelProperty("Route Length Viagis Parameter") private  Double routelengthviagisparm  ;
    @ApiModelProperty("Route daily Passengers Parameter") private  Double routedailypassengersparm ;
    @ApiModelProperty("Principal Parameter") private Long princepal ;
    @ApiModelProperty("Bus Line ID Parameter") private Long buslineidparm  ;
    @ApiModelProperty("Status ID Parameter") private Integer statusparm ;
    @ApiModelProperty("Route ID Parameter") private Long routeidparm  ;
    @ApiModelProperty("Going Parameter") private String goingparm ;
    @ApiModelProperty("Return Ing Parameter") private String returningparm ;
    @ApiModelProperty("IP Address") private String ipaddressparm  ;
    @ApiModelProperty("List of Points Object") private List<SaveRoutePointDataRequest> points ;

    public String getRoutenameparm() {
        return routenameparm;
    }

    public void setRoutenameparm(String routenameparm) {
        this.routenameparm = routenameparm;
    }

    public Double getRoutelengthparm() {
        return routelengthparm;
    }

    public void setRoutelengthparm(Double routelengthparm) {
        this.routelengthparm = routelengthparm;
    }

    public Double getRoutelengthviagisparm() {
        return routelengthviagisparm;
    }

    public void setRoutelengthviagisparm(Double routelengthviagisparm) {
        this.routelengthviagisparm = routelengthviagisparm;
    }

    public Double getRoutedailypassengersparm() {
        return routedailypassengersparm;
    }

    public void setRoutedailypassengersparm(Double routedailypassengersparm) {
        this.routedailypassengersparm = routedailypassengersparm;
    }

    public Long getPrincepal() {
        return princepal;
    }

    public void setPrincepal(Long princepal) {
        this.princepal = princepal;
    }

    public Long getBuslineidparm() {
        return buslineidparm;
    }

    public void setBuslineidparm(Long buslineidparm) {
        this.buslineidparm = buslineidparm;
    }

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

    public String getGoingparm() {
        return goingparm;
    }

    public void setGoingparm(String goingparm) {
        this.goingparm = goingparm;
    }

    public String getReturningparm() {
        return returningparm;
    }

    public void setReturningparm(String returningparm) {
        this.returningparm = returningparm;
    }

    public String getIpaddressparm() {
        return ipaddressparm;
    }

    public void setIpaddressparm(String ipaddressparm) {
        this.ipaddressparm = ipaddressparm;
    }

    public List<SaveRoutePointDataRequest> getPoints() {
        return points;
    }

    public void setPoints(List<SaveRoutePointDataRequest> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "SaveRouteDataRequest{" +
                "routenameparm=" + routenameparm +
                ", routelengthparm=" + routelengthparm +
                ", routelengthviagisparm=" + routelengthviagisparm +
                ", routedailypassengersparm=" + routedailypassengersparm +
                ", princepal=" + princepal +
                ", buslineidparm=" + buslineidparm +
                ", statusparm=" + statusparm +
                ", routeidparm=" + routeidparm +
                ", goingparm=" + goingparm +
                ", returningparm=" + returningparm +
                ", ipaddressparam=" + ipaddressparm +
                ", points=" + points +
                '}';
    }
}



