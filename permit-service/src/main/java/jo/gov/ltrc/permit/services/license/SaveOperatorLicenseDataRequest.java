package jo.gov.ltrc.permit.services.license;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class SaveOperatorLicenseDataRequest {

    @ApiModelProperty("Operator License ID Parameter ") private long operatorlicenseidparm ;
    @ApiModelProperty("Issue Date Parameter ") private Date issuedateparm ;
    @ApiModelProperty("Operator ID Parameter ") private long operatoridparm ;
    @ApiModelProperty("License Start Date Parameter ") private Date licensestartdateparm ;
    @ApiModelProperty("License End Date Parameter ") private Date licenseenddateparm ;
    @ApiModelProperty("License  Status Parameter ") private int liecencsestatusparm ;
    @ApiModelProperty("Printing Date Parameter ") private Date printingdateparm ;
    @ApiModelProperty("Counter Parameter ") private int counterparm ;
    @ApiModelProperty("Principal Parameter ") private long princepel ;

    public long getOperatorlicenseidparm() {
        return operatorlicenseidparm;
    }

    public void setOperatorlicenseidparm(long operatorlicenseidparm) {
        this.operatorlicenseidparm = operatorlicenseidparm;
    }

    public Date getIssuedateparm() {
        return issuedateparm;
    }

    public void setIssuedateparm(Date issuedateparm) {
        this.issuedateparm = issuedateparm;
    }

    public long getOperatoridparm() {
        return operatoridparm;
    }

    public void setOperatoridparm(long operatoridparm) {
        this.operatoridparm = operatoridparm;
    }

    public Date getLicensestartdateparm() {
        return licensestartdateparm;
    }

    public void setLicensestartdateparm(Date licensestartdateparm) {
        this.licensestartdateparm = licensestartdateparm;
    }

    public Date getLicenseenddateparm() {
        return licenseenddateparm;
    }

    public void setLicenseenddateparm(Date licenseenddateparm) {
        this.licenseenddateparm = licenseenddateparm;
    }

    public int getLiecencsestatusparm() {
        return liecencsestatusparm;
    }

    public void setLiecencsestatusparm(int liecencsestatusparm) {
        this.liecencsestatusparm = liecencsestatusparm;
    }

    public Date getPrintingdateparm() {
        return printingdateparm;
    }

    public void setPrintingdateparm(Date printingdateparm) {
        this.printingdateparm = printingdateparm;
    }

    public int getCounterparm() {
        return counterparm;
    }

    public void setCounterparm(int counterparm) {
        this.counterparm = counterparm;
    }

    public long getPrincepel() {
        return princepel;
    }

    public void setPrincepel(long princepel) {
        this.princepel = princepel;
    }
}
