package com.etech.ltrc.permits.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveViolationSubjectDataRequest {

    @ApiModelProperty("Violation Type ID Parameter ") private long violationsubjectidparm;
    @ApiModelProperty("Violation Type Name Parameter ") private String violationsubjectnameparm;
    @ApiModelProperty("Principal Parameter ") private long princepel ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;


    public long getViolationsubjectidparm() {
        return violationsubjectidparm;
    }

    public void setViolationsubjectidparm(long violationsubjectidparm) {
        this.violationsubjectidparm = violationsubjectidparm;
    }

    public String getViolationsubjectnameparm() {
        return violationsubjectnameparm;
    }

    public void setViolationsubjectnameparm(String violationsubjectnameparm) {
        this.violationsubjectnameparm = violationsubjectnameparm;
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



