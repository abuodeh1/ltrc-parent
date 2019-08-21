package jo.gov.ltrc.workflow.services;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class SaveApplicationBusRentingOfficeLicenseDataRequest {

    @ApiModelProperty("Parameter ") private Long applicationbusrentalofficelicenseidparm ;
    @ApiModelProperty("Applicant National ID Parameter ") private String applicantnationalidparm ;
    @ApiModelProperty("Applicant Name  Parameter ") private String applicantnameparm ;
    @ApiModelProperty("Phone Number Parameter ") private String phonenumberparm ;
    @ApiModelProperty("E-Mail Parameter ") private String emailparm ;
    @ApiModelProperty("Province Parameter ") private Long provinceparm ;
    @ApiModelProperty("Governorate Parameter ") private Long governorateparm ;
    @ApiModelProperty("Municipality Parameter ") private Long municipalityparm ;
    @ApiModelProperty("Territory Parameter ") private Long territoryparm ;
    @ApiModelProperty("Technical Financial Study Parameter ") private Integer technicalfinancialstudyparm ;
    @ApiModelProperty("Evaluation Commit Explanation Parameter ") private String evaluationcommitteeexplanationparm ;
    @ApiModelProperty("Evaluation Commit Decision Parameter ") private Integer evaluationcommitteedecisionparm ;
    @ApiModelProperty("General Director Explanation Parameter ") private String generaldirectorexplanationparm ;
    @ApiModelProperty("General Director Decision Parameter ") private Integer generaldirectordecisionparm ;
    @ApiModelProperty("Disclosure Commit Explanation Parameter ") private String disclosurecommitteeexplanationparm ;
    @ApiModelProperty("Disclosure Commit Decision Parameter ") private Integer disclosurecommitteedecisionparm ;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;
    @ApiModelProperty("IP Address Parameter ") private String ipaddress ;

    public Long getApplicationbusrentalofficelicenseidparm() {
        return applicationbusrentalofficelicenseidparm;
    }

    public void setApplicationbusrentalofficelicenseidparm(Long applicationbusrentalofficelicenseidparm) {
        this.applicationbusrentalofficelicenseidparm = applicationbusrentalofficelicenseidparm;
    }

    public String getApplicantnationalidparm() {
        return applicantnationalidparm;
    }

    public void setApplicantnationalidparm(String applicantnationalidparm) {
        this.applicantnationalidparm = applicantnationalidparm;
    }

    public String getApplicantnameparm() {
        return applicantnameparm;
    }

    public void setApplicantnameparm(String applicantnameparm) {
        this.applicantnameparm = applicantnameparm;
    }

    public String getPhonenumberparm() {
        return phonenumberparm;
    }

    public void setPhonenumberparm(String phonenumberparm) {
        this.phonenumberparm = phonenumberparm;
    }

    public String getEmailparm() {
        return emailparm;
    }

    public void setEmailparm(String emailparm) {
        this.emailparm = emailparm;
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

    public Integer getTechnicalfinancialstudyparm() {
        return technicalfinancialstudyparm;
    }

    public void setTechnicalfinancialstudyparm(Integer technicalfinancialstudyparm) {
        this.technicalfinancialstudyparm = technicalfinancialstudyparm;
    }

    public String getEvaluationcommitteeexplanationparm() {
        return evaluationcommitteeexplanationparm;
    }

    public void setEvaluationcommitteeexplanationparm(String evaluationcommitteeexplanationparm) {
        this.evaluationcommitteeexplanationparm = evaluationcommitteeexplanationparm;
    }

    public Integer getEvaluationcommitteedecisionparm() {
        return evaluationcommitteedecisionparm;
    }

    public void setEvaluationcommitteedecisionparm(Integer evaluationcommitteedecisionparm) {
        this.evaluationcommitteedecisionparm = evaluationcommitteedecisionparm;
    }

    public String getGeneraldirectorexplanationparm() {
        return generaldirectorexplanationparm;
    }

    public void setGeneraldirectorexplanationparm(String generaldirectorexplanationparm) {
        this.generaldirectorexplanationparm = generaldirectorexplanationparm;
    }

    public Integer getGeneraldirectordecisionparm() {
        return generaldirectordecisionparm;
    }

    public void setGeneraldirectordecisionparm(Integer generaldirectordecisionparm) {
        this.generaldirectordecisionparm = generaldirectordecisionparm;
    }

    public String getDisclosurecommitteeexplanationparm() {
        return disclosurecommitteeexplanationparm;
    }

    public void setDisclosurecommitteeexplanationparm(String disclosurecommitteeexplanationparm) {
        this.disclosurecommitteeexplanationparm = disclosurecommitteeexplanationparm;
    }

    public Integer getDisclosurecommitteedecisionparm() {
        return disclosurecommitteedecisionparm;
    }

    public void setDisclosurecommitteedecisionparm(Integer disclosurecommitteedecisionparm) {
        this.disclosurecommitteedecisionparm = disclosurecommitteedecisionparm;
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

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }


    @Override
    public String toString() {
        return "SaveApplicationBusRentingOfficeLicenseDataRequest{" +
                "applicationbusrentalofficelicenseidparm=" + applicationbusrentalofficelicenseidparm +
                ", applicantnationalidparm= " + applicantnationalidparm + 
                ", applicantnameparm= " + applicantnameparm + 
                ", phonenumberparm= " + phonenumberparm + 
                ", emailparm= " + emailparm + 
                ", provinceparm=" + provinceparm +
                ", governorateparm=" + governorateparm +
                ", municipalityparm=" + municipalityparm +
                ", territoryparm=" + territoryparm +
                ", technicalfinancialstudyparm=" + technicalfinancialstudyparm +
                ", evaluationcommitteeexplanationparm= " + evaluationcommitteeexplanationparm + 
                ", evaluationcommitteedecisionparm=" + evaluationcommitteedecisionparm +
                ", generaldirectorexplanationparm= " + generaldirectorexplanationparm + 
                ", generaldirectordecisionparm=" + generaldirectordecisionparm +
                ", disclosurecommitteeexplanationparm= " + disclosurecommitteeexplanationparm + 
                ", disclosurecommitteedecisionparm=" + disclosurecommitteedecisionparm +
                ", princepel=" + princepel +
                ", statusparm=" + statusparm +
                ", ipaddress= " + ipaddress + 
                '}';
    }
}



