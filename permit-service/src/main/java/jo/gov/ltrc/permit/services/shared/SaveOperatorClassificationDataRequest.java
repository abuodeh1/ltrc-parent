package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveOperatorClassificationDataRequest {

    @ApiModelProperty("Violation Type ID Parameter ") private Long operatorclassificationidparm;
    @ApiModelProperty("Violation Type Name Parameter ") private String operatorclassificationnameparm;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;
    @ApiModelProperty("IP Address") private String ipaddressparm  ;

    public Long getOperatorclassificationidparm() {
        return operatorclassificationidparm;
    }

    public void setOperatorclassificationidparm(Long operatorclassificationidparm) {
        this.operatorclassificationidparm = operatorclassificationidparm;
    }

    public String getOperatorclassificationnameparm() {
        return operatorclassificationnameparm;
    }

    public void setOperatorclassificationnameparm(String operatorclassificationnameparm) {
        this.operatorclassificationnameparm = operatorclassificationnameparm;
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
        return "SaveOperatorClassificationDataRequest{" +
                "operatorclassificationidparm=" + operatorclassificationidparm +
                ", operatorclassificationnameparm=" + operatorclassificationnameparm +
                ", princepel=" + princepel +
                ", statusparm=" + statusparm +
                ", ipaddressparam=" + ipaddressparm +
                '}';
    }
}



