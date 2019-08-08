package jo.gov.ltrc.permit.services.shared;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

@NamedStoredProcedureQuery(
        name = "ReturnMunicipality",
        procedureName = "\"ReturnMunicipality\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class)
        },
        resultSetMappings = {
                "MunicipalityResultSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "MunicipalityResultSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnMunicipalityResponse.class)
                }
        )
})
@Entity
public class ReturnMunicipalityResponse implements Serializable {

    @Id
    @ApiModelProperty("Municipality ID ") private Long municipalityID;
    @ApiModelProperty("Municipality Arabic Name ") private String municipalityArabicName;
    @ApiModelProperty("Municipality English Name ") private String municipalityEnglishName;
    @ApiModelProperty("Municipality Code ") private String municipalityCode;

    public Long getMunicipalityID() {
        return municipalityID;
    }

    public void setMunicipalityID(Long municipalityID) {
        this.municipalityID = municipalityID;
    }

    public String getMunicipalityArabicName() {
        return municipalityArabicName;
    }

    public void setMunicipalityArabicName(String municipalityArabicName) {
        this.municipalityArabicName = municipalityArabicName;
    }

    public String getMunicipalityEnglishName() {
        return municipalityEnglishName;
    }

    public void setMunicipalityEnglishName(String municipalityEnglishName) {
        this.municipalityEnglishName = municipalityEnglishName;
    }

    public String getMunicipalityCode() {
        return municipalityCode;
    }

    public void setMunicipalityCode(String municipalityCode) {
        this.municipalityCode = municipalityCode;
    }
}
