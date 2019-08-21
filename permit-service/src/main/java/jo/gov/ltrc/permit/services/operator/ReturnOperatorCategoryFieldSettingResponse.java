package jo.gov.ltrc.permit.services.operator;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQuery(
        name = "ReturnOperatorCategoryFieldSetting",
        procedureName = "\"ReturnOperatorCategoryFieldSetting\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatorcategroryfieldsettingidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatorcategoryidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "operatorcategorynameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatorfieldparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "operatorfieldnameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "operatorfieldsectionparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "requiredparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "visibleparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "activeparm"),


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
    @ApiModelProperty("Operator Category Field ID ") private Long operatorcategroryfieldsettingid ;
    @ApiModelProperty("Operator Category ID ") private Long operatorcategoryid ;
    @ApiModelProperty("Operator Category Name  ") private String operatorcategoryname ;
    @ApiModelProperty("Operator Field") private Long operatorfield ;
    @ApiModelProperty("Operator Field Name ") private String operatorfieldname ;
    @ApiModelProperty("Operator Field Section") private Integer operatorfieldsection ;
    @ApiModelProperty("Required ") private Integer required ;
    @ApiModelProperty("Visible ") private Integer visible ;
    @ApiModelProperty("Active ") private Integer active ;

    public Long getOperatorcategroryfieldsettingid() {
        return operatorcategroryfieldsettingid;
    }

    public void setOperatorcategroryfieldsettingid(Long operatorcategroryfieldsettingid) {
        this.operatorcategroryfieldsettingid = operatorcategroryfieldsettingid;
    }

    public Long getOperatorcategoryid() {
        return operatorcategoryid;
    }

    public void setOperatorcategoryid(Long operatorcategoryid) {
        this.operatorcategoryid = operatorcategoryid;
    }

    public String getOperatorcategoryname() {
        return operatorcategoryname;
    }

    public void setOperatorcategoryname(String operatorcategoryname) {
        this.operatorcategoryname = operatorcategoryname;
    }

    public Long getOperatorfield() {
        return operatorfield;
    }

    public void setOperatorfield(Long operatorfield) {
        this.operatorfield = operatorfield;
    }

    public String getOperatorfieldname() {
        return operatorfieldname;
    }

    public void setOperatorfieldname(String operatorfieldname) {
        this.operatorfieldname = operatorfieldname;
    }

    public Integer getOperatorfieldsection() {
        return operatorfieldsection;
    }

    public void setOperatorfieldsection(Integer operatorfieldsection) {
        this.operatorfieldsection = operatorfieldsection;
    }

    public Integer getRequired() {
        return required;
    }

    public void setRequired(Integer required) {
        this.required = required;
    }

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "ReturnOperatorCategoryFieldSettingResponse{" +
                "operatorcategroryfieldsettingid=" + operatorcategroryfieldsettingid +
                ", operatorcategoryid=" + operatorcategoryid +
                ", operatorcategoryname=" + operatorcategoryname +
                ", operatorfield=" + operatorfield +
                ", operatorfieldname=" + operatorfieldname +
                ", operatorfieldsection=" + operatorfieldsection +
                ", required=" + required +
                ", visible=" + visible +
                ", active=" + active +
                '}';
    }
}
