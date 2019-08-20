package jo.gov.ltrc.permit.services.permit;


import io.swagger.annotations.ApiModelProperty;

public class ReturnPermitTypeFieldDataRequest {

    @ApiModelProperty("Permit Field ID Parameter ") private Long permitfieldidparm ;
    @ApiModelProperty("Permit Field Name Parameter ") private String permitfieldnameparm ;
    @ApiModelProperty("Permit Field Section Parameter ") private Integer permitfieldsectionparm ;
    @ApiModelProperty("Permit Field Section Name Parameter ") private String permitfieldsectionnameparm ;

    public Long getPermitfieldidparm() {
        return permitfieldidparm;
    }

    public void setPermitfieldidparm(Long permitfieldidparm) {
        this.permitfieldidparm = permitfieldidparm;
    }

    public String getPermitfieldnameparm() {
        return permitfieldnameparm;
    }

    public void setPermitfieldnameparm(String permitfieldnameparm) {
        this.permitfieldnameparm = permitfieldnameparm;
    }

    public Integer getPermitfieldsectionparm() {
        return permitfieldsectionparm;
    }

    public void setPermitfieldsectionparm(Integer permitfieldsectionparm) {
        this.permitfieldsectionparm = permitfieldsectionparm;
    }

    public String getPermitfieldsectionnameparm() {
        return permitfieldsectionnameparm;
    }

    public void setPermitfieldsectionnameparm(String permitfieldsectionnameparm) {
        this.permitfieldsectionnameparm = permitfieldsectionnameparm;
    }

    @Override
    public String toString() {
        return "ReturnPermitTypeFieldDataRequest{" +
                "permitfieldidparm=" + permitfieldidparm +
                ", permitfieldnameparm=" + permitfieldnameparm +
                ", permitfieldsectionparm=" + permitfieldsectionparm +
                ", permitfieldsectionnameparm=" + permitfieldsectionnameparm +
                '}';
    }
}