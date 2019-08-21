package jo.gov.ltrc.permit.services.operator;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@NamedStoredProcedureQuery(
        name = "ReturnOperatorByOperatorBasicInformation",
        procedureName = "\"ReturnOperatorByOperatorBasicInformation\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "minoperatoridparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "maxoperatoridparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "licenseissuedateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "licenseexpiredateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatorclassificationparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatorcategoryparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "operatornationalidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "operatornameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "operatorcomercialnameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "provinceparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "governorateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "municipalityparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "territoryparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "streetparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "neighborhoodparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "emaiparml"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "poboxparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "phonenumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "mobilephonenumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "faxnumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "licensepurposeparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "feesstatusparm"),

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
    @ApiModelProperty("Operator ID ") private Long operatorid ;
    @ApiModelProperty("Operator Name ") private String operatorname ;
    @ApiModelProperty("Operator Category ") private Long operatorcategory ;
    @ApiModelProperty("Operator Category Name ") private String operatorcategoryname ;
    @ApiModelProperty("Operator Classification") private Long operatorclassification ;
    @ApiModelProperty("Operator Classification Name ") private String operatorclassificationname ;
    @ApiModelProperty("Fees Status ") private Integer feesstatus ;
    @ApiModelProperty("License Expired ") private Date licenseexpiredate ;

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

    public Long getOperatorcategory() {
        return operatorcategory;
    }

    public void setOperatorcategory(Long operatorcategory) {
        this.operatorcategory = operatorcategory;
    }

    public String getOperatorcategoryname() {
        return operatorcategoryname;
    }

    public void setOperatorcategoryname(String operatorcategoryname) {
        this.operatorcategoryname = operatorcategoryname;
    }

    public Long getOperatorclassification() {
        return operatorclassification;
    }

    public void setOperatorclassification(Long operatorclassification) {
        this.operatorclassification = operatorclassification;
    }

    public String getOperatorclassificationname() {
        return operatorclassificationname;
    }

    public void setOperatorclassificationname(String operatorclassificationname) {
        this.operatorclassificationname = operatorclassificationname;
    }

    public Integer getFeesstatus() {
        return feesstatus;
    }

    public void setFeesstatus(Integer feesstatus) {
        this.feesstatus = feesstatus;
    }

    public Date getLicenseexpiredate() {
        return licenseexpiredate;
    }

    public void setLicenseexpiredate(Date licenseexpiredate) {
        this.licenseexpiredate = licenseexpiredate;
    }

    @Override
    public String toString() {
        return "ReturnOperatorByOperatorBasicInformationResponse{" +
                "operatorid=" + operatorid +
                ", operatorname=" + operatorname +
                ", operatorcategory=" + operatorcategory +
                ", operatorcategoryname=" + operatorcategoryname +
                ", operatorclassification=" + operatorclassification +
                ", operatorclassificationname=" + operatorclassificationname +
                ", feesstatus=" + feesstatus +
                ", licenseexpiredate=" + licenseexpiredate +
                '}';
    }
}
