package jo.gov.ltrc.permit.services.permit;


import io.swagger.annotations.ApiModelProperty;

public class ReturnPermitTypeFieldDataRequest {

    @ApiModelProperty("Permit Field ID Parameter ") private long permitfieldidparm ;
    @ApiModelProperty("Permit Field Name Parameter ") private String permitfieldnameparm ;
    @ApiModelProperty("Permit Field Section Parameter ") private int permitfieldsectionparm ;
    @ApiModelProperty("Permit Field Section Name Parameter ") private String permitfieldsectionnameparm ;

    public long getPermitfieldidparm() {
        return permitfieldidparm;
    }

    public void setPermitfieldidparm(long permitfieldidparm) {
        this.permitfieldidparm = permitfieldidparm;
    }

    public String getPermitfieldnameparm() {
        return permitfieldnameparm;
    }

    public void setPermitfieldnameparm(String permitfieldnameparm) {
        this.permitfieldnameparm = permitfieldnameparm;
    }

    public int getPermitfieldsectionparm() {
        return permitfieldsectionparm;
    }

    public void setPermitfieldsectionparm(int permitfieldsectionparm) {
        this.permitfieldsectionparm = permitfieldsectionparm;
    }

    public String getPermitfieldsectionnameparm() {
        return permitfieldsectionnameparm;
    }

    public void setPermitfieldsectionnameparm(String permitfieldsectionnameparm) {
        this.permitfieldsectionnameparm = permitfieldsectionnameparm;
    }
}