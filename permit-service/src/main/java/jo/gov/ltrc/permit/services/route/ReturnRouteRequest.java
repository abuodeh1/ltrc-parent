package jo.gov.ltrc.permit.services.route;


import io.swagger.annotations.ApiModelProperty;

public class ReturnRouteRequest {

     @ApiModelProperty("Route ID Parameter") private Long routeidparm ;
     @ApiModelProperty("Route Name Parameter") private String routenameparm ;
     @ApiModelProperty("Route Length Parameter") private  Double routelengthparm ;
     @ApiModelProperty("Route Length Viagis Parameter") private  Double routelengthviagisparm ;
     @ApiModelProperty("Route Daily Passengers Parameter") private  Double routedailypassengersparm ;
     @ApiModelProperty("Bus Line ID Parameter") private Long buslineidparm ;
     @ApiModelProperty("Line Name Parameter") private String linenameparm ;

    public Long getRouteidparm() {
        return routeidparm;
    }

    public void setRouteidparm(Long routeidparm) {
        this.routeidparm = routeidparm;
    }

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

    public Long getBuslineidparm() {
        return buslineidparm;
    }

    public void setBuslineidparm(Long buslineidparm) {
        this.buslineidparm = buslineidparm;
    }

    public String getLinenameparm() {
        return linenameparm;
    }

    public void setLinenameparm(String linenameparm) {
        this.linenameparm = linenameparm;
    }

    @Override
    public String toString() {
        return "ReturnRouteRequest{" +
                "routeidparm=" + routeidparm +
                ", routenameparm=" + routenameparm +
                ", routelengthparm=" + routelengthparm +
                ", routelengthviagisparm=" + routelengthviagisparm +
                ", routedailypassengersparm=" + routedailypassengersparm +
                ", buslineidparm=" + buslineidparm +
                ", linenameparm=" + linenameparm +
                '}';
    }
}



