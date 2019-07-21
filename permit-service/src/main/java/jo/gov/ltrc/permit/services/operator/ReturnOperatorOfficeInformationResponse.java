package com.etech.ltrc.permits.operator;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@NamedStoredProcedureQuery(
        name = "ReturnOperatorOfficeInformation",
        procedureName = "\"ReturnOperatorOfficeInformation\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),


        },
        resultSetMappings = {
                "ReturnOperatorOfficeInformationSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnOperatorOfficeInformationSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnOperatorOfficeInformationResponse.class)
                }
        )
})
@Entity
public class ReturnOperatorOfficeInformationResponse implements Serializable {

    @Id
    @ApiModelProperty("Operator ID ") private long operatorid ;
    @ApiModelProperty("Operator Name ") private String operatorname ;
    @ApiModelProperty("Certification Registration Number ") private String certificateregistrationnumber ;
    @ApiModelProperty("Commercial Name ") private String commercialname ;
    @ApiModelProperty("Commercial Record Number ") private String commercialrecordnumber ;
    @ApiModelProperty("Commercial Name Record Number ") private String commercialnamerecordnumber ;
    @ApiModelProperty("Employees Number ") private int employeesnumber ;
    @ApiModelProperty("Drivers Number ") private int driversnumber ;
    @ApiModelProperty("Basic Cars Number ") private int basiccarsnumber ;
    @ApiModelProperty("Working Cars Number ") private int workingcarsnumber ;
    @ApiModelProperty("Service Scope ") private String servicescope ;
    @ApiModelProperty("Office Closing Date ") private Date officeclosingdate ;

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

    public String getCertificateregistrationnumber() {
        return certificateregistrationnumber;
    }

    public void setCertificateregistrationnumber(String certificateregistrationnumber) {
        this.certificateregistrationnumber = certificateregistrationnumber;
    }

    public String getCommercialname() {
        return commercialname;
    }

    public void setCommercialname(String commercialname) {
        this.commercialname = commercialname;
    }

    public String getCommercialrecordnumber() {
        return commercialrecordnumber;
    }

    public void setCommercialrecordnumber(String commercialrecordnumber) {
        this.commercialrecordnumber = commercialrecordnumber;
    }

    public String getCommercialnamerecordnumber() {
        return commercialnamerecordnumber;
    }

    public void setCommercialnamerecordnumber(String commercialnamerecordnumber) {
        this.commercialnamerecordnumber = commercialnamerecordnumber;
    }

    public int getEmployeesnumber() {
        return employeesnumber;
    }

    public void setEmployeesnumber(int employeesnumber) {
        this.employeesnumber = employeesnumber;
    }

    public int getDriversnumber() {
        return driversnumber;
    }

    public void setDriversnumber(int driversnumber) {
        this.driversnumber = driversnumber;
    }

    public int getBasiccarsnumber() {
        return basiccarsnumber;
    }

    public void setBasiccarsnumber(int basiccarsnumber) {
        this.basiccarsnumber = basiccarsnumber;
    }

    public int getWorkingcarsnumber() {
        return workingcarsnumber;
    }

    public void setWorkingcarsnumber(int workingcarsnumber) {
        this.workingcarsnumber = workingcarsnumber;
    }

    public String getServicescope() {
        return servicescope;
    }

    public void setServicescope(String servicescope) {
        this.servicescope = servicescope;
    }

    public Date getOfficeclosingdate() {
        return officeclosingdate;
    }

    public void setOfficeclosingdate(Date officeclosingdate) {
        this.officeclosingdate = officeclosingdate;
    }
}
