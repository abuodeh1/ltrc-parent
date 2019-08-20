package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveViolationPenaltyDataRequest {

    @ApiModelProperty("Violation Type ID Parameter ") private Long violationpenaltyidparm;
    @ApiModelProperty("Violation Type Name Parameter ") private String violationpenaltynameparm;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;


    public Long getViolationpenaltyidparm() {
        return violationpenaltyidparm;
    }

    public void setViolationpenaltyidparm(long violationpenaltyidparm) {
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



