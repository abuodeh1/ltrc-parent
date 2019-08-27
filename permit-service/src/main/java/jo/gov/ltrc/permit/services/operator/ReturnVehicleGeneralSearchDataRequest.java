package jo.gov.ltrc.permit.services.operator;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class ReturnVehicleGeneralSearchDataRequest {

    @ApiModelProperty("Minimum Vehicle ID Parameter ") private Long minvehicleidparm ;
    @ApiModelProperty("Maximum Vehicle ID Parameter ") private Long maxvehicleidparm ;
    @ApiModelProperty("Registration Number Parameter ") private String registrationnumberparm ;
    @ApiModelProperty("Plate Number Parameter ") private String platenumberparm ;
    @ApiModelProperty("Vehicle Category Parameter ") private Long vehiclecategoryparm ;
    @ApiModelProperty("Vehicle Category Name Parameter ") private String vehiclecategorynameparm ;
    @ApiModelProperty("Operation Parameter ") private String operationparm ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;
    @ApiModelProperty("Remarks Parameter ") private String remarksparm ;
    @ApiModelProperty("Year of Manufacture Parameter ") private Integer yearofmanufactureparm ;
    @ApiModelProperty("Passengers Number Parameter ") private Integer passengersnumberparm ;
    @ApiModelProperty("Manufacture Parameter ") private Long manufacturerparm ;
    @ApiModelProperty("Owner Name Parameter ") private String ownernameparm ;
    @ApiModelProperty("License Expiration Parameter ") private Date licenseexpirationparm ;
    @ApiModelProperty("Additional Descriptions Parameter ") private String addtionaldescriptionsparm ;
    @ApiModelProperty("Plate Code Parameter ") private String platecodeparm ;
    @ApiModelProperty("Fees Status Parameter ") private Integer feesstatusparm ;
    @ApiModelProperty("Office ID Parameter ") private Long officeidparm ;
    @ApiModelProperty("Office Name Parameter ") private String officenameparm ;
    @ApiModelProperty("Fuel Type Parameter ") private Long fueltypeparm ;
    @ApiModelProperty("Fuel Type Name Parameter ") private String fueltypenameparm ;
    @ApiModelProperty("Vehicle Entry date Parameter ") private Date vehicleentrydateparm ;
    @ApiModelProperty("Owner Parameter ") private String ownerparm ;
    @ApiModelProperty("Operator Parameter ") private Long operatorparm ;
    @ApiModelProperty("Vehicle Permit Parameter ") private Long vehiclepermitparm ;
    @ApiModelProperty("Operator Name Parameter ") private String operatornameparm ;
    @ApiModelProperty("Page Size Parameter ") private Integer pagesize ;
    @ApiModelProperty("Page Index Parameter ") private Integer pageindex ;
    @ApiModelProperty("Sort Type Parameter ") private Integer sorttype ;
    @ApiModelProperty("Sort By Parameter ") private String sortby ;

    public Long getMinvehicleidparm() {
        return minvehicleidparm;
    }

    public void setMinvehicleidparm(Long minvehicleidparm) {
        this.minvehicleidparm = minvehicleidparm;
    }

    public Long getMaxvehicleidparm() {
        return maxvehicleidparm;
    }

    public void setMaxvehicleidparm(Long maxvehicleidparm) {
        this.maxvehicleidparm = maxvehicleidparm;
    }

    public String getRegistrationnumberparm() {
        return registrationnumberparm;
    }

    public void setRegistrationnumberparm(String registrationnumberparm) {
        this.registrationnumberparm = registrationnumberparm;
    }

    public String getPlatenumberparm() {
        return platenumberparm;
    }

    public void setPlatenumberparm(String platenumberparm) {
        this.platenumberparm = platenumberparm;
    }

    public Long getVehiclecategoryparm() {
        return vehiclecategoryparm;
    }

    public void setVehiclecategoryparm(Long vehiclecategoryparm) {
        this.vehiclecategoryparm = vehiclecategoryparm;
    }

    public String getVehiclecategorynameparm() {
        return vehiclecategorynameparm;
    }

    public void setVehiclecategorynameparm(String vehiclecategorynameparm) {
        this.vehiclecategorynameparm = vehiclecategorynameparm;
    }

    public String getOperationparm() {
        return operationparm;
    }

    public void setOperationparm(String operationparm) {
        this.operationparm = operationparm;
    }

    public Integer getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(Integer statusparm) {
        this.statusparm = statusparm;
    }

    public String getRemarksparm() {
        return remarksparm;
    }

    public void setRemarksparm(String remarksparm) {
        this.remarksparm = remarksparm;
    }

    public Integer getYearofmanufactureparm() {
        return yearofmanufactureparm;
    }

    public void setYearofmanufactureparm(Integer yearofmanufactureparm) {
        this.yearofmanufactureparm = yearofmanufactureparm;
    }

    public Integer getPassengersnumberparm() {
        return passengersnumberparm;
    }

    public void setPassengersnumberparm(Integer passengersnumberparm) {
        this.passengersnumberparm = passengersnumberparm;
    }

    public Long getManufacturerparm() {
        return manufacturerparm;
    }

    public void setManufacturerparm(Long manufacturerparm) {
        this.manufacturerparm = manufacturerparm;
    }

    public String getOwnernameparm() {
        return ownernameparm;
    }

    public void setOwnernameparm(String ownernameparm) {
        this.ownernameparm = ownernameparm;
    }

    public Date getLicenseexpirationparm() {
        return licenseexpirationparm;
    }

    public void setLicenseexpirationparm(Date licenseexpirationparm) {
        this.licenseexpirationparm = licenseexpirationparm;
    }

    public String getAddtionaldescriptionsparm() {
        return addtionaldescriptionsparm;
    }

    public void setAddtionaldescriptionsparm(String addtionaldescriptionsparm) {
        this.addtionaldescriptionsparm = addtionaldescriptionsparm;
    }

    public String getPlatecodeparm() {
        return platecodeparm;
    }

    public void setPlatecodeparm(String platecodeparm) {
        this.platecodeparm = platecodeparm;
    }

    public Integer getFeesstatusparm() {
        return feesstatusparm;
    }

    public void setFeesstatusparm(Integer feesstatusparm) {
        this.feesstatusparm = feesstatusparm;
    }

    public Long getOfficeidparm() {
        return officeidparm;
    }

    public void setOfficeidparm(Long officeidparm) {
        this.officeidparm = officeidparm;
    }

    public String getOfficenameparm() {
        return officenameparm;
    }

    public void setOfficenameparm(String officenameparm) {
        this.officenameparm = officenameparm;
    }

    public Long getFueltypeparm() {
        return fueltypeparm;
    }

    public void setFueltypeparm(Long fueltypeparm) {
        this.fueltypeparm = fueltypeparm;
    }

    public String getFueltypenameparm() {
        return fueltypenameparm;
    }

    public void setFueltypenameparm(String fueltypenameparm) {
        this.fueltypenameparm = fueltypenameparm;
    }

    public Date getVehicleentrydateparm() {
        return vehicleentrydateparm;
    }

    public void setVehicleentrydateparm(Date vehicleentrydateparm) {
        this.vehicleentrydateparm = vehicleentrydateparm;
    }

    public String getOwnerparm() {
        return ownerparm;
    }

    public void setOwnerparm(String ownerparm) {
        this.ownerparm = ownerparm;
    }

    public Long getOperatorparm() {
        return operatorparm;
    }

    public void setOperatorparm(Long operatorparm) {
        this.operatorparm = operatorparm;
    }

    public Long getVehiclepermitparm() {
        return vehiclepermitparm;
    }

    public void setVehiclepermitparm(Long vehiclepermitparm) {
        this.vehiclepermitparm = vehiclepermitparm;
    }

    public String getOperatornameparm() {
        return operatornameparm;
    }

    public void setOperatornameparm(String operatornameparm) {
        this.operatornameparm = operatornameparm;
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
        return "ReturnVehicleGeneralSearchDataRequest{" +
                "minvehicleidparm=" + minvehicleidparm +
                ", maxvehicleidparm=" + maxvehicleidparm +
                ", registrationnumberparm=" + registrationnumberparm +
                ", platenumberparm=" + platenumberparm +
                ", vehiclecategoryparm=" + vehiclecategoryparm +
                ", vehiclecategorynameparm=" + vehiclecategorynameparm +
                ", operationparm=" + operationparm +
                ", statusparm=" + statusparm +
                ", remarksparm=" + remarksparm +
                ", yearofmanufactureparm=" + yearofmanufactureparm +
                ", passengersnumberparm=" + passengersnumberparm +
                ", manufacturerparm=" + manufacturerparm +
                ", ownernameparm=" + ownernameparm +
                ", licenseexpirationparm=" + licenseexpirationparm +
                ", addtionaldescriptionsparm=" + addtionaldescriptionsparm +
                ", platecodeparm=" + platecodeparm +
                ", feesstatusparm=" + feesstatusparm +
                ", officeidparm=" + officeidparm +
                ", officenameparm=" + officenameparm +
                ", fueltypeparm=" + fueltypeparm +
                ", fueltypenameparm=" + fueltypenameparm +
                ", vehicleentrydateparm=" + vehicleentrydateparm +
                ", ownerparm=" + ownerparm +
                ", operatorparm=" + operatorparm +
                ", vehiclepermitparm=" + vehiclepermitparm +
                ", operatornameparm=" + operatornameparm +
                ", pagesize=" + pagesize +
                ", pageindex=" + pageindex +
                ", sorttype=" + sorttype +
                ", sortby=" + sortby +
                '}';
    }
}
