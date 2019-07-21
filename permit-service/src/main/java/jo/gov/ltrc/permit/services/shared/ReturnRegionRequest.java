package com.etech.ltrc.permits.shared;


import io.swagger.annotations.ApiModelProperty;

public class ReturnRegionRequest {

    @ApiModelProperty("Province ID Parameter") private long provinceidparm ;
    @ApiModelProperty("Province Arabic Name Parameter") private String provincearabicnameparm ;
    @ApiModelProperty("Province English Name Parameter") private String provinceenglishnameparm ;
    @ApiModelProperty("Province Code Parameter") private String provincecodeparm ;
    @ApiModelProperty("Country ID Parameter") private long countryidparm ;


    public long getProvinceidparm() {
        return provinceidparm;
    }

    public void setProvinceidparm(long provinceidparm) {
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

    public long getCountryidparm() {
        return countryidparm;
    }

    public void setCountryidparm(long countryidparm) {
        this.countryidparm = countryidparm;
    }
}