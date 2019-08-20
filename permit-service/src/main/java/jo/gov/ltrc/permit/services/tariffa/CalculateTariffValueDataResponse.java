package jo.gov.ltrc.permit.services.tariffa;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

@NamedStoredProcedureQuery(
        name = "ReturnTariffVaLue",
        procedureName = "\"ReturnTariffVaLue\"",
        parameters = {


                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "routeidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "vehiclecategoryparm"),


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
    @ApiModelProperty("Tariffa Value ") private  Double tariffValue ;
    @ApiModelProperty("Tariffa Equation ID ") private Long tariffequationid;

    public Double getTariffValue() {
        return tariffValue;
    }

    public void setTariffValue(Double tariffValue) {
        this.tariffValue = tariffValue;
    }

    public Long getTariffequationid() {
        return tariffequationid;
    }

    public void setTariffequationid(Long tariffequationid) {
        this.tariffequationid = tariffequationid;
    }

    @Override
    public String toString() {
        return "CalculateTariffValueDataResponse{" +
                "tariffValue=" + tariffValue +
                ", tariffequationid=" + tariffequationid +
                '}';
    }
}
