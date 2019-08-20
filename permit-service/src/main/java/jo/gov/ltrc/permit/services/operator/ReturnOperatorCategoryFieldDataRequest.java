package jo.gov.ltrc.permit.services.operator;


import io.swagger.annotations.ApiModelProperty;

public class ReturnOperatorCategoryFieldDataRequest {

    @ApiModelProperty("Operator Field ID Parameter ") private Long operatorfieldidparm ;
    @ApiModelProperty("Operator Field Name Parameter ") private String operatorfieldnameparm ;
    @ApiModelProperty("Operator Field Section Parameter ") private Integer operatorfieldsectionparm ;

    public Long getOperatorfieldidparm() {
        return operatorfieldidparm;
    }

    public void setOperatorfieldidparm(Long operatorfieldidparm) {
        this.operatorfieldidparm = operatorfieldidparm;
    }

    public String getOperatorfieldnameparm() {
        return operatorfieldnameparm;
    }

    public void setOperatorfieldnameparm(String operatorfieldnameparm) {
        this.operatorfieldnameparm = operatorfieldnameparm;
    }

    public Integer getOperatorfieldsectionparm() {
        return operatorfieldsectionparm;
    }

    public void setOperatorfieldsectionparm(Integer operatorfieldsectionparm) {
        this.operatorfieldsectionparm = operatorfieldsectionparm;
    }

    @Override
    public String toString() {
        return "ReturnOperatorCategoryFieldDataRequest{" +
                "operatorfieldidparm=" + operatorfieldidparm +
                ", operatorfieldnameparm=" + operatorfieldnameparm +
                ", operatorfieldsectionparm=" + operatorfieldsectionparm +
                '}';
    }
}
