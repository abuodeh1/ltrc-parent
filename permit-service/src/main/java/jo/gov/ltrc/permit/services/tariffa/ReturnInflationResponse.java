package jo.gov.ltrc.permit.services.tariffa;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@NamedStoredProcedureQuery(
        name = "ReturnInflation",
        procedureName = "\"ReturnInflation\"",
        parameters = {


                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "inflationreferanceidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Boolean.class, name = "inflationdirectionparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "gasolineratioparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "dieselratioparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "generalrationparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "startdateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),

        }
        ,
        resultSetMappings = {
                "ReturnInflationSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnInflationSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnInflationResponse.class)
                }
        )
})
@Entity
public class ReturnInflationResponse implements Serializable {

    @Id
    @ApiModelProperty("Inflation Reference ID ") private Long inflationreferanceid ;
    @ApiModelProperty("Inflation Direction ") private   Boolean inflationdirection ;
    @ApiModelProperty("Gasoline Ration ") private  Double gasolineratio ;
    @ApiModelProperty("Diesel Ration ") private  Double dieselratio ;
    @ApiModelProperty("General Ration ") private  Double generalration ;
    @ApiModelProperty("Start Date ") private Date startdate ;
    @ApiModelProperty("Status ") private Integer status ;

    public Long getInflationreferanceid() {
        return inflationreferanceid;
    }

    public void setInflationreferanceid(Long inflationreferanceid) {
        this.inflationreferanceid = inflationreferanceid;
    }

    public Boolean getInflationdirection() {
        return inflationdirection;
    }

    public void setInflationdirection(Boolean inflationdirection) {
        this.inflationdirection = inflationdirection;
    }

    public Double getGasolineratio() {
        return gasolineratio;
    }

    public void setGasolineratio(Double gasolineratio) {
        this.gasolineratio = gasolineratio;
    }

    public Double getDieselratio() {
        return dieselratio;
    }

    public void setDieselratio(Double dieselratio) {
        this.dieselratio = dieselratio;
    }

    public Double getGeneralration() {
        return generalration;
    }

    public void setGeneralration(Double generalration) {
        this.generalration = generalration;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ReturnInflationResponse{" +
                "inflationreferanceid=" + inflationreferanceid +
                ", inflationdirection=" + inflationdirection +
                ", gasolineratio=" + gasolineratio +
                ", dieselratio=" + dieselratio +
                ", generalration=" + generalration +
                ", startdate=" + startdate +
                ", status=" + status +
                '}';
    }
}
