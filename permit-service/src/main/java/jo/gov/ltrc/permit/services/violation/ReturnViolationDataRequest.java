package jo.gov.ltrc.permit.services.violation;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class ReturnViolationDataRequest {

    @ApiModelProperty("Minimum Violation ID Parameter ") private Long minviolationidparm ;
    @ApiModelProperty("Maximum Violation ID Parameter ") private Long maxviolationidparm ;
    @ApiModelProperty("Minimum Violation Date Parameter ") private Date minviolationdateparm ;
    @ApiModelProperty("Maximum Violation Date Parameter ") private Date maxviolationdateparm ;
    @ApiModelProperty("Violation Type Parameter ") private Long violationtypeparm ;
    @ApiModelProperty("Violation Subject Parameter ") private Long violationsubjectparm ;
    @ApiModelProperty("Violation Penalty Parameter ") private Long violationpenaltyparm ;
    @ApiModelProperty("Registration Number Parameter ") private String registrationnumberparm ;
    @ApiModelProperty("Plate Code Parameter ") private String platecodeparm ;
    @ApiModelProperty("Plate Number Parameter ") private String platenumberparm ;
    @ApiModelProperty("Driver Parameter ") private String driverparm ;
    @ApiModelProperty("Line ID Parameter ") private Long lineidparm ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;
    @ApiModelProperty("Vehicle Parameter ") private Integer vehicleparm ;
    @ApiModelProperty("Operator ID Parameter ") private Long operatoridparm ;
    @ApiModelProperty("Operator Name Parameter ") private String operatornameparm ;
    @ApiModelProperty("Violation Reference Parameter ") private String violationreferenceparm ;
    @ApiModelProperty("Minimum Violation Reference Date Parameter ") private Date minviolationreferencedateparm ;
    @ApiModelProperty("Maximum Violation Reference Date Parameter ") private Date maxviolationreferencedateparm ;
    @ApiModelProperty("Cancellation of Arrest Order Reference Parameter ") private String cancellationofarrestorderreferenceparm ;
    @ApiModelProperty("Minimum Cancellation of Arrest Order Date Parameter ") private Date mincancellationofarrestorderdateparm ;
    @ApiModelProperty("Maximum Cancellation of Arrest Order Date Parameter ") private Date maxcancellationofarrestorderdateparm ;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Violation By Parameter ") private Integer ViolationByParm ;
    @ApiModelProperty("Page Size Parameter ") private Integer pagesize ;
    @ApiModelProperty("Page Index Parameter ") private Integer pageindex ;
    @ApiModelProperty("Sort Type Parameter ") private Integer sorttype ;
    @ApiModelProperty("Sort By Parameter ") private String sortby ;

    public Long getMinviolationidparm() {
        return minviolationidparm;
    }

    public void setMinviolationidparm(Long minviolationidparm) {
        this.minviolationidparm = minviolationidparm;
    }

    public Long getMaxviolationidparm() {
        return maxviolationidparm;
    }

    public void setMaxviolationidparm(Long maxviolationidparm) {
        this.maxviolationidparm = maxviolationidparm;
    }

    public Date getMinviolationdateparm() {
        return minviolationdateparm;
    }

    public void setMinviolationdateparm(Date minviolationdateparm) {
        this.minviolationdateparm = minviolationdateparm;
    }

    public Date getMaxviolationdateparm() {
        return maxviolationdateparm;
    }

    public void setMaxviolationdateparm(Date maxviolationdateparm) {
        this.maxviolationdateparm = maxviolationdateparm;
    }

    public Long getViolationtypeparm() {
        return violationtypeparm;
    }

    public void setViolationtypeparm(Long violationtypeparm) {
        this.violationtypeparm = violationtypeparm;
    }

    public Long getViolationsubjectparm() {
        return violationsubjectparm;
    }

    public void setViolationsubjectparm(Long violationsubjectparm) {
        this.violationsubjectparm = violationsubjectparm;
    }

    public Long getViolationpenaltyparm() {
        return violationpenaltyparm;
    }

    public void setViolationpenaltyparm(Long violationpenaltyparm) {
        this.violationpenaltyparm = violationpenaltyparm;
    }

    public String getRegistrationnumberparm() {
        return registrationnumberparm;
    }

    public void setRegistrationnumberparm(String registrationnumberparm) {
        this.registrationnumberparm = registrationnumberparm;
    }

    public String getPlatecodeparm() {
        return platecodeparm;
    }

    public void setPlatecodeparm(String platecodeparm) {
        this.platecodeparm = platecodeparm;
    }

    public String getPlatenumberparm() {
        return platenumberparm;
    }

    public void setPlatenumberparm(String platenumberparm) {
        this.platenumberparm = platenumberparm;
    }

    public String getDriverparm() {
        return driverparm;
    }

    public void setDriverparm(String driverparm) {
        this.driverparm = driverparm;
    }

    public Long getLineidparm() {
        return lineidparm;
    }

    public void setLineidparm(Long lineidparm) {
        this.lineidparm = lineidparm;
    }

    public Integer getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(Integer statusparm) {
        this.statusparm = statusparm;
    }

    public Integer getVehicleparm() {
        return vehicleparm;
    }

    public void setVehicleparm(Integer vehicleparm) {
        this.vehicleparm = vehicleparm;
    }

    public Long getOperatoridparm() {
        return operatoridparm;
    }

    public void setOperatoridparm(Long operatoridparm) {
        this.operatoridparm = operatoridparm;
    }

    public String getOperatornameparm() {
        return operatornameparm;
    }

    public void setOperatornameparm(String operatornameparm) {
        this.operatornameparm = operatornameparm;
    }

    public String getViolationreferenceparm() {
        return violationreferenceparm;
    }

    public void setViolationreferenceparm(String violationreferenceparm) {
        this.violationreferenceparm = violationreferenceparm;
    }

    public Date getMinviolationreferencedateparm() {
        return minviolationreferencedateparm;
    }

    public void setMinviolationreferencedateparm(Date minviolationreferencedateparm) {
        this.minviolationreferencedateparm = minviolationreferencedateparm;
    }

    public Date getMaxviolationreferencedateparm() {
        return maxviolationreferencedateparm;
    }

    public void setMaxviolationreferencedateparm(Date maxviolationreferencedateparm) {
        this.maxviolationreferencedateparm = maxviolationreferencedateparm;
    }

    public String getCancellationofarrestorderreferenceparm() {
        return cancellationofarrestorderreferenceparm;
    }

    public void setCancellationofarrestorderreferenceparm(String cancellationofarrestorderreferenceparm) {
        this.cancellationofarrestorderreferenceparm = cancellationofarrestorderreferenceparm;
    }

    public Date getMincancellationofarrestorderdateparm() {
        return mincancellationofarrestorderdateparm;
    }

    public void setMincancellationofarrestorderdateparm(Date mincancellationofarrestorderdateparm) {
        this.mincancellationofarrestorderdateparm = mincancellationofarrestorderdateparm;
    }

    public Date getMaxcancellationofarrestorderdateparm() {
        return maxcancellationofarrestorderdateparm;
    }

    public void setMaxcancellationofarrestorderdateparm(Date maxcancellationofarrestorderdateparm) {
        this.maxcancellationofarrestorderdateparm = maxcancellationofarrestorderdateparm;
    }

    public Long getPrincepel() {
        return princepel;
    }

    public void setPrincepel(Long princepel) {
        this.princepel = princepel;
    }

    public Integer getViolationByParm() {
        return ViolationByParm;
    }

    public void setViolationByParm(Integer violationByParm) {
        ViolationByParm = violationByParm;
    }

    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }

    public Integer getPageindex() {
        return pageindex;
    }

    public void setPageindex(Integer pageindex) {
        this.pageindex = pageindex;
    }

    public Integer getSorttype() {
        return sorttype;
    }

    public void setSorttype(Integer sorttype) {
        this.sorttype = sorttype;
    }

    public String getSortby() {
        return sortby;
    }

    public void setSortby(String sortby) {
        this.sortby = sortby;
    }

    @Override
    public String toString() {
        return "ReturnViolationDataRequest{" +
                "minviolationidparm=" + minviolationidparm +
                ", maxviolationidparm=" + maxviolationidparm +
                ", minviolationdateparm=" + minviolationdateparm +
                ", maxviolationdateparm=" + maxviolationdateparm +
                ", violationtypeparm=" + violationtypeparm +
                ", violationsubjectparm=" + violationsubjectparm +
                ", violationpenaltyparm=" + violationpenaltyparm +
                ", registrationnumberparm=" + registrationnumberparm +
                ", platecodeparm=" + platecodeparm +
                ", platenumberparm=" + platenumberparm +
                ", driverparm=" + driverparm +
                ", lineidparm=" + lineidparm +
                ", statusparm=" + statusparm +
                ", vehicleparm=" + vehicleparm +
                ", operatoridparm=" + operatoridparm +
                ", operatornameparm=" + operatornameparm +
                ", violationreferenceparm=" + violationreferenceparm +
                ", minviolationreferencedateparm=" + minviolationreferencedateparm +
                ", maxviolationreferencedateparm=" + maxviolationreferencedateparm +
                ", cancellationofarrestorderreferenceparm=" + cancellationofarrestorderreferenceparm +
                ", mincancellationofarrestorderdateparm=" + mincancellationofarrestorderdateparm +
                ", maxcancellationofarrestorderdateparm=" + maxcancellationofarrestorderdateparm +
                ", princepel=" + princepel +
                ", ViolationByParm=" + ViolationByParm +
                ", pagesize=" + pagesize +
                ", pageindex=" + pageindex +
                ", sorttype=" + sorttype +
                ", sortby=" + sortby +
                '}';
    }
}
