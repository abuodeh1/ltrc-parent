package jo.gov.ltrc.permit.services.permit;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQuery(
        name = "ReturnPermitTypeFieldSetting",
        procedureName = "\"ReturnPermitTypeFieldSetting\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "permittypefieldsettingidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "permittypeparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "permitfieldparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "requiredparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "visibleparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "activeparm"),
        },
        resultSetMappings = {
                "ReturnPermitTypeFieldSettingSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnPermitTypeFieldSettingSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnPermitTypeFieldSettingResponse.class)
                }
        )
})
@Entity
public class ReturnPermitTypeFieldSettingResponse implements Serializable {

    @Id
    @ApiModelProperty("Permit Type Field Setting ID ") private Long permittypefieldsettingid ;
    @ApiModelProperty("Permit Type ") private Long permittype ;
    @ApiModelProperty("Permit Field ") private Long permitfieldid;
    @ApiModelProperty("Permit Field Name ") private String permitfieldname ;
    @ApiModelProperty("Permit Field Section ") private Integer permitfieldsection ;
    @ApiModelProperty("Required ") private Integer required ;
    @ApiModelProperty("Visible ") private Integer visible ;
    @ApiModelProperty("Active ") private Integer active ;

    public Long getPermittypefieldsettingid() {
        return permittypefieldsettingid;
    }

    public void setPermittypefieldsettingid(Long permittypefieldsettingid) {
        this.permittypefieldsettingid = permittypefieldsettingid;
    }

    public Long getPermittype() {
        return permittype;
    }

    public void setPermittype(Long permittype) {
        this.permittype = permittype;
    }

    public Long getPermitfieldid() {
        return permitfieldid;
    }

    public void setPermitfieldid(Long permitfieldid) {
        this.permitfieldid = permitfieldid;
    }

    public String getPermitfieldname() {
        return permitfieldname;
    }

    public void setPermitfieldname(String permitfieldname) {
        this.permitfieldname = permitfieldname;
    }

    public Integer getPermitfieldsection() {
        return permitfieldsection;
    }

    public void setPermitfieldsection(Integer permitfieldsection) {
        this.permitfieldsection = permitfieldsection;
    }

    public Integer getRequired() {
        return required;
    }

    public void setRequired(Integer required) {
        this.required = required;
    }

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "ReturnPermitTypeFieldSettingResponse{" +
                "permittypefieldsettingid=" + permittypefieldsettingid +
                ", permittype=" + permittype +
                ", permitfieldid=" + permitfieldid +
                ", permitfieldname=" + permitfieldname +
                ", permitfieldsection=" + permitfieldsection +
                ", required=" + required +
                ", visible=" + visible +
                ", active=" + active +
                '}';
    }
}
