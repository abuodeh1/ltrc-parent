package jo.gov.ltrc.sharedservices.permits.line;

import javax.persistence.*;
import java.io.Serializable;

@NamedStoredProcedureQuery(
        name = "ReturnRouteTariffByLineID",
        procedureName = "\"ReturnRouteTariffByLineID\"",
        parameters = {

                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
        }
        ,
        resultSetMappings = {
                "ReturnRouteTariffByLineIDDataSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnRouteTariffByLineIDDataSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnRouteTariffByLineIDResponse.class)
                }
        )
})
@Entity
public class ReturnRouteTariffByLineIDResponse implements Serializable {

    @Id
    private long routeid ;
    private String routename ;
    private double valuep ;
    private long vehiclecategory ;
    private String vehiclecategoryname ;
    private long fueltype ;
    private String fueltypename ;
    private int basedon ;
    private long tariffeqution ;
    private long tariffstudy ;

    public long getRouteid() {
        return routeid;
    }

    public void setRouteid(long routeid) {
        this.routeid = routeid;
    }

    public String getRoutename() {
        return routename;
    }

    public void setRoutename(String routename) {
        this.routename = routename;
    }

    public double getValuep() {
        return valuep;
    }

    public void setValuep(double valuep) {
        this.valuep = valuep;
    }

    public long getVehiclecategory() {
        return vehiclecategory;
    }

    public void setVehiclecategory(long vehiclecategory) {
        this.vehiclecategory = vehiclecategory;
    }

    public String getVehiclecategoryname() {
        return vehiclecategoryname;
    }

    public void setVehiclecategoryname(String vehiclecategoryname) {
        this.vehiclecategoryname = vehiclecategoryname;
    }

    public long getFueltype() {
        return fueltype;
    }

    public void setFueltype(long fueltype) {
        this.fueltype = fueltype;
    }

    public String getFueltypename() {
        return fueltypename;
    }

    public void setFueltypename(String fueltypename) {
        this.fueltypename = fueltypename;
    }

    public int getBasedon() {
        return basedon;
    }

    public void setBasedon(int basedon) {
        this.basedon = basedon;
    }

    public long getTariffeqution() {
        return tariffeqution;
    }

    public void setTariffeqution(long tariffeqution) {
        this.tariffeqution = tariffeqution;
    }

    public long getTariffstudy() {
        return tariffstudy;
    }

    public void setTariffstudy(long tariffstudy) {
        this.tariffstudy = tariffstudy;
    }
}
