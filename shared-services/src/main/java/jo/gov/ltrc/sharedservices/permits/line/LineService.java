package jo.gov.ltrc.sharedservices.permits.line;


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
@RequestMapping(value = "/api/line")
public class LineService {

    @PersistenceContext
    private EntityManager entityManager;


    @GetMapping("/types")
    public List<ReturnAllLineTypesResponse> getLineTypes() {

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnAllLineType");

        List<ReturnAllLineTypesResponse> result =  storedProcedureQuery.getResultList();
        return result;
    }

    @GetMapping("/{id}/start-point")
    public long getStartPoints(@ApiParam("Retrieve Line Start Point By Line Id") @PathVariable(value = "id") long id) {

        ReturnLineByLineDataResponse returnLineByLineDataResponse = getLineByLineID(id);

        return (returnLineByLineDataResponse != null ? returnLineByLineDataResponse.getStartpoint() : 0L);
    }

    @GetMapping("/{id}/end-point")
    public long getLineEndPoints(@ApiParam("Retrieve Line End Point By Line ID") @PathVariable(value = "id") long id) {

        ReturnLineByLineDataResponse returnLineByLineDataResponse = getLineByLineID(id);

        return (returnLineByLineDataResponse != null ? returnLineByLineDataResponse.getEndpoint() : 0L);

    }

    @GetMapping("/{id}/line-status")
    public long getLineStatuses(@ApiParam("Retrieve Line Status By Line ID") @PathVariable(value = "id") long id) {

        ReturnLineByLineDataResponse returnLineByLineDataResponse = getLineByLineID(id);

        return (returnLineByLineDataResponse != null ? returnLineByLineDataResponse.getLinestatus() : 0L);

    }

    @PostMapping("/find-line")
    public List<ReturnLineByLineDataResponse> searchLines(@ApiParam("Retrieve Line Search") @RequestBody ReturnLineByLineDataRequest returnLineByLineDataRequest){


        List<ReturnLineByLineDataResponse> result = findLineByLineData(returnLineByLineDataRequest);

        return result;
    }

    @PostMapping
    public String addLine(@ApiParam("Add or Edit Line") @RequestBody SaveLineDataRequest saveLineDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveLineData");
        storedProcedureQuery.setParameter(1, saveLineDataRequest.getLinenameparm());
        storedProcedureQuery.setParameter(2, saveLineDataRequest.isAllowtemporarypermitparm());
        storedProcedureQuery.setParameter(3, saveLineDataRequest.getLineidparm());
        storedProcedureQuery.setParameter(4, saveLineDataRequest.getProvinceidparm());
        storedProcedureQuery.setParameter(5, saveLineDataRequest.getGovernorateidparm());
        storedProcedureQuery.setParameter(6, saveLineDataRequest.getLinetypeparm());
        storedProcedureQuery.setParameter(7, saveLineDataRequest.getStratpointparm());
        storedProcedureQuery.setParameter(8, saveLineDataRequest.getEndpointparm());
        storedProcedureQuery.setParameter(9, saveLineDataRequest.getRemarksparm());
        storedProcedureQuery.setParameter(10, saveLineDataRequest.getLinestatusparm());

        return (String) storedProcedureQuery.getSingleResult();
    }

    @GetMapping("/{id}")
    public ReturnLineByLineDataResponse getLineByLineID(@ApiParam("Retrieve Line By Line ID") @PathVariable(value = "id") long id){

        ReturnLineByLineDataRequest returnLineByLineDataRequest = new ReturnLineByLineDataRequest();
        returnLineByLineDataRequest.setMinlineidparm(id);
        returnLineByLineDataRequest.setMaxlineidparm(id);

        List<ReturnLineByLineDataResponse> result = findLineByLineData(returnLineByLineDataRequest);

        if(!result.isEmpty()){
            return result.get(0);
        }

        return null ;
    }

    @DeleteMapping("/{id}")
    public String deleteLine(@ApiParam("Change Line Status") @PathVariable(value = "id") long id){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ChangeLineStatus");
        storedProcedureQuery.setParameter(1, 3);
        storedProcedureQuery.setParameter(2, id);
//        storedProcedureQuery.setParameter(3, principalid);

        return (String)storedProcedureQuery.getSingleResult();
    }

    @GetMapping("/{id}/tariff")
    public List<ReturnRouteTariffByLineIDResponse> getRouteTariffByLineID(@ApiParam("Retrieve Route Tariffa By Line ID") @PathVariable(value = "id") long id){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnRouteTariffByLineID");
        storedProcedureQuery.setParameter(1, id);

        List<ReturnRouteTariffByLineIDResponse> result = storedProcedureQuery.getResultList();

        return  result;
    }

    private List<ReturnLineByLineDataResponse> findLineByLineData(ReturnLineByLineDataRequest returnLineByLineDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnLineByLineData");
        storedProcedureQuery.setParameter(1, returnLineByLineDataRequest.getMinlineidparm());
        storedProcedureQuery.setParameter(2, returnLineByLineDataRequest.getMaxlineidparm());
        storedProcedureQuery.setParameter(3, returnLineByLineDataRequest.getLinenameparm());
        storedProcedureQuery.setParameter(4, returnLineByLineDataRequest.getProvinceidparm());
        storedProcedureQuery.setParameter(5, returnLineByLineDataRequest.getGovernorateidparm());
        storedProcedureQuery.setParameter(6, returnLineByLineDataRequest.getLinetypeparm());
        storedProcedureQuery.setParameter(7, returnLineByLineDataRequest.getLinestatusparm());
        storedProcedureQuery.setParameter(8, returnLineByLineDataRequest.getLinestartpoint());
        storedProcedureQuery.setParameter(9, returnLineByLineDataRequest.getLineendpont());

        List<ReturnLineByLineDataResponse> result = storedProcedureQuery.getResultList();

        return result;

    }
}