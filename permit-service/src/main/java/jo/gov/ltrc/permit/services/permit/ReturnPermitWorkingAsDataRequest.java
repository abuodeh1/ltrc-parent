package jo.gov.ltrc.permit.services.permit;


import io.swagger.annotations.ApiModelProperty;

public class ReturnPermitWorkingAsDataRequest {

   @ApiModelProperty("Permit Working As ID Parameter ") private long permitworkingasidparm ;
   @ApiModelProperty("Permit Working As Name Parameter ") private String permitworkingasnameparm ;
   @ApiModelProperty("Page Size Parameter ") private int pagesize ;
   @ApiModelProperty("Page IndexParameter ") private int pageindex ;
   @ApiModelProperty("Sort Type Parameter ") private int sorttype ;
   @ApiModelProperty("Sort By Parameter ") private String sortby ;

    public long getPermitworkingasidparm() {
        return permitworkingasidparm;
    }

    public void setPermitworkingasidparm(long permitworkingasidparm) {
        this.permitworkingasidparm = permitworkingasidparm;
    }

    public String getPermitworkingasnameparm() {
        return permitworkingasnameparm;
    }

    public void setPermitworkingasnameparm(String permitworkingasnameparm) {
        this.permitworkingasnameparm = permitworkingasnameparm;
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