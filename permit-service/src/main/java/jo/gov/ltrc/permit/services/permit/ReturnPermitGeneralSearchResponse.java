package com.etech.ltrc.permits.permit;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;


@NamedStoredProcedureQuery(
        name = "ReturnPermitGeneralSearch",
        procedureName = "\"ReturnPermitGeneralSearch\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),






        },
        resultSetMappings = {
                "ReturnPermitGeneralSearchSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnPermitGeneralSearchSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnPermitGeneralSearchResponse.class)
                }
        )
})
@Entity
public class ReturnPermitGeneralSearchResponse implements Serializable {

    @Id
    @ApiModelProperty("Permit ID ") private long permitid ;
    @ApiModelProperty("Permit Type ") private long permittype ;
    @ApiModelProperty("Permit Type Name ") private String permittypename ;
    @ApiModelProperty("Issue Date ") private Date issuedate ;
    @ApiModelProperty("Delivery Date ") private Date deliverydate ;
    @ApiModelProperty("Period ") private long  period ;
    @ApiModelProperty("Start Working Date ") private Date startworkingdate ;
    @ApiModelProperty("End Working Date ") private Date endworkingdate ;
    @ApiModelProperty("Province ") private long province ;
    @ApiModelProperty("Province Arabic Name ") private String provincearabicname ;
    @ApiModelProperty("Governorate ") private long governorate ;
    @ApiModelProperty("Governorate Arabic Name ") private String governoratearabicname ;
    @ApiModelProperty("Municipality ") private long municipality ;
    @ApiModelProperty("Municipality Arabic Name ") private String municipalityarabicname ;
    @ApiModelProperty("Route ") private long route ;
    @ApiModelProperty("Route Name ") private String routename ;
    @ApiModelProperty("Departure Time ") private Time departuretime ;
    @ApiModelProperty("Completion Time ") private Time completiontime ;
    @ApiModelProperty("Number of Trips ") private int numberoftrips ;
    @ApiModelProperty("Decided Tariff ") private double decidedtariff  ;
    @ApiModelProperty("Primary Driver ") private String primarydriver ;
    @ApiModelProperty("Primary Driver Passport ") private String primarydriverpassport ;
    @ApiModelProperty("Alternative Driver") private String alternativedriver  ;
    @ApiModelProperty("Alternative Driver Passport ") private String alternativedriverpassport ;
    @ApiModelProperty("Status ") private int status ;
    @ApiModelProperty("Vehicle ") private long vehicle ;
    @ApiModelProperty("Registration Number ") private String registrationnumber ;
    @ApiModelProperty("Plate Code ") private String platecode ;
    @ApiModelProperty("Plate Number ") private String platenumber ;
    @ApiModelProperty("Classification ") private int classification ;
    @ApiModelProperty("Working As") private long workingas ;
    @ApiModelProperty("Permit Working As Name ") private String permitworkingasname ;
    @ApiModelProperty("Start Point ") private long startpoint ;
    @ApiModelProperty("Start Point Arabic Name ") private String startpointarabicname ;
    @ApiModelProperty("End Point ") private long endpoint ;
    @ApiModelProperty("End Point Arabic Name ") private String endpointarabicname ;

    public long getPermitid() {
        return permitid;
    }

    public void setPermitid(long permitid) {
        this.permitid = permitid;
    }

    public long getPermittype() {
        return permittype;
    }

    public void setPermittype(long permittype) {
        this.permittype = permittype;
    }

    public String getPermittypename() {
        return permittypename;
    }

    public void setPermittypename(String permittypename) {
        this.permittypename = permittypename;
    }

    public Date getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(Date issuedate) {
        this.issuedate = issuedate;
    }

    public Date getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(Date deliverydate) {
        this.deliverydate = deliverydate;
    }

    public long getPeriod() {
        return period;
    }

    public void setPeriod(long period) {
        this.period = period;
    }

    public Date getStartworkingdate() {
        return startworkingdate;
    }

    public void setStartworkingdate(Date startworkingdate) {
        this.startworkingdate = startworkingdate;
    }

    public Date getEndworkingdate() {
        return endworkingdate;
    }

    public void setEndworkingdate(Date endworkingdate) {
        this.endworkingdate = endworkingdate;
    }

    public long getProvince() {
        return province;
    }

    public void setProvince(long province) {
        this.province = province;
    }

    public String getProvincearabicname() {
        return provincearabicname;
    }

    public void setProvincearabicname(String provincearabicname) {
        this.provincearabicname = provincearabicname;
    }

    public long getGovernorate() {
        return governorate;
    }

    public void setGovernorate(long governorate) {
        this.governorate = governorate;
    }

    public String getGovernoratearabicname() {
        return governoratearabicname;
    }

    public void setGovernoratearabicname(String governoratearabicname) {
        this.governoratearabicname = governoratearabicname;
    }

    public long getMunicipality() {
        return municipality;
    }

    public void setMunicipality(long municipality) {
        this.municipality = municipality;
    }

    public String getMunicipalityarabicname() {
        return municipalityarabicname;
    }

    public void setMunicipalityarabicname(String municipalityarabicname) {
        this.municipalityarabicname = municipalityarabicname;
    }

    public long getRoute() {
        return route;
    }

    public void setRoute(long route) {
        this.route = route;
    }

    public String getRoutename() {
        return routename;
    }

    public void setRoutename(String routename) {
        this.routename = routename;
    }

    public Time getDeparturetime() {
        return departuretime;
    }

    public void setDeparturetime(Time departuretime) {
        this.departuretime = departuretime;
    }

    public Time getCompletiontime() {
        return completiontime;
    }

    public void setCompletiontime(Time completiontime) {
        this.completiontime = completiontime;
    }

    public int getNumberoftrips() {
        return numberoftrips;
    }

    public void setNumberoftrips(int numberoftrips) {
        this.numberoftrips = numberoftrips;
    }

    public double getDecidedtariff() {
        return decidedtariff;
    }

    public void setDecidedtariff(double decidedtariff) {
        this.decidedtariff = decidedtariff;
    }

    public String getPrimarydriver() {
        return primarydriver;
    }

    public void setPrimarydriver(String primarydriver) {
        this.primarydriver = primarydriver;
    }

    public String getPrimarydriverpassport() {
        return primarydriverpassport;
    }

    public void setPrimarydriverpassport(String primarydriverpassport) {
        this.primarydriverpassport = primarydriverpassport;
    }

    public String getAlternativedriver() {
        return alternativedriver;
    }

    public void setAlternativedriver(String alternativedriver) {
        this.alternativedriver = alternativedriver;
    }

    public String getAlternativedriverpassport() {
        return alternativedriverpassport;
    }

    public void setAlternativedriverpassport(String alternativedriverpassport) {
        this.alternativedriverpassport = alternativedriverpassport;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getVehicle() {
        return vehicle;
    }

    public void setVehicle(long vehicle) {
        this.vehicle = vehicle;
    }

    public String getRegistrationnumber() {
        return registrationnumber;
    }

    public void setRegistrationnumber(String registrationnumber) {
        this.registrationnumber = registrationnumber;
    }

    public String getPlatecode() {
        return platecode;
    }

    public void setPlatecode(String platecode) {
        this.platecode = platecode;
    }

    public String getPlatenumber() {
        return platenumber;
    }

    public void setPlatenumber(String platenumber) {
        this.platenumber = platenumber;
    }

    public int getClassification() {
        return classification;
    }

    public void setClassification(int classification) {
        this.classification = classification;
    }

    public long getWorkingas() {
        return workingas;
    }

    public void setWorkingas(long workingas) {
        this.workingas = workingas;
    }

    public String getPermitworkingasname() {
        return permitworkingasname;
    }

    public void setPermitworkingasname(String permitworkingasname) {
        this.permitworkingasname = permitworkingasname;
    }

    public long getStartpoint() {
        return startpoint;
    }

    public void setStartpoint(long startpoint) {
        this.startpoint = startpoint;
    }

    public long getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(long endpoint) {
        this.endpoint = endpoint;
    }

    public String getStartpointarabicname() {
        return startpointarabicname;
    }

    public void setStartpointarabicname(String startpointarabicname) {
        this.startpointarabicname = startpointarabicname;
    }

    public String getEndpointarabicname() {
        return endpointarabicname;
    }

    public void setEndpointarabicname(String endpointarabicname) {
        this.endpointarabicname = endpointarabicname;
    }
}
