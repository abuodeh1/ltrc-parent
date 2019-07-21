package com.etech.ltrc.permits.shared;

import io.swagger.annotations.ApiModelProperty;

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
    @ApiModelProperty("Province ID ") private Long provinceID;
    @ApiModelProperty("Province Arabic Name ") private String provinceArabicName;
    @ApiModelProperty("Province English Name ") private String provinceEnglishName;
    @ApiModelProperty("Province Code ") private String provinceCode;

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
