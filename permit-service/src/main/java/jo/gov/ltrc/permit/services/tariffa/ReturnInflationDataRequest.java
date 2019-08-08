package jo.gov.ltrc.permit.services.tariffa;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class ReturnInflationDataRequest {

    @ApiModelProperty("Inflation Reference ID Parameter") private long inflationreferanceidparm ;
    @ApiModelProperty("Inflation Direction Parameter") private boolean inflationdirectionparm ;
    @ApiModelProperty("Gasoline Ration Parameter") private double gasolineratioparm ;
    @ApiModelProperty("Diesel Ration Parameter") private double dieselratioparm ;
    @ApiModelProperty("General Ration Parameter") private double generalrationparm ;
    @ApiModelProperty("Start Date Parameter") private Date startdateparm ;
    @ApiModelProperty("Status Parameter") private  int statusparm ;


    public long getInflationreferanceidparm() {
        return inflationreferanceidparm;
    }

    public void setInflationreferanceidparm(long inflationreferanceidparm) {
        this.inflationreferanceidparm = inflationreferanceidparm;
    }

    public boolean isInflationdirectionparm() {
        return inflationdirectionparm;
    }

    public void setInflationdirectionparm(boolean inflationdirectionparm) {
        this.inflationdirectionparm = inflationdirectionparm;
    }

    public double getGasolineratioparm() {
        return gasolineratioparm;
    }

    public void setGasolineratioparm(double gasolineratioparm) {
        this.gasolineratioparm = gasolineratioparm;
    }

    public double getDieselratioparm() {
        return dieselratioparm;
    }

    public void setDieselratioparm(double dieselratioparm) {
        this.dieselratioparm = dieselratioparm;
    }

    public double getGeneralrationparm() {
        return generalrationparm;
    }

    public void setGeneralrationparm(double generalrationparm) {
        this.generalrationparm = generalrationparm;
    }

    public Date getStartdateparm() {
        return startdateparm;
    }

    public void setStartdateparm(Date startdateparm) {
        this.startdateparm = startdateparm;
    }

    public int getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(int statusparm) {
        this.statusparm = statusparm;
    }
}



