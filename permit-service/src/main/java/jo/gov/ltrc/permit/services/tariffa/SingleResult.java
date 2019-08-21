package jo.gov.ltrc.permit.services.tariffa;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@NamedStoredProcedureQueries({

        @NamedStoredProcedureQuery(
                name = "SaveRouteTariffData",
                procedureName = "\"SaveRouteTariffData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "routetariffidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "routeidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "tariffequtionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "tariffstudyparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "fueltypeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "vehiclecategoryparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "inflationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "valueparm1"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "valueparm2"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "startdateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "enddateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "prencipal"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "tariffunitparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "basedonparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
//                      @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ipaddressparm"),
                }
        ),

        @NamedStoredProcedureQuery(
                name = "SaveInflationReferanceData",
                procedureName = "\"SaveInflationReferanceData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "inflationreferanceidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Boolean.class, name = "inflationdirectionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "gasolineratioparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "dieselratioparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "generalrationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "startdateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
//                      @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ipaddressparm"),

                }
        ),

        @NamedStoredProcedureQuery(
                name = "SaveTariffEquationData",
                procedureName = "\"SaveTariffEquationData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "tariffequationidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "vehiclecategoryparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "adeddvalueparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "operationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "routecoefficientmultiplicationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "startdateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "enddateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "equationtextparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "linetypeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepal"),
//                      @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ipaddressparm"),

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
