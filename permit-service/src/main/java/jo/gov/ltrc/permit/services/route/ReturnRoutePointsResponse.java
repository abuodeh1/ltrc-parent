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
    @ApiModelProperty("Route Point ID ") private Long routepointid ;
    @ApiModelProperty("Route ID ") private Long routeid ;
    @ApiModelProperty("Route Name ") private String routename ;
    @ApiModelProperty("Point ID ") private Long pointid ;
    @ApiModelProperty("Point Arabic Name ") private String pointarabicname ;
    @ApiModelProperty("Point Order ") private Integer pointorder ;
    @ApiModelProperty("Point Direction ") private   Boolean pointdirection  ;

    public Long getRoutepointid() {
        return routepointid;
    }

    public void setRoutepointid(Long routepointid) {
        this.routepointid = routepointid;
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

    public Long getPointid() {
        return pointid;
    }

    public void setPointid(Long pointid) {
        this.pointid = pointid;
    }

    public String getPointarabicname() {
        return pointarabicname;
    }

    public void setPointarabicname(String pointarabicname) {
        this.pointarabicname = pointarabicname;
    }

    public Integer getPointorder() {
        return pointorder;
    }

    public void setPointorder(Integer pointorder) {
        this.pointorder = pointorder;
    }

    public Boolean getPointdirection() {
        return pointdirection;
    }

    public void setPointdirection(Boolean pointdirection) {
        this.pointdirection = pointdirection;
    }

    @Override
    public String toString() {
        return "ReturnRoutePointsResponse{" +
                "routepointid=" + routepointid +
                ", routeid=" + routeid +
                ", routename=" + routename +
                ", pointid=" + pointid +
                ", pointarabicname=" + pointarabicname +
                ", pointorder=" + pointorder +
                ", pointdirection=" + pointdirection +
                '}';
    }
}
