package jo.gov.ltrc.sharedservices.permits.line;

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
    private long lineid ;
    private String linename ;
    private long provinceid ;
    private String provincearabicname ;
    private long governorateid ;
    private String governoratearabicname ;
    private long startpoint ;
    private String startpointarabicname ;
    private long endpoint ;
    private String endpointarabicname ;
    private int routecount ;
    private long linetype ;
    private String linetypename ;
    private int linestatus ;
    private String remarks ;
    private boolean allowtemporarypermit;

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
