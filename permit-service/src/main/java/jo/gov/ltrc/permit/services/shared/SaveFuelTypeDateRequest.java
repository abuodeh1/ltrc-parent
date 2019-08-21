package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveFuelTypeDateRequest {

    @ApiModelProperty("Fuel Type ID Parameter ") private Long fueltypeidparm ;
    @ApiModelProperty("Fuel Type Name Parameter ") private String fueltypenameparm ;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;
    @ApiModelProperty("IP Address") private String ipaddressparm  ;

    public Long getFueltypeidparm() {
        return fueltypeidparm;
    }

    public void setFueltypeidparm(Long fueltypeidparm) {
        this.fueltypeidparm = fueltypeidparm;
    }

    public String getFueltypenameparm() {
        return fueltypenameparm;
    }

    public void setFueltypenameparm(String fueltypenameparm) {
        this.fueltypenameparm = fueltypenameparm;
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
        return "SaveFuelTypeDateRequest{" +
                "fueltypeidparm=" + fueltypeidparm +
                ", fueltypenameparm=" + fueltypenameparm +
                ", princepel=" + princepel +
                ", statusparm=" + statusparm +
                ", ipaddressparam=" + ipaddressparm +
                '}';
    }
}



