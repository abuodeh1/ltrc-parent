package jo.gov.ltrc.permit.services.violation;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQuery(
        name = "ReturnViolationPenalty",
        procedureName = "\"ReturnViolationPenalty\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),

        },
        resultSetMappings = {
                "ReturnViolationPenaltySetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnViolationPenaltySetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnViolationPenaltyResponse.class)
                }
        )
})
@Entity
public class ReturnViolationPenaltyResponse implements Serializable {

    @Id
    @ApiModelProperty("Violation Type ID ") private long violationpenaltyid;
    @ApiModelProperty("Violation Type Name ") private String violationpenaltyname;

    public long getViolationpenaltyid() {
        return violationpenaltyid;
    }

    public void setViolationpenaltyid(long violationpenaltyid) {
        this.violationpenaltyid = violationpenaltyid;
    }

    public String getViolationpenaltyname() {
        return violationpenaltyname;
    }

    public void setViolationpenaltyname(String violationpenaltyname) {
        this.violationpenaltyname = violationpenaltyname;
    }
}
