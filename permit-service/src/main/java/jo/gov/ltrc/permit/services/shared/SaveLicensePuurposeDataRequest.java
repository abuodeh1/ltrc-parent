package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveLicensePuurposeDataRequest {

    @ApiModelProperty("License Purpose ID Parameter ") private Long licensepurposeidparm ;
    @ApiModelProperty("License Purpose Name Parameter ") private String licensepurposenameparm ;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;

    public Long getLicensepurposeidparm() {
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

    public Long getPrincepel() {
        return princepel;
    }

    public void setPrincepel(long princepel) {
        this.princepel = princepel;
    }

    public Integer getStatusparm() {
        return statusparm;
    }

    public void setStatusparm(int statusparm) {
        this.statusparm = statusparm;
    }
}



