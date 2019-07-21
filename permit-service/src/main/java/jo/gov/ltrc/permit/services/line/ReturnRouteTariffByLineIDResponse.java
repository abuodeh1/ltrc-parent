package jo.gov.ltrc.permit.services.line;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@NamedStoredProcedureQuery(
        name = "ReturnRouteTariffByLineID",
        procedureName = "\"ReturnRouteTariffByLineID\"",
        parameters = {

                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
        },
        resultSetMappings = {
                "ReturnRouteTariffByLineIDDataSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnRouteTariffByLineIDDataSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnRouteTariffByLineIDResponse.class)
                }
        )
})
@Entity
@Getter @Setter
public class ReturnRouteTariffByLineIDResponse implements Serializable {

    @ApiModelProperty("Route ID ") private long routeid ;
    @ApiModelProperty("Route Name ") private String routename ;
    @ApiModelProperty("Value P") private double valuep ;
    @ApiModelProperty("Vehicle Category ") private long vehiclecategory ;
    @ApiModelProperty("Vehicle Category Name ") private String vehiclecategoryname ;
    @ApiModelProperty("Fuel Type ") private long fueltype ;
    @ApiModelProperty("Fuel Type Name ") private String fueltypename ;
    @ApiModelProperty("Based On ") private int basedon ;
    @ApiModelProperty("Tariffa Equation ") private long tariffeqution ;
    @ApiModelProperty("Tariffa Study ") private long tariffstudy ;
    @Id
    @ApiModelProperty("Route Tariffa ID ") private long routetariffid ;

}
