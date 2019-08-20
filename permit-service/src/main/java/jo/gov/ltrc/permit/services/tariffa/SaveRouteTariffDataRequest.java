package jo.gov.ltrc.permit.services.tariffa;


import io.swagger.annotations.ApiModelProperty;
import java.sql.Date;

public class SaveRouteTariffDataRequest {

    @ApiModelProperty("Route Tariffa ID Parameter") private Long routetariffidparm ;
    @ApiModelProperty("Route ID Parameter")         private Long routeidparm ;
    @ApiModelProperty("Tariffa Equation Parameter") private Long tariffequtionparm ;
    @ApiModelProperty("Tariffa Study Parameter")    private Long tariffstudyparm ;
    @ApiModelProperty("Fuel Type Parameter")        private Long fueltypeparm ;
    @ApiModelProperty("Vehicle Category Parameter") private Long vehiclecategoryparm ;
    @ApiModelProperty("Inflation Parameter")        private Long inflationparm ;
    @ApiModelProperty("Value 1 Parameter")          private  Double valueparm1 ;
    @ApiModelProperty("Value 2 Parameter")          private  Double valueparm2 ;
    @ApiModelProperty("Start Date Parameter")       private Date startdateparm ;
    @ApiModelProperty("End Date Parameter")         private Date enddateparm ;
    @ApiModelProperty("Principal Parameter")        private Long prencipal ;
    @ApiModelProperty("Tariffa Unit Parameter")     private Integer tariffunitparm ;
    @ApiModelProperty("Based On Parameter")         private Integer basedonparm ;
    @ApiModelProperty("Status Parameter")           private Integer statusparm ;


    public Long getRoutetariffidparm() {
        return routetariffidparm;
    }

    public void setRoutetariffidparm(Long routetariffidparm) {
        this.routetariffidparm = routetariffidparm;
    }

    public Long getRouteidparm() {
        return routeidparm;
    }

    public void setRouteidparm(Long routeidparm) {
        this.routeidparm = routeidparm;
    }

    public Long getTariffequtionparm() {
        return tariffequtionparm;
    }

    public void setTariffequtionparm(Long tariffequtionparm) {
        this.tariffequtionparm = tariffequtionparm;
    }

    public Long getTariffstudyparm() {
        return tariffstudyparm;
    }

    public void setTariffstudyparm(Long tariffstudyparm) {
        this.tariffstudyparm = tariffstudyparm;
    }

    public Long getFueltypeparm() {
        return fueltypeparm;
    }

    public void setFueltypeparm(Long fueltypeparm) {
        this.fueltypeparm = fueltypeparm;
    }

    public Long getVehiclecategoryparm() {
        return vehiclecategoryparm;
    }

    public void setVehiclecategoryparm(Long vehiclecategoryparm) {
        this.vehiclecategoryparm = vehiclecategoryparm;
    }

    public Long getInflationparm() {
        return inflationparm;
    }

    public void setInflationparm(Long inflationparm) {
        this.inflationparm = inflationparm;
    }

    public Double getValueparm1() {
        return valueparm1;
    }

    public void setValueparm1(Double valueparm1) {
        this.valueparm1 = valueparm1;
    }

    public Double getValueparm2() {
        return valueparm2;
    }

    public void setValueparm2(Double valueparm2) {
        this.valueparm2 = valueparm2;
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

    public Long getPrencipal() {
        return prencipal;
    }

    public void setPrencipal(Long prencipal) {
        this.prencipal = prencipal;
    }

    public Integer getTariffunitparm() {
        return tariffunitparm;
    }

    public void setTariffunitparm(Integer tariffunitparm) {
        this.tariffunitparm = tariffunitparm;
    }

    public Integer getBasedonparm() {
        return basedonparm;
    }

    public void setBasedonparm(Integer basedonparm) {
        this.basedonparm = basedonparm;
    }

    public Integer getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(Integer statusparm) {
        this.statusparm = statusparm;
    }

    @Override
    public String toString() {
        return "SaveRouteTariffDataRequest{" +
                "routetariffidparm=" + routetariffidparm +
                ", routeidparm=" + routeidparm +
                ", tariffequtionparm=" + tariffequtionparm +
                ", tariffstudyparm=" + tariffstudyparm +
                ", fueltypeparm=" + fueltypeparm +
                ", vehiclecategoryparm=" + vehiclecategoryparm +
                ", inflationparm=" + inflationparm +
                ", valueparm1=" + valueparm1 +
                ", valueparm2=" + valueparm2 +
                ", startdateparm=" + startdateparm +
                ", enddateparm=" + enddateparm +
                ", prencipal=" + prencipal +
                ", tariffunitparm=" + tariffunitparm +
                ", basedonparm=" + basedonparm +
                ", statusparm=" + statusparm +
                '}';
    }
}



