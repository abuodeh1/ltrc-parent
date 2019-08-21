package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveViolationPenaltyDataRequest {

    @ApiModelProperty("Violation Type ID Parameter ") private Long violationpenaltyidparm;
    @ApiModelProperty("Violation Type Name Parameter ") private String violationpenaltynameparm;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;
    @ApiModelProperty("IP Address") private String ipaddressparm  ;

    public Long getViolationpenaltyidparm() {
        return violationpenaltyidparm;
    }

    public void setViolationpenaltyidparm(Long violationpenaltyidparm) {
        this.violationpenaltyidparm = violationpenaltyidparm;
    }

    public String getViolationpenaltynameparm() {
        return violationpenaltynameparm;
    }

    public void setViolationpenaltynameparm(String violationpenaltynameparm) {
        this.violationpenaltynameparm = violationpenaltynameparm;
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
        return "SaveViolationPenaltyDataRequest{" +
                "violationpenaltyidparm=" + violationpenaltyidparm +
                ", violationpenaltynameparm= " + violationpenaltynameparm + 
                ", princepel=" + princepel +
                ", statusparm=" + statusparm +
                ", ipaddressparm= " + ipaddressparm + 
                '}';
    }
}



