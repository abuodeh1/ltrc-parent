package jo.gov.ltrc.permit.services.permit;


import io.swagger.annotations.ApiModelProperty;

public class ReturnPermitWorkingAsDataRequest {

   @ApiModelProperty("Permit Working As ID Parameter ") private Long permitworkingasidparm ;
   @ApiModelProperty("Permit Working As Name Parameter ") private String permitworkingasnameparm ;
   @ApiModelProperty("Page Size Parameter ") private Integer pagesize ;
   @ApiModelProperty("Page IndexParameter ") private Integer pageindex ;
   @ApiModelProperty("Sort Type Parameter ") private Integer sorttype ;
   @ApiModelProperty("Sort By Parameter ") private String sortby ;

    public Long getPermitworkingasidparm() {
        return permitworkingasidparm;
    }

    public void setPermitworkingasidparm(Long permitworkingasidparm) {
        this.permitworkingasidparm = permitworkingasidparm;
    }

    public String getPermitworkingasnameparm() {
        return permitworkingasnameparm;
    }

    public void setPermitworkingasnameparm(String permitworkingasnameparm) {
        this.permitworkingasnameparm = permitworkingasnameparm;
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
        return "ReturnPermitWorkingAsDataRequest{" +
                "permitworkingasidparm=" + permitworkingasidparm +
                ", permitworkingasnameparm=" + permitworkingasnameparm +
                ", pagesize=" + pagesize +
                ", pageindex=" + pageindex +
                ", sorttype=" + sorttype +
                ", sortby=" + sortby +
                '}';
    }
}