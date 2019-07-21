package jo.gov.ltrc.permit.services.permit;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
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
    public String addPermit(@ApiParam("\t") @RequestBody SavePermitDataRequest savePermitDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SavePermitData");
        storedProcedureQuery.setParameter(1, savePermitDataRequest.getPermitidparm());
        storedProcedureQuery.setParameter(2, savePermitDataRequest.getPermittypeparm());
        storedProcedureQuery.setParameter(3, savePermitDataRequest.getIssuedateparm());
        storedProcedureQuery.setParameter(4, savePermitDataRequest.getDeliverydateparm());
        storedProcedureQuery.setParameter(5, savePermitDataRequest.getPeriodparm());
        storedProcedureQuery.setParameter(6, savePermitDataRequest.getStartworkingdateparm());
        storedProcedureQuery.setParameter(7, savePermitDataRequest.getEndworkingdateparm());
        storedProcedureQuery.setParameter(8, savePermitDataRequest.getProvinceparm());
        storedProcedureQuery.setParameter(9, savePermitDataRequest.getGovernorateparm());
        storedProcedureQuery.setParameter(10, savePermitDataRequest.getMunicipalityparm());
        storedProcedureQuery.setParameter(11, savePermitDataRequest.getRouteparm());
        storedProcedureQuery.setParameter(12, savePermitDataRequest.getDeparturetimeparm());
        storedProcedureQuery.setParameter(13, savePermitDataRequest.getCompletiontimeparm());
        storedProcedureQuery.setParameter(14, savePermitDataRequest.getNumberoftripsparm());
        storedProcedureQuery.setParameter(15, savePermitDataRequest.getDecidedtariffparm());
        storedProcedureQuery.setParameter(16, savePermitDataRequest.getPrimarydriverparm());
        storedProcedureQuery.setParameter(17, savePermitDataRequest.getPrimarydriverpassportparm());
        storedProcedureQuery.setParameter(18, savePermitDataRequest.getAlternativedriverparm());
        storedProcedureQuery.setParameter(19, savePermitDataRequest.getAlternativedriverpassportparm());
        storedProcedureQuery.setParameter(20, savePermitDataRequest.getStatusparm());
        storedProcedureQuery.setParameter(21, savePermitDataRequest.getVehicleparm());
        storedProcedureQuery.setParameter(22, savePermitDataRequest.getClassificationparm());
        storedProcedureQuery.setParameter(23, savePermitDataRequest.getWorkingasparm());
        storedProcedureQuery.setParameter(24, savePermitDataRequest.getStartpointparm());
        storedProcedureQuery.setParameter(25, savePermitDataRequest.getEndpointparm());
        storedProcedureQuery.setParameter(26, savePermitDataRequest.getPrincepel());


        return (String) storedProcedureQuery.getSingleResult() ;
    }

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
    @ApiOperation("Add or Edit Permit Type Field ")
    @PostMapping("/type-field")
    public String addPermitTypeField(@ApiParam("\t") @RequestBody SavePermitTypeDataRequest savePermitTypeDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SavePermitTypeData");
        storedProcedureQuery.setParameter(1, savePermitTypeDataRequest.getPermittypeidparm());
        storedProcedureQuery.setParameter(2, savePermitTypeDataRequest.getPermittypenameparm());
        storedProcedureQuery.setParameter(3, savePermitTypeDataRequest.getPermittypeenglishnameparm());
        storedProcedureQuery.setParameter(4, savePermitTypeDataRequest.getPrincepel());
        storedProcedureQuery.setParameter(5, savePermitTypeDataRequest.getStatusparm());

        String result = (String) storedProcedureQuery.getSingleResult();

        if (!result.startsWith("E")) {
            long permitTypeId = Long.valueOf(result.substring(0, result.indexOf("$")));

            if (savePermitTypeDataRequest.getField() != null) {
                if (savePermitTypeDataRequest.getPermittypeidparm() == 0) {
                    savePermitTypeDataRequest.getField().forEach(field -> {
                        field.setPermittypeparm(permitTypeId);
                        addPermitTypeFieldSettings(field);
                    });
                }else{
                    savePermitTypeDataRequest.getField().forEach(field -> {
                        field.setPermitfieldparm(savePermitTypeDataRequest.getPermittypeidparm());
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

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SavePermitTypeFieldSettingData");
        storedProcedureQuery.setParameter(1, savePermitTypeFieldSettingDataRequest.getPermittypefieldsettingidparm());
        storedProcedureQuery.setParameter(2, savePermitTypeFieldSettingDataRequest.getPermittypeparm());
        storedProcedureQuery.setParameter(3, savePermitTypeFieldSettingDataRequest.getPermitfieldparm());
        storedProcedureQuery.setParameter(4, savePermitTypeFieldSettingDataRequest.getRequiredparm());
        storedProcedureQuery.setParameter(5, savePermitTypeFieldSettingDataRequest.getVisibleparm());
        storedProcedureQuery.setParameter(6, savePermitTypeFieldSettingDataRequest.getActiveparm());
        storedProcedureQuery.setParameter(7, savePermitTypeFieldSettingDataRequest.getPrincepel());
        storedProcedureQuery.setParameter(8, savePermitTypeFieldSettingDataRequest.getStatusparm());

        return (String) storedProcedureQuery.getSingleResult() ;

    }

//    End Add or Edit Methods Code




//    Start Retrieve Methods Code

    @ApiOperation("Retrieve Permit Type ")
    @PostMapping("/find/type")
    public List<ReturnPermitTypeDTO> getPermitType(@ApiParam("\t") @RequestBody ReturnPermitTypeDataRequest returnPermitTypeDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnPermitType");
        storedProcedureQuery.setParameter(1, returnPermitTypeDataRequest.getPermittypeidparm());
        storedProcedureQuery.setParameter(2, returnPermitTypeDataRequest.getPermittypenameparm());
        storedProcedureQuery.setParameter(3, returnPermitTypeDataRequest.getPermittypeenglishnameparm());
        storedProcedureQuery.setParameter(4, returnPermitTypeDataRequest.getPagesize());
        storedProcedureQuery.setParameter(5, returnPermitTypeDataRequest.getPageindex());
        storedProcedureQuery.setParameter(6, returnPermitTypeDataRequest.getSorttype());
        storedProcedureQuery.setParameter(7, returnPermitTypeDataRequest.getSortby());


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

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnPermitTypeField");
        storedProcedureQuery.setParameter(1, returnPermitTypeFieldDataRequest.getPermitfieldidparm());
        storedProcedureQuery.setParameter(2, returnPermitTypeFieldDataRequest.getPermitfieldnameparm());
        storedProcedureQuery.setParameter(3, returnPermitTypeFieldDataRequest.getPermitfieldsectionparm());
        storedProcedureQuery.setParameter(4, returnPermitTypeFieldDataRequest.getPermitfieldsectionnameparm());


        List<ReturnPermitTypeFieldResponse> result = storedProcedureQuery.getResultList();

        return  result ;
    }

    @ApiOperation("Retrieve Permit Type Field Setting ")
    @PostMapping("/find/type-field-setting")
    public List<ReturnPermitTypeFieldSettingResponse> getPermitTypeFieldSetting(@ApiParam("\t") @RequestBody ReturnPermitTypeFieldSettingDataRequest returnPermitTypeFieldSettingDataRequests ){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnPermitTypeFieldSetting");
        storedProcedureQuery.setParameter(1, returnPermitTypeFieldSettingDataRequests.getPermittypefieldsettingidparm());
        storedProcedureQuery.setParameter(2, returnPermitTypeFieldSettingDataRequests.getPermittypeparm());
        storedProcedureQuery.setParameter(3, returnPermitTypeFieldSettingDataRequests.getPermitfieldparm());
        storedProcedureQuery.setParameter(4, returnPermitTypeFieldSettingDataRequests.getRequiredparm());
        storedProcedureQuery.setParameter(5, returnPermitTypeFieldSettingDataRequests.getVisibleparm());
        storedProcedureQuery.setParameter(6, returnPermitTypeFieldSettingDataRequests.getActiveparm());

        List<ReturnPermitTypeFieldSettingResponse> result = storedProcedureQuery.getResultList();

        return  result ;
    }

    @ApiOperation("Retrieve Permit General Search ")
    @PostMapping("/find/general")
    public List<ReturnPermitGeneralSearchResponse> getPermitGeneralSearch(@ApiParam("\t") @RequestBody ReturnPermitGeneralSearchDataRequest returnPermitGeneralSearchDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnPermitGeneralSearch");
        storedProcedureQuery.setParameter(1, returnPermitGeneralSearchDataRequest.getMinpermitidparm());
        storedProcedureQuery.setParameter(2, returnPermitGeneralSearchDataRequest.getMaxpermitidparm());
        storedProcedureQuery.setParameter(3, returnPermitGeneralSearchDataRequest.getPermittypeparm());
        storedProcedureQuery.setParameter(4, returnPermitGeneralSearchDataRequest.getMinissuedateparm());
        storedProcedureQuery.setParameter(5, returnPermitGeneralSearchDataRequest.getMaxissuedateparm());
        storedProcedureQuery.setParameter(6, returnPermitGeneralSearchDataRequest.getMindeliverydateparm());
        storedProcedureQuery.setParameter(7, returnPermitGeneralSearchDataRequest.getMaxdeliverydateparm());
        storedProcedureQuery.setParameter(8, returnPermitGeneralSearchDataRequest.getMinperiodparm());
        storedProcedureQuery.setParameter(9, returnPermitGeneralSearchDataRequest.getMaxperiodparm());
        storedProcedureQuery.setParameter(10, returnPermitGeneralSearchDataRequest.getMinstartworkingdateparm());
        storedProcedureQuery.setParameter(11, returnPermitGeneralSearchDataRequest.getMaxstartworkingdateparm());
        storedProcedureQuery.setParameter(12, returnPermitGeneralSearchDataRequest.getMinendworkingdateparm());
        storedProcedureQuery.setParameter(13, returnPermitGeneralSearchDataRequest.getMaxendworkingdateparm());
        storedProcedureQuery.setParameter(14, returnPermitGeneralSearchDataRequest.getProvinceparm());
        storedProcedureQuery.setParameter(15, returnPermitGeneralSearchDataRequest.getGovernorateparm());
        storedProcedureQuery.setParameter(16, returnPermitGeneralSearchDataRequest.getMunicipalityparm());
        storedProcedureQuery.setParameter(17, returnPermitGeneralSearchDataRequest.getRouteparm());
        storedProcedureQuery.setParameter(18, returnPermitGeneralSearchDataRequest.getMinnumberoftripsparm());
        storedProcedureQuery.setParameter(19, returnPermitGeneralSearchDataRequest.getMaxnumberoftripsparm());
        storedProcedureQuery.setParameter(20, returnPermitGeneralSearchDataRequest.getPrimarydriverparm());
        storedProcedureQuery.setParameter(21, returnPermitGeneralSearchDataRequest.getAlternativedriverparm());
        storedProcedureQuery.setParameter(22, returnPermitGeneralSearchDataRequest.getStatusparm());
        storedProcedureQuery.setParameter(23, returnPermitGeneralSearchDataRequest.getVehicleparm());
        storedProcedureQuery.setParameter(24, returnPermitGeneralSearchDataRequest.getClassificationparm());
        storedProcedureQuery.setParameter(25, returnPermitGeneralSearchDataRequest.getWorkingasparm());
        storedProcedureQuery.setParameter(26, returnPermitGeneralSearchDataRequest.getStartpointparm());
        storedProcedureQuery.setParameter(27, returnPermitGeneralSearchDataRequest.getEndpointparm());
        storedProcedureQuery.setParameter(28, returnPermitGeneralSearchDataRequest.getLineidparm());
        storedProcedureQuery.setParameter(29, returnPermitGeneralSearchDataRequest.getLinenameparm());
        storedProcedureQuery.setParameter(30, returnPermitGeneralSearchDataRequest.getRoutenameparm());
        storedProcedureQuery.setParameter(31, returnPermitGeneralSearchDataRequest.getOperatoridparm());
        storedProcedureQuery.setParameter(32, returnPermitGeneralSearchDataRequest.getOperatornameparm());
        storedProcedureQuery.setParameter(33, returnPermitGeneralSearchDataRequest.getPlatenumberparm());
        storedProcedureQuery.setParameter(34, returnPermitGeneralSearchDataRequest.getPlatecodeparm());


        List<ReturnPermitGeneralSearchResponse> result = storedProcedureQuery.getResultList();

        return result ;

    }

    @ApiOperation("Retrieve Permit Working As ")
    @PostMapping("/find/working-as")
    public List<ReturnPermitWorkingAsResponse> getPermitWorkingAs(@ApiParam("\t")@RequestBody ReturnPermitWorkingAsDataRequest returnPermitWorkingAsDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnPermitWorkingAs");
        storedProcedureQuery.setParameter(1, returnPermitWorkingAsDataRequest.getPermitworkingasidparm());
        storedProcedureQuery.setParameter(2, returnPermitWorkingAsDataRequest.getPermitworkingasnameparm());
        storedProcedureQuery.setParameter(3, returnPermitWorkingAsDataRequest.getPagesize());
        storedProcedureQuery.setParameter(4, returnPermitWorkingAsDataRequest.getPageindex());
        storedProcedureQuery.setParameter(5, returnPermitWorkingAsDataRequest.getSorttype());
        storedProcedureQuery.setParameter(6, returnPermitWorkingAsDataRequest.getSortby());


        List<ReturnPermitWorkingAsResponse> result = storedProcedureQuery.getResultList() ;

        return  result ;
    }

//     End Retrieve Methods Code

}
