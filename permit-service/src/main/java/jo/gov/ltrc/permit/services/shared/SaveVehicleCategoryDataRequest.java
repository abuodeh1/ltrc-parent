package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveVehicleCategoryDataRequest {

    @ApiModelProperty("Vehicle Category ID Parameter") private Long vehiclecategoryidparm ;
    @ApiModelProperty("Vehicle Category Name Parameter") private String vehiclecategorynameparm ;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;
    @ApiModelProperty("IP Address") private String ipaddressparm  ;

    public Long getVehiclecategoryidparm() {
        return vehiclecategoryidparm;
    }

    public void setVehiclecategoryidparm(Long vehiclecategoryidparm) {
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

    public void setPrincepel(Long princepel) {
        this.princepel = princepel;
    }

    public Integer getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(Integer statusparm) {
        this.statusparm = statusparm;
    }

    public String getIpaddressparm() {
        return ipaddressparm;
    }

    public void setIpaddressparm(String ipaddressparm) {
        this.ipaddressparm = ipaddressparm;
    }

    @Override
    public String toString() {
        return "SaveVehicleCategoryDataRequest{" +
                "vehiclecategoryidparm=" + vehiclecategoryidparm +
                ", vehiclecategorynameparm= " + vehiclecategorynameparm + 
                ", princepel=" + princepel +
                ", statusparm=" + statusparm +
                ", ipaddressparm= " + ipaddressparm + 
                '}';
    }
}



