package jo.gov.ltrc.permit.services.violation;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQuery(
        name = "ReturnViolationType",
        procedureName = "\"ReturnViolationType\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "violationtypeidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "violationtypenameparm"),

        },
        resultSetMappings = {
                "ReturnViolationTypeSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnViolationTypeSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnViolationTypeResponse.class)
                }
        )
})
@Entity
public class ReturnViolationTypeResponse implements Serializable {

    @Id
    @ApiModelProperty("Violation Type ID ") private Long violationtypeid ;
    @ApiModelProperty("Violation Type Name ") private String violationtypename ;

    public Long getViolationtypeid() {
        return violationtypeid;
    }

    public void setViolationtypeid(Long violationtypeid) {
        this.violationtypeid = violationtypeid;
    }

    public String getViolationtypename() {
        return violationtypename;
    }

    public void setViolationtypename(String violationtypename) {
        this.violationtypename = violationtypename;
    }

    @Override
    public String toString() {
        return "ReturnViolationTypeResponse{" +
                "violationtypeid=" + violationtypeid +
                ", violationtypename=" + violationtypename +
                '}';
    }
}
