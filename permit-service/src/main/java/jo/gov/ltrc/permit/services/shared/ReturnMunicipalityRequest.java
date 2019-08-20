package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class ReturnMunicipalityRequest {

    @ApiModelProperty("Municipality ID Parameter") private Long municipalityidparm ;
    @ApiModelProperty("Municipality Arabic Name Parameter") private String municipalityarabicnameparm ;
    @ApiModelProperty("Municipality English Name Parameter") private String municipalityenglishnameparm ;
    @ApiModelProperty("Municipality Code Parameter") private String municipalitycodeparm ;
    @ApiModelProperty("Governorate ID Parameter") private Long governorateidparm ;

    public Long getMunicipalityidparm() {
        return municipalityidparm;
    }

    public void setMunicipalityidparm(Long municipalityidparm) {
        this.municipalityidparm = municipalityidparm;
    }

    public String getMunicipalityarabicnameparm() {
        return municipalityarabicnameparm;
    }

    public void setMunicipalityarabicnameparm(String municipalityarabicnameparm) {
        this.municipalityarabicnameparm = municipalityarabicnameparm;
    }

    public String getMunicipalityenglishnameparm() {
        return municipalityenglishnameparm;
    }

    public void setMunicipalityenglishnameparm(String municipalityenglishnameparm) {
        this.municipalityenglishnameparm = municipalityenglishnameparm;
    }

    public String getMunicipalitycodeparm() {
        return municipalitycodeparm;
    }

    public void setMunicipalitycodeparm(String municipalitycodeparm) {
        this.municipalitycodeparm = municipalitycodeparm;
    }

    public Long getGovernorateidparm() {
        return governorateidparm;
    }

    public void setGovernorateidparm(Long governorateidparm) {
        this.governorateidparm = governorateidparm;
    }

    @Override
    public String toString() {
        return "ReturnMunicipalityRequest{" +
                "municipalityidparm=" + municipalityidparm +
                ", municipalityarabicnameparm=" + municipalityarabicnameparm +
                ", municipalityenglishnameparm=" + municipalityenglishnameparm +
                ", municipalitycodeparm=" + municipalitycodeparm +
                ", governorateidparm=" + governorateidparm +
                '}';
    }
}



