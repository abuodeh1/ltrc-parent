package jo.gov.ltrc.sharedservices.permits.line;


import io.swagger.annotations.ApiModelProperty;

public class SaveLineDataRequest {

    @ApiModelProperty("Line Name Parameter") private String linenameparm ;
    @ApiModelProperty("Allow Temporary Permit Parameter ") private boolean allowtemporarypermitparm ;
    @ApiModelProperty("Line ID Parameter") private long lineidparm ;
    @ApiModelProperty("Province ID Parameter") private long provinceidparm ;
    @ApiModelProperty("Governorate ID Parameter") private long governorateidparm ;
    @ApiModelProperty("Line Type Parameter") private long linetypeparm ;
    @ApiModelProperty("Start Point Parameter") private long stratpointparm ;
    @ApiModelProperty("End Point Parameter") private long endpointparm ;
    @ApiModelProperty("Remarks Parameter") private String remarksparm ;
    @ApiModelProperty("Line Status Parameter") private int linestatusparm ;


    public String getLinenameparm() {
        return linenameparm;
    }

    public void setLinenameparm(String linenameparm) {
        this.linenameparm = linenameparm;
    }

    public boolean isAllowtemporarypermitparm() {
        return allowtemporarypermitparm;
    }

    public void setAllowtemporarypermitparm(boolean allowtemporarypermitparm) {
        this.allowtemporarypermitparm = allowtemporarypermitparm;
    }

    public long getLineidparm() {
        return lineidparm;
    }

    public void setLineidparm(long lineidparm) {
        this.lineidparm = lineidparm;
    }

    public long getProvinceidparm() {
        return provinceidparm;
    }

    public void setProvinceidparm(long provinceidparm) {
        this.provinceidparm = provinceidparm;
    }

    public long getGovernorateidparm() {
        return governorateidparm;
    }

    public void setGovernorateidparm(long governorateidparm) {
        this.governorateidparm = governorateidparm;
    }

    public long getLinetypeparm() {
        return linetypeparm;
    }

    public void setLinetypeparm(long linetypeparm) {
        this.linetypeparm = linetypeparm;
    }

    public long getStratpointparm() {
        return stratpointparm;
    }

    public void setStratpointparm(long stratpointparm) {
        this.stratpointparm = stratpointparm;
    }

    public long getEndpointparm() {
        return endpointparm;
    }

    public void setEndpointparm(long endpointparm) {
        this.endpointparm = endpointparm;
    }

    public String getRemarksparm() {
        return remarksparm;
    }

    public void setRemarksparm(String remarksparm) {
        this.remarksparm = remarksparm;
    }

    public int getLinestatusparm() {
        return linestatusparm;
    }

    public void setLinestatusparm(int linestatusparm) {
        this.linestatusparm = linestatusparm;
    }
}



