package jo.gov.ltrc.permit.services.shared;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "SaveCharacteristicData",
                procedureName = "\"SaveCharacteristicData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),

                }
        ),

        @NamedStoredProcedureQuery(
                name = "SaveCountryData",
                procedureName = "\"SaveCountryData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                }
        ),

        @NamedStoredProcedureQuery(
                name = "SaveProvinceData",
                procedureName = "\"SaveProvinceData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                }
        ),

        @NamedStoredProcedureQuery(
                name = "SaveGovernorateData",
                procedureName = "\"SaveGovernorateData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                }
        ),

        @NamedStoredProcedureQuery(
                name = "SaveMunicipalityData",
                procedureName = "\"SaveMunicipalityData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                }
        ),

        @NamedStoredProcedureQuery(
                name = "SaveTerritoryData",
                procedureName = "\"SaveTerritoryData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                }
        ),

        @NamedStoredProcedureQuery(
                name = "SaveParkingTypeData",
                procedureName = "\"SaveParkingTypeData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                }
        ),

        @NamedStoredProcedureQuery(
                name = "SaveLineTypeData",
                procedureName = "\"SaveLineTypeData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                }
        ),

        @NamedStoredProcedureQuery(
                name = "SaveVehicleCategoryData",
                procedureName = "\"SaveVehicleCategoryData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                }
        ),

        @NamedStoredProcedureQuery(
                name = "SaveFuelTypeData",
                procedureName = "\"SaveFuelTypeData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                }
        ),

        @NamedStoredProcedureQuery(
                name = "SaveLicensepurposeData",
                procedureName = "\"SaveLicensepurposeData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                }
        ),

        @NamedStoredProcedureQuery(
                name = "SaveVehicleUsagePurposeData",
                procedureName = "\"SaveVehicleUsagePurposeData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                }
        ),

        @NamedStoredProcedureQuery(
                name = "SaveViolationTypeData",
                procedureName = "\"SaveViolationTypeData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                }
        ),

        @NamedStoredProcedureQuery(
                name = "SaveViolationSubjectData",
                procedureName = "\"SaveViolationSubjectData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                }
        ),

        @NamedStoredProcedureQuery(
                name = "SaveViolationPenaltyData",
                procedureName = "\"SaveViolationPenaltyData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                }
        ),

        @NamedStoredProcedureQuery(
                name = "SavePlateClassificationData",
                procedureName = "\"SavePlateClassificationData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                }
        ),

        @NamedStoredProcedureQuery(
                name = "SaveServiceDepartmentData",
                procedureName = "\"SaveServiceDepartmentData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                }
        ),

        @NamedStoredProcedureQuery(
                name = "SaveTransportationClassData",
                procedureName = "\"SaveTransportationClassData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                }
        ),

        @NamedStoredProcedureQuery(
                name = "SavePeriodCalssData",
                procedureName = "\"SavePeriodCalssData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                }
        ),

        @NamedStoredProcedureQuery(
                name = "SaveOperatorClassificationData",
                procedureName = "\"SaveOperatorClassificationData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class),
                }
        ),

})


@Entity
public class SingleResult implements Serializable {

    @Id
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
