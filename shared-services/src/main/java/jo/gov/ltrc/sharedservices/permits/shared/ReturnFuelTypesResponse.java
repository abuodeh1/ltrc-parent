package jo.gov.ltrc.sharedservices.permits.shared;

import javax.persistence.*;
import java.io.Serializable;

@NamedStoredProcedureQuery(
        name = "ReturnAllFuelTypes",
        procedureName = "\"ReturnAllFuelTypes\"",
        parameters = {

        },
        resultSetMappings = {
                "ReturnAllFuelTypes"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnAllFuelTypes",
                entities = {
                        @EntityResult(entityClass = ReturnFuelTypesResponse.class)
                }
        )
})
@Entity
public class ReturnFuelTypesResponse implements Serializable {

    @Id
    private long fueltypeid ;
    private String fueltypename ;

    public long getFueltypeid() {
        return fueltypeid;
    }

    public void setFueltypeid(long fueltypeid) {
        this.fueltypeid = fueltypeid;
    }

    public String getFueltypename() {
        return fueltypename;
    }

    public void setFueltypename(String fueltypename) {
        this.fueltypename = fueltypename;
    }
}
