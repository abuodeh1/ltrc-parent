package jo.gov.ltrc.workflow.services;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class SaveApplicationPrivateBusRegistrationDataRequest {

    @ApiModelProperty("Application Private Bus Registration ID Parameter ") private long applicationprivatebusregistrationidparm ;
    @ApiModelProperty("Applicant National ID Parameter ") private String applicantnationalidparm ;
    @ApiModelProperty("Operator ID Parameter ") private long operatoridparm ;
    @ApiModelProperty("Operator Name Parameter ") private String operatornameparm ;
    @ApiModelProperty("Phone Number Parameter ") private String phonenumberparm ;
    @ApiModelProperty("E-Mail Parameter ") private String emailparm ;
    @ApiModelProperty("Vehicle ID Parameter ") private long vehicleidparm ;
    @ApiModelProperty("Commercial Record Parameter ") private String commercialrecordparm ;
    @ApiModelProperty("Profession License Parameter ") private String proffissionlicenseparm ;
    @ApiModelProperty("Custom Reference Parameter ") private String customreferenceparm ;
    @ApiModelProperty("No Objection Parameter ") private String noobjectionparm ;
    @ApiModelProperty("License Purposes Parameter ") private String licensepurposesparm ;
    @ApiModelProperty("Evaluation Committee Explanation Parameter ") private String evaluationcommitteeexplanationparm ;
    @ApiModelProperty("Evaluation Committee Decision Parameter ") private int evaluationcommitteedecisionparm ;
    @ApiModelProperty("Head of Service Department Explanation Parameter ") private String headofservicedepartmentexplanationparm ;
    @ApiModelProperty("Head of Service Department Decision Parameter ") private int headofservicedepartmentdecisionparm ;
    @ApiModelProperty("Director Directorate Passenger Transport Explanation Parameter ") private String directordirectoratepassengertransportexplanationparm ;
    @ApiModelProperty("Director Directorate Passenger Transport Decision Parameter ") private int directordirectoratepassengertransportdecisionparm ;
    @ApiModelProperty("Principal Parameter ") private long prencipal ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;
    @ApiModelProperty("IP Address Parameter ") private String ipaddressparm ;
    @ApiModelProperty("Service Department Parameter ") private long servicedepartmentparm ;

    public long getApplicationprivatebusregistrationidparm() {
        return applicationprivatebusregistrationidparm;
    }

    public void setApplicationprivatebusregistrationidparm(long applicationprivatebusregistrationidparm) {
        this.applicationprivatebusregistrationidparm = applicationprivatebusregistrationidparm;
    }

    public String getApplicantnationalidparm() {
        return applicantnationalidparm;
    }

    public void setApplicantnationalidparm(String applicantnationalidparm) {
        this.applicantnationalidparm = applicantnationalidparm;
    }

    public long getOperatoridparm() {
        return operatoridparm;
    }

    public void setOperatoridparm(long operatoridparm) {
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

    public long getVehicleidparm() {
        return vehicleidparm;
    }

    public void setVehicleidparm(long vehicleidparm) {
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

    public int getEvaluationcommitteedecisionparm() {
        return evaluationcommitteedecisionparm;
    }

    public void setEvaluationcommitteedecisionparm(int evaluationcommitteedecisionparm) {
        this.evaluationcommitteedecisionparm = evaluationcommitteedecisionparm;
    }

    public String getHeadofservicedepartmentexplanationparm() {
        return headofservicedepartmentexplanationparm;
    }

    public void setHeadofservicedepartmentexplanationparm(String headofservicedepartmentexplanationparm) {
        this.headofservicedepartmentexplanationparm = headofservicedepartmentexplanationparm;
    }

    public int getHeadofservicedepartmentdecisionparm() {
        return headofservicedepartmentdecisionparm;
    }

    public void setHeadofservicedepartmentdecisionparm(int headofservicedepartmentdecisionparm) {
        this.headofservicedepartmentdecisionparm = headofservicedepartmentdecisionparm;
    }

    public String getDirectordirectoratepassengertransportexplanationparm() {
        return directordirectoratepassengertransportexplanationparm;
    }

    public void setDirectordirectoratepassengertransportexplanationparm(String directordirectoratepassengertransportexplanationparm) {
        this.directordirectoratepassengertransportexplanationparm = directordirectoratepassengertransportexplanationparm;
    }

    public int getDirectordirectoratepassengertransportdecisionparm() {
        return directordirectoratepassengertransportdecisionparm;
    }

    public void setDirectordirectoratepassengertransportdecisionparm(int directordirectoratepassengertransportdecisionparm) {
        this.directordirectoratepassengertransportdecisionparm = directordirectoratepassengertransportdecisionparm;
    }

    public long getPrencipal() {
        return prencipal;
    }

    public void setPrencipal(long prencipal) {
        this.prencipal = prencipal;
    }

    public int getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(int statusparm) {
        this.statusparm = statusparm;
    }

    public String getIpaddressparm() {
        return ipaddressparm;
    }

    public void setIpaddressparm(String ipaddressparm) {
        this.ipaddressparm = ipaddressparm;
    }

    public long getServicedepartmentparm() {
        return servicedepartmentparm;
    }

    public void setServicedepartmentparm(long servicedepartmentparm) {
        this.servicedepartmentparm = servicedepartmentparm;
    }
}



