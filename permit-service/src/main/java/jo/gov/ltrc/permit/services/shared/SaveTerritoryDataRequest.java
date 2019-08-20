package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveTerritoryDataRequest {

    @ApiModelProperty("Territory ID Parameter ") private Long territoryidparm ;
    @ApiModelProperty("Territory Arabic Name Parameter ") private String territoryarabicnameparm ;
    @ApiModelProperty("Territory English Name Parameter ") private String territoryenglishnameparm ;
    @ApiModelProperty("Territory Code Parameter ") private String territorycodeparm ;
    @ApiModelProperty("Municipality Parameter ") private Long municipalityparm ;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;

    public Long getTerritoryidparm() {
        return territoryidparm;
    }

    public void setTerritoryidparm(Long territoryidparm) {
        this.territoryidparm = territoryidparm;
    }

    public String getTerritoryarabicnameparm() {
        return territoryarabicnameparm;
    }

    public void setTerritoryarabicnameparm(String territoryarabicnameparm) {
        this.territoryarabicnameparm = territoryarabicnameparm;
    }

    public String getTerritoryenglishnameparm() {
        return territoryenglishnameparm;
    }

    public void setTerritoryenglishnameparm(String territoryenglishnameparm) {
        this.territoryenglishnameparm = territoryenglishnameparm;
    }

    public String getTerritorycodeparm() {
        return territorycodeparm;
    }

    public void setTerritorycodeparm(String territorycodeparm) {
        this.territorycodeparm = territorycodeparm;
    }

    public Long getMunicipalityparm() {
        return municipalityparm;
    }

    public void setMunicipalityparm(Long municipalityparm) {
        this.municipalityparm = municipalityparm;
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
        return "SaveTerritoryDataRequest{" +
                "territoryidparm=" + territoryidparm +
                ", territoryarabicnameparm=" + territoryarabicnameparm +
                ", territoryenglishnameparm=" + territoryenglishnameparm +
                ", territorycodeparm=" + territorycodeparm +
                ", municipalityparm=" + municipalityparm +
                ", princepel=" + princepel +
                ", statusparm=" + statusparm +
                '}';
    }
}



