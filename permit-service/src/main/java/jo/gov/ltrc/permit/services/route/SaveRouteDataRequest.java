package com.etech.ltrc.permits.route;


import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class SaveRouteDataRequest {

    @ApiModelProperty("Route Name Parameter") private String routenameparm ;
    @ApiModelProperty("Route Length Parameter") private double routelengthparm  ;
    @ApiModelProperty("Route Length Viagis Parameter") private double routelengthviagisparm  ;
    @ApiModelProperty("Route daily Passengers Parameter") private double routedailypassengersparm ;
    @ApiModelProperty("Principal Parameter") private long princepal ;
    @ApiModelProperty("Bus Line ID Parameter") private long buslineidparm  ;
    @ApiModelProperty("Status ID Parameter") private int statusparm ;
    @ApiModelProperty("Route ID Parameter") private long routeidparm  ;
    @ApiModelProperty("Going Parameter") private String goingparm ;
    @ApiModelProperty("Return Ing Parameter") private String returningparm ;
    @ApiModelProperty("List of Points Object") private List<SaveRoutePointDataRequest> points ;

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

    public long getPrincepal() {
        return princepal;
    }

    public void setPrincepal(long princepal) {
        this.princepal = princepal;
    }

    public long getBuslineidparm() {
        return buslineidparm;
    }

    public void setBuslineidparm(long buslineidparm) {
        this.buslineidparm = buslineidparm;
    }

    public int getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(int statusparm) {
        this.statusparm = statusparm;
    }


    public long getRouteidparm() {
        return routeidparm;
    }

    public void setRouteidparm(long routeidparm) {
        this.routeidparm = routeidparm;
    }

    public String getGoingparm() {
        return goingparm;
    }

    public void setGoingparm(String goingparm) {
        this.goingparm = goingparm;
    }

    public String getReturningparm() {
        return returningparm;
    }

    public void setReturningparm(String returningparm) {
        this.returningparm = returningparm;
    }

    public List<SaveRoutePointDataRequest> getPoints() {
        return points;
    }

    public void setPoints(List<SaveRoutePointDataRequest> points) {
        this.points = points;
    }
}



