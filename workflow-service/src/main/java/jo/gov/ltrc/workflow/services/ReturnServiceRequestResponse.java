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
    private long   servicerequestid      ;
    private long   servicetype           ;
    private String servicetypename       ;
    private long   requestedby           ;
    private Date   requestdate           ;
    private String applicantphonenumber  ;
    private String applicantemail        ;
    private long   province              ;
    private String provincearabicname    ;
    private long   governorate           ;
    private String governoratearabicname ;
    private long   municipality          ;
    private String municipalityarabicname;
    private long   territory             ;
    private String territoryarabicname   ;
    private int    servicerequeststatus  ;
    private Date   createddate           ;
    private long   createdby             ;
    private Date   modifieddate          ;
    private long   modifiedby            ;

    public long getServicerequestid() {
        return servicerequestid;
    }

    public void setServicerequestid(long servicerequestid) {
        this.servicerequestid = servicerequestid;
    }

    public long getServicetype() {
        return servicetype;
    }

    public void setServicetype(long servicetype) {
        this.servicetype = servicetype;
    }

    public String getServicetypename() {
        return servicetypename;
    }

    public void setServicetypename(String servicetypename) {
        this.servicetypename = servicetypename;
    }

    public long getRequestedby() {
        return requestedby;
    }

    public void setRequestedby(long requestedby) {
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

    public long getTerritory() {
        return territory;
    }

    public void setTerritory(long territory) {
        this.territory = territory;
    }

    public String getTerritoryarabicname() {
        return territoryarabicname;
    }

    public void setTerritoryarabicname(String territoryarabicname) {
        this.territoryarabicname = territoryarabicname;
    }

    public int getServicerequeststatus() {
        return servicerequeststatus;
    }

    public void setServicerequeststatus(int servicerequeststatus) {
        this.servicerequeststatus = servicerequeststatus;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public long getCreatedby() {
        return createdby;
    }

    public void setCreatedby(long createdby) {
        this.createdby = createdby;
    }

    public Date getModifieddate() {
        return modifieddate;
    }

    public void setModifieddate(Date modifieddate) {
        this.modifieddate = modifieddate;
    }

    public long getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(long modifiedby) {
        this.modifiedby = modifiedby;
    }
}
