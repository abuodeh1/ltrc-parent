package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveServiceDepartmentDataRequest {

    @ApiModelProperty("Violation Type ID Parameter ")private Long servicedepartmentidparm;
    @ApiModelProperty("Violation Type Name Parameter ")private String servicedepartmentnameparm;
    @ApiModelProperty("Principal Parameter ")private Long princepel;
    @ApiModelProperty("Status Parameter ")private Integer statusparm;
    @ApiModelProperty("IP Address")private String ipaddressparm;

    public Long getServicedepartmentidparm() {
        return servicedepartmentidparm;
    }

    public void setServicedepartmentidparm(Long servicedepartmentidparm) {
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

    public void setPrincepel(Long princepel) {
        this.princepel = princepel;
    }

    public Integer getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(Integer statusparm) {
        this.statusparm = statusparm;
    }

    public String getIpaddressparm() {
        return ipaddressparm;
    }

    public void setIpaddressparm(String ipaddressparm) {
        this.ipaddressparm = ipaddressparm;
    }

    @Override
    public String toString() {
        return "SaveServiceDepartmentDataRequest{" +
                "servicedepartmentidparm=" + servicedepartmentidparm +
                ", servicedepartmentnameparm= " + servicedepartmentnameparm + 
                ", princepel=" + princepel +
                ", statusparm=" + statusparm +
                ", ipaddressparm= " + ipaddressparm + 
                '}';
    }
}



