package jo.gov.ltrc.permit.services.operator;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class SaveVehicleDataRequest {

    @ApiModelProperty("Vehicle ID Parameter ") private long vehicleidparm ;
    @ApiModelProperty("Registration Number Parameter ") private String registrationnumberparm ;
    @ApiModelProperty("Plate Number Parameter ") private String platenumberparm ;
    @ApiModelProperty("Owner Parameter ") private String ownerparm ;
    @ApiModelProperty("Vehicle Category Parameter ") private long vehiclecategoryparm ;
    @ApiModelProperty("Operation Parameter ") private String operationparm ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;
    @ApiModelProperty("Remarks Parameter ") private String remarksparm ;
    @ApiModelProperty("Year of Manufacture Parameter ") private int yearofmanufactureparm ;
    @ApiModelProperty("Passengers Number Parameter ") private int passengersnumberparm ;
    @ApiModelProperty("Manufacture Parameter ") private String manufacturerparm ;
    @ApiModelProperty("Owner Name Parameter ") private String ownernameparm ;
    @ApiModelProperty("License Expiration Parameter ") private Date licenseexpirationparm ;
    @ApiModelProperty("Additional Descriptions Parameter ") private String addtionaldescriptionsparm ;
    @ApiModelProperty("Plate Code Parameter ") private String platecodeparm ;
    @ApiModelProperty("Fees Status Parameter ") private int feesstatusparm ;
    @ApiModelProperty("Office ID Parameter ") private long officeidparm ;
    @ApiModelProperty("Office Name Parameter ") private String officenameparm ;
    @ApiModelProperty("Vehicle Permit Parameter ") private long vehiclepermitparm ;
    @ApiModelProperty("Fuel Type Parameter ") private long fueltypeparm ;
    @ApiModelProperty("Vehicle Entry Date Parameter ") private Date vehicleentrydateparm ;
    @ApiModelProperty("Operator Parameter ") private long operatorparm ;
    @ApiModelProperty("Owner National ID Parameter ") private String ownernationalidparm ;
    @ApiModelProperty("Principal Parameter ") private long princepel ;

    public long getVehicleidparm() {
        return vehicleidparm;
    }

    public void setVehicleidparm(long vehicleidparm) {
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

    public long getVehiclecategoryparm() {
        return vehiclecategoryparm;
    }

    public void setVehiclecategoryparm(long vehiclecategoryparm) {
        this.vehiclecategoryparm = vehiclecategoryparm;
    }

    public String getOperationparm() {
        return operationparm;
    }

    public void setOperationparm(String operationparm) {
        this.operationparm = operationparm;
    }

    public int getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(int statusparm) {
        this.statusparm = statusparm;
    }

    public String getRemarksparm() {
        return remarksparm;
    }

    public void setRemarksparm(String remarksparm) {
        this.remarksparm = remarksparm;
    }

    public int getYearofmanufactureparm() {
        return yearofmanufactureparm;
    }

    public void setYearofmanufactureparm(int yearofmanufactureparm) {
        this.yearofmanufactureparm = yearofmanufactureparm;
    }

    public int getPassengersnumberparm() {
        return passengersnumberparm;
    }

    public void setPassengersnumberparm(int passengersnumberparm) {
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

    public int getFeesstatusparm() {
        return feesstatusparm;
    }

    public void setFeesstatusparm(int feesstatusparm) {
        this.feesstatusparm = feesstatusparm;
    }

    public long getOfficeidparm() {
        return officeidparm;
    }

    public void setOfficeidparm(long officeidparm) {
        this.officeidparm = officeidparm;
    }

    public String getOfficenameparm() {
        return officenameparm;
    }

    public void setOfficenameparm(String officenameparm) {
        this.officenameparm = officenameparm;
    }

    public long getVehiclepermitparm() {
        return vehiclepermitparm;
    }

    public void setVehiclepermitparm(long vehiclepermitparm) {
        this.vehiclepermitparm = vehiclepermitparm;
    }

    public long getFueltypeparm() {
        return fueltypeparm;
    }

    public void setFueltypeparm(long fueltypeparm) {
        this.fueltypeparm = fueltypeparm;
    }

    public Date getVehicleentrydateparm() {
        return vehicleentrydateparm;
    }

    public void setVehicleentrydateparm(Date vehicleentrydateparm) {
        this.vehicleentrydateparm = vehicleentrydateparm;
    }

    public long getOperatorparm() {
        return operatorparm;
    }

    public void setOperatorparm(long operatorparm) {
        this.operatorparm = operatorparm;
    }

    public String getOwnernationalidparm() {
        return ownernationalidparm;
    }

    public void setOwnernationalidparm(String ownernationalidparm) {
        this.ownernationalidparm = ownernationalidparm;
    }

    public long getPrincepel() {
        return princepel;
    }

    public void setPrincepel(long princepel) {
        this.princepel = princepel;
    }
}
