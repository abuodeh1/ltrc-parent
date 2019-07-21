package jo.gov.ltrc.permit.services.operator;


import io.swagger.annotations.ApiModelProperty;

public class ReturnOperatorCategoryFieldDataRequest {

    @ApiModelProperty("Operator Field ID Parameter ") private long operatorfieldidparm ;
    @ApiModelProperty("Operator Field Name Parameter ") private String operatorfieldnameparm ;
    @ApiModelProperty("Operator Field Section Parameter ") private int operatorfieldsectionparm ;

    public long getOperatorfieldidparm() {
        return operatorfieldidparm;
    }

    public void setOperatorfieldidparm(long operatorfieldidparm) {
        this.operatorfieldidparm = operatorfieldidparm;
    }

    public String getOperatorfieldnameparm() {
        return operatorfieldnameparm;
    }

    public void setOperatorfieldnameparm(String operatorfieldnameparm) {
        this.operatorfieldnameparm = operatorfieldnameparm;
    }

    public int getOperatorfieldsectionparm() {
        return operatorfieldsectionparm;
    }

    public void setOperatorfieldsectionparm(int operatorfieldsectionparm) {
        this.operatorfieldsectionparm = operatorfieldsectionparm;
    }
}
