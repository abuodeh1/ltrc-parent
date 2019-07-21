package jo.gov.ltrc.permit.services.violation;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class ReturnViolationDataRequest {

    @ApiModelProperty("Minimum Violation ID Parameter ") private long minviolationidparm ;
    @ApiModelProperty("Maximum Violation ID Parameter ") private long maxviolationidparm ;
    @ApiModelProperty("Minimum Violation Date Parameter ") private Date minviolationdateparm ;
    @ApiModelProperty("Maximum Violation Date Parameter ") private Date maxviolationdateparm ;
    @ApiModelProperty("Violation Type Parameter ") private long violationtypeparm ;
    @ApiModelProperty("Violation Subject Parameter ") private long violationsubjectparm ;
    @ApiModelProperty("Violation Penalty Parameter ") private long violationpenaltyparm ;
    @ApiModelProperty("Registration Number Parameter ") private String registrationnumberparm ;
    @ApiModelProperty("Plate Code Parameter ") private String platecodeparm ;
    @ApiModelProperty("Plate Number Parameter ") private String platenumberparm ;
    @ApiModelProperty("Driver Parameter ") private String driverparm ;
    @ApiModelProperty("Line ID Parameter ") private long lineidparm ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;
    @ApiModelProperty("Vehicle Parameter ") private int vehicleparm ;
    @ApiModelProperty("Operator ID Parameter ") private long operatoridparm ;
    @ApiModelProperty("Operator Name Parameter ") private String operatornameparm ;
    @ApiModelProperty("Violation Reference Parameter ") private String violationreferenceparm ;
    @ApiModelProperty("Minimum Violation Reference Date Parameter ") private Date minviolationreferencedateparm ;
    @ApiModelProperty("Maximum Violation Reference Date Parameter ") private Date maxviolationreferencedateparm ;
    @ApiModelProperty("Cancellation of Arrest Order Reference Parameter ") private String cancellationofarrestorderreferenceparm ;
    @ApiModelProperty("Minimum Cancellation of Arrest Order Date Parameter ") private Date mincancellationofarrestorderdateparm ;
    @ApiModelProperty("Maximum Cancellation of Arrest Order Date Parameter ") private Date maxcancellationofarrestorderdateparm ;
    @ApiModelProperty("Principal Parameter ") private long princepel ;
    @ApiModelProperty("Violation By Parameter ") private int ViolationByParm ;
    @ApiModelProperty("Page Size Parameter ") private int pagesize ;
    @ApiModelProperty("Page Index Parameter ") private int pageindex ;
    @ApiModelProperty("Sort Type Parameter ") private int sorttype ;
    @ApiModelProperty("Sort By Parameter ") private String sortby ;


    public long getMinviolationidparm() {
        return minviolationidparm;
    }

    public void setMinviolationidparm(long minviolationidparm) {
        this.minviolationidparm = minviolationidparm;
    }

    public long getMaxviolationidparm() {
        return maxviolationidparm;
    }

    public void setMaxviolationidparm(long maxviolationidparm) {
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

    public long getViolationtypeparm() {
        return violationtypeparm;
    }

    public void setViolationtypeparm(long violationtypeparm) {
        this.violationtypeparm = violationtypeparm;
    }

    public long getViolationsubjectparm() {
        return violationsubjectparm;
    }

    public void setViolationsubjectparm(long violationsubjectparm) {
        this.violationsubjectparm = violationsubjectparm;
    }

    public long getViolationpenaltyparm() {
        return violationpenaltyparm;
    }

    public void setViolationpenaltyparm(long violationpenaltyparm) {
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

    public long getLineidparm() {
        return lineidparm;
    }

    public void setLineidparm(long lineidparm) {
        this.lineidparm = lineidparm;
    }

    public int getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(int statusparm) {
        this.statusparm = statusparm;
    }

    public int getVehicleparm() {
        return vehicleparm;
    }

    public void setVehicleparm(int vehicleparm) {
        this.vehicleparm = vehicleparm;
    }

    public long getOperatoridparm() {
        return operatoridparm;
    }

    public void setOperatoridparm(long operatoridparm) {
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

    public long getPrincepel() {
        return princepel;
    }

    public void setPrincepel(long princepel) {
        this.princepel = princepel;
    }

    public int getViolationByParm() {
        return ViolationByParm;
    }

    public void setViolationByParm(int violationByParm) {
        ViolationByParm = violationByParm;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public int getPageindex() {
        return pageindex;
    }

    public void setPageindex(int pageindex) {
        this.pageindex = pageindex;
    }

    public int getSorttype() {
        return sorttype;
    }

    public void setSorttype(int sorttype) {
        this.sorttype = sorttype;
    }

    public String getSortby() {
        return sortby;
    }

    public void setSortby(String sortby) {
        this.sortby = sortby;
    }
}
