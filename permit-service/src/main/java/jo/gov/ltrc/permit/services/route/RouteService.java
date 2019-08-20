package jo.gov.ltrc.permit.services.route;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;


import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
@RequestMapping(value = "/api/route")
@Log4j2
public class RouteService {

    @PersistenceContext
    private EntityManager entityManager;

//    Start Add or Edit Methods

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
    @ApiOperation("Add or Edit Route ")
    @PostMapping
    public String addRoute(@ApiParam("\t") @RequestBody SaveRouteDataRequest saveRouteDataRequest, HttpServletRequest request) {

        log.debug(" SaveRouteDataRequest : " + saveRouteDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

//        saveRouteDataRequest.setIP = request.getRemoteAddr();

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveRouteData", saveRouteDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        String routeRs = (String) storedProcedureQuery.getSingleResult();

        if(!routeRs.startsWith("E")){

            Long routeId = Long.valueOf(routeRs.substring(0, routeRs.indexOf("$")));

            String deleteRs = deleteRoutePointData(saveRouteDataRequest.getRouteidparm() , 0L , saveRouteDataRequest.getPrincepal());

            if(saveRouteDataRequest.getPoints() != null && deleteRs.equalsIgnoreCase("1$D")) {

                if (saveRouteDataRequest.getRouteidparm() == 0) {
                    saveRouteDataRequest.setRouteidparm(routeId);
                    saveRouteDataRequest.getPoints().forEach(point -> addRoutePoint(point));
                }else {
                    saveRouteDataRequest.setRouteidparm(saveRouteDataRequest.getRouteidparm());
                    saveRouteDataRequest.getPoints().forEach(point -> addRoutePoint(point));
                }
            }


        }

        return routeRs;
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
    @ApiOperation("Add or Edit Point Route ")
    @PostMapping("/{id}/point")
    public String addRoutePoint(@ApiParam("\t") @RequestBody SaveRoutePointDataRequest saveRoutePointDataRequest) {

        log.debug(" SaveRoutePointDataRequest : " + saveRoutePointDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveRoutePointData", saveRoutePointDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        return (String) storedProcedureQuery.getSingleResult();
    }


//    End Add or Edit Methods


//    Start Retrieve Methods

    @ApiOperation("Retrieve Start Point Line By Route ID")
    @GetMapping("/{id}/start-point")
    public Long getStartPoints(@ApiParam("Route ID") @PathVariable(value = "id") Long id) {

        ReturnLineByRouteDataResponse returnLineByRouteDataResponse = getLineByRouteID(id);

        return (returnLineByRouteDataResponse != null? returnLineByRouteDataResponse.getStartpoint() : 0L);
    }

    @ApiOperation("Retrieve End Point Line By Route ID")
    @GetMapping("/{id}/end-point")
    public Long getEndPoints(@ApiParam("Route ID") @PathVariable(value = "id") Long id) {

        ReturnLineByRouteDataResponse returnLineByRouteDataResponse = getLineByRouteID(id);

        return (returnLineByRouteDataResponse != null? returnLineByRouteDataResponse.getEndpoint() : 0L);

    }

    @ApiOperation("Retrieve Status Line By Route ID")
    @GetMapping("/{id}/line-status")
    public Long getStatuses(@ApiParam("Route ID") @PathVariable(value = "id") Long id) {

        ReturnLineByRouteDataResponse returnLineByRouteDataResponse = getLineByRouteID(id);

        return (returnLineByRouteDataResponse != null? returnLineByRouteDataResponse.getLinestatus() : 0L);

    }

    @ApiOperation("Retrieve Route Find ")
    @PostMapping("/find")
    public List<ReturnRouteResponse> findRoute (@ApiParam("\t") @RequestBody ReturnRouteRequest returnRouteRequest){

        log.debug(" ReturnRouteRequest : " + returnRouteRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnRoute", returnRouteRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        List<ReturnRouteResponse> result = storedProcedureQuery.getResultList();

        return result ;
    }

    @ApiOperation("Retrieve Route Points By Route ID")
    @GetMapping("/{id}/point")
    public List<ReturnRoutePointsResponse> getPoints (@ApiParam("Route ID") @PathVariable(value = "id") Long id){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnRoutePoints");
        storedProcedureQuery.setParameter(1, id);

        List<ReturnRoutePointsResponse> result = storedProcedureQuery.getResultList();

        return result;
    }

    @ApiOperation("Retrieve Line Search By Route Data ")
    @PostMapping("/find-line")
    public List<ReturnLineByRouteDataResponse> searchLines(@ApiParam("\t") @RequestBody ReturnLineByRouteDataRequest returnLineByRouteDataRequest){

        List<ReturnLineByRouteDataResponse> result = findLineByRouteData(returnLineByRouteDataRequest);

        return result;
    }

    @ApiOperation("Retrieve Line By Route ID")
    @GetMapping("/{id}/line")
    public ReturnLineByRouteDataResponse getLineByRouteID(@ApiParam("Route ID") @PathVariable(value = "id") Long id){

        ReturnLineByRouteDataRequest returnLineByRouteDataRequest = new ReturnLineByRouteDataRequest();
        returnLineByRouteDataRequest.setMinrouteidparm(id);
        returnLineByRouteDataRequest.setMaxrouteidparm(id);

        List<ReturnLineByRouteDataResponse> result = findLineByRouteData(returnLineByRouteDataRequest);

        if(!result.isEmpty()){

            return result.get(0);
        }

        return null;
    }

//    End Retrieve Methods


    @ApiResponses(value = {
            @ApiResponse(code = 200 , message =
                    "Number$U\n" +
                            "----------\n" +
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
    @ApiOperation("Change Route Status ")
    @DeleteMapping("/{id}/principal/{principalid}")
    public String deleteRoute(@ApiParam("Route ID") @PathVariable(value = "id") Long id,@ApiParam("Principal ID") @PathVariable(value = "principalid") Long principalid) {

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ChangeRouteStatus");
        storedProcedureQuery.setParameter(1, 3);
        storedProcedureQuery.setParameter(2, id);
        storedProcedureQuery.setParameter(3, principalid);

        return (String)storedProcedureQuery.getSingleResult();
    }

    private String deleteRoutePointData(long id , Long pointId , Long prinsipal){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("DeleteRoutePointData");
        storedProcedureQuery.setParameter(1, id);
        storedProcedureQuery.setParameter(2, pointId);
        storedProcedureQuery.setParameter(3, prinsipal);

        return (String) storedProcedureQuery.getSingleResult() ;
    }

    private List<ReturnLineByRouteDataResponse> findLineByRouteData(ReturnLineByRouteDataRequest returnLineByRouteDataRequest){

        log.debug(" ReturnLineByRouteDataRequest : " + returnLineByRouteDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnLineByRouteData", returnLineByRouteDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        List<ReturnLineByRouteDataResponse> result = storedProcedureQuery.getResultList();

        return result;

    }

}