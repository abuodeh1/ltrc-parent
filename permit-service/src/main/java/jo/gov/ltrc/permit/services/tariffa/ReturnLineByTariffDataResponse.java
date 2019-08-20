package jo.gov.ltrc.permit.services.tariffa;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

@NamedStoredProcedureQuery(
        name = "ReturnLineByTariffData",
        procedureName = "\"ReturnLineByTariffData\"",
        parameters = {


                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "routeidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "fueltypeparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "vehiclecategoryparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "tariffunitparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "tariffmethedologyparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "minmumtariffvalueparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "maximumtariffvalueparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "mintariffmaxvalueparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "maxtariffmaxvalueparm"),

        }
        ,
        resultSetMappings = {
                "ReturnLineByTariffDataSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnLineByTariffDataSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnLineByTariffDataResponse.class)
                }
        )
})
@Entity
public class ReturnLineByTariffDataResponse implements Serializable {

    @Id
    @ApiModelProperty("Line ID ") private Long lineid ;
    @ApiModelProperty("Line Name ") private String linename ;
    @ApiModelProperty("Province ID ") private Long provinceid ;
    @ApiModelProperty("Province Arabic Name ") private String provincearabicname ;
    @ApiModelProperty("Governorate ID ") private Long governorateid ;
    @ApiModelProperty("Governorate Arabic Name ") private String governoratearabicname ;
    @ApiModelProperty("Start Point ") private Long startpoint ;
    @ApiModelProperty("Start Point Arabic Name ") private String startpointarabicname ;
    @ApiModelProperty("End Point ") private Long endpoint ;
    @ApiModelProperty("End Point Arabic Name ") private String endpointarabicname ;
    @ApiModelProperty("Route Count ") private Integer routecount ;
    @ApiModelProperty("Line Type ") private Long linetype ;
    @ApiModelProperty("Line Type Name ") private String linetypename ;
    @ApiModelProperty("Line Status ") private Integer linestatus ;
    @ApiModelProperty("Remarks ") private String remarks ;
    @ApiModelProperty("Allow Temporary Permit ") private   Boolean allowtemporarypermit ;

    public Long getLineid() {
        return lineid;
    }

    public void setLineid(Long lineid) {
        this.lineid = lineid;
    }

    public String getLinename() {
        return linename;
    }

    public void setLinename(String linename) {
        this.linename = linename;
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

    public Integer getRoutecount() {
        return routecount;
    }

    public void setRoutecount(Integer routecount) {
        this.routecount = routecount;
    }

    public Long getLinetype() {
        return linetype;
    }

    public void setLinetype(Long linetype) {
        this.linetype = linetype;
    }

    public String getLinetypename() {
        return linetypename;
    }

    public void setLinetypename(String linetypename) {
        this.linetypename = linetypename;
    }

    public Integer getLinestatus() {
        return linestatus;
    }

    public void setLinestatus(Integer linestatus) {
        this.linestatus = linestatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Boolean getAllowtemporarypermit() {
        return allowtemporarypermit;
    }

    public void setAllowtemporarypermit(Boolean allowtemporarypermit) {
        this.allowtemporarypermit = allowtemporarypermit;
    }

    @Override
    public String toString() {
        return "ReturnLineByTariffDataResponse{" +
                "lineid=" + lineid +
                ", linename=" + linename +
                ", provinceid=" + provinceid +
                ", provincearabicname=" + provincearabicname +
                ", governorateid=" + governorateid +
                ", governoratearabicname=" + governoratearabicname +
                ", startpoint=" + startpoint +
                ", startpointarabicname=" + startpointarabicname +
                ", endpoint=" + endpoint +
                ", endpointarabicname=" + endpointarabicname +
                ", routecount=" + routecount +
                ", linetype=" + linetype +
                ", linetypename=" + linetypename +
                ", linestatus=" + linestatus +
                ", remarks=" + remarks +
                ", allowtemporarypermit=" + allowtemporarypermit +
                '}';
    }
}
