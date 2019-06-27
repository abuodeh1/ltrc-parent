package jo.gov.ltrc.sharedservices.permits.point;

import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
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
@RequestMapping(value = "/api/point")
@Transactional( propagation = Propagation.SUPPORTS, readOnly = true )
public class PointService {

    @PersistenceContext
    private EntityManager entityManager;

    @PostMapping("/find-point")
    public List<ReturnPointResponse> findPoint(@ApiParam("Retrieve Point Find") @RequestBody ReturnPointRequest returnPointRequest){

        List<ReturnPointResponse> result = findPointData(returnPointRequest);

        return result;
    }

    @GetMapping("/{id}/characteristics")
    public long getPointChar(@ApiParam("Retrieve Point Characteristics") @PathVariable(value = "id") long id){

       ReturnPointResponse returnPointResponse = getPointID(id);

       return (returnPointResponse != null ? returnPointResponse.getPointcharacteristic() : 0L );

    }

    @GetMapping("/{id}/parking-type")
    public long getParkingType(@ApiParam("Retrieve Parking Type") @PathVariable(value = "id") long id){

        ReturnPointResponse returnPointResponse = getPointID(id);

        return (returnPointResponse != null ? returnPointResponse.getPointparkingtype() : 0L );

    }

    @GetMapping("/{id}/status")
    public int getPointStatus(@ApiParam("Retrieve Point Status") @PathVariable(value = "id") long id){

        ReturnPointResponse returnPointResponse = getPointID(id);

        return (returnPointResponse != null ? returnPointResponse.getPointstatus() : 0 );

    }

    @PostMapping
    public String savePoint(@ApiParam("Add or Edit Point") @RequestBody SavePointDataRequest savePointDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SavePointData");
        storedProcedureQuery.setParameter(1, savePointDataRequest.getPointidparm());
        storedProcedureQuery.setParameter(2, savePointDataRequest.getPointarabicnameparm());
        storedProcedureQuery.setParameter(3, savePointDataRequest.getProvinceidparm());
        storedProcedureQuery.setParameter(4, savePointDataRequest.getGovernorateidparm());
        storedProcedureQuery.setParameter(5, savePointDataRequest.getMunicipalityidparm());
        storedProcedureQuery.setParameter(6, savePointDataRequest.getTerritoryidparm());
        storedProcedureQuery.setParameter(7, savePointDataRequest.getPointcharacteristicparm());
        storedProcedureQuery.setParameter(8, savePointDataRequest.getPointparkingtypeparm());
        storedProcedureQuery.setParameter(9, savePointDataRequest.getPointstreetparm());
        storedProcedureQuery.setParameter(10, savePointDataRequest.getPointneighborhoodparm());
        storedProcedureQuery.setParameter(11, savePointDataRequest.getOfficenameparm());
        storedProcedureQuery.setParameter(12, savePointDataRequest.getOfficephonenumberparm());
        storedProcedureQuery.setParameter(13, savePointDataRequest.getLiaisonofficernameparm());
        storedProcedureQuery.setParameter(14, savePointDataRequest.getPointstatusparm());
        storedProcedureQuery.setParameter(15 , savePointDataRequest.isSunshadesparm());
        storedProcedureQuery.setParameter(16, savePointDataRequest.isHealthcarefacilitiesparm());
        storedProcedureQuery.setParameter(17, savePointDataRequest.isPublictelephonesparm());
        storedProcedureQuery.setParameter(18, savePointDataRequest.isSeatparm());
        storedProcedureQuery.setParameter(19, savePointDataRequest.getTerminalareaparm());
        storedProcedureQuery.setParameter(20, savePointDataRequest.getCountofsunshadesparm());
        storedProcedureQuery.setParameter(21, savePointDataRequest.getCountofseatsparm());
        storedProcedureQuery.setParameter(22, savePointDataRequest.getCountoflanesparm());
        storedProcedureQuery.setParameter(23, savePointDataRequest.getCountofseatsandsunshadesparm());
        storedProcedureQuery.setParameter(24, savePointDataRequest.getTerminalremarksparm());
        storedProcedureQuery.setParameter(25, savePointDataRequest.getPrencipal());

        return (String) storedProcedureQuery.getSingleResult();

    }

    @DeleteMapping("/{id}/principal/{principalid}")
    public String deletePoint(@ApiParam("Point ID") @PathVariable(value = "id") long id,@ApiParam("Principal ID") @PathVariable(value = "principalid") long principalid){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ChangePointStatus");
        storedProcedureQuery.setParameter(1, id);
        storedProcedureQuery.setParameter(2, 3);
        storedProcedureQuery.setParameter(3, principalid);

        return (String)storedProcedureQuery.getSingleResult();
    }

    @GetMapping("/{id}")
    public  ReturnPointByIDResponse getPointByID(@ApiParam("Retrieve Point By ID") @PathVariable(value = "id") long id){

        if (id != 0) {
            StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnPointByPointID");
            storedProcedureQuery.setParameter(1, id);

            List<ReturnPointByIDResponse> result = storedProcedureQuery.getResultList();

            if (!result.isEmpty()) {
                return result.get(0);
            }else {
                return null ;
            }
        }
        return null;

    }

    private ReturnPointResponse getPointID(long id){

        ReturnPointRequest returnPointRequest = new ReturnPointRequest();
        returnPointRequest.setMinpointidparm(id);
        returnPointRequest.setMaxpointidparm(id);

        List<ReturnPointResponse> result = findPointData(returnPointRequest);

        if(!result.isEmpty()) {
            return result.get(0);
        }

        return null;
    }

    private List<ReturnPointResponse> findPointData(ReturnPointRequest returnPointRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnPoint");
        storedProcedureQuery.setParameter(1, returnPointRequest.getMinpointidparm());
        storedProcedureQuery.setParameter(2, returnPointRequest.getMaxpointidparm());
        storedProcedureQuery.setParameter(3, returnPointRequest.getPointarabicnameparm());
        storedProcedureQuery.setParameter(4, returnPointRequest.getGovernorateidparm());
        storedProcedureQuery.setParameter(5, returnPointRequest.getPointstreetparm());
        storedProcedureQuery.setParameter(6, returnPointRequest.getMunicipalityidparm());
        storedProcedureQuery.setParameter(7, returnPointRequest.getTerritoryidparm());
        storedProcedureQuery.setParameter(8, returnPointRequest.getProvinceidparm());
        storedProcedureQuery.setParameter(9, returnPointRequest.getPointneighborhoodparm());
        storedProcedureQuery.setParameter(10, returnPointRequest.getPointcharacteristicparm());
        storedProcedureQuery.setParameter(11, returnPointRequest.getPointparkingtypeparm());
        storedProcedureQuery.setParameter(12, returnPointRequest.getPointstatusparm());
        storedProcedureQuery.setParameter(13, returnPointRequest.isSunshadesparm());
        storedProcedureQuery.setParameter(14, returnPointRequest.isHealthcarefacilitiesparm());
        storedProcedureQuery.setParameter(15, returnPointRequest.isPublictelephonesparm());
        storedProcedureQuery.setParameter(16, returnPointRequest.isSeatparm());

        List<ReturnPointResponse> result = storedProcedureQuery.getResultList();

        return result;

    }

}
