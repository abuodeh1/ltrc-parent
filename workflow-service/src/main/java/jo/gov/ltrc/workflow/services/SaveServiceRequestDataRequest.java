package jo.gov.ltrc.workflow.services;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class SaveServiceRequestDataRequest {

    @ApiModelProperty("Service Request ID Parameter ") private Long servicerequestidparm;
    @ApiModelProperty("Service Type Parameter ") private Long servicetypeparm;
    @ApiModelProperty("Requested By Parameter ") private Long requestedbyparm;
    @ApiModelProperty("Request Date Parameter ") private Date requestdateparm;
    @ApiModelProperty("Applicant Phone Number Parameter ") private String applicantphonenumberparm;
    @ApiModelProperty("Applicant E-Mail Parameter ") private String applicantemailparm;
    @ApiModelProperty("Province Parameter ") private Long provinceparm;
    @ApiModelProperty("Governorate Parameter ") private Long governorateparm;
    @ApiModelProperty("Municipality Parameter ") private Long municipalityparm;
    @ApiModelProperty("Territory Parameter ") private Long territoryparm;
    @ApiModelProperty("Status Parameter ") private Integer statusparm;
    @ApiModelProperty("Principal Parameter ") private Long princepal;

    public Long getServicerequestidparm() {
        return servicerequestidparm;
    }

    public void setServicerequestidparm(Long servicerequestidparm) {
        this.servicerequestidparm = servicerequestidparm;
    }

    public Long getServicetypeparm() {
        return servicetypeparm;
    }

    public void setServicetypeparm(Long servicetypeparm) {
        this.servicetypeparm = servicetypeparm;
    }

    public Long getRequestedbyparm() {
        return requestedbyparm;
    }

    public void setRequestedbyparm(Long requestedbyparm) {
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

    public Long getProvinceparm() {
        return provinceparm;
    }

    public void setProvinceparm(Long provinceparm) {
        this.provinceparm = provinceparm;
    }

    public Long getGovernorateparm() {
        return governorateparm;
    }

    public void setGovernorateparm(Long governorateparm) {
        this.governorateparm = governorateparm;
    }

    public Long getMunicipalityparm() {
        return municipalityparm;
    }

    public void setMunicipalityparm(Long municipalityparm) {
        this.municipalityparm = municipalityparm;
    }

    public Long getTerritoryparm() {
        return territoryparm;
    }

    public void setTerritoryparm(Long territoryparm) {
        this.territoryparm = territoryparm;
    }

    public Integer getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(Integer statusparm) {
        this.statusparm = statusparm;
    }

    public Long getPrincepal() {
        return princepal;
    }

    public void setPrincepal(Long princepal) {
        this.princepal = princepal;
    }

    @Override
    public String toString() {
        return "SaveServiceRequestDataRequest{" +
                "servicerequestidparm=" + servicerequestidparm +
                ", servicetypeparm=" + servicetypeparm +
                ", requestedbyparm=" + requestedbyparm +
                ", requestdateparm=" + requestdateparm +
                ", applicantphonenumberparm= " + applicantphonenumberparm + 
                ", applicantemailparm= " + applicantemailparm + 
                ", provinceparm=" + provinceparm +
                ", governorateparm=" + governorateparm +
                ", municipalityparm=" + municipalityparm +
                ", territoryparm=" + territoryparm +
                ", statusparm=" + statusparm +
                ", princepal=" + princepal +
                '}';
    }
}



