package jo.gov.ltrc.permit.services.operator;


import io.swagger.annotations.ApiModelProperty;

public class SaveVehicleRouteDataRequest {

    @ApiModelProperty("Vehicle Route ID Parameter") private Long vehiclerouteidparm ;
    @ApiModelProperty("Vehicle ID Parameter") private Long vehicleidparm ;
    @ApiModelProperty("Route ID Parameter") private Long routeidparm ;

    public Long getVehiclerouteidparm() {
        return vehiclerouteidparm;
    }

    public void setVehiclerouteidparm(Long vehiclerouteidparm) {
        this.vehiclerouteidparm = vehiclerouteidparm;
    }

    public Long getVehicleidparm() {
        return vehicleidparm;
    }

    public void setVehicleidparm(Long vehicleidparm) {
        this.vehicleidparm = vehicleidparm;
    }

    public Long getRouteidparm() {
        return routeidparm;
    }

    public void setRouteidparm(Long routeidparm) {
        this.routeidparm = routeidparm;
    }

    @Override
    public String toString() {
        return "SaveVehicleRouteDataRequest{" +
                "vehiclerouteidparm=" + vehiclerouteidparm +
                ", vehicleidparm=" + vehicleidparm +
                ", routeidparm=" + routeidparm +
                '}';
    }
}
