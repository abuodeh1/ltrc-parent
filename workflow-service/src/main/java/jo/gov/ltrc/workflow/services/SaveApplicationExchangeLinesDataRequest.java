package jo.gov.ltrc.workflow.services;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class SaveApplicationExchangeLinesDataRequest {

    @ApiModelProperty("Application Exchange Lines ID Parameter ") private Long applicationexchangelinesidparm ;
    @ApiModelProperty("Operator ID Parameter ") private Long operatoridparm ;
    @ApiModelProperty("Operator Name Parameter ") private String operatornameparm ;
    @ApiModelProperty("National ID Parameter ") private String nationalidparm ;
    @ApiModelProperty("Phone Number Parameter ") private String phonenumberparm ;
    @ApiModelProperty("E-Mail Parameter ") private String emailparm ;
    @ApiModelProperty("1st Vehicle ID Parameter ") private Long _1stvehicleidparm ;
    @ApiModelProperty("2nd Vehicle ID Parameter ") private Long _2ndvehicleidparm ;
    @ApiModelProperty("Reason Parameter ") private String reasonparm ;
    @ApiModelProperty("Head of Service Department Explanation Parameter ") private String headofservicedepartmentexplanationparm ;
    @ApiModelProperty("Head of Service Department decision Parameter ") private Integer headofservicedepartmentdecisionparm ;
    @ApiModelProperty("Director Directorate Passenger Transport Explanation Parameter ") private String directordirectoratepassengertransportexplanationparm ;
    @ApiModelProperty("Director Directorate Passenger Transport Decision Parameter ") private Integer directordirectoratepassengertransportdecisionparm ;
    @ApiModelProperty("Principal Parameter ") private Long prencipal ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;
    @ApiModelProperty("IP Address Parameter ") private String ipaddressparm ;
    @ApiModelProperty("Service Department Parameter ") private Long servicedepartmentparm ;

    public Long getApplicationexchangelinesidparm() {
        return applicationexchangelinesidparm;
    }

    public void setApplicationexchangelinesidparm(Long applicationexchangelinesidparm) {
        this.applicationexchangelinesidparm = applicationexchangelinesidparm;
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

    public String getNationalidparm() {
        return nationalidparm;
    }

    public void setNationalidparm(String nationalidparm) {
        this.nationalidparm = nationalidparm;
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

    public Long get_1stvehicleidparm() {
        return _1stvehicleidparm;
    }

    public void set_1stvehicleidparm(Long _1stvehicleidparm) {
        this._1stvehicleidparm = _1stvehicleidparm;
    }

    public Long get_2ndvehicleidparm() {
        return _2ndvehicleidparm;
    }

    public void set_2ndvehicleidparm(Long _2ndvehicleidparm) {
        this._2ndvehicleidparm = _2ndvehicleidparm;
    }

    public String getReasonparm() {
        return reasonparm;
    }

    public void setReasonparm(String reasonparm) {
        this.reasonparm = reasonparm;
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
        return "SaveApplicationExchangeLinesDataRequest{" +
                "applicationexchangelinesidparm=" + applicationexchangelinesidparm +
                ", operatoridparm=" + operatoridparm +
                ", operatornameparm= " + operatornameparm + 
                ", nationalidparm= " + nationalidparm + 
                ", phonenumberparm= " + phonenumberparm + 
                ", emailparm= " + emailparm + 
                ", _1stvehicleidparm=" + _1stvehicleidparm +
                ", _2ndvehicleidparm=" + _2ndvehicleidparm +
                ", reasonparm= " + reasonparm + 
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



