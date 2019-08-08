package jo.gov.ltrc.permit.services.operator;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class ReturnOperatorOfficeInformationDataRequest {

    @ApiModelProperty("Certification Registration Number Parameter ") private String certificateregistrationnumberparm ;
    @ApiModelProperty("Commercial Record Number Parameter ") private String commercialrecordnumberparm ;
    @ApiModelProperty("Commercial Name Record Number Parameter ") private String commercialnamerecordnumberparm ;
    @ApiModelProperty("Minimum Employees Number Parameter ") private int minemployeesnumberparm ;
    @ApiModelProperty("Maximum Employees Number Parameter ") private int maxemployeesnumberparm ;
    @ApiModelProperty("Minimum Drivers Number Parameter ") private int mindriversnumberparm ;
    @ApiModelProperty("Maximum Drivers Number Parameter ") private int maxdriversnumberparm ;
    @ApiModelProperty("Minimum Basic Cars Number Parameter ") private int minbasiccarsnumberparm ;
    @ApiModelProperty("Maximum Basic Cars Number Parameter ") private int maxbasiccarsnumberparm ;
    @ApiModelProperty("Minimum Working Cars Number Parameter ") private int minworkingcarsnumberparm ;
    @ApiModelProperty("Maximum Working Cars Number Parameter ") private int maxworkingcarsnumberparm ;
    @ApiModelProperty("Service Scope Parameter ") private String servicescopeparm ;
    @ApiModelProperty("Office Closing Date Parameter ") private Date officeclosingdateparm ;

    public String getCertificateregistrationnumberparm() {
        return certificateregistrationnumberparm;
    }

    public void setCertificateregistrationnumberparm(String certificateregistrationnumberparm) {
        this.certificateregistrationnumberparm = certificateregistrationnumberparm;
    }

    public String getCommercialrecordnumberparm() {
        return commercialrecordnumberparm;
    }

    public void setCommercialrecordnumberparm(String commercialrecordnumberparm) {
        this.commercialrecordnumberparm = commercialrecordnumberparm;
    }

    public String getCommercialnamerecordnumberparm() {
        return commercialnamerecordnumberparm;
    }

    public void setCommercialnamerecordnumberparm(String commercialnamerecordnumberparm) {
        this.commercialnamerecordnumberparm = commercialnamerecordnumberparm;
    }

    public int getMinemployeesnumberparm() {
        return minemployeesnumberparm;
    }

    public void setMinemployeesnumberparm(int minemployeesnumberparm) {
        this.minemployeesnumberparm = minemployeesnumberparm;
    }

    public int getMaxemployeesnumberparm() {
        return maxemployeesnumberparm;
    }

    public void setMaxemployeesnumberparm(int maxemployeesnumberparm) {
        this.maxemployeesnumberparm = maxemployeesnumberparm;
    }

    public int getMindriversnumberparm() {
        return mindriversnumberparm;
    }

    public void setMindriversnumberparm(int mindriversnumberparm) {
        this.mindriversnumberparm = mindriversnumberparm;
    }

    public int getMaxdriversnumberparm() {
        return maxdriversnumberparm;
    }

    public void setMaxdriversnumberparm(int maxdriversnumberparm) {
        this.maxdriversnumberparm = maxdriversnumberparm;
    }

    public int getMinbasiccarsnumberparm() {
        return minbasiccarsnumberparm;
    }

    public void setMinbasiccarsnumberparm(int minbasiccarsnumberparm) {
        this.minbasiccarsnumberparm = minbasiccarsnumberparm;
    }

    public int getMaxbasiccarsnumberparm() {
        return maxbasiccarsnumberparm;
    }

    public void setMaxbasiccarsnumberparm(int maxbasiccarsnumberparm) {
        this.maxbasiccarsnumberparm = maxbasiccarsnumberparm;
    }

    public int getMinworkingcarsnumberparm() {
        return minworkingcarsnumberparm;
    }

    public void setMinworkingcarsnumberparm(int minworkingcarsnumberparm) {
        this.minworkingcarsnumberparm = minworkingcarsnumberparm;
    }

    public int getMaxworkingcarsnumberparm() {
        return maxworkingcarsnumberparm;
    }

    public void setMaxworkingcarsnumberparm(int maxworkingcarsnumberparm) {
        this.maxworkingcarsnumberparm = maxworkingcarsnumberparm;
    }

    public String getServicescopeparm() {
        return servicescopeparm;
    }

    public void setServicescopeparm(String servicescopeparm) {
        this.servicescopeparm = servicescopeparm;
    }

    public Date getOfficeclosingdateparm() {
        return officeclosingdateparm;
    }

    public void setOfficeclosingdateparm(Date officeclosingdateparm) {
        this.officeclosingdateparm = officeclosingdateparm;
    }
}
