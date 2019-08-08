package jo.gov.ltrc.permit.services.tariffa;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@NamedStoredProcedureQuery(
        name = "ReturnInflation",
        procedureName = "\"ReturnInflation\"",
        parameters = {


                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Boolean.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),

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
    @ApiModelProperty("Inflation Reference ID ") private long inflationreferanceid ;
    @ApiModelProperty("Inflation Direction ") private boolean inflationdirection ;
    @ApiModelProperty("Gasoline Ration ") private double gasolineratio ;
    @ApiModelProperty("Diesel Ration ") private double dieselratio ;
    @ApiModelProperty("General Ration ") private double generalration ;
    @ApiModelProperty("Start Date ") private Date startdate ;
    @ApiModelProperty("Status ") private int status ;

    public long getInflationreferanceid() {
        return inflationreferanceid;
    }

    public void setInflationreferanceid(long inflationreferanceid) {
        this.inflationreferanceid = inflationreferanceid;
    }

    public boolean isInflationdirection() {
        return inflationdirection;
    }

    public void setInflationdirection(boolean inflationdirection) {
        this.inflationdirection = inflationdirection;
    }

    public double getGasolineratio() {
        return gasolineratio;
    }

    public void setGasolineratio(double gasolineratio) {
        this.gasolineratio = gasolineratio;
    }

    public double getDieselratio() {
        return dieselratio;
    }

    public void setDieselratio(double dieselratio) {
        this.dieselratio = dieselratio;
    }

    public double getGeneralration() {
        return generalration;
    }

    public void setGeneralration(double generalration) {
        this.generalration = generalration;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
