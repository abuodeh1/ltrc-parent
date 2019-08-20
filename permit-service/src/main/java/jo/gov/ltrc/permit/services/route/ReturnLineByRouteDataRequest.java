package jo.gov.ltrc.permit.services.route;


import io.swagger.annotations.ApiModelProperty;

public class ReturnLineByRouteDataRequest {

    @ApiModelProperty("Minimum Route ID Parameter")private Long minrouteidparm;
    @ApiModelProperty("Maximum Route ID Parameter") private Long maxrouteidparm;
    @ApiModelProperty("Minimum Route Daily Passengers Parameter") private Long minroutedailypassengersparm ;
    @ApiModelProperty("Maximum Route Daily Passengers Parameter") private Long maxroutedailypassengersparm;
    @ApiModelProperty("Minimum Route Length Parameter") private Long minroutelengthparm;
    @ApiModelProperty("Maximum Route Length Parameter") private Long maxroutelengthparm;
    @ApiModelProperty("Minimum Route Length Viagis Parameter") private Long minroutelengthviagisparm;
    @ApiModelProperty("Maximum Route Length Viagis Parameter") private Long maxroutelengthviagisparm;

    public Long getMinrouteidparm() {
        return minrouteidparm;
    }

    public void setMinrouteidparm(Long minrouteidparm) {
        this.minrouteidparm = minrouteidparm;
    }

    public Long getMaxrouteidparm() {
        return maxrouteidparm;
    }

    public void setMaxrouteidparm(Long maxrouteidparm) {
        this.maxrouteidparm = maxrouteidparm;
    }

    public Long getMinroutedailypassengersparm() {
        return minroutedailypassengersparm;
    }

    public void setMinroutedailypassengersparm(Long minroutedailypassengersparm) {
        this.minroutedailypassengersparm = minroutedailypassengersparm;
    }

    public Long getMaxroutedailypassengersparm() {
        return maxroutedailypassengersparm;
    }

    public void setMaxroutedailypassengersparm(Long maxroutedailypassengersparm) {
        this.maxroutedailypassengersparm = maxroutedailypassengersparm;
    }

    public Long getMinroutelengthparm() {
        return minroutelengthparm;
    }

    public void setMinroutelengthparm(Long minroutelengthparm) {
        this.minroutelengthparm = minroutelengthparm;
    }

    public Long getMaxroutelengthparm() {
        return maxroutelengthparm;
    }

    public void setMaxroutelengthparm(Long maxroutelengthparm) {
        this.maxroutelengthparm = maxroutelengthparm;
    }

    public Long getMinroutelengthviagisparm() {
        return minroutelengthviagisparm;
    }

    public void setMinroutelengthviagisparm(Long minroutelengthviagisparm) {
        this.minroutelengthviagisparm = minroutelengthviagisparm;
    }

    public Long getMaxroutelengthviagisparm() {
        return maxroutelengthviagisparm;
    }

    public void setMaxroutelengthviagisparm(Long maxroutelengthviagisparm) {
        this.maxroutelengthviagisparm = maxroutelengthviagisparm;
    }

    @Override
    public String toString() {
        return "ReturnLineByRouteDataRequest{" +
                "minrouteidparm=" + minrouteidparm +
                ", maxrouteidparm=" + maxrouteidparm +
                ", minroutedailypassengersparm=" + minroutedailypassengersparm +
                ", maxroutedailypassengersparm=" + maxroutedailypassengersparm +
                ", minroutelengthparm=" + minroutelengthparm +
                ", maxroutelengthparm=" + maxroutelengthparm +
                ", minroutelengthviagisparm=" + minroutelengthviagisparm +
                ", maxroutelengthviagisparm=" + maxroutelengthviagisparm +
                '}';
    }
}



