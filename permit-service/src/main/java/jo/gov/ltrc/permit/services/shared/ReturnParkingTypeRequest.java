package jo.gov.ltrc.permit.services.shared;


import io.swagger.annotations.ApiModelProperty;

public class ReturnParkingTypeRequest {

    @ApiModelProperty("Parking Type ID Parameter ") private long parkingtypeidparm ;
    @ApiModelProperty("Parking Type Arabic Name Parameter ") private String parkingtypearabicnameparm ;
    @ApiModelProperty("Parking Type English Name Parameter ") private String parkingtypeenglishnameparm ;

    public long getParkingtypeidparm() {
        return parkingtypeidparm;
    }

    public void setParkingtypeidparm(long parkingtypeidparm) {
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
}



