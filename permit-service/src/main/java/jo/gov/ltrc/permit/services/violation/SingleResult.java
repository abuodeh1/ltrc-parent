package jo.gov.ltrc.permit.services.violation;



import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@NamedStoredProcedureQueries({

        @NamedStoredProcedureQuery(
                name = "SaveViolationData",
                procedureName = "\"SaveViolationData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),


                }

        )
})

@Entity
public class SingleResult implements Serializable {

    @Id
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
