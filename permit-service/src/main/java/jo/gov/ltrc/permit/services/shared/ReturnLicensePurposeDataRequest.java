package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class ReturnLicensePurposeDataRequest {

    @ApiModelProperty("License Purpose ID ") private Long licensepurposeidparm ;
    @ApiModelProperty("License Purpose Name ") private String licensepurposenameparm ;

    public Long getLicensepurposeidparm() {
        return licensepurposeidparm;
    }

    public void setLicensepurposeidparm(Long licensepurposeidparm) {
        this.licensepurposeidparm = licensepurposeidparm;
    }

    public String getLicensepurposenameparm() {
        return licensepurposenameparm;
    }

    public void setLicensepurposenameparm(String licensepurposenameparm) {
        this.licensepurposenameparm = licensepurposenameparm;
    }

    @Override
    public String toString() {
        return "ReturnLicensePurposeDataRequest{" +
                "licensepurposeidparm=" + licensepurposeidparm +
                ", licensepurposenameparm=" + licensepurposenameparm +
                '}';
    }
}



