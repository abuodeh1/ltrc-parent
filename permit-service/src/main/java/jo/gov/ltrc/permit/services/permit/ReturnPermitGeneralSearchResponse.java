package jo.gov.ltrc.permit.services.permit;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;


@NamedStoredProcedureQuery(
        name = "ReturnPermitGeneralSearch",
        procedureName = "\"ReturnPermitGeneralSearch\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "minpermitidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "maxpermitidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "permittypeparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "minissuedateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "maxissuedateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "mindeliverydateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "maxdeliverydateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "minperiodparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "maxperiodparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "minstartworkingdateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "maxstartworkingdateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "minendworkingdateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "maxendworkingdateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "provinceparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "governorateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "municipalityparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "routeparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "minnumberoftripsparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "maxnumberoftripsparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "primarydriverparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "alternativedriverparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "vehicleparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "classificationparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "workingasparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "startpointparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "endpointparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "lineidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "linenameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "routenameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatoridparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "operatornameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "platenumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "platecodeparm"),






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
    @ApiModelProperty("Permit ID ") private Long permitid ;
    @ApiModelProperty("Permit Type ") private Long permittype ;
    @ApiModelProperty("Permit Type Name ") private String permittypename ;
    @ApiModelProperty("Issue Date ") private Date issuedate ;
    @ApiModelProperty("Delivery Date ") private Date deliverydate ;
    @ApiModelProperty("Period ") private Long  period ;
    @ApiModelProperty("Start Working Date ") private Date startworkingdate ;
    @ApiModelProperty("End Working Date ") private Date endworkingdate ;
    @ApiModelProperty("Province ") private Long province ;
    @ApiModelProperty("Province Arabic Name ") private String provincearabicname ;
    @ApiModelProperty("Governorate ") private Long governorate ;
    @ApiModelProperty("Governorate Arabic Name ") private String governoratearabicname ;
    @ApiModelProperty("Municipality ") private Long municipality ;
    @ApiModelProperty("Municipality Arabic Name ") private String municipalityarabicname ;
    @ApiModelProperty("Route ") private Long route ;
    @ApiModelProperty("Route Name ") private String routename ;
    @ApiModelProperty("Departure Time ") private Time departuretime ;
    @ApiModelProperty("Completion Time ") private Time completiontime ;
    @ApiModelProperty("Number of Trips ") private Integer numberoftrips ;
    @ApiModelProperty("Decided Tariff ") private  Double decidedtariff  ;
    @ApiModelProperty("Primary Driver ") private String primarydriver ;
    @ApiModelProperty("Primary Driver Passport ") private String primarydriverpassport ;
    @ApiModelProperty("Alternative Driver") private String alternativedriver  ;
    @ApiModelProperty("Alternative Driver Passport ") private String alternativedriverpassport ;
    @ApiModelProperty("Status ") private Integer status ;
    @ApiModelProperty("Vehicle ") private Long vehicle ;
    @ApiModelProperty("Registration Number ") private String registrationnumber ;
    @ApiModelProperty("Plate Code ") private String platecode ;
    @ApiModelProperty("Plate Number ") private String platenumber ;
    @ApiModelProperty("Classification ") private Integer classification ;
    @ApiModelProperty("Working As") private Long workingas ;
    @ApiModelProperty("Permit Working As Name ") private String permitworkingasname ;
    @ApiModelProperty("Start Point ") private Long startpoint ;
    @ApiModelProperty("Start Point Arabic Name ") private String startpointarabicname ;
    @ApiModelProperty("End Point ") private Long endpoint ;
    @ApiModelProperty("End Point Arabic Name ") private String endpointarabicname ;

    public Long getPermitid() {
        return permitid;
    }

    public void setPermitid(Long permitid) {
        this.permitid = permitid;
    }

    public Long getPermittype() {
        return permittype;
    }

    public void setPermittype(Long permittype) {
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

    public Long getPeriod() {
        return period;
    }

    public void setPeriod(Long period) {
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

    public Long getProvince() {
        return province;
    }

    public void setProvince(Long province) {
        this.province = province;
    }

    public String getProvincearabicname() {
        return provincearabicname;
    }

    public void setProvincearabicname(String provincearabicname) {
        this.provincearabicname = provincearabicname;
    }

    public Long getGovernorate() {
        return governorate;
    }

    public void setGovernorate(Long governorate) {
        this.governorate = governorate;
    }

    public String getGovernoratearabicname() {
        return governoratearabicname;
    }

    public void setGovernoratearabicname(String governoratearabicname) {
        this.governoratearabicname = governoratearabicname;
    }

    public Long getMunicipality() {
        return municipality;
    }

    public void setMunicipality(Long municipality) {
        this.municipality = municipality;
    }

    public String getMunicipalityarabicname() {
        return municipalityarabicname;
    }

    public void setMunicipalityarabicname(String municipalityarabicname) {
        this.municipalityarabicname = municipalityarabicname;
    }

    public Long getRoute() {
        return route;
    }

    public void setRoute(Long route) {
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

    public Integer getNumberoftrips() {
        return numberoftrips;
    }

    public void setNumberoftrips(Integer numberoftrips) {
        this.numberoftrips = numberoftrips;
    }

    public Double getDecidedtariff() {
        return decidedtariff;
    }

    public void setDecidedtariff(Double decidedtariff) {
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getVehicle() {
        return vehicle;
    }

    public void setVehicle(Long vehicle) {
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

    public Integer getClassification() {
        return classification;
    }

    public void setClassification(Integer classification) {
        this.classification = classification;
    }

    public Long getWorkingas() {
        return workingas;
    }

    public void setWorkingas(Long workingas) {
        this.workingas = workingas;
    }

    public String getPermitworkingasname() {
        return permitworkingasname;
    }

    public void setPermitworkingasname(String permitworkingasname) {
        this.permitworkingasname = permitworkingasname;
    }

    public Long getStartpoint() {
        return startpoint;
    }

    public void setStartpoint(Long startpoint) {
        this.startpoint = startpoint;
    }

    public String getStartpointarabicname() {
        return startpointarabicname;
    }

    public void setStartpointarabicname(String startpointarabicname) {
        this.startpointarabicname = startpointarabicname;
    }

    public Long getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(Long endpoint) {
        this.endpoint = endpoint;
    }

    public String getEndpointarabicname() {
        return endpointarabicname;
    }

    public void setEndpointarabicname(String endpointarabicname) {
        this.endpointarabicname = endpointarabicname;
    }

    @Override
    public String toString() {
        return "ReturnPermitGeneralSearchResponse{" +
                "permitid=" + permitid +
                ", permittype=" + permittype +
                ", permittypename=" + permittypename +
                ", issuedate=" + issuedate +
                ", deliverydate=" + deliverydate +
                ", period=" + period +
                ", startworkingdate=" + startworkingdate +
                ", endworkingdate=" + endworkingdate +
                ", province=" + province +
                ", provincearabicname=" + provincearabicname +
                ", governorate=" + governorate +
                ", governoratearabicname=" + governoratearabicname +
                ", municipality=" + municipality +
                ", municipalityarabicname=" + municipalityarabicname +
                ", route=" + route +
                ", routename=" + routename +
                ", departuretime=" + departuretime +
                ", completiontime=" + completiontime +
                ", numberoftrips=" + numberoftrips +
                ", decidedtariff=" + decidedtariff +
                ", primarydriver=" + primarydriver +
                ", primarydriverpassport=" + primarydriverpassport +
                ", alternativedriver=" + alternativedriver +
                ", alternativedriverpassport=" + alternativedriverpassport +
                ", status=" + status +
                ", vehicle=" + vehicle +
                ", registrationnumber=" + registrationnumber +
                ", platecode=" + platecode +
                ", platenumber=" + platenumber +
                ", classification=" + classification +
                ", workingas=" + workingas +
                ", permitworkingasname=" + permitworkingasname +
                ", startpoint=" + startpoint +
                ", startpointarabicname=" + startpointarabicname +
                ", endpoint=" + endpoint +
                ", endpointarabicname=" + endpointarabicname +
                '}';
    }
}
