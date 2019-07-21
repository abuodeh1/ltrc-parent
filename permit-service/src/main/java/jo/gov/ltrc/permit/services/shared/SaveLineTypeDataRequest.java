package com.etech.ltrc.permits.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveLineTypeDataRequest {

    @ApiModelProperty("Line Type ID Parameter ") private long linetypeidparm ;
    @ApiModelProperty("Line Type Name Parameter ") private String linetypenameparm ;
    @ApiModelProperty("Principal Parameter ") private long princepel ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;

    public long getLinetypeidparm() {
        return linetypeidparm;
    }

    public void setLinetypeidparm(long linetypeidparm) {
        this.linetypeidparm = linetypeidparm;
    }

    public String getLinetypenameparm() {
        return linetypenameparm;
    }

    public void setLinetypenameparm(String linetypenameparm) {
        this.linetypenameparm = linetypenameparm;
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



