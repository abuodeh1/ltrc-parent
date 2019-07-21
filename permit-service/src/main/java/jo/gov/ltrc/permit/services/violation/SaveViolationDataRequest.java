package jo.gov.ltrc.permit.services.violation;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class SaveViolationDataRequest {

    @ApiModelProperty("Violation ID Parameter ") private long violationidparm ;
    @ApiModelProperty("Violation Date Parameter ") private Date violationdateparm ;
    @ApiModelProperty("Violation By Parameter ") private int violationbyparm ;
    @ApiModelProperty("Violation Type Parameter ") private long violationtypeparm ;
    @ApiModelProperty("Violation Subject Parameter ") private long violationsubjectparm ;
    @ApiModelProperty("Violation Penalty Parameter ") private long violationpenaltyparm ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;
    @ApiModelProperty("Vehicle Parameter ") private long vehicleparm ;
    @ApiModelProperty("Driver Parameter ") private String driverparm ;
    @ApiModelProperty("Line ID Parameter ") private long lineidparm ;
    @ApiModelProperty("Violation Reference Parameter ") private String violationreferenceparm ;
    @ApiModelProperty("Violation Reference Date Parameter ") private Date violationreferencedateparm ;
    @ApiModelProperty("Cancellation of Arrest Order Reference Parameter ") private String cancellationofarrestorderreferenceparm ;
    @ApiModelProperty("Cancellation of Arrest Order Date Parameter ") private Date cancellationofarrestorderdateparm ;
    @ApiModelProperty("Principal Parameter ") private long princepel ;
    @ApiModelProperty("Operator Parameter ") private long operatorparm ;

    public long getViolationidparm() {
        return violationidparm;
    }

    public void setViolationidparm(long violationidparm) {
        this.violationidparm = violationidparm;
    }

    public Date getViolationdateparm() {
        return violationdateparm;
    }

    public void setViolationdateparm(Date violationdateparm) {
        this.violationdateparm = violationdateparm;
    }

    public int getViolationbyparm() {
        return violationbyparm;
    }

    public void setViolationbyparm(int violationbyparm) {
        this.violationbyparm = violationbyparm;
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

    public int getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(int statusparm) {
        this.statusparm = statusparm;
    }

    public long getVehicleparm() {
        return vehicleparm;
    }

    public void setVehicleparm(long vehicleparm) {
        this.vehicleparm = vehicleparm;
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

    public String getViolationreferenceparm() {
        return violationreferenceparm;
    }

    public void setViolationreferenceparm(String violationreferenceparm) {
        this.violationreferenceparm = violationreferenceparm;
    }

    public Date getViolationreferencedateparm() {
        return violationreferencedateparm;
    }

    public void setViolationreferencedateparm(Date violationreferencedateparm) {
        this.violationreferencedateparm = violationreferencedateparm;
    }

    public String getCancellationofarrestorderreferenceparm() {
        return cancellationofarrestorderreferenceparm;
    }

    public void setCancellationofarrestorderreferenceparm(String cancellationofarrestorderreferenceparm) {
        this.cancellationofarrestorderreferenceparm = cancellationofarrestorderreferenceparm;
    }

    public Date getCancellationofarrestorderdateparm() {
        return cancellationofarrestorderdateparm;
    }

    public void setCancellationofarrestorderdateparm(Date cancellationofarrestorderdateparm) {
        this.cancellationofarrestorderdateparm = cancellationofarrestorderdateparm;
    }

    public long getPrincepel() {
        return princepel;
    }

    public void setPrincepel(long princepel) {
        this.princepel = princepel;
    }

    public long getOperatorparm() {
        return operatorparm;
    }

    public void setOperatorparm(long operatorparm) {
        this.operatorparm = operatorparm;
    }
}
