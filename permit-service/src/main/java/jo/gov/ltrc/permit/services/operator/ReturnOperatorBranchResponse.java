package com.etech.ltrc.permits.operator;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@NamedStoredProcedureQuery(
        name = "ReturnOperatorBranch",
        procedureName = "\"ReturnOperatorBranch\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),


        },
        resultSetMappings = {
                "ReturnOperatorBranchSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnOperatorBranchSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnOperatorBranchResponse.class)
                }
        )
})
@Entity
public class ReturnOperatorBranchResponse implements Serializable {

    @Id
    @ApiModelProperty("Operator Branch ID ") private long operatorbranchid ;
    @ApiModelProperty("Operator ID ") private long operatorid ;
    @ApiModelProperty("Operator Name ") private String operatorname ;
    @ApiModelProperty("Province ") private long province ;
    @ApiModelProperty("Province Arabic Name ") private String provincearabicname ;
    @ApiModelProperty("Governorate ") private long governorate ;
    @ApiModelProperty("Governorate Arabic Name ") private String governoratearabicname ;
    @ApiModelProperty("Municipality ") private long municipality ;
    @ApiModelProperty("Municipality Arabic Name ") private String municipalityarabicname ;
    @ApiModelProperty("Territory ") private long territory ;
    @ApiModelProperty("Territory Arabic Name ") private String territoryarabicname ;
    @ApiModelProperty("Neighborhood ") private String neighborhood ;
    @ApiModelProperty("Street ") private String street ;
    @ApiModelProperty("Basin ") private String basin ;
    @ApiModelProperty("Plot No") private String plotno ;
    @ApiModelProperty("Po Box ") private String pobox ;
    @ApiModelProperty("Telephone ") private String telephone ;
    @ApiModelProperty("Fax ") private String fax ;
    @ApiModelProperty("Mobile Phone ") private String mobilephone ;
    @ApiModelProperty("E-Mail ") private String email ;
    @ApiModelProperty("Agreement Reference Number ") private String aggreementreferencenumber ;
    @ApiModelProperty("Agreement Reference Date ") private Date aggreementreferencedate ;
    @ApiModelProperty("Vehicle Count ") private int vehiclecount ;
    @ApiModelProperty("Branch Name ") private String branchname ;
    @ApiModelProperty("Certification Registration Number ") private String certificateregistrationnumber ;
    @ApiModelProperty("Status ") private String status ;


    public long getOperatorbranchid() {
        return operatorbranchid;
    }

    public void setOperatorbranchid(long operatorbranchid) {
        this.operatorbranchid = operatorbranchid;
    }

    public long getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(long operatorid) {
        this.operatorid = operatorid;
    }

    public String getOperatorname() {
        return operatorname;
    }

    public void setOperatorname(String operatorname) {
        this.operatorname = operatorname;
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

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBasin() {
        return basin;
    }

    public void setBasin(String basin) {
        this.basin = basin;
    }

    public String getPlotno() {
        return plotno;
    }

    public void setPlotno(String plotno) {
        this.plotno = plotno;
    }

    public String getPobox() {
        return pobox;
    }

    public void setPobox(String pobox) {
        this.pobox = pobox;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAggreementreferencenumber() {
        return aggreementreferencenumber;
    }

    public void setAggreementreferencenumber(String aggreementreferencenumber) {
        this.aggreementreferencenumber = aggreementreferencenumber;
    }

    public Date getAggreementreferencedate() {
        return aggreementreferencedate;
    }

    public void setAggreementreferencedate(Date aggreementreferencedate) {
        this.aggreementreferencedate = aggreementreferencedate;
    }

    public int getVehiclecount() {
        return vehiclecount;
    }

    public void setVehiclecount(int vehiclecount) {
        this.vehiclecount = vehiclecount;
    }

    public String getBranchname() {
        return branchname;
    }

    public void setBranchname(String branchname) {
        this.branchname = branchname;
    }

    public String getCertificateregistrationnumber() {
        return certificateregistrationnumber;
    }

    public void setCertificateregistrationnumber(String certificateregistrationnumber) {
        this.certificateregistrationnumber = certificateregistrationnumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
