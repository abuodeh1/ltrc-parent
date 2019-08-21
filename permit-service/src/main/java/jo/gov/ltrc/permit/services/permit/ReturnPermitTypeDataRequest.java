package jo.gov.ltrc.permit.services.permit;


import io.swagger.annotations.ApiModelProperty;

public class ReturnPermitTypeDataRequest {

    @ApiModelProperty("Permit Type ID Parameter ") private Long permittypeidparm ;
    @ApiModelProperty("Permit Type Name Parameter ") private String permittypenameparm ;
    @ApiModelProperty("Permit Type English Name  Parameter ") private String permittypeenglishnameparm ;
    @ApiModelProperty("Page Size Parameter ") private Integer pagesize ;
    @ApiModelProperty("Page Index Parameter ") private Integer pageindex ;
    @ApiModelProperty("Sort Type Parameter ") private Integer sorttype ;
    @ApiModelProperty("Sort By Parameter ") private String sortby ;

    public Long getPermittypeidparm() {
        return permittypeidparm;
    }

    public void setPermittypeidparm(Long permittypeidparm) {
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
        return "ReturnPermitTypeDataRequest{" +
                "permittypeidparm=" + permittypeidparm +
                ", permittypenameparm=" + permittypenameparm +
                ", permittypeenglishnameparm=" + permittypeenglishnameparm +
                ", pagesize=" + pagesize +
                ", pageindex=" + pageindex +
                ", sorttype=" + sorttype +
                ", sortby=" + sortby +
                '}';
    }
}