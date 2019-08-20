package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveViolationSubjectDataRequest {

    @ApiModelProperty("Violation Type ID Parameter ") private Long violationsubjectidparm;
    @ApiModelProperty("Violation Type Name Parameter ") private String violationsubjectnameparm;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;


    public Long getViolationsubjectidparm() {
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



