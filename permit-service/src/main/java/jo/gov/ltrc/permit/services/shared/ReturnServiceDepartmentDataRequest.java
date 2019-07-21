package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class ReturnServiceDepartmentDataRequest {

    @ApiModelProperty("Service Department ID Parameter") private long servicedepartmentidparm ;
    @ApiModelProperty("Service Department Name Parameter") private String servicedepartmentnameparm ;

    public long getServicedepartmentidparm() {
        return servicedepartmentidparm;
    }

    public void setServicedepartmentidparm(long servicedepartmentidparm) {
        this.servicedepartmentidparm = servicedepartmentidparm;
    }

    public String getServicedepartmentnameparm() {
        return servicedepartmentnameparm;
    }

    public void setServicedepartmentnameparm(String servicedepartmentnameparm) {
        this.servicedepartmentnameparm = servicedepartmentnameparm;
    }
}



