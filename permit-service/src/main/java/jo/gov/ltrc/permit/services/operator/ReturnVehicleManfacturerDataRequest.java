package jo.gov.ltrc.permit.services.operator;


import io.swagger.annotations.ApiModelProperty;

public class ReturnVehicleManfacturerDataRequest {

    @ApiModelProperty("Vehicle Manufacturer ID Parameter ") private Long vehiclemanfactureridparm ;
    @ApiModelProperty("Vehicle Manufacturer Arabic Name Parameter ") private String vehiclemanfacturerarabicnameparm ;
    @ApiModelProperty("Vehicle Manufacturer English Name Parameter ") private String vehiclemanfacturerenglishnameparm ;
    @ApiModelProperty("Vehicle Manufacturer Code Parameter ") private String vehiclemanfacturercodeparm ;

    public Long getVehiclemanfactureridparm() {
        return vehiclemanfactureridparm;
    }

    public void setVehiclemanfactureridparm(Long vehiclemanfactureridparm) {
        this.vehiclemanfactureridparm = vehiclemanfactureridparm;
    }

    public String getVehiclemanfacturerarabicnameparm() {
        return vehiclemanfacturerarabicnameparm;
    }

    public void setVehiclemanfacturerarabicnameparm(String vehiclemanfacturerarabicnameparm) {
        this.vehiclemanfacturerarabicnameparm = vehiclemanfacturerarabicnameparm;
    }

    public String getVehiclemanfacturerenglishnameparm() {
        return vehiclemanfacturerenglishnameparm;
    }

    public void setVehiclemanfacturerenglishnameparm(String vehiclemanfacturerenglishnameparm) {
        this.vehiclemanfacturerenglishnameparm = vehiclemanfacturerenglishnameparm;
    }

    public String getVehiclemanfacturercodeparm() {
        return vehiclemanfacturercodeparm;
    }

    public void setVehiclemanfacturercodeparm(String vehiclemanfacturercodeparm) {
        this.vehiclemanfacturercodeparm = vehiclemanfacturercodeparm;
    }

    @Override
    public String toString() {
        return "ReturnVehicleManfacturerDataRequest{" +
                "vehiclemanfactureridparm=" + vehiclemanfactureridparm +
                ", vehiclemanfacturerarabicnameparm= " + vehiclemanfacturerarabicnameparm + 
                ", vehiclemanfacturerenglishnameparm= " + vehiclemanfacturerenglishnameparm + 
                ", vehiclemanfacturercodeparm= " + vehiclemanfacturercodeparm + 
                '}';
    }
}
