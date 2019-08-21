package jo.gov.ltrc.permit.services.tariffa;


import io.swagger.annotations.ApiModelProperty;

public class ReturnLineByTariffDataRequest {

    @ApiModelProperty("Route ID Parameter") private Long routeidparm ;
    @ApiModelProperty("Fuel Type Parameter") private Long fueltypeparm ;
    @ApiModelProperty("Vehicle Category") private Long vehiclecategoryparm  ;
    @ApiModelProperty("Tariffa Unit Parameter") private Integer tariffunitparm ;
    @ApiModelProperty("Tariffa Methodology Parameter") private Integer tariffmethedologyparm ;
    @ApiModelProperty("Minimum Tariffa Value Parameter") private  Double minmumtariffvalueparm ;
    @ApiModelProperty("Maximum Tariffa Value Parameter") private  Double maximumtariffvalueparm ;
    @ApiModelProperty("Minimum Tariffa Maximum Value Parameter") private  Double mintariffmaxvalueparm  ;
    @ApiModelProperty("Maximum Tariffa Maximum Value Parameter") private  Double maxtariffmaxvalueparm ;

    public Long getRouteidparm() {
        return routeidparm;
    }

    public void setRouteidparm(Long routeidparm) {
        this.routeidparm = routeidparm;
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

    public Integer getTariffunitparm() {
        return tariffunitparm;
    }

    public void setTariffunitparm(Integer tariffunitparm) {
        this.tariffunitparm = tariffunitparm;
    }

    public Integer getTariffmethedologyparm() {
        return tariffmethedologyparm;
    }

    public void setTariffmethedologyparm(Integer tariffmethedologyparm) {
        this.tariffmethedologyparm = tariffmethedologyparm;
    }

    public Double getMinmumtariffvalueparm() {
        return minmumtariffvalueparm;
    }

    public void setMinmumtariffvalueparm(Double minmumtariffvalueparm) {
        this.minmumtariffvalueparm = minmumtariffvalueparm;
    }

    public Double getMaximumtariffvalueparm() {
        return maximumtariffvalueparm;
    }

    public void setMaximumtariffvalueparm(Double maximumtariffvalueparm) {
        this.maximumtariffvalueparm = maximumtariffvalueparm;
    }

    public Double getMintariffmaxvalueparm() {
        return mintariffmaxvalueparm;
    }

    public void setMintariffmaxvalueparm(Double mintariffmaxvalueparm) {
        this.mintariffmaxvalueparm = mintariffmaxvalueparm;
    }

    public Double getMaxtariffmaxvalueparm() {
        return maxtariffmaxvalueparm;
    }

    public void setMaxtariffmaxvalueparm(Double maxtariffmaxvalueparm) {
        this.maxtariffmaxvalueparm = maxtariffmaxvalueparm;
    }

    @Override
    public String toString() {
        return "ReturnLineByTariffDataRequest{" +
                "routeidparm=" + routeidparm +
                ", fueltypeparm=" + fueltypeparm +
                ", vehiclecategoryparm=" + vehiclecategoryparm +
                ", tariffunitparm=" + tariffunitparm +
                ", tariffmethedologyparm=" + tariffmethedologyparm +
                ", minmumtariffvalueparm=" + minmumtariffvalueparm +
                ", maximumtariffvalueparm=" + maximumtariffvalueparm +
                ", mintariffmaxvalueparm=" + mintariffmaxvalueparm +
                ", maxtariffmaxvalueparm=" + maxtariffmaxvalueparm +
                '}';
    }
}



