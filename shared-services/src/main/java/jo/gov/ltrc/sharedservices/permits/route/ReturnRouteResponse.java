package jo.gov.ltrc.sharedservices.permits.route;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQuery(
        name = "ReturnRoute",
        procedureName = "\"ReturnRoute\"",
        parameters = {


                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = double.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = double.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = double.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),


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
    private long routeid ;
    private String routename ;
    private double routelength ;
    private double routelengthviagis ;
    private long routedailypassengers ;
    private long buslineid ;
    private String linename ;
    private String going ;
    private String returningp ;

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

    public double getRoutelength() {
        return routelength;
    }

    public void setRoutelength(double routelength) {
        this.routelength = routelength;
    }

    public double getRoutelengthviagis() {
        return routelengthviagis;
    }

    public void setRoutelengthviagis(double routelengthviagis) {
        this.routelengthviagis = routelengthviagis;
    }

    public long getRoutedailypassengers() {
        return routedailypassengers;
    }

    public void setRoutedailypassengers(long routedailypassengers) {
        this.routedailypassengers = routedailypassengers;
    }

    public long getBuslineid() {
        return buslineid;
    }

    public void setBuslineid(long buslineid) {
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
}
