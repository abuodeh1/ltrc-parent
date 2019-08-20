package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class ReturnServiceDepartmentDataRequest {

    @ApiModelProperty("Service Department ID Parameter") private Long servicedepartmentidparm ;
    @ApiModelProperty("Service Department Name Parameter") private String servicedepartmentnameparm ;

    public Long getServicedepartmentidparm() {
        return servicedepartmentidparm;
    }

    public void setServicedepartmentidparm(Long servicedepartmentidparm) {
        this.servicedepartmentidparm = servicedepartmentidparm;
    }

    public String getServicedepartmentnameparm() {
        return servicedepartmentnameparm;
    }

    public void setServicedepartmentnameparm(String servicedepartmentnameparm) {
        this.servicedepartmentnameparm = servicedepartmentnameparm;
    }

    @Override
    public String toString() {
        return "ReturnServiceDepartmentDataRequest{" +
                "servicedepartmentidparm=" + servicedepartmentidparm +
                ", servicedepartmentnameparm=" + servicedepartmentnameparm +
                '}';
    }
}



