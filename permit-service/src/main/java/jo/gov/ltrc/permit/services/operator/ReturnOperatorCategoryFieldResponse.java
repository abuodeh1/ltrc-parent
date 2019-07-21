package com.etech.ltrc.permits.operator;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQuery(
        name = "ReturnOperatorCategoryField",
        procedureName = "\"ReturnOperatorCategoryField\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),

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
    @ApiModelProperty("Operator Field ID ") private long operatorfieldid ;
    @ApiModelProperty("Operator Field Name ") private String operatorfieldname ;
    @ApiModelProperty("Operator Field Section ") private int operatorfieldsection ;

    public long getOperatorfieldid() {
        return operatorfieldid;
    }

    public void setOperatorfieldid(long operatorfieldid) {
        this.operatorfieldid = operatorfieldid;
    }

    public String getOperatorfieldname() {
        return operatorfieldname;
    }

    public void setOperatorfieldname(String operatorfieldname) {
        this.operatorfieldname = operatorfieldname;
    }

    public int getOperatorfieldsection() {
        return operatorfieldsection;
    }

    public void setOperatorfieldsection(int operatorfieldsection) {
        this.operatorfieldsection = operatorfieldsection;
    }
}
