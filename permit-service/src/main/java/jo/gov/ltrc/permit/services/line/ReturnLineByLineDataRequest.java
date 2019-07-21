package com.etech.ltrc.permits.line;


import io.swagger.annotations.ApiModelProperty;

public class ReturnLineByLineDataRequest {

    @ApiModelProperty("Min Line ID Parameter") private long minlineidparm ;
    @ApiModelProperty("Max Line ID Parameter") private long maxlineidparm ;
    @ApiModelProperty("Line Name Parameter") private String linenameparm ;
    @ApiModelProperty("Province ID Parameter") private long provinceidparm ;
    @ApiModelProperty("Governorate ID Parameter") private long governorateidparm ;
    @ApiModelProperty("Line Type Parameter") private long linetypeparm ;
    @ApiModelProperty("Line Status Parameter") private int linestatusparm ;
    @ApiModelProperty("Line Start Point Parameter") private long linestartpoint ;
    @ApiModelProperty("Line End Point Parameter") private long lineendpont ;
    @ApiModelProperty("Route Count Parameter") private int routecountparm ;

    public long getMinlineidparm() {
        return minlineidparm;
    }

    public void setMinlineidparm(long minlineidparm) {
        this.minlineidparm = minlineidparm;
    }

    public long getMaxlineidparm() {
        return maxlineidparm;
    }

    public void setMaxlineidparm(long maxlineidparm) {
        this.maxlineidparm = maxlineidparm;
    }

    public String getLinenameparm() {
        return linenameparm;
    }

    public void setLinenameparm(String linenameparm) {
        this.linenameparm = linenameparm;
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

    public int getLinestatusparm() {
        return linestatusparm;
    }

    public void setLinestatusparm(int linestatusparm) {
        this.linestatusparm = linestatusparm;
    }

    public long getLinestartpoint() {
        return linestartpoint;
    }

    public void setLinestartpoint(long linestartpoint) {
        this.linestartpoint = linestartpoint;
    }

    public long getLineendpont() {
        return lineendpont;
    }

    public void setLineendpont(long lineendpont) {
        this.lineendpont = lineendpont;
    }

    public int getRoutecountparm() {
        return routecountparm;
    }

    public void setRoutecountparm(int routecountparm) {
        this.routecountparm = routecountparm;
    }
}



