package com.etech.ltrc.permits.shared;


import io.swagger.annotations.ApiModelProperty;

public class SavePlateClassificationDataRequest {

    @ApiModelProperty("Violation Type ID Parameter ") private long plateclassificationidparm;
    @ApiModelProperty("Violation Type Name Parameter ") private String plateclassificationnameparm;
    @ApiModelProperty("Principal Parameter ") private long princepel ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;


    public long getPlateclassificationidparm() {
        return plateclassificationidparm;
    }

    public void setPlateclassificationidparm(long plateclassificationidparm) {
        this.plateclassificationidparm = plateclassificationidparm;
    }

    public String getPlateclassificationnameparm() {
        return plateclassificationnameparm;
    }

    public void setPlateclassificationnameparm(String plateclassificationnameparm) {
        this.plateclassificationnameparm = plateclassificationnameparm;
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



