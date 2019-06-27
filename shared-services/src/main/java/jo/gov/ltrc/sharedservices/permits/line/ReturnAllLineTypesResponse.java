package jo.gov.ltrc.sharedservices.permits.line;

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
    private long linetypeid ;
    private String linetypename ;

    public long getLinetypeid() {
        return linetypeid;
    }

    public void setLinetypeid(long linetypeid) {
        this.linetypeid = linetypeid;
    }

    public String getLinetypename() {
        return linetypename;
    }

    public void setLinetypename(String linetypename) {
        this.linetypename = linetypename;
    }
}
