package jo.gov.ltrc.permit.services.tariffa;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class SaveTariffEquationDataRequest {

    @ApiModelProperty("Tariff Equation ID Parameter ") private Long tariffequationidparm ;
    @ApiModelProperty("Vehicle Category Parameter ") private Long vehiclecategoryparm ;
    @ApiModelProperty("Added Value Parameter ") private  Double adeddvalueparm ;
    @ApiModelProperty("Operation Parameter ") private Integer operationparm ;
    @ApiModelProperty("Route coefficient Multiplication Parameter ") private  Double routecoefficientmultiplicationparm ;
    @ApiModelProperty("Start Date Parameter ") private Date startdateparm ;
    @ApiModelProperty("End Date Parameter ") private Date enddateparm ;
    @ApiModelProperty("Equation Text Parameter ") private String equationtextparm ;
    @ApiModelProperty("Line Type Parameter ") private Long linetypeparm ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;
    @ApiModelProperty("Principal Parameter ") private Long princepal ;

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

    public Integer getOperationparm() {
        return operationparm;
    }

    public void setOperationparm(Integer operationparm) {
        this.operationparm = operationparm;
    }

    public Double getRoutecoefficientmultiplicationparm() {
        return routecoefficientmultiplicationparm;
    }

    public void setRoutecoefficientmultiplicationparm(Double routecoefficientmultiplicationparm) {
        this.routecoefficientmultiplicationparm = routecoefficientmultiplicationparm;
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

    public Long getLinetypeparm() {
        return linetypeparm;
    }

    public void setLinetypeparm(Long linetypeparm) {
        this.linetypeparm = linetypeparm;
    }

    public Integer getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(Integer statusparm) {
        this.statusparm = statusparm;
    }

    public Long getPrincepal() {
        return princepal;
    }

    public void setPrincepal(Long princepal) {
        this.princepal = princepal;
    }

    @Override
    public String toString() {
        return "SaveTariffEquationDataRequest{" +
                "tariffequationidparm=" + tariffequationidparm +
                ", vehiclecategoryparm=" + vehiclecategoryparm +
                ", adeddvalueparm=" + adeddvalueparm +
                ", operationparm=" + operationparm +
                ", routecoefficientmultiplicationparm=" + routecoefficientmultiplicationparm +
                ", startdateparm=" + startdateparm +
                ", enddateparm=" + enddateparm +
                ", equationtextparm=" + equationtextparm +
                ", linetypeparm=" + linetypeparm +
                ", statusparm=" + statusparm +
                ", princepal=" + princepal +
                '}';
    }
}



