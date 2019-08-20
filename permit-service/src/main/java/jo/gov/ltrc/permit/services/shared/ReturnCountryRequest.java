package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class ReturnCountryRequest {

    @ApiModelProperty("Country ID Parameter") private Long countryidparm ;
    @ApiModelProperty("Country Arabic Name Parameter") private String countryarabicnameparm ;
    @ApiModelProperty("Country English Name Parameter") private String countryenglishnameparm ;
    @ApiModelProperty("Country Code Parameter") private String countrycodeparm ;

    public Long getCountryidparm() {
        return countryidparm;
    }

    public void setCountryidparm(Long countryidparm) {
        this.countryidparm = countryidparm;
    }

    public String getCountryarabicnameparm() {
        return countryarabicnameparm;
    }

    public void setCountryarabicnameparm(String countryarabicnameparm) {
        this.countryarabicnameparm = countryarabicnameparm;
    }

    public String getCountryenglishnameparm() {
        return countryenglishnameparm;
    }

    public void setCountryenglishnameparm(String countryenglishnameparm) {
        this.countryenglishnameparm = countryenglishnameparm;
    }

    public String getCountrycodeparm() {
        return countrycodeparm;
    }

    public void setCountrycodeparm(String countrycodeparm) {
        this.countrycodeparm = countrycodeparm;
    }

    @Override
    public String toString() {
        return "ReturnCountryRequest{" +
                "countryidparm=" + countryidparm +
                ", countryarabicnameparm=" + countryarabicnameparm +
                ", countryenglishnameparm=" + countryenglishnameparm +
                ", countrycodeparm=" + countrycodeparm +
                '}';
    }
}



