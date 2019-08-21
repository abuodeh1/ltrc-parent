package jo.gov.ltrc.permit.services.tariffa;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@NamedStoredProcedureQuery(
        name = "ReturnTariffEquation",
        procedureName = "\"ReturnTariffEquation\"",
        parameters = {


                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "tariffequationidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "vehiclecategoryparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "adeddvalueparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "startdateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "enddateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "equationtextparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "operationparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "linetypeparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "routecoefficientmultiplicationparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),

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
    @ApiModelProperty("Tariff Equation ID ") private Long tariffequationid ;
    @ApiModelProperty("Vehicle Category ") private Long vehiclecategory ;
    @ApiModelProperty("Vehicle Category Name ") private String vehiclecategoryname ;
    @ApiModelProperty("Added Value ") private  Double adeddvalue ;
    @ApiModelProperty("Start Date ") private Date startdate ;
    @ApiModelProperty("End Date ") private Date enddate ;
    @ApiModelProperty("Equation Text ") private String equationtext ;
    @ApiModelProperty("Operation ") private Integer operation ;
    @ApiModelProperty("Line Type ") private Long linetype ;
    @ApiModelProperty("Line Type Name ") private String linetypename ;
    @ApiModelProperty("Route Coefficient Multiplication ") private  Double routecoefficientmultiplication ;
    @ApiModelProperty("Status ") private Integer status ;

    public Long getTariffequationid() {
        return tariffequationid;
    }

    public void setTariffequationid(Long tariffequationid) {
        this.tariffequationid = tariffequationid;
    }

    public Long getVehiclecategory() {
        return vehiclecategory;
    }

    public void setVehiclecategory(Long vehiclecategory) {
        this.vehiclecategory = vehiclecategory;
    }

    public String getVehiclecategoryname() {
        return vehiclecategoryname;
    }

    public void setVehiclecategoryname(String vehiclecategoryname) {
        this.vehiclecategoryname = vehiclecategoryname;
    }

    public Double getAdeddvalue() {
        return adeddvalue;
    }

    public void setAdeddvalue(Double adeddvalue) {
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

    public Integer getOperation() {
        return operation;
    }

    public void setOperation(Integer operation) {
        this.operation = operation;
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

    public Double getRoutecoefficientmultiplication() {
        return routecoefficientmultiplication;
    }

    public void setRoutecoefficientmultiplication(Double routecoefficientmultiplication) {
        this.routecoefficientmultiplication = routecoefficientmultiplication;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ReturnTariffEquationDataResponse{" +
                "tariffequationid=" + tariffequationid +
                ", vehiclecategory=" + vehiclecategory +
                ", vehiclecategoryname=" + vehiclecategoryname +
                ", adeddvalue=" + adeddvalue +
                ", startdate=" + startdate +
                ", enddate=" + enddate +
                ", equationtext=" + equationtext +
                ", operation=" + operation +
                ", linetype=" + linetype +
                ", linetypename=" + linetypename +
                ", routecoefficientmultiplication=" + routecoefficientmultiplication +
                ", status=" + status +
                '}';
    }
}
