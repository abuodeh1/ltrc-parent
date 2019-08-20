package jo.gov.ltrc.permit.services.shared;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

@NamedStoredProcedureQuery(
        name = "ReturnGovernorate",
        procedureName = "\"ReturnGovernorate\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "governorateidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "governoratearabicnameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "governorateenglishnameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "governoratecodeparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "countryidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "provinceidparm"),
        },
        resultSetMappings = {
                "GovernorateResultSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "GovernorateResultSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnGovernerateResponse.class)
                }
        )
})
@Entity
public class ReturnGovernerateResponse implements Serializable {

    @Id
    @ApiModelProperty("Governorate ID ") private Long governorateID;
    @ApiModelProperty("Governorate Arabic Name ") private String governorateArbicName;
    @ApiModelProperty("Governorate English Name ") private String governorateEnglishName;
    @ApiModelProperty("Governorate Code ") private String governorateCode;

    public Long getGovernorateID() {
        return governorateID;
    }

    public void setGovernorateID(Long governorateID) {
        this.governorateID = governorateID;
    }

    public String getGovernorateArbicName() {
        return governorateArbicName;
    }

    public void setGovernorateArbicName(String governorateArbicName) {
        this.governorateArbicName = governorateArbicName;
    }

    public String getGovernorateEnglishName() {
        return governorateEnglishName;
    }

    public void setGovernorateEnglishName(String governorateEnglishName) {
        this.governorateEnglishName = governorateEnglishName;
    }

    public String getGovernorateCode() {
        return governorateCode;
    }

    public void setGovernorateCode(String governorateCode) {
        this.governorateCode = governorateCode;
    }

    @Override
    public String toString() {
        return "ReturnGovernerateResponse{" +
                "governorateID=" + governorateID +
                ", governorateArbicName=" + governorateArbicName +
                ", governorateEnglishName=" + governorateEnglishName +
                ", governorateCode=" + governorateCode +
                '}';
    }
}
