package jo.gov.ltrc.workflow.services;

import io.swagger.annotations.ApiModelProperty;

public class SaveApplicationCncltnRplcmntDataRequest {

    @ApiModelProperty("Parameter ") private Long applicationcncltnrplcmntidparm ;
    @ApiModelProperty("Operator ID Parameter ") private Long operatoridparm ;
    @ApiModelProperty("Operator Name Parameter ") private String operatornameparm ;
    @ApiModelProperty("Operator National ID Parameter ") private String operatornationalidparm ;
    @ApiModelProperty("Phone Number Parameter ") private String phonenumberparm ;
    @ApiModelProperty("E-Mail Parameter ") private String emailparm ;
    @ApiModelProperty("Vehicle Parameter ") private Long vehicleidparm ;
    @ApiModelProperty("Commercial Record Parameter ") private String commercialrecordparm ;
    @ApiModelProperty("DVLD Explanation Parameter ") private String dvldexplanationparm ;
    @ApiModelProperty("Head of Service Department Explanation Parameter ") private String headofservicedepartmentexplanationparm ;
    @ApiModelProperty("Head of Service Department Decision Parameter ") private Integer headofservicedepartmentdecisionparm ;
    @ApiModelProperty("Director Directorate Passenger Transport Explanation Parameter ") private String directordirectoratepassengertransportexplanationparm ;
    @ApiModelProperty("Director Directorate Passenger Transport Decision Parameter ") private Integer directordirectoratepassengertransportdecisionparm ;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;
    @ApiModelProperty("IP Address Parameter ") private String ipaddressparm ;
    @ApiModelProperty("Service Department Parameter ") private Long servicedepartmentparm ;

    public Long getApplicationcncltnrplcmntidparm() {
        return applicationcncltnrplcmntidparm;
    }

    public void setApplicationcncltnrplcmntidparm(Long applicationcncltnrplcmntidparm) {
        this.applicationcncltnrplcmntidparm = applicationcncltnrplcmntidparm;
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

    public String getOperatornationalidparm() {
        return operatornationalidparm;
    }

    public void setOperatornationalidparm(String operatornationalidparm) {
        this.operatornationalidparm = operatornationalidparm;
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

    public String getDvldexplanationparm() {
        return dvldexplanationparm;
    }

    public void setDvldexplanationparm(String dvldexplanationparm) {
        this.dvldexplanationparm = dvldexplanationparm;
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
        return "SaveApplicationCncltnRplcmntDataRequest{" +
                "applicationcncltnrplcmntidparm=" + applicationcncltnrplcmntidparm +
                ", operatoridparm=" + operatoridparm +
                ", operatornameparm= " + operatornameparm + 
                ", operatornationalidparm= " + operatornationalidparm + 
                ", phonenumberparm= " + phonenumberparm + 
                ", emailparm= " + emailparm + 
                ", vehicleidparm=" + vehicleidparm +
                ", commercialrecordparm= " + commercialrecordparm + 
                ", dvldexplanationparm= " + dvldexplanationparm + 
                ", headofservicedepartmentexplanationparm= " + headofservicedepartmentexplanationparm + 
                ", headofservicedepartmentdecisionparm=" + headofservicedepartmentdecisionparm +
                ", directordirectoratepassengertransportexplanationparm= " + directordirectoratepassengertransportexplanationparm + 
                ", directordirectoratepassengertransportdecisionparm=" + directordirectoratepassengertransportdecisionparm +
                ", princepel=" + princepel +
                ", statusparm=" + statusparm +
                ", ipaddressparm= " + ipaddressparm + 
                ", servicedepartmentparm=" + servicedepartmentparm +
                '}';
    }
}



