package jo.gov.ltrc.permit.services.license;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class SaveOperatorLicenseDataRequest {

    @ApiModelProperty("Operator License ID Parameter ") private Long operatorlicenseidparm ;
    @ApiModelProperty("Issue Date Parameter ") private Date issuedateparm ;
    @ApiModelProperty("Operator ID Parameter ") private Long operatoridparm ;
    @ApiModelProperty("License Start Date Parameter ") private Date licensestartdateparm ;
    @ApiModelProperty("License End Date Parameter ") private Date licenseenddateparm ;
    @ApiModelProperty("License  Status Parameter ") private Integer liecencsestatusparm ;
    @ApiModelProperty("Printing Date Parameter ") private Date printingdateparm ;
    @ApiModelProperty("Counter Parameter ") private Integer counterparm ;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("IP Address") private String ipaddressparm  ;

    public Long getOperatorlicenseidparm() {
        return operatorlicenseidparm;
    }

    public void setOperatorlicenseidparm(Long operatorlicenseidparm) {
        this.operatorlicenseidparm = operatorlicenseidparm;
    }

    public Date getIssuedateparm() {
        return issuedateparm;
    }

    public void setIssuedateparm(Date issuedateparm) {
        this.issuedateparm = issuedateparm;
    }

    public Long getOperatoridparm() {
        return operatoridparm;
    }

    public void setOperatoridparm(Long operatoridparm) {
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

    public Integer getLiecencsestatusparm() {
        return liecencsestatusparm;
    }

    public void setLiecencsestatusparm(Integer liecencsestatusparm) {
        this.liecencsestatusparm = liecencsestatusparm;
    }

    public Date getPrintingdateparm() {
        return printingdateparm;
    }

    public void setPrintingdateparm(Date printingdateparm) {
        this.printingdateparm = printingdateparm;
    }

    public Integer getCounterparm() {
        return counterparm;
    }

    public void setCounterparm(Integer counterparm) {
        this.counterparm = counterparm;
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
        return "SaveOperatorLicenseDataRequest{" +
                "operatorlicenseidparm=" + operatorlicenseidparm +
                ", issuedateparm=" + issuedateparm +
                ", operatoridparm=" + operatoridparm +
                ", licensestartdateparm=" + licensestartdateparm +
                ", licenseenddateparm=" + licenseenddateparm +
                ", liecencsestatusparm=" + liecencsestatusparm +
                ", printingdateparm=" + printingdateparm +
                ", counterparm=" + counterparm +
                ", princepel=" + princepel +
                ", ipaddressparam=" + ipaddressparm +
                '}';
    }
}
