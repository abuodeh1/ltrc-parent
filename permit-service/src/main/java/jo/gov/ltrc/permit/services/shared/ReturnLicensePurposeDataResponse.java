package com.etech.ltrc.permits.shared;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

@NamedStoredProcedureQuery(
        name = "ReturnLicensepurpose",
        procedureName = "\"ReturnLicensepurpose\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class)
                
        },
        resultSetMappings = {
                "ReturnLicensepurposeDataMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnLicensepurposeDataMapping",
                entities = {
                        @EntityResult(entityClass = ReturnLicensePurposeDataResponse.class)
                }
        )
})
@Entity
public class ReturnLicensePurposeDataResponse implements Serializable {

    @Id
    @ApiModelProperty("License Purpose ID ") private long licensepurposeid ;
    @ApiModelProperty("License Purpose Name ") private String licensepurposename ;

    public long getLicensepurposeid() {
        return licensepurposeid;
    }

    public void setLicensepurposeid(long licensepurposeid) {
        this.licensepurposeid = licensepurposeid;
    }

    public String getLicensepurposename() {
        return licensepurposename;
    }

    public void setLicensepurposename(String licensepurposename) {
        this.licensepurposename = licensepurposename;
    }
}
