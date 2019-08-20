package jo.gov.ltrc.workflow.services;

import io.swagger.annotations.ApiModelProperty;


public class SaveApplicationVehiclesOwnershipTransferDataRequest {

    @ApiModelProperty("Application Vehicles Ownership Transfer ID Parameter ") private Long applicationvehiclesownershiptransferidparm ;
    @ApiModelProperty("1st Operator ID Parameter ") private Long _1stoperatoridparm ;
    @ApiModelProperty("1st Operator Name Parameter ") private String _1stoperatornameparm ;
    @ApiModelProperty("Phone Number Parameter ") private String phonenumberparm ;
    @ApiModelProperty("E-Mail Parameter ") private String emailparm ;
    @ApiModelProperty("2nd Operator ID Parameter ") private Long _2ndoperatoridparm ;
    @ApiModelProperty("2nd Operator Name Parameter ") private String _2ndoperatornameparm ;
    @ApiModelProperty("Vehicle ID Parameter ") private Long vehicleidparm ;
    @ApiModelProperty("New Owner National ID Parameter ") private String newownernationalidparm ;
    @ApiModelProperty("New Owner Name Parameter ") private String newownernameparm ;
    @ApiModelProperty("Head of Service Department Explanation Parameter ") private String headofservicedpartmentexplanationparm ;
    @ApiModelProperty("Head of Service Department Decision Parameter ") private Integer headofservicedpartmentdecisionparm ;
    @ApiModelProperty("Director Directorate Passenger Transport Explanation Parameter ") private String directordirectoratepassengertransportexplanationparm ;
    @ApiModelProperty("Director Directorate Passenger Transport Decision Parameter ") private Integer directordirectoratepassengertransportdecisionparm ;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;
    @ApiModelProperty("IP Address Parameter ") private String ipaddressparm ;
    @ApiModelProperty("Service Department Parameter ") private Long servicedpartmentparm ;
    @ApiModelProperty("Financial Commitment Parameter ") private String financialcommitmentparm ;

    public Long getApplicationvehiclesownershiptransferidparm() {
        return applicationvehiclesownershiptransferidparm;
    }

    public void setApplicationvehiclesownershiptransferidparm(Long applicationvehiclesownershiptransferidparm) {
        this.applicationvehiclesownershiptransferidparm = applicationvehiclesownershiptransferidparm;
    }

    public Long get_1stoperatoridparm() {
        return _1stoperatoridparm;
    }

    public void set_1stoperatoridparm(Long _1stoperatoridparm) {
        this._1stoperatoridparm = _1stoperatoridparm;
    }

    public String get_1stoperatornameparm() {
        return _1stoperatornameparm;
    }

    public void set_1stoperatornameparm(String _1stoperatornameparm) {
        this._1stoperatornameparm = _1stoperatornameparm;
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

    public Long get_2ndoperatoridparm() {
        return _2ndoperatoridparm;
    }

    public void set_2ndoperatoridparm(Long _2ndoperatoridparm) {
        this._2ndoperatoridparm = _2ndoperatoridparm;
    }

    public String get_2ndoperatornameparm() {
        return _2ndoperatornameparm;
    }

    public void set_2ndoperatornameparm(String _2ndoperatornameparm) {
        this._2ndoperatornameparm = _2ndoperatornameparm;
    }

    public Long getVehicleidparm() {
        return vehicleidparm;
    }

    public void setVehicleidparm(Long vehicleidparm) {
        this.vehicleidparm = vehicleidparm;
    }

    public String getNewownernationalidparm() {
        return newownernationalidparm;
    }

    public void setNewownernationalidparm(String newownernationalidparm) {
        this.newownernationalidparm = newownernationalidparm;
    }

    public String getNewownernameparm() {
        return newownernameparm;
    }

    public void setNewownernameparm(String newownernameparm) {
        this.newownernameparm = newownernameparm;
    }

    public String getHeadofservicedpartmentexplanationparm() {
        return headofservicedpartmentexplanationparm;
    }

    public void setHeadofservicedpartmentexplanationparm(String headofservicedpartmentexplanationparm) {
        this.headofservicedpartmentexplanationparm = headofservicedpartmentexplanationparm;
    }

    public Integer getHeadofservicedpartmentdecisionparm() {
        return headofservicedpartmentdecisionparm;
    }

    public void setHeadofservicedpartmentdecisionparm(Integer headofservicedpartmentdecisionparm) {
        this.headofservicedpartmentdecisionparm = headofservicedpartmentdecisionparm;
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

    public Long getServicedpartmentparm() {
        return servicedpartmentparm;
    }

    public void setServicedpartmentparm(Long servicedpartmentparm) {
        this.servicedpartmentparm = servicedpartmentparm;
    }

    public String getFinancialcommitmentparm() {
        return financialcommitmentparm;
    }

    public void setFinancialcommitmentparm(String financialcommitmentparm) {
        this.financialcommitmentparm = financialcommitmentparm;
    }

    @Override
    public String toString() {
        return "SaveApplicationVehiclesOwnershipTransferDataRequest{" +
                "applicationvehiclesownershiptransferidparm=" + applicationvehiclesownershiptransferidparm +
                ", _1stoperatoridparm=" + _1stoperatoridparm +
                ", _1stoperatornameparm= " + _1stoperatornameparm + 
                ", phonenumberparm= " + phonenumberparm + 
                ", emailparm= " + emailparm + 
                ", _2ndoperatoridparm=" + _2ndoperatoridparm +
                ", _2ndoperatornameparm= " + _2ndoperatornameparm + 
                ", vehicleidparm=" + vehicleidparm +
                ", newownernationalidparm= " + newownernationalidparm + 
                ", newownernameparm= " + newownernameparm + 
                ", headofservicedpartmentexplanationparm= " + headofservicedpartmentexplanationparm + 
                ", headofservicedpartmentdecisionparm=" + headofservicedpartmentdecisionparm +
                ", directordirectoratepassengertransportexplanationparm= " + directordirectoratepassengertransportexplanationparm + 
                ", directordirectoratepassengertransportdecisionparm=" + directordirectoratepassengertransportdecisionparm +
                ", princepel=" + princepel +
                ", statusparm=" + statusparm +
                ", ipaddressparm= " + ipaddressparm + 
                ", servicedpartmentparm=" + servicedpartmentparm +
                ", financialcommitmentparm= " + financialcommitmentparm + 
                '}';
    }
}



