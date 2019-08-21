package jo.gov.ltrc.permit.services.point;


import io.swagger.annotations.ApiModelProperty;

public class SavePointDataRequest {

    @ApiModelProperty("Point ID Parameter") private Long pointidparm ;
    @ApiModelProperty("Point Arabic Name Parameter") private String pointarabicnameparm ;
    @ApiModelProperty("Province Id Parameter") private Long provinceidparm ;
    @ApiModelProperty("Governorate ID Parameter") private Long governorateidparm ;
    @ApiModelProperty("Municipality ID Parameter") private Long municipalityidparm ;
    @ApiModelProperty("Territory ID Parameter") private Long territoryidparm ;
    @ApiModelProperty("Point Characteristic Parameter") private Long pointcharacteristicparm ;
    @ApiModelProperty("Point Parking Type Parameter") private Long pointparkingtypeparm ;
    @ApiModelProperty("Point Street Parameter") private String pointstreetparm ;
    @ApiModelProperty("Point Neighborhood Parameter") private String pointneighborhoodparm ;
    @ApiModelProperty("Office Name Parameter") private String officenameparm ;
    @ApiModelProperty("Office Phone Number Parameter") private String officephonenumberparm ;
    @ApiModelProperty("Liaison Officer Name Parameter") private String liaisonofficernameparm ;
    @ApiModelProperty("Point Status Parameter") private Integer pointstatusparm;
    @ApiModelProperty("Sunshade Parameter") private   Boolean sunshadesparm  ;
    @ApiModelProperty("Health Care Facilities Parameter") private   Boolean healthcarefacilitiesparm ;
    @ApiModelProperty("Public Telephone Parameter") private   Boolean publictelephonesparm ;
    @ApiModelProperty("Seat Parameter") private   Boolean seatparm ;
    @ApiModelProperty("Terminal Area Parameter") private  Double terminalareaparm ;
    @ApiModelProperty("Count of Sunshade Parameter") private  Double countofsunshadesparm ;
    @ApiModelProperty("Count of Seats Parameter") private  Double countofseatsparm ;
    @ApiModelProperty("Count of Lanes Parameter") private  Double countoflanesparm ;
    @ApiModelProperty("Count of Seats & Sunshade Parameter") private  Double countofseatsandsunshadesparm ;
    @ApiModelProperty("Terminal Remarks Parameter") private String terminalremarksparm ;
    @ApiModelProperty("Principal Parameter") private Long prencipal ;
    @ApiModelProperty("IP Address Parameter ") private String ipaddressparm ;

    public Long getPointidparm() {
        return pointidparm;
    }

    public void setPointidparm(Long pointidparm) {
        this.pointidparm = pointidparm;
    }

    public String getPointarabicnameparm() {
        return pointarabicnameparm;
    }

    public void setPointarabicnameparm(String pointarabicnameparm) {
        this.pointarabicnameparm = pointarabicnameparm;
    }

    public Long getProvinceidparm() {
        return provinceidparm;
    }

    public void setProvinceidparm(Long provinceidparm) {
        this.provinceidparm = provinceidparm;
    }

    public Long getGovernorateidparm() {
        return governorateidparm;
    }

    public void setGovernorateidparm(Long governorateidparm) {
        this.governorateidparm = governorateidparm;
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

    public String getPointstreetparm() {
        return pointstreetparm;
    }

    public void setPointstreetparm(String pointstreetparm) {
        this.pointstreetparm = pointstreetparm;
    }

    public String getPointneighborhoodparm() {
        return pointneighborhoodparm;
    }

    public void setPointneighborhoodparm(String pointneighborhoodparm) {
        this.pointneighborhoodparm = pointneighborhoodparm;
    }

    public String getOfficenameparm() {
        return officenameparm;
    }

    public void setOfficenameparm(String officenameparm) {
        this.officenameparm = officenameparm;
    }

    public String getOfficephonenumberparm() {
        return officephonenumberparm;
    }

    public void setOfficephonenumberparm(String officephonenumberparm) {
        this.officephonenumberparm = officephonenumberparm;
    }

    public String getLiaisonofficernameparm() {
        return liaisonofficernameparm;
    }

    public void setLiaisonofficernameparm(String liaisonofficernameparm) {
        this.liaisonofficernameparm = liaisonofficernameparm;
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

    public Double getTerminalareaparm() {
        return terminalareaparm;
    }

    public void setTerminalareaparm(Double terminalareaparm) {
        this.terminalareaparm = terminalareaparm;
    }

    public Double getCountofsunshadesparm() {
        return countofsunshadesparm;
    }

    public void setCountofsunshadesparm(Double countofsunshadesparm) {
        this.countofsunshadesparm = countofsunshadesparm;
    }

    public Double getCountofseatsparm() {
        return countofseatsparm;
    }

    public void setCountofseatsparm(Double countofseatsparm) {
        this.countofseatsparm = countofseatsparm;
    }

    public Double getCountoflanesparm() {
        return countoflanesparm;
    }

    public void setCountoflanesparm(Double countoflanesparm) {
        this.countoflanesparm = countoflanesparm;
    }

    public Double getCountofseatsandsunshadesparm() {
        return countofseatsandsunshadesparm;
    }

    public void setCountofseatsandsunshadesparm(Double countofseatsandsunshadesparm) {
        this.countofseatsandsunshadesparm = countofseatsandsunshadesparm;
    }

    public String getTerminalremarksparm() {
        return terminalremarksparm;
    }

    public void setTerminalremarksparm(String terminalremarksparm) {
        this.terminalremarksparm = terminalremarksparm;
    }

    public Long getPrencipal() {
        return prencipal;
    }

    public void setPrencipal(Long prencipal) {
        this.prencipal = prencipal;
    }

    public String getIpaddressparm() {
        return ipaddressparm;
    }

    public void setIpaddressparm(String ipaddressparm) {
        this.ipaddressparm = ipaddressparm;
    }

    @Override
    public String toString() {
        return "SavePointDataRequest{" +
                "pointidparm=" + pointidparm +
                ", pointarabicnameparm= " + pointarabicnameparm + 
                ", provinceidparm=" + provinceidparm +
                ", governorateidparm=" + governorateidparm +
                ", municipalityidparm=" + municipalityidparm +
                ", territoryidparm=" + territoryidparm +
                ", pointcharacteristicparm=" + pointcharacteristicparm +
                ", pointparkingtypeparm=" + pointparkingtypeparm +
                ", pointstreetparm= " + pointstreetparm + 
                ", pointneighborhoodparm= " + pointneighborhoodparm + 
                ", officenameparm= " + officenameparm + 
                ", officephonenumberparm= " + officephonenumberparm + 
                ", liaisonofficernameparm= " + liaisonofficernameparm + 
                ", pointstatusparm=" + pointstatusparm +
                ", sunshadesparm=" + sunshadesparm +
                ", healthcarefacilitiesparm=" + healthcarefacilitiesparm +
                ", publictelephonesparm=" + publictelephonesparm +
                ", seatparm=" + seatparm +
                ", terminalareaparm=" + terminalareaparm +
                ", countofsunshadesparm=" + countofsunshadesparm +
                ", countofseatsparm=" + countofseatsparm +
                ", countoflanesparm=" + countoflanesparm +
                ", countofseatsandsunshadesparm=" + countofseatsandsunshadesparm +
                ", terminalremarksparm= " + terminalremarksparm + 
                ", prencipal=" + prencipal +
                ", ipaddressparm= " + ipaddressparm + 
                '}';
    }
}



