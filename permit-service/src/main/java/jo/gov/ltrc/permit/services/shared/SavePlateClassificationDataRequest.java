package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class SavePlateClassificationDataRequest {

    @ApiModelProperty("Violation Type ID Parameter ") private Long plateclassificationidparm;
    @ApiModelProperty("Violation Type Name Parameter ") private String plateclassificationnameparm;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;


    public Long getPlateclassificationidparm() {
        return plateclassificationidparm;
    }

    public void setPlateclassificationidparm(Long plateclassificationidparm) {
        this.plateclassificationidparm = plateclassificationidparm;
    }

    public String getPlateclassificationnameparm() {
        return plateclassificationnameparm;
    }

    public void setPlateclassificationnameparm(String plateclassificationnameparm) {
        this.plateclassificationnameparm = plateclassificationnameparm;
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
        return "SavePlateClassificationDataRequest{" +
                "plateclassificationidparm=" + plateclassificationidparm +
                ", plateclassificationnameparm=" + plateclassificationnameparm +
                ", princepel=" + princepel +
                ", statusparm=" + statusparm +
                '}';
    }
}



