package com.etech.ltrc.permits.permit;


import io.swagger.annotations.ApiModelProperty;

public class ReturnPermitTypeFieldSettingDataRequest {

    @ApiModelProperty("Permit Type Field Setting ID Parameter ") private long permittypefieldsettingidparm ;
    @ApiModelProperty("Permit Type Parameter ") private long permittypeparm ;
    @ApiModelProperty("Permit Field Parameter ") private long permitfieldparm ;
    @ApiModelProperty("Required Parameter ") private int requiredparm ;
    @ApiModelProperty("Visible Parameter ") private int visibleparm ;
    @ApiModelProperty("Active Parameter ") private int activeparm ;

    public long getPermittypefieldsettingidparm() {
        return permittypefieldsettingidparm;
    }

    public void setPermittypefieldsettingidparm(long permittypefieldsettingidparm) {
        this.permittypefieldsettingidparm = permittypefieldsettingidparm;
    }

    public long getPermittypeparm() {
        return permittypeparm;
    }

    public void setPermittypeparm(long permittypeparm) {
        this.permittypeparm = permittypeparm;
    }

    public long getPermitfieldparm() {
        return permitfieldparm;
    }

    public void setPermitfieldparm(long permitfieldparm) {
        this.permitfieldparm = permitfieldparm;
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