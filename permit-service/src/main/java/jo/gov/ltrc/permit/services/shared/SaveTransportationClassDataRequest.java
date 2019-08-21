package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveTransportationClassDataRequest {

    @ApiModelProperty("Violation Type ID Parameter ") private Long transportationclassidparm;
    @ApiModelProperty("Violation Type Name Parameter ") private String transportationclassnameparm;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;
    @ApiModelProperty("IP Address") private String ipaddressparm  ;

    public Long getTransportationclassidparm() {
        return transportationclassidparm;
    }

    public void setTransportationclassidparm(Long transportationclassidparm) {
        this.transportationclassidparm = transportationclassidparm;
    }

    public String getTransportationclassnameparm() {
        return transportationclassnameparm;
    }

    public void setTransportationclassnameparm(String transportationclassnameparm) {
        this.transportationclassnameparm = transportationclassnameparm;
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
        return "SaveTransportationClassDataRequest{" +
                "transportationclassidparm=" + transportationclassidparm +
                ", transportationclassnameparm=" + transportationclassnameparm +
                ", princepel=" + princepel +
                ", statusparm=" + statusparm +
                ", ipaddressparam=" + ipaddressparm +
                '}';
    }
}



