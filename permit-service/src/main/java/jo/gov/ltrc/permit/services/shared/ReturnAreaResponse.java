package jo.gov.ltrc.permit.services.shared;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

@NamedStoredProcedureQuery(
        name = "ReturnTerritory",
        procedureName = "\"ReturnTerritory\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class,  name = "territoryidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "territoryarabicnameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "territoryenglishnameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "territorycodeparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "municipalityparm"),
                
        },
        resultSetMappings = {
                "AreaResultSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "AreaResultSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnAreaResponse.class)
                }
        )
})
@Entity
public class ReturnAreaResponse implements Serializable {

    @Id
    @ApiModelProperty("Territory ID ") private Long territoryID;
    @ApiModelProperty("Territory Arabic Name ") private String territoryArabicName;
    @ApiModelProperty("Territory English Name ") private String territoryEnglishName;
    @ApiModelProperty("Territory Code ") private String territoryCode;

    public Long getTerritoryID() {
        return territoryID;
    }

    public void setTerritoryID(Long territoryID) {
        this.territoryID = territoryID;
    }

    public String getTerritoryArabicName() {
        return territoryArabicName;
    }

    public void setTerritoryArabicName(String territoryArabicName) {
        this.territoryArabicName = territoryArabicName;
    }

    public String getTerritoryEnglishName() {
        return territoryEnglishName;
    }

    public void setTerritoryEnglishName(String territoryEnglishName) {
        this.territoryEnglishName = territoryEnglishName;
    }

    public String getTerritoryCode() {
        return territoryCode;
    }

    public void setTerritoryCode(String territoryCode) {
        this.territoryCode = territoryCode;
    }

    @Override
    public String toString() {
        return "ReturnAreaResponse{" +
                "territoryID=" + territoryID +
                ", territoryArabicName=" + territoryArabicName +
                ", territoryEnglishName=" + territoryEnglishName +
                ", territoryCode=" + territoryCode +
                '}';
    }
}
