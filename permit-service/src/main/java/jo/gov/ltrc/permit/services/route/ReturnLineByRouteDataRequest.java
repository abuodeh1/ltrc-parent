package jo.gov.ltrc.permit.services.route;


import io.swagger.annotations.ApiModelProperty;

public class ReturnLineByRouteDataRequest {

    @ApiModelProperty("Minimum Route ID Parameter")private long minrouteidparm;
    @ApiModelProperty("Maximum Route ID Parameter") private long maxrouteidparm;
    @ApiModelProperty("Minimum Route Daily Passengers Parameter") private long minroutedailypassengersparm ;
    @ApiModelProperty("Maximum Route Daily Passengers Parameter") private long maxroutedailypassengersparm;
    @ApiModelProperty("Minimum Route Length Parameter") private long minroutelengthparm;
    @ApiModelProperty("Maximum Route Length Parameter") private long maxroutelengthparm;
    @ApiModelProperty("Minimum Route Length Viagis Parameter") private long minroutelengthviagisparm;
    @ApiModelProperty("Maximum Route Length Viagis Parameter") private long maxroutelengthviagisparm;

    public long getMinrouteidparm() {
        return minrouteidparm;
    }

    public void setMinrouteidparm(long minrouteidparm) {
        this.minrouteidparm = minrouteidparm;
    }

    public long getMaxrouteidparm() {
        return maxrouteidparm;
    }

    public void setMaxrouteidparm(long maxrouteidparm) {
        this.maxrouteidparm = maxrouteidparm;
    }

    public long getMinroutedailypassengersparm() {
        return minroutedailypassengersparm;
    }

    public void setMinroutedailypassengersparm(long minroutedailypassengersparm) {
        this.minroutedailypassengersparm = minroutedailypassengersparm;
    }

    public long getMaxroutedailypassengersparm() {
        return maxroutedailypassengersparm;
    }

    public void setMaxroutedailypassengersparm(long maxroutedailypassengersparm) {
        this.maxroutedailypassengersparm = maxroutedailypassengersparm;
    }

    public long getMinroutelengthparm() {
        return minroutelengthparm;
    }

    public void setMinroutelengthparm(long minroutelengthparm) {
        this.minroutelengthparm = minroutelengthparm;
    }

    public long getMaxroutelengthparm() {
        return maxroutelengthparm;
    }

    public void setMaxroutelengthparm(long maxroutelengthparm) {
        this.maxroutelengthparm = maxroutelengthparm;
    }

    public long getMinroutelengthviagisparm() {
        return minroutelengthviagisparm;
    }

    public void setMinroutelengthviagisparm(long minroutelengthviagisparm) {
        this.minroutelengthviagisparm = minroutelengthviagisparm;
    }

    public long getMaxroutelengthviagisparm() {
        return maxroutelengthviagisparm;
    }

    public void setMaxroutelengthviagisparm(long maxroutelengthviagisparm) {
        this.maxroutelengthviagisparm = maxroutelengthviagisparm;
    }
}



