package com.etech.workflow.services;

import java.sql.Date;

public class SaveServiceRequestDataRequest {

    private long servicerequestidparm;
    private long servicetypeparm;
    private long requestedbyparm;
    private Date requestdateparm;
    private String applicantphonenumberparm;
    private String applicantemailparm;
    private long provinceparm;
    private long governorateparm;
    private long municipalityparm;
    private long territoryparm;
    private int statusparm;
    private long princepal;

    public long getServicerequestidparm() {
        return servicerequestidparm;
    }

    public void setServicerequestidparm(long servicerequestidparm) {
        this.servicerequestidparm = servicerequestidparm;
    }

    public long getServicetypeparm() {
        return servicetypeparm;
    }

    public void setServicetypeparm(long servicetypeparm) {
        this.servicetypeparm = servicetypeparm;
    }

    public long getRequestedbyparm() {
        return requestedbyparm;
    }

    public void setRequestedbyparm(long requestedbyparm) {
        this.requestedbyparm = requestedbyparm;
    }

    public Date getRequestdateparm() {
        return requestdateparm;
    }

    public void setRequestdateparm(Date requestdateparm) {
        this.requestdateparm = requestdateparm;
    }

    public String getApplicantphonenumberparm() {
        return applicantphonenumberparm;
    }

    public void setApplicantphonenumberparm(String applicantphonenumberparm) {
        this.applicantphonenumberparm = applicantphonenumberparm;
    }

    public String getApplicantemailparm() {
        return applicantemailparm;
    }

    public void setApplicantemailparm(String applicantemailparm) {
        this.applicantemailparm = applicantemailparm;
    }

    public long getProvinceparm() {
        return provinceparm;
    }

    public void setProvinceparm(long provinceparm) {
        this.provinceparm = provinceparm;
    }

    public long getGovernorateparm() {
        return governorateparm;
    }

    public void setGovernorateparm(long governorateparm) {
        this.governorateparm = governorateparm;
    }

    public long getMunicipalityparm() {
        return municipalityparm;
    }

    public void setMunicipalityparm(long municipalityparm) {
        this.municipalityparm = municipalityparm;
    }

    public long getTerritoryparm() {
        return territoryparm;
    }

    public void setTerritoryparm(long territoryparm) {
        this.territoryparm = territoryparm;
    }

    public int getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(int statusparm) {
        this.statusparm = statusparm;
    }

    public long getPrincepal() {
        return princepal;
    }

    public void setPrincepal(long princepal) {
        this.princepal = princepal;
    }
}



