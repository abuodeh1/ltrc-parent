package jo.gov.ltrc.permit.services.tariffa;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class SaveInflationReferanceDataRequest {

    @ApiModelProperty("Inflation Reference ID Parameter ") private Long inflationreferanceidparm ;
    @ApiModelProperty("Inflation Direction Parameter ") private   Boolean inflationdirectionparm ;
    @ApiModelProperty("Gasoline Ration Parameter ") private  Double gasolineratioparm ;
    @ApiModelProperty("Diesel Ration Parameter ") private  Double dieselratioparm ;
    @ApiModelProperty("General Ration Parameter ") private  Double generalrationparm ;
    @ApiModelProperty("Start Data Parameter ") private Date startdateparm ;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;

    public Long getInflationreferanceidparm() {
        return inflationreferanceidparm;
    }

    public void setInflationreferanceidparm(Long inflationreferanceidparm) {
        this.inflationreferanceidparm = inflationreferanceidparm;
    }

    public Boolean getInflationdirectionparm() {
        return inflationdirectionparm;
    }

    public void setInflationdirectionparm(Boolean inflationdirectionparm) {
        this.inflationdirectionparm = inflationdirectionparm;
    }

    public Double getGasolineratioparm() {
        return gasolineratioparm;
    }

    public void setGasolineratioparm(Double gasolineratioparm) {
        this.gasolineratioparm = gasolineratioparm;
    }

    public Double getDieselratioparm() {
        return dieselratioparm;
    }

    public void setDieselratioparm(Double dieselratioparm) {
        this.dieselratioparm = dieselratioparm;
    }

    public Double getGeneralrationparm() {
        return generalrationparm;
    }

    public void setGeneralrationparm(Double generalrationparm) {
        this.generalrationparm = generalrationparm;
    }

    public Date getStartdateparm() {
        return startdateparm;
    }

    public void setStartdateparm(Date startdateparm) {
        this.startdateparm = startdateparm;
    }

    public Long getPrincepel() {
        return princepel;
    }

    public void setPrincepel(Long princepel) {
        this.princepel = princepel;
    }

    public Integer getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(Integer statusparm) {
        this.statusparm = statusparm;
    }

    @Override
    public String toString() {
        return "SaveInflationReferanceDataRequest{" +
                "inflationreferanceidparm=" + inflationreferanceidparm +
                ", inflationdirectionparm=" + inflationdirectionparm +
                ", gasolineratioparm=" + gasolineratioparm +
                ", dieselratioparm=" + dieselratioparm +
                ", generalrationparm=" + generalrationparm +
                ", startdateparm=" + startdateparm +
                ", princepel=" + princepel +
                ", statusparm=" + statusparm +
                '}';
    }
}



