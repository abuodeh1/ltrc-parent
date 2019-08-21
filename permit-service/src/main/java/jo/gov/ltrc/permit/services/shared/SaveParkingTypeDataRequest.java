package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveParkingTypeDataRequest {

    @ApiModelProperty("Parking Type ID Parameter ") private Long parkingtypeidparm ;
    @ApiModelProperty("Parking Type Arabic Name Parameter ") private String parkingtypearabicnameparm ;
    @ApiModelProperty("Parking Type English Name Parameter ") private String parkingtypeenglishnameparm ;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;
    @ApiModelProperty("IP Address") private String ipaddressparm  ;

    public Long getParkingtypeidparm() {
        return parkingtypeidparm;
    }

    public void setParkingtypeidparm(Long parkingtypeidparm) {
        this.parkingtypeidparm = parkingtypeidparm;
    }

    public String getParkingtypearabicnameparm() {
        return parkingtypearabicnameparm;
    }

    public void setParkingtypearabicnameparm(String parkingtypearabicnameparm) {
        this.parkingtypearabicnameparm = parkingtypearabicnameparm;
    }

    public String getParkingtypeenglishnameparm() {
        return parkingtypeenglishnameparm;
    }

    public void setParkingtypeenglishnameparm(String parkingtypeenglishnameparm) {
        this.parkingtypeenglishnameparm = parkingtypeenglishnameparm;
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
        return "SaveParkingTypeDataRequest{" +
                "parkingtypeidparm=" + parkingtypeidparm +
                ", parkingtypearabicnameparm=" + parkingtypearabicnameparm +
                ", parkingtypeenglishnameparm=" + parkingtypeenglishnameparm +
                ", princepel=" + princepel +
                ", statusparm=" + statusparm +
                ", ipaddressparam=" + ipaddressparm +
                '}';
    }
}



