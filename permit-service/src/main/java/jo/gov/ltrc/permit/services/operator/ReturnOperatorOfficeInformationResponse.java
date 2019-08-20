package jo.gov.ltrc.permit.services.operator;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@NamedStoredProcedureQuery(
        name = "ReturnOperatorOfficeInformation",
        procedureName = "\"ReturnOperatorOfficeInformation\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "certificateregistrationnumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "commercialrecordnumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "commercialnamerecordnumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "minemployeesnumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "maxemployeesnumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "mindriversnumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "maxdriversnumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "minbasiccarsnumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "maxbasiccarsnumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "minworkingcarsnumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "maxworkingcarsnumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "servicescopeparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "officeclosingdateparm"),


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
    @ApiModelProperty("Operator ID ") private Long operatorid ;
    @ApiModelProperty("Operator Name ") private String operatorname ;
    @ApiModelProperty("Certification Registration Number ") private String certificateregistrationnumber ;
    @ApiModelProperty("Commercial Name ") private String commercialname ;
    @ApiModelProperty("Commercial Record Number ") private String commercialrecordnumber ;
    @ApiModelProperty("Commercial Name Record Number ") private String commercialnamerecordnumber ;
    @ApiModelProperty("Employees Number ") private Integer employeesnumber ;
    @ApiModelProperty("Drivers Number ") private Integer driversnumber ;
    @ApiModelProperty("Basic Cars Number ") private Integer basiccarsnumber ;
    @ApiModelProperty("Working Cars Number ") private Integer workingcarsnumber ;
    @ApiModelProperty("Service Scope ") private String servicescope ;
    @ApiModelProperty("Office Closing Date ") private Date officeclosingdate ;

    public Long getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(Long operatorid) {
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

    public Integer getEmployeesnumber() {
        return employeesnumber;
    }

    public void setEmployeesnumber(Integer employeesnumber) {
        this.employeesnumber = employeesnumber;
    }

    public Integer getDriversnumber() {
        return driversnumber;
    }

    public void setDriversnumber(Integer driversnumber) {
        this.driversnumber = driversnumber;
    }

    public Integer getBasiccarsnumber() {
        return basiccarsnumber;
    }

    public void setBasiccarsnumber(Integer basiccarsnumber) {
        this.basiccarsnumber = basiccarsnumber;
    }

    public Integer getWorkingcarsnumber() {
        return workingcarsnumber;
    }

    public void setWorkingcarsnumber(Integer workingcarsnumber) {
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

    @Override
    public String toString() {
        return "ReturnOperatorOfficeInformationResponse{" +
                "operatorid=" + operatorid +
                ", operatorname=" + operatorname +
                ", certificateregistrationnumber=" + certificateregistrationnumber +
                ", commercialname=" + commercialname +
                ", commercialrecordnumber=" + commercialrecordnumber +
                ", commercialnamerecordnumber=" + commercialnamerecordnumber +
                ", employeesnumber=" + employeesnumber +
                ", driversnumber=" + driversnumber +
                ", basiccarsnumber=" + basiccarsnumber +
                ", workingcarsnumber=" + workingcarsnumber +
                ", servicescope=" + servicescope +
                ", officeclosingdate=" + officeclosingdate +
                '}';
    }
}
