package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveLicensePuurposeDataRequest {

    @ApiModelProperty("License Purpose ID Parameter ") private Long licensepurposeidparm ;
    @ApiModelProperty("License Purpose Name Parameter ") private String licensepurposenameparm ;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;
    @ApiModelProperty("IP Address") private String ipaddressparm  ;

    public Long getLicensepurposeidparm() {
        return licensepurposeidparm;
    }

    public void setLicensepurposeidparm(Long licensepurposeidparm) {
        this.licensepurposeidparm = licensepurposeidparm;
    }

    public String getLicensepurposenameparm() {
        return licensepurposenameparm;
    }

    public void setLicensepurposenameparm(String licensepurposenameparm) {
        this.licensepurposenameparm = licensepurposenameparm;
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
        return "SaveLicensePuurposeDataRequest{" +
                "licensepurposeidparm=" + licensepurposeidparm +
                ", licensepurposenameparm= " + licensepurposenameparm + 
                ", princepel=" + princepel +
                ", statusparm=" + statusparm +
                ", ipaddressparm= " + ipaddressparm + 
                '}';
    }
}



