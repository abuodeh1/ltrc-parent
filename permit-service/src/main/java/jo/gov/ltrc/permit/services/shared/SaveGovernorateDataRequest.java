package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveGovernorateDataRequest {

    @ApiModelProperty("Governorate ID Parameter ") private long governorateidparm ;
    @ApiModelProperty("Governorate Arabic Name Parameter ") private String governoratearabicnameparm ;
    @ApiModelProperty("Governorate English Name Parameter ") private String governorateenglishnameparm ;
    @ApiModelProperty("Governorate Code Parameter ") private String governoratecodeparm ;
    @ApiModelProperty("Country ID Parameter ") private long countryidparm ;
    @ApiModelProperty("Province ID Parameter ") private long provinceidparm ;
    @ApiModelProperty("Principal Parameter ") private long princepel ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;

    public long getGovernorateidparm() {
        return governorateidparm;
    }

    public void setGovernorateidparm(long governorateidparm) {
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

    public long getCountryidparm() {
        return countryidparm;
    }

    public void setCountryidparm(long countryidparm) {
        this.countryidparm = countryidparm;
    }

    public long getProvinceidparm() {
        return provinceidparm;
    }

    public void setProvinceidparm(long provinceidparm) {
        this.provinceidparm = provinceidparm;
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



