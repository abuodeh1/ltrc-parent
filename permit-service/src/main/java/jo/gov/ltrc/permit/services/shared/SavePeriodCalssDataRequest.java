package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class SavePeriodCalssDataRequest {

    @ApiModelProperty("Territory ID Parameter ") private Long periodidparm;
    @ApiModelProperty("Territory Arabic Name Parameter ") private String periodnameparm;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;

    public Long getPeriodidparm() {
        return periodidparm;
    }

    public void setPeriodidparm(Long periodidparm) {
        this.periodidparm = periodidparm;
    }

    public String getPeriodnameparm() {
        return periodnameparm;
    }

    public void setPeriodnameparm(String periodnameparm) {
        this.periodnameparm = periodnameparm;
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
        return "SavePeriodCalssDataRequest{" +
                "periodidparm=" + periodidparm +
                ", periodnameparm=" + periodnameparm +
                ", princepel=" + princepel +
                ", statusparm=" + statusparm +
                '}';
    }
}



