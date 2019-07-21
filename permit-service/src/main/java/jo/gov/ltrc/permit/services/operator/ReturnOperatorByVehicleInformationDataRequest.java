package jo.gov.ltrc.permit.services.operator;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class ReturnOperatorByVehicleInformationDataRequest {

    @ApiModelProperty("Registration Number Parameter ") private String registrationnumberparm ;
    @ApiModelProperty("Permit Status Parameter ") private int permitstatusparm ;
    @ApiModelProperty("Plate Code Parameter ") private String platecodeparm ;
    @ApiModelProperty("Plate Number Parameter ") private String platenumberparm ;
    @ApiModelProperty("Minimum Delivery Date Parameter ") private Date mindeliverydateparm ;
    @ApiModelProperty("Maximum Delivery Date Parameter ") private Date maxdeliverydateparm ;
    @ApiModelProperty("Vehicle Category Parameter ") private long vehiclecategoryparm ;
    @ApiModelProperty("Manufacture Parameter ") private String manufacturerparm ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;
    @ApiModelProperty("Fees Status Parameter ") private int feesstatusparm ;
    @ApiModelProperty("Usage Purpose Parameter ") private long usagepurposeparm ;
    @ApiModelProperty("Minimum License Expiration Parameter ") private Date minlicenseexpirationparm ;
    @ApiModelProperty("Maximum License Expiration Parameter ") private Date maxlicenseexpirationparm ;
    @ApiModelProperty("Minimum Year of Manufacture Parameter ") private int minyearofmanufactureparm ;
    @ApiModelProperty("Maximum Year of Manufacture Parameter ") private int maxyearofmanufactureparm ;
    @ApiModelProperty("Minimum Passenger Number Parameter ") private int minpassengersnumberparm ;
    @ApiModelProperty("Maximum Passenger Number Parameter ") private int maxpassengersnumberparm ;
    @ApiModelProperty("Owner Parameter ") private String ownerparm ;
    @ApiModelProperty("Owner Name Parameter ") private String ownernameparm ;
    @ApiModelProperty("Fuel Type Parameter ") private long fueltypeparm ;
    @ApiModelProperty("Additional Descriptions Parameter ") private String addtionaldescriptionsparm ;
    @ApiModelProperty("Page Size Parameter ") private int pagesize ;
    @ApiModelProperty("Page Index Parameter ") private int pageindex ;
    @ApiModelProperty("Sort Type Parameter ") private int sorttype ;
    @ApiModelProperty("Sort By Parameter ") private String sortby ;


    public String getRegistrationnumberparm() {
        return registrationnumberparm;
    }

    public void setRegistrationnumberparm(String registrationnumberparm) {
        this.registrationnumberparm = registrationnumberparm;
    }

    public int getPermitstatusparm() {
        return permitstatusparm;
    }

    public void setPermitstatusparm(int permitstatusparm) {
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

    public long getVehiclecategoryparm() {
        return vehiclecategoryparm;
    }

    public void setVehiclecategoryparm(long vehiclecategoryparm) {
        this.vehiclecategoryparm = vehiclecategoryparm;
    }

    public String getManufacturerparm() {
        return manufacturerparm;
    }

    public void setManufacturerparm(String manufacturerparm) {
        this.manufacturerparm = manufacturerparm;
    }

    public int getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(int statusparm) {
        this.statusparm = statusparm;
    }

    public int getFeesstatusparm() {
        return feesstatusparm;
    }

    public void setFeesstatusparm(int feesstatusparm) {
        this.feesstatusparm = feesstatusparm;
    }

    public long getUsagepurposeparm() {
        return usagepurposeparm;
    }

    public void setUsagepurposeparm(long usagepurposeparm) {
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

    public int getMinyearofmanufactureparm() {
        return minyearofmanufactureparm;
    }

    public void setMinyearofmanufactureparm(int minyearofmanufactureparm) {
        this.minyearofmanufactureparm = minyearofmanufactureparm;
    }

    public int getMaxyearofmanufactureparm() {
        return maxyearofmanufactureparm;
    }

    public void setMaxyearofmanufactureparm(int maxyearofmanufactureparm) {
        this.maxyearofmanufactureparm = maxyearofmanufactureparm;
    }

    public int getMinpassengersnumberparm() {
        return minpassengersnumberparm;
    }

    public void setMinpassengersnumberparm(int minpassengersnumberparm) {
        this.minpassengersnumberparm = minpassengersnumberparm;
    }

    public int getMaxpassengersnumberparm() {
        return maxpassengersnumberparm;
    }

    public void setMaxpassengersnumberparm(int maxpassengersnumberparm) {
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

    public long getFueltypeparm() {
        return fueltypeparm;
    }

    public void setFueltypeparm(long fueltypeparm) {
        this.fueltypeparm = fueltypeparm;
    }

    public String getAddtionaldescriptionsparm() {
        return addtionaldescriptionsparm;
    }

    public void setAddtionaldescriptionsparm(String addtionaldescriptionsparm) {
        this.addtionaldescriptionsparm = addtionaldescriptionsparm;
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
}
