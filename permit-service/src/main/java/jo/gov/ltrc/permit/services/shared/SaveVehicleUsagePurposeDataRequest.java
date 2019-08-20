package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class SaveVehicleUsagePurposeDataRequest {

    @ApiModelProperty("Usage Purpose ID Parameter ") private Long usagepurposeidparm ;
    @ApiModelProperty("Usage Purpose Name Parameter ") private String usagepurposenameparm ;
    @ApiModelProperty("Principal Parameter ") private Long princepel ;
    @ApiModelProperty("Status Parameter ") private Integer statusparm ;


    public Long getUsagepurposeidparm() {
        return usagepurposeidparm;
    }

    public void setUsagepurposeidparm(long usagepurposeidparm) {
        this.usagepurposeidparm = usagepurposeidparm;
    }

    public String getUsagepurposenameparm() {
        return usagepurposenameparm;
    }

    public void setUsagepurposenameparm(String usagepurposenameparm) {
        this.usagepurposenameparm = usagepurposenameparm;
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



