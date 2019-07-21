package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveLicensePuurposeDataRequest {

    @ApiModelProperty("License Purpose ID Parameter ") private long licensepurposeidparm ;
    @ApiModelProperty("License Purpose Name Parameter ") private String licensepurposenameparm ;
    @ApiModelProperty("Principal Parameter ") private long princepel ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;

    public long getLicensepurposeidparm() {
        return licensepurposeidparm;
    }

    public void setLicensepurposeidparm(long licensepurposeidparm) {
        this.licensepurposeidparm = licensepurposeidparm;
    }

    public String getLicensepurposenameparm() {
        return licensepurposenameparm;
    }

    public void setLicensepurposenameparm(String licensepurposenameparm) {
        this.licensepurposenameparm = licensepurposenameparm;
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
}



