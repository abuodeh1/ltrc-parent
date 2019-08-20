package jo.gov.ltrc.permit.services.shared;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

@NamedStoredProcedureQuery(
        name = "ReturnPlateClassification",
        procedureName = "\"ReturnPlateClassification\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "plateclassificationidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "plateclassificationnameparm"),
                
        },
        resultSetMappings = {
                "ReturnPlateClassificationSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnPlateClassificationSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnPlateClassificationResponse.class)
                }
        )
})
@Entity
public class ReturnPlateClassificationResponse implements Serializable {

    @Id
    @ApiModelProperty("Plate Classification ID ") private Long plateclassificationid ;
    @ApiModelProperty("Plate Classification Name ") private String plateclassificationname ;

    public Long getPlateclassificationid() {
        return plateclassificationid;
    }

    public void setPlateclassificationid(Long plateclassificationid) {
        this.plateclassificationid = plateclassificationid;
    }

    public String getPlateclassificationname() {
        return plateclassificationname;
    }

    public void setPlateclassificationname(String plateclassificationname) {
        this.plateclassificationname = plateclassificationname;
    }

    @Override
    public String toString() {
        return "ReturnPlateClassificationResponse{" +
                "plateclassificationid=" + plateclassificationid +
                ", plateclassificationname=" + plateclassificationname +
                '}';
    }
}
