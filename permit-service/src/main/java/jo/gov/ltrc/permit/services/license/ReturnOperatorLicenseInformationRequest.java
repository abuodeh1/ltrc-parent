package jo.gov.ltrc.permit.services.license;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class ReturnOperatorLicenseInformationRequest {

    @ApiModelProperty("Minimum Operator License ID Parameter ") private long minoperatorlicenseidparm ;
    @ApiModelProperty("Maximum Operator License ID Parameter ") private long maxoperatorlicenseidparm ;
    @ApiModelProperty("Minimum Issue Date Parameter ") private Date minissuedateparm ;
    @ApiModelProperty("Maximum Issue Date Parameter ") private Date maxissuedateparm ;
    @ApiModelProperty("Minimum Operator ID Parameter ") private long minoperatoridparm ;
    @ApiModelProperty("Maximum Operator ID Parameter ") private long maxoperatoridparm ;
    @ApiModelProperty("Minimum License Start Date Parameter ") private Date minlicensestartdateparm ;
    @ApiModelProperty("Maximum License Start Date Parameter ") private Date maxlicensestartdateparm ;
    @ApiModelProperty("Minimum License End Date Parameter ") private Date minlicenseenddateparm ;
    @ApiModelProperty("Maximum License End Date Parameter ") private Date maxlicenseenddateparm ;
    @ApiModelProperty("Minimum Printing Date Parameter ") private Date minprintingdateparm ;
    @ApiModelProperty("Maximum Printing Date Parameter ") private Date maxprintingdateparm ;
    @ApiModelProperty("Minimum Counter Parameter ") private int mincounterparm ;
    @ApiModelProperty("Maximum Counter Parameter ") private int maxcounterparm ;
    @ApiModelProperty("Operator Name Parameter ") private String operatornameparm ;
    @ApiModelProperty("Operator Category Parameter ") private long operatorcategoryparm ;
    @ApiModelProperty("License Status Parameter ") private int liecencsestatusparm ;
    @ApiModelProperty("Page Size Parameter ") private int pagesize ;
    @ApiModelProperty("Page Index Parameter ") private int pageindex ;
    @ApiModelProperty("Sort Type Parameter ") private int sorttype ;
    @ApiModelProperty("Sort By Parameter ") private String sortby ;

    public long getMinoperatorlicenseidparm() {
        return minoperatorlicenseidparm;
    }

    public void setMinoperatorlicenseidparm(long minoperatorlicenseidparm) {
        this.minoperatorlicenseidparm = minoperatorlicenseidparm;
    }

    public long getMaxoperatorlicenseidparm() {
        return maxoperatorlicenseidparm;
    }

    public void setMaxoperatorlicenseidparm(long maxoperatorlicenseidparm) {
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

    public long getMinoperatoridparm() {
        return minoperatoridparm;
    }

    public void setMinoperatoridparm(long minoperatoridparm) {
        this.minoperatoridparm = minoperatoridparm;
    }

    public long getMaxoperatoridparm() {
        return maxoperatoridparm;
    }

    public void setMaxoperatoridparm(long maxoperatoridparm) {
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

    public int getMincounterparm() {
        return mincounterparm;
    }

    public void setMincounterparm(int mincounterparm) {
        this.mincounterparm = mincounterparm;
    }

    public int getMaxcounterparm() {
        return maxcounterparm;
    }

    public void setMaxcounterparm(int maxcounterparm) {
        this.maxcounterparm = maxcounterparm;
    }

    public String getOperatornameparm() {
        return operatornameparm;
    }

    public void setOperatornameparm(String operatornameparm) {
        this.operatornameparm = operatornameparm;
    }

    public long getOperatorcategoryparm() {
        return operatorcategoryparm;
    }

    public void setOperatorcategoryparm(long operatorcategoryparm) {
        this.operatorcategoryparm = operatorcategoryparm;
    }

    public int getLiecencsestatusparm() {
        return liecencsestatusparm;
    }

    public void setLiecencsestatusparm(int liecencsestatusparm) {
        this.liecencsestatusparm = liecencsestatusparm;
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