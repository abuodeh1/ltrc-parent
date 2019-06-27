package jo.gov.ltrc.sharedservices.permits.shared;

import javax.persistence.*;
import java.io.Serializable;

@NamedStoredProcedureQuery(
        name = "ReturnTerritory",
        procedureName = "\"ReturnTerritory\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                
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
    private long territoryID;
    private String territoryArabicName;
    private String territoryEnglishName;
    private String territoryCode;

    public long getTerritoryID() {
        return territoryID;
    }

    public void setTerritoryID(long territoryID) {
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
}
