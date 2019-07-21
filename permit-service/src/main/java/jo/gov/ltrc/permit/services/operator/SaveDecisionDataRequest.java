package jo.gov.ltrc.permit.services.operator;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class SaveDecisionDataRequest {

    @ApiModelProperty("Decisions ID Parameter") private long decisionsidparm ;
    @ApiModelProperty("Decisions Source Parameter") private int decisionssourceparm ;
    @ApiModelProperty("Vehicle Parameter") private long vehicleparm ;
    @ApiModelProperty("Decisions Reference Parameter") private String decisionsreferenceparm ;
    @ApiModelProperty("Decisions Reference Date Parameter") private Date decisionsreferencedateparm ;
    @ApiModelProperty("Decisions Reference Subject Parameter") private String decisionsreferencesubjectparm ;
    @ApiModelProperty("Governorate Parameter") private long governorateparm ;
    @ApiModelProperty("Decisions Text Parameter") private String decisionstextparm ;
    @ApiModelProperty("Decisions Term Parameter") private String decisionstremparm ;
    @ApiModelProperty("Decisions Term Date Parameter") private Date decisionstremdateparm ;
    @ApiModelProperty("Decisions Term Number Parameter") private String decisionstremnumberparm ;
    @ApiModelProperty("Principal Parameter ") private long princepel ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;

    public long getDecisionsidparm() {
        return decisionsidparm;
    }

    public void setDecisionsidparm(long decisionsidparm) {
        this.decisionsidparm = decisionsidparm;
    }

    public int getDecisionssourceparm() {
        return decisionssourceparm;
    }

    public void setDecisionssourceparm(int decisionssourceparm) {
        this.decisionssourceparm = decisionssourceparm;
    }

    public long getVehicleparm() {
        return vehicleparm;
    }

    public void setVehicleparm(long vehicleparm) {
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

    public long getGovernorateparm() {
        return governorateparm;
    }

    public void setGovernorateparm(long governorateparm) {
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

    public long getPrincepel() {
        return princepel;
    }

    public void setPrincepel(long princepel) {
        this.princepel = princepel;
    }

    public int getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(int statusparm) {
        this.statusparm = statusparm;
    }
}
