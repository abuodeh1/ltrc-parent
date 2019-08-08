package jo.gov.ltrc.permit.services.violation;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@NamedStoredProcedureQuery(
        name = "ReturnViolation",
        procedureName = "\"ReturnViolation\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),





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
    @ApiModelProperty("Violation ID ") private long violationid ;
    @ApiModelProperty("Violation Date ") private Date violationdate ;
    @ApiModelProperty("Violation By ") private int violationby ;
    @ApiModelProperty("Violation Type ") private long violationtype ;
    @ApiModelProperty("Violation Type Name ") private String violationtypename ;
    @ApiModelProperty("Violation Subject ") private long violationsubject ;
    @ApiModelProperty("Violation Subject Name ") private String violationsubjectname ;
    @ApiModelProperty("Violation Penalty ") private long violationpenalty ;
    @ApiModelProperty("Violation Penalty Name ") private String violationpenaltyname ;
    @ApiModelProperty("Status ") private int status ;
    @ApiModelProperty("Vehicle ") private long vehicle ;
    @ApiModelProperty("Plate Code ") private String platecode ;
    @ApiModelProperty("Plate Number ") private String platenumber ;
    @ApiModelProperty("Driver ") private String driver ;
    @ApiModelProperty("Line Id ") private long lineid ;
    @ApiModelProperty("Line Name ") private String linename ;
    @ApiModelProperty("Violation Reference ") private String violationreference ;
    @ApiModelProperty("Violation Reference Date ") private Date violationreferencedate ;
    @ApiModelProperty("Cancellation of Arrest Order Reference ") private String cancellationofarrestorderreference ;
    @ApiModelProperty("Cancellation of Arrest Order Date ") private Date cancellationofarrestorderdate ;
    @ApiModelProperty("Created Date ") private Date createddate ;
    @ApiModelProperty("Created By ") private long createdby ;
    @ApiModelProperty("Created By Name ") private String CreatedByName ;
    @ApiModelProperty("Modified Date ") private Date modifieddate ;
    @ApiModelProperty("Modified By ") private long modifiedby ;
    @ApiModelProperty("Modified By Name ") private String ModifiedByName ;
    @ApiModelProperty("Operator ID ") private long operatorID;
    @ApiModelProperty("Operator Name ") private String operatorName;
    @ApiModelProperty("Violation Operator Parameter ") private long ViolationOperator ;
    @ApiModelProperty("Violation Operator Name Parameter ") private String ViolationOperatorName ;


    public long getViolationid() {
        return violationid;
    }

    public void setViolationid(long violationid) {
        this.violationid = violationid;
    }

    public Date getViolationdate() {
        return violationdate;
    }

    public void setViolationdate(Date violationdate) {
        this.violationdate = violationdate;
    }

    public int getViolationby() {
        return violationby;
    }

    public void setViolationby(int violationby) {
        this.violationby = violationby;
    }

    public long getViolationtype() {
        return violationtype;
    }

    public void setViolationtype(long violationtype) {
        this.violationtype = violationtype;
    }

    public String getViolationtypename() {
        return violationtypename;
    }

    public void setViolationtypename(String violationtypename) {
        this.violationtypename = violationtypename;
    }

    public long getViolationsubject() {
        return violationsubject;
    }

    public void setViolationsubject(long violationsubject) {
        this.violationsubject = violationsubject;
    }

    public String getViolationsubjectname() {
        return violationsubjectname;
    }

    public void setViolationsubjectname(String violationsubjectname) {
        this.violationsubjectname = violationsubjectname;
    }

    public long getViolationpenalty() {
        return violationpenalty;
    }

    public void setViolationpenalty(long violationpenalty) {
        this.violationpenalty = violationpenalty;
    }

    public String getViolationpenaltyname() {
        return violationpenaltyname;
    }

    public void setViolationpenaltyname(String violationpenaltyname) {
        this.violationpenaltyname = violationpenaltyname;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getVehicle() {
        return vehicle;
    }

    public void setVehicle(long vehicle) {
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

    public long getLineid() {
        return lineid;
    }

    public void setLineid(long lineid) {
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

    public long getCreatedby() {
        return createdby;
    }

    public void setCreatedby(long createdby) {
        this.createdby = createdby;
    }

    public Date getModifieddate() {
        return modifieddate;
    }

    public void setModifieddate(Date modifieddate) {
        this.modifieddate = modifieddate;
    }

    public long getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(long modifiedby) {
        this.modifiedby = modifiedby;
    }

    public String getCreatedByName() {
        return CreatedByName;
    }

    public void setCreatedByName(String createdByName) {
        CreatedByName = createdByName;
    }

    public String getModifiedByName() {
        return ModifiedByName;
    }

    public void setModifiedByName(String modifiedByName) {
        ModifiedByName = modifiedByName;
    }

    public long getOperatorID() {
        return operatorID;
    }

    public void setOperatorID(long operatorID) {
        this.operatorID = operatorID;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public long getViolationOperator() {
        return ViolationOperator;
    }

    public void setViolationOperator(long violationOperator) {
        ViolationOperator = violationOperator;
    }

    public String getViolationOperatorName() {
        return ViolationOperatorName;
    }

    public void setViolationOperatorName(String violationOperatorName) {
        ViolationOperatorName = violationOperatorName;
    }
}
