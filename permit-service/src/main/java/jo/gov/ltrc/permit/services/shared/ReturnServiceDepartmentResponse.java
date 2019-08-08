package jo.gov.ltrc.permit.services.shared;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

@NamedStoredProcedureQuery(
        name = "ReturnServiceDepartment",
        procedureName = "\"ReturnServiceDepartment\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                
        },
        resultSetMappings = {
                "ReturnServiceDepartmentSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnServiceDepartmentSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnServiceDepartmentResponse.class)
                }
        )
})
@Entity
public class ReturnServiceDepartmentResponse implements Serializable {

    @Id
    @ApiModelProperty("Service Department ID ") private long servicedepartmentid ;
    @ApiModelProperty("Service Department Name ") private String servicedepartmentname ;

    public long getServicedepartmentid() {
        return servicedepartmentid;
    }

    public void setServicedepartmentid(long servicedepartmentid) {
        this.servicedepartmentid = servicedepartmentid;
    }

    public String getServicedepartmentname() {
        return servicedepartmentname;
    }

    public void setServicedepartmentname(String servicedepartmentname) {
        this.servicedepartmentname = servicedepartmentname;
    }
}
