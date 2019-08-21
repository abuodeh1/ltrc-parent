package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class ReturnOperatorClassificationDataRequest {

    @ApiModelProperty("Operator Classification ID Parameter") private Long operatorclassificationidparm ;
    @ApiModelProperty("Operator Classification Name Parameter") private String operatorclassificationnameparm ;

    public Long getOperatorclassificationidparm() {
        return operatorclassificationidparm;
    }

    public void setOperatorclassificationidparm(Long operatorclassificationidparm) {
        this.operatorclassificationidparm = operatorclassificationidparm;
    }

    public String getOperatorclassificationnameparm() {
        return operatorclassificationnameparm;
    }

    public void setOperatorclassificationnameparm(String operatorclassificationnameparm) {
        this.operatorclassificationnameparm = operatorclassificationnameparm;
    }

    @Override
    public String toString() {
        return "ReturnOperatorClassificationDataRequest{" +
                "operatorclassificationidparm=" + operatorclassificationidparm +
                ", operatorclassificationnameparm=" + operatorclassificationnameparm +
                '}';
    }
}



