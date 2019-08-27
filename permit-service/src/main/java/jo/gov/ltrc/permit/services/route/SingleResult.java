package jo.gov.ltrc.permit.services.route;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "SaveRoutePointData",
                procedureName = "\"SaveRoutePointData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "routeidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "pointidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "principal"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "pointorderparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Boolean.class, name = "pointdirectionparm"),
//                      @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ipaddressparm"),
                }
        ),

        @NamedStoredProcedureQuery(
                name = "SaveRouteData",
                procedureName = "\"SaveRouteData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "routenameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "routelengthparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "routelengthviagisparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "routedailypassengersparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepal"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "buslineidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "routeidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "goingparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "returningparm"),
//                      @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ipaddressparm"),

                }
        ),

        @NamedStoredProcedureQuery(
                name = "ChangeRouteStatus",
                procedureName = "\"ChangeRouteStatus\"",
                parameters = {

                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "routeidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "prencipal"),


                }
        ),


        @NamedStoredProcedureQuery(
                name = "DeleteRoutePointData",
                procedureName = "\"DeleteRoutePointData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "routeidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "pointidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "principal"),
                }
        )

})
@Entity
public class SingleResult implements Serializable {

    @Id
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
