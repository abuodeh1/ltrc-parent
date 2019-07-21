package jo.gov.ltrc.permit.services.point;


import io.swagger.annotations.ApiModelProperty;

public class ReturnPointRequest {

    @ApiModelProperty("Minimum Point ID Parameter") private long minpointidparm;
    @ApiModelProperty("Maximum Point ID Parameter") private long maxpointidparm;
    @ApiModelProperty("Point Arabic Name Parameter") private String pointarabicnameparm;
    @ApiModelProperty("Governorate ID Parameter") private long governorateidparm;
    @ApiModelProperty("Point Street Parameter") private String pointstreetparm;
    @ApiModelProperty("Municipality ID Parameter") private long municipalityidparm;
    @ApiModelProperty("Territory ID Parameter") private long territoryidparm;
    @ApiModelProperty("Provence ID Parameter") private long provinceidparm;
    @ApiModelProperty("Point Neighborhood Parameter") private String pointneighborhoodparm;
    @ApiModelProperty("Point characteristic Parameter") private long pointcharacteristicparm;
    @ApiModelProperty("Point Parking Type Parameter") private long pointparkingtypeparm;
    @ApiModelProperty("Point Status Parameter") private int pointstatusparm;
    @ApiModelProperty("Sunshades Parameter") private boolean sunshadesparm ;
    @ApiModelProperty("Healthy Care Facilities Parameter") private boolean healthcarefacilitiesparm ;
    @ApiModelProperty("Public Telephones Parameter") private boolean publictelephonesparm ;
    @ApiModelProperty("Seat Parameter") private boolean seatparm ;

    public long getMinpointidparm() {
        return minpointidparm;
    }

    public void setMinpointidparm(long minpointidparm) {
        this.minpointidparm = minpointidparm;
    }

    public long getMaxpointidparm() {
        return maxpointidparm;
    }

    public void setMaxpointidparm(long maxpointidparm) {
        this.maxpointidparm = maxpointidparm;
    }

    public String getPointarabicnameparm() {
        return pointarabicnameparm;
    }

    public void setPointarabicnameparm(String pointarabicnameparm) {
        this.pointarabicnameparm = pointarabicnameparm;
    }

    public long getGovernorateidparm() {
        return governorateidparm;
    }

    public void setGovernorateidparm(long governorateidparm) {
        this.governorateidparm = governorateidparm;
    }

    public String getPointstreetparm() {
        return pointstreetparm;
    }

    public void setPointstreetparm(String pointstreetparm) {
        this.pointstreetparm = pointstreetparm;
    }

    public long getMunicipalityidparm() {
        return municipalityidparm;
    }

    public void setMunicipalityidparm(long municipalityidparm) {
        this.municipalityidparm = municipalityidparm;
    }

    public long getTerritoryidparm() {
        return territoryidparm;
    }

    public void setTerritoryidparm(long territoryidparm) {
        this.territoryidparm = territoryidparm;
    }

    public long getProvinceidparm() {
        return provinceidparm;
    }

    public void setProvinceidparm(long provinceidparm) {
        this.provinceidparm = provinceidparm;
    }

    public String getPointneighborhoodparm() {
        return pointneighborhoodparm;
    }

    public void setPointneighborhoodparm(String pointneighborhoodparm) {
        this.pointneighborhoodparm = pointneighborhoodparm;
    }

    public long getPointcharacteristicparm() {
        return pointcharacteristicparm;
    }

    public void setPointcharacteristicparm(long pointcharacteristicparm) {
        this.pointcharacteristicparm = pointcharacteristicparm;
    }

    public long getPointparkingtypeparm() {
        return pointparkingtypeparm;
    }

    public void setPointparkingtypeparm(long pointparkingtypeparm) {
        this.pointparkingtypeparm = pointparkingtypeparm;
    }

    public int getPointstatusparm() {
        return pointstatusparm;
    }

    public void setPointstatusparm(int pointstatusparm) {
        this.pointstatusparm = pointstatusparm;
    }

    public boolean isSunshadesparm() {
        return sunshadesparm;
    }

    public void setSunshadesparm(boolean sunshadesparm) {
        this.sunshadesparm = sunshadesparm;
    }

    public boolean isHealthcarefacilitiesparm() {
        return healthcarefacilitiesparm;
    }

    public void setHealthcarefacilitiesparm(boolean healthcarefacilitiesparm) {
        this.healthcarefacilitiesparm = healthcarefacilitiesparm;
    }

    public boolean isPublictelephonesparm() {
        return publictelephonesparm;
    }

    public void setPublictelephonesparm(boolean publictelephonesparm) {
        this.publictelephonesparm = publictelephonesparm;
    }

    public boolean isSeatparm() {
        return seatparm;
    }

    public void setSeatparm(boolean seatparm) {
        this.seatparm = seatparm;
    }
}



