package jo.gov.ltrc.permit.services.license;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class ReturnOperatorLicenseInformationRequest {

    @ApiModelProperty("Minimum Operator License ID Parameter ") private Long minoperatorlicenseidparm ;
    @ApiModelProperty("Maximum Operator License ID Parameter ") private Long maxoperatorlicenseidparm ;
    @ApiModelProperty("Minimum Issue Date Parameter ") private Date minissuedateparm ;
    @ApiModelProperty("Maximum Issue Date Parameter ") private Date maxissuedateparm ;
    @ApiModelProperty("Minimum Operator ID Parameter ") private Long minoperatoridparm ;
    @ApiModelProperty("Maximum Operator ID Parameter ") private Long maxoperatoridparm ;
    @ApiModelProperty("Minimum License Start Date Parameter ") private Date minlicensestartdateparm ;
    @ApiModelProperty("Maximum License Start Date Parameter ") private Date maxlicensestartdateparm ;
    @ApiModelProperty("Minimum License End Date Parameter ") private Date minlicenseenddateparm ;
    @ApiModelProperty("Maximum License End Date Parameter ") private Date maxlicenseenddateparm ;
    @ApiModelProperty("Minimum Printing Date Parameter ") private Date minprintingdateparm ;
    @ApiModelProperty("Maximum Printing Date Parameter ") private Date maxprintingdateparm ;
    @ApiModelProperty("Minimum Counter Parameter ") private Integer mincounterparm ;
    @ApiModelProperty("Maximum Counter Parameter ") private Integer maxcounterparm ;
    @ApiModelProperty("Operator Name Parameter ") private String operatornameparm ;
    @ApiModelProperty("Operator Category Parameter ") private Long operatorcategoryparm ;
    @ApiModelProperty("License Status Parameter ") private Integer liecencsestatusparm ;
    @ApiModelProperty("Page Size Parameter ") private Integer pagesize ;
    @ApiModelProperty("Page Index Parameter ") private Integer pageindex ;
    @ApiModelProperty("Sort Type Parameter ") private Integer sorttype ;
    @ApiModelProperty("Sort By Parameter ") private String sortby ;

    public Long getMinoperatorlicenseidparm() {
        return minoperatorlicenseidparm;
    }

    public void setMinoperatorlicenseidparm(Long minoperatorlicenseidparm) {
        this.minoperatorlicenseidparm = minoperatorlicenseidparm;
    }

    public Long getMaxoperatorlicenseidparm() {
        return maxoperatorlicenseidparm;
    }

    public void setMaxoperatorlicenseidparm(Long maxoperatorlicenseidparm) {
        this.maxoperatorlicenseidparm = maxoperatorlicenseidparm;
    }

    public Date getMinissuedateparm() {
        return minissuedateparm;
    }

    public void setMinissuedateparm(Date minissuedateparm) {
        this.minissuedateparm = minissuedateparm;
    }

    public Date getMaxissuedateparm() {
        return maxissuedateparm;
    }

    public void setMaxissuedateparm(Date maxissuedateparm) {
        this.maxissuedateparm = maxissuedateparm;
    }

    public Long getMinoperatoridparm() {
        return minoperatoridparm;
    }

    public void setMinoperatoridparm(Long minoperatoridparm) {
        this.minoperatoridparm = minoperatoridparm;
    }

    public Long getMaxoperatoridparm() {
        return maxoperatoridparm;
    }

    public void setMaxoperatoridparm(Long maxoperatoridparm) {
        this.maxoperatoridparm = maxoperatoridparm;
    }

    public Date getMinlicensestartdateparm() {
        return minlicensestartdateparm;
    }

    public void setMinlicensestartdateparm(Date minlicensestartdateparm) {
        this.minlicensestartdateparm = minlicensestartdateparm;
    }

    public Date getMaxlicensestartdateparm() {
        return maxlicensestartdateparm;
    }

    public void setMaxlicensestartdateparm(Date maxlicensestartdateparm) {
        this.maxlicensestartdateparm = maxlicensestartdateparm;
    }

    public Date getMinlicenseenddateparm() {
        return minlicenseenddateparm;
    }

    public void setMinlicenseenddateparm(Date minlicenseenddateparm) {
        this.minlicenseenddateparm = minlicenseenddateparm;
    }

    public Date getMaxlicenseenddateparm() {
        return maxlicenseenddateparm;
    }

    public void setMaxlicenseenddateparm(Date maxlicenseenddateparm) {
        this.maxlicenseenddateparm = maxlicenseenddateparm;
    }

    public Date getMinprintingdateparm() {
        return minprintingdateparm;
    }

    public void setMinprintingdateparm(Date minprintingdateparm) {
        this.minprintingdateparm = minprintingdateparm;
    }

    public Date getMaxprintingdateparm() {
        return maxprintingdateparm;
    }

    public void setMaxprintingdateparm(Date maxprintingdateparm) {
        this.maxprintingdateparm = maxprintingdateparm;
    }

    public Integer getMincounterparm() {
        return mincounterparm;
    }

    public void setMincounterparm(Integer mincounterparm) {
        this.mincounterparm = mincounterparm;
    }

    public Integer getMaxcounterparm() {
        return maxcounterparm;
    }

    public void setMaxcounterparm(Integer maxcounterparm) {
        this.maxcounterparm = maxcounterparm;
    }

    public String getOperatornameparm() {
        return operatornameparm;
    }

    public void setOperatornameparm(String operatornameparm) {
        this.operatornameparm = operatornameparm;
    }

    public Long getOperatorcategoryparm() {
        return operatorcategoryparm;
    }

    public void setOperatorcategoryparm(Long operatorcategoryparm) {
        this.operatorcategoryparm = operatorcategoryparm;
    }

    public Integer getLiecencsestatusparm() {
        return liecencsestatusparm;
    }

    public void setLiecencsestatusparm(Integer liecencsestatusparm) {
        this.liecencsestatusparm = liecencsestatusparm;
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
        return "ReturnOperatorLicenseInformationRequest{" +
                "minoperatorlicenseidparm=" + minoperatorlicenseidparm +
                ", maxoperatorlicenseidparm=" + maxoperatorlicenseidparm +
                ", minissuedateparm=" + minissuedateparm +
                ", maxissuedateparm=" + maxissuedateparm +
                ", minoperatoridparm=" + minoperatoridparm +
                ", maxoperatoridparm=" + maxoperatoridparm +
                ", minlicensestartdateparm=" + minlicensestartdateparm +
                ", maxlicensestartdateparm=" + maxlicensestartdateparm +
                ", minlicenseenddateparm=" + minlicenseenddateparm +
                ", maxlicenseenddateparm=" + maxlicenseenddateparm +
                ", minprintingdateparm=" + minprintingdateparm +
                ", maxprintingdateparm=" + maxprintingdateparm +
                ", mincounterparm=" + mincounterparm +
                ", maxcounterparm=" + maxcounterparm +
                ", operatornameparm=" + operatornameparm +
                ", operatorcategoryparm=" + operatorcategoryparm +
                ", liecencsestatusparm=" + liecencsestatusparm +
                ", pagesize=" + pagesize +
                ", pageindex=" + pageindex +
                ", sorttype=" + sorttype +
                ", sortby=" + sortby +
                '}';
    }
}