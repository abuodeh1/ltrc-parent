package jo.gov.ltrc.permit.services.permit;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import jo.gov.ltrc.helper.DatabaseHelper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
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
@RequestMapping("/api/permit")
@Log4j2
public class PermitService {

    @PersistenceContext
    private EntityManager entityManager;


//    Start Add or Edit Methods Code

    @ApiResponses(value = {

            @ApiResponse(code = 200, message =
                    "Number$N\n" +
                            "----------\n" +
                            "Number :  effected rows  \n" +
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
    @ApiOperation("Add or Edit Permit Data ")
    @PostMapping()
    public String addPermit(@ApiParam("\t") @RequestBody SavePermitDataRequest savePermitDataRequest, HttpServletRequest request){

        log.debug(" SavePermitDataRequest : " + savePermitDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

//        savePermitDataRequest.setIP = request.getRemoteAddr();

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SavePermitData", savePermitDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }


        return (String) storedProcedureQuery.getSingleResult() ;
    }

    @ApiResponses(value = {

            @ApiResponse(code = 200, message =
                    "Number$N\n" +
                            "----------\n" +
                            "Number :   effected rows  \n" +
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
    @ApiOperation("Add or Edit Permit Type Field ")
    @PostMapping("/type-field")
    public String addPermitType(@ApiParam("\t") @RequestBody SavePermitTypeDataRequest savePermitTypeDataRequest){

        log.debug(" SavePermitTypeDataRequest : " + savePermitTypeDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

//        savePermitTypeDataRequest.setIP = request.getRemoteAddr();

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SavePermitTypeData", savePermitTypeDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        String result = (String) storedProcedureQuery.getSingleResult();

        if (!result.startsWith("E")) {
            Long permitTypeId = Long.valueOf(result.substring(0, result.indexOf("$")));

            if (savePermitTypeDataRequest.getField() != null) {
                if (savePermitTypeDataRequest.getPermittypeidparm() == 0) {
                    savePermitTypeDataRequest.getField().forEach(field -> {
                        field.setPermittypeparm(permitTypeId);
                        addPermitTypeFieldSettings(field);
                    });
                }else{
                    savePermitTypeDataRequest.getField().forEach(field -> {
                        field.setPermittypeparm(savePermitTypeDataRequest.getPermittypeidparm());
                        addPermitTypeFieldSettings(field);
                    });
                }
            }
        }

        return result;
    }

//    @ApiResponses(value = {
//
//            @ApiResponse(code = 200, message =
//                    "Number$N\n" +
//                            "----------\n" +
//                            "Number :  effected rows  \n" +
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
//    @ApiOperation("Add or Edit Permit Type Field Settings ")
//    @PostMapping("/type-field-settings")
    public String addPermitTypeFieldSettings(@ApiParam("\t") @RequestBody SavePermitTypeFieldSettingDataRequest savePermitTypeFieldSettingDataRequest){

        log.debug(" SavePermitTypeFieldSettingDataRequest : " + savePermitTypeFieldSettingDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SavePermitTypeFieldSettingData", savePermitTypeFieldSettingDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        return (String) storedProcedureQuery.getSingleResult() ;

    }


//    End Add or Edit Methods Code




//    Start Retrieve Methods Code

    @ApiOperation("Retrieve Permit Type ")
    @PostMapping("/find/type")
    public List<ReturnPermitTypeDTO> getPermitType(@ApiParam("\t") @RequestBody ReturnPermitTypeDataRequest returnPermitTypeDataRequest){

        log.debug(" ReturnPermitTypeDataRequest : " + returnPermitTypeDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnPermitType", returnPermitTypeDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }


        List<ReturnPermitTypeResponse> resultPermitType = storedProcedureQuery.getResultList() ;

        List<ReturnPermitTypeDTO> returnPermitTypeDTOList = new ArrayList<>();

        resultPermitType.forEach( result -> {
            ReturnPermitTypeDTO returnPermitTypeDTO = new ReturnPermitTypeDTO();
            BeanUtils.copyProperties(result, returnPermitTypeDTO);

            ReturnPermitTypeFieldSettingDataRequest request = new ReturnPermitTypeFieldSettingDataRequest();
            request.setPermittypeparm(result.getPermittypeid());

            returnPermitTypeDTO.setField(getPermitTypeFieldSetting(request));
            returnPermitTypeDTOList.add(returnPermitTypeDTO);
        });

        return returnPermitTypeDTOList ;
    }

    @ApiOperation("Retrieve Permit Type Field ")
    @PostMapping("/find/type-field")
    public List<ReturnPermitTypeFieldResponse> getPermitTypeField(@ApiParam("\t") @RequestBody ReturnPermitTypeFieldDataRequest returnPermitTypeFieldDataRequest){

        log.debug(" ReturnPermitTypeFieldDataRequest : " + returnPermitTypeFieldDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnPermitTypeField", returnPermitTypeFieldDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }


        List<ReturnPermitTypeFieldResponse> result = storedProcedureQuery.getResultList();

        return  result ;
    }

    @ApiOperation("Retrieve Permit Type Field Setting ")
    @PostMapping("/find/type-field-setting")
    public List<ReturnPermitTypeFieldSettingResponse> getPermitTypeFieldSetting(@ApiParam("\t") @RequestBody ReturnPermitTypeFieldSettingDataRequest returnPermitTypeFieldSettingDataRequests ){

        log.debug(" ReturnPermitTypeFieldSettingDataRequest : " + returnPermitTypeFieldSettingDataRequests.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnPermitTypeFieldSetting", returnPermitTypeFieldSettingDataRequests);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        List<ReturnPermitTypeFieldSettingResponse> result = storedProcedureQuery.getResultList();

        return  result ;
    }

    @ApiOperation("Retrieve Permit General Search ")
    @PostMapping("/find/general")
    public List<ReturnPermitGeneralSearchResponse> getPermitGeneralSearch(@ApiParam("\t") @RequestBody ReturnPermitGeneralSearchDataRequest returnPermitGeneralSearchDataRequest){

        log.debug(" ReturnPermitGeneralSearchDataRequest : " + returnPermitGeneralSearchDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnPermitGeneralSearch", returnPermitGeneralSearchDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }


        List<ReturnPermitGeneralSearchResponse> result = storedProcedureQuery.getResultList();

        return result ;

    }

    @ApiOperation("Retrieve Permit Working As ")
    @PostMapping("/find/working-as")
    public List<ReturnPermitWorkingAsResponse> getPermitWorkingAs(@ApiParam("\t")@RequestBody ReturnPermitWorkingAsDataRequest returnPermitWorkingAsDataRequest){

        log.debug(" ReturnPermitWorkingAsDataRequest : " + returnPermitWorkingAsDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnPermitWorkingAs", returnPermitWorkingAsDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }


        List<ReturnPermitWorkingAsResponse> result = storedProcedureQuery.getResultList() ;

        return  result ;
    }

//     End Retrieve Methods Code

}
