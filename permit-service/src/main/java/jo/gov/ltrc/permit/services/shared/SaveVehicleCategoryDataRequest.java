package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveVehicleCategoryDataRequest {

    @ApiModelProperty("Vehicle Category ID Parameter") private Long vehiclecategoryidparm ;
    @ApiModelProperty("Vehicle Category Name Parameter") private String vehiclecategorynameparm ;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;

    public Long getVehiclecategoryidparm() {
        return vehiclecategoryidparm;
    }

    public void setVehiclecategoryidparm(long vehiclecategoryidparm) {
        this.vehiclecategoryidparm = vehiclecategoryidparm;
    }

    public String getVehiclecategorynameparm() {
        return vehiclecategorynameparm;
    }

    public void setVehiclecategorynameparm(String vehiclecategorynameparm) {
        this.vehiclecategorynameparm = vehiclecategorynameparm;
    }

    public Long getPrincepel() {
        return princepel;
    }

    public void setPrincepel(long princepel) {
        this.princepel = princepel;
    }

    public Integer getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(int statusparm) {
        this.statusparm = statusparm;
    }
}



