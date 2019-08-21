package jo.gov.ltrc.permit.services.violation;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@NamedStoredProcedureQuery(
        name = "ReturnViolation",
        procedureName = "\"ReturnViolation\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "minviolationidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "maxviolationidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "minviolationdateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "maxviolationdateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "violationtypeparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "violationsubjectparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "violationpenaltyparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "registrationnumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "platecodeparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "platenumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "driverparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "lineidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "vehicleparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatoridparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "operatornameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "violationreferenceparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "minviolationreferencedateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "maxviolationreferencedateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "cancellationofarrestorderreferenceparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "mincancellationofarrestorderdateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "maxcancellationofarrestorderdateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "ViolationByParm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "pagesize"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "pageindex"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "sorttype"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "sortby"),





        },
        resultSetMappings = {
                "ReturnViolationSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnViolationSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnViolationResponse.class)
                }
        )
})
@Entity
public class ReturnViolationResponse implements Serializable {

    @Id
    @ApiModelProperty("Violation ID ") private Long violationid ;
    @ApiModelProperty("Violation Date ") private Date violationdate ;
    @ApiModelProperty("Violation By ") private Integer violationby ;
    @ApiModelProperty("Violation Type ") private Long violationtype ;
    @ApiModelProperty("Violation Type Name ") private String violationtypename ;
    @ApiModelProperty("Violation Subject ") private Long violationsubject ;
    @ApiModelProperty("Violation Subject Name ") private String violationsubjectname ;
    @ApiModelProperty("Violation Penalty ") private Long violationpenalty ;
    @ApiModelProperty("Violation Penalty Name ") private String violationpenaltyname ;
    @ApiModelProperty("Status ") private Integer status ;
    @ApiModelProperty("Vehicle ") private Long vehicle ;
    @ApiModelProperty("Plate Code ") private String platecode ;
    @ApiModelProperty("Plate Number ") private String platenumber ;
    @ApiModelProperty("Driver ") private String driver ;
    @ApiModelProperty("Line Id ") private Long lineid ;
    @ApiModelProperty("Line Name ") private String linename ;
    @ApiModelProperty("Violation Reference ") private String violationreference ;
    @ApiModelProperty("Violation Reference Date ") private Date violationreferencedate ;
    @ApiModelProperty("Cancellation of Arrest Order Reference ") private String cancellationofarrestorderreference ;
    @ApiModelProperty("Cancellation of Arrest Order Date ") private Date cancellationofarrestorderdate ;
    @ApiModelProperty("Created Date ") private Date createddate ;
    @ApiModelProperty("Created By ") private Long createdby ;
    @ApiModelProperty("Created By Name ") private String CreatedByName ;
    @ApiModelProperty("Modified Date ") private Date modifieddate ;
    @ApiModelProperty("Modified By ") private Long modifiedby ;
    @ApiModelProperty("Modified By Name ") private String ModifiedByName ;
    @ApiModelProperty("Operator ID ") private Long operatorID;
    @ApiModelProperty("Operator Name ") private String operatorName;
    @ApiModelProperty("Violation Operator Parameter ") private Long ViolationOperator ;
    @ApiModelProperty("Violation Operator Name Parameter ") private String ViolationOperatorName ;

    public Long getViolationid() {
        return violationid;
    }

    public void setViolationid(Long violationid) {
        this.violationid = violationid;
    }

    public Date getViolationdate() {
        return violationdate;
    }

    public void setViolationdate(Date violationdate) {
        this.violationdate = violationdate;
    }

    public Integer getViolationby() {
        return violationby;
    }

    public void setViolationby(Integer violationby) {
        this.violationby = violationby;
    }

    public Long getViolationtype() {
        return violationtype;
    }

    public void setViolationtype(Long violationtype) {
        this.violationtype = violationtype;
    }

    public String getViolationtypename() {
        return violationtypename;
    }

    public void setViolationtypename(String violationtypename) {
        this.violationtypename = violationtypename;
    }

    public Long getViolationsubject() {
        return violationsubject;
    }

    public void setViolationsubject(Long violationsubject) {
        this.violationsubject = violationsubject;
    }

    public String getViolationsubjectname() {
        return violationsubjectname;
    }

    public void setViolationsubjectname(String violationsubjectname) {
        this.violationsubjectname = violationsubjectname;
    }

    public Long getViolationpenalty() {
        return violationpenalty;
    }

    public void setViolationpenalty(Long violationpenalty) {
        this.violationpenalty = violationpenalty;
    }

    public String getViolationpenaltyname() {
        return violationpenaltyname;
    }

    public void setViolationpenaltyname(String violationpenaltyname) {
        this.violationpenaltyname = violationpenaltyname;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getVehicle() {
        return vehicle;
    }

    public void setVehicle(Long vehicle) {
        this.vehicle = vehicle;
    }

    public String getPlatecode() {
        return platecode;
    }

    public void setPlatecode(String platecode) {
        this.platecode = platecode;
    }

    public String getPlatenumber() {
        return platenumber;
    }

    public void setPlatenumber(String platenumber) {
        this.platenumber = platenumber;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public Long getLineid() {
        return lineid;
    }

    public void setLineid(Long lineid) {
        this.lineid = lineid;
    }

    public String getLinename() {
        return linename;
    }

    public void setLinename(String linename) {
        this.linename = linename;
    }

    public String getViolationreference() {
        return violationreference;
    }

    public void setViolationreference(String violationreference) {
        this.violationreference = violationreference;
    }

    public Date getViolationreferencedate() {
        return violationreferencedate;
    }

    public void setViolationreferencedate(Date violationreferencedate) {
        this.violationreferencedate = violationreferencedate;
    }

    public String getCancellationofarrestorderreference() {
        return cancellationofarrestorderreference;
    }

    public void setCancellationofarrestorderreference(String cancellationofarrestorderreference) {
        this.cancellationofarrestorderreference = cancellationofarrestorderreference;
    }

    public Date getCancellationofarrestorderdate() {
        return cancellationofarrestorderdate;
    }

    public void setCancellationofarrestorderdate(Date cancellationofarrestorderdate) {
        this.cancellationofarrestorderdate = cancellationofarrestorderdate;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public Long getCreatedby() {
        return createdby;
    }

    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    public String getCreatedByName() {
        return CreatedByName;
    }

    public void setCreatedByName(String createdByName) {
        CreatedByName = createdByName;
    }

    public Date getModifieddate() {
        return modifieddate;
    }

    public void setModifieddate(Date modifieddate) {
        this.modifieddate = modifieddate;
    }

    public Long getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(Long modifiedby) {
        this.modifiedby = modifiedby;
    }

    public String getModifiedByName() {
        return ModifiedByName;
    }

    public void setModifiedByName(String modifiedByName) {
        ModifiedByName = modifiedByName;
    }

    public Long getOperatorID() {
        return operatorID;
    }

    public void setOperatorID(Long operatorID) {
        this.operatorID = operatorID;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public Long getViolationOperator() {
        return ViolationOperator;
    }

    public void setViolationOperator(Long violationOperator) {
        ViolationOperator = violationOperator;
    }

    public String getViolationOperatorName() {
        return ViolationOperatorName;
    }

    public void setViolationOperatorName(String violationOperatorName) {
        ViolationOperatorName = violationOperatorName;
    }

    @Override
    public String toString() {
        return "ReturnViolationResponse{" +
                "violationid=" + violationid +
                ", violationdate=" + violationdate +
                ", violationby=" + violationby +
                ", violationtype=" + violationtype +
                ", violationtypename=" + violationtypename +
                ", violationsubject=" + violationsubject +
                ", violationsubjectname=" + violationsubjectname +
                ", violationpenalty=" + violationpenalty +
                ", violationpenaltyname=" + violationpenaltyname +
                ", status=" + status +
                ", vehicle=" + vehicle +
                ", platecode=" + platecode +
                ", platenumber=" + platenumber +
                ", driver=" + driver +
                ", lineid=" + lineid +
                ", linename=" + linename +
                ", violationreference=" + violationreference +
                ", violationreferencedate=" + violationreferencedate +
                ", cancellationofarrestorderreference=" + cancellationofarrestorderreference +
                ", cancellationofarrestorderdate=" + cancellationofarrestorderdate +
                ", createddate=" + createddate +
                ", createdby=" + createdby +
                ", CreatedByName=" + CreatedByName +
                ", modifieddate=" + modifieddate +
                ", modifiedby=" + modifiedby +
                ", ModifiedByName=" + ModifiedByName +
                ", operatorID=" + operatorID +
                ", operatorName=" + operatorName +
                ", ViolationOperator=" + ViolationOperator +
                ", ViolationOperatorName=" + ViolationOperatorName +
                '}';
    }
}
