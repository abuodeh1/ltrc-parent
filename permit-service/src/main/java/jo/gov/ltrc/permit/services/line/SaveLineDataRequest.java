package jo.gov.ltrc.permit.services.line;


import io.swagger.annotations.ApiModelProperty;

public class SaveLineDataRequest {

    @ApiModelProperty("Line Name Parameter") private String linenameparm ;
    @ApiModelProperty("Allow Temporary Permit Parameter ") private   Boolean allowtemporarypermitparm ;
    @ApiModelProperty("Line ID Parameter") private Long lineidparm ;
    @ApiModelProperty("Province ID Parameter") private Long provinceidparm ;
    @ApiModelProperty("Governorate ID Parameter") private Long governorateidparm ;
    @ApiModelProperty("Line Type Parameter") private Long linetypeparm ;
    @ApiModelProperty("Start Point Parameter") private Long stratpointparm ;
    @ApiModelProperty("End Point Parameter") private Long endpointparm ;
    @ApiModelProperty("Remarks Parameter") private String remarksparm ;
    @ApiModelProperty("Line Status Parameter") private Integer linestatusparm ;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("IP Address") private String ipaddressparm  ;


    public String getLinenameparm() {
        return linenameparm;
    }

    public void setLinenameparm(String linenameparm) {
        this.linenameparm = linenameparm;
    }

    public Boolean getAllowtemporarypermitparm() {
        return allowtemporarypermitparm;
    }

    public void setAllowtemporarypermitparm(Boolean allowtemporarypermitparm) {
        this.allowtemporarypermitparm = allowtemporarypermitparm;
    }

    public Long getLineidparm() {
        return lineidparm;
    }

    public void setLineidparm(Long lineidparm) {
        this.lineidparm = lineidparm;
    }

    public Long getProvinceidparm() {
        return provinceidparm;
    }

    public void setProvinceidparm(Long provinceidparm) {
        this.provinceidparm = provinceidparm;
    }

    public Long getGovernorateidparm() {
        return governorateidparm;
    }

    public void setGovernorateidparm(Long governorateidparm) {
        this.governorateidparm = governorateidparm;
    }

    public Long getLinetypeparm() {
        return linetypeparm;
    }

    public void setLinetypeparm(Long linetypeparm) {
        this.linetypeparm = linetypeparm;
    }

    public Long getStratpointparm() {
        return stratpointparm;
    }

    public void setStratpointparm(Long stratpointparm) {
        this.stratpointparm = stratpointparm;
    }

    public Long getEndpointparm() {
        return endpointparm;
    }

    public void setEndpointparm(Long endpointparm) {
        this.endpointparm = endpointparm;
    }

    public String getRemarksparm() {
        return remarksparm;
    }

    public void setRemarksparm(String remarksparm) {
        this.remarksparm = remarksparm;
    }

    public Integer getLinestatusparm() {
        return linestatusparm;
    }

    public void setLinestatusparm(Integer linestatusparm) {
        this.linestatusparm = linestatusparm;
    }

    public Long getPrincepel() {
        return princepel;
    }

    public void setPrincepel(Long princepel) {
        this.princepel = princepel;
    }

    public String getIpaddressparm() {
        return ipaddressparm;
    }

    public void setIpaddressparm(String ipaddressparm) {
        this.ipaddressparm = ipaddressparm;
    }

    @Override
    public String toString() {
        return "SaveLineDataRequest{" +
                "linenameparm=" + linenameparm +
                ", allowtemporarypermitparm=" + allowtemporarypermitparm +
                ", lineidparm=" + lineidparm +
                ", provinceidparm=" + provinceidparm +
                ", governorateidparm=" + governorateidparm +
                ", linetypeparm=" + linetypeparm +
                ", stratpointparm=" + stratpointparm +
                ", endpointparm=" + endpointparm +
                ", remarksparm=" + remarksparm +
                ", linestatusparm=" + linestatusparm +
                ", princepel=" + princepel +
                ", ipaddressparam=" + ipaddressparm +
                '}';
    }
}



