package jo.gov.ltrc.permit.services.shared;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

@NamedStoredProcedureQuery(
        name = "ReturnCountry",
        procedureName = "\"ReturnCountry\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "countryidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "countryarabicnameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "countryenglishnameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "countrycodeparm"),
        },
        resultSetMappings = {
                "CountryResultSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "CountryResultSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnCountryResponse.class)
                }
        )
})
@Entity
public class ReturnCountryResponse implements Serializable {

    @Id
    @ApiModelProperty("Country ID ") private Long countryid;
    @ApiModelProperty("Country Arabic Name ") private String countryarabicname;
    @ApiModelProperty("Country English Name ") private String countryenglishname;
    @ApiModelProperty("Country Code ") private String countrycode;

    public Long getCountryid() {
        return countryid;
    }

    public void setCountryid(Long countryid) {
        this.countryid = countryid;
    }

    public String getCountryarabicname() {
        return countryarabicname;
    }

    public void setCountryarabicname(String countryarabicname) {
        this.countryarabicname = countryarabicname;
    }

    public String getCountryenglishname() {
        return countryenglishname;
    }

    public void setCountryenglishname(String countryenglishname) {
        this.countryenglishname = countryenglishname;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

}
