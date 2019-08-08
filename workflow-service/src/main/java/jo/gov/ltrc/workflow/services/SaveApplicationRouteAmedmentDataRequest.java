package jo.gov.ltrc.workflow.services;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class SaveApplicationRouteAmedmentDataRequest {

    @ApiModelProperty("Application Route Amendment ID Parameter ") private long applicationrouteamedmentidparm ;
    @ApiModelProperty("Operator ID Parameter ") private long operatoridparm ;
    @ApiModelProperty("Operator Name Parameter ") private String operatornameparm ;
    @ApiModelProperty("Phone Number Parameter ") private String phonenumberparm ;
    @ApiModelProperty("E-Mail Parameter ") private String emailparm ;
    @ApiModelProperty("Province Parameter ") private long provinceparm ;
    @ApiModelProperty("Governorate Parameter ") private long governorateparm ;
    @ApiModelProperty("Municipality Parameter ") private long municipalityparm ;
    @ApiModelProperty("Territory Parameter ") private long territoryparm ;
    @ApiModelProperty("Route ID Parameter ") private long routeidparm ;
    @ApiModelProperty("Current Route Length Parameter ") private double currentroutelengthparm ;
    @ApiModelProperty("Suggested Route Length Parameter ") private double suggestedroutelengthparm ;
    @ApiModelProperty("Current Route Passengers Parameter ") private int currentroutepassengersparm ;
    @ApiModelProperty("Suggested Route Passengers Parameter ") private int suggestedroutepassengersparm ;
    @ApiModelProperty("Suggested Points Parameter ") private String suggestedpointsparm ;
    @ApiModelProperty("Reason Parameter ") private String reasonparm ;
    @ApiModelProperty("Passenger Transport Committee Explanation Parameter ") private String passengertransportcommitteeexplanationparm ;
    @ApiModelProperty("Passenger Transport Committee Decision Parameter ") private int passengertransportcommitteedecisionparm ;
    @ApiModelProperty("Director Directorate Passenger Transport Explanation Parameter ") private String directordirectoratepassengertransportexplanationparm ;
    @ApiModelProperty("Director Directorate Passenger Transport Decision Parameter ") private int directordirectoratepassengertransportdecisionparm ;
    @ApiModelProperty("Principal Parameter ") private long prencipal ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;
    @ApiModelProperty("IP Address Parameter ") private String ipaddressparm ;
    @ApiModelProperty("Service Department Parameter ") private long servicedepartmentparm ;

    public long getApplicationrouteamedmentidparm() {
        return applicationrouteamedmentidparm;
    }

    public void setApplicationrouteamedmentidparm(long applicationrouteamedmentidparm) {
        this.applicationrouteamedmentidparm = applicationrouteamedmentidparm;
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

    public long getProvinceparm() {
        return provinceparm;
    }

    public void setProvinceparm(long provinceparm) {
        this.provinceparm = provinceparm;
    }

    public long getGovernorateparm() {
        return governorateparm;
    }

    public void setGovernorateparm(long governorateparm) {
        this.governorateparm = governorateparm;
    }

    public long getMunicipalityparm() {
        return municipalityparm;
    }

    public void setMunicipalityparm(long municipalityparm) {
        this.municipalityparm = municipalityparm;
    }

    public long getTerritoryparm() {
        return territoryparm;
    }

    public void setTerritoryparm(long territoryparm) {
        this.territoryparm = territoryparm;
    }

    public long getRouteidparm() {
        return routeidparm;
    }

    public void setRouteidparm(long routeidparm) {
        this.routeidparm = routeidparm;
    }

    public double getCurrentroutelengthparm() {
        return currentroutelengthparm;
    }

    public void setCurrentroutelengthparm(double currentroutelengthparm) {
        this.currentroutelengthparm = currentroutelengthparm;
    }

    public double getSuggestedroutelengthparm() {
        return suggestedroutelengthparm;
    }

    public void setSuggestedroutelengthparm(double suggestedroutelengthparm) {
        this.suggestedroutelengthparm = suggestedroutelengthparm;
    }

    public int getCurrentroutepassengersparm() {
        return currentroutepassengersparm;
    }

    public void setCurrentroutepassengersparm(int currentroutepassengersparm) {
        this.currentroutepassengersparm = currentroutepassengersparm;
    }

    public int getSuggestedroutepassengersparm() {
        return suggestedroutepassengersparm;
    }

    public void setSuggestedroutepassengersparm(int suggestedroutepassengersparm) {
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

    public int getPassengertransportcommitteedecisionparm() {
        return passengertransportcommitteedecisionparm;
    }

    public void setPassengertransportcommitteedecisionparm(int passengertransportcommitteedecisionparm) {
        this.passengertransportcommitteedecisionparm = passengertransportcommitteedecisionparm;
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



