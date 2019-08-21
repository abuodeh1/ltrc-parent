package jo.gov.ltrc.permit.services.operator;

import io.swagger.annotations.*;
import jo.gov.ltrc.helper.DatabaseHelper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.persistence.*;
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
@RequestMapping(value = "/api/operator")
@Log4j2
public class OperatorService {


    @PersistenceContext
    private EntityManager entityManager;

//  Start Add or Edit Methods

    @ApiOperation("Add or Edit Operator Branch ")
    @PostMapping("/branch")
    public String addOperatorBranch(@ApiParam(value = "\t") @RequestBody SaveOperatorBranchDataRequest saveOperatorBranchDataRequest, HttpServletRequest request){

        log.debug(" SaveOperatorBranchDataRequest : " + saveOperatorBranchDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        saveOperatorBranchDataRequest.setIpaddressparm(request.getRemoteAddr());

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveOperatorBranchData", saveOperatorBranchDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        return (String) storedProcedureQuery.getSingleResult();

    }

    @ApiOperation("Add or Edit Operator ")
    @PostMapping
    public String addOperator(@ApiParam(value = "\t") @RequestBody SaveOperatorDataRequest saveOperatorDataRequest, HttpServletRequest request){


        log.debug(" SaveOperatorDataRequest : " + saveOperatorDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        saveOperatorDataRequest.setIpaddressparm(request.getRemoteAddr());

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveOperatorData", saveOperatorDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }


        return (String) storedProcedureQuery.getSingleResult();

    }

    @ApiOperation("Add or Edit Decision")
    @PostMapping("/decision")
    public String addDecision(@ApiParam(value = "\t") @RequestBody SaveDecisionDataRequest saveDecisionDataRequest, HttpServletRequest request){

        log.debug(" SaveDecisionDataRequest : " + saveDecisionDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        saveDecisionDataRequest.setIpaddressparm(request.getRemoteAddr());

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveDecisionsData", saveDecisionDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        return (String) storedProcedureQuery.getSingleResult();
    }

    @ApiOperation("Add or Edit Vehicle ")
    @PostMapping("/vehicle")
    public String addVehicle(@ApiParam(value = "\t") @RequestBody SaveVehicleDataRequest saveVehicleDataRequest, HttpServletRequest request){

        log.debug(" SaveVehicleDataRequest : " + saveVehicleDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        saveVehicleDataRequest.setIpaddressparm(request.getRemoteAddr());

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveVehicleData", saveVehicleDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        return (String) storedProcedureQuery.getSingleResult() ;


    }

    @ApiOperation("Add or Edit Vehicle Route ")
    @PostMapping("/vehicle-route")
    public String addVehicleRoute(@ApiParam(value = "\t") @RequestBody SaveVehicleRouteDataRequest saveVehicleRouteDataRequest, HttpServletRequest request){

        log.debug(" SaveVehicleRouteDataRequest : " + saveVehicleRouteDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        saveVehicleRouteDataRequest.setIpaddressparm(request.getRemoteAddr());

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveVehicleRoute", saveVehicleRouteDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        return  (String) storedProcedureQuery.getSingleResult();
    }

    @ApiOperation("Add or Edit Operator Category Data ")
    @PostMapping("/category")
    public String addOperatorCategroyData(@ApiParam("\t") @RequestBody SaveOperatorCategroyDataRequest saveOperatorCategroyDataRequest, HttpServletRequest request) {

        log.debug(" SaveOperatorCategroyDataRequest : " + saveOperatorCategroyDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        saveOperatorCategroyDataRequest.setIpaddressparm(request.getRemoteAddr());

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveOperatorCategroyData", saveOperatorCategroyDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        String result = (String) storedProcedureQuery.getSingleResult();

        if (!result.startsWith("E")) {
            Long categoryId = Long.valueOf(result.substring(0, result.indexOf("$")));

            if (saveOperatorCategroyDataRequest.getField() != null) {
                if (saveOperatorCategroyDataRequest.getOperatorcategoryidparm() == 0) {

                    saveOperatorCategroyDataRequest.getField().forEach(field -> {
                        field.setOperatorcategoryidparm(categoryId);
                        addOperatorCategoryFieldSettingData(field);
                    });
                } else {
                    saveOperatorCategroyDataRequest.getField().forEach(field -> {
                        field.setOperatorcategoryidparm(saveOperatorCategroyDataRequest.getOperatorcategoryidparm());
                        addOperatorCategoryFieldSettingData(field);
                    });


                }
            }
        }
        return result;
    }

//    @ApiOperation("Add or Edit Operator Category Field Setting Data")
//    @PostMapping("/category-setting")
    private  String addOperatorCategoryFieldSettingData (@ApiParam("\t") @RequestBody SaveOperatorCategoryFieldSettingDataRequest saveOperatorCategoryFieldSettingDataRequest){

        log.debug(" saveOperatorCategoryFieldSettingDataRequest : " + saveOperatorCategoryFieldSettingDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveOperatorCategoryFieldSettingData", saveOperatorCategoryFieldSettingDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        return (String) storedProcedureQuery.getSingleResult() ;

    }

//  End Add Methods


//  Start  Retrieve Methods

    @ApiOperation("Retrieve Operator By Basic Information")
    @PostMapping("/find")
    public List<ReturnOperatorByOperatorBasicInformationResponse> findOperatorByBasicInformation(@ApiParam(value = "\t") @RequestBody ReturnOperatorByOperatorBasicInformationDataRequest returnOperatorByOperatorBasicInformationDataRequest){

        log.debug(" ReturnOperatorByOperatorBasicInformationDataRequest : " + returnOperatorByOperatorBasicInformationDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnOperatorByOperatorBasicInformation", returnOperatorByOperatorBasicInformationDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }


        List<ReturnOperatorByOperatorBasicInformationResponse> result = storedProcedureQuery.getResultList();

        return result ;

    }

    @ApiOperation("Retrieve Operator By General Search ")
    @PostMapping("/find/general")
    public List<ReturnOperatorGeneralSearchResponse> findOperatorByGeneral(@ApiParam(value = "\t") @RequestBody ReturnOperatorGeneralSearchDataRequest returnOperatorGeneralSearchDataRequest){

        log.debug(" returnOperatorGeneralSearchDataRequest : " + returnOperatorGeneralSearchDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnOperatorGeneralSearch", returnOperatorGeneralSearchDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        List<ReturnOperatorGeneralSearchResponse> result = storedProcedureQuery.getResultList() ;

        return result ;

    }

    @ApiOperation("Retrieve Vehicle Information")
    @PostMapping("/find/vehicle")
    public List<ReturnVehicleInformationResponse> findVehicle(@ApiParam(value = "\t") @RequestBody ReturnVehicleInformationDataRequest returnVehicleInformationDataRequest){

        log.debug(" ReturnVehicleInformationDataRequest : " + returnVehicleInformationDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnVehicleInformation", returnVehicleInformationDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        List<ReturnVehicleInformationResponse> result = storedProcedureQuery.getResultList();

        return result;

    }

    @ApiOperation("Retrieve Decisions Data ")
    @PostMapping("/find/decision")
    public List<ReturnDecisionResponse> getDecision(@ApiParam("\t") @RequestBody ReturnDecisionDataRequest returnDecisionDataRequest){


        log.debug(" ReturnDecisionDataRequest : " + returnDecisionDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnDecision", returnDecisionDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        List<ReturnDecisionResponse> result = storedProcedureQuery.getResultList();

        return result ;
    }

    @ApiOperation("Retrieve Branch Operator ")
    @PostMapping("/find/branch")
    public List<ReturnOperatorBranchResponse> getOperatorBranch(@ApiParam("\t") @RequestBody ReturnOperatorBranchDataRequest returnOperatorBranchDataRequest){

        log.debug(" ReturnOperatorBranchDataRequest : " + returnOperatorBranchDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnOperatorBranch", returnOperatorBranchDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        List<ReturnOperatorBranchResponse> result = storedProcedureQuery.getResultList();

        return result ;
    }

    @ApiOperation("Retrieve Vehicle By General Search ")
    @PostMapping("/find/vehicle-general")
    public List<ReturnVehicleGeneralSearchResponse> getVehicleGeneralSearch(@ApiParam("\t") @RequestBody ReturnVehicleGeneralSearchDataRequest returnVehicleGeneralSearchDataRequest){

        log.debug(" ReturnVehicleGeneralSearchDataRequest : " + returnVehicleGeneralSearchDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnVehicleGeneralSearch", returnVehicleGeneralSearchDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        List<ReturnVehicleGeneralSearchResponse> result = storedProcedureQuery.getResultList();

        return result ;

    }

    @ApiOperation("Retrieve Operator Office Information ")
    @PostMapping("/find/office")
    public List<ReturnOperatorOfficeInformationResponse> getOperatorOfficeInformation(@ApiParam("\t") @RequestBody ReturnOperatorOfficeInformationDataRequest returnOperatorOfficeInformationDataRequest){

        log.debug(" ReturnOperatorOfficeInformationDataRequest : " + returnOperatorOfficeInformationDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnOperatorOfficeInformation", returnOperatorOfficeInformationDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }


        List<ReturnOperatorOfficeInformationResponse> result = storedProcedureQuery.getResultList();

        return result ;
    }

    @ApiOperation("Retrieve Operator By Vehicle Information ")
    @PostMapping("/find/by-vehicle")
    public List<ReturnOperatorByVehicleInformationResponse> getOperatorByVehicleInformation(@ApiParam("\t") @RequestBody ReturnOperatorByVehicleInformationDataRequest returnOperatorByVehicleInformationDataRequest){

        log.debug(" ReturnOperatorByVehicleInformationDataRequest : " + returnOperatorByVehicleInformationDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnOperatorByVehicleInformation", returnOperatorByVehicleInformationDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }


        List<ReturnOperatorByVehicleInformationResponse> result = storedProcedureQuery.getResultList();

        return result;

    }

    @ApiOperation("Retrieve Vehicle Route Data ")
    @PostMapping("/find/vehicle-route")
    public List<ReturnVehicleRouteResponse> getVehicleRoute(@ApiParam("\t") @RequestBody ReturnVehicleRouteDataRequest returnVehicleRouteDataRequest){

        log.debug(" ReturnVehicleRouteDataRequest : " + returnVehicleRouteDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnVehicleRoute", returnVehicleRouteDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        List<ReturnVehicleRouteResponse> result = storedProcedureQuery.getResultList();

        return result ;
    }

    @ApiOperation("Retrieve Operator Category Date ")
    @PostMapping("/find/category")
    public List<ReturnOperatorCategoryDTO> getOperatorCategory(@ApiParam("\t") @RequestBody ReturnOperatorCategoryDataRequest returnOperatorCategoryDataRequest){

        log.debug(" ReturnOperatorCategoryDataRequest : " + returnOperatorCategoryDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnOperatorCategory", returnOperatorCategoryDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        List<ReturnOperatorCategoryResponse> resultCategory = storedProcedureQuery.getResultList();

        List<ReturnOperatorCategoryDTO> returnOperatorCategoryDTOList = new ArrayList<>();

        resultCategory.forEach( result -> {
            ReturnOperatorCategoryDTO returnOperatorCategoryDTO = new ReturnOperatorCategoryDTO();
            BeanUtils.copyProperties(result, returnOperatorCategoryDTO);

            ReturnOperatorCategoryFieldSettingDataRequest request = new ReturnOperatorCategoryFieldSettingDataRequest();
            request.setOperatorcategoryidparm(result.getOperatorcategoryid());

            returnOperatorCategoryDTO.setField(getOperatorCategoryFieldSetting(request));
            returnOperatorCategoryDTOList.add(returnOperatorCategoryDTO);
        } );

        return returnOperatorCategoryDTOList ;

    }

    @ApiOperation("Retrieve Operator Category Field ")
    @PostMapping("/find/category-field")
    public List<ReturnOperatorCategoryFieldResponse> getOperatorCategoryField(@ApiParam("\t") @RequestBody ReturnOperatorCategoryFieldDataRequest returnOperatorCategoryFieldDataRequest){

        log.debug(" ReturnOperatorCategoryFieldDataRequest : " + returnOperatorCategoryFieldDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnOperatorCategoryField", returnOperatorCategoryFieldDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        List<ReturnOperatorCategoryFieldResponse> result = storedProcedureQuery.getResultList();

        return  result ;
    }

    @ApiOperation("Retrieve Operator Category Field Setting ")
    @PostMapping("/find/category-field/setting")
    public List<ReturnOperatorCategoryFieldSettingResponse> getOperatorCategoryFieldSetting(@ApiParam("\t") @RequestBody ReturnOperatorCategoryFieldSettingDataRequest returnOperatorCategoryFieldSettingDataRequest ){

        log.debug(" ReturnOperatorCategoryFieldSettingDataRequest : " + returnOperatorCategoryFieldSettingDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnOperatorCategoryFieldSetting", returnOperatorCategoryFieldSettingDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }


        List<ReturnOperatorCategoryFieldSettingResponse> result = storedProcedureQuery.getResultList();

        return result ;

    }

    @ApiOperation("Retrieve Cars Count By Operator ID")
    @GetMapping("/{id}/cars")
    public Object getCarsCountByOperatorID(@ApiParam("Operator ID") @PathVariable(value = "id") Long id){

        Query nativeQuery = entityManager.createNativeQuery("SELECT sum(carcount) from  public.\"ReturnCarsCount\"(operatoridparm   =>" + id + ")");

        return nativeQuery.getSingleResult();
    }

    @ApiOperation("Retrieve Cars Count By Owner National ID")
    @GetMapping("/owner/{id}/cars")
    public Object getCarsCountByOwnerNationalID(@ApiParam("Owner National ID") @PathVariable(value = "id") String id) {

        Query nativeQuery = entityManager.createNativeQuery("SELECT sum(carcount) from  public.\"ReturnCarsCount\"(ownernationalidparm   =>'" + id + "')");

        return nativeQuery.getSingleResult();
    }

    //  End Retrieve Methods


    @ApiModelProperty("Delete All Vehicle Data ")
    @DeleteMapping("/vehicle/{id}")
    public String CnclPrmt(@ApiParam("Vehicle ID") @PathVariable(value = "id") Long id){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("CnclPrmt");
        storedProcedureQuery.setParameter(1, id);

        return (String) storedProcedureQuery.getSingleResult() ;
    }

}
