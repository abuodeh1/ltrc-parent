package jo.gov.ltrc.permit.services.license;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@NamedStoredProcedureQuery(
        name = "ReturnOperatorLicenseInformation",
        procedureName = "\"ReturnOperatorLicenseInformation\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),



        },
        resultSetMappings = {
                "ReturnOperatorLicenseInformationSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnOperatorLicenseInformationSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnOperatorLicenseInformationResponse.class)
                }
        )
})
@Entity
public class ReturnOperatorLicenseInformationResponse implements Serializable {

    @Id
    @ApiModelProperty("Operator License ID ") private long operatorlicenseid ;
    @ApiModelProperty("Issue Date ") private Date issuedate ;
    @ApiModelProperty("Operator ID ") private long operatorid ;
    @ApiModelProperty("Operator Name ") private String operatorname ;
    @ApiModelProperty("License Start Date ") private Date licensestartdate ;
    @ApiModelProperty("License End Date ") private Date licenseenddate ;
    @ApiModelProperty("License Status ") private int liecencsestatus ;
    @ApiModelProperty("Print Date ") private Date printingdate ;
    @ApiModelProperty("Counter ") private int counter ;
    @ApiModelProperty("Operator Category ") private long operatorcategory ;
    @ApiModelProperty("Operator Category Name ") private String operatorcategoryname ;

    public long getOperatorlicenseid() {
        return operatorlicenseid;
    }

    public void setOperatorlicenseid(long operatorlicenseid) {
        this.operatorlicenseid = operatorlicenseid;
    }

    public Date getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(Date issuedate) {
        this.issuedate = issuedate;
    }

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

    public Date getLicensestartdate() {
        return licensestartdate;
    }

    public void setLicensestartdate(Date licensestartdate) {
        this.licensestartdate = licensestartdate;
    }

    public Date getLicenseenddate() {
        return licenseenddate;
    }

    public void setLicenseenddate(Date licenseenddate) {
        this.licenseenddate = licenseenddate;
    }

    public int getLiecencsestatus() {
        return liecencsestatus;
    }

    public void setLiecencsestatus(int liecencsestatus) {
        this.liecencsestatus = liecencsestatus;
    }

    public Date getPrintingdate() {
        return printingdate;
    }

    public void setPrintingdate(Date printingdate) {
        this.printingdate = printingdate;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
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
}
