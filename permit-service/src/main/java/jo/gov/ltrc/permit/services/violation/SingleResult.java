package jo.gov.ltrc.permit.services.violation;



import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@NamedStoredProcedureQueries({

        @NamedStoredProcedureQuery(
                name = "SaveViolationData",
                procedureName = "\"SaveViolationData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "violationidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "violationdateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "violationbyparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "violationtypeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "violationsubjectparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "violationpenaltyparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "vehicleparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "driverparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "lineidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "violationreferenceparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "violationreferencedateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "cancellationofarrestorderreferenceparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "cancellationofarrestorderdateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatorparm"),


                }

        )
})

@Entity
public class SingleResult implements Serializable {

    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
