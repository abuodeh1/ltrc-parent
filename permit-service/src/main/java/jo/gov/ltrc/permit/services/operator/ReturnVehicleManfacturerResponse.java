package jo.gov.ltrc.permit.services.operator;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQuery(
        name = "ReturnVehicleManfacturer",
        procedureName = "\"ReturnVehicleManfacturer\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "vehiclemanfactureridparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "vehiclemanfacturerarabicnameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "vehiclemanfacturerenglishnameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "vehiclemanfacturercodeparm"),


        },
        resultSetMappings = {
                "ReturnVehicleManfacturerSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnVehicleManfacturerSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnVehicleManfacturerResponse.class)
                }
        )
})
@Entity
public class ReturnVehicleManfacturerResponse implements Serializable {

    @Id
    private Long vehiclemanfacturerid ;
    private String vehiclemanfacturerarabicname ;
    private String vehiclemanfacturerenglishname ;
    private String vehiclemanfacturercode ;

    public Long getVehiclemanfacturerid() {
        return vehiclemanfacturerid;
    }

    public void setVehiclemanfacturerid(Long vehiclemanfacturerid) {
        this.vehiclemanfacturerid = vehiclemanfacturerid;
    }

    public String getVehiclemanfacturerarabicname() {
        return vehiclemanfacturerarabicname;
    }

    public void setVehiclemanfacturerarabicname(String vehiclemanfacturerarabicname) {
        this.vehiclemanfacturerarabicname = vehiclemanfacturerarabicname;
    }

    public String getVehiclemanfacturerenglishname() {
        return vehiclemanfacturerenglishname;
    }

    public void setVehiclemanfacturerenglishname(String vehiclemanfacturerenglishname) {
        this.vehiclemanfacturerenglishname = vehiclemanfacturerenglishname;
    }

    public String getVehiclemanfacturercode() {
        return vehiclemanfacturercode;
    }

    public void setVehiclemanfacturercode(String vehiclemanfacturercode) {
        this.vehiclemanfacturercode = vehiclemanfacturercode;
    }

    @Override
    public String toString() {
        return "ReturnVehicleManfacturerResponse{" +
                "vehiclemanfacturerid=" + vehiclemanfacturerid +
                ", vehiclemanfacturerarabicname= " + vehiclemanfacturerarabicname + 
                ", vehiclemanfacturerenglishname= " + vehiclemanfacturerenglishname + 
                ", vehiclemanfacturercode= " + vehiclemanfacturercode + 
                '}';
    }
}
