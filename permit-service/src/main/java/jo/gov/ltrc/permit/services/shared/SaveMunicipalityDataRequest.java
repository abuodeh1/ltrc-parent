package com.etech.ltrc.permits.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveMunicipalityDataRequest {

    @ApiModelProperty("Municipality ID Parameter ") private long municipalityidparm ;
    @ApiModelProperty("Municipality Arabic Name Parameter ") private String municipalityarabicnameparm ;
    @ApiModelProperty("Municipality English Name Parameter ") private String municipalityenglishnameparm ;
    @ApiModelProperty("Municipality Code Parameter ") private String municipalitycodeparm ;
    @ApiModelProperty("Governorate ID Parameter ") private long governorateidparm ;
    @ApiModelProperty("Principal Parameter ") private long princepel ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;


    public long getMunicipalityidparm() {
        return municipalityidparm;
    }

    public void setMunicipalityidparm(long municipalityidparm) {
        this.municipalityidparm = municipalityidparm;
    }

    public String getMunicipalityarabicnameparm() {
        return municipalityarabicnameparm;
    }

    public void setMunicipalityarabicnameparm(String municipalityarabicnameparm) {
        this.municipalityarabicnameparm = municipalityarabicnameparm;
    }

    public String getMunicipalityenglishnameparm() {
        return municipalityenglishnameparm;
    }

    public void setMunicipalityenglishnameparm(String municipalityenglishnameparm) {
        this.municipalityenglishnameparm = municipalityenglishnameparm;
    }

    public String getMunicipalitycodeparm() {
        return municipalitycodeparm;
    }

    public void setMunicipalitycodeparm(String municipalitycodeparm) {
        this.municipalitycodeparm = municipalitycodeparm;
    }

    public long getGovernorateidparm() {
        return governorateidparm;
    }

    public void setGovernorateidparm(long governorateidparm) {
        this.governorateidparm = governorateidparm;
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



