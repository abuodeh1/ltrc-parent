package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveVehicleUsagePurposeDataRequest {

    @ApiModelProperty("Usage Purpose ID Parameter ") private Long usagepurposeidparm ;
    @ApiModelProperty("Usage Purpose Name Parameter ") private String usagepurposenameparm ;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;
    @ApiModelProperty("IP Address") private String ipaddressparm  ;

    public Long getUsagepurposeidparm() {
        return usagepurposeidparm;
    }

    public void setUsagepurposeidparm(Long usagepurposeidparm) {
        this.usagepurposeidparm = usagepurposeidparm;
    }

    public String getUsagepurposenameparm() {
        return usagepurposenameparm;
    }

    public void setUsagepurposenameparm(String usagepurposenameparm) {
        this.usagepurposenameparm = usagepurposenameparm;
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
        return "SaveVehicleUsagePurposeDataRequest{" +
                "usagepurposeidparm=" + usagepurposeidparm +
                ", usagepurposenameparm= " + usagepurposenameparm + 
                ", princepel=" + princepel +
                ", statusparm=" + statusparm +
                ", ipaddressparm= " + ipaddressparm + 
                '}';
    }
}



