package com.etech.workflow.services;

import java.sql.Date;

public class ReturnServiceRequestRequest {

    private long minServiceRequestIDParm;
    private long maxServiceRequestIDParm;
    private long ServiceTypeParm;
    private long RequestedByParm;
    private Date minRequestDateParm;
    private Date maxRequestDateParm;
    private String ApplicantPhoneNumberParm;
    private String ApplicantEmailParm;
    private long ProvinceParm    ;
    private long GovernorateParm ;
    private long MunicipalityParm;
    private long TerritoryParm   ;
    private int StatusParm ;
    private Date minCreatedDateParm ;
    private Date maxCreatedDateParm ;
    private Date minModifiedDateParm;
    private Date maxModifiedDateParm;
    private long CreatedByParm ;
    private long ModifiedByParm;

    public long getMinServiceRequestIDParm() {
        return minServiceRequestIDParm;
    }

    public void setMinServiceRequestIDParm(long minServiceRequestIDParm) {
        this.minServiceRequestIDParm = minServiceRequestIDParm;
    }

    public long getMaxServiceRequestIDParm() {
        return maxServiceRequestIDParm;
    }

    public void setMaxServiceRequestIDParm(long maxServiceRequestIDParm) {
        this.maxServiceRequestIDParm = maxServiceRequestIDParm;
    }

    public long getServiceTypeParm() {
        return ServiceTypeParm;
    }

    public void setServiceTypeParm(long serviceTypeParm) {
        ServiceTypeParm = serviceTypeParm;
    }

    public long getRequestedByParm() {
        return RequestedByParm;
    }

    public void setRequestedByParm(long requestedByParm) {
        RequestedByParm = requestedByParm;
    }

    public Date getMinRequestDateParm() {
        return minRequestDateParm;
    }

    public void setMinRequestDateParm(Date minRequestDateParm) {
        this.minRequestDateParm = minRequestDateParm;
    }

    public Date getMaxRequestDateParm() {
        return maxRequestDateParm;
    }

    public void setMaxRequestDateParm(Date maxRequestDateParm) {
        this.maxRequestDateParm = maxRequestDateParm;
    }

    public String getApplicantPhoneNumberParm() {
        return ApplicantPhoneNumberParm;
    }

    public void setApplicantPhoneNumberParm(String applicantPhoneNumberParm) {
        ApplicantPhoneNumberParm = applicantPhoneNumberParm;
    }

    public String getApplicantEmailParm() {
        return ApplicantEmailParm;
    }

    public void setApplicantEmailParm(String applicantEmailParm) {
        ApplicantEmailParm = applicantEmailParm;
    }

    public long getProvinceParm() {
        return ProvinceParm;
    }

    public void setProvinceParm(long provinceParm) {
        ProvinceParm = provinceParm;
    }

    public long getGovernorateParm() {
        return GovernorateParm;
    }

    public void setGovernorateParm(long governorateParm) {
        GovernorateParm = governorateParm;
    }

    public long getMunicipalityParm() {
        return MunicipalityParm;
    }

    public void setMunicipalityParm(long municipalityParm) {
        MunicipalityParm = municipalityParm;
    }

    public long getTerritoryParm() {
        return TerritoryParm;
    }

    public void setTerritoryParm(long territoryParm) {
        TerritoryParm = territoryParm;
    }

    public int getStatusParm() {
        return StatusParm;
    }

    public void setStatusParm(int statusParm) {
        StatusParm = statusParm;
    }

    public Date getMinCreatedDateParm() {
        return minCreatedDateParm;
    }

    public void setMinCreatedDateParm(Date minCreatedDateParm) {
        this.minCreatedDateParm = minCreatedDateParm;
    }

    public Date getMaxCreatedDateParm() {
        return maxCreatedDateParm;
    }

    public void setMaxCreatedDateParm(Date maxCreatedDateParm) {
        this.maxCreatedDateParm = maxCreatedDateParm;
    }

    public Date getMinModifiedDateParm() {
        return minModifiedDateParm;
    }

    public void setMinModifiedDateParm(Date minModifiedDateParm) {
        this.minModifiedDateParm = minModifiedDateParm;
    }

    public Date getMaxModifiedDateParm() {
        return maxModifiedDateParm;
    }

    public void setMaxModifiedDateParm(Date maxModifiedDateParm) {
        this.maxModifiedDateParm = maxModifiedDateParm;
    }

    public long getCreatedByParm() {
        return CreatedByParm;
    }

    public void setCreatedByParm(long createdByParm) {
        CreatedByParm = createdByParm;
    }

    public long getModifiedByParm() {
        return ModifiedByParm;
    }

    public void setModifiedByParm(long modifiedByParm) {
        ModifiedByParm = modifiedByParm;
    }
}



