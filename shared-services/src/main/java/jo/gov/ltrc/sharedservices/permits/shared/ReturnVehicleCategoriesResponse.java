package jo.gov.ltrc.sharedservices.permits.shared;

import javax.persistence.*;
import java.io.Serializable;

@NamedStoredProcedureQuery(
        name = "ReturnAllVehicleCategories",
        procedureName = "\"ReturnAllVehicleCategories\"",
        parameters = {

        },
        resultSetMappings = {
                "ReturnAllVehicleCategories"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnAllVehicleCategories",
                entities = {
                        @EntityResult(entityClass = ReturnVehicleCategoriesResponse.class)
                }
        )
})
@Entity
public class ReturnVehicleCategoriesResponse implements Serializable {

    @Id
    private long vehiclecategoryid ;
    private String vehiclecategoryname ;

    public long getVehiclecategoryid() {
        return vehiclecategoryid;
    }

    public void setVehiclecategoryid(long vehiclecategoryid) {
        this.vehiclecategoryid = vehiclecategoryid;
    }

    public String getVehiclecategoryname() {
        return vehiclecategoryname;
    }

    public void setVehiclecategoryname(String vehiclecategoryname) {
        this.vehiclecategoryname = vehiclecategoryname;
    }
}
