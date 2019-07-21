package jo.gov.ltrc.permit.services.permit;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQuery(
        name = "ReturnPermitTypeField",
        procedureName = "\"ReturnPermitTypeField\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
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
    @ApiModelProperty("Permit Field ID ") private long permitfieldid ;
    @ApiModelProperty("Permit Field Name ") private String permitfieldname ;
    @ApiModelProperty("Permit Field Section ") private int permitfieldsection ;
    @ApiModelProperty("Permit Field Section Name ") private String permitfieldsectionname ;

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

    public String getPermitfieldsectionname() {
        return permitfieldsectionname;
    }

    public void setPermitfieldsectionname(String permitfieldsectionname) {
        this.permitfieldsectionname = permitfieldsectionname;
    }
}
