package jo.gov.ltrc.permit.services.violation;


import io.swagger.annotations.ApiModelProperty;

public class ReturnViolationSubjectDataRequest {

    @ApiModelProperty("Violation Type ID Parameter ") private Long violationsubjectidparm;
    @ApiModelProperty("Violation Type Name Parameter ") private String violationsubjectnameparm;

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

    @Override
    public String toString() {
        return "ReturnViolationSubjectDataRequest{" +
                "violationsubjectidparm=" + violationsubjectidparm +
                ", violationsubjectnameparm=" + violationsubjectnameparm +
                '}';
    }
}
