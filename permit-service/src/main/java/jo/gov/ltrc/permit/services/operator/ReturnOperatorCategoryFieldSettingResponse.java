package jo.gov.ltrc.permit.services.operator;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQuery(
        name = "ReturnOperatorCategoryFieldSetting",
        procedureName = "\"ReturnOperatorCategoryFieldSetting\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),


        },
        resultSetMappings = {
                "ReturnOperatorCategoryFieldSettingSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnOperatorCategoryFieldSettingSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnOperatorCategoryFieldSettingResponse.class)
                }
        )
})
@Entity
public class ReturnOperatorCategoryFieldSettingResponse implements Serializable {

    @Id
    @ApiModelProperty("Operator Category Field ID ") private long operatorcategroryfieldsettingid ;
    @ApiModelProperty("Operator Category ID ") private long operatorcategoryid ;
    @ApiModelProperty("Operator Category Name  ") private String operatorcategoryname ;
    @ApiModelProperty("Operator Field") private long operatorfield ;
    @ApiModelProperty("Operator Field Name ") private String operatorfieldname ;
    @ApiModelProperty("Operator Field Section") private int operatorfieldsection ;
    @ApiModelProperty("Required ") private int required ;
    @ApiModelProperty("Visible ") private int visible ;
    @ApiModelProperty("Active ") private int active ;

    public long getOperatorcategroryfieldsettingid() {
        return operatorcategroryfieldsettingid;
    }

    public void setOperatorcategroryfieldsettingid(long operatorcategroryfieldsettingid) {
        this.operatorcategroryfieldsettingid = operatorcategroryfieldsettingid;
    }

    public long getOperatorcategoryid() {
        return operatorcategoryid;
    }

    public void setOperatorcategoryid(long operatorcategoryid) {
        this.operatorcategoryid = operatorcategoryid;
    }

    public String getOperatorcategoryname() {
        return operatorcategoryname;
    }

    public void setOperatorcategoryname(String operatorcategoryname) {
        this.operatorcategoryname = operatorcategoryname;
    }

    public long getOperatorfiel() {
        return operatorfield;
    }

    public void setOperatorfiel(long operatorfiel) {
        this.operatorfield = operatorfiel;
    }

    public String getOperatorfieldname() {
        return operatorfieldname;
    }

    public void setOperatorfieldname(String operatorfieldname) {
        this.operatorfieldname = operatorfieldname;
    }

    public int getOperatorfieldsection() {
        return operatorfieldsection;
    }

    public void setOperatorfieldsection(int operatorfieldsection) {
        this.operatorfieldsection = operatorfieldsection;
    }

    public int getRequired() {
        return required;
    }

    public void setRequired(int required) {
        this.required = required;
    }

    public int getVisible() {
        return visible;
    }

    public void setVisible(int visible) {
        this.visible = visible;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }
}
