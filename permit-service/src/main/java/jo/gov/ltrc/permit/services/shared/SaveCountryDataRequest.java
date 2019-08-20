package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveCountryDataRequest {

    @ApiModelProperty("Country ID Parameter ") private Long countryidparm ;
    @ApiModelProperty("Country Arabic Name Parameter ") private String countryarabicnameparm ;
    @ApiModelProperty("Country English Name Parameter ") private String countryenglishnameparm ;
    @ApiModelProperty("Country Code Parameter ") private String countrycodeparm ;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;

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
        return "SaveCountryDataRequest{" +
                "countryidparm=" + countryidparm +
                ", countryarabicnameparm=" + countryarabicnameparm +
                ", countryenglishnameparm=" + countryenglishnameparm +
                ", countrycodeparm=" + countrycodeparm +
                ", princepel=" + princepel +
                ", statusparm=" + statusparm +
                '}';
    }
}



