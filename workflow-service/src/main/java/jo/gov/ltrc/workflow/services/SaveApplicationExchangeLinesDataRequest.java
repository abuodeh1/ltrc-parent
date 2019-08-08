package jo.gov.ltrc.workflow.services;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class SaveApplicationExchangeLinesDataRequest {

    @ApiModelProperty("Application Exchange Lines ID Parameter ") private long applicationexchangelinesidparm ;
    @ApiModelProperty("Operator ID Parameter ") private long operatoridparm ;
    @ApiModelProperty("Operator Name Parameter ") private String operatornameparm ;
    @ApiModelProperty("National ID Parameter ") private String nationalidparm ;
    @ApiModelProperty("Phone Number Parameter ") private String phonenumberparm ;
    @ApiModelProperty("E-Mail Parameter ") private String emailparm ;
    @ApiModelProperty("1st Vehicle ID Parameter ") private long _1stvehicleidparm ;
    @ApiModelProperty("2nd Vehicle ID Parameter ") private long _2ndvehicleidparm ;
    @ApiModelProperty("Reason Parameter ") private String reasonparm ;
    @ApiModelProperty("Head of Service Department Explanation Parameter ") private String headofservicedepartmentexplanationparm ;
    @ApiModelProperty("Head of Service Department decision Parameter ") private int headofservicedepartmentdecisionparm ;
    @ApiModelProperty("Director Directorate Passenger Transport Explanation Parameter ") private String directordirectoratepassengertransportexplanationparm ;
    @ApiModelProperty("Director Directorate Passenger Transport Decision Parameter ") private int directordirectoratepassengertransportdecisionparm ;
    @ApiModelProperty("Principal Parameter ") private long prencipal ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;
    @ApiModelProperty("IP Address Parameter ") private String ipaddressparm ;
    @ApiModelProperty("Service Department Parameter ") private long servicedepartmentparm ;

    public long getApplicationexchangelinesidparm() {
        return applicationexchangelinesidparm;
    }

    public void setApplicationexchangelinesidparm(long applicationexchangelinesidparm) {
        this.applicationexchangelinesidparm = applicationexchangelinesidparm;
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

    public long get_1stvehicleidparm() {
        return _1stvehicleidparm;
    }

    public void set_1stvehicleidparm(long _1stvehicleidparm) {
        this._1stvehicleidparm = _1stvehicleidparm;
    }

    public long get_2ndvehicleidparm() {
        return _2ndvehicleidparm;
    }

    public void set_2ndvehicleidparm(long _2ndvehicleidparm) {
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



