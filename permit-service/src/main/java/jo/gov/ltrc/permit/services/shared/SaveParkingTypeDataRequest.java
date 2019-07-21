package com.etech.ltrc.permits.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveParkingTypeDataRequest {

    @ApiModelProperty("Parking Type ID Parameter ") private long parkingtypeidparm ;
    @ApiModelProperty("Parking Type Arabic Name Parameter ") private String parkingtypearabicnameparm ;
    @ApiModelProperty("Parking Type English Name Parameter ") private String parkingtypeenglishnameparm ;
    @ApiModelProperty("Principal Parameter ") private long princepel ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;

    public long getParkingtypeidparm() {
        return parkingtypeidparm;
    }

    public void setParkingtypeidparm(long parkingtypeidparm) {
        this.parkingtypeidparm = parkingtypeidparm;
    }

    public String getParkingtypearabicnameparm() {
        return parkingtypearabicnameparm;
    }

    public void setParkingtypearabicnameparm(String parkingtypearabicnameparm) {
        this.parkingtypearabicnameparm = parkingtypearabicnameparm;
    }

    public String getParkingtypeenglishnameparm() {
        return parkingtypeenglishnameparm;
    }

    public void setParkingtypeenglishnameparm(String parkingtypeenglishnameparm) {
        this.parkingtypeenglishnameparm = parkingtypeenglishnameparm;
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



