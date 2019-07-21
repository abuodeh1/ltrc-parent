package com.etech.ltrc.permits.shared;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

@NamedStoredProcedureQuery(
        name = "ReturnGovernorate",
        procedureName = "\"ReturnGovernorate\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class)
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
    @ApiModelProperty("Governorate ID ") private long governorateID;
    @ApiModelProperty("Governorate Arabic Name ") private String governorateArbicName;
    @ApiModelProperty("Governorate English Name ") private String governorateEnglishName;
    @ApiModelProperty("Governorate Code ") private String governorateCode;

    public long getGovernorateID() {
        return governorateID;
    }

    public void setGovernorateID(long governorateID) {
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
}
