package jo.gov.ltrc.permit.services.operator;


import io.swagger.annotations.ApiModelProperty;

public class ReturnVehicleRouteDataRequest {

    @ApiModelProperty("Vehicle Route ID Parameter ") private long vehiclerouteidparm ;
    @ApiModelProperty("Vehicle ID Parameter ") private long vehicleidparm ;
    @ApiModelProperty("Registration Number Parameter ") private String registrationnumberparm ;
    @ApiModelProperty("Route ID Parameter ") private long routeidparm ;
    @ApiModelProperty("Route Name Parameter ") private String routenameparm ;

    public long getVehiclerouteidparm() {
        return vehiclerouteidparm;
    }

    public void setVehiclerouteidparm(long vehiclerouteidparm) {
        this.vehiclerouteidparm = vehiclerouteidparm;
    }

    public long getVehicleidparm() {
        return vehicleidparm;
    }

    public void setVehicleidparm(long vehicleidparm) {
        this.vehicleidparm = vehicleidparm;
    }

    public String getRegistrationnumberparm() {
        return registrationnumberparm;
    }

    public void setRegistrationnumberparm(String registrationnumberparm) {
        this.registrationnumberparm = registrationnumberparm;
    }

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
}
