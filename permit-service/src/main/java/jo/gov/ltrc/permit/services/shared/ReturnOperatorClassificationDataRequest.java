package com.etech.ltrc.permits.shared;


import io.swagger.annotations.ApiModelProperty;

public class ReturnOperatorClassificationDataRequest {

    @ApiModelProperty("Operator Classification ID Parameter") private long operatorclassificationidparm ;
    @ApiModelProperty("Operator Classification Name Parameter") private String operatorclassificationnameparm ;

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
}



