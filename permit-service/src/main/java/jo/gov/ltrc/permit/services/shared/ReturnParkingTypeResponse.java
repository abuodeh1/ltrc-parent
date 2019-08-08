package jo.gov.ltrc.permit.services.shared;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

@NamedStoredProcedureQuery(
        name = "ReturnParkingType",
        procedureName = "\"ReturnParkingType\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                
        },
        resultSetMappings = {
                "ReturnParkingTypeResultSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnParkingTypeResultSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnParkingTypeResponse.class)
                }
        )
})
@Entity
public class ReturnParkingTypeResponse implements Serializable {

    @Id
    @ApiModelProperty("Parking Type ID ") private long ParkingTypeID ;
    @ApiModelProperty("Parking Type Arabic ") private String ParkingTypeArabicName ;
    @ApiModelProperty("Parking Type English ") private String ParkingTypeEnglishName ;

    public long getParkingTypeID() {
        return ParkingTypeID;
    }

    public void setParkingTypeID(long parkingTypeID) {
        ParkingTypeID = parkingTypeID;
    }

    public String getParkingTypeArabicName() {
        return ParkingTypeArabicName;
    }

    public void setParkingTypeArabicName(String parkingTypeArabicName) {
        ParkingTypeArabicName = parkingTypeArabicName;
    }

    public String getParkingTypeEnglishName() {
        return ParkingTypeEnglishName;
    }

    public void setParkingTypeEnglishName(String parkingTypeEnglishName) {
        ParkingTypeEnglishName = parkingTypeEnglishName;
    }
}
