package jo.gov.ltrc.permit.services.point;


import io.swagger.annotations.ApiModelProperty;

public class ChangePointStatusData {

    @ApiModelProperty("Point ID Parameter ") private Long pointidparm ;
    @ApiModelProperty("Point Status Parameter ") private Integer pointstatusparm ;
    @ApiModelProperty("Principal Parameter ") private Long prencipal ;

    public Long getPointidparm() {
        return pointidparm;
    }

    public void setPointidparm(Long pointidparm) {
        this.pointidparm = pointidparm;
    }

    public Integer getPointstatusparm() {
        return pointstatusparm;
    }

    public void setPointstatusparm(Integer pointstatusparm) {
        this.pointstatusparm = pointstatusparm;
    }

    public Long getPrencipal() {
        return prencipal;
    }

    public void setPrencipal(Long prencipal) {
        this.prencipal = prencipal;
    }

    @Override
    public String toString() {
        return "ChangePointStatusData{" +
                "pointidparm=" + pointidparm +
                ", pointstatusparm=" + pointstatusparm +
                ", prencipal=" + prencipal +
                '}';
    }
}



