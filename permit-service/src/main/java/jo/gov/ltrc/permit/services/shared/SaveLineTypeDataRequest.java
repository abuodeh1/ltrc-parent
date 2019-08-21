package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveLineTypeDataRequest {

    @ApiModelProperty("Line Type ID Parameter ") private Long linetypeidparm ;
    @ApiModelProperty("Line Type Name Parameter ") private String linetypenameparm ;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;
    @ApiModelProperty("IP Address") private String ipaddressparm  ;

    public Long getLinetypeidparm() {
        return linetypeidparm;
    }

    public void setLinetypeidparm(Long linetypeidparm) {
        this.linetypeidparm = linetypeidparm;
    }

    public String getLinetypenameparm() {
        return linetypenameparm;
    }

    public void setLinetypenameparm(String linetypenameparm) {
        this.linetypenameparm = linetypenameparm;
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
        return "SaveLineTypeDataRequest{" +
                "linetypeidparm=" + linetypeidparm +
                ", linetypenameparm=" + linetypenameparm +
                ", princepel=" + princepel +
                ", statusparm=" + statusparm +
                ", ipaddressparam=" + ipaddressparm +
                '}';
    }
}



