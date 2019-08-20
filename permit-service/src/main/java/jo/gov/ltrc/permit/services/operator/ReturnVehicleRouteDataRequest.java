package jo.gov.ltrc.permit.services.operator;


import io.swagger.annotations.ApiModelProperty;

public class ReturnVehicleRouteDataRequest {

    @ApiModelProperty("Vehicle Route ID Parameter ") private Long vehiclerouteidparm ;
    @ApiModelProperty("Vehicle ID Parameter ") private Long vehicleidparm ;
    @ApiModelProperty("Registration Number Parameter ") private String registrationnumberparm ;
    @ApiModelProperty("Route ID Parameter ") private Long routeidparm ;
    @ApiModelProperty("Route Name Parameter ") private String routenameparm ;

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

    public String getRegistrationnumberparm() {
        return registrationnumberparm;
    }

    public void setRegistrationnumberparm(String registrationnumberparm) {
        this.registrationnumberparm = registrationnumberparm;
    }

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

    @Override
    public String toString() {
        return "ReturnVehicleRouteDataRequest{" +
                "vehiclerouteidparm=" + vehiclerouteidparm +
                ", vehicleidparm=" + vehicleidparm +
                ", registrationnumberparm=" + registrationnumberparm +
                ", routeidparm=" + routeidparm +
                ", routenameparm=" + routenameparm +
                '}';
    }
}
