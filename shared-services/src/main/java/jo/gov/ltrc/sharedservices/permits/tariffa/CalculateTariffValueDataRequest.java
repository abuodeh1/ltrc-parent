package jo.gov.ltrc.sharedservices.permits.tariffa;


import io.swagger.annotations.ApiModelProperty;

public class CalculateTariffValueDataRequest {

    @ApiModelProperty("Route ID Parameter") private long routeidparm ;
    @ApiModelProperty("Vehicle Category Parameter") private long vehiclecategoryparm ;


    public long getRouteidparm() {
        return routeidparm;
    }

    public void setRouteidparm(long routeidparm) {
        this.routeidparm = routeidparm;
    }

    public long getVehiclecategoryparm() {
        return vehiclecategoryparm;
    }

    public void setVehiclecategoryparm(long vehiclecategoryparm) {
        this.vehiclecategoryparm = vehiclecategoryparm;
    }

}



