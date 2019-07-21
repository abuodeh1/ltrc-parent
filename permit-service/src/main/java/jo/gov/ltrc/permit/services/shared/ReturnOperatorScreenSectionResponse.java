package com.etech.ltrc.permits.shared;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

@NamedStoredProcedureQuery(
        name = "ReturnOperatorScreenSection",
        procedureName = "\"ReturnOperatorScreenSection\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                
        },
        resultSetMappings = {
                "ReturnOperatorScreenSectionSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnOperatorScreenSectionSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnOperatorScreenSectionResponse.class)
                }
        )
})
@Entity
public class ReturnOperatorScreenSectionResponse implements Serializable {

    @Id
    @ApiModelProperty("Operator Field Section ") private int operatorfieldsection ;
    @ApiModelProperty("Section Name ") private String sectionname ;

    public int getOperatorfieldsection() {
        return operatorfieldsection;
    }

    public void setOperatorfieldsection(int operatorfieldsection) {
        this.operatorfieldsection = operatorfieldsection;
    }

    public String getSectionname() {
        return sectionname;
    }

    public void setSectionname(String sectionname) {
        this.sectionname = sectionname;
    }
}
