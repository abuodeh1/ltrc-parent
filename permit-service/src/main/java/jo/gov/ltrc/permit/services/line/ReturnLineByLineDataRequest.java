package jo.gov.ltrc.permit.services.line;


import io.swagger.annotations.ApiModelProperty;

public class ReturnLineByLineDataRequest {

    @ApiModelProperty("Min Line ID Parameter") private Long minlineidparm ;
    @ApiModelProperty("Max Line ID Parameter") private Long maxlineidparm ;
    @ApiModelProperty("Line Name Parameter") private String linenameparm ;
    @ApiModelProperty("Province ID Parameter") private Long provinceidparm ;
    @ApiModelProperty("Governorate ID Parameter") private Long governorateidparm ;
    @ApiModelProperty("Line Type Parameter") private Long linetypeparm ;
    @ApiModelProperty("Line Status Parameter") private Integer linestatusparm ;
    @ApiModelProperty("Line Start Point Parameter") private Long linestartpoint ;
    @ApiModelProperty("Line End Point Parameter") private Long lineendpont ;
    @ApiModelProperty("Route Count Parameter") private Integer routecountparm ;

    public Long getMinlineidparm() {
        return minlineidparm;
    }

    public void setMinlineidparm(Long minlineidparm) {
        this.minlineidparm = minlineidparm;
    }

    public Long getMaxlineidparm() {
        return maxlineidparm;
    }

    public void setMaxlineidparm(Long maxlineidparm) {
        this.maxlineidparm = maxlineidparm;
    }

    public String getLinenameparm() {
        return linenameparm;
    }

    public void setLinenameparm(String linenameparm) {
        this.linenameparm = linenameparm;
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

    public Integer getLinestatusparm() {
        return linestatusparm;
    }

    public void setLinestatusparm(Integer linestatusparm) {
        this.linestatusparm = linestatusparm;
    }

    public Long getLinestartpoint() {
        return linestartpoint;
    }

    public void setLinestartpoint(Long linestartpoint) {
        this.linestartpoint = linestartpoint;
    }

    public Long getLineendpont() {
        return lineendpont;
    }

    public void setLineendpont(Long lineendpont) {
        this.lineendpont = lineendpont;
    }

    public Integer getRoutecountparm() {
        return routecountparm;
    }

    public void setRoutecountparm(Integer routecountparm) {
        this.routecountparm = routecountparm;
    }

    @Override
    public String toString() {
        return "ReturnLineByLineDataRequest{" +
                "minlineidparm=" + minlineidparm +
                ", maxlineidparm=" + maxlineidparm +
                ", linenameparm=" + linenameparm +
                ", provinceidparm=" + provinceidparm +
                ", governorateidparm=" + governorateidparm +
                ", linetypeparm=" + linetypeparm +
                ", linestatusparm=" + linestatusparm +
                ", linestartpoint=" + linestartpoint +
                ", lineendpont=" + lineendpont +
                ", routecountparm=" + routecountparm +
                '}';
    }
}



