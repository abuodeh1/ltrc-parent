package jo.gov.ltrc.permit.services.operator;


import java.util.List;

public class ReturnOperatorCategoryDTO {

    private Long operatorcategoryid ;
    private String operatorcategoryname ;
    private String operatorcategoryenglishname ;
    private Long operatorcategoryclassification ;
    private String operatorclassificationname ;
    private Long operatorcategorydepartment ;
    private String servicedepartmentname ;
    private Long vehiclecategory ;
    private String vehiclecategoryname ;
    private Long plateclassification ;
    private String plateclassificationname ;
    private Long linetype ;
    private String linetypename ;
    private List<ReturnOperatorCategoryFieldSettingResponse> field ;

    public Long getOperatorcategoryid() {
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

    public Long getOperatorcategoryclassification() {
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

    public Long getOperatorcategorydepartment() {
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

    public Long getVehiclecategory() {
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

    public Long getPlateclassification() {
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

    public Long getLinetype() {
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
