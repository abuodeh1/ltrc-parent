package jo.gov.ltrc.permit.services.operator;


import io.swagger.annotations.ApiModelProperty;

public class ReturnOperatorCategoryFieldSettingDataRequest {

    @ApiModelProperty("Operator Category Field Setting ID Parameter ") private Long operatorcategroryfieldsettingidparm ;
    @ApiModelProperty("Operator Category ID Parameter ") private Long operatorcategoryidparm ;
    @ApiModelProperty("Operator Category Name Parameter ") private String operatorcategorynameparm ;
    @ApiModelProperty("Operator  Field Parameter ") private Long operatorfieldparm ;
    @ApiModelProperty("Operator  Filed Name Parameter ") private String operatorfieldnameparm ;
    @ApiModelProperty("Operator  Field Section Parameter ") private Integer operatorfieldsectionparm ;
    @ApiModelProperty("Required Parameter ") private Integer requiredparm ;
    @ApiModelProperty("Visible Parameter ") private Integer visibleparm ;
    @ApiModelProperty("Active Parameter ") private Integer activeparm ;

    public Long getOperatorcategroryfieldsettingidparm() {
        return operatorcategroryfieldsettingidparm;
    }

    public void setOperatorcategroryfieldsettingidparm(Long operatorcategroryfieldsettingidparm) {
        this.operatorcategroryfieldsettingidparm = operatorcategroryfieldsettingidparm;
    }

    public Long getOperatorcategoryidparm() {
        return operatorcategoryidparm;
    }

    public void setOperatorcategoryidparm(Long operatorcategoryidparm) {
        this.operatorcategoryidparm = operatorcategoryidparm;
    }

    public String getOperatorcategorynameparm() {
        return operatorcategorynameparm;
    }

    public void setOperatorcategorynameparm(String operatorcategorynameparm) {
        this.operatorcategorynameparm = operatorcategorynameparm;
    }

    public Long getOperatorfieldparm() {
        return operatorfieldparm;
    }

    public void setOperatorfieldparm(Long operatorfieldparm) {
        this.operatorfieldparm = operatorfieldparm;
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

    public Integer getRequiredparm() {
        return requiredparm;
    }

    public void setRequiredparm(Integer requiredparm) {
        this.requiredparm = requiredparm;
    }

    public Integer getVisibleparm() {
        return visibleparm;
    }

    public void setVisibleparm(Integer visibleparm) {
        this.visibleparm = visibleparm;
    }

    public Integer getActiveparm() {
        return activeparm;
    }

    public void setActiveparm(Integer activeparm) {
        this.activeparm = activeparm;
    }
}
