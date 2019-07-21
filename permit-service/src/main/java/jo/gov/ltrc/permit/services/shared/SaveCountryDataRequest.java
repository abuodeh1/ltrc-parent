package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveCountryDataRequest {

    @ApiModelProperty("Country ID Parameter ") private long countryidparm ;
    @ApiModelProperty("Country Arabic Name Parameter ") private String countryarabicnameparm ;
    @ApiModelProperty("Country English Name Parameter ") private String countryenglishnameparm ;
    @ApiModelProperty("Country Code Parameter ") private String countrycodeparm ;
    @ApiModelProperty("Principal Parameter ") private long princepel ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;

    public long getCountryidparm() {
        return countryidparm;
    }

    public void setCountryidparm(long countryidparm) {
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



