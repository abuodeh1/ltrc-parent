package jo.gov.ltrc.permit.services.shared;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

@NamedStoredProcedureQuery(
        name = "ReturnOperatorScreenSection",
        procedureName = "\"ReturnOperatorScreenSection\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "operatorfieldsectionparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "sectionnameparm"),
                
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
    @ApiModelProperty("Operator Field Section ") private Integer operatorfieldsection ;
    @ApiModelProperty("Section Name ") private String sectionname ;

    public Integer getOperatorfieldsection() {
        return operatorfieldsection;
    }

    public void setOperatorfieldsection(Integer operatorfieldsection) {
        this.operatorfieldsection = operatorfieldsection;
    }

    public String getSectionname() {
        return sectionname;
    }

    public void setSectionname(String sectionname) {
        this.sectionname = sectionname;
    }

    @Override
    public String toString() {
        return "ReturnOperatorScreenSectionResponse{" +
                "operatorfieldsection=" + operatorfieldsection +
                ", sectionname=" + sectionname +
                '}';
    }
}
