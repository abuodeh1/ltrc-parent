package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveVehicleCategoryDataRequest {

    @ApiModelProperty("Vehicle Category ID Parameter") private long vehiclecategoryidparm ;
    @ApiModelProperty("Vehicle Category Name Parameter") private String vehiclecategorynameparm ;
    @ApiModelProperty("Principal Parameter ") private long princepel ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;

    public long getVehiclecategoryidparm() {
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

    public long getPrincepel() {
        return princepel;
    }

    public void setPrincepel(long princepel) {
        this.princepel = princepel;
    }

    public int getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(int statusparm) {
        this.statusparm = statusparm;
    }
}



