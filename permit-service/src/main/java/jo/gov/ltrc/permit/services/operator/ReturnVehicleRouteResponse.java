package jo.gov.ltrc.permit.services.operator;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQuery(
        name = "ReturnVehicleRoute",
        procedureName = "\"ReturnVehicleRoute\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
        },
        resultSetMappings = {
                "ReturnVehicleRouteSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnVehicleRouteSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnVehicleRouteResponse.class)
                }
        )
})
@Entity
public class ReturnVehicleRouteResponse implements Serializable {

    @Id
    @ApiModelProperty("Vehicle Route ID ") private long vehiclerouteid ;
    @ApiModelProperty("Vehicle ID ") private long vehicleid ;
    @ApiModelProperty("Registration Number ") private String registrationnumber ;
    @ApiModelProperty("Route ID ") private long routeid ;
    @ApiModelProperty("Route Name ") private String routename ;
    @ApiModelProperty("Plate Code ") private String platecode ;
    @ApiModelProperty("Plate Number ") private String platenumber ;
    @ApiModelProperty("Line ID ") private long lineid ;
    @ApiModelProperty("Line Name ") private String linename ;

    public long getVehiclerouteid() {
        return vehiclerouteid;
    }

    public void setVehiclerouteid(long vehiclerouteid) {
        this.vehiclerouteid = vehiclerouteid;
    }

    public long getVehicleid() {
        return vehicleid;
    }

    public void setVehicleid(long vehicleid) {
        this.vehicleid = vehicleid;
    }

    public String getRegistrationnumber() {
        return registrationnumber;
    }

    public void setRegistrationnumber(String registrationnumber) {
        this.registrationnumber = registrationnumber;
    }

    public long getRouteid() {
        return routeid;
    }

    public void setRouteid(long routeid) {
        this.routeid = routeid;
    }

    public String getRoutename() {
        return routename;
    }

    public void setRoutename(String routename) {
        this.routename = routename;
    }

    public String getPlatecode() {
        return platecode;
    }

    public void setPlatecode(String platecode) {
        this.platecode = platecode;
    }

    public String getPlatenumber() {
        return platenumber;
    }

    public void setPlatenumber(String platenumber) {
        this.platenumber = platenumber;
    }

    public long getLineid() {
        return lineid;
    }

    public void setLineid(long lineid) {
        this.lineid = lineid;
    }

    public String getLinename() {
        return linename;
    }

    public void setLinename(String linename) {
        this.linename = linename;
    }
}
