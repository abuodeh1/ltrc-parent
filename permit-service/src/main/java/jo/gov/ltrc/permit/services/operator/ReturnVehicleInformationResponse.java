package jo.gov.ltrc.permit.services.operator;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@NamedStoredProcedureQuery(
        name = "ReturnVehicleInformation",
        procedureName = "\"ReturnVehicleInformation\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class)

        },
        resultSetMappings = {
                "ReturnVehicleInformationSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnVehicleInformationSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnVehicleInformationResponse.class)
                }
        )
})
@Entity
@Getter @Setter
public class ReturnVehicleInformationResponse implements Serializable {

    @Id
    @ApiModelProperty("Vehicle ID ") private long vehicleid ;
    @ApiModelProperty("Registration Number ") private String registrationnumber ;
    @ApiModelProperty("Plate code ") private String platecode ;
    @ApiModelProperty("Plate Number ") private String platenumber ;
    @ApiModelProperty("Status ") private int status ;
    @ApiModelProperty("Fees Status ") private int feesstatus ;
    @ApiModelProperty("End Working Date ") private Date endworkingdate ;
    @ApiModelProperty("Operator Name ") private String operatorname ;
}
