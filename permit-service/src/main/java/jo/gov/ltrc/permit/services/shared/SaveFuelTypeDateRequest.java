package com.etech.ltrc.permits.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveFuelTypeDateRequest {

    @ApiModelProperty("Fuel Type ID Parameter ") private long fueltypeidparm ;
    @ApiModelProperty("Fuel Type Name Parameter ") private String fueltypenameparm ;
    @ApiModelProperty("Principal Parameter ") private long princepel ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;

    public long getFueltypeidparm() {
        return fueltypeidparm;
    }

    public void setFueltypeidparm(long fueltypeidparm) {
        this.fueltypeidparm = fueltypeidparm;
    }

    public String getFueltypenameparm() {
        return fueltypenameparm;
    }

    public void setFueltypenameparm(String fueltypenameparm) {
        this.fueltypenameparm = fueltypenameparm;
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



