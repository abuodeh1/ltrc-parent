package com.etech.ltrc.permits.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveServiceDepartmentDataRequest {

    @ApiModelProperty("Violation Type ID Parameter ") private long servicedepartmentidparm;
    @ApiModelProperty("Violation Type Name Parameter ") private String servicedepartmentnameparm;
    @ApiModelProperty("Principal Parameter ") private long princepel ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;


    public long getServicedepartmentidparm() {
        return servicedepartmentidparm;
    }

    public void setServicedepartmentidparm(long servicedepartmentidparm) {
        this.servicedepartmentidparm = servicedepartmentidparm;
    }

    public String getServicedepartmentnameparm() {
        return servicedepartmentnameparm;
    }

    public void setServicedepartmentnameparm(String servicedepartmentnameparm) {
        this.servicedepartmentnameparm = servicedepartmentnameparm;
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



