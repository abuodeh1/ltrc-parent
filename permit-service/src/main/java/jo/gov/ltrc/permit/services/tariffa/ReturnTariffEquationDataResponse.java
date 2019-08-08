package jo.gov.ltrc.permit.services.tariffa;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@NamedStoredProcedureQuery(
        name = "ReturnTariffEquation",
        procedureName = "\"ReturnTariffEquation\"",
        parameters = {


                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),

        }
        ,
        resultSetMappings = {
                "ReturnTariffEquationSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnTariffEquationSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnTariffEquationDataResponse.class)
                }
        )
})
@Entity
public class ReturnTariffEquationDataResponse implements Serializable {

    @Id
    @ApiModelProperty("Tariff Equation ID ") private long tariffequationid ;
    @ApiModelProperty("Vehicle Category ") private long vehiclecategory ;
    @ApiModelProperty("Vehicle Category Name ") private String vehiclecategoryname ;
    @ApiModelProperty("Added Value ") private double adeddvalue ;
    @ApiModelProperty("Start Date ") private Date startdate ;
    @ApiModelProperty("End Date ") private Date enddate ;
    @ApiModelProperty("Equation Text ") private String equationtext ;
    @ApiModelProperty("Operation ") private int operation ;
    @ApiModelProperty("Line Type ") private long linetype ;
    @ApiModelProperty("Line Type Name ") private String linetypename ;
    @ApiModelProperty("Route Coefficient Multiplication ") private double routecoefficientmultiplication ;
    @ApiModelProperty("Status ") private int status ;

    public long getTariffequationid() {
        return tariffequationid;
    }

    public void setTariffequationid(long tariffequationid) {
        this.tariffequationid = tariffequationid;
    }

    public long getVehiclecategory() {
        return vehiclecategory;
    }

    public void setVehiclecategory(long vehiclecategory) {
        this.vehiclecategory = vehiclecategory;
    }

    public double getAdeddvalue() {
        return adeddvalue;
    }

    public void setAdeddvalue(double adeddvalue) {
        this.adeddvalue = adeddvalue;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getEquationtext() {
        return equationtext;
    }

    public void setEquationtext(String equationtext) {
        this.equationtext = equationtext;
    }

    public int getOperation() {
        return operation;
    }

    public void setOperation(int operation) {
        this.operation = operation;
    }

    public long getLinetype() {
        return linetype;
    }

    public void setLinetype(long linetype) {
        this.linetype = linetype;
    }

    public double getRoutecoefficientmultiplication() {
        return routecoefficientmultiplication;
    }

    public void setRoutecoefficientmultiplication(double routecoefficientmultiplication) {
        this.routecoefficientmultiplication = routecoefficientmultiplication;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getVehiclecategoryname() {
        return vehiclecategoryname;
    }

    public void setVehiclecategoryname(String vehiclecategoryname) {
        this.vehiclecategoryname = vehiclecategoryname;
    }

    public String getLinetypename() {
        return linetypename;
    }

    public void setLinetypename(String linetypename) {
        this.linetypename = linetypename;
    }
}
