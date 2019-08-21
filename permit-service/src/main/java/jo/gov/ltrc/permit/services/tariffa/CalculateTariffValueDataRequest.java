package jo.gov.ltrc.permit.services.tariffa;


import io.swagger.annotations.ApiModelProperty;

public class CalculateTariffValueDataRequest {

    @ApiModelProperty("Route ID Parameter") private Long routeidparm ;
    @ApiModelProperty("Vehicle Category Parameter") private Long vehiclecategoryparm ;

    public Long getRouteidparm() {
        return routeidparm;
    }

    public void setRouteidparm(Long routeidparm) {
        this.routeidparm = routeidparm;
    }

    public Long getVehiclecategoryparm() {
        return vehiclecategoryparm;
    }

    public void setVehiclecategoryparm(Long vehiclecategoryparm) {
        this.vehiclecategoryparm = vehiclecategoryparm;
    }

    @Override
    public String toString() {
        return "CalculateTariffValueDataRequest{" +
                "routeidparm=" + routeidparm +
                ", vehiclecategoryparm=" + vehiclecategoryparm +
                '}';
    }
}



