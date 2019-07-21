package com.etech.ltrc.permits.operator;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class ReturnOperatorBranchDataRequest {

    @ApiModelProperty("Minimum Operator Branch ID Parameter ") private long minoperatorbranchidparm ;
    @ApiModelProperty("Maximum Operator Branch ID Parameter ") private long maxoperatorbranchidparm ;
    @ApiModelProperty("Maximum Operator ID Parameter ") private long maxoperatoridparm ;
    @ApiModelProperty("Minimum Operator ID Parameter") private long minoperatoridparm ;
    @ApiModelProperty("Operator Name Parameter ") private String operatornameparm ;
    @ApiModelProperty("Province Parameter ") private long provinceparm ;
    @ApiModelProperty("Province Arabic Name Parameter ") private String provincearabicnameparm ;
    @ApiModelProperty("Governorate Parameter ") private long governorateparm ;
    @ApiModelProperty("Governorate Arabic Name Parameter ") private String governoratearabicnameparm ;
    @ApiModelProperty("Municipality Parameter ") private long municipalityparm ;
    @ApiModelProperty("Municipality Arabic Name Parameter ") private String municipalityarabicnameparm ;
    @ApiModelProperty("Territory Parameter ") private long territoryparm ;
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
    @ApiModelProperty("Minimum Vehicle Count Parameter ") private int minvehiclecountparm ;
    @ApiModelProperty("Maximum Vehicle Count Parameter ") private int maxvehiclecountparm ;
    @ApiModelProperty("Branch Name Parameter ") private String branchnameparm ;
    @ApiModelProperty("Page Size Parameter ") private int pagesize ;
    @ApiModelProperty("Page Index Parameter ") private int pageindex ;
    @ApiModelProperty("Sort Type Parameter ") private int sorttype ;
    @ApiModelProperty("Sort By Parameter ") private String sortby ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;

    public long getMinoperatorbranchidparm() {
        return minoperatorbranchidparm;
    }

    public void setMinoperatorbranchidparm(long minoperatorbranchidparm) {
        this.minoperatorbranchidparm = minoperatorbranchidparm;
    }

    public long getMaxoperatorbranchidparm() {
        return maxoperatorbranchidparm;
    }

    public void setMaxoperatorbranchidparm(long maxoperatorbranchidparm) {
        this.maxoperatorbranchidparm = maxoperatorbranchidparm;
    }

    public long getMaxoperatoridparm() {
        return maxoperatoridparm;
    }

    public void setMaxoperatoridparm(long maxoperatoridparm) {
        this.maxoperatoridparm = maxoperatoridparm;
    }

    public long getMinoperatoridparm() {
        return minoperatoridparm;
    }

    public void setMinoperatoridparm(long minoperatoridparm) {
        this.minoperatoridparm = minoperatoridparm;
    }

    public String getOperatornameparm() {
        return operatornameparm;
    }

    public void setOperatornameparm(String operatornameparm) {
        this.operatornameparm = operatornameparm;
    }

    public long getProvinceparm() {
        return provinceparm;
    }

    public void setProvinceparm(long provinceparm) {
        this.provinceparm = provinceparm;
    }

    public String getProvincearabicnameparm() {
        return provincearabicnameparm;
    }

    public void setProvincearabicnameparm(String provincearabicnameparm) {
        this.provincearabicnameparm = provincearabicnameparm;
    }

    public long getGovernorateparm() {
        return governorateparm;
    }

    public void setGovernorateparm(long governorateparm) {
        this.governorateparm = governorateparm;
    }

    public String getGovernoratearabicnameparm() {
        return governoratearabicnameparm;
    }

    public void setGovernoratearabicnameparm(String governoratearabicnameparm) {
        this.governoratearabicnameparm = governoratearabicnameparm;
    }

    public long getMunicipalityparm() {
        return municipalityparm;
    }

    public void setMunicipalityparm(long municipalityparm) {
        this.municipalityparm = municipalityparm;
    }

    public String getMunicipalityarabicnameparm() {
        return municipalityarabicnameparm;
    }

    public void setMunicipalityarabicnameparm(String municipalityarabicnameparm) {
        this.municipalityarabicnameparm = municipalityarabicnameparm;
    }

    public long getTerritoryparm() {
        return territoryparm;
    }

    public void setTerritoryparm(long territoryparm) {
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

    public int getMinvehiclecountparm() {
        return minvehiclecountparm;
    }

    public void setMinvehiclecountparm(int minvehiclecountparm) {
        this.minvehiclecountparm = minvehiclecountparm;
    }

    public int getMaxvehiclecountparm() {
        return maxvehiclecountparm;
    }

    public void setMaxvehiclecountparm(int maxvehiclecountparm) {
        this.maxvehiclecountparm = maxvehiclecountparm;
    }

    public String getBranchnameparm() {
        return branchnameparm;
    }

    public void setBranchnameparm(String branchnameparm) {
        this.branchnameparm = branchnameparm;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public int getPageindex() {
        return pageindex;
    }

    public void setPageindex(int pageindex) {
        this.pageindex = pageindex;
    }

    public int getSorttype() {
        return sorttype;
    }

    public void setSorttype(int sorttype) {
        this.sorttype = sorttype;
    }

    public String getSortby() {
        return sortby;
    }

    public void setSortby(String sortby) {
        this.sortby = sortby;
    }

    public int getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(int statusparm) {
        this.statusparm = statusparm;
    }
}
