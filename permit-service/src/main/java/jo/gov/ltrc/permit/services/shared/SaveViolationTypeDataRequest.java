package com.etech.ltrc.permits.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveViolationTypeDataRequest {

    @ApiModelProperty("Violation Type ID Parameter ") private long violationtypeidparm ;
    @ApiModelProperty("Violation Type Name Parameter ") private String violationtypenameparm ;
    @ApiModelProperty("Principal Parameter ") private long princepel ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;


    public long getViolationtypeidparm() {
        return violationtypeidparm;
    }

    public void setViolationtypeidparm(long violationtypeidparm) {
        this.violationtypeidparm = violationtypeidparm;
    }

    public String getViolationtypenameparm() {
        return violationtypenameparm;
    }

    public void setViolationtypenameparm(String violationtypenameparm) {
        this.violationtypenameparm = violationtypenameparm;
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



