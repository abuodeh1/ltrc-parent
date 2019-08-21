package jo.gov.ltrc.permit.services.operator;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class SaveVehicleDataRequest {

    @ApiModelProperty("Vehicle ID Parameter ") private Long vehicleidparm ;
    @ApiModelProperty("Registration Number Parameter ") private String registrationnumberparm ;
    @ApiModelProperty("Plate Number Parameter ") private String platenumberparm ;
    @ApiModelProperty("Owner Parameter ") private String ownerparm ;
    @ApiModelProperty("Vehicle Category Parameter ") private Long vehiclecategoryparm ;
    @ApiModelProperty("Operation Parameter ") private String operationparm ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;
    @ApiModelProperty("Remarks Parameter ") private String remarksparm ;
    @ApiModelProperty("Year of Manufacture Parameter ") private Integer yearofmanufactureparm ;
    @ApiModelProperty("Passengers Number Parameter ") private Integer passengersnumberparm ;
    @ApiModelProperty("Manufacture Parameter ") private String manufacturerparm ;
    @ApiModelProperty("Owner Name Parameter ") private String ownernameparm ;
    @ApiModelProperty("License Expiration Parameter ") private Date licenseexpirationparm ;
    @ApiModelProperty("Additional Descriptions Parameter ") private String addtionaldescriptionsparm ;
    @ApiModelProperty("Plate Code Parameter ") private String platecodeparm ;
    @ApiModelProperty("Fees Status Parameter ") private Integer feesstatusparm ;
    @ApiModelProperty("Office ID Parameter ") private Long officeidparm ;
    @ApiModelProperty("Office Name Parameter ") private String officenameparm ;
    @ApiModelProperty("Vehicle Permit Parameter ") private Long vehiclepermitparm ;
    @ApiModelProperty("Fuel Type Parameter ") private Long fueltypeparm ;
    @ApiModelProperty("Vehicle Entry Date Parameter ") private Date vehicleentrydateparm ;
    @ApiModelProperty("Operator Parameter ") private Long operatorparm ;
    @ApiModelProperty("Owner National ID Parameter ") private String ownernationalidparm ;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("IP Address") private String ipaddressparm  ;

    public Long getVehicleidparm() {
        return vehicleidparm;
    }

    public void setVehicleidparm(Long vehicleidparm) {
        this.vehicleidparm = vehicleidparm;
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

    public String getOwnerparm() {
        return ownerparm;
    }

    public void setOwnerparm(String ownerparm) {
        this.ownerparm = ownerparm;
    }

    public Long getVehiclecategoryparm() {
        return vehiclecategoryparm;
    }

    public void setVehiclecategoryparm(Long vehiclecategoryparm) {
        this.vehiclecategoryparm = vehiclecategoryparm;
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

    public String getManufacturerparm() {
        return manufacturerparm;
    }

    public void setManufacturerparm(String manufacturerparm) {
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

    public Long getVehiclepermitparm() {
        return vehiclepermitparm;
    }

    public void setVehiclepermitparm(Long vehiclepermitparm) {
        this.vehiclepermitparm = vehiclepermitparm;
    }

    public Long getFueltypeparm() {
        return fueltypeparm;
    }

    public void setFueltypeparm(Long fueltypeparm) {
        this.fueltypeparm = fueltypeparm;
    }

    public Date getVehicleentrydateparm() {
        return vehicleentrydateparm;
    }

    public void setVehicleentrydateparm(Date vehicleentrydateparm) {
        this.vehicleentrydateparm = vehicleentrydateparm;
    }

    public Long getOperatorparm() {
        return operatorparm;
    }

    public void setOperatorparm(Long operatorparm) {
        this.operatorparm = operatorparm;
    }

    public String getOwnernationalidparm() {
        return ownernationalidparm;
    }

    public void setOwnernationalidparm(String ownernationalidparm) {
        this.ownernationalidparm = ownernationalidparm;
    }

    public Long getPrincepel() {
        return princepel;
    }

    public void setPrincepel(Long princepel) {
        this.princepel = princepel;
    }

    public String getIpaddressparm() {
        return ipaddressparm;
    }

    public void setIpaddressparm(String ipaddressparm) {
        this.ipaddressparm = ipaddressparm;
    }

    @Override
    public String toString() {
        return "SaveVehicleDataRequest{" +
                "vehicleidparm=" + vehicleidparm +
                ", registrationnumberparm=" + registrationnumberparm +
                ", platenumberparm=" + platenumberparm +
                ", ownerparm=" + ownerparm +
                ", vehiclecategoryparm=" + vehiclecategoryparm +
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
                ", vehiclepermitparm=" + vehiclepermitparm +
                ", fueltypeparm=" + fueltypeparm +
                ", vehicleentrydateparm=" + vehicleentrydateparm +
                ", operatorparm=" + operatorparm +
                ", ownernationalidparm=" + ownernationalidparm +
                ", princepel=" + princepel +
                ", ipaddressparam=" + ipaddressparm +
                '}';
    }
}
