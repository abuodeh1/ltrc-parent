package jo.gov.ltrc.permit.services.point;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQueries({

        @NamedStoredProcedureQuery(
                name = "SavePointData",
                procedureName = "\"SavePointData\"",
                parameters = {

                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "pointidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "pointarabicnameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "provinceidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "governorateidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "municipalityidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "territoryidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "pointcharacteristicparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "pointparkingtypeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "pointstreetparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "pointneighborhoodparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "officenameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "officephonenumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "liaisonofficernameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "pointstatusparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Boolean.class, name = "sunshadesparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Boolean.class, name = "healthcarefacilitiesparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Boolean.class, name = "publictelephonesparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Boolean.class, name = "seatparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "terminalareaparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "countofsunshadesparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "countofseatsparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "countoflanesparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "countofseatsandsunshadesparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "terminalremarksparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "prencipal"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ipaddressparm"),


                        }
                ),

        @NamedStoredProcedureQuery(
                name = "ChangePointStatus",
                procedureName = "\"ChangePointStatus\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "pointidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "pointstatusparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "prencipal")
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

    public void setId(Integer id) {
        this.id = id;
    }
}
