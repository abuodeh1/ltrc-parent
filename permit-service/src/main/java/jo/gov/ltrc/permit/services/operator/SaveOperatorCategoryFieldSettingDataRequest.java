package jo.gov.ltrc.permit.services.operator;


import io.swagger.annotations.ApiModelProperty;

public class SaveOperatorCategoryFieldSettingDataRequest {

    @ApiModelProperty("Operator Category Field Setting ID Parameter ") private Long operatorcategroryfieldsettingidparm ;
    @ApiModelProperty("Operator Category ID Parameter ") private Long operatorcategoryidparm ;
    @ApiModelProperty("Operator Field Parameter ") private Long operatorfieldparm ;
    @ApiModelProperty("Required Parameter ") private Integer requiredparm ;
    @ApiModelProperty("Visible Parameter ") private Integer visibleparm ;
    @ApiModelProperty("Active Parameter ") private Integer activeparm ;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;

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

    public Long getOperatorfieldparm() {
        return operatorfieldparm;
    }

    public void setOperatorfieldparm(Long operatorfieldparm) {
        this.operatorfieldparm = operatorfieldparm;
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

    public Long getPrincepel() {
        return princepel;
    }

    public void setPrincepel(Long princepel) {
        this.princepel = princepel;
    }

    public Integer getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(Integer statusparm) {
        this.statusparm = statusparm;
    }

    @Override
    public String toString() {
        return "SaveOperatorCategoryFieldSettingDataRequest{" +
                "operatorcategroryfieldsettingidparm=" + operatorcategroryfieldsettingidparm +
                ", operatorcategoryidparm=" + operatorcategoryidparm +
                ", operatorfieldparm=" + operatorfieldparm +
                ", requiredparm=" + requiredparm +
                ", visibleparm=" + visibleparm +
                ", activeparm=" + activeparm +
                ", princepel=" + princepel +
                ", statusparm=" + statusparm +
                '}';
    }
}
