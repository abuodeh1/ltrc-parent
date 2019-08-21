package jo.gov.ltrc.permit.services.shared;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

@NamedStoredProcedureQuery(
        name = "ReturnLicensepurpose",
        procedureName = "\"ReturnLicensepurpose\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "licensepurposeidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "licensepurposenameparm"),
                
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
    @ApiModelProperty("License Purpose ID ") private Long licensepurposeid ;
    @ApiModelProperty("License Purpose Name ") private String licensepurposename ;

    public Long getLicensepurposeid() {
        return licensepurposeid;
    }

    public void setLicensepurposeid(Long licensepurposeid) {
        this.licensepurposeid = licensepurposeid;
    }

    public String getLicensepurposename() {
        return licensepurposename;
    }

    public void setLicensepurposename(String licensepurposename) {
        this.licensepurposename = licensepurposename;
    }

    @Override
    public String toString() {
        return "ReturnLicensePurposeDataResponse{" +
                "licensepurposeid=" + licensepurposeid +
                ", licensepurposename=" + licensepurposename +
                '}';
    }
}
