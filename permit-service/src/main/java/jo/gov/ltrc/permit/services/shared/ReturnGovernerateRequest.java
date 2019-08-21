package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class ReturnGovernerateRequest {

    @ApiModelProperty("Governorate ID Parameter") private Long governorateidparm ;
    @ApiModelProperty("Governorate Arabic Name Parameter") private String governoratearabicnameparm ;
    @ApiModelProperty("Governorate English NameParameter") private String governorateenglishnameparm ;
    @ApiModelProperty("Governorate Code Parameter") private String governoratecodeparm ;
    @ApiModelProperty("Country ID Parameter") private Long countryidparm ;
    @ApiModelProperty("Province ID Parameter") private Long provinceidparm ;

    public Long getGovernorateidparm() {
        return governorateidparm;
    }

    public void setGovernorateidparm(Long governorateidparm) {
        this.governorateidparm = governorateidparm;
    }

    public String getGovernoratearabicnameparm() {
        return governoratearabicnameparm;
    }

    public void setGovernoratearabicnameparm(String governoratearabicnameparm) {
        this.governoratearabicnameparm = governoratearabicnameparm;
    }

    public String getGovernorateenglishnameparm() {
        return governorateenglishnameparm;
    }

    public void setGovernorateenglishnameparm(String governorateenglishnameparm) {
        this.governorateenglishnameparm = governorateenglishnameparm;
    }

    public String getGovernoratecodeparm() {
        return governoratecodeparm;
    }

    public void setGovernoratecodeparm(String governoratecodeparm) {
        this.governoratecodeparm = governoratecodeparm;
    }

    public Long getCountryidparm() {
        return countryidparm;
    }

    public void setCountryidparm(Long countryidparm) {
        this.countryidparm = countryidparm;
    }

    public Long getProvinceidparm() {
        return provinceidparm;
    }

    public void setProvinceidparm(Long provinceidparm) {
        this.provinceidparm = provinceidparm;
    }

    @Override
    public String toString() {
        return "ReturnGovernerateRequest{" +
                "governorateidparm=" + governorateidparm +
                ", governoratearabicnameparm=" + governoratearabicnameparm +
                ", governorateenglishnameparm=" + governorateenglishnameparm +
                ", governoratecodeparm=" + governoratecodeparm +
                ", countryidparm=" + countryidparm +
                ", provinceidparm=" + provinceidparm +
                '}';
    }
}

