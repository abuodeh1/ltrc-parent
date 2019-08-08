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
    @ApiModelProperty("Point ID ") private long pointid                    ;
    @ApiModelProperty("Point Arabic Name ") private String pointarabicname          ;
    @ApiModelProperty("Province ID ") private long provinceid                 ;
    @ApiModelProperty("Province Arabic Name ") private String provincearabicname       ;
    @ApiModelProperty("Governorate ID ") private long governorateid              ;
    @ApiModelProperty("Governorate Arabic Name ") private String governoratearabicname    ;
    @ApiModelProperty("Municipality ID ") private long municipalityid             ;
    @ApiModelProperty("Municipality Arabic Name ") private String municipalityarabicname   ;
    @ApiModelProperty("Territory ID ") private long territoryid                ;
    @ApiModelProperty("Territory Arabic Name ") private String territoryarabicname      ;
    @ApiModelProperty("Point Neighborhood") private String pointneighborhood        ;
    @ApiModelProperty("Point Street ") private String pointstreet              ;
    @ApiModelProperty("Point Characteristic ") private long pointcharacteristic        ;
    @ApiModelProperty("Characteristic Arabic Name ") private String characteristicarabicname ;
    @ApiModelProperty("Point Parking Type ") private long pointparkingtype           ;
    @ApiModelProperty("Parking Type Arabic Name ") private String parkingtypearabicname    ;
    @ApiModelProperty("Point Status ") private int pointstatus                 ;
    @ApiModelProperty("Office Name ") private String officename               ;
    @ApiModelProperty("Office Phone Number ") private String officephonenumber        ;
    @ApiModelProperty("Liaison Office Name ") private String liaisonofficername       ;
    @ApiModelProperty("Sun Shades ") private boolean sunshades               ;
    @ApiModelProperty("Health Care Facilities ") private boolean healthcarefacilities    ;
    @ApiModelProperty("Public Telephones") private boolean publictelephones        ;
    @ApiModelProperty("Seat ") private boolean seat                    ;
    @ApiModelProperty("Terminal Area ") private double terminalarea             ;
    @ApiModelProperty("Count of Sun Shades ") private double countofsunshades         ;
    @ApiModelProperty("Count of Seats ") private double countofseats             ;
    @ApiModelProperty("Count of Lanes ") private double countoflanes             ;
    @ApiModelProperty("Count of Seats and Sun Shades ") private double countofseatsandsunshades ;
    @ApiModelProperty("Terminal Remarks ") private String terminalremarks          ;

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

    public String getParkingtypearabicname() {
        return parkingtypearabicname;
    }

    public void setParkingtypearabicname(String parkingtypearabicname) {
        this.parkingtypearabicname = parkingtypearabicname;
    }

    public int getPointstatus() {
        return pointstatus;
    }

    public void setPointstatus(int pointstatus) {
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

    public boolean isSunshades() {
        return sunshades;
    }

    public void setSunshades(boolean sunshades) {
        this.sunshades = sunshades;
    }

    public boolean isHealthcarefacilities() {
        return healthcarefacilities;
    }

    public void setHealthcarefacilities(boolean healthcarefacilities) {
        this.healthcarefacilities = healthcarefacilities;
    }

    public boolean isPublictelephones() {
        return publictelephones;
    }

    public void setPublictelephones(boolean publictelephones) {
        this.publictelephones = publictelephones;
    }

    public boolean isSeat() {
        return seat;
    }

    public void setSeat(boolean seat) {
        this.seat = seat;
    }

    public double getTerminalarea() {
        return terminalarea;
    }

    public void setTerminalarea(double terminalarea) {
        this.terminalarea = terminalarea;
    }

    public double getCountofsunshades() {
        return countofsunshades;
    }

    public void setCountofsunshades(double countofsunshades) {
        this.countofsunshades = countofsunshades;
    }

    public double getCountofseats() {
        return countofseats;
    }

    public void setCountofseats(double countofseats) {
        this.countofseats = countofseats;
    }

    public double getCountoflanes() {
        return countoflanes;
    }

    public void setCountoflanes(double countoflanes) {
        this.countoflanes = countoflanes;
    }

    public double getCountofseatsandsunshades() {
        return countofseatsandsunshades;
    }

    public void setCountofseatsandsunshades(double countofseatsandsunshades) {
        this.countofseatsandsunshades = countofseatsandsunshades;
    }

    public String getTerminalremarks() {
        return terminalremarks;
    }

    public void setTerminalremarks(String terminalremarks) {
        this.terminalremarks = terminalremarks;
    }
}
