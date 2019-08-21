package jo.gov.ltrc.permit.services.permit;



import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

@NamedStoredProcedureQueries({

        @NamedStoredProcedureQuery(
                name = "SavePermitTypeData",
                procedureName = "\"SavePermitTypeData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "permittypeidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "permittypenameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "permittypeenglishnameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
//                      @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ipaddressparm"),

                }

        ),

        @NamedStoredProcedureQuery(
                name = "SavePermitData",
                procedureName = "\"SavePermitData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "permitidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "permittypeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "issuedateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "deliverydateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "periodparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "startworkingdateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "endworkingdateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "provinceparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "governorateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "municipalityparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "routeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Time.class, name = "departuretimeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Time.class, name = "completiontimeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "numberoftripsparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "decidedtariffparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "primarydriverparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "primarydriverpassportparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "alternativedriverparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "alternativedriverpassportparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "vehicleparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "classificationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "workingasparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "startpointparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "endpointparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),
//                      @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ipaddressparm"),




                }

        ),

        @NamedStoredProcedureQuery(
                name = "SavePermitTypeFieldSettingData",
                procedureName = "\"SavePermitTypeFieldSettingData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "permittypefieldsettingidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "permittypeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "permitfieldparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "requiredparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "visibleparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "activeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
//                      @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ipaddressparm"),

                }

        ),
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
