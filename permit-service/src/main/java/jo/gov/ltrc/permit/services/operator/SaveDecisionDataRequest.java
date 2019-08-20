package jo.gov.ltrc.permit.services.operator;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class SaveDecisionDataRequest {

    @ApiModelProperty("Decisions ID Parameter") private Long decisionsidparm ;
    @ApiModelProperty("Decisions Source Parameter") private Integer decisionssourceparm ;
    @ApiModelProperty("Vehicle Parameter") private Long vehicleparm ;
    @ApiModelProperty("Decisions Reference Parameter") private String decisionsreferenceparm ;
    @ApiModelProperty("Decisions Reference Date Parameter") private Date decisionsreferencedateparm ;
    @ApiModelProperty("Decisions Reference Subject Parameter") private String decisionsreferencesubjectparm ;
    @ApiModelProperty("Governorate Parameter") private Long governorateparm ;
    @ApiModelProperty("Decisions Text Parameter") private String decisionstextparm ;
    @ApiModelProperty("Decisions Term Parameter") private String decisionstremparm ;
    @ApiModelProperty("Decisions Term Date Parameter") private Date decisionstremdateparm ;
    @ApiModelProperty("Decisions Term Number Parameter") private String decisionstremnumberparm ;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;

    public Long getDecisionsidparm() {
        return decisionsidparm;
    }

    public void setDecisionsidparm(Long decisionsidparm) {
        this.decisionsidparm = decisionsidparm;
    }

    public Integer getDecisionssourceparm() {
        return decisionssourceparm;
    }

    public void setDecisionssourceparm(Integer decisionssourceparm) {
        this.decisionssourceparm = decisionssourceparm;
    }

    public Long getVehicleparm() {
        return vehicleparm;
    }

    public void setVehicleparm(Long vehicleparm) {
        this.vehicleparm = vehicleparm;
    }

    public String getDecisionsreferenceparm() {
        return decisionsreferenceparm;
    }

    public void setDecisionsreferenceparm(String decisionsreferenceparm) {
        this.decisionsreferenceparm = decisionsreferenceparm;
    }

    public Date getDecisionsreferencedateparm() {
        return decisionsreferencedateparm;
    }

    public void setDecisionsreferencedateparm(Date decisionsreferencedateparm) {
        this.decisionsreferencedateparm = decisionsreferencedateparm;
    }

    public String getDecisionsreferencesubjectparm() {
        return decisionsreferencesubjectparm;
    }

    public void setDecisionsreferencesubjectparm(String decisionsreferencesubjectparm) {
        this.decisionsreferencesubjectparm = decisionsreferencesubjectparm;
    }

    public Long getGovernorateparm() {
        return governorateparm;
    }

    public void setGovernorateparm(Long governorateparm) {
        this.governorateparm = governorateparm;
    }

    public String getDecisionstextparm() {
        return decisionstextparm;
    }

    public void setDecisionstextparm(String decisionstextparm) {
        this.decisionstextparm = decisionstextparm;
    }

    public String getDecisionstremparm() {
        return decisionstremparm;
    }

    public void setDecisionstremparm(String decisionstremparm) {
        this.decisionstremparm = decisionstremparm;
    }

    public Date getDecisionstremdateparm() {
        return decisionstremdateparm;
    }

    public void setDecisionstremdateparm(Date decisionstremdateparm) {
        this.decisionstremdateparm = decisionstremdateparm;
    }

    public String getDecisionstremnumberparm() {
        return decisionstremnumberparm;
    }

    public void setDecisionstremnumberparm(String decisionstremnumberparm) {
        this.decisionstremnumberparm = decisionstremnumberparm;
    }

    public Long getPrincepel() {
        return princepel;
    }

    public void setPrincepel(Long princepel) {
        this.princepel = princepel;
    }

    public Integer getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(Integer statusparm) {
        this.statusparm = statusparm;
    }

    @Override
    public String toString() {
        return "SaveDecisionDataRequest{" +
                "decisionsidparm=" + decisionsidparm +
                ", decisionssourceparm=" + decisionssourceparm +
                ", vehicleparm=" + vehicleparm +
                ", decisionsreferenceparm=" + decisionsreferenceparm +
                ", decisionsreferencedateparm=" + decisionsreferencedateparm +
                ", decisionsreferencesubjectparm=" + decisionsreferencesubjectparm +
                ", governorateparm=" + governorateparm +
                ", decisionstextparm=" + decisionstextparm +
                ", decisionstremparm=" + decisionstremparm +
                ", decisionstremdateparm=" + decisionstremdateparm +
                ", decisionstremnumberparm=" + decisionstremnumberparm +
                ", princepel=" + princepel +
                ", statusparm=" + statusparm +
                '}';
    }
}
