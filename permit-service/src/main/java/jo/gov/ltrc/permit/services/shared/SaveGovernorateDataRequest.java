package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveGovernorateDataRequest {

    @ApiModelProperty("Governorate ID Parameter ") private Long governorateidparm ;
    @ApiModelProperty("Governorate Arabic Name Parameter ") private String governoratearabicnameparm ;
    @ApiModelProperty("Governorate English Name Parameter ") private String governorateenglishnameparm ;
    @ApiModelProperty("Governorate Code Parameter ") private String governoratecodeparm ;
    @ApiModelProperty("Country ID Parameter ") private Long countryidparm ;
    @ApiModelProperty("Province ID Parameter ") private Long provinceidparm ;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;
    @ApiModelProperty("IP Address") private String ipaddressparm  ;

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

    public String getIpaddressparm() {
        return ipaddressparm;
    }

    public void setIpaddressparm(String ipaddressparm) {
        this.ipaddressparm = ipaddressparm;
    }

    @Override
    public String toString() {
        return "SaveGovernorateDataRequest{" +
                "governorateidparm=" + governorateidparm +
                ", governoratearabicnameparm=" + governoratearabicnameparm +
                ", governorateenglishnameparm=" + governorateenglishnameparm +
                ", governoratecodeparm=" + governoratecodeparm +
                ", countryidparm=" + countryidparm +
                ", provinceidparm=" + provinceidparm +
                ", princepel=" + princepel +
                ", statusparm=" + statusparm +
                ", ipaddressparam=" + ipaddressparm +
                '}';
    }
}



