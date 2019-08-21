package jo.gov.ltrc.workflow.services;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class SaveApplicationRouteAmedmentDataRequest {

    @ApiModelProperty("Application Route Amendment ID Parameter ") private Long applicationrouteamedmentidparm ;
    @ApiModelProperty("Operator ID Parameter ") private Long operatoridparm ;
    @ApiModelProperty("Operator Name Parameter ") private String operatornameparm ;
    @ApiModelProperty("Phone Number Parameter ") private String phonenumberparm ;
    @ApiModelProperty("E-Mail Parameter ") private String emailparm ;
    @ApiModelProperty("Province Parameter ") private Long provinceparm ;
    @ApiModelProperty("Governorate Parameter ") private Long governorateparm ;
    @ApiModelProperty("Municipality Parameter ") private Long municipalityparm ;
    @ApiModelProperty("Territory Parameter ") private Long territoryparm ;
    @ApiModelProperty("Route ID Parameter ") private Long routeidparm ;
    @ApiModelProperty("Current Route Length Parameter ") private Double currentroutelengthparm ;
    @ApiModelProperty("Suggested Route Length Parameter ") private Double suggestedroutelengthparm ;
    @ApiModelProperty("Current Route Passengers Parameter ") private Integer currentroutepassengersparm ;
    @ApiModelProperty("Suggested Route Passengers Parameter ") private Integer suggestedroutepassengersparm ;
    @ApiModelProperty("Suggested Points Parameter ") private String suggestedpointsparm ;
    @ApiModelProperty("Reason Parameter ") private String reasonparm ;
    @ApiModelProperty("Passenger Transport Committee Explanation Parameter ") private String passengertransportcommitteeexplanationparm ;
    @ApiModelProperty("Passenger Transport Committee Decision Parameter ") private Integer passengertransportcommitteedecisionparm ;
    @ApiModelProperty("Director Directorate Passenger Transport Explanation Parameter ") private String directordirectoratepassengertransportexplanationparm ;
    @ApiModelProperty("Director Directorate Passenger Transport Decision Parameter ") private Integer directordirectoratepassengertransportdecisionparm ;
    @ApiModelProperty("Principal Parameter ") private Long prencipal ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;
    @ApiModelProperty("IP Address Parameter ") private String ipaddressparm ;
    @ApiModelProperty("Service Department Parameter ") private Long servicedepartmentparm ;

    public Long getApplicationrouteamedmentidparm() {
        return applicationrouteamedmentidparm;
    }

    public void setApplicationrouteamedmentidparm(Long applicationrouteamedmentidparm) {
        this.applicationrouteamedmentidparm = applicationrouteamedmentidparm;
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

    public Long getRouteidparm() {
        return routeidparm;
    }

    public void setRouteidparm(Long routeidparm) {
        this.routeidparm = routeidparm;
    }

    public Double getCurrentroutelengthparm() {
        return currentroutelengthparm;
    }

    public void setCurrentroutelengthparm(Double currentroutelengthparm) {
        this.currentroutelengthparm = currentroutelengthparm;
    }

    public Double getSuggestedroutelengthparm() {
        return suggestedroutelengthparm;
    }

    public void setSuggestedroutelengthparm(Double suggestedroutelengthparm) {
        this.suggestedroutelengthparm = suggestedroutelengthparm;
    }

    public Integer getCurrentroutepassengersparm() {
        return currentroutepassengersparm;
    }

    public void setCurrentroutepassengersparm(Integer currentroutepassengersparm) {
        this.currentroutepassengersparm = currentroutepassengersparm;
    }

    public Integer getSuggestedroutepassengersparm() {
        return suggestedroutepassengersparm;
    }

    public void setSuggestedroutepassengersparm(Integer suggestedroutepassengersparm) {
        this.suggestedroutepassengersparm = suggestedroutepassengersparm;
    }

    public String getSuggestedpointsparm() {
        return suggestedpointsparm;
    }

    public void setSuggestedpointsparm(String suggestedpointsparm) {
        this.suggestedpointsparm = suggestedpointsparm;
    }

    public String getReasonparm() {
        return reasonparm;
    }

    public void setReasonparm(String reasonparm) {
        this.reasonparm = reasonparm;
    }

    public String getPassengertransportcommitteeexplanationparm() {
        return passengertransportcommitteeexplanationparm;
    }

    public void setPassengertransportcommitteeexplanationparm(String passengertransportcommitteeexplanationparm) {
        this.passengertransportcommitteeexplanationparm = passengertransportcommitteeexplanationparm;
    }

    public Integer getPassengertransportcommitteedecisionparm() {
        return passengertransportcommitteedecisionparm;
    }

    public void setPassengertransportcommitteedecisionparm(Integer passengertransportcommitteedecisionparm) {
        this.passengertransportcommitteedecisionparm = passengertransportcommitteedecisionparm;
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
        return "SaveApplicationRouteAmedmentDataRequest{" +
                "applicationrouteamedmentidparm=" + applicationrouteamedmentidparm +
                ", operatoridparm=" + operatoridparm +
                ", operatornameparm= " + operatornameparm + 
                ", phonenumberparm= " + phonenumberparm + 
                ", emailparm= " + emailparm + 
                ", provinceparm=" + provinceparm +
                ", governorateparm=" + governorateparm +
                ", municipalityparm=" + municipalityparm +
                ", territoryparm=" + territoryparm +
                ", routeidparm=" + routeidparm +
                ", currentroutelengthparm=" + currentroutelengthparm +
                ", suggestedroutelengthparm=" + suggestedroutelengthparm +
                ", currentroutepassengersparm=" + currentroutepassengersparm +
                ", suggestedroutepassengersparm=" + suggestedroutepassengersparm +
                ", suggestedpointsparm= " + suggestedpointsparm + 
                ", reasonparm= " + reasonparm + 
                ", passengertransportcommitteeexplanationparm= " + passengertransportcommitteeexplanationparm + 
                ", passengertransportcommitteedecisionparm=" + passengertransportcommitteedecisionparm +
                ", directordirectoratepassengertransportexplanationparm= " + directordirectoratepassengertransportexplanationparm + 
                ", directordirectoratepassengertransportdecisionparm=" + directordirectoratepassengertransportdecisionparm +
                ", prencipal=" + prencipal +
                ", statusparm=" + statusparm +
                ", ipaddressparm= " + ipaddressparm + 
                ", servicedepartmentparm=" + servicedepartmentparm +
                '}';
    }
}



