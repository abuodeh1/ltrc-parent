package jo.gov.ltrc.permit.services.shared;

import io.swagger.annotations.*;
import jo.gov.ltrc.helper.DatabaseHelper;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import javax.servlet.http.HttpServletRequest;
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
@Log4j2
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
    public String addCharacteristic(@ApiParam("\t") @RequestBody SaveCharacteristicDataRequest saveCharacteristicDataRequest, HttpServletRequest request){

        log.debug(" SaveCharacteristicDataRequest : " + saveCharacteristicDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

//        saveCharacteristicDataRequest.setIP = request.getRemoteAddr();

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveCharacteristicData", saveCharacteristicDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

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
    public String addCountry(@ApiParam("\t") @RequestBody SaveCountryDataRequest saveCountryDataRequest, HttpServletRequest request){

        log.debug(" SaveCountryDataRequest : " + saveCountryDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

//        saveCountryDataRequest.setIP = request.getRemoteAddr();

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveCountryData", saveCountryDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

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
    public String addProvince(@ApiParam("\t") @RequestBody SaveProvinceDataRequest saveProvinceDataRequest, HttpServletRequest request){

        log.debug(" SaveProvinceDataRequest : " + saveProvinceDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

//        saveProvinceDataRequest.setIP = request.getRemoteAddr();

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveProvinceData", saveProvinceDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

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
    public String addGovernorate(@ApiParam("\t") @RequestBody SaveGovernorateDataRequest saveGovernorateDataRequest, HttpServletRequest request){

        log.debug(" SaveGovernorateDataRequest : " + saveGovernorateDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

//        saveGovernorateDataRequest.setIP = request.getRemoteAddr();

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveGovernorateData", saveGovernorateDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

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
    public String addMunicipality(@ApiParam("\t") @RequestBody SaveMunicipalityDataRequest saveMunicipalityDataRequest, HttpServletRequest request){

        log.debug(" SaveMunicipalityDataRequest : " + saveMunicipalityDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

//        saveMunicipalityDataRequest.setIP = request.getRemoteAddr();

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveMunicipalityData", saveMunicipalityDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

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
    public String addTerritory(@ApiParam("\t") @RequestBody SaveTerritoryDataRequest saveTerritoryDataRequest, HttpServletRequest request){

        log.debug(" SaveTerritoryDataRequest : " + saveTerritoryDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

//        saveTerritoryDataRequest.setIP = request.getRemoteAddr();

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveTerritoryData", saveTerritoryDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

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
    public String addParkingType(@ApiParam("\t") @RequestBody SaveParkingTypeDataRequest saveParkingTypeDataRequest, HttpServletRequest request){

        log.debug(" SaveParkingTypeDataRequest : " + saveParkingTypeDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

//        saveParkingTypeDataRequest.setIP = request.getRemoteAddr();

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveParkingTypeData", saveParkingTypeDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

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
    public String addLineType(@ApiParam("\t") @RequestBody SaveLineTypeDataRequest saveLineTypeDataRequest, HttpServletRequest request){

        log.debug(" SaveLineTypeDataRequest : " + saveLineTypeDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

//        saveLineTypeDataRequest.setIP = request.getRemoteAddr();

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveLineTypeData", saveLineTypeDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

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
    public String addFuelType(@ApiParam("\t") @RequestBody SaveFuelTypeDateRequest saveFuelTypeDateRequest, HttpServletRequest request){

        log.debug(" SaveFuelTypeDateRequest : " + saveFuelTypeDateRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

//        saveFuelTypeDateRequest.setIP = request.getRemoteAddr();

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveFuelTypeData", saveFuelTypeDateRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

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
    public String addPlateClassification(@ApiParam("\t") @RequestBody SavePlateClassificationDataRequest savePlateClassificationDataRequest, HttpServletRequest request){

        log.debug(" SavePlateClassificationDataRequest : " + savePlateClassificationDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

//        savePlateClassificationDataRequest.setIP = request.getRemoteAddr();

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SavePlateClassificationData", savePlateClassificationDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

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
    public String addTransportationClass(@ApiParam("\t") @RequestBody SaveTransportationClassDataRequest saveTransportationClassDataRequest, HttpServletRequest request){

        log.debug(" SaveTransportationClassDataRequest : " + saveTransportationClassDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

//        saveTransportationClassDataRequest.setIP = request.getRemoteAddr();

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveTransportationClassData", saveTransportationClassDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

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
    public String addPeriodClass(@ApiParam("\t") @RequestBody SavePeriodCalssDataRequest savePeriodCalssDataRequest, HttpServletRequest request){

        log.debug(" SavePeriodCalssDataRequest : " + savePeriodCalssDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

//        savePeriodCalssDataRequest.setIP = request.getRemoteAddr();

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SavePeriodCalssData", savePeriodCalssDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

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
    public String addOperatorClassification(@ApiParam("\t") @RequestBody SaveOperatorClassificationDataRequest saveOperatorClassificationDataRequest, HttpServletRequest request){

        log.debug(" SaveOperatorClassificationDataRequest : " + saveOperatorClassificationDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

//        saveOperatorClassificationDataRequest.setIP = request.getRemoteAddr();

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveOperatorClassificationData", saveOperatorClassificationDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        return (String) storedProcedureQuery.getSingleResult() ;
    }



//    End Add or Edit Methods Code


//    Start Retrieve Methods Code


    @ApiOperation("Retrieved List of Countries")
    @PostMapping("/country/find")
    public List<ReturnCountryResponse> findCountry(@ApiParam("\t") @RequestBody ReturnCountryRequest countryRequest){

        log.debug(" ReturnCountryRequest : " + countryRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnCountry", countryRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        List<ReturnCountryResponse> result = storedProcedureQuery.getResultList();

        return result;
    }

    @ApiOperation("Retrieve List of Regions")
    @PostMapping("/region/find")
    public List<ReturnRegionResponse> findRegion(@ApiParam("\t") @RequestBody ReturnRegionRequest returnRegionRequest){

        log.debug(" ReturnRegionRequest : " + returnRegionRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnProvince", returnRegionRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        List<ReturnRegionResponse> result = storedProcedureQuery.getResultList();

        return result;

    }

    @ApiOperation("Retrieve List of Governorates")
    @PostMapping("/governorate/find")
    public List<ReturnGovernerateResponse> findGovernerate(@ApiParam("\t") @RequestBody ReturnGovernerateRequest governerateRequest){

        log.debug(" ReturnGovernerateRequest : " + governerateRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnGovernorate", governerateRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        List<ReturnGovernerateResponse> result = storedProcedureQuery.getResultList();

        return result;

    }

    @ApiOperation("Retrieve List of Municipalities")
    @PostMapping("/municipality/find")
    public List<ReturnMunicipalityResponse> findMunicipality(@ApiParam("\t") @RequestBody ReturnMunicipalityRequest municipalityRequest){

        log.debug(" ReturnMunicipalityRequest : " + municipalityRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnMunicipality", municipalityRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }


        List<ReturnMunicipalityResponse> result = storedProcedureQuery.getResultList();

        return result;

    }

    @ApiOperation("Retrieve List of Areas")
    @PostMapping("/area/find")
    public List<ReturnAreaResponse> findArea(@ApiParam("\t") @RequestBody ReturnAreaRequest returnAreaRequest){

        log.debug(" ReturnAreaRequest : " + returnAreaRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnTerritory", returnAreaRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }


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

        log.debug(" ReturnOperatorClassificationDataRequest : " + returnOperatorClassificationDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnOperatorClassification", returnOperatorClassificationDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        List<ReturnOperatorClassificationDataResponse> result = storedProcedureQuery.getResultList();

        return result;
    }

    @ApiOperation("Retrieve License Purpose")
    @PostMapping("/license-purpose/find")
    public  List<ReturnLicensePurposeDataResponse> getLicensePurpose(@ApiParam("\t") @RequestBody ReturnLicensePurposeDataRequest returnLicensePurposeDataRequest){

        log.debug(" ReturnLicensePurposeDataRequest : " + returnLicensePurposeDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnLicensepurpose", returnLicensePurposeDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        List<ReturnLicensePurposeDataResponse> result = storedProcedureQuery.getResultList();

        return result ;
    }

    @ApiOperation("Retrieve Plate Classification ")
    @PostMapping("/plate-classification/find")
    public List<ReturnPlateClassificationResponse> getPlateClassification(@ApiParam("\t") @RequestBody ReturnPlateClassificationDataRequest returnPlateClassificationDataRequest){

        log.debug(" ReturnPlateClassificationDataRequest : " + returnPlateClassificationDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnPlateClassification", returnPlateClassificationDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        List<ReturnPlateClassificationResponse> result = storedProcedureQuery.getResultList();

        return result ;
    }

    @ApiOperation("Retrieve Operator Screen Section Data ")
    @PostMapping("/operator-screen/find")
    public List<ReturnOperatorScreenSectionResponse> getOperatorScreenSection(@ApiParam("\t") @RequestBody ReturnOperatorScreenSectionDataRequest returnOperatorScreenSectionDataRequest){

        log.debug(" ReturnOperatorScreenSectionDataRequest : " + returnOperatorScreenSectionDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnOperatorScreenSection", returnOperatorScreenSectionDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        List<ReturnOperatorScreenSectionResponse> result = storedProcedureQuery.getResultList();

        return  result ;
    }

    @ApiOperation("Retrieve Service Department ")
    @PostMapping("/service-department/find")
    public List<ReturnServiceDepartmentResponse> getServiceDepartment(@ApiParam("\t") @RequestBody ReturnServiceDepartmentDataRequest returnServiceDepartmentDataRequest){

        log.debug(" ReturnServiceDepartmentDataRequest : " + returnServiceDepartmentDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnServiceDepartment", returnServiceDepartmentDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        List<ReturnServiceDepartmentResponse> result = storedProcedureQuery.getResultList();

        return result ;
    }

    @ApiOperation("Retrieve Parking Type ")
    @PostMapping("/parking-type/find")
    public List<ReturnParkingTypeResponse> getParkingType(@ApiParam("\t") @RequestBody ReturnParkingTypeRequest returnParkingTypeRequest ){

        log.debug(" ReturnParkingTypeRequest : " + returnParkingTypeRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnParkingType", returnParkingTypeRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        List<ReturnParkingTypeResponse> result = storedProcedureQuery.getResultList() ;

        return result ;
    }

//    End Retrieve Methods Code
}
