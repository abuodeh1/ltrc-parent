package jo.gov.ltrc.permit.services.violation;


import io.swagger.annotations.ApiModelProperty;

public class ReturnViolationTypeDataRequest {

    @ApiModelProperty("Violation Type ID Parameter ") private Long violationtypeidparm ;
    @ApiModelProperty("Violation Type Name Parameter ") private String violationtypenameparm ;

    public Long getViolationtypeidparm() {
        return violationtypeidparm;
    }

    public void setViolationtypeidparm(Long violationtypeidparm) {
        this.violationtypeidparm = violationtypeidparm;
    }

    public String getViolationtypenameparm() {
        return violationtypenameparm;
    }

    public void setViolationtypenameparm(String violationtypenameparm) {
        this.violationtypenameparm = violationtypenameparm;
    }

    @Override
    public String toString() {
        return "ReturnViolationTypeDataRequest{" +
                "violationtypeidparm=" + violationtypeidparm +
                ", violationtypenameparm=" + violationtypenameparm +
                '}';
    }
}
