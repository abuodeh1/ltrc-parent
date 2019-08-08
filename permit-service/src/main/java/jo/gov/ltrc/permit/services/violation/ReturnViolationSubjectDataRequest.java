package jo.gov.ltrc.permit.services.violation;


import io.swagger.annotations.ApiModelProperty;

public class ReturnViolationSubjectDataRequest {

    @ApiModelProperty("Violation Type ID Parameter ") private long violationsubjectidparm;
    @ApiModelProperty("Violation Type Name Parameter ") private String violationsubjectnameparm;

    public long getViolationsubjectidparm() {
        return violationsubjectidparm;
    }

    public void setViolationsubjectidparm(long violationsubjectidparm) {
        this.violationsubjectidparm = violationsubjectidparm;
    }

    public String getViolationsubjectnameparm() {
        return violationsubjectnameparm;
    }

    public void setViolationsubjectnameparm(String violationsubjectnameparm) {
        this.violationsubjectnameparm = violationsubjectnameparm;
    }
}
