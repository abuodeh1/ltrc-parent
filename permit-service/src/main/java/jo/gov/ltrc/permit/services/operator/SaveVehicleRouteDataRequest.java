package jo.gov.ltrc.permit.services.operator;


import io.swagger.annotations.ApiModelProperty;

public class SaveVehicleRouteDataRequest {

    @ApiModelProperty("Vehicle Route ID Parameter") private long vehiclerouteidparm ;
    @ApiModelProperty("Vehicle ID Parameter") private long vehicleidparm ;
    @ApiModelProperty("Route ID Parameter") private long routeidparm ;

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

    public long getRouteidparm() {
        return routeidparm;
    }

    public void setRouteidparm(long routeidparm) {
        this.routeidparm = routeidparm;
    }
}
