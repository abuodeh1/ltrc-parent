package com.etech.ltrc.permits.route;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "SaveRoutePointData",
                procedureName = "\"SaveRoutePointData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Boolean.class),
                }
        ),

        @NamedStoredProcedureQuery(
                name = "SaveRouteData",
                procedureName = "\"SaveRouteData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = double.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = double.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = double.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class)

                }
        ),

        @NamedStoredProcedureQuery(
                name = "ChangeRouteStatus",
                procedureName = "\"ChangeRouteStatus\"",
                parameters = {

                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),


                }
        ),


        @NamedStoredProcedureQuery(
                name = "DeleteRoutePointData",
                procedureName = "\"DeleteRoutePointData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                }
        )

})
@Entity
public class SingleResult implements Serializable {

    @Id
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
