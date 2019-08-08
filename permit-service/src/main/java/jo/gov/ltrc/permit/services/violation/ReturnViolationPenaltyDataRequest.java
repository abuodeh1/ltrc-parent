package jo.gov.ltrc.permit.services.violation;


import io.swagger.annotations.ApiModelProperty;

public class ReturnViolationPenaltyDataRequest {

    @ApiModelProperty("Violation Type ID Parameter ") private long violationpenaltyidparm;
    @ApiModelProperty("Violation Type Name Parameter ") private String violationpenaltynameparm;

    public long getViolationpenaltyidparm() {
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
}
