package jo.gov.ltrc.permit.services.point;


import io.swagger.annotations.ApiModelProperty;

public class ReturnPointRequest {

    @ApiModelProperty("Minimum Point ID Parameter") private Long minpointidparm;
    @ApiModelProperty("Maximum Point ID Parameter") private Long maxpointidparm;
    @ApiModelProperty("Point Arabic Name Parameter") private String pointarabicnameparm;
    @ApiModelProperty("Governorate ID Parameter") private Long governorateidparm;
    @ApiModelProperty("Point Street Parameter") private String pointstreetparm;
    @ApiModelProperty("Municipality ID Parameter") private Long municipalityidparm;
    @ApiModelProperty("Territory ID Parameter") private Long territoryidparm;
    @ApiModelProperty("Provence ID Parameter") private Long provinceidparm;
    @ApiModelProperty("Point Neighborhood Parameter") private String pointneighborhoodparm;
    @ApiModelProperty("Point characteristic Parameter") private Long pointcharacteristicparm;
    @ApiModelProperty("Point Parking Type Parameter") private Long pointparkingtypeparm;
    @ApiModelProperty("Point Status Parameter") private Integer pointstatusparm;
    @ApiModelProperty("Sunshades Parameter") private   Boolean sunshadesparm ;
    @ApiModelProperty("Healthy Care Facilities Parameter") private   Boolean healthcarefacilitiesparm ;
    @ApiModelProperty("Public Telephones Parameter") private   Boolean publictelephonesparm ;
    @ApiModelProperty("Seat Parameter") private   Boolean seatparm ;

    public Long getMinpointidparm() {
        return minpointidparm;
    }

    public void setMinpointidparm(Long minpointidparm) {
        this.minpointidparm = minpointidparm;
    }

    public Long getMaxpointidparm() {
        return maxpointidparm;
    }

    public void setMaxpointidparm(Long maxpointidparm) {
        this.maxpointidparm = maxpointidparm;
    }

    public String getPointarabicnameparm() {
        return pointarabicnameparm;
    }

    public void setPointarabicnameparm(String pointarabicnameparm) {
        this.pointarabicnameparm = pointarabicnameparm;
    }

    public Long getGovernorateidparm() {
        return governorateidparm;
    }

    public void setGovernorateidparm(Long governorateidparm) {
        this.governorateidparm = governorateidparm;
    }

    public String getPointstreetparm() {
        return pointstreetparm;
    }

    public void setPointstreetparm(String pointstreetparm) {
        this.pointstreetparm = pointstreetparm;
    }

    public Long getMunicipalityidparm() {
        return municipalityidparm;
    }

    public void setMunicipalityidparm(Long municipalityidparm) {
        this.municipalityidparm = municipalityidparm;
    }

    public Long getTerritoryidparm() {
        return territoryidparm;
    }

    public void setTerritoryidparm(Long territoryidparm) {
        this.territoryidparm = territoryidparm;
    }

    public Long getProvinceidparm() {
        return provinceidparm;
    }

    public void setProvinceidparm(Long provinceidparm) {
        this.provinceidparm = provinceidparm;
    }

    public String getPointneighborhoodparm() {
        return pointneighborhoodparm;
    }

    public void setPointneighborhoodparm(String pointneighborhoodparm) {
        this.pointneighborhoodparm = pointneighborhoodparm;
    }

    public Long getPointcharacteristicparm() {
        return pointcharacteristicparm;
    }

    public void setPointcharacteristicparm(Long pointcharacteristicparm) {
        this.pointcharacteristicparm = pointcharacteristicparm;
    }

    public Long getPointparkingtypeparm() {
        return pointparkingtypeparm;
    }

    public void setPointparkingtypeparm(Long pointparkingtypeparm) {
        this.pointparkingtypeparm = pointparkingtypeparm;
    }

    public Integer getPointstatusparm() {
        return pointstatusparm;
    }

    public void setPointstatusparm(Integer pointstatusparm) {
        this.pointstatusparm = pointstatusparm;
    }

    public Boolean getSunshadesparm() {
        return sunshadesparm;
    }

    public void setSunshadesparm(Boolean sunshadesparm) {
        this.sunshadesparm = sunshadesparm;
    }

    public Boolean getHealthcarefacilitiesparm() {
        return healthcarefacilitiesparm;
    }

    public void setHealthcarefacilitiesparm(Boolean healthcarefacilitiesparm) {
        this.healthcarefacilitiesparm = healthcarefacilitiesparm;
    }

    public Boolean getPublictelephonesparm() {
        return publictelephonesparm;
    }

    public void setPublictelephonesparm(Boolean publictelephonesparm) {
        this.publictelephonesparm = publictelephonesparm;
    }

    public Boolean getSeatparm() {
        return seatparm;
    }

    public void setSeatparm(Boolean seatparm) {
        this.seatparm = seatparm;
    }

    @Override
    public String toString() {
        return "ReturnPointRequest{" +
                "minpointidparm=" + minpointidparm +
                ", maxpointidparm=" + maxpointidparm +
                ", pointarabicnameparm=" + pointarabicnameparm +
                ", governorateidparm=" + governorateidparm +
                ", pointstreetparm=" + pointstreetparm +
                ", municipalityidparm=" + municipalityidparm +
                ", territoryidparm=" + territoryidparm +
                ", provinceidparm=" + provinceidparm +
                ", pointneighborhoodparm=" + pointneighborhoodparm +
                ", pointcharacteristicparm=" + pointcharacteristicparm +
                ", pointparkingtypeparm=" + pointparkingtypeparm +
                ", pointstatusparm=" + pointstatusparm +
                ", sunshadesparm=" + sunshadesparm +
                ", healthcarefacilitiesparm=" + healthcarefacilitiesparm +
                ", publictelephonesparm=" + publictelephonesparm +
                ", seatparm=" + seatparm +
                '}';
    }
}



