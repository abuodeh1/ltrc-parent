package com.etech.ltrc.permits.line;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQuery(
        name = "ReturnAllLineType",
        procedureName = "\"ReturnAllLineType\"",
        parameters = {

        },
        resultSetMappings = {
                "ReturnAllLineTypeSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnAllLineTypeSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnAllLineTypesResponse.class)
                }
        )
})



@Entity
public class ReturnAllLineTypesResponse implements Serializable {

    @Id
    @ApiModelProperty("Line Type ID ") private long linetypeid ;
    @ApiModelProperty("Line Type Name ") private String linetypename ;

    public long getLinetypeid() {
        return linetypeid;
    }

    public void setLinetypeid(long linetypeid) {
        this.linetypeid = linetypeid;
    }

    public String getLinetypename() {
        return linetypename;
    }

    public void setLinetypename(String linetypename) {
        this.linetypename = linetypename;
    }
}
