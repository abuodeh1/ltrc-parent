package jo.gov.ltrc.permit.services.operator;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQuery(
        name = "ReturnOperatorCategoryField",
        procedureName = "\"ReturnOperatorCategoryField\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatorfieldidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "operatorfieldnameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "operatorfieldsectionparm"),

        },
        resultSetMappings = {
                "ReturnOperatorCategoryFieldSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnOperatorCategoryFieldSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnOperatorCategoryFieldResponse.class)
                }
        )
})
@Entity
public class ReturnOperatorCategoryFieldResponse implements Serializable {

    @Id
    @ApiModelProperty("Operator Field ID ") private Long operatorfieldid ;
    @ApiModelProperty("Operator Field Name ") private String operatorfieldname ;
    @ApiModelProperty("Operator Field Section ") private Integer operatorfieldsection ;

    public Long getOperatorfieldid() {
        return operatorfieldid;
    }

    public void setOperatorfieldid(Long operatorfieldid) {
        this.operatorfieldid = operatorfieldid;
    }

    public String getOperatorfieldname() {
        return operatorfieldname;
    }

    public void setOperatorfieldname(String operatorfieldname) {
        this.operatorfieldname = operatorfieldname;
    }

    public Integer getOperatorfieldsection() {
        return operatorfieldsection;
    }

    public void setOperatorfieldsection(Integer operatorfieldsection) {
        this.operatorfieldsection = operatorfieldsection;
    }

    @Override
    public String toString() {
        return "ReturnOperatorCategoryFieldResponse{" +
                "operatorfieldid=" + operatorfieldid +
                ", operatorfieldname=" + operatorfieldname +
                ", operatorfieldsection=" + operatorfieldsection +
                '}';
    }
}
