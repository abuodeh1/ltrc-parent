package jo.gov.ltrc.permit.services.operator;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class ReturnOperatorByVehicleInformationDataRequest {

    @ApiModelProperty("Registration Number Parameter ") private String registrationnumberparm ;
    @ApiModelProperty("Permit Status Parameter ") private Integer permitstatusparm ;
    @ApiModelProperty("Plate Code Parameter ") private String platecodeparm ;
    @ApiModelProperty("Plate Number Parameter ") private String platenumberparm ;
    @ApiModelProperty("Minimum Delivery Date Parameter ") private Date mindeliverydateparm ;
    @ApiModelProperty("Maximum Delivery Date Parameter ") private Date maxdeliverydateparm ;
    @ApiModelProperty("Vehicle Category Parameter ") private Long vehiclecategoryparm ;
    @ApiModelProperty("Manufacture Parameter ") private String manufacturerparm ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;
    @ApiModelProperty("Fees Status Parameter ") private Integer feesstatusparm ;
    @ApiModelProperty("Usage Purpose Parameter ") private Long usagepurposeparm ;
    @ApiModelProperty("Minimum License Expiration Parameter ") private Date minlicenseexpirationparm ;
    @ApiModelProperty("Maximum License Expiration Parameter ") private Date maxlicenseexpirationparm ;
    @ApiModelProperty("Minimum Year of Manufacture Parameter ") private Integer minyearofmanufactureparm ;
    @ApiModelProperty("Maximum Year of Manufacture Parameter ") private Integer maxyearofmanufactureparm ;
    @ApiModelProperty("Minimum Passenger Number Parameter ") private Integer minpassengersnumberparm ;
    @ApiModelProperty("Maximum Passenger Number Parameter ") private Integer maxpassengersnumberparm ;
    @ApiModelProperty("Owner Parameter ") private String ownerparm ;
    @ApiModelProperty("Owner Name Parameter ") private String ownernameparm ;
    @ApiModelProperty("Fuel Type Parameter ") private Long fueltypeparm ;
    @ApiModelProperty("Additional Descriptions Parameter ") private String addtionaldescriptionsparm ;
    @ApiModelProperty("Page Size Parameter ") private Integer pagesize ;
    @ApiModelProperty("Page Index Parameter ") private Integer pageindex ;
    @ApiModelProperty("Sort Type Parameter ") private Integer sorttype ;
    @ApiModelProperty("Sort By Parameter ") private String sortby ;

    
    public String getRegistrationnumberparm() {
        return registrationnumberparm;
    }

    public void setRegistrationnumberparm(String registrationnumberparm) {
        this.registrationnumberparm = registrationnumberparm;
    }

    public Integer getPermitstatusparm() {
        return permitstatusparm;
    }

    public void setPermitstatusparm(Integer permitstatusparm) {
        this.permitstatusparm = permitstatusparm;
    }

    public String getPlatecodeparm() {
        return platecodeparm;
    }

    public void setPlatecodeparm(String platecodeparm) {
        this.platecodeparm = platecodeparm;
    }

    public String getPlatenumberparm() {
        return platenumberparm;
    }

    public void setPlatenumberparm(String platenumberparm) {
        this.platenumberparm = platenumberparm;
    }

    public Date getMindeliverydateparm() {
        return mindeliverydateparm;
    }

    public void setMindeliverydateparm(Date mindeliverydateparm) {
        this.mindeliverydateparm = mindeliverydateparm;
    }

    public Date getMaxdeliverydateparm() {
        return maxdeliverydateparm;
    }

    public void setMaxdeliverydateparm(Date maxdeliverydateparm) {
        this.maxdeliverydateparm = maxdeliverydateparm;
    }

    public Long getVehiclecategoryparm() {
        return vehiclecategoryparm;
    }

    public void setVehiclecategoryparm(Long vehiclecategoryparm) {
        this.vehiclecategoryparm = vehiclecategoryparm;
    }

    public String getManufacturerparm() {
        return manufacturerparm;
    }

    public void setManufacturerparm(String manufacturerparm) {
        this.manufacturerparm = manufacturerparm;
    }

    public Integer getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(Integer statusparm) {
        this.statusparm = statusparm;
    }

    public Integer getFeesstatusparm() {
        return feesstatusparm;
    }

    public void setFeesstatusparm(Integer feesstatusparm) {
        this.feesstatusparm = feesstatusparm;
    }

    public Long getUsagepurposeparm() {
        return usagepurposeparm;
    }

    public void setUsagepurposeparm(Long usagepurposeparm) {
        this.usagepurposeparm = usagepurposeparm;
    }

    public Date getMinlicenseexpirationparm() {
        return minlicenseexpirationparm;
    }

    public void setMinlicenseexpirationparm(Date minlicenseexpirationparm) {
        this.minlicenseexpirationparm = minlicenseexpirationparm;
    }

    public Date getMaxlicenseexpirationparm() {
        return maxlicenseexpirationparm;
    }

    public void setMaxlicenseexpirationparm(Date maxlicenseexpirationparm) {
        this.maxlicenseexpirationparm = maxlicenseexpirationparm;
    }

    public Integer getMinyearofmanufactureparm() {
        return minyearofmanufactureparm;
    }

    public void setMinyearofmanufactureparm(Integer minyearofmanufactureparm) {
        this.minyearofmanufactureparm = minyearofmanufactureparm;
    }

    public Integer getMaxyearofmanufactureparm() {
        return maxyearofmanufactureparm;
    }

    public void setMaxyearofmanufactureparm(Integer maxyearofmanufactureparm) {
        this.maxyearofmanufactureparm = maxyearofmanufactureparm;
    }

    public Integer getMinpassengersnumberparm() {
        return minpassengersnumberparm;
    }

    public void setMinpassengersnumberparm(Integer minpassengersnumberparm) {
        this.minpassengersnumberparm = minpassengersnumberparm;
    }

    public Integer getMaxpassengersnumberparm() {
        return maxpassengersnumberparm;
    }

    public void setMaxpassengersnumberparm(Integer maxpassengersnumberparm) {
        this.maxpassengersnumberparm = maxpassengersnumberparm;
    }

    public String getOwnerparm() {
        return ownerparm;
    }

    public void setOwnerparm(String ownerparm) {
        this.ownerparm = ownerparm;
    }

    public String getOwnernameparm() {
        return ownernameparm;
    }

    public void setOwnernameparm(String ownernameparm) {
        this.ownernameparm = ownernameparm;
    }

    public Long getFueltypeparm() {
        return fueltypeparm;
    }

    public void setFueltypeparm(Long fueltypeparm) {
        this.fueltypeparm = fueltypeparm;
    }

    public String getAddtionaldescriptionsparm() {
        return addtionaldescriptionsparm;
    }

    public void setAddtionaldescriptionsparm(String addtionaldescriptionsparm) {
        this.addtionaldescriptionsparm = addtionaldescriptionsparm;
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

    @Override
    public String toString() {
        return "ReturnOperatorByVehicleInformationDataRequest{" +
                "registrationnumberparm=" + registrationnumberparm +
                ", permitstatusparm=" + permitstatusparm +
                ", platecodeparm=" + platecodeparm +
                ", platenumberparm=" + platenumberparm +
                ", mindeliverydateparm=" + mindeliverydateparm +
                ", maxdeliverydateparm=" + maxdeliverydateparm +
                ", vehiclecategoryparm=" + vehiclecategoryparm +
                ", manufacturerparm=" + manufacturerparm +
                ", statusparm=" + statusparm +
                ", feesstatusparm=" + feesstatusparm +
                ", usagepurposeparm=" + usagepurposeparm +
                ", minlicenseexpirationparm=" + minlicenseexpirationparm +
                ", maxlicenseexpirationparm=" + maxlicenseexpirationparm +
                ", minyearofmanufactureparm=" + minyearofmanufactureparm +
                ", maxyearofmanufactureparm=" + maxyearofmanufactureparm +
                ", minpassengersnumberparm=" + minpassengersnumberparm +
                ", maxpassengersnumberparm=" + maxpassengersnumberparm +
                ", ownerparm=" + ownerparm +
                ", ownernameparm=" + ownernameparm +
                ", fueltypeparm=" + fueltypeparm +
                ", addtionaldescriptionsparm=" + addtionaldescriptionsparm +
                ", pagesize=" + pagesize +
                ", pageindex=" + pageindex +
                ", sorttype=" + sorttype +
                ", sortby=" + sortby +
                '}';
    }
}
