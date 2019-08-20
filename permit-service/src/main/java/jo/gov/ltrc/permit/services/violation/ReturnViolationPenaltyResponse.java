package jo.gov.ltrc.permit.services.violation;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQuery(
        name = "ReturnViolationPenalty",
        procedureName = "\"ReturnViolationPenalty\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "violationpenaltyidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "violationpenaltynameparm"),

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
    @ApiModelProperty("Violation Type ID ") private Long violationpenaltyid;
    @ApiModelProperty("Violation Type Name ") private String violationpenaltyname;

    public Long getViolationpenaltyid() {
        return violationpenaltyid;
    }

    public void setViolationpenaltyid(Long violationpenaltyid) {
        this.violationpenaltyid = violationpenaltyid;
    }

    public String getViolationpenaltyname() {
        return violationpenaltyname;
    }

    public void setViolationpenaltyname(String violationpenaltyname) {
        this.violationpenaltyname = violationpenaltyname;
    }

    @Override
    public String toString() {
        return "ReturnViolationPenaltyResponse{" +
                "violationpenaltyid=" + violationpenaltyid +
                ", violationpenaltyname=" + violationpenaltyname +
                '}';
    }
}
