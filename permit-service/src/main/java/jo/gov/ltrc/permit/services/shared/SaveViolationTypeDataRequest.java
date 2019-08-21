package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveViolationTypeDataRequest {

    @ApiModelProperty("Violation Type ID Parameter ") private Long violationtypeidparm ;
    @ApiModelProperty("Violation Type Name Parameter ") private String violationtypenameparm ;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;
    @ApiModelProperty("IP Address") private String ipaddressparm  ;

    public Long getViolationtypeidparm() {
        return violationtypeidparm;
    }

    public void setViolationtypeidparm(Long violationtypeidparm) {
        this.violationtypeidparm = violationtypeidparm;
    }

    public String getViolationtypenameparm() {
        return violationtypenameparm;
    }

    public void setViolationtypenameparm(String violationtypenameparm) {
        this.violationtypenameparm = violationtypenameparm;
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
        return "SaveViolationTypeDataRequest{" +
                "violationtypeidparm=" + violationtypeidparm +
                ", violationtypenameparm= " + violationtypenameparm + 
                ", princepel=" + princepel +
                ", statusparm=" + statusparm +
                ", ipaddressparm= " + ipaddressparm + 
                '}';
    }
}



