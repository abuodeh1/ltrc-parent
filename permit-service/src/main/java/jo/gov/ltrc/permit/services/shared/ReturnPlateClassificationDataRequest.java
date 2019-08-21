package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class ReturnPlateClassificationDataRequest {

    @ApiModelProperty("Plate Classification ID Parameter ") private Integer plateclassificationidparm ;
    @ApiModelProperty("Plate Classification Name Parameter ") private String plateclassificationnameparm ;

    public Integer getPlateclassificationidparm() {
        return plateclassificationidparm;
    }

    public void setPlateclassificationidparm(Integer plateclassificationidparm) {
        this.plateclassificationidparm = plateclassificationidparm;
    }

    public String getPlateclassificationnameparm() {
        return plateclassificationnameparm;
    }

    public void setPlateclassificationnameparm(String plateclassificationnameparm) {
        this.plateclassificationnameparm = plateclassificationnameparm;
    }

    @Override
    public String toString() {
        return "ReturnPlateClassificationDataRequest{" +
                "plateclassificationidparm=" + plateclassificationidparm +
                ", plateclassificationnameparm=" + plateclassificationnameparm +
                '}';
    }
}



