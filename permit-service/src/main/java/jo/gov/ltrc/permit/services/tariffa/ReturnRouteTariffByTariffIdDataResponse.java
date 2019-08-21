package jo.gov.ltrc.permit.services.tariffa;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

@NamedStoredProcedureQuery(
        name = "ReturnRouteTariffByTariffaID",
        procedureName = "\"ReturnRouteTariffByTariffaID\"",
        parameters = {


                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),

        }
        ,
        resultSetMappings = {
                "ReturnRouteTariffByTariffaIDDataSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnRouteTariffByTariffaIDDataSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnRouteTariffByTariffIdDataResponse.class)
                }
        )
})
@Entity
public class ReturnRouteTariffByTariffIdDataResponse implements Serializable {

    @Id
    @ApiModelProperty("Route ID ") private Long routeid ;
    @ApiModelProperty("Route Name ") private String routename ;
    @ApiModelProperty("Value P") private  Double valuep ;
    @ApiModelProperty("Vehicle Category ") private Long vehiclecategory ;
    @ApiModelProperty("Vehicle Category Name ") private String vehiclecategoryname ;
    @ApiModelProperty("Fuel Type ") private Long fueltype ;
    @ApiModelProperty("Fuel Type Name ") private String fueltypename ;
    @ApiModelProperty("based On ") private Integer basedon ;
    @ApiModelProperty("Tariffa Equation ") private Long tariffeqution ;
    @ApiModelProperty("Tariffa Study ") private Long tariffstudy ;

    public Long getRouteid() {
        return routeid;
    }

    public void setRouteid(Long routeid) {
        this.routeid = routeid;
    }

    public String getRoutename() {
        return routename;
    }

    public void setRoutename(String routename) {
        this.routename = routename;
    }

    public Double getValuep() {
        return valuep;
    }

    public void setValuep(Double valuep) {
        this.valuep = valuep;
    }

    public Long getVehiclecategory() {
        return vehiclecategory;
    }

    public void setVehiclecategory(Long vehiclecategory) {
        this.vehiclecategory = vehiclecategory;
    }

    public String getVehiclecategoryname() {
        return vehiclecategoryname;
    }

    public void setVehiclecategoryname(String vehiclecategoryname) {
        this.vehiclecategoryname = vehiclecategoryname;
    }

    public Long getFueltype() {
        return fueltype;
    }

    public void setFueltype(Long fueltype) {
        this.fueltype = fueltype;
    }

    public String getFueltypename() {
        return fueltypename;
    }

    public void setFueltypename(String fueltypename) {
        this.fueltypename = fueltypename;
    }

    public Integer getBasedon() {
        return basedon;
    }

    public void setBasedon(Integer basedon) {
        this.basedon = basedon;
    }

    public Long getTariffeqution() {
        return tariffeqution;
    }

    public void setTariffeqution(Long tariffeqution) {
        this.tariffeqution = tariffeqution;
    }

    public Long getTariffstudy() {
        return tariffstudy;
    }

    public void setTariffstudy(Long tariffstudy) {
        this.tariffstudy = tariffstudy;
    }

    @Override
    public String toString() {
        return "ReturnRouteTariffByTariffIdDataResponse{" +
                "routeid=" + routeid +
                ", routename=" + routename +
                ", valuep=" + valuep +
                ", vehiclecategory=" + vehiclecategory +
                ", vehiclecategoryname=" + vehiclecategoryname +
                ", fueltype=" + fueltype +
                ", fueltypename=" + fueltypename +
                ", basedon=" + basedon +
                ", tariffeqution=" + tariffeqution +
                ", tariffstudy=" + tariffstudy +
                '}';
    }
}
