package jo.gov.ltrc.permit.services.permit;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQuery(
        name = "ReturnPermitWorkingAs",
        procedureName = "\"ReturnPermitWorkingAs\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),

        },
        resultSetMappings = {
                "ReturnPermitWorkingAsSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnPermitWorkingAsSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnPermitWorkingAsResponse.class)
                }
        )
})
@Entity
public class ReturnPermitWorkingAsResponse implements Serializable {

    @Id
    @ApiModelProperty("Permit Working As ID ") private long permitworkingasid ;
    @ApiModelProperty("Permit Working As Name ") private String permitworkingasname ;

    public long getPermitworkingasid() {
        return permitworkingasid;
    }

    public void setPermitworkingasid(long permitworkingasid) {
        this.permitworkingasid = permitworkingasid;
    }

    public String getPermitworkingasname() {
        return permitworkingasname;
    }

    public void setPermitworkingasname(String permitworkingasname) {
        this.permitworkingasname = permitworkingasname;
    }
}
