package com.etech.ltrc.permits.shared;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

@NamedStoredProcedureQuery(
        name = "ReturnPlateClassification",
        procedureName = "\"ReturnPlateClassification\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                
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
    @ApiModelProperty("Plate Classification ID ") private long plateclassificationid ;
    @ApiModelProperty("Plate Classification Name ") private String plateclassificationname ;

    public long getPlateclassificationid() {
        return plateclassificationid;
    }

    public void setPlateclassificationid(long plateclassificationid) {
        this.plateclassificationid = plateclassificationid;
    }

    public String getPlateclassificationname() {
        return plateclassificationname;
    }

    public void setPlateclassificationname(String plateclassificationname) {
        this.plateclassificationname = plateclassificationname;
    }
}
