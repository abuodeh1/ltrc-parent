package jo.gov.ltrc.permit.services.operator;


import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class SaveOperatorCategroyDataRequest {

    @ApiModelProperty("Operator Category ID Parameter ") private long operatorcategoryidparm ;
    @ApiModelProperty("Operator Category Name Parameter ") private String operatorcategorynameparm ;
    @ApiModelProperty("Operator Category English Parameter ") private String operatorcategoryenglishnameparm ;
    @ApiModelProperty("Operator Category Classification Parameter ") private long operatorcategoryclassificationparm ;
    @ApiModelProperty("Operator Category Department Parameter ") private long operatorcategorydepartmentparm ;
    @ApiModelProperty("Vehicle Category Parameter ") private long vehiclecategoryparm ;
    @ApiModelProperty("Plate Classification Parameter ") private long plateclassificationparm ;
    @ApiModelProperty("Line Type Parameter ") private long linetypeparm ;
    @ApiModelProperty("Principal Parameter ") private long princepel ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;
    @ApiModelProperty("List of Field Settings ") private List<SaveOperatorCategoryFieldSettingDataRequest> field ;

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

    public long getOperatorcategorydepartmentparm() {
        return operatorcategorydepartmentparm;
    }

    public void setOperatorcategorydepartmentparm(long operatorcategorydepartmentparm) {
        this.operatorcategorydepartmentparm = operatorcategorydepartmentparm;
    }

    public long getVehiclecategoryparm() {
        return vehiclecategoryparm;
    }

    public void setVehiclecategoryparm(long vehiclecategoryparm) {
        this.vehiclecategoryparm = vehiclecategoryparm;
    }

    public long getPlateclassificationparm() {
        return plateclassificationparm;
    }

    public void setPlateclassificationparm(long plateclassificationparm) {
        this.plateclassificationparm = plateclassificationparm;
    }

    public long getLinetypeparm() {
        return linetypeparm;
    }

    public void setLinetypeparm(long linetypeparm) {
        this.linetypeparm = linetypeparm;
    }

    public long getPrincepel() {
        return princepel;
    }

    public void setPrincepel(long princepel) {
        this.princepel = princepel;
    }

    public int getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(int statusparm) {
        this.statusparm = statusparm;
    }

    public List<SaveOperatorCategoryFieldSettingDataRequest> getField() {
        return field;
    }

    public void setField(List<SaveOperatorCategoryFieldSettingDataRequest> field) {
        this.field = field;
    }
}
