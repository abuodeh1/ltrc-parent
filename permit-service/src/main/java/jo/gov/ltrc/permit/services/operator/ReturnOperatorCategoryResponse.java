package jo.gov.ltrc.permit.services.operator;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQuery(
        name = "ReturnOperatorCategory",
        procedureName = "\"ReturnOperatorCategory\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatorcategoryidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "operatorcategorynameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "operatorcategoryenglishnameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatorcategoryclassificationparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "operatorclassificationnameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatorcategorydepartmentparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "servicedepartmentnameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "vehiclecategoryparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "vehiclecategorynameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "plateclassificationparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "plateclassificationnameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "linetypeparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "linetypenameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "pagesize"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "pageindex"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "sorttype"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "sortby"),


        },
        resultSetMappings = {
                "ReturnOperatorCategorySetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnOperatorCategorySetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnOperatorCategoryResponse.class)
                }
        )
})
@Entity
public class ReturnOperatorCategoryResponse implements Serializable {

    @Id
    @ApiModelProperty("Operator Category ID ") private Long operatorcategoryid ;
    @ApiModelProperty("Operator Category Name ") private String operatorcategoryname ;
    @ApiModelProperty("Operator Category English Name ") private String operatorcategoryenglishname ;
    @ApiModelProperty("Operator Category Classification ") private Long operatorcategoryclassification ;
    @ApiModelProperty("Operator Classification Name ") private String operatorclassificationname ;
    @ApiModelProperty("Operator Category Department ") private Long operatorcategorydepartment ;
    @ApiModelProperty("Service Department Name ") private String servicedepartmentname ;
    @ApiModelProperty("Vehicle Category ") private Long vehiclecategory ;
    @ApiModelProperty("Vehicle Category Name ") private String vehiclecategoryname ;
    @ApiModelProperty("Plate Classification ") private Long plateclassification ;
    @ApiModelProperty("Plate Classification Name ") private String plateclassificationname ;
    @ApiModelProperty("Line Type ") private Long linetype ;
    @ApiModelProperty("Line Type Name ") private String linetypename ;

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

    public String getOperatorcategoryenglishname() {
        return operatorcategoryenglishname;
    }

    public void setOperatorcategoryenglishname(String operatorcategoryenglishname) {
        this.operatorcategoryenglishname = operatorcategoryenglishname;
    }

    public Long getOperatorcategoryclassification() {
        return operatorcategoryclassification;
    }

    public void setOperatorcategoryclassification(Long operatorcategoryclassification) {
        this.operatorcategoryclassification = operatorcategoryclassification;
    }

    public String getOperatorclassificationname() {
        return operatorclassificationname;
    }

    public void setOperatorclassificationname(String operatorclassificationname) {
        this.operatorclassificationname = operatorclassificationname;
    }

    public Long getOperatorcategorydepartment() {
        return operatorcategorydepartment;
    }

    public void setOperatorcategorydepartment(Long operatorcategorydepartment) {
        this.operatorcategorydepartment = operatorcategorydepartment;
    }

    public String getServicedepartmentname() {
        return servicedepartmentname;
    }

    public void setServicedepartmentname(String servicedepartmentname) {
        this.servicedepartmentname = servicedepartmentname;
    }

    public Long getVehiclecategory() {
        return vehiclecategory;
    }

    public void setVehiclecategory(Long vehiclecategory) {
        this.vehiclecategory = vehiclecategory;
    }

    public String getVehiclecategoryname() {
        return vehiclecategoryname;
    }

    public void setVehiclecategoryname(String vehiclecategoryname) {
        this.vehiclecategoryname = vehiclecategoryname;
    }

    public Long getPlateclassification() {
        return plateclassification;
    }

    public void setPlateclassification(Long plateclassification) {
        this.plateclassification = plateclassification;
    }

    public String getPlateclassificationname() {
        return plateclassificationname;
    }

    public void setPlateclassificationname(String plateclassificationname) {
        this.plateclassificationname = plateclassificationname;
    }

    public Long getLinetype() {
        return linetype;
    }

    public void setLinetype(Long linetype) {
        this.linetype = linetype;
    }

    public String getLinetypename() {
        return linetypename;
    }

    public void setLinetypename(String linetypename) {
        this.linetypename = linetypename;
    }

    @Override
    public String toString() {
        return "ReturnOperatorCategoryResponse{" +
                "operatorcategoryid=" + operatorcategoryid +
                ", operatorcategoryname=" + operatorcategoryname +
                ", operatorcategoryenglishname=" + operatorcategoryenglishname +
                ", operatorcategoryclassification=" + operatorcategoryclassification +
                ", operatorclassificationname=" + operatorclassificationname +
                ", operatorcategorydepartment=" + operatorcategorydepartment +
                ", servicedepartmentname=" + servicedepartmentname +
                ", vehiclecategory=" + vehiclecategory +
                ", vehiclecategoryname=" + vehiclecategoryname +
                ", plateclassification=" + plateclassification +
                ", plateclassificationname=" + plateclassificationname +
                ", linetype=" + linetype +
                ", linetypename=" + linetypename +
                '}';
    }
}
