package jo.gov.ltrc.sharedservices.permits.tariffa;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@NamedStoredProcedureQueries({

        @NamedStoredProcedureQuery(
                name = "SaveRouteTariffData",
                procedureName = "\"SaveRouteTariffData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class)
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
