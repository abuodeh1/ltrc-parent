package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class SavePeriodCalssDataRequest {

    @ApiModelProperty("Territory ID Parameter ") private long periodidparm;
    @ApiModelProperty("Territory Arabic Name Parameter ") private String periodnameparm;
    @ApiModelProperty("Principal Parameter ") private long princepel ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;

    public long getPeriodidparm() {
        return periodidparm;
    }

    public void setPeriodidparm(long periodidparm) {
        this.periodidparm = periodidparm;
    }

    public String getPeriodnameparm() {
        return periodnameparm;
    }

    public void setPeriodnameparm(String periodnameparm) {
        this.periodnameparm = periodnameparm;
    }

    public long getPrincepel() {
        return princepel;
    }

    public void setPrincepel(long princepel) {
        this.princepel = princepel;
    }

    public int getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(int statusparm) {
        this.statusparm = statusparm;
    }
}



