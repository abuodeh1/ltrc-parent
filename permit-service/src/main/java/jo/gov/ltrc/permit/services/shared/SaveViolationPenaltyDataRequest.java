package com.etech.ltrc.permits.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveViolationPenaltyDataRequest {

    @ApiModelProperty("Violation Type ID Parameter ") private long violationpenaltyidparm;
    @ApiModelProperty("Violation Type Name Parameter ") private String violationpenaltynameparm;
    @ApiModelProperty("Principal Parameter ") private long princepel ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;


    public long getViolationpenaltyidparm() {
        return violationpenaltyidparm;
    }

    public void setViolationpenaltyidparm(long violationpenaltyidparm) {
        this.violationpenaltyidparm = violationpenaltyidparm;
    }

    public String getViolationpenaltynameparm() {
        return violationpenaltynameparm;
    }

    public void setViolationpenaltynameparm(String violationpenaltynameparm) {
        this.violationpenaltynameparm = violationpenaltynameparm;
    }

    public long getPrincepel() {
        return princepel;
    }

    public void setPrincepel(long princepel) {
        this.princepel = princepel;
    }

    public int getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(int statusparm) {
        this.statusparm = statusparm;
    }
}



