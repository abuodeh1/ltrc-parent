package com.etech.ltrc.permits.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveOperatorClassificationDataRequest {

    @ApiModelProperty("Violation Type ID Parameter ") private long operatorclassificationidparm;
    @ApiModelProperty("Violation Type Name Parameter ") private String operatorclassificationnameparm;
    @ApiModelProperty("Principal Parameter ") private long princepel ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;


    public long getOperatorclassificationidparm() {
        return operatorclassificationidparm;
    }

    public void setOperatorclassificationidparm(long operatorclassificationidparm) {
        this.operatorclassificationidparm = operatorclassificationidparm;
    }

    public String getOperatorclassificationnameparm() {
        return operatorclassificationnameparm;
    }

    public void setOperatorclassificationnameparm(String operatorclassificationnameparm) {
        this.operatorclassificationnameparm = operatorclassificationnameparm;
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



