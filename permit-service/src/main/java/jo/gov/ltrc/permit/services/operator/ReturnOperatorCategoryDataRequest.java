package jo.gov.ltrc.permit.services.operator;


import io.swagger.annotations.ApiModelProperty;

public class ReturnOperatorCategoryDataRequest {

    @ApiModelProperty("Operator Category ID Parameter ") private Long operatorcategoryidparm ;
    @ApiModelProperty("Operator Category Name Parameter ") private String operatorcategorynameparm ;
    @ApiModelProperty("Operator Category English Name Parameter ") private String operatorcategoryenglishnameparm ;
    @ApiModelProperty("Operator Category Classification Parameter ") private Long operatorcategoryclassificationparm ;
    @ApiModelProperty("Operator Classification Name Parameter ") private String operatorclassificationnameparm ;
    @ApiModelProperty("Operator Category Department Parameter ") private Long operatorcategorydepartmentparm ;
    @ApiModelProperty("Service Department Name Parameter ") private String servicedepartmentnameparm ;
    @ApiModelProperty("Vehicle Category Parameter ") private Long vehiclecategoryparm ;
    @ApiModelProperty("Vehicle Category Name Parameter ") private String vehiclecategorynameparm ;
    @ApiModelProperty("Plate Classification Parameter ") private Long plateclassificationparm ;
    @ApiModelProperty("Plate Classification Name Parameter ") private String plateclassificationnameparm ;
    @ApiModelProperty("Line Type Parameter ") private Long linetypeparm ;
    @ApiModelProperty("Line Type Name Parameter ") private String linetypenameparm ;
    @ApiModelProperty("Page Size Parameter ") private Integer pagesize ;
    @ApiModelProperty("Page Index Parameter ") private Integer pageindex ;
    @ApiModelProperty("Sort Type Parameter ") private Integer sorttype ;
    @ApiModelProperty("Sort By Parameter ") private String sortby ;

    public Long getOperatorcategoryidparm() {
        return operatorcategoryidparm;
    }

    public void setOperatorcategoryidparm(Long operatorcategoryidparm) {
        this.operatorcategoryidparm = operatorcategoryidparm;
    }

    public String getOperatorcategorynameparm() {
        return operatorcategorynameparm;
    }

    public void setOperatorcategorynameparm(String operatorcategorynameparm) {
        this.operatorcategorynameparm = operatorcategorynameparm;
    }

    public String getOperatorcategoryenglishnameparm() {
        return operatorcategoryenglishnameparm;
    }

    public void setOperatorcategoryenglishnameparm(String operatorcategoryenglishnameparm) {
        this.operatorcategoryenglishnameparm = operatorcategoryenglishnameparm;
    }

    public Long getOperatorcategoryclassificationparm() {
        return operatorcategoryclassificationparm;
    }

    public void setOperatorcategoryclassificationparm(Long operatorcategoryclassificationparm) {
        this.operatorcategoryclassificationparm = operatorcategoryclassificationparm;
    }

    public String getOperatorclassificationnameparm() {
        return operatorclassificationnameparm;
    }

    public void setOperatorclassificationnameparm(String operatorclassificationnameparm) {
        this.operatorclassificationnameparm = operatorclassificationnameparm;
    }

    public Long getOperatorcategorydepartmentparm() {
        return operatorcategorydepartmentparm;
    }

    public void setOperatorcategorydepartmentparm(Long operatorcategorydepartmentparm) {
        this.operatorcategorydepartmentparm = operatorcategorydepartmentparm;
    }

    public String getServicedepartmentnameparm() {
        return servicedepartmentnameparm;
    }

    public void setServicedepartmentnameparm(String servicedepartmentnameparm) {
        this.servicedepartmentnameparm = servicedepartmentnameparm;
    }

    public Long getVehiclecategoryparm() {
        return vehiclecategoryparm;
    }

    public void setVehiclecategoryparm(Long vehiclecategoryparm) {
        this.vehiclecategoryparm = vehiclecategoryparm;
    }

    public String getVehiclecategorynameparm() {
        return vehiclecategorynameparm;
    }

    public void setVehiclecategorynameparm(String vehiclecategorynameparm) {
        this.vehiclecategorynameparm = vehiclecategorynameparm;
    }

    public Long getPlateclassificationparm() {
        return plateclassificationparm;
    }

    public void setPlateclassificationparm(Long plateclassificationparm) {
        this.plateclassificationparm = plateclassificationparm;
    }

    public String getPlateclassificationnameparm() {
        return plateclassificationnameparm;
    }

    public void setPlateclassificationnameparm(String plateclassificationnameparm) {
        this.plateclassificationnameparm = plateclassificationnameparm;
    }

    public Long getLinetypeparm() {
        return linetypeparm;
    }

    public void setLinetypeparm(Long linetypeparm) {
        this.linetypeparm = linetypeparm;
    }

    public String getLinetypenameparm() {
        return linetypenameparm;
    }

    public void setLinetypenameparm(String linetypenameparm) {
        this.linetypenameparm = linetypenameparm;
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
        return "ReturnOperatorCategoryDataRequest{" +
                "operatorcategoryidparm=" + operatorcategoryidparm +
                ", operatorcategorynameparm=" + operatorcategorynameparm +
                ", operatorcategoryenglishnameparm=" + operatorcategoryenglishnameparm +
                ", operatorcategoryclassificationparm=" + operatorcategoryclassificationparm +
                ", operatorclassificationnameparm=" + operatorclassificationnameparm +
                ", operatorcategorydepartmentparm=" + operatorcategorydepartmentparm +
                ", servicedepartmentnameparm=" + servicedepartmentnameparm +
                ", vehiclecategoryparm=" + vehiclecategoryparm +
                ", vehiclecategorynameparm=" + vehiclecategorynameparm +
                ", plateclassificationparm=" + plateclassificationparm +
                ", plateclassificationnameparm=" + plateclassificationnameparm +
                ", linetypeparm=" + linetypeparm +
                ", linetypenameparm=" + linetypenameparm +
                ", pagesize=" + pagesize +
                ", pageindex=" + pageindex +
                ", sorttype=" + sorttype +
                ", sortby=" + sortby +
                '}';
    }
}
