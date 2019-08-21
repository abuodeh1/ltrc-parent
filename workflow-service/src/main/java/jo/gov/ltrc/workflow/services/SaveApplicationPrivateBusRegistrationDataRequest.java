package jo.gov.ltrc.workflow.services;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class SaveApplicationPrivateBusRegistrationDataRequest {

    @ApiModelProperty("Application Private Bus Registration ID Parameter ") private Long applicationprivatebusregistrationidparm ;
    @ApiModelProperty("Applicant National ID Parameter ") private String applicantnationalidparm ;
    @ApiModelProperty("Operator ID Parameter ") private Long operatoridparm ;
    @ApiModelProperty("Operator Name Parameter ") private String operatornameparm ;
    @ApiModelProperty("Phone Number Parameter ") private String phonenumberparm ;
    @ApiModelProperty("E-Mail Parameter ") private String emailparm ;
    @ApiModelProperty("Vehicle ID Parameter ") private Long vehicleidparm ;
    @ApiModelProperty("Commercial Record Parameter ") private String commercialrecordparm ;
    @ApiModelProperty("Profession License Parameter ") private String proffissionlicenseparm ;
    @ApiModelProperty("Custom Reference Parameter ") private String customreferenceparm ;
    @ApiModelProperty("No Objection Parameter ") private String noobjectionparm ;
    @ApiModelProperty("License Purposes Parameter ") private String licensepurposesparm ;
    @ApiModelProperty("Evaluation Committee Explanation Parameter ") private String evaluationcommitteeexplanationparm ;
    @ApiModelProperty("Evaluation Committee Decision Parameter ") private Integer evaluationcommitteedecisionparm ;
    @ApiModelProperty("Head of Service Department Explanation Parameter ") private String headofservicedepartmentexplanationparm ;
    @ApiModelProperty("Head of Service Department Decision Parameter ") private Integer headofservicedepartmentdecisionparm ;
    @ApiModelProperty("Director Directorate Passenger Transport Explanation Parameter ") private String directordirectoratepassengertransportexplanationparm ;
    @ApiModelProperty("Director Directorate Passenger Transport Decision Parameter ") private Integer directordirectoratepassengertransportdecisionparm ;
    @ApiModelProperty("Principal Parameter ") private Long prencipal ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;
    @ApiModelProperty("IP Address Parameter ") private String ipaddressparm ;
    @ApiModelProperty("Service Department Parameter ") private Long servicedepartmentparm ;

    public Long getApplicationprivatebusregistrationidparm() {
        return applicationprivatebusregistrationidparm;
    }

    public void setApplicationprivatebusregistrationidparm(Long applicationprivatebusregistrationidparm) {
        this.applicationprivatebusregistrationidparm = applicationprivatebusregistrationidparm;
    }

    public String getApplicantnationalidparm() {
        return applicantnationalidparm;
    }

    public void setApplicantnationalidparm(String applicantnationalidparm) {
        this.applicantnationalidparm = applicantnationalidparm;
    }

    public Long getOperatoridparm() {
        return operatoridparm;
    }

    public void setOperatoridparm(Long operatoridparm) {
        this.operatoridparm = operatoridparm;
    }

    public String getOperatornameparm() {
        return operatornameparm;
    }

    public void setOperatornameparm(String operatornameparm) {
        this.operatornameparm = operatornameparm;
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

    public Long getVehicleidparm() {
        return vehicleidparm;
    }

    public void setVehicleidparm(Long vehicleidparm) {
        this.vehicleidparm = vehicleidparm;
    }

    public String getCommercialrecordparm() {
        return commercialrecordparm;
    }

    public void setCommercialrecordparm(String commercialrecordparm) {
        this.commercialrecordparm = commercialrecordparm;
    }

    public String getProffissionlicenseparm() {
        return proffissionlicenseparm;
    }

    public void setProffissionlicenseparm(String proffissionlicenseparm) {
        this.proffissionlicenseparm = proffissionlicenseparm;
    }

    public String getCustomreferenceparm() {
        return customreferenceparm;
    }

    public void setCustomreferenceparm(String customreferenceparm) {
        this.customreferenceparm = customreferenceparm;
    }

    public String getNoobjectionparm() {
        return noobjectionparm;
    }

    public void setNoobjectionparm(String noobjectionparm) {
        this.noobjectionparm = noobjectionparm;
    }

    public String getLicensepurposesparm() {
        return licensepurposesparm;
    }

    public void setLicensepurposesparm(String licensepurposesparm) {
        this.licensepurposesparm = licensepurposesparm;
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

    public String getHeadofservicedepartmentexplanationparm() {
        return headofservicedepartmentexplanationparm;
    }

    public void setHeadofservicedepartmentexplanationparm(String headofservicedepartmentexplanationparm) {
        this.headofservicedepartmentexplanationparm = headofservicedepartmentexplanationparm;
    }

    public Integer getHeadofservicedepartmentdecisionparm() {
        return headofservicedepartmentdecisionparm;
    }

    public void setHeadofservicedepartmentdecisionparm(Integer headofservicedepartmentdecisionparm) {
        this.headofservicedepartmentdecisionparm = headofservicedepartmentdecisionparm;
    }

    public String getDirectordirectoratepassengertransportexplanationparm() {
        return directordirectoratepassengertransportexplanationparm;
    }

    public void setDirectordirectoratepassengertransportexplanationparm(String directordirectoratepassengertransportexplanationparm) {
        this.directordirectoratepassengertransportexplanationparm = directordirectoratepassengertransportexplanationparm;
    }

    public Integer getDirectordirectoratepassengertransportdecisionparm() {
        return directordirectoratepassengertransportdecisionparm;
    }

    public void setDirectordirectoratepassengertransportdecisionparm(Integer directordirectoratepassengertransportdecisionparm) {
        this.directordirectoratepassengertransportdecisionparm = directordirectoratepassengertransportdecisionparm;
    }

    public Long getPrencipal() {
        return prencipal;
    }

    public void setPrencipal(Long prencipal) {
        this.prencipal = prencipal;
    }

    public Integer getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(Integer statusparm) {
        this.statusparm = statusparm;
    }

    public String getIpaddressparm() {
        return ipaddressparm;
    }

    public void setIpaddressparm(String ipaddressparm) {
        this.ipaddressparm = ipaddressparm;
    }

    public Long getServicedepartmentparm() {
        return servicedepartmentparm;
    }

    public void setServicedepartmentparm(Long servicedepartmentparm) {
        this.servicedepartmentparm = servicedepartmentparm;
    }

    @Override
    public String toString() {
        return "SaveApplicationPrivateBusRegistrationDataRequest{" +
                "applicationprivatebusregistrationidparm=" + applicationprivatebusregistrationidparm +
                ", applicantnationalidparm= " + applicantnationalidparm + 
                ", operatoridparm=" + operatoridparm +
                ", operatornameparm= " + operatornameparm + 
                ", phonenumberparm= " + phonenumberparm + 
                ", emailparm= " + emailparm + 
                ", vehicleidparm=" + vehicleidparm +
                ", commercialrecordparm= " + commercialrecordparm + 
                ", proffissionlicenseparm= " + proffissionlicenseparm + 
                ", customreferenceparm= " + customreferenceparm + 
                ", noobjectionparm= " + noobjectionparm + 
                ", licensepurposesparm= " + licensepurposesparm + 
                ", evaluationcommitteeexplanationparm= " + evaluationcommitteeexplanationparm + 
                ", evaluationcommitteedecisionparm=" + evaluationcommitteedecisionparm +
                ", headofservicedepartmentexplanationparm= " + headofservicedepartmentexplanationparm + 
                ", headofservicedepartmentdecisionparm=" + headofservicedepartmentdecisionparm +
                ", directordirectoratepassengertransportexplanationparm= " + directordirectoratepassengertransportexplanationparm + 
                ", directordirectoratepassengertransportdecisionparm=" + directordirectoratepassengertransportdecisionparm +
                ", prencipal=" + prencipal +
                ", statusparm=" + statusparm +
                ", ipaddressparm= " + ipaddressparm + 
                ", servicedepartmentparm=" + servicedepartmentparm +
                '}';
    }
}



