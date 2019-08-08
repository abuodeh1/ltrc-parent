package jo.gov.ltrc.permit.services.permit;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQuery(
        name = "ReturnPermitTypeFieldSetting",
        procedureName = "\"ReturnPermitTypeFieldSetting\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
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
    @ApiModelProperty("Permit Type Field Setting ID ") private long permittypefieldsettingid ;
    @ApiModelProperty("Permit Type ") private long permittype ;
    @ApiModelProperty("Permit Field ") private long permitfieldid;
    @ApiModelProperty("Permit Field Name ") private String permitfieldname ;
    @ApiModelProperty("Permit Field Section ") private int permitfieldsection ;
    @ApiModelProperty("Required ") private int required ;
    @ApiModelProperty("Visible ") private int visible ;
    @ApiModelProperty("Active ") private int active ;

    public long getPermittypefieldsettingid() {
        return permittypefieldsettingid;
    }

    public void setPermittypefieldsettingid(long permittypefieldsettingid) {
        this.permittypefieldsettingid = permittypefieldsettingid;
    }

    public long getPermittype() {
        return permittype;
    }

    public void setPermittype(long permittype) {
        this.permittype = permittype;
    }

    public long getPermitfieldid() {
        return permitfieldid;
    }

    public void setPermitfieldid(long permitfieldid) {
        this.permitfieldid = permitfieldid;
    }

    public String getPermitfieldname() {
        return permitfieldname;
    }

    public void setPermitfieldname(String permitfieldname) {
        this.permitfieldname = permitfieldname;
    }

    public int getPermitfieldsection() {
        return permitfieldsection;
    }

    public void setPermitfieldsection(int permitfieldsection) {
        this.permitfieldsection = permitfieldsection;
    }

    public int getRequired() {
        return required;
    }

    public void setRequired(int required) {
        this.required = required;
    }

    public int getVisible() {
        return visible;
    }

    public void setVisible(int visible) {
        this.visible = visible;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }
}
