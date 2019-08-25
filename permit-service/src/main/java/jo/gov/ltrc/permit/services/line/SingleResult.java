package jo.gov.ltrc.permit.services.line;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQueries({
       
        @NamedStoredProcedureQuery(
                name = "SaveLineData",
                procedureName = "\"SaveLineData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "linenameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Boolean.class, name = "allowtemporarypermitparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "lineidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "provinceidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "governorateidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "linetypeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "stratpointparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "endpointparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "remarksparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "linestatusparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ipaddressparm"),

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
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
