package jo.gov.ltrc.sharedservices.permits.shared;


import io.swagger.annotations.ApiModelProperty;

public class ReturnMunicipalityRequest {

    @ApiModelProperty("Municipality ID Parameter") private long municipalityidparm ;
    @ApiModelProperty("Municipality Arabic Name Parameter") private String municipalityarabicnameparm ;
    @ApiModelProperty("Municipality English Name Parameter") private String municipalityenglishnameparm ;
    @ApiModelProperty("Municipality Code Parameter") private String municipalitycodeparm ;
    @ApiModelProperty("Governorate ID Parameter") private long governorateidparm ;

    public long getMunicipalityidparm() {
        return municipalityidparm;
    }

    public void setMunicipalityidparm(long municipalityidparm) {
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

    public long getGovernorateidparm() {
        return governorateidparm;
    }

    public void setGovernorateidparm(long governorateidparm) {
        this.governorateidparm = governorateidparm;
    }
}



