package jo.gov.ltrc.permit.services.shared;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

@NamedStoredProcedureQuery(
        name = "ReturnAllCharacteristic",
        procedureName = "\"ReturnAllCharacteristic\"",
        parameters = {

        },
        resultSetMappings = {
                "ReturnAllCharacteristic"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnAllCharacteristic",
                entities = {
                        @EntityResult(entityClass = ReturnAllCharacteristicResponse.class)
                }
        )
})
@Entity
public class ReturnAllCharacteristicResponse implements Serializable {

    @Id
    @ApiModelProperty("Characteristic ID ") private long characteristicid ;
    @ApiModelProperty("Characteristic Arabic Name ") private String characteristicarabicname ;
    @ApiModelProperty("Characteristic English Name ") private String characteristicenglishname ;

    public long getCharacteristicid() {
        return characteristicid;
    }

    public void setCharacteristicid(long characteristicid) {
        this.characteristicid = characteristicid;
    }

    public String getCharacteristicarabicname() {
        return characteristicarabicname;
    }

    public void setCharacteristicarabicname(String characteristicarabicname) {
        this.characteristicarabicname = characteristicarabicname;
    }

    public String getCharacteristicenglishname() {
        return characteristicenglishname;
    }

    public void setCharacteristicenglishname(String characteristicenglishname) {
        this.characteristicenglishname = characteristicenglishname;
    }
}
