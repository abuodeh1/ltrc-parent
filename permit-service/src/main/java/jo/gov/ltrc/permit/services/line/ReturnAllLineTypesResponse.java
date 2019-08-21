package jo.gov.ltrc.permit.services.line;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQuery(
        name = "ReturnAllLineType",
        procedureName = "\"ReturnAllLineType\"",
        parameters = {

        },
        resultSetMappings = {
                "ReturnAllLineTypeSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnAllLineTypeSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnAllLineTypesResponse.class)
                }
        )
})



@Entity
public class ReturnAllLineTypesResponse implements Serializable {

    @Id
    @ApiModelProperty("Line Type ID ") private Long linetypeid ;
    @ApiModelProperty("Line Type Name ") private String linetypename ;

    public Long getLinetypeid() {
        return linetypeid;
    }

    public void setLinetypeid(Long linetypeid) {
        this.linetypeid = linetypeid;
    }

    public String getLinetypename() {
        return linetypename;
    }

    public void setLinetypename(String linetypename) {
        this.linetypename = linetypename;
    }

    @Override
    public String toString() {
        return "ReturnAllLineTypesResponse{" +
                "linetypeid=" + linetypeid +
                ", linetypename=" + linetypename +
                '}';
    }
}
