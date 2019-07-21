package com.etech.ltrc.permits.point;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

@NamedStoredProcedureQuery(
        name = "ReturnPoint",
        procedureName = "\"ReturnPoint\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Boolean.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Boolean.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Boolean.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Boolean.class),
        },
        resultSetMappings = {
                "PointResultSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "PointResultSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnPointResponse.class)
                }
        )
})
@Entity
public class ReturnPointResponse implements Serializable {

    @Id
    @ApiModelProperty("Point ID ") private long pointid  ;
    @ApiModelProperty("Point Arabic Name ") private String pointarabicname ;
    @ApiModelProperty("Province ID ") private long provinceid ;
    @ApiModelProperty("Province Arabic Name ") private String provincearabicname ;
    @ApiModelProperty("Governorate ID ") private long governorateid  ;
    @ApiModelProperty("Governorate Arabic Name ") private String governoratearabicname ;
    @ApiModelProperty("Municipality ID ") private long municipalityid ;
    @ApiModelProperty("Municipality Arabic Name ") private String municipalityarabicname ;
    @ApiModelProperty("Territory ID ") private long territoryid ;
    @ApiModelProperty("Territory Arabic Name ") private String territoryarabicname ;
    @ApiModelProperty("Point Neighborhood") private String pointneighborhood ;
    @ApiModelProperty("Point Street ") private String pointstreet ;
    @ApiModelProperty("Point Characteristics ") private long pointcharacteristic ;
    @ApiModelProperty("Characteristics Arabic Name ") private String characteristicarabicname ;
    @ApiModelProperty("Point Parking Type ") private long pointparkingtype ;
    @ApiModelProperty("Point Parking Type Name ") private String pointparkingtypename;
    @ApiModelProperty("Point Status ") private int pointstatus ;

    public long getPointid() {
        return pointid;
    }

    public void setPointid(long pointid) {
        this.pointid = pointid;
    }

    public String getPointarabicname() {
        return pointarabicname;
    }

    public void setPointarabicname(String pointarabicname) {
        this.pointarabicname = pointarabicname;
    }

    public long getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(long provinceid) {
        this.provinceid = provinceid;
    }

    public String getProvincearabicname() {
        return provincearabicname;
    }

    public void setProvincearabicname(String provincearabicname) {
        this.provincearabicname = provincearabicname;
    }

    public long getGovernorateid() {
        return governorateid;
    }

    public void setGovernorateid(long governorateid) {
        this.governorateid = governorateid;
    }

    public String getGovernoratearabicname() {
        return governoratearabicname;
    }

    public void setGovernoratearabicname(String governoratearabicname) {
        this.governoratearabicname = governoratearabicname;
    }

    public long getMunicipalityid() {
        return municipalityid;
    }

    public void setMunicipalityid(long municipalityid) {
        this.municipalityid = municipalityid;
    }

    public String getMunicipalityarabicname() {
        return municipalityarabicname;
    }

    public void setMunicipalityarabicname(String municipalityarabicname) {
        this.municipalityarabicname = municipalityarabicname;
    }

    public long getTerritoryid() {
        return territoryid;
    }

    public void setTerritoryid(long territoryid) {
        this.territoryid = territoryid;
    }

    public String getTerritoryarabicname() {
        return territoryarabicname;
    }

    public void setTerritoryarabicname(String territoryarabicname) {
        this.territoryarabicname = territoryarabicname;
    }

    public String getPointneighborhood() {
        return pointneighborhood;
    }

    public void setPointneighborhood(String pointneighborhood) {
        this.pointneighborhood = pointneighborhood;
    }

    public String getPointstreet() {
        return pointstreet;
    }

    public void setPointstreet(String pointstreet) {
        this.pointstreet = pointstreet;
    }

    public long getPointcharacteristic() {
        return pointcharacteristic;
    }

    public void setPointcharacteristic(long pointcharacteristic) {
        this.pointcharacteristic = pointcharacteristic;
    }

    public String getCharacteristicarabicname() {
        return characteristicarabicname;
    }

    public void setCharacteristicarabicname(String characteristicarabicname) {
        this.characteristicarabicname = characteristicarabicname;
    }

    public long getPointparkingtype() {
        return pointparkingtype;
    }

    public void setPointparkingtype(long pointparkingtype) {
        this.pointparkingtype = pointparkingtype;
    }

    public String getPointparkingtypename() {
        return pointparkingtypename;
    }

    public void setPointparkingtypename(String pointparkingtypename) {
        this.pointparkingtypename = pointparkingtypename;
    }

    public int getPointstatus() {
        return pointstatus;
    }

    public void setPointstatus(int pointstatus) {
        this.pointstatus = pointstatus;
    }
}
