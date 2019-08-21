package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveViolationSubjectDataRequest {

    @ApiModelProperty("Violation Type ID Parameter ") private Long violationsubjectidparm;
    @ApiModelProperty("Violation Type Name Parameter ") private String violationsubjectnameparm;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;
    @ApiModelProperty("IP Address") private String ipaddressparm  ;

    public Long getViolationsubjectidparm() {
        return violationsubjectidparm;
    }

    public void setViolationsubjectidparm(Long violationsubjectidparm) {
        this.violationsubjectidparm = violationsubjectidparm;
    }

    public String getViolationsubjectnameparm() {
        return violationsubjectnameparm;
    }

    public void setViolationsubjectnameparm(String violationsubjectnameparm) {
        this.violationsubjectnameparm = violationsubjectnameparm;
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
        return "SaveViolationSubjectDataRequest{" +
                "violationsubjectidparm=" + violationsubjectidparm +
                ", violationsubjectnameparm= " + violationsubjectnameparm + 
                ", princepel=" + princepel +
                ", statusparm=" + statusparm +
                ", ipaddressparm= " + ipaddressparm + 
                '}';
    }
}



