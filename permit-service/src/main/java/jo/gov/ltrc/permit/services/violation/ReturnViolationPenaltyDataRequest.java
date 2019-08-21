package jo.gov.ltrc.permit.services.violation;


import io.swagger.annotations.ApiModelProperty;

public class ReturnViolationPenaltyDataRequest {

    @ApiModelProperty("Violation Type ID Parameter ") private Long violationpenaltyidparm;
    @ApiModelProperty("Violation Type Name Parameter ") private String violationpenaltynameparm;

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

    @Override
    public String toString() {
        return "ReturnViolationPenaltyDataRequest{" +
                "violationpenaltyidparm=" + violationpenaltyidparm +
                ", violationpenaltynameparm=" + violationpenaltynameparm +
                '}';
    }
}
