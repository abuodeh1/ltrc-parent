package com.etech.ltrc.permits.operator;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@NamedStoredProcedureQuery(
        name = "ReturnOperatorByOperatorBasicInformation",
        procedureName = "\"ReturnOperatorByOperatorBasicInformation\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),

        },
        resultSetMappings = {
                "ReturnOperatorByOperatorBasicInformationSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnOperatorByOperatorBasicInformationSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnOperatorByOperatorBasicInformationResponse.class)
                }
        )
})
@Entity
public class ReturnOperatorByOperatorBasicInformationResponse implements Serializable {

    @Id
    @ApiModelProperty("Operator ID ") private long operatorid ;
    @ApiModelProperty("Operator Name ") private String operatorname ;
    @ApiModelProperty("Operator Category ") private long operatorcategory ;
    @ApiModelProperty("Operator Category Name ") private String operatorcategoryname ;
    @ApiModelProperty("Operator Classification") private long operatorclassification ;
    @ApiModelProperty("Operator Classification Name ") private String operatorclassificationname ;
    @ApiModelProperty("Fees Status ") private int feesstatus ;
    @ApiModelProperty("License Expired ") private Date licenseexpiredate ;

    public long getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(long operatorid) {
        this.operatorid = operatorid;
    }

    public String getOperatorname() {
        return operatorname;
    }

    public void setOperatorname(String operatorname) {
        this.operatorname = operatorname;
    }

    public long getOperatorcategory() {
        return operatorcategory;
    }

    public void setOperatorcategory(long operatorcategory) {
        this.operatorcategory = operatorcategory;
    }

    public String getOperatorcategoryname() {
        return operatorcategoryname;
    }

    public void setOperatorcategoryname(String operatorcategoryname) {
        this.operatorcategoryname = operatorcategoryname;
    }

    public long getOperatorclassification() {
        return operatorclassification;
    }

    public void setOperatorclassification(long operatorclassification) {
        this.operatorclassification = operatorclassification;
    }

    public String getOperatorclassificationname() {
        return operatorclassificationname;
    }

    public void setOperatorclassificationname(String operatorclassificationname) {
        this.operatorclassificationname = operatorclassificationname;
    }

    public int getFeesstatus() {
        return feesstatus;
    }

    public void setFeesstatus(int feesstatus) {
        this.feesstatus = feesstatus;
    }

    public Date getLicenseexpiredate() {
        return licenseexpiredate;
    }

    public void setLicenseexpiredate(Date licenseexpiredate) {
        this.licenseexpiredate = licenseexpiredate;
    }
}
