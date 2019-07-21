package jo.gov.ltrc.permit.services.operator;


import io.swagger.annotations.ApiModelProperty;

public class ReturnOperatorCategoryFieldSettingDataRequest {

    @ApiModelProperty("Operator Category Field Setting ID Parameter ") private long operatorcategroryfieldsettingidparm ;
    @ApiModelProperty("Operator Category ID Parameter ") private long operatorcategoryidparm ;
    @ApiModelProperty("Operator Category Name Parameter ") private String operatorcategorynameparm ;
    @ApiModelProperty("Operator  Field Parameter ") private long operatorfieldparm ;
    @ApiModelProperty("Operator  Filed Name Parameter ") private String operatorfieldnameparm ;
    @ApiModelProperty("Operator  Field Section Parameter ") private int operatorfieldsectionparm ;
    @ApiModelProperty("Required Parameter ") private int requiredparm ;
    @ApiModelProperty("Visible Parameter ") private int visibleparm ;
    @ApiModelProperty("Active Parameter ") private int activeparm ;

    public long getOperatorcategroryfieldsettingidparm() {
        return operatorcategroryfieldsettingidparm;
    }

    public void setOperatorcategroryfieldsettingidparm(long operatorcategroryfieldsettingidparm) {
        this.operatorcategroryfieldsettingidparm = operatorcategroryfieldsettingidparm;
    }

    public long getOperatorcategoryidparm() {
        return operatorcategoryidparm;
    }

    public void setOperatorcategoryidparm(long operatorcategoryidparm) {
        this.operatorcategoryidparm = operatorcategoryidparm;
    }

    public String getOperatorcategorynameparm() {
        return operatorcategorynameparm;
    }

    public void setOperatorcategorynameparm(String operatorcategorynameparm) {
        this.operatorcategorynameparm = operatorcategorynameparm;
    }

    public long getOperatorfieldparm() {
        return operatorfieldparm;
    }

    public void setOperatorfieldparm(long operatorfieldparm) {
        this.operatorfieldparm = operatorfieldparm;
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

    public int getRequiredparm() {
        return requiredparm;
    }

    public void setRequiredparm(int requiredparm) {
        this.requiredparm = requiredparm;
    }

    public int getVisibleparm() {
        return visibleparm;
    }

    public void setVisibleparm(int visibleparm) {
        this.visibleparm = visibleparm;
    }

    public int getActiveparm() {
        return activeparm;
    }

    public void setActiveparm(int activeparm) {
        this.activeparm = activeparm;
    }
}
