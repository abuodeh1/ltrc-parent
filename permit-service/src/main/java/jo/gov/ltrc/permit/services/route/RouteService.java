package jo.gov.ltrc.permit.services.route;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
@RequestMapping(value = "/api/route")
public class RouteService {

    @PersistenceContext
    private EntityManager entityManager;


    @ApiOperation("Retrieve Start Point Line By Route ID")
    @GetMapping("/{id}/start-point")
    public long getStartPoints(@ApiParam("Route ID") @PathVariable(value = "id") long id) {

        ReturnLineByRouteDataResponse returnLineByRouteDataResponse = getLineByRouteID(id);

        return (returnLineByRouteDataResponse != null? returnLineByRouteDataResponse.getStartpoint() : 0L);
    }

    @ApiOperation("Retrieve End Point Line By Route ID")
    @GetMapping("/{id}/end-point")
    public long getEndPoints(@ApiParam("Route ID") @PathVariable(value = "id") long id) {

        ReturnLineByRouteDataResponse returnLineByRouteDataResponse = getLineByRouteID(id);

        return (returnLineByRouteDataResponse != null? returnLineByRouteDataResponse.getEndpoint() : 0L);

    }

    @ApiOperation("Retrieve Status Line By Route ID")
    @GetMapping("/{id}/line-status")
    public long getStatuses(@ApiParam("Route ID") @PathVariable(value = "id") long id) {

        ReturnLineByRouteDataResponse returnLineByRouteDataResponse = getLineByRouteID(id);

        return (returnLineByRouteDataResponse != null? returnLineByRouteDataResponse.getLinestatus() : 0L);

    }

    @ApiOperation("Retrieve Route Find ")
    @PostMapping("/find")
    public List<ReturnRouteResponse> findRoute (@ApiParam("\t") @RequestBody ReturnRouteRequest returnRouteRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnRoute");
        storedProcedureQuery.setParameter(1, returnRouteRequest.getRouteidparm());
        storedProcedureQuery.setParameter(2, returnRouteRequest.getRoutenameparm());
        storedProcedureQuery.setParameter(3, returnRouteRequest.getRoutelengthparm());
        storedProcedureQuery.setParameter(4, returnRouteRequest.getRoutelengthviagisparm());
        storedProcedureQuery.setParameter(5, returnRouteRequest.getRoutedailypassengersparm());
        storedProcedureQuery.setParameter(6, returnRouteRequest.getBuslineidparm());
        storedProcedureQuery.setParameter(7, returnRouteRequest.getLinenameparm());

        List<ReturnRouteResponse> result = storedProcedureQuery.getResultList();

        return result ;
    }

    @ApiOperation("Retrieve Route Points By Route ID")
    @GetMapping("/{id}/point")
    public List<ReturnRoutePointsResponse> getPoints (@ApiParam("Route ID") @PathVariable(value = "id") long id){

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
    public String addRoute(@ApiParam("\t") @RequestBody SaveRouteDataRequest saveRouteDataRequest) {

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveRouteData");
        storedProcedureQuery.setParameter(1, saveRouteDataRequest.getRoutenameparm());
        storedProcedureQuery.setParameter(2, saveRouteDataRequest.getRoutelengthparm());
        storedProcedureQuery.setParameter(3, saveRouteDataRequest.getRoutelengthviagisparm());
        storedProcedureQuery.setParameter(4, saveRouteDataRequest.getRoutedailypassengersparm());
        storedProcedureQuery.setParameter(5, saveRouteDataRequest.getPrincepal());
        storedProcedureQuery.setParameter(6, saveRouteDataRequest.getBuslineidparm());
        storedProcedureQuery.setParameter(7, saveRouteDataRequest.getStatusparm());
        storedProcedureQuery.setParameter(8, saveRouteDataRequest.getRouteidparm());
        storedProcedureQuery.setParameter(9, saveRouteDataRequest.getGoingparm());
        storedProcedureQuery.setParameter(10, saveRouteDataRequest.getReturningparm());

        String routeRs = (String) storedProcedureQuery.getSingleResult();

        if(!routeRs.startsWith("E")){

            long routeId = Long.valueOf(routeRs.substring(0, routeRs.indexOf("$")));

            String deleteRs = deleteRoutePointData(saveRouteDataRequest.getRouteidparm() , 0 , saveRouteDataRequest.getPrincepal());

            if(saveRouteDataRequest.getPoints() != null && deleteRs.equalsIgnoreCase("1$D")) {

                if (saveRouteDataRequest.getRouteidparm() == 0) {
                    saveRouteDataRequest.getPoints().forEach(point -> addRoutePoint(routeId, point));
                }else {
                    saveRouteDataRequest.getPoints().forEach(point -> addRoutePoint(saveRouteDataRequest.getRouteidparm(), point));
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
    public String addRoutePoint(@ApiParam("\t") @PathVariable(value = "id") long id, @RequestBody SaveRoutePointDataRequest saveRoutePointDataRequest) {

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveRoutePointData");
        storedProcedureQuery.setParameter(1, id);
        storedProcedureQuery.setParameter(2, saveRoutePointDataRequest.getPointidparm());
        storedProcedureQuery.setParameter(3, saveRoutePointDataRequest.getPrincipal());
        storedProcedureQuery.setParameter(4, saveRoutePointDataRequest.getPointorderparm());
        storedProcedureQuery.setParameter(5, saveRoutePointDataRequest.isPointdirectionparm());

        return (String) storedProcedureQuery.getSingleResult();
    }

    @ApiOperation("Retrieve Line By Route ID")
    @GetMapping("/{id}/line")
    public ReturnLineByRouteDataResponse getLineByRouteID(@ApiParam("Route ID") @PathVariable(value = "id") long id){

        ReturnLineByRouteDataRequest returnLineByRouteDataRequest = new ReturnLineByRouteDataRequest();
        returnLineByRouteDataRequest.setMinrouteidparm(id);
        returnLineByRouteDataRequest.setMaxrouteidparm(id);

        List<ReturnLineByRouteDataResponse> result = findLineByRouteData(returnLineByRouteDataRequest);

        if(!result.isEmpty()){

            return result.get(0);
        }

        return null;
    }

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
    public String deleteRoute(@ApiParam("Route ID") @PathVariable(value = "id") long id,@ApiParam("Principal ID") @PathVariable(value = "principalid") long principalid) {

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ChangeRouteStatus");
        storedProcedureQuery.setParameter(1, 3);
        storedProcedureQuery.setParameter(2, id);
        storedProcedureQuery.setParameter(3, principalid);

        return (String)storedProcedureQuery.getSingleResult();
    }

    private List<ReturnLineByRouteDataResponse> findLineByRouteData(ReturnLineByRouteDataRequest returnLineByRouteDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnLineByRouteData");
        storedProcedureQuery.setParameter(1, returnLineByRouteDataRequest.getMinrouteidparm());
        storedProcedureQuery.setParameter(2, returnLineByRouteDataRequest.getMaxrouteidparm());
        storedProcedureQuery.setParameter(3, returnLineByRouteDataRequest.getMinroutedailypassengersparm());
        storedProcedureQuery.setParameter(4, returnLineByRouteDataRequest.getMaxroutedailypassengersparm());
        storedProcedureQuery.setParameter(5, returnLineByRouteDataRequest.getMinroutelengthparm());
        storedProcedureQuery.setParameter(6, returnLineByRouteDataRequest.getMaxroutelengthparm());
        storedProcedureQuery.setParameter(7, returnLineByRouteDataRequest.getMinroutelengthviagisparm());
        storedProcedureQuery.setParameter(8, returnLineByRouteDataRequest.getMaxroutelengthviagisparm());

        List<ReturnLineByRouteDataResponse> result = storedProcedureQuery.getResultList();

        return result;

    }

    private String deleteRoutePointData(long id , long pointId , long prinsipal){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("DeleteRoutePointData");
        storedProcedureQuery.setParameter(1, id);
        storedProcedureQuery.setParameter(2, pointId);
        storedProcedureQuery.setParameter(3, prinsipal);

        return (String) storedProcedureQuery.getSingleResult() ;
    }

}