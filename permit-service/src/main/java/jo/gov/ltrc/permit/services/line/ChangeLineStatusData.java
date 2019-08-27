package jo.gov.ltrc.permit.services.line;


import io.swagger.annotations.ApiModelProperty;

public class ChangeLineStatusData {

    @ApiModelProperty("Line Status Parameter ") private Integer linestatusparm ;
    @ApiModelProperty("Line ID Parameter ") private Long lineidparm ;
    @ApiModelProperty("Principal Parameter ") private Long prencipal ;

    public Integer getLinestatusparm() {
        return linestatusparm;
    }

    public void setLinestatusparm(Integer linestatusparm) {
        this.linestatusparm = linestatusparm;
    }

    public Long getLineidparm() {
        return lineidparm;
    }

    public void setLineidparm(Long lineidparm) {
        this.lineidparm = lineidparm;
    }

    public Long getPrencipal() {
        return prencipal;
    }

    public void setPrencipal(Long prencipal) {
        this.prencipal = prencipal;
    }

    @Override
    public String toString() {
        return "ChangeLineStatusData{" +
                "linestatusparm=" + linestatusparm +
                ", lineidparm=" + lineidparm +
                ", prencipal=" + prencipal +
                '}';
    }
}



