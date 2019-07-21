package jo.gov.ltrc.permit.services.route;


import io.swagger.annotations.ApiModelProperty;

public class ReturnRouteRequest {

     @ApiModelProperty("Route ID Parameter") private long routeidparm ;
     @ApiModelProperty("Route Name Parameter") private String routenameparm ;
     @ApiModelProperty("Route Length Parameter") private double routelengthparm ;
     @ApiModelProperty("Route Length Viagis Parameter") private double routelengthviagisparm ;
     @ApiModelProperty("Route Daily Passengers Parameter") private double routedailypassengersparm ;
     @ApiModelProperty("Bus Line ID Parameter") private long buslineidparm ;
     @ApiModelProperty("Line Name Parameter") private String linenameparm ;

    public long getRouteidparm() {
        return routeidparm;
    }

    public void setRouteidparm(long routeidparm) {
        this.routeidparm = routeidparm;
    }

    public String getRoutenameparm() {
        return routenameparm;
    }

    public void setRoutenameparm(String routenameparm) {
        this.routenameparm = routenameparm;
    }

    public double getRoutelengthparm() {
        return routelengthparm;
    }

    public void setRoutelengthparm(double routelengthparm) {
        this.routelengthparm = routelengthparm;
    }

    public double getRoutelengthviagisparm() {
        return routelengthviagisparm;
    }

    public void setRoutelengthviagisparm(double routelengthviagisparm) {
        this.routelengthviagisparm = routelengthviagisparm;
    }

    public double getRoutedailypassengersparm() {
        return routedailypassengersparm;
    }

    public void setRoutedailypassengersparm(double routedailypassengersparm) {
        this.routedailypassengersparm = routedailypassengersparm;
    }

    public long getBuslineidparm() {
        return buslineidparm;
    }

    public void setBuslineidparm(long buslineidparm) {
        this.buslineidparm = buslineidparm;
    }

    public String getLinenameparm() {
        return linenameparm;
    }

    public void setLinenameparm(String linenameparm) {
        this.linenameparm = linenameparm;
    }

}



