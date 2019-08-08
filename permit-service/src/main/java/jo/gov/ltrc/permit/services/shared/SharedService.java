package jo.gov.ltrc.permit.services.shared;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import java.util.List;

@ApiResponses(value = {

        @ApiResponse(code = 500, message = "Error extracting results\n" +
                "--------- \n" +
                "Exception thrown if the response\n" +
                "does not match the mapping or data type\n" +
                "--------------------------------------------------------------------------------------------------\n" +
                "  \n"+
                "Database function doesn’t exist \n" +
                "------ \n" +
                "Exception thrown if the the data base function does not exist \n" +
                "or if the data base function does not match between request and response classes.\n ")
})
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(value = "/api")
public class SharedService {

    @PersistenceContext
    private EntityManager entityManager;




//    Start Add or Edit Methods Code

    @ApiResponses(value = {

            @ApiResponse(code = 200 , message =
                    "Number$N\n" +
                            "----------\n" +
                            "Number :  Effected rows  \n" +
                            "$ : Special character to split concatenated strings \n" +
                            "N: Indicator for new record inserted successfully \n"+
                            "-----------------------------------------------------\n" +
                            "  \n"+
                            "Number$U\n" +
                            "----------\n" +
                            "Number :  Effected rows  \n" +
                            "$ : Special character to split concatenated strings \n" +
                            "U: Indicator for update successfully \n"+
                            "-----------------------------------------------------\n" +
                            "  \n"+
                            "E$Number$TEXT\n" +
                            "----------\n" +
                            "E : Indicator for Error\n"+
                            "$ : Special character to split concatenated strings\n"+
                            "Number : DataBase System Error Number\n"+
                            "TEXT : DataBase system Error Message\n"
            )
    })
    @ApiOperation("Add or Edit Characteristic ")
    @PostMapping("/characteristic")
    public String addCharacteristic(@ApiParam("\t") @RequestBody SaveCharacteristicDataRequest saveCharacteristicDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveCharacteristicData");
        storedProcedureQuery.setParameter(1, saveCharacteristicDataRequest.getCharacteristicidparm());
        storedProcedureQuery.setParameter(2, saveCharacteristicDataRequest.getCharacteristicarabicnameparm());
        storedProcedureQuery.setParameter(3, saveCharacteristicDataRequest.getCharacteristicenglishnameparm());

        return (String) storedProcedureQuery.getSingleResult() ;
    }

    @ApiResponses(value = {

            @ApiResponse(code = 200 , message =
                    "Number$N\n" +
                            "----------\n" +
                            "Number :  Effected rows  \n" +
                            "$ : Special character to split concatenated strings \n" +
                            "N: Indicator for new record inserted successfully \n"+
                            "-----------------------------------------------------\n" +
                            "  \n"+
                            "Number$U\n" +
                            "----------\n" +
                            "Number :  Effected rows  \n" +
                            "$ : Special character to split concatenated strings \n" +
                            "U: Indicator for update successfully \n"+
                            "-----------------------------------------------------\n" +
                            "  \n"+
                            "E$Number$TEXT\n" +
                            "----------\n" +
                            "E : Indicator for Error\n"+
                            "$ : Special character to split concatenated strings\n"+
                            "Number : DataBase System Error Number\n"+
                            "TEXT : DataBase system Error Message\n"
            )
    })
    @ApiOperation("Add or Edit Country ")
    @PostMapping("/country")
    public String addCountry(@ApiParam("\t") @RequestBody SaveCountryDataRequest saveCountryDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveCountryData");
        storedProcedureQuery.setParameter(1, saveCountryDataRequest.getCountryidparm());
        storedProcedureQuery.setParameter(2, saveCountryDataRequest.getCountryarabicnameparm());
        storedProcedureQuery.setParameter(3, saveCountryDataRequest.getCountryenglishnameparm());
        storedProcedureQuery.setParameter(4, saveCountryDataRequest.getCountrycodeparm());
        storedProcedureQuery.setParameter(5, saveCountryDataRequest.getPrincepel());
        storedProcedureQuery.setParameter(6, saveCountryDataRequest.getStatusparm());

        return (String) storedProcedureQuery.getSingleResult() ;
    }

//        @ApiResponses(value = {
//
//            @ApiResponse(code = 200 , message =
//                    "Number$N\n" +
//                            "----------\n" +
//                            "Number :  Effected rows  \n" +
//                            "$ : Special character to split concatenated strings \n" +
//                            "N: Indicator for new record inserted successfully \n"+
//                            "-----------------------------------------------------\n" +
//                            "  \n"+
//                            "Number$U\n" +
//                            "----------\n" +
//                            "Number :  Effected rows  \n" +
//                            "$ : Special character to split concatenated strings \n" +
//                            "U: Indicator for update successfully \n"+
//                            "-----------------------------------------------------\n" +
//                            "  \n"+
//                            "E$Number$TEXT\n" +
//                            "----------\n" +
//                            "E : Indicator for Error\n"+
//                            "$ : Special character to split concatenated strings\n"+
//                            "Number : DataBase System Error Number\n"+
//                            "TEXT : DataBase system Error Message\n"
//            )
//    })
//    @ApiOperation("Add or Edit Province ")
//    @PostMapping("/province")
    public String addProvince(@ApiParam("\t") @RequestBody SaveProvinceDataRequest saveProvinceDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveProvinceData");
        storedProcedureQuery.setParameter(1, saveProvinceDataRequest.getProvinceidparm());
        storedProcedureQuery.setParameter(2, saveProvinceDataRequest.getProvincearabicnameparm());
        storedProcedureQuery.setParameter(3, saveProvinceDataRequest.getProvinceenglishnameparm());
        storedProcedureQuery.setParameter(4, saveProvinceDataRequest.getProvincecodeparm());
        storedProcedureQuery.setParameter(5, saveProvinceDataRequest.getCountryidparm());
        storedProcedureQuery.setParameter(6, saveProvinceDataRequest.getPrincepel());
        storedProcedureQuery.setParameter(7, saveProvinceDataRequest.getStatusparm());

        return (String) storedProcedureQuery.getSingleResult() ;
    }

    @ApiResponses(value = {

            @ApiResponse(code = 200 , message =
                    "Number$N\n" +
                            "----------\n" +
                            "Number :  Effected rows  \n" +
                            "$ : Special character to split concatenated strings \n" +
                            "N: Indicator for new record inserted successfully \n"+
                            "-----------------------------------------------------\n" +
                            "  \n"+
                            "Number$U\n" +
                            "----------\n" +
                            "Number :  Effected rows  \n" +
                            "$ : Special character to split concatenated strings \n" +
                            "U: Indicator for update successfully \n"+
                            "-----------------------------------------------------\n" +
                            "  \n"+
                            "E$Number$TEXT\n" +
                            "----------\n" +
                            "E : Indicator for Error\n"+
                            "$ : Special character to split concatenated strings\n"+
                            "Number : DataBase System Error Number\n"+
                            "TEXT : DataBase system Error Message\n"
            )
    })
    @ApiOperation("Add or Edit Governorate ")
    @PostMapping("/governorate")
    public String addGovernorate(@ApiParam("\t") @RequestBody SaveGovernorateDataRequest saveGovernorateDataRequest){

    StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveGovernorateData");
    storedProcedureQuery.setParameter(1, saveGovernorateDataRequest.getGovernorateidparm());
    storedProcedureQuery.setParameter(2, saveGovernorateDataRequest.getGovernoratearabicnameparm());
    storedProcedureQuery.setParameter(3, saveGovernorateDataRequest.getGovernorateenglishnameparm());
    storedProcedureQuery.setParameter(4, saveGovernorateDataRequest.getGovernoratecodeparm());
    storedProcedureQuery.setParameter(5, saveGovernorateDataRequest.getCountryidparm());
    storedProcedureQuery.setParameter(6, saveGovernorateDataRequest.getProvinceidparm());
    storedProcedureQuery.setParameter(7, saveGovernorateDataRequest.getPrincepel());
    storedProcedureQuery.setParameter(8, saveGovernorateDataRequest.getStatusparm());

    return (String) storedProcedureQuery.getSingleResult() ;

}

    @ApiResponses(value = {

            @ApiResponse(code = 200 , message =
                    "Number$N\n" +
                            "----------\n" +
                            "Number :  Effected rows  \n" +
                            "$ : Special character to split concatenated strings \n" +
                            "N: Indicator for new record inserted successfully \n"+
                            "-----------------------------------------------------\n" +
                            "  \n"+
                            "Number$U\n" +
                            "----------\n" +
                            "Number :  Effected rows  \n" +
                            "$ : Special character to split concatenated strings \n" +
                            "U: Indicator for update successfully \n"+
                            "-----------------------------------------------------\n" +
                            "  \n"+
                            "E$Number$TEXT\n" +
                            "----------\n" +
                            "E : Indicator for Error\n"+
                            "$ : Special character to split concatenated strings\n"+
                            "Number : DataBase System Error Number\n"+
                            "TEXT : DataBase system Error Message\n"
            )
    })
    @ApiOperation("Add or Edit Municipality ")
    @PostMapping("/municipality")
    public String addMunicipality(@ApiParam("\t") @RequestBody SaveMunicipalityDataRequest saveMunicipalityDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveMunicipalityData");
        storedProcedureQuery.setParameter(1, saveMunicipalityDataRequest.getMunicipalityidparm());
        storedProcedureQuery.setParameter(2, saveMunicipalityDataRequest.getMunicipalityarabicnameparm());
        storedProcedureQuery.setParameter(3, saveMunicipalityDataRequest.getMunicipalityenglishnameparm());
        storedProcedureQuery.setParameter(4, saveMunicipalityDataRequest.getMunicipalitycodeparm());
        storedProcedureQuery.setParameter(5, saveMunicipalityDataRequest.getGovernorateidparm());
        storedProcedureQuery.setParameter(6, saveMunicipalityDataRequest.getPrincepel());
        storedProcedureQuery.setParameter(7, saveMunicipalityDataRequest.getStatusparm());

        return (String) storedProcedureQuery.getSingleResult() ;

    }

    @ApiResponses(value = {

            @ApiResponse(code = 200 , message =
                    "Number$N\n" +
                            "----------\n" +
                            "Number :  Effected rows  \n" +
                            "$ : Special character to split concatenated strings \n" +
                            "N: Indicator for new record inserted successfully \n"+
                            "-----------------------------------------------------\n" +
                            "  \n"+
                            "Number$U\n" +
                            "----------\n" +
                            "Number :  Effected rows  \n" +
                            "$ : Special character to split concatenated strings \n" +
                            "U: Indicator for update successfully \n"+
                            "-----------------------------------------------------\n" +
                            "  \n"+
                            "E$Number$TEXT\n" +
                            "----------\n" +
                            "E : Indicator for Error\n"+
                            "$ : Special character to split concatenated strings\n"+
                            "Number : DataBase System Error Number\n"+
                            "TEXT : DataBase system Error Message\n"
            )
    })
    @ApiOperation("Add or Edit Territory ")
    @PostMapping("/territory")
    public String addTerritory(@ApiParam("\t") @RequestBody SaveTerritoryDataRequest saveTerritoryDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveTerritoryData");
        storedProcedureQuery.setParameter(1, saveTerritoryDataRequest.getTerritoryidparm());
        storedProcedureQuery.setParameter(2, saveTerritoryDataRequest.getTerritoryarabicnameparm());
        storedProcedureQuery.setParameter(3, saveTerritoryDataRequest.getTerritoryenglishnameparm());
        storedProcedureQuery.setParameter(4, saveTerritoryDataRequest.getTerritorycodeparm());
        storedProcedureQuery.setParameter(5, saveTerritoryDataRequest.getMunicipalityparm());
        storedProcedureQuery.setParameter(6, saveTerritoryDataRequest.getPrincepel());
        storedProcedureQuery.setParameter(7, saveTerritoryDataRequest.getStatusparm());

        return (String) storedProcedureQuery.getSingleResult() ;

    }

    @ApiResponses(value = {

            @ApiResponse(code = 200 , message =
                    "Number$N\n" +
                            "----------\n" +
                            "Number :  Effected rows  \n" +
                            "$ : Special character to split concatenated strings \n" +
                            "N: Indicator for new record inserted successfully \n"+
                            "-----------------------------------------------------\n" +
                            "  \n"+
                            "Number$U\n" +
                            "----------\n" +
                            "Number :  Effected rows  \n" +
                            "$ : Special character to split concatenated strings \n" +
                            "U: Indicator for update successfully \n"+
                            "-----------------------------------------------------\n" +
                            "  \n"+
                            "E$Number$TEXT\n" +
                            "----------\n" +
                            "E : Indicator for Error\n"+
                            "$ : Special character to split concatenated strings\n"+
                            "Number : DataBase System Error Number\n"+
                            "TEXT : DataBase system Error Message\n"
            )
    })
    @ApiOperation("Add or Edit Parking Type")
    @PostMapping("/parking-type")
    public String addParkingType(@ApiParam("\t") @RequestBody SaveParkingTypeDataRequest saveParkingTypeDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveParkingTypeData");
        storedProcedureQuery.setParameter(1, saveParkingTypeDataRequest.getParkingtypeidparm());
        storedProcedureQuery.setParameter(2, saveParkingTypeDataRequest.getParkingtypearabicnameparm());
        storedProcedureQuery.setParameter(3, saveParkingTypeDataRequest.getParkingtypeenglishnameparm());
        storedProcedureQuery.setParameter(4, saveParkingTypeDataRequest.getPrincepel());
        storedProcedureQuery.setParameter(5, saveParkingTypeDataRequest.getStatusparm());

        return (String) storedProcedureQuery.getSingleResult() ;
    }

    @ApiResponses(value = {

            @ApiResponse(code = 200 , message =
                    "Number$N\n" +
                            "----------\n" +
                            "Number :  Effected rows  \n" +
                            "$ : Special character to split concatenated strings \n" +
                            "N: Indicator for new record inserted successfully \n"+
                            "-----------------------------------------------------\n" +
                            "  \n"+
                            "Number$U\n" +
                            "----------\n" +
                            "Number :  Effected rows  \n" +
                            "$ : Special character to split concatenated strings \n" +
                            "U: Indicator for update successfully \n"+
                            "-----------------------------------------------------\n" +
                            "  \n"+
                            "E$Number$TEXT\n" +
                            "----------\n" +
                            "E : Indicator for Error\n"+
                            "$ : Special character to split concatenated strings\n"+
                            "Number : DataBase System Error Number\n"+
                            "TEXT : DataBase system Error Message\n"
            )
    })
    @ApiOperation("Add or Edit Line Type")
    @PostMapping("/line-type")
    public String addLineType(@ApiParam("\t") @RequestBody SaveLineTypeDataRequest saveLineTypeDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveLineTypeData");
        storedProcedureQuery.setParameter(1, saveLineTypeDataRequest.getLinetypeidparm());
        storedProcedureQuery.setParameter(2, saveLineTypeDataRequest.getLinetypenameparm());
        storedProcedureQuery.setParameter(3, saveLineTypeDataRequest.getPrincepel());
        storedProcedureQuery.setParameter(4, saveLineTypeDataRequest.getStatusparm());

        return (String) storedProcedureQuery.getSingleResult() ;
    }

//        @ApiResponses(value = {
//
//            @ApiResponse(code = 200 , message =
//                    "Number$N\n" +
//                            "----------\n" +
//                            "Number :  Effected rows  \n" +
//                            "$ : Special character to split concatenated strings \n" +
//                            "N: Indicator for new record inserted successfully \n"+
//                            "-----------------------------------------------------\n" +
//                            "  \n"+
//                            "Number$U\n" +
//                            "----------\n" +
//                            "Number :  Effected rows  \n" +
//                            "$ : Special character to split concatenated strings \n" +
//                            "U: Indicator for update successfully \n"+
//                            "-----------------------------------------------------\n" +
//                            "  \n"+
//                            "E$Number$TEXT\n" +
//                            "----------\n" +
//                            "E : Indicator for Error\n"+
//                            "$ : Special character to split concatenated strings\n"+
//                            "Number : DataBase System Error Number\n"+
//                            "TEXT : DataBase system Error Message\n"
//            )
//    })
//    @ApiOperation("Add or Edit Vehicle Category")
//    @PostMapping("/vehicle-category")
    public String addVehicleCategory(@ApiParam("\t") @RequestBody SaveVehicleCategoryDataRequest saveVehicleCategoryDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveVehicleCategoryData");
        storedProcedureQuery.setParameter(1, saveVehicleCategoryDataRequest.getVehiclecategoryidparm());
        storedProcedureQuery.setParameter(2, saveVehicleCategoryDataRequest.getVehiclecategorynameparm());
        storedProcedureQuery.setParameter(3, saveVehicleCategoryDataRequest.getPrincepel());
        storedProcedureQuery.setParameter(4, saveVehicleCategoryDataRequest.getStatusparm());

        return (String) storedProcedureQuery.getSingleResult() ;

    }

    @ApiResponses(value = {

            @ApiResponse(code = 200 , message =
                    "Number$N\n" +
                            "----------\n" +
                            "Number :  Effected rows  \n" +
                            "$ : Special character to split concatenated strings \n" +
                            "N: Indicator for new record inserted successfully \n"+
                            "-----------------------------------------------------\n" +
                            "  \n"+
                            "Number$U\n" +
                            "----------\n" +
                            "Number :  Effected rows  \n" +
                            "$ : Special character to split concatenated strings \n" +
                            "U: Indicator for update successfully \n"+
                            "-----------------------------------------------------\n" +
                            "  \n"+
                            "E$Number$TEXT\n" +
                            "----------\n" +
                            "E : Indicator for Error\n"+
                            "$ : Special character to split concatenated strings\n"+
                            "Number : DataBase System Error Number\n"+
                            "TEXT : DataBase system Error Message\n"
            )
    })
    @ApiOperation("Add or Edit Fuel Type ")
    @PostMapping("/fuel-type")
    public String addFuelType(@ApiParam("\t") @RequestBody SaveFuelTypeDateRequest saveFuelTypeDateRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveFuelTypeData");
        storedProcedureQuery.setParameter(1, saveFuelTypeDateRequest.getFueltypeidparm());
        storedProcedureQuery.setParameter(2, saveFuelTypeDateRequest.getFueltypenameparm());
        storedProcedureQuery.setParameter(3, saveFuelTypeDateRequest.getPrincepel());
        storedProcedureQuery.setParameter(4, saveFuelTypeDateRequest.getStatusparm());

        return (String) storedProcedureQuery.getSingleResult() ;
    }

//        @ApiResponses(value = {
//
//            @ApiResponse(code = 200 , message =
//                    "Number$N\n" +
//                            "----------\n" +
//                            "Number :  Effected rows  \n" +
//                            "$ : Special character to split concatenated strings \n" +
//                            "N: Indicator for new record inserted successfully \n"+
//                            "-----------------------------------------------------\n" +
//                            "  \n"+
//                            "Number$U\n" +
//                            "----------\n" +
//                            "Number :  Effected rows  \n" +
//                            "$ : Special character to split concatenated strings \n" +
//                            "U: Indicator for update successfully \n"+
//                            "-----------------------------------------------------\n" +
//                            "  \n"+
//                            "E$Number$TEXT\n" +
//                            "----------\n" +
//                            "E : Indicator for Error\n"+
//                            "$ : Special character to split concatenated strings\n"+
//                            "Number : DataBase System Error Number\n"+
//                            "TEXT : DataBase system Error Message\n"
//            )
//    })
//    @ApiOperation("Add or Edit License Purpose ")
//    @PostMapping("/license-purpose")
    public String addLicensePurpose(@ApiParam("\t") @RequestBody SaveLicensePuurposeDataRequest saveLicensePuurposeDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveLicensepurposeData");
        storedProcedureQuery.setParameter(1, saveLicensePuurposeDataRequest.getLicensepurposeidparm());
        storedProcedureQuery.setParameter(2, saveLicensePuurposeDataRequest.getLicensepurposenameparm());
        storedProcedureQuery.setParameter(3, saveLicensePuurposeDataRequest.getPrincepel());
        storedProcedureQuery.setParameter(4, saveLicensePuurposeDataRequest.getStatusparm());

        return (String) storedProcedureQuery.getSingleResult() ;

    }

//        @ApiResponses(value = {
//
//            @ApiResponse(code = 200 , message =
//                    "Number$N\n" +
//                            "----------\n" +
//                            "Number :  Effected rows  \n" +
//                            "$ : Special character to split concatenated strings \n" +
//                            "N: Indicator for new record inserted successfully \n"+
//                            "-----------------------------------------------------\n" +
//                            "  \n"+
//                            "Number$U\n" +
//                            "----------\n" +
//                            "Number :  Effected rows  \n" +
//                            "$ : Special character to split concatenated strings \n" +
//                            "U: Indicator for update successfully \n"+
//                            "-----------------------------------------------------\n" +
//                            "  \n"+
//                            "E$Number$TEXT\n" +
//                            "----------\n" +
//                            "E : Indicator for Error\n"+
//                            "$ : Special character to split concatenated strings\n"+
//                            "Number : DataBase System Error Number\n"+
//                            "TEXT : DataBase system Error Message\n"
//            )
//    })
//    @ApiOperation("Add or Edit Vehicle Usage Purpose ")
//    @PostMapping("/vehicle-usage-purpose")
    public String addVehicleUsagePurpose(@ApiParam("\t") @RequestBody SaveVehicleUsagePurposeDataRequest saveVehicleUsagePurposeDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveVehicleUsagePurposeData");
        storedProcedureQuery.setParameter(1, saveVehicleUsagePurposeDataRequest.getUsagepurposeidparm());
        storedProcedureQuery.setParameter(2, saveVehicleUsagePurposeDataRequest.getUsagepurposenameparm());
        storedProcedureQuery.setParameter(3, saveVehicleUsagePurposeDataRequest.getPrincepel());
        storedProcedureQuery.setParameter(4, saveVehicleUsagePurposeDataRequest.getStatusparm());

        return (String) storedProcedureQuery.getSingleResult() ;
    }

//        @ApiResponses(value = {
//
//            @ApiResponse(code = 200 , message =
//                    "Number$N\n" +
//                            "----------\n" +
//                            "Number :  Effected rows  \n" +
//                            "$ : Special character to split concatenated strings \n" +
//                            "N: Indicator for new record inserted successfully \n"+
//                            "-----------------------------------------------------\n" +
//                            "  \n"+
//                            "Number$U\n" +
//                            "----------\n" +
//                            "Number :  Effected rows  \n" +
//                            "$ : Special character to split concatenated strings \n" +
//                            "U: Indicator for update successfully \n"+
//                            "-----------------------------------------------------\n" +
//                            "  \n"+
//                            "E$Number$TEXT\n" +
//                            "----------\n" +
//                            "E : Indicator for Error\n"+
//                            "$ : Special character to split concatenated strings\n"+
//                            "Number : DataBase System Error Number\n"+
//                            "TEXT : DataBase system Error Message\n"
//            )
//    })
//    @ApiOperation("Add or Edit Violation Type ")
//    @PostMapping("/violation-type")
    public String addViolationType(@ApiParam("\t") @RequestBody SaveViolationTypeDataRequest saveViolationTypeDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveViolationTypeData");
        storedProcedureQuery.setParameter(1, saveViolationTypeDataRequest.getViolationtypeidparm());
        storedProcedureQuery.setParameter(2, saveViolationTypeDataRequest.getViolationtypenameparm());
        storedProcedureQuery.setParameter(3, saveViolationTypeDataRequest.getPrincepel());
        storedProcedureQuery.setParameter(4, saveViolationTypeDataRequest.getStatusparm());

        return (String) storedProcedureQuery.getSingleResult() ;
    }

//        @ApiResponses(value = {
//
//            @ApiResponse(code = 200 , message =
//                    "Number$N\n" +
//                            "----------\n" +
//                            "Number :  Effected rows  \n" +
//                            "$ : Special character to split concatenated strings \n" +
//                            "N: Indicator for new record inserted successfully \n"+
//                            "-----------------------------------------------------\n" +
//                            "  \n"+
//                            "Number$U\n" +
//                            "----------\n" +
//                            "Number :  Effected rows  \n" +
//                            "$ : Special character to split concatenated strings \n" +
//                            "U: Indicator for update successfully \n"+
//                            "-----------------------------------------------------\n" +
//                            "  \n"+
//                            "E$Number$TEXT\n" +
//                            "----------\n" +
//                            "E : Indicator for Error\n"+
//                            "$ : Special character to split concatenated strings\n"+
//                            "Number : DataBase System Error Number\n"+
//                            "TEXT : DataBase system Error Message\n"
//            )
//    })
//    @ApiOperation("Add or Edit Violation Subject ")
//    @PostMapping("/violation-subject")
    public String addViolationSubject(@ApiParam("\t") @RequestBody SaveViolationSubjectDataRequest saveViolationSubjectDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveViolationSubjectData");
        storedProcedureQuery.setParameter(1, saveViolationSubjectDataRequest.getViolationsubjectidparm());
        storedProcedureQuery.setParameter(2, saveViolationSubjectDataRequest.getViolationsubjectnameparm());
        storedProcedureQuery.setParameter(3, saveViolationSubjectDataRequest.getPrincepel());
        storedProcedureQuery.setParameter(4, saveViolationSubjectDataRequest.getStatusparm());

        return (String) storedProcedureQuery.getSingleResult() ;
    }

//        @ApiResponses(value = {
//
//            @ApiResponse(code = 200 , message =
//                    "Number$N\n" +
//                            "----------\n" +
//                            "Number :  Effected rows  \n" +
//                            "$ : Special character to split concatenated strings \n" +
//                            "N: Indicator for new record inserted successfully \n"+
//                            "-----------------------------------------------------\n" +
//                            "  \n"+
//                            "Number$U\n" +
//                            "----------\n" +
//                            "Number :  Effected rows  \n" +
//                            "$ : Special character to split concatenated strings \n" +
//                            "U: Indicator for update successfully \n"+
//                            "-----------------------------------------------------\n" +
//                            "  \n"+
//                            "E$Number$TEXT\n" +
//                            "----------\n" +
//                            "E : Indicator for Error\n"+
//                            "$ : Special character to split concatenated strings\n"+
//                            "Number : DataBase System Error Number\n"+
//                            "TEXT : DataBase system Error Message\n"
//            )
//    })
//    @ApiOperation("Add or Edit Violation Penalty ")
//    @PostMapping("/violation-penalty")
    public String addViolationPenalty(@ApiParam("\t") @RequestBody SaveViolationPenaltyDataRequest saveViolationPenaltyDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveViolationPenaltyData");
        storedProcedureQuery.setParameter(1, saveViolationPenaltyDataRequest.getViolationpenaltyidparm());
        storedProcedureQuery.setParameter(2, saveViolationPenaltyDataRequest.getViolationpenaltynameparm());
        storedProcedureQuery.setParameter(3, saveViolationPenaltyDataRequest.getPrincepel());
        storedProcedureQuery.setParameter(4, saveViolationPenaltyDataRequest.getStatusparm());

        return (String) storedProcedureQuery.getSingleResult() ;
    }

    @ApiResponses(value = {

            @ApiResponse(code = 200 , message =
                    "Number$N\n" +
                            "----------\n" +
                            "Number :  Effected rows  \n" +
                            "$ : Special character to split concatenated strings \n" +
                            "N: Indicator for new record inserted successfully \n"+
                            "-----------------------------------------------------\n" +
                            "  \n"+
                            "Number$U\n" +
                            "----------\n" +
                            "Number :  Effected rows  \n" +
                            "$ : Special character to split concatenated strings \n" +
                            "U: Indicator for update successfully \n"+
                            "-----------------------------------------------------\n" +
                            "  \n"+
                            "E$Number$TEXT\n" +
                            "----------\n" +
                            "E : Indicator for Error\n"+
                            "$ : Special character to split concatenated strings\n"+
                            "Number : DataBase System Error Number\n"+
                            "TEXT : DataBase system Error Message\n"
            )
    })
    @ApiOperation("Add or Edit Plate Classification ")
    @PostMapping("/plate-classification")
    public String addPlateClassification(@ApiParam("\t") @RequestBody SavePlateClassificationDataRequest savePlateClassificationDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SavePlateClassificationData");
        storedProcedureQuery.setParameter(1, savePlateClassificationDataRequest.getPlateclassificationidparm());
        storedProcedureQuery.setParameter(2, savePlateClassificationDataRequest.getPlateclassificationnameparm());
        storedProcedureQuery.setParameter(3, savePlateClassificationDataRequest.getPrincepel());
        storedProcedureQuery.setParameter(4, savePlateClassificationDataRequest.getStatusparm());

        return (String) storedProcedureQuery.getSingleResult() ;

    }

//        @ApiResponses(value = {
//
//            @ApiResponse(code = 200 , message =
//                    "Number$N\n" +
//                            "----------\n" +
//                            "Number :  Effected rows  \n" +
//                            "$ : Special character to split concatenated strings \n" +
//                            "N: Indicator for new record inserted successfully \n"+
//                            "-----------------------------------------------------\n" +
//                            "  \n"+
//                            "Number$U\n" +
//                            "----------\n" +
//                            "Number :  Effected rows  \n" +
//                            "$ : Special character to split concatenated strings \n" +
//                            "U: Indicator for update successfully \n"+
//                            "-----------------------------------------------------\n" +
//                            "  \n"+
//                            "E$Number$TEXT\n" +
//                            "----------\n" +
//                            "E : Indicator for Error\n"+
//                            "$ : Special character to split concatenated strings\n"+
//                            "Number : DataBase System Error Number\n"+
//                            "TEXT : DataBase system Error Message\n"
//            )
//    })
//    @ApiOperation("Add or Edit Service Department ")
//    @PostMapping("/services-department")
    public String addServiceDepartment(@ApiParam("\t")@RequestBody SaveServiceDepartmentDataRequest saveServiceDepartmentDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveServiceDepartmentData");
        storedProcedureQuery.setParameter(1, saveServiceDepartmentDataRequest.getServicedepartmentidparm());
        storedProcedureQuery.setParameter(2, saveServiceDepartmentDataRequest.getServicedepartmentnameparm());
        storedProcedureQuery.setParameter(3, saveServiceDepartmentDataRequest.getPrincepel());
        storedProcedureQuery.setParameter(4, saveServiceDepartmentDataRequest.getStatusparm());

        return (String) storedProcedureQuery.getSingleResult() ;

    }

    @ApiResponses(value = {

            @ApiResponse(code = 200 , message =
                    "Number$N\n" +
                            "----------\n" +
                            "Number :  Effected rows  \n" +
                            "$ : Special character to split concatenated strings \n" +
                            "N: Indicator for new record inserted successfully \n"+
                            "-----------------------------------------------------\n" +
                            "  \n"+
                            "Number$U\n" +
                            "----------\n" +
                            "Number :  Effected rows  \n" +
                            "$ : Special character to split concatenated strings \n" +
                            "U: Indicator for update successfully \n"+
                            "-----------------------------------------------------\n" +
                            "  \n"+
                            "E$Number$TEXT\n" +
                            "----------\n" +
                            "E : Indicator for Error\n"+
                            "$ : Special character to split concatenated strings\n"+
                            "Number : DataBase System Error Number\n"+
                            "TEXT : DataBase system Error Message\n"
            )
    })
    @ApiOperation("Add or Edit Transportation Class ")
    @PostMapping("/transportation-class")
    public String addTransportationClass(@ApiParam("\t") @RequestBody SaveTransportationClassDataRequest saveTransportationClassDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveTransportationClassData");
        storedProcedureQuery.setParameter(1, saveTransportationClassDataRequest.getTransportationclassidparm());
        storedProcedureQuery.setParameter(2, saveTransportationClassDataRequest.getTransportationclassnameparm());
        storedProcedureQuery.setParameter(3, saveTransportationClassDataRequest.getPrincepel());
        storedProcedureQuery.setParameter(4, saveTransportationClassDataRequest.getStatusparm());

        return (String) storedProcedureQuery.getSingleResult() ;

    }

    @ApiResponses(value = {

            @ApiResponse(code = 200 , message =
                    "Number$N\n" +
                            "----------\n" +
                            "Number :  Effected rows  \n" +
                            "$ : Special character to split concatenated strings \n" +
                            "N: Indicator for new record inserted successfully \n"+
                            "-----------------------------------------------------\n" +
                            "  \n"+
                            "Number$U\n" +
                            "----------\n" +
                            "Number :  Effected rows  \n" +
                            "$ : Special character to split concatenated strings \n" +
                            "U: Indicator for update successfully \n"+
                            "-----------------------------------------------------\n" +
                            "  \n"+
                            "E$Number$TEXT\n" +
                            "----------\n" +
                            "E : Indicator for Error\n"+
                            "$ : Special character to split concatenated strings\n"+
                            "Number : DataBase System Error Number\n"+
                            "TEXT : DataBase system Error Message\n"
            )
    })
    @ApiOperation("Add or Edit Period Class ")
    @PostMapping("/period-class")
    public String addPeriodClass(@ApiParam("\t") @RequestBody SavePeriodCalssDataRequest savePeriodCalssDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SavePeriodCalssData");
        storedProcedureQuery.setParameter(1, savePeriodCalssDataRequest.getPeriodidparm());
        storedProcedureQuery.setParameter(2, savePeriodCalssDataRequest.getPeriodnameparm());
        storedProcedureQuery.setParameter(3, savePeriodCalssDataRequest.getPrincepel());
        storedProcedureQuery.setParameter(4, savePeriodCalssDataRequest.getStatusparm());

        return (String) storedProcedureQuery.getSingleResult() ;
    }

    @ApiResponses(value = {

            @ApiResponse(code = 200 , message =
                    "Number$N\n" +
                            "----------\n" +
                            "Number :  Effected rows  \n" +
                            "$ : Special character to split concatenated strings \n" +
                            "N: Indicator for new record inserted successfully \n"+
                            "-----------------------------------------------------\n" +
                            "  \n"+
                            "Number$U\n" +
                            "----------\n" +
                            "Number :  Effected rows  \n" +
                            "$ : Special character to split concatenated strings \n" +
                            "U: Indicator for update successfully \n"+
                            "-----------------------------------------------------\n" +
                            "  \n"+
                            "E$Number$TEXT\n" +
                            "----------\n" +
                            "E : Indicator for Error\n"+
                            "$ : Special character to split concatenated strings\n"+
                            "Number : DataBase System Error Number\n"+
                            "TEXT : DataBase system Error Message\n"
            )
    })
    @ApiOperation("Add or Edit Operator Classification ")
    @PostMapping("/operator-classification")
    public String addOperatorClassification(@ApiParam("\t") @RequestBody SaveOperatorClassificationDataRequest saveOperatorClassificationDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveOperatorClassificationData");
        storedProcedureQuery.setParameter(1, saveOperatorClassificationDataRequest.getOperatorclassificationidparm());
        storedProcedureQuery.setParameter(2, saveOperatorClassificationDataRequest.getOperatorclassificationnameparm());
        storedProcedureQuery.setParameter(3, saveOperatorClassificationDataRequest.getPrincepel());
        storedProcedureQuery.setParameter(4, saveOperatorClassificationDataRequest.getStatusparm());

        return (String) storedProcedureQuery.getSingleResult() ;
    }



//    End Add or Edit Methods Code


//    Start Retrieve Methods Code


    @ApiOperation("Retrieved List of Countries")
    @PostMapping("/country/find")
    public List<ReturnCountryResponse> findCountry(@ApiParam("\t") @RequestBody ReturnCountryRequest countryRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnCountry");
        storedProcedureQuery.setParameter(1, countryRequest.getCountryidparm());
        storedProcedureQuery.setParameter(2, countryRequest.getCountryarabicnameparm());
        storedProcedureQuery.setParameter(3, countryRequest.getCountryenglishnameparm());
        storedProcedureQuery.setParameter(4, countryRequest.getCountrycodeparm());

        List<ReturnCountryResponse> result = storedProcedureQuery.getResultList();

        return result;
    }

    @ApiOperation("Retrieve List of Regions")
    @PostMapping("/region/find")
    public List<ReturnRegionResponse> findRegion(@ApiParam("\t") @RequestBody ReturnRegionRequest returnRegionRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnProvince");
        storedProcedureQuery.setParameter(1, returnRegionRequest.getProvinceidparm());
        storedProcedureQuery.setParameter(2, returnRegionRequest.getProvincearabicnameparm());
        storedProcedureQuery.setParameter(3, returnRegionRequest.getProvinceenglishnameparm());
        storedProcedureQuery.setParameter(4, returnRegionRequest.getProvincecodeparm());
        storedProcedureQuery.setParameter(5, returnRegionRequest.getCountryidparm());

        List<ReturnRegionResponse> result = storedProcedureQuery.getResultList();

        return result;

    }

    @ApiOperation("Retrieve List of Governorates")
    @PostMapping("/governorate/find")
    public List<ReturnGovernerateResponse> findGovernerate(@ApiParam("\t") @RequestBody ReturnGovernerateRequest governerateRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnGovernorate");
        storedProcedureQuery.setParameter(1, governerateRequest.getGovernorateidparm());
        storedProcedureQuery.setParameter(2, governerateRequest.getGovernoratearabicnameparm());
        storedProcedureQuery.setParameter(3, governerateRequest.getGovernorateenglishnameparm());
        storedProcedureQuery.setParameter(4, governerateRequest.getGovernoratecodeparm());
        storedProcedureQuery.setParameter(5, governerateRequest.getCountryidparm());
        storedProcedureQuery.setParameter(6, governerateRequest.getProvinceidparm());

        List<ReturnGovernerateResponse> result = storedProcedureQuery.getResultList();

        return result;

    }

    @ApiOperation("Retrieve List of Municipalities")
    @PostMapping("/municipality/find")
    public List<ReturnMunicipalityResponse> findMunicipality(@ApiParam("\t") @RequestBody ReturnMunicipalityRequest municipalityRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnMunicipality");
        storedProcedureQuery.setParameter(1, municipalityRequest.getMunicipalityidparm());
        storedProcedureQuery.setParameter(2, municipalityRequest.getMunicipalityarabicnameparm());
        storedProcedureQuery.setParameter(3, municipalityRequest.getMunicipalityenglishnameparm());
        storedProcedureQuery.setParameter(4, municipalityRequest.getMunicipalitycodeparm());
        storedProcedureQuery.setParameter(5, municipalityRequest.getGovernorateidparm());


        List<ReturnMunicipalityResponse> result = storedProcedureQuery.getResultList();

        return result;

    }

    @ApiOperation("Retrieve List of Areas")
    @PostMapping("/area/find")
    public List<ReturnAreaResponse> findArea(@ApiParam("\t") @RequestBody ReturnAreaRequest returnAreaRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnTerritory");
        storedProcedureQuery.setParameter(1, returnAreaRequest.getTerritoryidparm());
        storedProcedureQuery.setParameter(2, returnAreaRequest.getTerritoryarabicnameparm());
        storedProcedureQuery.setParameter(3, returnAreaRequest.getTerritoryenglishnameparm());
        storedProcedureQuery.setParameter(4, returnAreaRequest.getTerritorycodeparm());
        storedProcedureQuery.setParameter(5, returnAreaRequest.getMunicipalityparm());


        List<ReturnAreaResponse> result = storedProcedureQuery.getResultList();

        return result;

    }

    @ApiOperation("Retrieve All Vehicle Categories")
    @GetMapping("/vehicle-categories")
    public List<ReturnVehicleCategoriesResponse> getAllVehicleCategories(){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnAllVehicleCategories");

        List<ReturnVehicleCategoriesResponse> result = storedProcedureQuery.getResultList();

        return result ;
    }

    @ApiOperation("Retrieve All Fuel Types")
    @GetMapping("/fuel-type")
    public List<ReturnFuelTypesResponse> getAllFuelTypes(){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnAllFuelTypes");

        List<ReturnFuelTypesResponse> result = storedProcedureQuery.getResultList();

        return result ;
    }

    @ApiOperation("Retrieve All Characteristics")
    @GetMapping("/Characteristic")
    public List<ReturnAllCharacteristicResponse> getAllCharacteristic(){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnAllCharacteristic");

        List<ReturnAllCharacteristicResponse> result = storedProcedureQuery.getResultList() ;

        return result ;
    }

    @ApiOperation("Retrieve Operator Classification")
    @PostMapping("/operator-classification/find")
    public List<ReturnOperatorClassificationDataResponse> getOperatorClassification(@ApiParam("\t") @RequestBody  ReturnOperatorClassificationDataRequest returnOperatorClassificationDataRequest ){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnOperatorClassification");
        storedProcedureQuery.setParameter(1, returnOperatorClassificationDataRequest.getOperatorclassificationidparm());
        storedProcedureQuery.setParameter(2, returnOperatorClassificationDataRequest.getOperatorclassificationnameparm());

        List<ReturnOperatorClassificationDataResponse> result = storedProcedureQuery.getResultList();

        return result;
    }

    @ApiOperation("Retrieve License Purpose")
    @PostMapping("/license-purpose/find")
    public  List<ReturnLicensePurposeDataResponse> getLicensePurpose(@ApiParam("\t") @RequestBody ReturnLicensePurposeDataRequest returnLicensePurposeDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnLicensepurpose");
        storedProcedureQuery.setParameter(1, returnLicensePurposeDataRequest.getLicensepurposeidparm());
        storedProcedureQuery.setParameter(2, returnLicensePurposeDataRequest.getLicensepurposenameparm());

        List<ReturnLicensePurposeDataResponse> result = storedProcedureQuery.getResultList();

        return result ;
    }

    @ApiOperation("Retrieve Plate Classification ")
    @PostMapping("/plate-classification/find")
    public List<ReturnPlateClassificationResponse> getPlateClassification(@ApiParam("\t") @RequestBody ReturnPlateClassificationDataRequest returnPlateClassificationDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnPlateClassification");
        storedProcedureQuery.setParameter(1, returnPlateClassificationDataRequest.getPlateclassificationidparm());
        storedProcedureQuery.setParameter(2, returnPlateClassificationDataRequest.getPlateclassificationnameparm());

        List<ReturnPlateClassificationResponse> result = storedProcedureQuery.getResultList();

        return result ;
    }

    @ApiOperation("Retrieve Operator Screen Section Data ")
    @PostMapping("/operator-screen/find")
    public List<ReturnOperatorScreenSectionResponse> getOperatorScreenSection(@ApiParam("\t") @RequestBody ReturnOperatorScreenSectionDataRequest returnOperatorScreenSectionDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnOperatorScreenSection");
        storedProcedureQuery.setParameter(1, returnOperatorScreenSectionDataRequest.getOperatorfieldsectionparm());
        storedProcedureQuery.setParameter(2, returnOperatorScreenSectionDataRequest.getSectionnameparm());

        List<ReturnOperatorScreenSectionResponse> result = storedProcedureQuery.getResultList();

        return  result ;
    }

    @ApiOperation("Retrieve Service Department ")
    @PostMapping("/service-department/find")
    public List<ReturnServiceDepartmentResponse> getServiceDepartment(@ApiParam("\t") @RequestBody ReturnServiceDepartmentDataRequest returnServiceDepartmentDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnServiceDepartment");
        storedProcedureQuery.setParameter(1, returnServiceDepartmentDataRequest.getServicedepartmentidparm());
        storedProcedureQuery.setParameter(2, returnServiceDepartmentDataRequest.getServicedepartmentnameparm());

        List<ReturnServiceDepartmentResponse> result = storedProcedureQuery.getResultList();

        return result ;
    }

    @ApiOperation("Retrieve Parking Type ")
    @PostMapping("/parking-type/find")
    public List<ReturnParkingTypeResponse> getParkingType(@ApiParam("\t") @RequestBody ReturnParkingTypeRequest returnParkingTypeRequest ){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnParkingType");
        storedProcedureQuery.setParameter(1, returnParkingTypeRequest.getParkingtypeidparm());
        storedProcedureQuery.setParameter(2, returnParkingTypeRequest.getParkingtypearabicnameparm());
        storedProcedureQuery.setParameter(3, returnParkingTypeRequest.getParkingtypeenglishnameparm());

        List<ReturnParkingTypeResponse> result = storedProcedureQuery.getResultList() ;

        return result ;
    }

//    End Retrieve Methods Code
}
