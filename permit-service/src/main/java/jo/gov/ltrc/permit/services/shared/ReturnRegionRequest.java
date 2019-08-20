package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class ReturnRegionRequest {

    @ApiModelProperty("Province ID Parameter") private Long provinceidparm ;
    @ApiModelProperty("Province Arabic Name Parameter") private String provincearabicnameparm ;
    @ApiModelProperty("Province English Name Parameter") private String provinceenglishnameparm ;
    @ApiModelProperty("Province Code Parameter") private String provincecodeparm ;
    @ApiModelProperty("Country ID Parameter") private Long countryidparm ;

    public Long getProvinceidparm() {
        return provinceidparm;
    }

    public void setProvinceidparm(Long provinceidparm) {
        this.provinceidparm = provinceidparm;
    }

    public String getProvincearabicnameparm() {
        return provincearabicnameparm;
    }

    public void setProvincearabicnameparm(String provincearabicnameparm) {
        this.provincearabicnameparm = provincearabicnameparm;
    }

    public String getProvinceenglishnameparm() {
        return provinceenglishnameparm;
    }

    public void setProvinceenglishnameparm(String provinceenglishnameparm) {
        this.provinceenglishnameparm = provinceenglishnameparm;
    }

    public String getProvincecodeparm() {
        return provincecodeparm;
    }

    public void setProvincecodeparm(String provincecodeparm) {
        this.provincecodeparm = provincecodeparm;
    }

    public Long getCountryidparm() {
        return countryidparm;
    }

    public void setCountryidparm(Long countryidparm) {
        this.countryidparm = countryidparm;
    }

    @Override
    public String toString() {
        return "ReturnRegionRequest{" +
                "provinceidparm=" + provinceidparm +
                ", provincearabicnameparm=" + provincearabicnameparm +
                ", provinceenglishnameparm=" + provinceenglishnameparm +
                ", provincecodeparm=" + provincecodeparm +
                ", countryidparm=" + countryidparm +
                '}';
    }
}