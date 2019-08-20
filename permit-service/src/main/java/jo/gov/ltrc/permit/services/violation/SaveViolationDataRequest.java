package jo.gov.ltrc.permit.services.violation;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class SaveViolationDataRequest {

    @ApiModelProperty("Violation ID Parameter ") private Long violationidparm ;
    @ApiModelProperty("Violation Date Parameter ") private Date violationdateparm ;
    @ApiModelProperty("Violation By Parameter ") private Integer violationbyparm ;
    @ApiModelProperty("Violation Type Parameter ") private Long violationtypeparm ;
    @ApiModelProperty("Violation Subject Parameter ") private Long violationsubjectparm ;
    @ApiModelProperty("Violation Penalty Parameter ") private Long violationpenaltyparm ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;
    @ApiModelProperty("Vehicle Parameter ") private Long vehicleparm ;
    @ApiModelProperty("Driver Parameter ") private String driverparm ;
    @ApiModelProperty("Line ID Parameter ") private Long lineidparm ;
    @ApiModelProperty("Violation Reference Parameter ") private String violationreferenceparm ;
    @ApiModelProperty("Violation Reference Date Parameter ") private Date violationreferencedateparm ;
    @ApiModelProperty("Cancellation of Arrest Order Reference Parameter ") private String cancellationofarrestorderreferenceparm ;
    @ApiModelProperty("Cancellation of Arrest Order Date Parameter ") private Date cancellationofarrestorderdateparm ;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Operator Parameter ") private Long operatorparm ;

    public Long getViolationidparm() {
        return violationidparm;
    }

    public void setViolationidparm(Long violationidparm) {
        this.violationidparm = violationidparm;
    }

    public Date getViolationdateparm() {
        return violationdateparm;
    }

    public void setViolationdateparm(Date violationdateparm) {
        this.violationdateparm = violationdateparm;
    }

    public Integer getViolationbyparm() {
        return violationbyparm;
    }

    public void setViolationbyparm(Integer violationbyparm) {
        this.violationbyparm = violationbyparm;
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

    public Integer getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(Integer statusparm) {
        this.statusparm = statusparm;
    }

    public Long getVehicleparm() {
        return vehicleparm;
    }

    public void setVehicleparm(Long vehicleparm) {
        this.vehicleparm = vehicleparm;
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

    public Long getPrincepel() {
        return princepel;
    }

    public void setPrincepel(Long princepel) {
        this.princepel = princepel;
    }

    public Long getOperatorparm() {
        return operatorparm;
    }

    public void setOperatorparm(Long operatorparm) {
        this.operatorparm = operatorparm;
    }

    @Override
    public String toString() {
        return "SaveViolationDataRequest{" +
                "violationidparm=" + violationidparm +
                ", violationdateparm=" + violationdateparm +
                ", violationbyparm=" + violationbyparm +
                ", violationtypeparm=" + violationtypeparm +
                ", violationsubjectparm=" + violationsubjectparm +
                ", violationpenaltyparm=" + violationpenaltyparm +
                ", statusparm=" + statusparm +
                ", vehicleparm=" + vehicleparm +
                ", driverparm=" + driverparm +
                ", lineidparm=" + lineidparm +
                ", violationreferenceparm=" + violationreferenceparm +
                ", violationreferencedateparm=" + violationreferencedateparm +
                ", cancellationofarrestorderreferenceparm=" + cancellationofarrestorderreferenceparm +
                ", cancellationofarrestorderdateparm=" + cancellationofarrestorderdateparm +
                ", princepel=" + princepel +
                ", operatorparm=" + operatorparm +
                '}';
    }
}
