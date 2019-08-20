package jo.gov.ltrc.permit.services.operator;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQuery(
        name = "ReturnVehicleRoute",
        procedureName = "\"ReturnVehicleRoute\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "vehiclerouteidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "vehicleidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "registrationnumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "routeidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "routenameparm"),
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
    @ApiModelProperty("Vehicle Route ID ") private Long vehiclerouteid ;
    @ApiModelProperty("Vehicle ID ") private Long vehicleid ;
    @ApiModelProperty("Registration Number ") private String registrationnumber ;
    @ApiModelProperty("Route ID ") private Long routeid ;
    @ApiModelProperty("Route Name ") private String routename ;
    @ApiModelProperty("Plate Code ") private String platecode ;
    @ApiModelProperty("Plate Number ") private String platenumber ;
    @ApiModelProperty("Line ID ") private Long lineid ;
    @ApiModelProperty("Line Name ") private String linename ;

    public Long getVehiclerouteid() {
        return vehiclerouteid;
    }

    public void setVehiclerouteid(Long vehiclerouteid) {
        this.vehiclerouteid = vehiclerouteid;
    }

    public Long getVehicleid() {
        return vehicleid;
    }

    public void setVehicleid(Long vehicleid) {
        this.vehicleid = vehicleid;
    }

    public String getRegistrationnumber() {
        return registrationnumber;
    }

    public void setRegistrationnumber(String registrationnumber) {
        this.registrationnumber = registrationnumber;
    }

    public Long getRouteid() {
        return routeid;
    }

    public void setRouteid(Long routeid) {
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

    public Long getLineid() {
        return lineid;
    }

    public void setLineid(Long lineid) {
        this.lineid = lineid;
    }

    public String getLinename() {
        return linename;
    }

    public void setLinename(String linename) {
        this.linename = linename;
    }

    @Override
    public String toString() {
        return "ReturnVehicleRouteResponse{" +
                "vehiclerouteid=" + vehiclerouteid +
                ", vehicleid=" + vehicleid +
                ", registrationnumber=" + registrationnumber +
                ", routeid=" + routeid +
                ", routename=" + routename +
                ", platecode=" + platecode +
                ", platenumber=" + platenumber +
                ", lineid=" + lineid +
                ", linename=" + linename +
                '}';
    }
}
