package jo.gov.ltrc.permit.services.shared;

import io.swagger.annotations.ApiModelProperty;

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
   @ApiModelProperty("Fuel Type ID ") private long fueltypeid ;
   @ApiModelProperty("Fuel Type Name ") private String fueltypename ;

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
