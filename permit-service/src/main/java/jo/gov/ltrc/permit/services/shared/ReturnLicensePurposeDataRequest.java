package jo.gov.ltrc.permit.services.shared;


public class ReturnLicensePurposeDataRequest {

    private long licensepurposeidparm ;
    private String licensepurposenameparm ;

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
}



