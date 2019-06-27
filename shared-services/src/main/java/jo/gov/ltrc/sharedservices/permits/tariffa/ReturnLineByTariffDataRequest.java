package jo.gov.ltrc.sharedservices.permits.tariffa;


import io.swagger.annotations.ApiModelProperty;

public class ReturnLineByTariffDataRequest {

    @ApiModelProperty("Route ID Parameter") private long routeidparm ;
    @ApiModelProperty("Fuel Type Parameter") private long fueltypeparm ;
    @ApiModelProperty("Vehicle Category") private long vehiclecategoryparm  ;
    @ApiModelProperty("Tariffa Unit Parameter") private int tariffunitparm ;
    @ApiModelProperty("Tariffa Methodology Parameter") private int tariffmethedologyparm ;
    @ApiModelProperty("Minimum Tariffa Value Parameter") private double minmumtariffvalueparm ;
    @ApiModelProperty("Maximum Tariffa Value Parameter") private double maximumtariffvalueparm ;
    @ApiModelProperty("Minimum Tariffa Maximum Value Parameter") private double mintariffmaxvalueparm  ;
    @ApiModelProperty("Maximum Tariffa Maximum Value Parameter") private double maxtariffmaxvalueparm ;

    public long getRouteidparm() {
        return routeidparm;
    }

    public void setRouteidparm(long routeidparm) {
        this.routeidparm = routeidparm;
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

    public int getTariffunitparm() {
        return tariffunitparm;
    }

    public void setTariffunitparm(int tariffunitparm) {
        this.tariffunitparm = tariffunitparm;
    }

    public int getTariffmethedologyparm() {
        return tariffmethedologyparm;
    }

    public void setTariffmethedologyparm(int tariffmethedologyparm) {
        this.tariffmethedologyparm = tariffmethedologyparm;
    }

    public double getMinmumtariffvalueparm() {
        return minmumtariffvalueparm;
    }

    public void setMinmumtariffvalueparm(double minmumtariffvalueparm) {
        this.minmumtariffvalueparm = minmumtariffvalueparm;
    }

    public double getMaximumtariffvalueparm() {
        return maximumtariffvalueparm;
    }

    public void setMaximumtariffvalueparm(double maximumtariffvalueparm) {
        this.maximumtariffvalueparm = maximumtariffvalueparm;
    }

    public double getMintariffmaxvalueparm() {
        return mintariffmaxvalueparm;
    }

    public void setMintariffmaxvalueparm(double mintariffmaxvalueparm) {
        this.mintariffmaxvalueparm = mintariffmaxvalueparm;
    }

    public double getMaxtariffmaxvalueparm() {
        return maxtariffmaxvalueparm;
    }

    public void setMaxtariffmaxvalueparm(double maxtariffmaxvalueparm) {
        this.maxtariffmaxvalueparm = maxtariffmaxvalueparm;
    }
}



