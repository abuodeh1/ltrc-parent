package jo.gov.ltrc.sharedservices.permits.tariffa;

import javax.persistence.*;
import java.io.Serializable;

@NamedStoredProcedureQuery(
        name = "ReturnTariffVaLue",
        procedureName = "\"ReturnTariffVaLue\"",
        parameters = {


                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),


        }
        ,
        resultSetMappings = {
                "ReturnTariffVaLueDataSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnTariffVaLueDataSetMapping",
                entities = {
                        @EntityResult(entityClass = CalculateTariffValueDataResponse.class)
                }
        )
})
@Entity
public class CalculateTariffValueDataResponse implements Serializable {

    @Id
    private double tariffValue ;
    private long tariffequationid;

    public double getTariffValue() {
        return tariffValue;
    }

    public void setTariffValue(double tariffValue) {
        this.tariffValue = tariffValue;
    }

    public long getTariffequationid() {
        return tariffequationid;
    }

    public void setTariffequationid(long tariffequationid) {
        this.tariffequationid = tariffequationid;
    }
}
