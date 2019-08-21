package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class ReturnOperatorScreenSectionDataRequest {

    @ApiModelProperty("Operator Field Section Parameter ") private Integer operatorfieldsectionparm ;
    @ApiModelProperty("Section Name Parameter ") private String sectionnameparm ;

    public Integer getOperatorfieldsectionparm() {
        return operatorfieldsectionparm;
    }

    public void setOperatorfieldsectionparm(Integer operatorfieldsectionparm) {
        this.operatorfieldsectionparm = operatorfieldsectionparm;
    }

    public String getSectionnameparm() {
        return sectionnameparm;
    }

    public void setSectionnameparm(String sectionnameparm) {
        this.sectionnameparm = sectionnameparm;
    }

    @Override
    public String toString() {
        return "ReturnOperatorScreenSectionDataRequest{" +
                "operatorfieldsectionparm=" + operatorfieldsectionparm +
                ", sectionnameparm=" + sectionnameparm +
                '}';
    }
}



