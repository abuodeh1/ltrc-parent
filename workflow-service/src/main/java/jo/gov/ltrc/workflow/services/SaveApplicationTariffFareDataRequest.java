package jo.gov.ltrc.workflow.services;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class SaveApplicationTariffFareDataRequest {

    @ApiModelProperty("Application Tariff Fare ID Parameter ") private Long applicationtarifffareidparm ;
    @ApiModelProperty("Operator ID Parameter ") private Long operatoridparm ;
    @ApiModelProperty("Operator Name Parameter ") private String operatornameparm ;
    @ApiModelProperty("Applicant Name Parameter ") private String applicantnameparm ;
    @ApiModelProperty("Phone Number Parameter ") private String phonenumberparm ;
    @ApiModelProperty("E-Mail Parameter ") private String emailparm ;
    @ApiModelProperty("Province Parameter ") private Long provinceparm ;
    @ApiModelProperty("Governorate Parameter ") private Long governorateparm ;
    @ApiModelProperty("Municipality Parameter ") private Long municipalityparm ;
    @ApiModelProperty("Territory Parameter ") private Long territoryparm ;
    @ApiModelProperty("Route ID Parameter ") private Long routeidparm ;
    @ApiModelProperty("Vehicle Category Parameter ") private Long vehiclecategoryparm ;
    @ApiModelProperty("Fule Type Parameter ") private Long fuletypeparm ;
    @ApiModelProperty("Suggested Fare Parameter ") private Double suggestedfareparm ;
    @ApiModelProperty("Reason Parameter ") private String reasonparm ;
    @ApiModelProperty("Disclosure Committee New Distance Parameter ") private Double disclosurecommitteenewdistanceparm ;
    @ApiModelProperty("Disclosure Committee Explanation Parameter ") private String disclosurecommitteeexplanationparm ;
    @ApiModelProperty("New Tariff Parameter ") private Double newtariffparm ;
    @ApiModelProperty("Tariff Calculator Explanation Parameter ") private String tariffcalculatorexplanationparm ;
    @ApiModelProperty("Study Reference Parameter ") private Integer studyreferenceparm ;
    @ApiModelProperty("Study Path Parameter ") private String studypathparm ;
    @ApiModelProperty("Tariff Calculator Decision Parameter ") private Integer tariffcalculatordecisionparm ;
    @ApiModelProperty("Director Directorate Passenger Transport Explanation Parameter ") private String directordirectoratepassengertransportexplanationparm ;
    @ApiModelProperty("Director Directorate Passenger Transport Decision Parameter ") private Integer directordirectoratepassengertransportdecisionparm ;
    @ApiModelProperty("Principal Parameter ") private Long prencipal ;
    @ApiModelProperty("IP Address Parameter ") private String ipaddressparm ;
    @ApiModelProperty("Service Department Parameter ") private Long servicedepartmentparm ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;
    @ApiModelProperty("Current Tariff Parameter") private Double currenttariffparm ;
    @ApiModelProperty("Difficult Terrain Parameter") private Boolean difficultterrainparm ;
    @ApiModelProperty("Number of Working Days Parameter") private Double numberofworkingdaysparm ;
    @ApiModelProperty("Route Has Been Modified Parameter") private Boolean routhasbeenmodifiedparm ;
    @ApiModelProperty("Route Length Parameter") private Double routelengthparm ;
    @ApiModelProperty("Others Parameter") private String othersparm ;
    @ApiModelProperty("GIS Distance Parameter") private Double gisdistanceparm ;

    public Long getApplicationtarifffareidparm() {
        return applicationtarifffareidparm;
    }

    public void setApplicationtarifffareidparm(Long applicationtarifffareidparm) {
        this.applicationtarifffareidparm = applicationtarifffareidparm;
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

    public Long getRouteidparm() {
        return routeidparm;
    }

    public void setRouteidparm(Long routeidparm) {
        this.routeidparm = routeidparm;
    }

    public Long getVehiclecategoryparm() {
        return vehiclecategoryparm;
    }

    public void setVehiclecategoryparm(Long vehiclecategoryparm) {
        this.vehiclecategoryparm = vehiclecategoryparm;
    }

    public Long getFuletypeparm() {
        return fuletypeparm;
    }

    public void setFuletypeparm(Long fuletypeparm) {
        this.fuletypeparm = fuletypeparm;
    }

    public Double getSuggestedfareparm() {
        return suggestedfareparm;
    }

    public void setSuggestedfareparm(Double suggestedfareparm) {
        this.suggestedfareparm = suggestedfareparm;
    }

    public String getReasonparm() {
        return reasonparm;
    }

    public void setReasonparm(String reasonparm) {
        this.reasonparm = reasonparm;
    }

    public Double getDisclosurecommitteenewdistanceparm() {
        return disclosurecommitteenewdistanceparm;
    }

    public void setDisclosurecommitteenewdistanceparm(Double disclosurecommitteenewdistanceparm) {
        this.disclosurecommitteenewdistanceparm = disclosurecommitteenewdistanceparm;
    }

    public String getDisclosurecommitteeexplanationparm() {
        return disclosurecommitteeexplanationparm;
    }

    public void setDisclosurecommitteeexplanationparm(String disclosurecommitteeexplanationparm) {
        this.disclosurecommitteeexplanationparm = disclosurecommitteeexplanationparm;
    }

    public Double getNewtariffparm() {
        return newtariffparm;
    }

    public void setNewtariffparm(Double newtariffparm) {
        this.newtariffparm = newtariffparm;
    }

    public String getTariffcalculatorexplanationparm() {
        return tariffcalculatorexplanationparm;
    }

    public void setTariffcalculatorexplanationparm(String tariffcalculatorexplanationparm) {
        this.tariffcalculatorexplanationparm = tariffcalculatorexplanationparm;
    }

    public Integer getStudyreferenceparm() {
        return studyreferenceparm;
    }

    public void setStudyreferenceparm(Integer studyreferenceparm) {
        this.studyreferenceparm = studyreferenceparm;
    }

    public String getStudypathparm() {
        return studypathparm;
    }

    public void setStudypathparm(String studypathparm) {
        this.studypathparm = studypathparm;
    }

    public Integer getTariffcalculatordecisionparm() {
        return tariffcalculatordecisionparm;
    }

    public void setTariffcalculatordecisionparm(Integer tariffcalculatordecisionparm) {
        this.tariffcalculatordecisionparm = tariffcalculatordecisionparm;
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

    public Integer getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(Integer statusparm) {
        this.statusparm = statusparm;
    }

    public Double getCurrenttariffparm() {
        return currenttariffparm;
    }

    public void setCurrenttariffparm(Double currenttariffparm) {
        this.currenttariffparm = currenttariffparm;
    }

    public Boolean getDifficultterrainparm() {
        return difficultterrainparm;
    }

    public void setDifficultterrainparm(Boolean difficultterrainparm) {
        this.difficultterrainparm = difficultterrainparm;
    }

    public Double getNumberofworkingdaysparm() {
        return numberofworkingdaysparm;
    }

    public void setNumberofworkingdaysparm(Double numberofworkingdaysparm) {
        this.numberofworkingdaysparm = numberofworkingdaysparm;
    }

    public Boolean getRouthasbeenmodifiedparm() {
        return routhasbeenmodifiedparm;
    }

    public void setRouthasbeenmodifiedparm(Boolean routhasbeenmodifiedparm) {
        this.routhasbeenmodifiedparm = routhasbeenmodifiedparm;
    }

    public Double getRoutelengthparm() {
        return routelengthparm;
    }

    public void setRoutelengthparm(Double routelengthparm) {
        this.routelengthparm = routelengthparm;
    }

    public String getOthersparm() {
        return othersparm;
    }

    public void setOthersparm(String othersparm) {
        this.othersparm = othersparm;
    }

    public Double getGisdistanceparm() {
        return gisdistanceparm;
    }

    public void setGisdistanceparm(Double gisdistanceparm) {
        this.gisdistanceparm = gisdistanceparm;
    }

    @Override
    public String toString() {
        return "SaveApplicationTariffFareDataRequest{" +
                "applicationtarifffareidparm=" + applicationtarifffareidparm +
                ", operatoridparm=" + operatoridparm +
                ", operatornameparm= " + operatornameparm + 
                ", applicantnameparm= " + applicantnameparm + 
                ", phonenumberparm= " + phonenumberparm + 
                ", emailparm= " + emailparm + 
                ", provinceparm=" + provinceparm +
                ", governorateparm=" + governorateparm +
                ", municipalityparm=" + municipalityparm +
                ", territoryparm=" + territoryparm +
                ", routeidparm=" + routeidparm +
                ", vehiclecategoryparm=" + vehiclecategoryparm +
                ", fuletypeparm=" + fuletypeparm +
                ", suggestedfareparm=" + suggestedfareparm +
                ", reasonparm= " + reasonparm + 
                ", disclosurecommitteenewdistanceparm=" + disclosurecommitteenewdistanceparm +
                ", disclosurecommitteeexplanationparm= " + disclosurecommitteeexplanationparm + 
                ", newtariffparm=" + newtariffparm +
                ", tariffcalculatorexplanationparm= " + tariffcalculatorexplanationparm + 
                ", studyreferenceparm=" + studyreferenceparm +
                ", studypathparm= " + studypathparm + 
                ", tariffcalculatordecisionparm=" + tariffcalculatordecisionparm +
                ", directordirectoratepassengertransportexplanationparm= " + directordirectoratepassengertransportexplanationparm + 
                ", directordirectoratepassengertransportdecisionparm=" + directordirectoratepassengertransportdecisionparm +
                ", prencipal=" + prencipal +
                ", ipaddressparm= " + ipaddressparm + 
                ", servicedepartmentparm=" + servicedepartmentparm +
                ", statusparm=" + statusparm +
                ", currenttariffparm=" + currenttariffparm +
                ", difficultterrainparm=" + difficultterrainparm +
                ", numberofworkingdaysparm=" + numberofworkingdaysparm +
                ", routhasbeenmodifiedparm=" + routhasbeenmodifiedparm +
                ", routelengthparm=" + routelengthparm +
                ", othersparm= " + othersparm + 
                ", gisdistanceparm=" + gisdistanceparm +
                '}';
    }
}



