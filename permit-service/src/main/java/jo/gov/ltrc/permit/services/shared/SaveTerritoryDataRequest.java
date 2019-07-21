package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveTerritoryDataRequest {

    @ApiModelProperty("Territory ID Parameter ") private long territoryidparm ;
    @ApiModelProperty("Territory Arabic Name Parameter ") private String territoryarabicnameparm ;
    @ApiModelProperty("Territory English Name Parameter ") private String territoryenglishnameparm ;
    @ApiModelProperty("Territory Code Parameter ") private String territorycodeparm ;
    @ApiModelProperty("Municipality Parameter ") private long municipalityparm ;
    @ApiModelProperty("Principal Parameter ") private long princepel ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;

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



