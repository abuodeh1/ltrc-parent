package jo.gov.ltrc.permit.services.operator;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@NamedStoredProcedureQuery(
        name = "ReturnDecision",
        procedureName = "\"ReturnDecision\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "decisionsidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "decisionssourceparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "vehicleparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "platecodeparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "platenumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "decisionsreferenceparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "decisionsreferencedateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "decisionsreferencesubjectparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "governorateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "governoratearabicnameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "decisionstextparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "decisionstermparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "decisionstermdateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "decisionstermnumberparm"),


        },
        resultSetMappings = {
                "ReturnDecisionSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnDecisionSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnDecisionResponse.class)
                }
        )
})
@Entity
public class ReturnDecisionResponse implements Serializable {

    @Id
    @ApiModelProperty("Decisions ID ") private Long decisionsid ;
    @ApiModelProperty("Decisions Source ") private Integer decisionssource ;
    @ApiModelProperty("Vehicle ") private Long vehicle ;
    @ApiModelProperty("Plate Code ") private  String platecode ;
    @ApiModelProperty("Plate Number ") private  String platenumber ;
    @ApiModelProperty("Decisions Reference ") private  String decisionsreference ;
    @ApiModelProperty("Decisions Reference Date ") private Date decisionsreferencedate ;
    @ApiModelProperty("Decisions Reference Subject") private  String decisionsreferencesubject ;
    @ApiModelProperty("Governorate ") private Long governorate ;
    @ApiModelProperty("Governorate Arabic Name ") private  String governoratearabicname ;
    @ApiModelProperty("Decisions Text ") private  String decisionstext ;
    @ApiModelProperty("Decisions Term") private  String decisionsterm ;
    @ApiModelProperty("Decisions Term Date ") private Date decisionstermdate ;
    @ApiModelProperty("Decisions Term Number ") private  String decisionstermnumber ;

    public Long getDecisionsid() {
        return decisionsid;
    }

    public void setDecisionsid(Long decisionsid) {
        this.decisionsid = decisionsid;
    }

    public Integer getDecisionssource() {
        return decisionssource;
    }

    public void setDecisionssource(Integer decisionssource) {
        this.decisionssource = decisionssource;
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

    public String getDecisionsreference() {
        return decisionsreference;
    }

    public void setDecisionsreference(String decisionsreference) {
        this.decisionsreference = decisionsreference;
    }

    public Date getDecisionsreferencedate() {
        return decisionsreferencedate;
    }

    public void setDecisionsreferencedate(Date decisionsreferencedate) {
        this.decisionsreferencedate = decisionsreferencedate;
    }

    public String getDecisionsreferencesubject() {
        return decisionsreferencesubject;
    }

    public void setDecisionsreferencesubject(String decisionsreferencesubject) {
        this.decisionsreferencesubject = decisionsreferencesubject;
    }

    public Long getGovernorate() {
        return governorate;
    }

    public void setGovernorate(Long governorate) {
        this.governorate = governorate;
    }

    public String getGovernoratearabicname() {
        return governoratearabicname;
    }

    public void setGovernoratearabicname(String governoratearabicname) {
        this.governoratearabicname = governoratearabicname;
    }

    public String getDecisionstext() {
        return decisionstext;
    }

    public void setDecisionstext(String decisionstext) {
        this.decisionstext = decisionstext;
    }

    public String getDecisionsterm() {
        return decisionsterm;
    }

    public void setDecisionsterm(String decisionsterm) {
        this.decisionsterm = decisionsterm;
    }

    public Date getDecisionstermdate() {
        return decisionstermdate;
    }

    public void setDecisionstermdate(Date decisionstermdate) {
        this.decisionstermdate = decisionstermdate;
    }

    public String getDecisionstermnumber() {
        return decisionstermnumber;
    }

    public void setDecisionstermnumber(String decisionstermnumber) {
        this.decisionstermnumber = decisionstermnumber;
    }

    @Override
    public String toString() {
        return "ReturnDecisionResponse{" +
                "decisionsid=" + decisionsid +
                ", decisionssource=" + decisionssource +
                ", vehicle=" + vehicle +
                ", platecode=" + platecode +
                ", platenumber=" + platenumber +
                ", decisionsreference=" + decisionsreference +
                ", decisionsreferencedate=" + decisionsreferencedate +
                ", decisionsreferencesubject=" + decisionsreferencesubject +
                ", governorate=" + governorate +
                ", governoratearabicname=" + governoratearabicname +
                ", decisionstext=" + decisionstext +
                ", decisionsterm=" + decisionsterm +
                ", decisionstermdate=" + decisionstermdate +
                ", decisionstermnumber=" + decisionstermnumber +
                '}';
    }
}
