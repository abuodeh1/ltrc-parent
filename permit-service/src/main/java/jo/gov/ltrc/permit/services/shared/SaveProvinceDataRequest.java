package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveProvinceDataRequest {

    @ApiModelProperty("Province ID Parameter ") private Long provinceidparm ;
    @ApiModelProperty("Province Arabic Name Parameter ") private String provincearabicnameparm ;
    @ApiModelProperty("Province English Name Parameter ") private String provinceenglishnameparm ;
    @ApiModelProperty("Province Code Parameter ") private String provincecodeparm ;
    @ApiModelProperty("Country ID Parameter ") private Long countryidparm ;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;
    @ApiModelProperty("IP Address") private String ipaddressparm  ;

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
        return "SaveProvinceDataRequest{" +
                "provinceidparm=" + provinceidparm +
                ", provincearabicnameparm= " + provincearabicnameparm + 
                ", provinceenglishnameparm= " + provinceenglishnameparm + 
                ", provincecodeparm= " + provincecodeparm + 
                ", countryidparm=" + countryidparm +
                ", princepel=" + princepel +
                ", statusparm=" + statusparm +
                ", ipaddressparm= " + ipaddressparm + 
                '}';
    }
}



