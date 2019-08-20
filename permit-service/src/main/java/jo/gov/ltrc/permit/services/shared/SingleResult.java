package jo.gov.ltrc.permit.services.shared;

import javax.persistence.*;
import java.io.Serializable;


@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "SaveCharacteristicData",
                procedureName = "\"SaveCharacteristicData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "characteristicidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "characteristicarabicnameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "characteristicenglishnameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),

                }
        ),

        @NamedStoredProcedureQuery(
                name = "SaveCountryData",
                procedureName = "\"SaveCountryData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "countryidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "countryarabicnameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "countryenglishnameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "countrycodeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
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
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "governorateidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "governoratearabicnameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "governorateenglishnameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "governoratecodeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "countryidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "provinceidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                }
        ),

        @NamedStoredProcedureQuery(
                name = "SaveMunicipalityData",
                procedureName = "\"SaveMunicipalityData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "municipalityidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "municipalityarabicnameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "municipalityenglishnameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "municipalitycodeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "governorateidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                }
        ),

        @NamedStoredProcedureQuery(
                name = "SaveTerritoryData",
                procedureName = "\"SaveTerritoryData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "territoryidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "territoryarabicnameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "territoryenglishnameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "territorycodeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "municipalityparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                }
        ),

        @NamedStoredProcedureQuery(
                name = "SaveParkingTypeData",
                procedureName = "\"SaveParkingTypeData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "parkingtypeidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "parkingtypearabicnameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "parkingtypeenglishnameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                }
        ),

        @NamedStoredProcedureQuery(
                name = "SaveLineTypeData",
                procedureName = "\"SaveLineTypeData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "linetypeidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "linetypenameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
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
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "fueltypeidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "fueltypenameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
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
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "plateclassificationidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "plateclassificationnameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
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
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "transportationclassidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "transportationclassnameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                }
        ),

        @NamedStoredProcedureQuery(
                name = "SavePeriodCalssData",
                procedureName = "\"SavePeriodCalssData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "periodidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "periodnameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                }
        ),

        @NamedStoredProcedureQuery(
                name = "SaveOperatorClassificationData",
                procedureName = "\"SaveOperatorClassificationData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatorclassificationidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "operatorclassificationnameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                }
        ),

})


@Entity
public class SingleResult implements Serializable {

    @Id
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

        public void setId(Integer id) {
                this.id = id;
        }
}
