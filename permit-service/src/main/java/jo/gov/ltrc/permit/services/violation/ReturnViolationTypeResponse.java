package com.etech.ltrc.permits.violation;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQuery(
        name = "ReturnViolationType",
        procedureName = "\"ReturnViolationType\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),

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
    @ApiModelProperty("Violation Type ID ") private long violationtypeid ;
    @ApiModelProperty("Violation Type Name ") private String violationtypename ;

    public long getViolationtypeid() {
        return violationtypeid;
    }

    public void setViolationtypeid(long violationtypeid) {
        this.violationtypeid = violationtypeid;
    }

    public String getViolationtypename() {
        return violationtypename;
    }

    public void setViolationtypename(String violationtypename) {
        this.violationtypename = violationtypename;
    }
}
