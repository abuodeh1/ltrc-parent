package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class ReturnOperatorScreenSectionDataRequest {

    @ApiModelProperty("Operator Field Section Parameter ") private int operatorfieldsectionparm ;
    @ApiModelProperty("Section Name Parameter ") private String sectionnameparm ;

    public int getOperatorfieldsectionparm() {
        return operatorfieldsectionparm;
    }

    public void setOperatorfieldsectionparm(int operatorfieldsectionparm) {
        this.operatorfieldsectionparm = operatorfieldsectionparm;
    }

    public String getSectionnameparm() {
        return sectionnameparm;
    }

    public void setSectionnameparm(String sectionnameparm) {
        this.sectionnameparm = sectionnameparm;
    }
}



