package jo.gov.ltrc.permit.services.operator;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@NamedStoredProcedureQuery(
        name = "ReturnVehicleInformation",
        procedureName = "\"ReturnVehicleInformation\"",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "registrationnumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "platecodeparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "platenumberparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "manufacturerparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "officenameparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "vehiclestatusparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "vehiclecategoryparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "fueltypeparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatorparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "permitstatusparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "permitidparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "vehicleentrydateparm"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "deliverydateparm")

        },
        resultSetMappings = {
                "ReturnVehicleInformationSetMapping"
        }
)
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ReturnVehicleInformationSetMapping",
                entities = {
                        @EntityResult(entityClass = ReturnVehicleInformationResponse.class)
                }
        )
})
@Entity
@Getter @Setter
public class ReturnVehicleInformationResponse implements Serializable {

    @Id
    @ApiModelProperty("Vehicle ID ") private Long vehicleid ;
    @ApiModelProperty("Registration Number ") private String registrationnumber ;
    @ApiModelProperty("Plate code ") private String platecode ;
    @ApiModelProperty("Plate Number ") private String platenumber ;
    @ApiModelProperty("Status ") private Integer status ;
    @ApiModelProperty("Fees Status ") private Integer feesstatus ;
    @ApiModelProperty("End Working Date ") private Date endworkingdate ;
    @ApiModelProperty("Operator Name ") private String operatorname ;

    public Long getVehicleid() {
        return vehicleid;
    }

    public void setVehicleid(Long vehicleid) {
        this.vehicleid = vehicleid;
    }

    public String getRegistrationnumber() {
        return registrationnumber;
    }

    public void setRegistrationnumber(String registrationnumber) {
        this.registrationnumber = registrationnumber;
    }

    public String getPlatecode() {
        return platecode;
    }

    public void setPlatecode(String platecode) {
        this.platecode = platecode;
    }

    public String getPlatenumber() {
        return platenumber;
    }

    public void setPlatenumber(String platenumber) {
        this.platenumber = platenumber;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getFeesstatus() {
        return feesstatus;
    }

    public void setFeesstatus(Integer feesstatus) {
        this.feesstatus = feesstatus;
    }

    public Date getEndworkingdate() {
        return endworkingdate;
    }

    public void setEndworkingdate(Date endworkingdate) {
        this.endworkingdate = endworkingdate;
    }

    public String getOperatorname() {
        return operatorname;
    }

    public void setOperatorname(String operatorname) {
        this.operatorname = operatorname;
    }

    @Override
    public String toString() {
        return "ReturnVehicleInformationResponse{" +
                "vehicleid=" + vehicleid +
                ", registrationnumber=" + registrationnumber +
                ", platecode=" + platecode +
                ", platenumber=" + platenumber +
                ", status=" + status +
                ", feesstatus=" + feesstatus +
                ", endworkingdate=" + endworkingdate +
                ", operatorname=" + operatorname +
                '}';
    }
}
