package com.etech.ltrc.permits.operator;


import io.swagger.annotations.ApiModelProperty;

public class SaveOperatorCategoryFieldSettingDataRequest {

    @ApiModelProperty("Operator Category Field Setting ID Parameter ") private long operatorcategroryfieldsettingidparm ;
    @ApiModelProperty("Operator Category ID Parameter ") private long operatorcategoryidparm ;
    @ApiModelProperty("Operator Field Parameter ") private long operatorfieldparm ;
    @ApiModelProperty("Required Parameter ") private int requiredparm ;
    @ApiModelProperty("Visible Parameter ") private int visibleparm ;
    @ApiModelProperty("Active Parameter ") private int activeparm ;
    @ApiModelProperty("Principal Parameter ") private long princepel ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;

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

    public long getOperatorfieldparm() {
        return operatorfieldparm;
    }

    public void setOperatorfieldparm(long operatorfieldparm) {
        this.operatorfieldparm = operatorfieldparm;
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

    public long getPrincepel() {
        return princepel;
    }

    public void setPrincepel(long princepel) {
        this.princepel = princepel;
    }

    public int getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(int statusparm) {
        this.statusparm = statusparm;
    }
}
