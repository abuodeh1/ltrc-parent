package jo.gov.ltrc.permit.services.permit;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQuery(
        name = "ReturnPermitType",
        procedureName = "\"ReturnPermitType\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "permittypeidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "permittypenameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "permittypeenglishnameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "pagesize"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "pageindex"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "sorttype"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "sortby"),

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
    @ApiModelProperty("Permit Type ID ") private Long permittypeid ;
    @ApiModelProperty("Permit Type Name ") private String permittypename ;
    @ApiModelProperty("Permit Type English Name ") private String permittypeenglishname ;

    public Long getPermittypeid() {
        return permittypeid;
    }

    public void setPermittypeid(Long permittypeid) {
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

    @Override
    public String toString() {
        return "ReturnPermitTypeResponse{" +
                "permittypeid=" + permittypeid +
                ", permittypename=" + permittypename +
                ", permittypeenglishname=" + permittypeenglishname +
                '}';
    }
}
