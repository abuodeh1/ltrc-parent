package com.etech.ltrc.permits.operator;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class ReturnDecisionDataRequest {

    @ApiModelProperty("Decisions ID Parameter") private long decisionsidparm ;
    @ApiModelProperty("Decisions Source Parameter") private int decisionssourceparm ;
    @ApiModelProperty("Vehicle Parameter") private long vehicleparm ;
    @ApiModelProperty("Plate Code Parameter") private String platecodeparm ;
    @ApiModelProperty("Plate Number Parameter") private String platenumberparm ;
    @ApiModelProperty("Decisions Reference Parameter") private String decisionsreferenceparm ;
    @ApiModelProperty("Decisions Reference Date Parameter") private Date decisionsreferencedateparm;
    @ApiModelProperty("Decisions Reference Subject Parameter") private String decisionsreferencesubjectparm ;
    @ApiModelProperty("Goverorate Parameter") private long governorateparm ;
    @ApiModelProperty("Goverorate Arabic Name Parameter") private String governoratearabicnameparm ;
    @ApiModelProperty("Decisions Text Parameter") private String decisionstextparm ;
    @ApiModelProperty("Decisions Term Parameter") private String decisionstermparm ;
    @ApiModelProperty("Decisions Term Date Parameter") private Date decisionstermdateparm ;
    @ApiModelProperty("Decisions Term Number Parameter") private String decisionstermnumberparm ;

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

    public String getPlatecodeparm() {
        return platecodeparm;
    }

    public void setPlatecodeparm(String platecodeparm) {
        this.platecodeparm = platecodeparm;
    }

    public String getPlatenumberparm() {
        return platenumberparm;
    }

    public void setPlatenumberparm(String platenumberparm) {
        this.platenumberparm = platenumberparm;
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

    public String getGovernoratearabicnameparm() {
        return governoratearabicnameparm;
    }

    public void setGovernoratearabicnameparm(String governoratearabicnameparm) {
        this.governoratearabicnameparm = governoratearabicnameparm;
    }

    public String getDecisionstextparm() {
        return decisionstextparm;
    }

    public void setDecisionstextparm(String decisionstextparm) {
        this.decisionstextparm = decisionstextparm;
    }

    public String getDecisionstermparm() {
        return decisionstermparm;
    }

    public void setDecisionstermparm(String decisionstermparm) {
        this.decisionstermparm = decisionstermparm;
    }

    public Date getDecisionstermdateparm() {
        return decisionstermdateparm;
    }

    public void setDecisionstermdateparm(Date decisionstermdateparm) {
        this.decisionstermdateparm = decisionstermdateparm;
    }

    public String getDecisionstermnumberparm() {
        return decisionstermnumberparm;
    }

    public void setDecisionstermnumberparm(String decisionstermnumberparm) {
        this.decisionstermnumberparm = decisionstermnumberparm;
    }
}
