package jo.gov.ltrc.workflow.services;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class SaveApplicationTariffFareDataRequest {

    @ApiModelProperty("Application Tariff Fare ID Parameter ") private long applicationtarifffareidparm ;
    @ApiModelProperty("Operator ID Parameter ") private long operatoridparm ;
    @ApiModelProperty("Operator Name Parameter ") private String operatornameparm ;
    @ApiModelProperty("Applicant Name Parameter ") private String applicantnameparm ;
    @ApiModelProperty("Phone Number Parameter ") private String phonenumberparm ;
    @ApiModelProperty("E-Mail Parameter ") private String emailparm ;
    @ApiModelProperty("Province Parameter ") private long provinceparm ;
    @ApiModelProperty("Governorate Parameter ") private long governorateparm ;
    @ApiModelProperty("Municipality Parameter ") private long municipalityparm ;
    @ApiModelProperty("Territory Parameter ") private long territoryparm ;
    @ApiModelProperty("Route ID Parameter ") private long routeidparm ;
    @ApiModelProperty("Vehicle Category Parameter ") private long vehiclecategoryparm ;
    @ApiModelProperty("Fule Type Parameter ") private long fuletypeparm ;
    @ApiModelProperty("Suggested Fare Parameter ") private double suggestedfareparm ;
    @ApiModelProperty("Reason Parameter ") private String reasonparm ;
    @ApiModelProperty("Disclosure Committee New Distance Parameter ") private double disclosurecommitteenewdistanceparm ;
    @ApiModelProperty("Disclosure Committee Explanation Parameter ") private String disclosurecommitteeexplanationparm ;
    @ApiModelProperty("New Tariff Parameter ") private double newtariffparm ;
    @ApiModelProperty("Tariff Calculator Explanation Parameter ") private String tariffcalculatorexplanationparm ;
    @ApiModelProperty("Study Reference Parameter ") private int studyreferenceparm ;
    @ApiModelProperty("Study Path Parameter ") private String studypathparm ;
    @ApiModelProperty("Tariff Calculator Decision Parameter ") private int tariffcalculatordecisionparm ;
    @ApiModelProperty("Director Directorate Passenger Transport Explanation Parameter ") private String directordirectoratepassengertransportexplanationparm ;
    @ApiModelProperty("Director Directorate Passenger Transport Decision Parameter ") private int directordirectoratepassengertransportdecisionparm ;
    @ApiModelProperty("Principal Parameter ") private long prencipal ;
    @ApiModelProperty("IP Address Parameter ") private String ipaddressparm ;
    @ApiModelProperty("Service Department Parameter ") private long servicedepartmentparm ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;

    public long getApplicationtarifffareidparm() {
        return applicationtarifffareidparm;
    }

    public void setApplicationtarifffareidparm(long applicationtarifffareidparm) {
        this.applicationtarifffareidparm = applicationtarifffareidparm;
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

    public long getVehiclecategoryparm() {
        return vehiclecategoryparm;
    }

    public void setVehiclecategoryparm(long vehiclecategoryparm) {
        this.vehiclecategoryparm = vehiclecategoryparm;
    }

    public long getFuletypeparm() {
        return fuletypeparm;
    }

    public void setFuletypeparm(long fuletypeparm) {
        this.fuletypeparm = fuletypeparm;
    }

    public double getSuggestedfareparm() {
        return suggestedfareparm;
    }

    public void setSuggestedfareparm(double suggestedfareparm) {
        this.suggestedfareparm = suggestedfareparm;
    }

    public String getReasonparm() {
        return reasonparm;
    }

    public void setReasonparm(String reasonparm) {
        this.reasonparm = reasonparm;
    }

    public double getDisclosurecommitteenewdistanceparm() {
        return disclosurecommitteenewdistanceparm;
    }

    public void setDisclosurecommitteenewdistanceparm(double disclosurecommitteenewdistanceparm) {
        this.disclosurecommitteenewdistanceparm = disclosurecommitteenewdistanceparm;
    }

    public String getDisclosurecommitteeexplanationparm() {
        return disclosurecommitteeexplanationparm;
    }

    public void setDisclosurecommitteeexplanationparm(String disclosurecommitteeexplanationparm) {
        this.disclosurecommitteeexplanationparm = disclosurecommitteeexplanationparm;
    }

    public double getNewtariffparm() {
        return newtariffparm;
    }

    public void setNewtariffparm(double newtariffparm) {
        this.newtariffparm = newtariffparm;
    }

    public String getTariffcalculatorexplanationparm() {
        return tariffcalculatorexplanationparm;
    }

    public void setTariffcalculatorexplanationparm(String tariffcalculatorexplanationparm) {
        this.tariffcalculatorexplanationparm = tariffcalculatorexplanationparm;
    }

    public int getStudyreferenceparm() {
        return studyreferenceparm;
    }

    public void setStudyreferenceparm(int studyreferenceparm) {
        this.studyreferenceparm = studyreferenceparm;
    }

    public String getStudypathparm() {
        return studypathparm;
    }

    public void setStudypathparm(String studypathparm) {
        this.studypathparm = studypathparm;
    }

    public int getTariffcalculatordecisionparm() {
        return tariffcalculatordecisionparm;
    }

    public void setTariffcalculatordecisionparm(int tariffcalculatordecisionparm) {
        this.tariffcalculatordecisionparm = tariffcalculatordecisionparm;
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

    public int getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(int statusparm) {
        this.statusparm = statusparm;
    }
}



