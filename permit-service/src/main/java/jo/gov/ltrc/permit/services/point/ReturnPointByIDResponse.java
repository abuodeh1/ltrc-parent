package jo.gov.ltrc.permit.services.point;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQuery(
        name = "ReturnPointByPointID",
        procedureName = "\"ReturnPointByPointID\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
        },
        resultSetMappings = {
                "PointByIDResultSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "PointByIDResultSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnPointByIDResponse.class)
                }
        )
})
@Entity
public class ReturnPointByIDResponse implements Serializable {

    @Id
    @ApiModelProperty("Point ID ") private Long pointid                    ;
    @ApiModelProperty("Point Arabic Name ") private String pointarabicname          ;
    @ApiModelProperty("Province ID ") private Long provinceid                 ;
    @ApiModelProperty("Province Arabic Name ") private String provincearabicname       ;
    @ApiModelProperty("Governorate ID ") private Long governorateid              ;
    @ApiModelProperty("Governorate Arabic Name ") private String governoratearabicname    ;
    @ApiModelProperty("Municipality ID ") private Long municipalityid             ;
    @ApiModelProperty("Municipality Arabic Name ") private String municipalityarabicname   ;
    @ApiModelProperty("Territory ID ") private Long territoryid                ;
    @ApiModelProperty("Territory Arabic Name ") private String territoryarabicname      ;
    @ApiModelProperty("Point Neighborhood") private String pointneighborhood        ;
    @ApiModelProperty("Point Street ") private String pointstreet              ;
    @ApiModelProperty("Point Characteristic ") private Long pointcharacteristic        ;
    @ApiModelProperty("Characteristic Arabic Name ") private String characteristicarabicname ;
    @ApiModelProperty("Point Parking Type ") private Long pointparkingtype           ;
    @ApiModelProperty("Parking Type Arabic Name ") private String parkingtypearabicname    ;
    @ApiModelProperty("Point Status ") private Integer pointstatus                 ;
    @ApiModelProperty("Office Name ") private String officename               ;
    @ApiModelProperty("Office Phone Number ") private String officephonenumber        ;
    @ApiModelProperty("Liaison Office Name ") private String liaisonofficername       ;
    @ApiModelProperty("Sun Shades ") private   Boolean sunshades               ;
    @ApiModelProperty("Health Care Facilities ") private   Boolean healthcarefacilities    ;
    @ApiModelProperty("Public Telephones") private   Boolean publictelephones        ;
    @ApiModelProperty("Seat ") private   Boolean seat                    ;
    @ApiModelProperty("Terminal Area ") private  Double terminalarea             ;
    @ApiModelProperty("Count of Sun Shades ") private  Double countofsunshades         ;
    @ApiModelProperty("Count of Seats ") private  Double countofseats             ;
    @ApiModelProperty("Count of Lanes ") private  Double countoflanes             ;
    @ApiModelProperty("Count of Seats and Sun Shades ") private  Double countofseatsandsunshades ;
    @ApiModelProperty("Terminal Remarks ") private String terminalremarks          ;

    public Long getPointid() {
        return pointid;
    }

    public void setPointid(Long pointid) {
        this.pointid = pointid;
    }

    public String getPointarabicname() {
        return pointarabicname;
    }

    public void setPointarabicname(String pointarabicname) {
        this.pointarabicname = pointarabicname;
    }

    public Long getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Long provinceid) {
        this.provinceid = provinceid;
    }

    public String getProvincearabicname() {
        return provincearabicname;
    }

    public void setProvincearabicname(String provincearabicname) {
        this.provincearabicname = provincearabicname;
    }

    public Long getGovernorateid() {
        return governorateid;
    }

    public void setGovernorateid(Long governorateid) {
        this.governorateid = governorateid;
    }

    public String getGovernoratearabicname() {
        return governoratearabicname;
    }

    public void setGovernoratearabicname(String governoratearabicname) {
        this.governoratearabicname = governoratearabicname;
    }

    public Long getMunicipalityid() {
        return municipalityid;
    }

    public void setMunicipalityid(Long municipalityid) {
        this.municipalityid = municipalityid;
    }

    public String getMunicipalityarabicname() {
        return municipalityarabicname;
    }

    public void setMunicipalityarabicname(String municipalityarabicname) {
        this.municipalityarabicname = municipalityarabicname;
    }

    public Long getTerritoryid() {
        return territoryid;
    }

    public void setTerritoryid(Long territoryid) {
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

    public Long getPointcharacteristic() {
        return pointcharacteristic;
    }

    public void setPointcharacteristic(Long pointcharacteristic) {
        this.pointcharacteristic = pointcharacteristic;
    }

    public String getCharacteristicarabicname() {
        return characteristicarabicname;
    }

    public void setCharacteristicarabicname(String characteristicarabicname) {
        this.characteristicarabicname = characteristicarabicname;
    }

    public Long getPointparkingtype() {
        return pointparkingtype;
    }

    public void setPointparkingtype(Long pointparkingtype) {
        this.pointparkingtype = pointparkingtype;
    }

    public String getParkingtypearabicname() {
        return parkingtypearabicname;
    }

    public void setParkingtypearabicname(String parkingtypearabicname) {
        this.parkingtypearabicname = parkingtypearabicname;
    }

    public Integer getPointstatus() {
        return pointstatus;
    }

    public void setPointstatus(Integer pointstatus) {
        this.pointstatus = pointstatus;
    }

    public String getOfficename() {
        return officename;
    }

    public void setOfficename(String officename) {
        this.officename = officename;
    }

    public String getOfficephonenumber() {
        return officephonenumber;
    }

    public void setOfficephonenumber(String officephonenumber) {
        this.officephonenumber = officephonenumber;
    }

    public String getLiaisonofficername() {
        return liaisonofficername;
    }

    public void setLiaisonofficername(String liaisonofficername) {
        this.liaisonofficername = liaisonofficername;
    }

    public Boolean getSunshades() {
        return sunshades;
    }

    public void setSunshades(Boolean sunshades) {
        this.sunshades = sunshades;
    }

    public Boolean getHealthcarefacilities() {
        return healthcarefacilities;
    }

    public void setHealthcarefacilities(Boolean healthcarefacilities) {
        this.healthcarefacilities = healthcarefacilities;
    }

    public Boolean getPublictelephones() {
        return publictelephones;
    }

    public void setPublictelephones(Boolean publictelephones) {
        this.publictelephones = publictelephones;
    }

    public Boolean getSeat() {
        return seat;
    }

    public void setSeat(Boolean seat) {
        this.seat = seat;
    }

    public Double getTerminalarea() {
        return terminalarea;
    }

    public void setTerminalarea(Double terminalarea) {
        this.terminalarea = terminalarea;
    }

    public Double getCountofsunshades() {
        return countofsunshades;
    }

    public void setCountofsunshades(Double countofsunshades) {
        this.countofsunshades = countofsunshades;
    }

    public Double getCountofseats() {
        return countofseats;
    }

    public void setCountofseats(Double countofseats) {
        this.countofseats = countofseats;
    }

    public Double getCountoflanes() {
        return countoflanes;
    }

    public void setCountoflanes(Double countoflanes) {
        this.countoflanes = countoflanes;
    }

    public Double getCountofseatsandsunshades() {
        return countofseatsandsunshades;
    }

    public void setCountofseatsandsunshades(Double countofseatsandsunshades) {
        this.countofseatsandsunshades = countofseatsandsunshades;
    }

    public String getTerminalremarks() {
        return terminalremarks;
    }

    public void setTerminalremarks(String terminalremarks) {
        this.terminalremarks = terminalremarks;
    }

    @Override
    public String toString() {
        return "ReturnPointByIDResponse{" +
                "pointid=" + pointid +
                ", pointarabicname=" + pointarabicname +
                ", provinceid=" + provinceid +
                ", provincearabicname=" + provincearabicname +
                ", governorateid=" + governorateid +
                ", governoratearabicname=" + governoratearabicname +
                ", municipalityid=" + municipalityid +
                ", municipalityarabicname=" + municipalityarabicname +
                ", territoryid=" + territoryid +
                ", territoryarabicname=" + territoryarabicname +
                ", pointneighborhood=" + pointneighborhood +
                ", pointstreet=" + pointstreet +
                ", pointcharacteristic=" + pointcharacteristic +
                ", characteristicarabicname=" + characteristicarabicname +
                ", pointparkingtype=" + pointparkingtype +
                ", parkingtypearabicname=" + parkingtypearabicname +
                ", pointstatus=" + pointstatus +
                ", officename=" + officename +
                ", officephonenumber=" + officephonenumber +
                ", liaisonofficername=" + liaisonofficername +
                ", sunshades=" + sunshades +
                ", healthcarefacilities=" + healthcarefacilities +
                ", publictelephones=" + publictelephones +
                ", seat=" + seat +
                ", terminalarea=" + terminalarea +
                ", countofsunshades=" + countofsunshades +
                ", countofseats=" + countofseats +
                ", countoflanes=" + countoflanes +
                ", countofseatsandsunshades=" + countofseatsandsunshades +
                ", terminalremarks=" + terminalremarks +
                '}';
    }
}
