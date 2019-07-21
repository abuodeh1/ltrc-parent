package com.etech.ltrc.permits.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveVehicleUsagePurposeDataRequest {

    @ApiModelProperty("Usage Purpose ID Parameter ") private long usagepurposeidparm ;
    @ApiModelProperty("Usage Purpose Name Parameter ") private String usagepurposenameparm ;
    @ApiModelProperty("Principal Parameter ") private long princepel ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;


    public long getUsagepurposeidparm() {
        return usagepurposeidparm;
    }

    public void setUsagepurposeidparm(long usagepurposeidparm) {
        this.usagepurposeidparm = usagepurposeidparm;
    }

    public String getUsagepurposenameparm() {
        return usagepurposenameparm;
    }

    public void setUsagepurposenameparm(String usagepurposenameparm) {
        this.usagepurposenameparm = usagepurposenameparm;
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



