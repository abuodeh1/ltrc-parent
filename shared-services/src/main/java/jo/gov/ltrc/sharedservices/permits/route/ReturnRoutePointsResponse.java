package jo.gov.ltrc.sharedservices.permits.route;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQuery(
        name = "ReturnRoutePoints",
        procedureName = "\"ReturnRoutePoints\"",
        parameters = {

                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),

        },
        resultSetMappings = {
                "ReturnRoutePointsSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnRoutePointsSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnRoutePointsResponse.class)
                }
        )
})



@Entity
public class ReturnRoutePointsResponse implements Serializable {

    @Id
    private long routepointid ;
    private long routeid ;
    private String routename ;
    private long pointid ;
    private String pointarabicname ;
    private int pointorder ;
    private boolean pointdirection  ;


    public long getRoutepointid() {
        return routepointid;
    }

    public void setRoutepointid(long routepointid) {
        this.routepointid = routepointid;
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

    public long getPointid() {
        return pointid;
    }

    public void setPointid(long pointid) {
        this.pointid = pointid;
    }

    public String getPointarabicname() {
        return pointarabicname;
    }

    public void setPointarabicname(String pointarabicname) {
        this.pointarabicname = pointarabicname;
    }

    public int getPointorder() {
        return pointorder;
    }

    public void setPointorder(int pointorder) {
        this.pointorder = pointorder;
    }

    public boolean isPointdirection() {
        return pointdirection;
    }

    public void setPointdirection(boolean pointdirection) {
        this.pointdirection = pointdirection;
    }
}
