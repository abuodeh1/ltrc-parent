package jo.gov.ltrc.permit.services.permit;


import io.swagger.annotations.ApiModelProperty;

public class SavePermitTypeFieldSettingDataRequest {

    @ApiModelProperty("Permit Type Field Setting ID Parameter ") private Long permittypefieldsettingidparm ;
    @ApiModelProperty("Permit Type Parameter ") private Long permittypeparm ;
    @ApiModelProperty("Permit Field Parameter ") private Long permitfieldparm ;
    @ApiModelProperty("Required Parameter ") private Integer requiredparm ;
    @ApiModelProperty("Visible Parameter ") private Integer visibleparm ;
    @ApiModelProperty("Active Parameter ") private Integer activeparm ;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;

    public Long getPermittypefieldsettingidparm() {
        return permittypefieldsettingidparm;
    }

    public void setPermittypefieldsettingidparm(Long permittypefieldsettingidparm) {
        this.permittypefieldsettingidparm = permittypefieldsettingidparm;
    }

    public Long getPermittypeparm() {
        return permittypeparm;
    }

    public void setPermittypeparm(Long permittypeparm) {
        this.permittypeparm = permittypeparm;
    }

    public Long getPermitfieldparm() {
        return permitfieldparm;
    }

    public void setPermitfieldparm(Long permitfieldparm) {
        this.permitfieldparm = permitfieldparm;
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
        return "SavePermitTypeFieldSettingDataRequest{" +
                "permittypefieldsettingidparm=" + permittypefieldsettingidparm +
                ", permittypeparm=" + permittypeparm +
                ", permitfieldparm=" + permitfieldparm +
                ", requiredparm=" + requiredparm +
                ", visibleparm=" + visibleparm +
                ", activeparm=" + activeparm +
                ", princepel=" + princepel +
                ", statusparm=" + statusparm +
                '}';
    }
}