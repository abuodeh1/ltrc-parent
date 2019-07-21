package jo.gov.ltrc.permit.services.permit;


import io.swagger.annotations.ApiModelProperty;

public class ReturnPermitTypeDataRequest {

    @ApiModelProperty("Permit Type ID Parameter ") private long permittypeidparm ;
    @ApiModelProperty("Permit Type Name Parameter ") private String permittypenameparm ;
    @ApiModelProperty("Permit Type English Name  Parameter ") private String permittypeenglishnameparm ;
    @ApiModelProperty("Page Size Parameter ") private int pagesize ;
    @ApiModelProperty("Page Index Parameter ") private int pageindex ;
    @ApiModelProperty("Sort Type Parameter ") private int sorttype ;
    @ApiModelProperty("Sort By Parameter ") private String sortby ;

    public long getPermittypeidparm() {
        return permittypeidparm;
    }

    public void setPermittypeidparm(long permittypeidparm) {
        this.permittypeidparm = permittypeidparm;
    }

    public String getPermittypenameparm() {
        return permittypenameparm;
    }

    public void setPermittypenameparm(String permittypenameparm) {
        this.permittypenameparm = permittypenameparm;
    }

    public String getPermittypeenglishnameparm() {
        return permittypeenglishnameparm;
    }

    public void setPermittypeenglishnameparm(String permittypeenglishnameparm) {
        this.permittypeenglishnameparm = permittypeenglishnameparm;
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