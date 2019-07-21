package jo.gov.ltrc.permit.services.line;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQueries({
       
        @NamedStoredProcedureQuery(
                name = "SaveLineData",
                procedureName = "\"SaveLineData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Boolean.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),

                }
        ),

        @NamedStoredProcedureQuery(
                name = "ChangeLineStatus",
                procedureName = "\"ChangeLineStatus\"",
                parameters = {

                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
//                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),


                }
        ),
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
