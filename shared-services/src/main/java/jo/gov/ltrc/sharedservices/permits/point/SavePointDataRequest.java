package jo.gov.ltrc.sharedservices.permits.point;


import io.swagger.annotations.ApiModelProperty;

public class SavePointDataRequest {

    @ApiModelProperty("Point ID Parameter") private long pointidparm ;
    @ApiModelProperty("Point Arabic Name Parameter") private String pointarabicnameparm ;
    @ApiModelProperty("Province Id Parameter") private long provinceidparm ;
    @ApiModelProperty("Governorate ID Parameter") private long governorateidparm ;
    @ApiModelProperty("Municipality ID Parameter") private long municipalityidparm ;
    @ApiModelProperty("Territory ID Parameter") private long territoryidparm ;
    @ApiModelProperty("Point Characteristic Parameter") private long pointcharacteristicparm ;
    @ApiModelProperty("Point Parking Type Parameter") private long pointparkingtypeparm ;
    @ApiModelProperty("Point Street Parameter") private String pointstreetparm ;
    @ApiModelProperty("Point Neighborhood Parameter") private String pointneighborhoodparm ;
    @ApiModelProperty("Office Name Parameter") private String officenameparm ;
    @ApiModelProperty("Office Phone Number Parameter") private String officephonenumberparm ;
    @ApiModelProperty("Liaison Officer Name Parameter") private String liaisonofficernameparm ;
    @ApiModelProperty("Point Status Parameter") private int pointstatusparm;
    @ApiModelProperty("Sunshade Parameter") private boolean sunshadesparm  ;
    @ApiModelProperty("Health Care Facilities Parameter") private boolean healthcarefacilitiesparm ;
    @ApiModelProperty("Public Telephone Parameter") private boolean publictelephonesparm ;
    @ApiModelProperty("Seat Parameter") private boolean seatparm ;
    @ApiModelProperty("Terminal Area Parameter") private double terminalareaparm ;
    @ApiModelProperty("Count of Sunshade Parameter") private double countofsunshadesparm ;
    @ApiModelProperty("Count of Seats Parameter") private double countofseatsparm ;
    @ApiModelProperty("Count of Lanes Parameter") private double countoflanesparm ;
    @ApiModelProperty("Count of Seats & Sunshade Parameter") private double countofseatsandsunshadesparm ;
    @ApiModelProperty("Terminal Remarks Parameter") private String terminalremarksparm ;
    @ApiModelProperty("Principal Parameter") private long prencipal ;

    public long getPointidparm() {
        return pointidparm;
    }

    public void setPointidparm(long pointidparm) {
        this.pointidparm = pointidparm;
    }

    public String getPointarabicnameparm() {
        return pointarabicnameparm;
    }

    public void setPointarabicnameparm(String pointarabicnameparm) {
        this.pointarabicnameparm = pointarabicnameparm;
    }

    public long getProvinceidparm() {
        return provinceidparm;
    }

    public void setProvinceidparm(long provinceidparm) {
        this.provinceidparm = provinceidparm;
    }

    public long getGovernorateidparm() {
        return governorateidparm;
    }

    public void setGovernorateidparm(long governorateidparm) {
        this.governorateidparm = governorateidparm;
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

    public double getCountofsunshadesparm() {
        return countofsunshadesparm;
    }

    public void setCountofsunshadesparm(double countofsunshadesparm) {
        this.countofsunshadesparm = countofsunshadesparm;
    }

    public double getCountoflanesparm() {
        return countoflanesparm;
    }

    public void setCountoflanesparm(double countoflanesparm) {
        this.countoflanesparm = countoflanesparm;
    }

    public String getTerminalremarksparm() {
        return terminalremarksparm;
    }

    public void setTerminalremarksparm(String terminalremarksparm) {
        this.terminalremarksparm = terminalremarksparm;
    }

    public long getPrencipal() {
        return prencipal;
    }

    public void setPrencipal(long prencipal) {
        this.prencipal = prencipal;
    }

    public double getCountofseatsparm() {
        return countofseatsparm;
    }

    public void setCountofseatsparm(double countofseatsparm) {
        this.countofseatsparm = countofseatsparm;
    }

    public double getTerminalareaparm() {
        return terminalareaparm;
    }

    public void setTerminalareaparm(double terminalareaparm) {
        this.terminalareaparm = terminalareaparm;
    }

    public double getCountofseatsandsunshadesparm() {
        return countofseatsandsunshadesparm;
    }

    public void setCountofseatsandsunshadesparm(double countofseatsandsunshadesparm) {
        this.countofseatsandsunshadesparm = countofseatsandsunshadesparm;
    }
}



