package com.etech.ltrc.permits.operator;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQuery(
        name = "ReturnOperatorCategory",
        procedureName = "\"ReturnOperatorCategory\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),


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
    @ApiModelProperty("Operator Category ID ") private long operatorcategoryid ;
    @ApiModelProperty("Operator Category Name ") private String operatorcategoryname ;
    @ApiModelProperty("Operator Category English Name ") private String operatorcategoryenglishname ;
    @ApiModelProperty("Operator Category Classification ") private long operatorcategoryclassification ;
    @ApiModelProperty("Operator Classification Name ") private String operatorclassificationname ;
    @ApiModelProperty("Operator Category Department ") private long operatorcategorydepartment ;
    @ApiModelProperty("Service Department Name ") private String servicedepartmentname ;
    @ApiModelProperty("Vehicle Category ") private long vehiclecategory ;
    @ApiModelProperty("Vehicle Category Name ") private String vehiclecategoryname ;
    @ApiModelProperty("Plate Classification ") private long plateclassification ;
    @ApiModelProperty("Plate Classification Name ") private String plateclassificationname ;
    @ApiModelProperty("Line Type ") private long linetype ;
    @ApiModelProperty("Line Type Name ") private String linetypename ;


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

    public String getOperatorcategoryenglishname() {
        return operatorcategoryenglishname;
    }

    public void setOperatorcategoryenglishname(String operatorcategoryenglishname) {
        this.operatorcategoryenglishname = operatorcategoryenglishname;
    }

    public long getOperatorcategoryclassification() {
        return operatorcategoryclassification;
    }

    public void setOperatorcategoryclassification(long operatorcategoryclassification) {
        this.operatorcategoryclassification = operatorcategoryclassification;
    }

    public String getOperatorclassificationname() {
        return operatorclassificationname;
    }

    public void setOperatorclassificationname(String operatorclassificationname) {
        this.operatorclassificationname = operatorclassificationname;
    }

    public long getOperatorcategorydepartment() {
        return operatorcategorydepartment;
    }

    public void setOperatorcategorydepartment(long operatorcategorydepartment) {
        this.operatorcategorydepartment = operatorcategorydepartment;
    }

    public String getServicedepartmentname() {
        return servicedepartmentname;
    }

    public void setServicedepartmentname(String servicedepartmentname) {
        this.servicedepartmentname = servicedepartmentname;
    }

    public long getVehiclecategory() {
        return vehiclecategory;
    }

    public void setVehiclecategory(long vehiclecategory) {
        this.vehiclecategory = vehiclecategory;
    }

    public String getVehiclecategoryname() {
        return vehiclecategoryname;
    }

    public void setVehiclecategoryname(String vehiclecategoryname) {
        this.vehiclecategoryname = vehiclecategoryname;
    }

    public long getPlateclassification() {
        return plateclassification;
    }

    public void setPlateclassification(long plateclassification) {
        this.plateclassification = plateclassification;
    }

    public String getPlateclassificationname() {
        return plateclassificationname;
    }

    public void setPlateclassificationname(String plateclassificationname) {
        this.plateclassificationname = plateclassificationname;
    }

    public long getLinetype() {
        return linetype;
    }

    public void setLinetype(long linetype) {
        this.linetype = linetype;
    }

    public String getLinetypename() {
        return linetypename;
    }

    public void setLinetypename(String linetypename) {
        this.linetypename = linetypename;
    }

}
