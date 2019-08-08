package jo.gov.ltrc.permit.services.route;

import io.swagger.annotations.ApiModelProperty;

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
    @ApiModelProperty("Route Point ID ") private long routepointid ;
    @ApiModelProperty("Route ID ") private long routeid ;
    @ApiModelProperty("Route Name ") private String routename ;
    @ApiModelProperty("Point ID ") private long pointid ;
    @ApiModelProperty("Point Arabic Name ") private String pointarabicname ;
    @ApiModelProperty("Point Order ") private int pointorder ;
    @ApiModelProperty("Point Direction ") private boolean pointdirection  ;


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
