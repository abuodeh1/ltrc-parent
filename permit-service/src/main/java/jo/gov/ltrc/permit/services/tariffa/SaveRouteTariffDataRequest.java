package jo.gov.ltrc.permit.services.tariffa;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class SaveRouteTariffDataRequest {

    @ApiModelProperty("Route Tariffa ID Parameter") private long routetariffidparm ;
    @ApiModelProperty("Route ID Parameter")         private long routeidparm ;
    @ApiModelProperty("Tariffa Equation Parameter") private long tariffequtionparm ;
    @ApiModelProperty("Tariffa Study Parameter")    private long tariffstudyparm ;
    @ApiModelProperty("Fuel Type Parameter")        private long fueltypeparm ;
    @ApiModelProperty("Vehicle Category Parameter") private long vehiclecategoryparm ;
    @ApiModelProperty("Inflation Parameter")        private long inflationparm ;
    @ApiModelProperty("Value 1 Parameter")          private double valueparm1 ;
    @ApiModelProperty("Value 2 Parameter")          private double valueparm2 ;
    @ApiModelProperty("Start Date Parameter")       private Date startdateparm ;
    @ApiModelProperty("End Date Parameter")         private Date enddateparm ;
    @ApiModelProperty("Principal Parameter")        private long prencipal ;
    @ApiModelProperty("Tariffa Unit Parameter")     private int tariffunitparm ;
    @ApiModelProperty("Based On Parameter")         private int basedonparm ;
    @ApiModelProperty("Status Parameter")           private int statusparm ;


    public long getRoutetariffidparm() {
        return routetariffidparm;
    }

    public void setRoutetariffidparm(long routetariffidparm) {
        this.routetariffidparm = routetariffidparm;
    }

    public long getRouteidparm() {
        return routeidparm;
    }

    public void setRouteidparm(long routeidparm) {
        this.routeidparm = routeidparm;
    }

    public long getTariffequtionparm() {
        return tariffequtionparm;
    }

    public void setTariffequtionparm(long tariffequtionparm) {
        this.tariffequtionparm = tariffequtionparm;
    }

    public long getTariffstudyparm() {
        return tariffstudyparm;
    }

    public void setTariffstudyparm(long tariffstudyparm) {
        this.tariffstudyparm = tariffstudyparm;
    }

    public long getFueltypeparm() {
        return fueltypeparm;
    }

    public void setFueltypeparm(long fueltypeparm) {
        this.fueltypeparm = fueltypeparm;
    }

    public long getVehiclecategoryparm() {
        return vehiclecategoryparm;
    }

    public void setVehiclecategoryparm(long vehiclecategoryparm) {
        this.vehiclecategoryparm = vehiclecategoryparm;
    }

    public long getInflationparm() {
        return inflationparm;
    }

    public void setInflationparm(long inflationparm) {
        this.inflationparm = inflationparm;
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

    public long getPrencipal() {
        return prencipal;
    }

    public void setPrencipal(long prencipal) {
        this.prencipal = prencipal;
    }

    public int getTariffunitparm() {
        return tariffunitparm;
    }

    public void setTariffunitparm(int tariffunitparm) {
        this.tariffunitparm = tariffunitparm;
    }

    public int getBasedonparm() {
        return basedonparm;
    }

    public void setBasedonparm(int basedonparm) {
        this.basedonparm = basedonparm;
    }

    public int getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(int statusparm) {
        this.statusparm = statusparm;
    }

    public double getValueparm1() {
        return valueparm1;
    }

    public void setValueparm1(double valueparm1) {
        this.valueparm1 = valueparm1;
    }

    public double getValueparm2() {
        return valueparm2;
    }

    public void setValueparm2(double valueparm2) {
        this.valueparm2 = valueparm2;
    }
}



