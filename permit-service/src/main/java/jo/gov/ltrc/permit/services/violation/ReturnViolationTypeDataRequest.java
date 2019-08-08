package jo.gov.ltrc.permit.services.violation;


import io.swagger.annotations.ApiModelProperty;

public class ReturnViolationTypeDataRequest {

    @ApiModelProperty("Violation Type ID Parameter ") private long violationtypeidparm ;
    @ApiModelProperty("Violation Type Name Parameter ") private String violationtypenameparm ;

    public long getViolationtypeidparm() {
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
}
