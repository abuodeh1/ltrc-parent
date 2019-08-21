package jo.gov.ltrc.permit.services.operator;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class ReturnOperatorBranchDataRequest {

    @ApiModelProperty("Minimum Operator Branch ID Parameter ") private Long minoperatorbranchidparm ;
    @ApiModelProperty("Maximum Operator Branch ID Parameter ") private Long maxoperatorbranchidparm ;
    @ApiModelProperty("Maximum Operator ID Parameter ") private Long maxoperatoridparm ;
    @ApiModelProperty("Minimum Operator ID Parameter") private Long minoperatoridparm ;
    @ApiModelProperty("Operator Name Parameter ") private String operatornameparm ;
    @ApiModelProperty("Province Parameter ") private Long provinceparm ;
    @ApiModelProperty("Province Arabic Name Parameter ") private String provincearabicnameparm ;
    @ApiModelProperty("Governorate Parameter ") private Long governorateparm ;
    @ApiModelProperty("Governorate Arabic Name Parameter ") private String governoratearabicnameparm ;
    @ApiModelProperty("Municipality Parameter ") private Long municipalityparm ;
    @ApiModelProperty("Municipality Arabic Name Parameter ") private String municipalityarabicnameparm ;
    @ApiModelProperty("Territory Parameter ") private Long territoryparm ;
    @ApiModelProperty("Territory Arabic Name Parameter ") private String territoryarabicnameparm ;
    @ApiModelProperty("Neighborhood Parameter ") private String neighborhoodparm ;
    @ApiModelProperty("Street Parameter ") private String streetparm ;
    @ApiModelProperty("Basin Parameter ") private String basinparm ;
    @ApiModelProperty("Plot No Parameter ") private String plotnoparm ;
    @ApiModelProperty("Po Box Parameter ") private String poboxparm ;
    @ApiModelProperty("Telephone Parameter ") private String telephoneparm ;
    @ApiModelProperty("Fax Parameter ") private String faxparm ;
    @ApiModelProperty("Mobile Phone Parameter ") private String mobilephoneparm ;
    @ApiModelProperty("E-Mail Parameter ") private String emailparm ;
    @ApiModelProperty("Agreement Reference Number Parameter ") private String aggreementreferencenumberparm ;
    @ApiModelProperty("Agreement Reference Date Parameter ") private Date aggreementreferencedateparm ;
    @ApiModelProperty("Minimum Vehicle Count Parameter ") private Integer minvehiclecountparm ;
    @ApiModelProperty("Maximum Vehicle Count Parameter ") private Integer maxvehiclecountparm ;
    @ApiModelProperty("Branch Name Parameter ") private String branchnameparm ;
    @ApiModelProperty("Page Size Parameter ") private Integer pagesize ;
    @ApiModelProperty("Page Index Parameter ") private Integer pageindex ;
    @ApiModelProperty("Sort Type Parameter ") private Integer sorttype ;
    @ApiModelProperty("Sort By Parameter ") private String sortby ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;

    public Long getMinoperatorbranchidparm() {
        return minoperatorbranchidparm;
    }

    public void setMinoperatorbranchidparm(Long minoperatorbranchidparm) {
        this.minoperatorbranchidparm = minoperatorbranchidparm;
    }

    public Long getMaxoperatorbranchidparm() {
        return maxoperatorbranchidparm;
    }

    public void setMaxoperatorbranchidparm(Long maxoperatorbranchidparm) {
        this.maxoperatorbranchidparm = maxoperatorbranchidparm;
    }

    public Long getMaxoperatoridparm() {
        return maxoperatoridparm;
    }

    public void setMaxoperatoridparm(Long maxoperatoridparm) {
        this.maxoperatoridparm = maxoperatoridparm;
    }

    public Long getMinoperatoridparm() {
        return minoperatoridparm;
    }

    public void setMinoperatoridparm(Long minoperatoridparm) {
        this.minoperatoridparm = minoperatoridparm;
    }

    public String getOperatornameparm() {
        return operatornameparm;
    }

    public void setOperatornameparm(String operatornameparm) {
        this.operatornameparm = operatornameparm;
    }

    public Long getProvinceparm() {
        return provinceparm;
    }

    public void setProvinceparm(Long provinceparm) {
        this.provinceparm = provinceparm;
    }

    public String getProvincearabicnameparm() {
        return provincearabicnameparm;
    }

    public void setProvincearabicnameparm(String provincearabicnameparm) {
        this.provincearabicnameparm = provincearabicnameparm;
    }

    public Long getGovernorateparm() {
        return governorateparm;
    }

    public void setGovernorateparm(Long governorateparm) {
        this.governorateparm = governorateparm;
    }

    public String getGovernoratearabicnameparm() {
        return governoratearabicnameparm;
    }

    public void setGovernoratearabicnameparm(String governoratearabicnameparm) {
        this.governoratearabicnameparm = governoratearabicnameparm;
    }

    public Long getMunicipalityparm() {
        return municipalityparm;
    }

    public void setMunicipalityparm(Long municipalityparm) {
        this.municipalityparm = municipalityparm;
    }

    public String getMunicipalityarabicnameparm() {
        return municipalityarabicnameparm;
    }

    public void setMunicipalityarabicnameparm(String municipalityarabicnameparm) {
        this.municipalityarabicnameparm = municipalityarabicnameparm;
    }

    public Long getTerritoryparm() {
        return territoryparm;
    }

    public void setTerritoryparm(Long territoryparm) {
        this.territoryparm = territoryparm;
    }

    public String getTerritoryarabicnameparm() {
        return territoryarabicnameparm;
    }

    public void setTerritoryarabicnameparm(String territoryarabicnameparm) {
        this.territoryarabicnameparm = territoryarabicnameparm;
    }

    public String getNeighborhoodparm() {
        return neighborhoodparm;
    }

    public void setNeighborhoodparm(String neighborhoodparm) {
        this.neighborhoodparm = neighborhoodparm;
    }

    public String getStreetparm() {
        return streetparm;
    }

    public void setStreetparm(String streetparm) {
        this.streetparm = streetparm;
    }

    public String getBasinparm() {
        return basinparm;
    }

    public void setBasinparm(String basinparm) {
        this.basinparm = basinparm;
    }

    public String getPlotnoparm() {
        return plotnoparm;
    }

    public void setPlotnoparm(String plotnoparm) {
        this.plotnoparm = plotnoparm;
    }

    public String getPoboxparm() {
        return poboxparm;
    }

    public void setPoboxparm(String poboxparm) {
        this.poboxparm = poboxparm;
    }

    public String getTelephoneparm() {
        return telephoneparm;
    }

    public void setTelephoneparm(String telephoneparm) {
        this.telephoneparm = telephoneparm;
    }

    public String getFaxparm() {
        return faxparm;
    }

    public void setFaxparm(String faxparm) {
        this.faxparm = faxparm;
    }

    public String getMobilephoneparm() {
        return mobilephoneparm;
    }

    public void setMobilephoneparm(String mobilephoneparm) {
        this.mobilephoneparm = mobilephoneparm;
    }

    public String getEmailparm() {
        return emailparm;
    }

    public void setEmailparm(String emailparm) {
        this.emailparm = emailparm;
    }

    public String getAggreementreferencenumberparm() {
        return aggreementreferencenumberparm;
    }

    public void setAggreementreferencenumberparm(String aggreementreferencenumberparm) {
        this.aggreementreferencenumberparm = aggreementreferencenumberparm;
    }

    public Date getAggreementreferencedateparm() {
        return aggreementreferencedateparm;
    }

    public void setAggreementreferencedateparm(Date aggreementreferencedateparm) {
        this.aggreementreferencedateparm = aggreementreferencedateparm;
    }

    public Integer getMinvehiclecountparm() {
        return minvehiclecountparm;
    }

    public void setMinvehiclecountparm(Integer minvehiclecountparm) {
        this.minvehiclecountparm = minvehiclecountparm;
    }

    public Integer getMaxvehiclecountparm() {
        return maxvehiclecountparm;
    }

    public void setMaxvehiclecountparm(Integer maxvehiclecountparm) {
        this.maxvehiclecountparm = maxvehiclecountparm;
    }

    public String getBranchnameparm() {
        return branchnameparm;
    }

    public void setBranchnameparm(String branchnameparm) {
        this.branchnameparm = branchnameparm;
    }

    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }

    public Integer getPageindex() {
        return pageindex;
    }

    public void setPageindex(Integer pageindex) {
        this.pageindex = pageindex;
    }

    public Integer getSorttype() {
        return sorttype;
    }

    public void setSorttype(Integer sorttype) {
        this.sorttype = sorttype;
    }

    public String getSortby() {
        return sortby;
    }

    public void setSortby(String sortby) {
        this.sortby = sortby;
    }

    public Integer getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(Integer statusparm) {
        this.statusparm = statusparm;
    }

    @Override
    public String toString() {
        return "ReturnOperatorBranchDataRequest{" +
                "minoperatorbranchidparm=" + minoperatorbranchidparm +
                ", maxoperatorbranchidparm=" + maxoperatorbranchidparm +
                ", maxoperatoridparm=" + maxoperatoridparm +
                ", minoperatoridparm=" + minoperatoridparm +
                ", operatornameparm=" + operatornameparm +
                ", provinceparm=" + provinceparm +
                ", provincearabicnameparm=" + provincearabicnameparm +
                ", governorateparm=" + governorateparm +
                ", governoratearabicnameparm=" + governoratearabicnameparm +
                ", municipalityparm=" + municipalityparm +
                ", municipalityarabicnameparm=" + municipalityarabicnameparm +
                ", territoryparm=" + territoryparm +
                ", territoryarabicnameparm=" + territoryarabicnameparm +
                ", neighborhoodparm=" + neighborhoodparm +
                ", streetparm=" + streetparm +
                ", basinparm=" + basinparm +
                ", plotnoparm=" + plotnoparm +
                ", poboxparm=" + poboxparm +
                ", telephoneparm=" + telephoneparm +
                ", faxparm=" + faxparm +
                ", mobilephoneparm=" + mobilephoneparm +
                ", emailparm=" + emailparm +
                ", aggreementreferencenumberparm=" + aggreementreferencenumberparm +
                ", aggreementreferencedateparm=" + aggreementreferencedateparm +
                ", minvehiclecountparm=" + minvehiclecountparm +
                ", maxvehiclecountparm=" + maxvehiclecountparm +
                ", branchnameparm=" + branchnameparm +
                ", pagesize=" + pagesize +
                ", pageindex=" + pageindex +
                ", sorttype=" + sorttype +
                ", sortby=" + sortby +
                ", statusparm=" + statusparm +
                '}';
    }
}
