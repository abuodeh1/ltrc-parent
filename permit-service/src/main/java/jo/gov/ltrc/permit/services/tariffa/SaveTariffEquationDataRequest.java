package jo.gov.ltrc.permit.services.tariffa;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class SaveTariffEquationDataRequest {

    @ApiModelProperty("Tariff Equation ID Parameter ") private long tariffequationidparm ;
    @ApiModelProperty("Vehicle Category Parameter ") private long vehiclecategoryparm ;
    @ApiModelProperty("Added Value Parameter ") private double adeddvalueparm ;
    @ApiModelProperty("Operation Parameter ") private int operationparm ;
    @ApiModelProperty("Route coefficient Multiplication Parameter ") private double routecoefficientmultiplicationparm ;
    @ApiModelProperty("Start Date Parameter ") private Date startdateparm ;
    @ApiModelProperty("End Date Parameter ") private Date enddateparm ;
    @ApiModelProperty("Equation Text Parameter ") private String equationtextparm ;
    @ApiModelProperty("Line Type Parameter ") private long linetypeparm ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;
    @ApiModelProperty("Principal Parameter ") private long princepal ;

    public long getTariffequationidparm() {
        return tariffequationidparm;
    }

    public void setTariffequationidparm(long tariffequationidparm) {
        this.tariffequationidparm = tariffequationidparm;
    }

    public long getVehiclecategoryparm() {
        return vehiclecategoryparm;
    }

    public void setVehiclecategoryparm(long vehiclecategoryparm) {
        this.vehiclecategoryparm = vehiclecategoryparm;
    }

    public double getAdeddvalueparm() {
        return adeddvalueparm;
    }

    public void setAdeddvalueparm(double adeddvalueparm) {
        this.adeddvalueparm = adeddvalueparm;
    }

    public int getOperationparm() {
        return operationparm;
    }

    public void setOperationparm(int operationparm) {
        this.operationparm = operationparm;
    }

    public double getRoutecoefficientmultiplicationparm() {
        return routecoefficientmultiplicationparm;
    }

    public void setRoutecoefficientmultiplicationparm(double routecoefficientmultiplicationparm) {
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

    public long getLinetypeparm() {
        return linetypeparm;
    }

    public void setLinetypeparm(long linetypeparm) {
        this.linetypeparm = linetypeparm;
    }

    public int getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(int statusparm) {
        this.statusparm = statusparm;
    }

    public long getPrincepal() {
        return princepal;
    }

    public void setPrincepal(long princepal) {
        this.princepal = princepal;
    }
}



