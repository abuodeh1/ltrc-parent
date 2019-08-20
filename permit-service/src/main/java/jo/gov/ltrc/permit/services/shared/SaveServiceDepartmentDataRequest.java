package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveServiceDepartmentDataRequest {

    @ApiModelProperty("Violation Type ID Parameter ") private Long servicedepartmentidparm;
    @ApiModelProperty("Violation Type Name Parameter ") private String servicedepartmentnameparm;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;


    public Long getServicedepartmentidparm() {
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

    public Long getPrincepel() {
        return princepel;
    }

    public void setPrincepel(long princepel) {
        this.princepel = princepel;
    }

    public Integer getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(int statusparm) {
        this.statusparm = statusparm;
    }
}



