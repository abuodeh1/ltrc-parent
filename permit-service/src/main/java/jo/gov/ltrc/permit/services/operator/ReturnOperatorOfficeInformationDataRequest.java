package jo.gov.ltrc.permit.services.operator;


import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class ReturnOperatorOfficeInformationDataRequest {

    @ApiModelProperty("Certification Registration Number Parameter ") private String certificateregistrationnumberparm ;
    @ApiModelProperty("Commercial Record Number Parameter ") private String commercialrecordnumberparm ;
    @ApiModelProperty("Commercial Name Record Number Parameter ") private String commercialnamerecordnumberparm ;
    @ApiModelProperty("Minimum Employees Number Parameter ") private Integer minemployeesnumberparm ;
    @ApiModelProperty("Maximum Employees Number Parameter ") private Integer maxemployeesnumberparm ;
    @ApiModelProperty("Minimum Drivers Number Parameter ") private Integer mindriversnumberparm ;
    @ApiModelProperty("Maximum Drivers Number Parameter ") private Integer maxdriversnumberparm ;
    @ApiModelProperty("Minimum Basic Cars Number Parameter ") private Integer minbasiccarsnumberparm ;
    @ApiModelProperty("Maximum Basic Cars Number Parameter ") private Integer maxbasiccarsnumberparm ;
    @ApiModelProperty("Minimum Working Cars Number Parameter ") private Integer minworkingcarsnumberparm ;
    @ApiModelProperty("Maximum Working Cars Number Parameter ") private Integer maxworkingcarsnumberparm ;
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

    public Integer getMinemployeesnumberparm() {
        return minemployeesnumberparm;
    }

    public void setMinemployeesnumberparm(Integer minemployeesnumberparm) {
        this.minemployeesnumberparm = minemployeesnumberparm;
    }

    public Integer getMaxemployeesnumberparm() {
        return maxemployeesnumberparm;
    }

    public void setMaxemployeesnumberparm(Integer maxemployeesnumberparm) {
        this.maxemployeesnumberparm = maxemployeesnumberparm;
    }

    public Integer getMindriversnumberparm() {
        return mindriversnumberparm;
    }

    public void setMindriversnumberparm(Integer mindriversnumberparm) {
        this.mindriversnumberparm = mindriversnumberparm;
    }

    public Integer getMaxdriversnumberparm() {
        return maxdriversnumberparm;
    }

    public void setMaxdriversnumberparm(Integer maxdriversnumberparm) {
        this.maxdriversnumberparm = maxdriversnumberparm;
    }

    public Integer getMinbasiccarsnumberparm() {
        return minbasiccarsnumberparm;
    }

    public void setMinbasiccarsnumberparm(Integer minbasiccarsnumberparm) {
        this.minbasiccarsnumberparm = minbasiccarsnumberparm;
    }

    public Integer getMaxbasiccarsnumberparm() {
        return maxbasiccarsnumberparm;
    }

    public void setMaxbasiccarsnumberparm(Integer maxbasiccarsnumberparm) {
        this.maxbasiccarsnumberparm = maxbasiccarsnumberparm;
    }

    public Integer getMinworkingcarsnumberparm() {
        return minworkingcarsnumberparm;
    }

    public void setMinworkingcarsnumberparm(Integer minworkingcarsnumberparm) {
        this.minworkingcarsnumberparm = minworkingcarsnumberparm;
    }

    public Integer getMaxworkingcarsnumberparm() {
        return maxworkingcarsnumberparm;
    }

    public void setMaxworkingcarsnumberparm(Integer maxworkingcarsnumberparm) {
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

    @Override
    public String toString() {
        return "ReturnOperatorOfficeInformationDataRequest{" +
                "certificateregistrationnumberparm=" + certificateregistrationnumberparm +
                ", commercialrecordnumberparm=" + commercialrecordnumberparm +
                ", commercialnamerecordnumberparm=" + commercialnamerecordnumberparm +
                ", minemployeesnumberparm=" + minemployeesnumberparm +
                ", maxemployeesnumberparm=" + maxemployeesnumberparm +
                ", mindriversnumberparm=" + mindriversnumberparm +
                ", maxdriversnumberparm=" + maxdriversnumberparm +
                ", minbasiccarsnumberparm=" + minbasiccarsnumberparm +
                ", maxbasiccarsnumberparm=" + maxbasiccarsnumberparm +
                ", minworkingcarsnumberparm=" + minworkingcarsnumberparm +
                ", maxworkingcarsnumberparm=" + maxworkingcarsnumberparm +
                ", servicescopeparm=" + servicescopeparm +
                ", officeclosingdateparm=" + officeclosingdateparm +
                '}';
    }
}
