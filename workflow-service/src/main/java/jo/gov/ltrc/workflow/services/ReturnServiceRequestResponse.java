package jo.gov.ltrc.workflow.services;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@NamedStoredProcedureQuery(
        name = "ReturnServiceRequest",
        procedureName = "\"ReturnServiceRequest\"",
        parameters = {

        },
        resultSetMappings = {
                "ReturnAllLineTypeSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnAllLineTypeSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnServiceRequestResponse.class)
                }
        )
})



@Entity
public class ReturnServiceRequestResponse implements Serializable {

    @Id
    private Long   servicerequestid      ;
    private Long   servicetype           ;
    private String servicetypename       ;
    private Long   requestedby           ;
    private Date   requestdate           ;
    private String applicantphonenumber  ;
    private String applicantemail        ;
    private Long   province              ;
    private String provincearabicname    ;
    private Long   governorate           ;
    private String governoratearabicname ;
    private Long   municipality          ;
    private String municipalityarabicname;
    private Long   territory             ;
    private String territoryarabicname   ;
    private Integer    servicerequeststatus  ;
    private Date   createddate           ;
    private Long   createdby             ;
    private Date   modifieddate          ;
    private Long   modifiedby            ;

    public Long getServicerequestid() {
        return servicerequestid;
    }

    public void setServicerequestid(Long servicerequestid) {
        this.servicerequestid = servicerequestid;
    }

    public Long getServicetype() {
        return servicetype;
    }

    public void setServicetype(Long servicetype) {
        this.servicetype = servicetype;
    }

    public String getServicetypename() {
        return servicetypename;
    }

    public void setServicetypename(String servicetypename) {
        this.servicetypename = servicetypename;
    }

    public Long getRequestedby() {
        return requestedby;
    }

    public void setRequestedby(Long requestedby) {
        this.requestedby = requestedby;
    }

    public Date getRequestdate() {
        return requestdate;
    }

    public void setRequestdate(Date requestdate) {
        this.requestdate = requestdate;
    }

    public String getApplicantphonenumber() {
        return applicantphonenumber;
    }

    public void setApplicantphonenumber(String applicantphonenumber) {
        this.applicantphonenumber = applicantphonenumber;
    }

    public String getApplicantemail() {
        return applicantemail;
    }

    public void setApplicantemail(String applicantemail) {
        this.applicantemail = applicantemail;
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

    public Long getTerritory() {
        return territory;
    }

    public void setTerritory(Long territory) {
        this.territory = territory;
    }

    public String getTerritoryarabicname() {
        return territoryarabicname;
    }

    public void setTerritoryarabicname(String territoryarabicname) {
        this.territoryarabicname = territoryarabicname;
    }

    public Integer getServicerequeststatus() {
        return servicerequeststatus;
    }

    public void setServicerequeststatus(Integer servicerequeststatus) {
        this.servicerequeststatus = servicerequeststatus;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public Long getCreatedby() {
        return createdby;
    }

    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    public Date getModifieddate() {
        return modifieddate;
    }

    public void setModifieddate(Date modifieddate) {
        this.modifieddate = modifieddate;
    }

    public Long getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(Long modifiedby) {
        this.modifiedby = modifiedby;
    }

    @Override
    public String toString() {
        return "ReturnServiceRequestResponse{" +
                "servicerequestid=" + servicerequestid +
                ", servicetype=" + servicetype +
                ", servicetypename= " + servicetypename + 
                ", requestedby=" + requestedby +
                ", requestdate=" + requestdate +
                ", applicantphonenumber= " + applicantphonenumber + 
                ", applicantemail= " + applicantemail + 
                ", province=" + province +
                ", provincearabicname= " + provincearabicname + 
                ", governorate=" + governorate +
                ", governoratearabicname= " + governoratearabicname + 
                ", municipality=" + municipality +
                ", municipalityarabicname= " + municipalityarabicname + 
                ", territory=" + territory +
                ", territoryarabicname= " + territoryarabicname + 
                ", servicerequeststatus=" + servicerequeststatus +
                ", createddate=" + createddate +
                ", createdby=" + createdby +
                ", modifieddate=" + modifieddate +
                ", modifiedby=" + modifiedby +
                '}';
    }
}
