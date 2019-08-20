package jo.gov.ltrc.workflow.services;

import java.sql.Date;

public class ReturnServiceRequestRequest {

    private Long minServiceRequestIDParm;
    private Long maxServiceRequestIDParm;
    private Long ServiceTypeParm;
    private Long RequestedByParm;
    private Date minRequestDateParm;
    private Date maxRequestDateParm;
    private String ApplicantPhoneNumberParm;
    private String ApplicantEmailParm;
    private Long ProvinceParm    ;
    private Long GovernorateParm ;
    private Long MunicipalityParm;
    private Long TerritoryParm   ;
    private Integer StatusParm ;
    private Date minCreatedDateParm ;
    private Date maxCreatedDateParm ;
    private Date minModifiedDateParm;
    private Date maxModifiedDateParm;
    private Long CreatedByParm ;
    private Long ModifiedByParm;

    public Long getMinServiceRequestIDParm() {
        return minServiceRequestIDParm;
    }

    public void setMinServiceRequestIDParm(Long minServiceRequestIDParm) {
        this.minServiceRequestIDParm = minServiceRequestIDParm;
    }

    public Long getMaxServiceRequestIDParm() {
        return maxServiceRequestIDParm;
    }

    public void setMaxServiceRequestIDParm(Long maxServiceRequestIDParm) {
        this.maxServiceRequestIDParm = maxServiceRequestIDParm;
    }

    public Long getServiceTypeParm() {
        return ServiceTypeParm;
    }

    public void setServiceTypeParm(Long serviceTypeParm) {
        ServiceTypeParm = serviceTypeParm;
    }

    public Long getRequestedByParm() {
        return RequestedByParm;
    }

    public void setRequestedByParm(Long requestedByParm) {
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

    public Long getProvinceParm() {
        return ProvinceParm;
    }

    public void setProvinceParm(Long provinceParm) {
        ProvinceParm = provinceParm;
    }

    public Long getGovernorateParm() {
        return GovernorateParm;
    }

    public void setGovernorateParm(Long governorateParm) {
        GovernorateParm = governorateParm;
    }

    public Long getMunicipalityParm() {
        return MunicipalityParm;
    }

    public void setMunicipalityParm(Long municipalityParm) {
        MunicipalityParm = municipalityParm;
    }

    public Long getTerritoryParm() {
        return TerritoryParm;
    }

    public void setTerritoryParm(Long territoryParm) {
        TerritoryParm = territoryParm;
    }

    public Integer getStatusParm() {
        return StatusParm;
    }

    public void setStatusParm(Integer statusParm) {
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

    public Long getCreatedByParm() {
        return CreatedByParm;
    }

    public void setCreatedByParm(Long createdByParm) {
        CreatedByParm = createdByParm;
    }

    public Long getModifiedByParm() {
        return ModifiedByParm;
    }

    public void setModifiedByParm(Long modifiedByParm) {
        ModifiedByParm = modifiedByParm;
    }


    @Override
    public String toString() {
        return "ReturnServiceRequestRequest{" +
                "minServiceRequestIDParm=" + minServiceRequestIDParm +
                ", maxServiceRequestIDParm=" + maxServiceRequestIDParm +
                ", ServiceTypeParm=" + ServiceTypeParm +
                ", RequestedByParm=" + RequestedByParm +
                ", minRequestDateParm=" + minRequestDateParm +
                ", maxRequestDateParm=" + maxRequestDateParm +
                ", ApplicantPhoneNumberParm= " + ApplicantPhoneNumberParm + 
                ", ApplicantEmailParm= " + ApplicantEmailParm + 
                ", ProvinceParm=" + ProvinceParm +
                ", GovernorateParm=" + GovernorateParm +
                ", MunicipalityParm=" + MunicipalityParm +
                ", TerritoryParm=" + TerritoryParm +
                ", StatusParm=" + StatusParm +
                ", minCreatedDateParm=" + minCreatedDateParm +
                ", maxCreatedDateParm=" + maxCreatedDateParm +
                ", minModifiedDateParm=" + minModifiedDateParm +
                ", maxModifiedDateParm=" + maxModifiedDateParm +
                ", CreatedByParm=" + CreatedByParm +
                ", ModifiedByParm=" + ModifiedByParm +
                '}';
    }
}



