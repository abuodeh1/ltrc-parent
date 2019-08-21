package jo.gov.ltrc.permit.services.route;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQuery(
        name = "ReturnRoute",
        procedureName = "\"ReturnRoute\"",
        parameters = {


                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "routeidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "routenameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "routelengthparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "routelengthviagisparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "routedailypassengersparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "buslineidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "linenameparm"),


        },
        resultSetMappings = {
                "ReturnRouteDataSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnRouteDataSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnRouteResponse.class)
                }
        )
})



@Entity
public class ReturnRouteResponse implements Serializable {

    @Id
    @ApiModelProperty("Route ID ") private Long routeid ;
    @ApiModelProperty("Route Name ") private String routename ;
    @ApiModelProperty("Route Length") private  Double routelength ;
    @ApiModelProperty("Route Length Viagis") private  Double routelengthviagis ;
    @ApiModelProperty("Route Daily Passengers ") private Long routedailypassengers ;
    @ApiModelProperty("Bus Line ID ") private Long buslineid ;
    @ApiModelProperty("Line Name ") private String linename ;
    @ApiModelProperty("Going ") private String going ;
    @ApiModelProperty("Return in GP") private String returningp ;

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

    public Double getRoutelength() {
        return routelength;
    }

    public void setRoutelength(Double routelength) {
        this.routelength = routelength;
    }

    public Double getRoutelengthviagis() {
        return routelengthviagis;
    }

    public void setRoutelengthviagis(Double routelengthviagis) {
        this.routelengthviagis = routelengthviagis;
    }

    public Long getRoutedailypassengers() {
        return routedailypassengers;
    }

    public void setRoutedailypassengers(Long routedailypassengers) {
        this.routedailypassengers = routedailypassengers;
    }

    public Long getBuslineid() {
        return buslineid;
    }

    public void setBuslineid(Long buslineid) {
        this.buslineid = buslineid;
    }

    public String getLinename() {
        return linename;
    }

    public void setLinename(String linename) {
        this.linename = linename;
    }

    public String getGoing() {
        return going;
    }

    public void setGoing(String going) {
        this.going = going;
    }

    public String getReturningp() {
        return returningp;
    }

    public void setReturningp(String returningp) {
        this.returningp = returningp;
    }

    @Override
    public String toString() {
        return "ReturnRouteResponse{" +
                "routeid=" + routeid +
                ", routename=" + routename +
                ", routelength=" + routelength +
                ", routelengthviagis=" + routelengthviagis +
                ", routedailypassengers=" + routedailypassengers +
                ", buslineid=" + buslineid +
                ", linename=" + linename +
                ", going=" + going +
                ", returningp=" + returningp +
                '}';
    }
}
