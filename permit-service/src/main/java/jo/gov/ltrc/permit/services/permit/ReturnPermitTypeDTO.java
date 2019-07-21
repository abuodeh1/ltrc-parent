package jo.gov.ltrc.permit.services.permit;


import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class ReturnPermitTypeDTO {

    @ApiModelProperty("Permit Type ID Parameter ") private long permittypeid;
    @ApiModelProperty("Permit Type Name Parameter ") private String permittypename;
    @ApiModelProperty("Permit Type English Name  Parameter ") private String permittypeenglishname;
    private List<ReturnPermitTypeFieldSettingResponse> field ;

    public long getPermittypeid() {
        return permittypeid;
    }

    public void setPermittypeid(long permittypeid) {
        this.permittypeid = permittypeid;
    }

    public String getPermittypename() {
        return permittypename;
    }

    public void setPermittypename(String permittypename) {
        this.permittypename = permittypename;
    }

    public String getPermittypeenglishname() {
        return permittypeenglishname;
    }

    public void setPermittypeenglishname(String permittypeenglishname) {
        this.permittypeenglishname = permittypeenglishname;
    }

    public List<ReturnPermitTypeFieldSettingResponse> getField() {
        return field;
    }

    public void setField(List<ReturnPermitTypeFieldSettingResponse> field) {
        this.field = field;
    }
}