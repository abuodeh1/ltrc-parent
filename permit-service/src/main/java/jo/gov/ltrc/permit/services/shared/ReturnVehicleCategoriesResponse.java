package jo.gov.ltrc.permit.services.shared;

import io.swagger.annotations.ApiModelProperty;

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
    @ApiModelProperty("Vehicle Category ID ") private long vehiclecategoryid ;
    @ApiModelProperty("Vehicle Category Name ") private String vehiclecategoryname ;

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
