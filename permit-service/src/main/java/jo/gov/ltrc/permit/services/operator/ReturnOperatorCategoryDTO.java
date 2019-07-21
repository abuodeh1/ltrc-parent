package jo.gov.ltrc.permit.services.operator;


import java.util.List;

public class ReturnOperatorCategoryDTO {

    private long operatorcategoryid ;
    private String operatorcategoryname ;
    private String operatorcategoryenglishname ;
    private long operatorcategoryclassification ;
    private String operatorclassificationname ;
    private long operatorcategorydepartment ;
    private String servicedepartmentname ;
    private long vehiclecategory ;
    private String vehiclecategoryname ;
    private long plateclassification ;
    private String plateclassificationname ;
    private long linetype ;
    private String linetypename ;
    private List<ReturnOperatorCategoryFieldSettingResponse> field ;

    public long getOperatorcategoryid() {
        return operatorcategoryid;
    }

    public void setOperatorcategoryid(long operatorcategoryid) {
        this.operatorcategoryid = operatorcategoryid;
    }

    public String getOperatorcategoryname() {
        return operatorcategoryname;
    }

    public void setOperatorcategoryname(String operatorcategoryname) {
        this.operatorcategoryname = operatorcategoryname;
    }

    public String getOperatorcategoryenglishname() {
        return operatorcategoryenglishname;
    }

    public void setOperatorcategoryenglishname(String operatorcategoryenglishname) {
        this.operatorcategoryenglishname = operatorcategoryenglishname;
    }

    public long getOperatorcategoryclassification() {
        return operatorcategoryclassification;
    }

    public void setOperatorcategoryclassification(long operatorcategoryclassification) {
        this.operatorcategoryclassification = operatorcategoryclassification;
    }

    public String getOperatorclassificationname() {
        return operatorclassificationname;
    }

    public void setOperatorclassificationname(String operatorclassificationname) {
        this.operatorclassificationname = operatorclassificationname;
    }

    public long getOperatorcategorydepartment() {
        return operatorcategorydepartment;
    }

    public void setOperatorcategorydepartment(long operatorcategorydepartment) {
        this.operatorcategorydepartment = operatorcategorydepartment;
    }

    public String getServicedepartmentname() {
        return servicedepartmentname;
    }

    public void setServicedepartmentname(String servicedepartmentname) {
        this.servicedepartmentname = servicedepartmentname;
    }

    public long getVehiclecategory() {
        return vehiclecategory;
    }

    public void setVehiclecategory(long vehiclecategory) {
        this.vehiclecategory = vehiclecategory;
    }

    public String getVehiclecategoryname() {
        return vehiclecategoryname;
    }

    public void setVehiclecategoryname(String vehiclecategoryname) {
        this.vehiclecategoryname = vehiclecategoryname;
    }

    public long getPlateclassification() {
        return plateclassification;
    }

    public void setPlateclassification(long plateclassification) {
        this.plateclassification = plateclassification;
    }

    public String getPlateclassificationname() {
        return plateclassificationname;
    }

    public void setPlateclassificationname(String plateclassificationname) {
        this.plateclassificationname = plateclassificationname;
    }

    public long getLinetype() {
        return linetype;
    }

    public void setLinetype(long linetype) {
        this.linetype = linetype;
    }

    public String getLinetypename() {
        return linetypename;
    }

    public void setLinetypename(String linetypename) {
        this.linetypename = linetypename;
    }

    public List<ReturnOperatorCategoryFieldSettingResponse> getField() {
        return field;
    }

    public void setField(List<ReturnOperatorCategoryFieldSettingResponse> field) {
        this.field = field;
    }
}
