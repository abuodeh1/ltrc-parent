package jo.gov.ltrc.permit.services.operator;


import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class SaveOperatorCategroyDataRequest {

    @ApiModelProperty("Operator Category ID Parameter ") private Long operatorcategoryidparm ;
    @ApiModelProperty("Operator Category Name Parameter ") private String operatorcategorynameparm ;
    @ApiModelProperty("Operator Category English Parameter ") private String operatorcategoryenglishnameparm ;
    @ApiModelProperty("Operator Category Classification Parameter ") private Long operatorcategoryclassificationparm ;
    @ApiModelProperty("Operator Category Department Parameter ") private Long operatorcategorydepartmentparm ;
    @ApiModelProperty("Vehicle Category Parameter ") private Long vehiclecategoryparm ;
    @ApiModelProperty("Plate Classification Parameter ") private Long plateclassificationparm ;
    @ApiModelProperty("Line Type Parameter ") private Long linetypeparm ;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;
    @ApiModelProperty("IP Address") private String ipaddressparm  ;
    @ApiModelProperty("List of Field Settings ") private List<SaveOperatorCategoryFieldSettingDataRequest> field ;

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

    public Long getOperatorcategorydepartmentparm() {
        return operatorcategorydepartmentparm;
    }

    public void setOperatorcategorydepartmentparm(Long operatorcategorydepartmentparm) {
        this.operatorcategorydepartmentparm = operatorcategorydepartmentparm;
    }

    public Long getVehiclecategoryparm() {
        return vehiclecategoryparm;
    }

    public void setVehiclecategoryparm(Long vehiclecategoryparm) {
        this.vehiclecategoryparm = vehiclecategoryparm;
    }

    public Long getPlateclassificationparm() {
        return plateclassificationparm;
    }

    public void setPlateclassificationparm(Long plateclassificationparm) {
        this.plateclassificationparm = plateclassificationparm;
    }

    public Long getLinetypeparm() {
        return linetypeparm;
    }

    public void setLinetypeparm(Long linetypeparm) {
        this.linetypeparm = linetypeparm;
    }

    public Long getPrincepel() {
        return princepel;
    }

    public void setPrincepel(Long princepel) {
        this.princepel = princepel;
    }

    public Integer getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(Integer statusparm) {
        this.statusparm = statusparm;
    }

    public String getIpaddressparm() {
        return ipaddressparm;
    }

    public void setIpaddressparm(String ipaddressparm) {
        this.ipaddressparm = ipaddressparm;
    }

    public List<SaveOperatorCategoryFieldSettingDataRequest> getField() {
        return field;
    }

    public void setField(List<SaveOperatorCategoryFieldSettingDataRequest> field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "SaveOperatorCategroyDataRequest{" +
                "operatorcategoryidparm=" + operatorcategoryidparm +
                ", operatorcategorynameparm=" + operatorcategorynameparm +
                ", operatorcategoryenglishnameparm=" + operatorcategoryenglishnameparm +
                ", operatorcategoryclassificationparm=" + operatorcategoryclassificationparm +
                ", operatorcategorydepartmentparm=" + operatorcategorydepartmentparm +
                ", vehiclecategoryparm=" + vehiclecategoryparm +
                ", plateclassificationparm=" + plateclassificationparm +
                ", linetypeparm=" + linetypeparm +
                ", princepel=" + princepel +
                ", statusparm=" + statusparm +
                ", ipaddressparam=" + ipaddressparm +
                ", field=" + field +
                '}';
    }
}
