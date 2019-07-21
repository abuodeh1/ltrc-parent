package com.etech.ltrc.permits.line;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

@NamedStoredProcedureQuery(
        name = "ReturnLineByLineData",
        procedureName = "\"ReturnLineByLineData\"",
        parameters = {


                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class)

        }
        ,
        resultSetMappings = {
                "ReturnLineByLineDataSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnLineByLineDataSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnLineByLineDataResponse.class)
                }
        )
})
@Entity
public class ReturnLineByLineDataResponse implements Serializable {

    @Id
    @ApiModelProperty("Line ID ") private long lineid ;
    @ApiModelProperty("Line Name ") private String linename ;
    @ApiModelProperty("Province ID ") private long provinceid ;
    @ApiModelProperty("Province Arabic Name ") private String provincearabicname ;
    @ApiModelProperty("Governorate ID ") private long governorateid ;
    @ApiModelProperty("Governorate Arabic Name ") private String governoratearabicname ;
    @ApiModelProperty("Start Point ") private long startpoint ;
    @ApiModelProperty("Start Point Arabic Name ") private String startpointarabicname ;
    @ApiModelProperty("End Point ") private long endpoint ;
    @ApiModelProperty("End Point Arabic Name ") private String endpointarabicname ;
    @ApiModelProperty("Route Count ") private int routecount ;
    @ApiModelProperty("Line Type ") private long linetype ;
    @ApiModelProperty("Line Type Name ") private String linetypename ;
    @ApiModelProperty("Line Status ") private int linestatus ;
    @ApiModelProperty("Remarks ") private String remarks ;
    @ApiModelProperty("Allow Temporary Permit ") private boolean allowtemporarypermit;

    public long getLineid() {
        return lineid;
    }

    public void setLineid(long lineid) {
        this.lineid = lineid;
    }

    public String getLinename() {
        return linename;
    }

    public void setLinename(String linename) {
        this.linename = linename;
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

    public long getStartpoint() {
        return startpoint;
    }

    public void setStartpoint(long startpoint) {
        this.startpoint = startpoint;
    }

    public String getStartpointarabicname() {
        return startpointarabicname;
    }

    public void setStartpointarabicname(String startpointarabicname) {
        this.startpointarabicname = startpointarabicname;
    }

    public long getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(long endpoint) {
        this.endpoint = endpoint;
    }

    public String getEndpointarabicname() {
        return endpointarabicname;
    }

    public void setEndpointarabicname(String endpointarabicname) {
        this.endpointarabicname = endpointarabicname;
    }

    public int getRoutecount() {
        return routecount;
    }

    public void setRoutecount(int routecount) {
        this.routecount = routecount;
    }

    public long getLinetype() {
        return linetype;
    }

    public void setLinetype(long linetype) {
        this.linetype = linetype;
    }

    public String getLinetypename() {
        return linetypename;
    }

    public void setLinetypename(String linetypename) {
        this.linetypename = linetypename;
    }

    public int getLinestatus() {
        return linestatus;
    }

    public void setLinestatus(int linestatus) {
        this.linestatus = linestatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public boolean isAllowtemporarypermit() {
        return allowtemporarypermit;
    }

    public void setAllowtemporarypermit(boolean allowtemporarypermit) {
        this.allowtemporarypermit = allowtemporarypermit;
    }
}
