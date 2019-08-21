package jo.gov.ltrc.permit.services.permit;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQuery(
        name = "ReturnPermitWorkingAs",
        procedureName = "\"ReturnPermitWorkingAs\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "permitworkingasidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "permitworkingasnameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "pagesize"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "pageindex"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "sorttype"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "sortby"),

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
    @ApiModelProperty("Permit Working As ID ") private Long permitworkingasid ;
    @ApiModelProperty("Permit Working As Name ") private String permitworkingasname ;

    public Long getPermitworkingasid() {
        return permitworkingasid;
    }

    public void setPermitworkingasid(Long permitworkingasid) {
        this.permitworkingasid = permitworkingasid;
    }

    public String getPermitworkingasname() {
        return permitworkingasname;
    }

    public void setPermitworkingasname(String permitworkingasname) {
        this.permitworkingasname = permitworkingasname;
    }

    @Override
    public String toString() {
        return "ReturnPermitWorkingAsResponse{" +
                "permitworkingasid=" + permitworkingasid +
                ", permitworkingasname=" + permitworkingasname +
                '}';
    }
}
