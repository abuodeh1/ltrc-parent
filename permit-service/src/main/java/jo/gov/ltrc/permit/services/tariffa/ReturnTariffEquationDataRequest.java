package jo.gov.ltrc.permit.services.tariffa;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class ReturnTariffEquationDataRequest {

    @ApiModelProperty("Tariff Equation ID Parameter ") private Long tariffequationidparm ;
    @ApiModelProperty("Vehicle Category Parameter ") private Long vehiclecategoryparm ;
    @ApiModelProperty("Added Value Parameter ") private  Double adeddvalueparm ;
    @ApiModelProperty("Start Date Parameter ") private Date startdateparm ;
    @ApiModelProperty("End Date Parameter ") private Date enddateparm ;
    @ApiModelProperty("Equation Text Parameter ") private String equationtextparm ;
    @ApiModelProperty("Operation Parameter ") private Integer operationparm ;
    @ApiModelProperty("Line Type Parameter ") private Long linetypeparm ;
    @ApiModelProperty("Route Coefficient Multiplication Parameter ") private  Double routecoefficientmultiplicationparm ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;

    public Long getTariffequationidparm() {
        return tariffequationidparm;
    }

    public void setTariffequationidparm(Long tariffequationidparm) {
        this.tariffequationidparm = tariffequationidparm;
    }

    public Long getVehiclecategoryparm() {
        return vehiclecategoryparm;
    }

    public void setVehiclecategoryparm(Long vehiclecategoryparm) {
        this.vehiclecategoryparm = vehiclecategoryparm;
    }

    public Double getAdeddvalueparm() {
        return adeddvalueparm;
    }

    public void setAdeddvalueparm(Double adeddvalueparm) {
        this.adeddvalueparm = adeddvalueparm;
    }

    public Date getStartdateparm() {
        return startdateparm;
    }

    public void setStartdateparm(Date startdateparm) {
        this.startdateparm = startdateparm;
    }

    public Date getEnddateparm() {
        return enddateparm;
    }

    public void setEnddateparm(Date enddateparm) {
        this.enddateparm = enddateparm;
    }

    public String getEquationtextparm() {
        return equationtextparm;
    }

    public void setEquationtextparm(String equationtextparm) {
        this.equationtextparm = equationtextparm;
    }

    public Integer getOperationparm() {
        return operationparm;
    }

    public void setOperationparm(Integer operationparm) {
        this.operationparm = operationparm;
    }

    public Long getLinetypeparm() {
        return linetypeparm;
    }

    public void setLinetypeparm(Long linetypeparm) {
        this.linetypeparm = linetypeparm;
    }

    public Double getRoutecoefficientmultiplicationparm() {
        return routecoefficientmultiplicationparm;
    }

    public void setRoutecoefficientmultiplicationparm(Double routecoefficientmultiplicationparm) {
        this.routecoefficientmultiplicationparm = routecoefficientmultiplicationparm;
    }

    public Integer getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(Integer statusparm) {
        this.statusparm = statusparm;
    }

    @Override
    public String toString() {
        return "ReturnTariffEquationDataRequest{" +
                "tariffequationidparm=" + tariffequationidparm +
                ", vehiclecategoryparm=" + vehiclecategoryparm +
                ", adeddvalueparm=" + adeddvalueparm +
                ", startdateparm=" + startdateparm +
                ", enddateparm=" + enddateparm +
                ", equationtextparm=" + equationtextparm +
                ", operationparm=" + operationparm +
                ", linetypeparm=" + linetypeparm +
                ", routecoefficientmultiplicationparm=" + routecoefficientmultiplicationparm +
                ", statusparm=" + statusparm +
                '}';
    }
}



