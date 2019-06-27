package jo.gov.ltrc.sharedservices.permits.shared;


import io.swagger.annotations.ApiModelProperty;

public class ReturnAreaRequest {

    @ApiModelProperty("Territory ID Parameter") private long territoryidparm ;
    @ApiModelProperty("Territory Arabic Name Parameter") private String territoryarabicnameparm ;
    @ApiModelProperty("Territory English Name Parameter") private String territoryenglishnameparm ;
    @ApiModelProperty("Territory Code Parameter") private String territorycodeparm ;
    @ApiModelProperty("Municipality Parameter") private long municipalityparm ;

    public long getTerritoryidparm() {
        return territoryidparm;
    }

    public void setTerritoryidparm(long territoryidparm) {
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

    public long getMunicipalityparm() {
        return municipalityparm;
    }

    public void setMunicipalityparm(long municipalityparm) {
        this.municipalityparm = municipalityparm;
    }
}



