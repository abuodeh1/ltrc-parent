package jo.gov.ltrc.permit.services.permit;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQuery(
        name = "ReturnPermitTypeField",
        procedureName = "\"ReturnPermitTypeField\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "permitfieldidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "permitfieldnameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "permitfieldsectionparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "permitfieldsectionnameparm"),
        },
        resultSetMappings = {
                "ReturnPermitTypeFieldSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnPermitTypeFieldSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnPermitTypeFieldResponse.class)
                }
        )
})
@Entity
public class ReturnPermitTypeFieldResponse implements Serializable {

    @Id
    @ApiModelProperty("Permit Field ID ") private Long permitfieldid ;
    @ApiModelProperty("Permit Field Name ") private String permitfieldname ;
    @ApiModelProperty("Permit Field Section ") private Integer permitfieldsection ;
    @ApiModelProperty("Permit Field Section Name ") private String permitfieldsectionname ;

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

    public String getPermitfieldsectionname() {
        return permitfieldsectionname;
    }

    public void setPermitfieldsectionname(String permitfieldsectionname) {
        this.permitfieldsectionname = permitfieldsectionname;
    }

    @Override
    public String toString() {
        return "ReturnPermitTypeFieldResponse{" +
                "permitfieldid=" + permitfieldid +
                ", permitfieldname=" + permitfieldname +
                ", permitfieldsection=" + permitfieldsection +
                ", permitfieldsectionname=" + permitfieldsectionname +
                '}';
    }
}
