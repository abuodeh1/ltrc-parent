package com.etech.ltrc.permits.operator;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@NamedStoredProcedureQuery(
        name = "ReturnDecision",
        procedureName = "\"ReturnDecision\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),


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
        @ApiModelProperty("Decisions ID ") private long decisionsid ;
    @ApiModelProperty("Decisions Source ") private int decisionssource ;
    @ApiModelProperty("Vehicle ") private long vehicle ;
    @ApiModelProperty("Plate Code ") private  String platecode ;
    @ApiModelProperty("Plate Number ") private  String platenumber ;
    @ApiModelProperty("Decisions Reference ") private  String decisionsreference ;
    @ApiModelProperty("Decisions Reference Date ") private Date decisionsreferencedate ;
    @ApiModelProperty("Decisions Reference Subject") private  String decisionsreferencesubject ;
    @ApiModelProperty("Governorate ") private long governorate ;
    @ApiModelProperty("Governorate Arabic Name ") private  String governoratearabicname ;
    @ApiModelProperty("Decisions Text ") private  String decisionstext ;
    @ApiModelProperty("Decisions Term") private  String decisionsterm ;
    @ApiModelProperty("Decisions Term Date ") private Date decisionstermdate ;
    @ApiModelProperty("Decisions Term Number ") private  String decisionstermnumber ;

    public long getDecisionsid() {
        return decisionsid;
    }

    public void setDecisionsid(long decisionsid) {
        this.decisionsid = decisionsid;
    }

    public int getDecisionssource() {
        return decisionssource;
    }

    public void setDecisionssource(int decisionssource) {
        this.decisionssource = decisionssource;
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

    public long getGovernorate() {
        return governorate;
    }

    public void setGovernorate(long governorate) {
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
}
