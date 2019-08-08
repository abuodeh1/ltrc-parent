package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class ReturnPlateClassificationDataRequest {

    @ApiModelProperty("Plate Classification ID Parameter ") private int plateclassificationidparm ;
    @ApiModelProperty("Plate Classification Name Parameter ") private String plateclassificationnameparm ;

    public int getPlateclassificationidparm() {
        return plateclassificationidparm;
    }

    public void setPlateclassificationidparm(int plateclassificationidparm) {
        this.plateclassificationidparm = plateclassificationidparm;
    }

    public String getPlateclassificationnameparm() {
        return plateclassificationnameparm;
    }

    public void setPlateclassificationnameparm(String plateclassificationnameparm) {
        this.plateclassificationnameparm = plateclassificationnameparm;
    }
}



