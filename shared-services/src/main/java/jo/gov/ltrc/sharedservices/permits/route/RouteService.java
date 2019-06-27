package jo.gov.ltrc.sharedservices.permits.route;




import io.swagger.annotations.ApiParam;


import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import java.util.List;


@ApiResponses(value = {

        @ApiResponse(code = 500, message = "Exception thrown if the response does not match the mapping or data type : " +
                "Error extracting results.\n" +
                "Exception thrown if the the data base function does not exist or" +
                " if the data base function does not match between request and response classes : Database function doesn't exist.\n")
})
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(value = "/api/route")
public class RouteService {

    @PersistenceContext
    private EntityManager entityManager;


    @GetMapping("/{id}/start-point")
    public long getStartPoints(@ApiParam("Retrieve Route Start Point By ID") @PathVariable(value = "id") long id) {

        ReturnLineByRouteDataResponse returnLineByRouteDataResponse = getLineByRouteID(id);

        return (returnLineByRouteDataResponse != null? returnLineByRouteDataResponse.getStartpoint() : 0L);
    }

    @GetMapping("/{id}/end-point")
    public long getEndPoints(@ApiParam("Retrieve Route End Point By ID") @PathVariable(value = "id") long id) {

        ReturnLineByRouteDataResponse returnLineByRouteDataResponse = getLineByRouteID(id);

        return (returnLineByRouteDataResponse != null? returnLineByRouteDataResponse.getEndpoint() : 0L);

    }

    @GetMapping("/{id}/line-status")
    public long getStatuses(@ApiParam("Retrieve Route Line Status By ID") @PathVariable(value = "id") long id) {

        ReturnLineByRouteDataResponse returnLineByRouteDataResponse = getLineByRouteID(id);

        return (returnLineByRouteDataResponse != null? returnLineByRouteDataResponse.getLinestatus() : 0L);

    }

    @PostMapping("/find")
    public List<ReturnRouteResponse> findRoute (@ApiParam("Retrieve Route Find ") @RequestBody ReturnRouteRequest returnRouteRequest){

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

    @GetMapping("/{id}/point")
    public List<ReturnRoutePointsResponse> getPoints (@ApiParam("Retrieve Route Point By ID") @PathVariable(value = "id") long id){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnRoutePoints");
        storedProcedureQuery.setParameter(1, id);

        List<ReturnRoutePointsResponse> result = storedProcedureQuery.getResultList();

        return result;
    }

    @PostMapping("/find-line")
    public List<ReturnLineByRouteDataResponse> searchLines(@ApiParam("Retrieve Line Search ") @RequestBody ReturnLineByRouteDataRequest returnLineByRouteDataRequest){

        List<ReturnLineByRouteDataResponse> result = findLineByRouteData(returnLineByRouteDataRequest);

        return result;
    }

    @PostMapping
    public String addRoute(@ApiParam("Add or Edit Route ") @RequestBody SaveRouteDataRequest saveRouteDataRequest) {

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

            if(saveRouteDataRequest.getPoints() != null){

                saveRouteDataRequest.getPoints().forEach(point -> addRoutePoint(routeId, point));
            }


        }

        return routeRs;
    }

    @PostMapping("/{id}/point")
    public String addRoutePoint(@ApiParam("Add or Edit Point Route ") @PathVariable(value = "id") long id, @RequestBody SaveRoutePointDataRequest saveRoutePointDataRequest) {

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveRoutePointData");
        storedProcedureQuery.setParameter(1, id);
        storedProcedureQuery.setParameter(2, saveRoutePointDataRequest.getPointidparm());
        storedProcedureQuery.setParameter(3, saveRoutePointDataRequest.getPrincipal());
        storedProcedureQuery.setParameter(4, saveRoutePointDataRequest.getPointorderparm());
        storedProcedureQuery.setParameter(5, saveRoutePointDataRequest.isPointdirectionparm());

        return (String) storedProcedureQuery.getSingleResult();
    }

    @GetMapping("/{id}/line")
    public ReturnLineByRouteDataResponse getLineByRouteID(@ApiParam("Retrieve Line By Route ID") @PathVariable(value = "id") long id){

        ReturnLineByRouteDataRequest returnLineByRouteDataRequest = new ReturnLineByRouteDataRequest();
        returnLineByRouteDataRequest.setMinrouteidparm(id);
        returnLineByRouteDataRequest.setMaxrouteidparm(id);

        List<ReturnLineByRouteDataResponse> result = findLineByRouteData(returnLineByRouteDataRequest);

        if(!result.isEmpty()){

            return result.get(0);
        }

        return null;
    }

    @DeleteMapping("/{id}/principal/{principalid}")
    public String deleteRoute(@ApiParam("Change Route Status") @PathVariable(value = "id") long id, @PathVariable(value = "principalid") long principalid) {

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

}