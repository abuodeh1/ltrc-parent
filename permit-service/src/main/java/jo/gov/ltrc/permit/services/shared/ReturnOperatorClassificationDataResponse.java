package jo.gov.ltrc.permit.services.shared;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

@NamedStoredProcedureQuery(
        name = "ReturnOperatorClassification",
        procedureName = "\"ReturnOperatorClassification\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatorclassificationidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class , name = "operatorclassificationnameparm"),
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
    @ApiModelProperty("Operator Classification ID ") private Long operatorclassificationid   ;
    @ApiModelProperty("Operator Classification Name ") private String operatorclassificationname ;

    public Long getOperatorclassificationid() {
        return operatorclassificationid;
    }

    public void setOperatorclassificationid(Long operatorclassificationid) {
        this.operatorclassificationid = operatorclassificationid;
    }

    public String getOperatorclassificationname() {
        return operatorclassificationname;
    }

    public void setOperatorclassificationname(String operatorclassificationname) {
        this.operatorclassificationname = operatorclassificationname;
    }

    @Override
    public String toString() {
        return "ReturnOperatorClassificationDataResponse{" +
                "operatorclassificationid=" + operatorclassificationid +
                ", operatorclassificationname=" + operatorclassificationname +
                '}';
    }
}
