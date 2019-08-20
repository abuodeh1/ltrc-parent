package jo.gov.ltrc.permit.services.violation;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQuery(
        name = "ReturnViolationSubject",
        procedureName = "\"ReturnViolationSubject\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "violationsubjectidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "violationsubjectnameparm"),

        },
        resultSetMappings = {
                "ReturnViolationSubjectSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnViolationSubjectSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnViolationSubjectResponse.class)
                }
        )
})
@Entity
public class ReturnViolationSubjectResponse implements Serializable {

    @Id
    @ApiModelProperty("Violation Type ID ") private Long violationsubjectid;
    @ApiModelProperty("Violation Type Name ") private String violationsubjectname;

    public Long getViolationsubjectid() {
        return violationsubjectid;
    }

    public void setViolationsubjectid(Long violationsubjectid) {
        this.violationsubjectid = violationsubjectid;
    }

    public String getViolationsubjectname() {
        return violationsubjectname;
    }

    public void setViolationsubjectname(String violationsubjectname) {
        this.violationsubjectname = violationsubjectname;
    }

    @Override
    public String toString() {
        return "ReturnViolationSubjectResponse{" +
                "violationsubjectid=" + violationsubjectid +
                ", violationsubjectname=" + violationsubjectname +
                '}';
    }
}
