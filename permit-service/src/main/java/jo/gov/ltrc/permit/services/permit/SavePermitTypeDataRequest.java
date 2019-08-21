package jo.gov.ltrc.permit.services.permit;


import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class SavePermitTypeDataRequest {

    @ApiModelProperty("Permit Type ID Parameter") private Long permittypeidparm ;
    @ApiModelProperty("Permit Type Name Parameter") private String permittypenameparm ;
    @ApiModelProperty("Permit Type English Name Parameter") private String permittypeenglishnameparm ;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;
    @ApiModelProperty("IP Address") private String ipaddressparm  ;
    private List<SavePermitTypeFieldSettingDataRequest> field ;

    public Long getPermittypeidparm() {
        return permittypeidparm;
    }

    public void setPermittypeidparm(Long permittypeidparm) {
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

    public String getIpaddressparm() {
        return ipaddressparm;
    }

    public void setIpaddressparm(String ipaddressparm) {
        this.ipaddressparm = ipaddressparm;
    }

    public List<SavePermitTypeFieldSettingDataRequest> getField() {
        return field;
    }

    public void setField(List<SavePermitTypeFieldSettingDataRequest> field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "SavePermitTypeDataRequest{" +
                "permittypeidparm=" + permittypeidparm +
                ", permittypenameparm=" + permittypenameparm +
                ", permittypeenglishnameparm=" + permittypeenglishnameparm +
                ", princepel=" + princepel +
                ", statusparm=" + statusparm +
                ", ipaddressparam=" + ipaddressparm +
                ", field=" + field +
                '}';
    }
}