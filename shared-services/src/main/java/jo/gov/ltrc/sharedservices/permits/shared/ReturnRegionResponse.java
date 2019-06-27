package jo.gov.ltrc.sharedservices.permits.shared;

import javax.persistence.*;
import java.io.Serializable;

@NamedStoredProcedureQuery(
        name = "ReturnProvince",
        procedureName = "\"ReturnProvince\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class)
        },
        resultSetMappings = {
                "RegionResultSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "RegionResultSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnRegionResponse.class)
                }
        )
})
@Entity
public class ReturnRegionResponse implements Serializable {

    @Id
    private Long provinceID;
    private String provinceArabicName;
    private String provinceEnglishName;
    private String provinceCode;

    public Long getProvinceID() {
        return provinceID;
    }

    public void setProvinceID(Long provinceID) {
        this.provinceID = provinceID;
    }

    public String getProvinceArabicName() {
        return provinceArabicName;
    }

    public void setProvinceArabicName(String provinceArabicName) {
        this.provinceArabicName = provinceArabicName;
    }

    public String getProvinceEnglishName() {
        return provinceEnglishName;
    }

    public void setProvinceEnglishName(String provinceEnglishName) {
        this.provinceEnglishName = provinceEnglishName;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }
}
