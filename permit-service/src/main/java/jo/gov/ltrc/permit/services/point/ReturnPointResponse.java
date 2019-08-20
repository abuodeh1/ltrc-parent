package jo.gov.ltrc.permit.services.point;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

@NamedStoredProcedureQuery(
        name = "ReturnPoint",
        procedureName = "\"ReturnPoint\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "minpointidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "maxpointidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "pointarabicnameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "governorateidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "pointstreetparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "municipalityidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "territoryidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "provinceidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "pointneighborhoodparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "pointcharacteristicparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "pointparkingtypeparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "pointstatusparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Boolean.class, name = "sunshadesparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Boolean.class, name = "healthcarefacilitiesparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Boolean.class, name = "publictelephonesparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Boolean.class, name = "seatparm"),
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
    @ApiModelProperty("Point ID ") private Long pointid  ;
    @ApiModelProperty("Point Arabic Name ") private String pointarabicname ;
    @ApiModelProperty("Province ID ") private Long provinceid ;
    @ApiModelProperty("Province Arabic Name ") private String provincearabicname ;
    @ApiModelProperty("Governorate ID ") private Long governorateid  ;
    @ApiModelProperty("Governorate Arabic Name ") private String governoratearabicname ;
    @ApiModelProperty("Municipality ID ") private Long municipalityid ;
    @ApiModelProperty("Municipality Arabic Name ") private String municipalityarabicname ;
    @ApiModelProperty("Territory ID ") private Long territoryid ;
    @ApiModelProperty("Territory Arabic Name ") private String territoryarabicname ;
    @ApiModelProperty("Point Neighborhood") private String pointneighborhood ;
    @ApiModelProperty("Point Street ") private String pointstreet ;
    @ApiModelProperty("Point Characteristics ") private Long pointcharacteristic ;
    @ApiModelProperty("Characteristics Arabic Name ") private String characteristicarabicname ;
    @ApiModelProperty("Point Parking Type ") private Long pointparkingtype ;
    @ApiModelProperty("Point Parking Type Name ") private String pointparkingtypename;
    @ApiModelProperty("Point Status ") private Integer pointstatus ;

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

    public String getPointparkingtypename() {
        return pointparkingtypename;
    }

    public void setPointparkingtypename(String pointparkingtypename) {
        this.pointparkingtypename = pointparkingtypename;
    }

    public Integer getPointstatus() {
        return pointstatus;
    }

    public void setPointstatus(Integer pointstatus) {
        this.pointstatus = pointstatus;
    }

    @Override
    public String toString() {
        return "ReturnPointResponse{" +
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
                ", pointparkingtypename=" + pointparkingtypename +
                ", pointstatus=" + pointstatus +
                '}';
    }
}
