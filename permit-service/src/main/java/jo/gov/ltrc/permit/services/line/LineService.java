package jo.gov.ltrc.permit.services.line;


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
@RequestMapping(value = "/api/line")
@Log4j2
public class LineService {

    @PersistenceContext
    private EntityManager entityManager;



//    Start Retrieve Methods Code

    @ApiOperation(value = "Retrieve All Line Types")
    @GetMapping("/types")
    public List<ReturnAllLineTypesResponse> getLineTypes() {

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnAllLineType");

        List<ReturnAllLineTypesResponse> result =  storedProcedureQuery.getResultList();
        return result;
    }

    @ApiOperation("Retrieve Line Start Point By Line Id")
    @GetMapping("/{id}/start-point")
    public Long getStartPoints(@ApiParam("Line ID") @PathVariable(value = "id") Long id) {

        ReturnLineByLineDataResponse returnLineByLineDataResponse = getLineByLineID(id);

        return (returnLineByLineDataResponse != null ? returnLineByLineDataResponse.getStartpoint() : 0L);
    }

    @ApiOperation("Retrieve Line End Point By Line ID")
    @GetMapping("/{id}/end-point")
    public Long getLineEndPoints(@ApiParam("Line ID ") @PathVariable(value = "id") Long id) {

        ReturnLineByLineDataResponse returnLineByLineDataResponse = getLineByLineID(id);

        return (returnLineByLineDataResponse != null ? returnLineByLineDataResponse.getEndpoint() : 0L);

    }

    @ApiOperation("Retrieve Line Status By Line ID")
    @GetMapping("/{id}/line-status")
    public Long getLineStatuses(@ApiParam("Line ID ") @PathVariable(value = "id") Long id) {

        ReturnLineByLineDataResponse returnLineByLineDataResponse = getLineByLineID(id);

        return (returnLineByLineDataResponse != null ? returnLineByLineDataResponse.getLinestatus() : 0L);

    }

    @ApiOperation("Retrieve Line Search")
    @PostMapping("/find-line")
    public List<ReturnLineByLineDataResponse> searchLines(@ApiParam(value = "\t") @RequestBody ReturnLineByLineDataRequest returnLineByLineDataRequest){


        List<ReturnLineByLineDataResponse> result = findLineByLineData(returnLineByLineDataRequest);

        return result;
    }

    @ApiOperation("Retrieve Route Tariffa By Line ID")
    @GetMapping("/{id}/tariff")
    public List<ReturnRouteTariffByLineIDResponse> getRouteTariffByLineID(@ApiParam("Line ID") @PathVariable(value = "id") Long id){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnRouteTariffByLineID");
        storedProcedureQuery.setParameter(1, id);

        List<ReturnRouteTariffByLineIDResponse> result = storedProcedureQuery.getResultList();

        return  result;
    }

    @ApiOperation("Retrieve Line By Line ID")
    @GetMapping("/{id}")
    public ReturnLineByLineDataResponse getLineByLineID(@ApiParam("Line ID ") @PathVariable(value = "id") Long id){

        if (id == 0){
            return null;
        }else {
            ReturnLineByLineDataRequest returnLineByLineDataRequest = new ReturnLineByLineDataRequest();
            returnLineByLineDataRequest.setMinlineidparm(id);
            returnLineByLineDataRequest.setMaxlineidparm(id);

            List<ReturnLineByLineDataResponse> result = findLineByLineData(returnLineByLineDataRequest);

            if (!result.isEmpty()) {
                return result.get(0);
            }

            return null;
        }
    }

//    End Retrieve Methods Code


    @ApiResponses(value = {
            @ApiResponse(code = 200 , message =
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
    @ApiOperation("Add or Edit Line")
    @PostMapping
    public String addLine(@ApiParam(value = "\t") @RequestBody SaveLineDataRequest saveLineDataRequest, HttpServletRequest request){

        log.debug("SaveLineDataRequest : " + saveLineDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        saveLineDataRequest.setIpaddressparm(request.getRemoteAddr());

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveLineData", saveLineDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        return (String) storedProcedureQuery.getSingleResult();
    }

    @ApiResponses(value = {
            @ApiResponse(code = 200 , message =
                    "Number$U\n" +
                    "Number :  Effected rows  \n" +
                    "$ : Special character to split concatenated strings \n" +
                    "U: Indicator for update successfully \n"+
                    "-----------------------------------------------------\n" +
                    "  \n"+
                    "E$Number$TEXT\n" +
                    "----------\n" +
                    "E : Indicator for Error\n" +
                    "Number :  Effected rows  \n" +
                    "$ : Special character to split concatenated strings \n" +
                    "U: Indicator for update successfully \n" +
                    "TEXT : DataBase system Error Message \n"

            )
    })
    @ApiOperation(value = "Change Line Status")
    @DeleteMapping("/{id}")
    public String deleteLine(@ApiParam("Line ID ") @PathVariable(value = "id") Long id){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ChangeLineStatus");
        storedProcedureQuery.setParameter(1, 3);
        storedProcedureQuery.setParameter(2, id);
//        storedProcedureQuery.setParameter(3, principalid);

        return (String)storedProcedureQuery.getSingleResult();
    }

    private List<ReturnLineByLineDataResponse> findLineByLineData(@ApiParam(value = "\t") ReturnLineByLineDataRequest returnLineByLineDataRequest){


        log.debug("ReturnLineByLineDataRequest : " + returnLineByLineDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnLineByLineData", returnLineByLineDataRequest);
        } catch (Exception e) {

            log.error(e.getMessage());

        }

        List<ReturnLineByLineDataResponse> result = storedProcedureQuery.getResultList();

        return result;

    }
}