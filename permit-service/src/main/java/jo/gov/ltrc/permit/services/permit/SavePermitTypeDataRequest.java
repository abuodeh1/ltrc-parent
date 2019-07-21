package com.etech.ltrc.permits.permit;


import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class SavePermitTypeDataRequest {

    @ApiModelProperty("Permit Type ID Parameter") private long permittypeidparm ;
    @ApiModelProperty("Permit Type Name Parameter") private String permittypenameparm ;
    @ApiModelProperty("Permit Type English Name Parameter") private String permittypeenglishnameparm ;
    @ApiModelProperty("Principal Parameter ") private long princepel ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;
    private List<SavePermitTypeFieldSettingDataRequest> field ;

    public long getPermittypeidparm() {
        return permittypeidparm;
    }

    public void setPermittypeidparm(long permittypeidparm) {
        this.permittypeidparm = permittypeidparm;
    }

    public String getPermittypenameparm() {
        return permittypenameparm;
    }

    public void setPermittypenameparm(String permittypenameparm) {
        this.permittypenameparm = permittypenameparm;
    }

    public String getPermittypeenglishnameparm() {
        return permittypeenglishnameparm;
    }

    public void setPermittypeenglishnameparm(String permittypeenglishnameparm) {
        this.permittypeenglishnameparm = permittypeenglishnameparm;
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

    public List<SavePermitTypeFieldSettingDataRequest> getField() {
        return field;
    }

    public void setField(List<SavePermitTypeFieldSettingDataRequest> field) {
        this.field = field;
    }
}