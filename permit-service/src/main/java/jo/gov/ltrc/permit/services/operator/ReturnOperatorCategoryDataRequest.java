package com.etech.ltrc.permits.operator;


import io.swagger.annotations.ApiModelProperty;

public class ReturnOperatorCategoryDataRequest {

    @ApiModelProperty("Operator Category ID Parameter ") private long operatorcategoryidparm ;
    @ApiModelProperty("Operator Category Name Parameter ") private String operatorcategorynameparm ;
    @ApiModelProperty("Operator Category English Name Parameter ") private String operatorcategoryenglishnameparm ;
    @ApiModelProperty("Operator Category Classification Parameter ") private long operatorcategoryclassificationparm ;
    @ApiModelProperty("Operator Classification Name Parameter ") private String operatorclassificationnameparm ;
    @ApiModelProperty("Operator Category Department Parameter ") private long operatorcategorydepartmentparm ;
    @ApiModelProperty("Service Department Name Parameter ") private String servicedepartmentnameparm ;
    @ApiModelProperty("Vehicle Category Parameter ") private long vehiclecategoryparm ;
    @ApiModelProperty("Vehicle Category Name Parameter ") private String vehiclecategorynameparm ;
    @ApiModelProperty("Plate Classification Parameter ") private long plateclassificationparm ;
    @ApiModelProperty("Plate Classification Name Parameter ") private String plateclassificationnameparm ;
    @ApiModelProperty("Line Type Parameter ") private long linetypeparm ;
    @ApiModelProperty("Line Type Name Parameter ") private String linetypenameparm ;
    @ApiModelProperty("Page Size Parameter ") private int pagesize ;
    @ApiModelProperty("Page Index Parameter ") private int pageindex ;
    @ApiModelProperty("Sort Type Parameter ") private int sorttype ;
    @ApiModelProperty("Sort By Parameter ") private String sortby ;


    public long getOperatorcategoryidparm() {
        return operatorcategoryidparm;
    }

    public void setOperatorcategoryidparm(long operatorcategoryidparm) {
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

    public long getOperatorcategoryclassificationparm() {
        return operatorcategoryclassificationparm;
    }

    public void setOperatorcategoryclassificationparm(long operatorcategoryclassificationparm) {
        this.operatorcategoryclassificationparm = operatorcategoryclassificationparm;
    }

    public String getOperatorclassificationnameparm() {
        return operatorclassificationnameparm;
    }

    public void setOperatorclassificationnameparm(String operatorclassificationnameparm) {
        this.operatorclassificationnameparm = operatorclassificationnameparm;
    }

    public long getOperatorcategorydepartmentparm() {
        return operatorcategorydepartmentparm;
    }

    public void setOperatorcategorydepartmentparm(long operatorcategorydepartmentparm) {
        this.operatorcategorydepartmentparm = operatorcategorydepartmentparm;
    }

    public String getServicedepartmentnameparm() {
        return servicedepartmentnameparm;
    }

    public void setServicedepartmentnameparm(String servicedepartmentnameparm) {
        this.servicedepartmentnameparm = servicedepartmentnameparm;
    }

    public long getVehiclecategoryparm() {
        return vehiclecategoryparm;
    }

    public void setVehiclecategoryparm(long vehiclecategoryparm) {
        this.vehiclecategoryparm = vehiclecategoryparm;
    }

    public String getVehiclecategorynameparm() {
        return vehiclecategorynameparm;
    }

    public void setVehiclecategorynameparm(String vehiclecategorynameparm) {
        this.vehiclecategorynameparm = vehiclecategorynameparm;
    }

    public long getPlateclassificationparm() {
        return plateclassificationparm;
    }

    public void setPlateclassificationparm(long plateclassificationparm) {
        this.plateclassificationparm = plateclassificationparm;
    }

    public String getPlateclassificationnameparm() {
        return plateclassificationnameparm;
    }

    public void setPlateclassificationnameparm(String plateclassificationnameparm) {
        this.plateclassificationnameparm = plateclassificationnameparm;
    }

    public long getLinetypeparm() {
        return linetypeparm;
    }

    public void setLinetypeparm(long linetypeparm) {
        this.linetypeparm = linetypeparm;
    }

    public String getLinetypenameparm() {
        return linetypenameparm;
    }

    public void setLinetypenameparm(String linetypenameparm) {
        this.linetypenameparm = linetypenameparm;
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
