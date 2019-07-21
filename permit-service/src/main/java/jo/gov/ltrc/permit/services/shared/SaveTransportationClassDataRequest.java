package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveTransportationClassDataRequest {

    @ApiModelProperty("Violation Type ID Parameter ") private long transportationclassidparm;
    @ApiModelProperty("Violation Type Name Parameter ") private String transportationclassnameparm;
    @ApiModelProperty("Principal Parameter ") private long princepel ;
    @ApiModelProperty("Status Parameter ") private int statusparm ;


    public long getTransportationclassidparm() {
        return transportationclassidparm;
    }

    public void setTransportationclassidparm(long transportationclassidparm) {
        this.transportationclassidparm = transportationclassidparm;
    }

    public String getTransportationclassnameparm() {
        return transportationclassnameparm;
    }

    public void setTransportationclassnameparm(String transportationclassnameparm) {
        this.transportationclassnameparm = transportationclassnameparm;
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



