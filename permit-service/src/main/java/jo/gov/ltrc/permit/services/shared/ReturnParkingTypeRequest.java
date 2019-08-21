package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class ReturnParkingTypeRequest {

    @ApiModelProperty("Parking Type ID Parameter ") private Long parkingtypeidparm ;
    @ApiModelProperty("Parking Type Arabic Name Parameter ") private String parkingtypearabicnameparm ;
    @ApiModelProperty("Parking Type English Name Parameter ") private String parkingtypeenglishnameparm ;

    public Long getParkingtypeidparm() {
        return parkingtypeidparm;
    }

    public void setParkingtypeidparm(Long parkingtypeidparm) {
        this.parkingtypeidparm = parkingtypeidparm;
    }

    public String getParkingtypearabicnameparm() {
        return parkingtypearabicnameparm;
    }

    public void setParkingtypearabicnameparm(String parkingtypearabicnameparm) {
        this.parkingtypearabicnameparm = parkingtypearabicnameparm;
    }

    public String getParkingtypeenglishnameparm() {
        return parkingtypeenglishnameparm;
    }

    public void setParkingtypeenglishnameparm(String parkingtypeenglishnameparm) {
        this.parkingtypeenglishnameparm = parkingtypeenglishnameparm;
    }

    @Override
    public String toString() {
        return "ReturnParkingTypeRequest{" +
                "parkingtypeidparm=" + parkingtypeidparm +
                ", parkingtypearabicnameparm=" + parkingtypearabicnameparm +
                ", parkingtypeenglishnameparm=" + parkingtypeenglishnameparm +
                '}';
    }
}



