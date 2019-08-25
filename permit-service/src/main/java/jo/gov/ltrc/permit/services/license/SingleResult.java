package jo.gov.ltrc.permit.services.license;



import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@NamedStoredProcedureQueries({

        @NamedStoredProcedureQuery(
                name = "SaveOperatorLicenseData",
                procedureName = "\"SaveOperatorLicenseData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatorlicenseidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class , name = "issuedateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class ,name = "operatoridparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "licensestartdateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class , name = "licenseenddateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "liecencsestatusparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class , name = "printingdateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "counterparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ipaddressparm"),

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

    public void setId(long id) {
        this.id = id;
    }
}
