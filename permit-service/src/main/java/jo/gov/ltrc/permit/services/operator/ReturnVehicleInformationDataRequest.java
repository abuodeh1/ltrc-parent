package jo.gov.ltrc.permit.services.operator;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;


public class ReturnVehicleInformationDataRequest {

    @ApiModelProperty("Registration Number Parameter") private String registrationnumberparm ;
    @ApiModelProperty("Plate Code Parameter") private String platecodeparm ;
    @ApiModelProperty("Plate Number Parameter") private String platenumberparm ;
    @ApiModelProperty("Manufacture Parameter") private Long manufacturerparm ;
    @ApiModelProperty("Office Name Parameter") private String officenameparm ;
    @ApiModelProperty("Vehicle Status Parameter") private Integer vehiclestatusparm ;
    @ApiModelProperty("Vehicle Category Parameter") private Long vehiclecategoryparm ;
    @ApiModelProperty("Fuel Type Parameter") private Long fueltypeparm ;
    @ApiModelProperty("Operator Parameter") private Long operatorparm ;
    @ApiModelProperty("Permit Status Parameter") private Integer permitstatusparm ;
    @ApiModelProperty("Permit Parameter") private Integer permitidparm ;
    @ApiModelProperty("Vehicle Entry Date Parameter") private Date vehicleentrydateparm ;
    @ApiModelProperty("Delivery Date Parameter") private Date deliverydateparm ;

    public String getRegistrationnumberparm() {
        return registrationnumberparm;
    }

    public void setRegistrationnumberparm(String registrationnumberparm) {
        this.registrationnumberparm = registrationnumberparm;
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

    public Long getManufacturerparm() {
        return manufacturerparm;
    }

    public void setManufacturerparm(Long manufacturerparm) {
        this.manufacturerparm = manufacturerparm;
    }

    public String getOfficenameparm() {
        return officenameparm;
    }

    public void setOfficenameparm(String officenameparm) {
        this.officenameparm = officenameparm;
    }

    public Integer getVehiclestatusparm() {
        return vehiclestatusparm;
    }

    public void setVehiclestatusparm(Integer vehiclestatusparm) {
        this.vehiclestatusparm = vehiclestatusparm;
    }

    public Long getVehiclecategoryparm() {
        return vehiclecategoryparm;
    }

    public void setVehiclecategoryparm(Long vehiclecategoryparm) {
        this.vehiclecategoryparm = vehiclecategoryparm;
    }

    public Long getFueltypeparm() {
        return fueltypeparm;
    }

    public void setFueltypeparm(Long fueltypeparm) {
        this.fueltypeparm = fueltypeparm;
    }

    public Long getOperatorparm() {
        return operatorparm;
    }

    public void setOperatorparm(Long operatorparm) {
        this.operatorparm = operatorparm;
    }

    public Integer getPermitstatusparm() {
        return permitstatusparm;
    }

    public void setPermitstatusparm(Integer permitstatusparm) {
        this.permitstatusparm = permitstatusparm;
    }

    public Integer getPermitidparm() {
        return permitidparm;
    }

    public void setPermitidparm(Integer permitidparm) {
        this.permitidparm = permitidparm;
    }

    public Date getVehicleentrydateparm() {
        return vehicleentrydateparm;
    }

    public void setVehicleentrydateparm(Date vehicleentrydateparm) {
        this.vehicleentrydateparm = vehicleentrydateparm;
    }

    public Date getDeliverydateparm() {
        return deliverydateparm;
    }

    public void setDeliverydateparm(Date deliverydateparm) {
        this.deliverydateparm = deliverydateparm;
    }

    @Override
    public String toString() {
        return "ReturnVehicleInformationDataRequest{" +
                "registrationnumberparm=" + registrationnumberparm +
                ", platecodeparm=" + platecodeparm +
                ", platenumberparm=" + platenumberparm +
                ", manufacturerparm=" + manufacturerparm +
                ", officenameparm=" + officenameparm +
                ", vehiclestatusparm=" + vehiclestatusparm +
                ", vehiclecategoryparm=" + vehiclecategoryparm +
                ", fueltypeparm=" + fueltypeparm +
                ", operatorparm=" + operatorparm +
                ", permitstatusparm=" + permitstatusparm +
                ", permitidparm=" + permitidparm +
                ", vehicleentrydateparm=" + vehicleentrydateparm +
                ", deliverydateparm=" + deliverydateparm +
                '}';
    }
}
