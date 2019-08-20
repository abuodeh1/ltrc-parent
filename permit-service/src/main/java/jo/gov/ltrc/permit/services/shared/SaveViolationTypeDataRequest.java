package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveViolationTypeDataRequest {

    @ApiModelProperty("Violation Type ID Parameter ") private Long violationtypeidparm ;
    @ApiModelProperty("Violation Type Name Parameter ") private String violationtypenameparm ;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;


    public Long getViolationtypeidparm() {
        return violationtypeidparm;
    }

    public void setViolationtypeidparm(long violationtypeidparm) {
        this.violationtypeidparm = violationtypeidparm;
    }

    public String getViolationtypenameparm() {
        return violationtypenameparm;
    }

    public void setViolationtypenameparm(String violationtypenameparm) {
        this.violationtypenameparm = violationtypenameparm;
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



