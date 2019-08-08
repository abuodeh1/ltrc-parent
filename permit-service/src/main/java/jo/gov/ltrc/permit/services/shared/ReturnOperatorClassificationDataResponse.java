package jo.gov.ltrc.permit.services.shared;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

@NamedStoredProcedureQuery(
        name = "ReturnOperatorClassification",
        procedureName = "\"ReturnOperatorClassification\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
        },
        resultSetMappings = {
                "ReturnOperatorClassificationDataSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnOperatorClassificationDataSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnOperatorClassificationDataResponse.class)
                }
        )
})
@Entity
public class ReturnOperatorClassificationDataResponse implements Serializable {

    @Id
    @ApiModelProperty("Operator Classification ID ") private long operatorclassificationid   ;
    @ApiModelProperty("Operator Classification Name ") private String operatorclassificationname ;

    public long getOperatorclassificationid() {
        return operatorclassificationid;
    }

    public void setOperatorclassificationid(long operatorclassificationid) {
        this.operatorclassificationid = operatorclassificationid;
    }

    public String getOperatorclassificationname() {
        return operatorclassificationname;
    }

    public void setOperatorclassificationname(String operatorclassificationname) {
        this.operatorclassificationname = operatorclassificationname;
    }
}
