package jo.gov.ltrc.permit.services.permit;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQuery(
        name = "ReturnPermitType",
        procedureName = "\"ReturnPermitType\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),

        },
        resultSetMappings = {
                "ReturnPermitTypeSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnPermitTypeSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnPermitTypeResponse.class)
                }
        )
})
@Entity
public class ReturnPermitTypeResponse implements Serializable {

    @Id
    @ApiModelProperty("Permit Type ID ") private long permittypeid ;
    @ApiModelProperty("Permit Type Name ") private String permittypename ;
    @ApiModelProperty("Permit Type English Name ") private String permittypeenglishname ;

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
}
