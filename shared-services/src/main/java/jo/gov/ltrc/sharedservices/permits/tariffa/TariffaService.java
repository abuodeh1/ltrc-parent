package jo.gov.ltrc.sharedservices.permits.tariffa;

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
@RequestMapping(value = "/api/tariff")
public class TariffaService {

    @PersistenceContext
    private EntityManager entityManager;

    @PostMapping("/find-line")
    public List<ReturnLineByTariffDataResponse> getLineByTariffData(@ApiParam("Retrieve list of Tariffa Data") @RequestBody ReturnLineByTariffDataRequest returnLineByTariffDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnLineByTariffData");
        storedProcedureQuery.setParameter(1, returnLineByTariffDataRequest.getRouteidparm());
        storedProcedureQuery.setParameter(2, returnLineByTariffDataRequest.getFueltypeparm());
        storedProcedureQuery.setParameter(3, returnLineByTariffDataRequest.getVehiclecategoryparm());
        storedProcedureQuery.setParameter(4, returnLineByTariffDataRequest.getTariffunitparm());
        storedProcedureQuery.setParameter(5, returnLineByTariffDataRequest.getTariffmethedologyparm());
        storedProcedureQuery.setParameter(6, returnLineByTariffDataRequest.getMinmumtariffvalueparm());
        storedProcedureQuery.setParameter(7, returnLineByTariffDataRequest.getMaximumtariffvalueparm());
        storedProcedureQuery.setParameter(8, returnLineByTariffDataRequest.getMintariffmaxvalueparm());
        storedProcedureQuery.setParameter(9, returnLineByTariffDataRequest.getMaxtariffmaxvalueparm());

        List<ReturnLineByTariffDataResponse> result = storedProcedureQuery.getResultList();

        return result ;
    }

    @PostMapping
    public String  saveTariff(@ApiParam("Add or Edit Tariffa") @RequestBody SaveRouteTariffDataRequest saveRouteTariffDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveRouteTariffData");
        storedProcedureQuery.setParameter(1, saveRouteTariffDataRequest.getRoutetariffidparm());
        storedProcedureQuery.setParameter(2, saveRouteTariffDataRequest.getRouteidparm());
        storedProcedureQuery.setParameter(3, saveRouteTariffDataRequest.getTariffequtionparm());
        storedProcedureQuery.setParameter(4, saveRouteTariffDataRequest.getTariffstudyparm());
        storedProcedureQuery.setParameter(5, saveRouteTariffDataRequest.getFueltypeparm());
        storedProcedureQuery.setParameter(6, saveRouteTariffDataRequest.getVehiclecategoryparm());
        storedProcedureQuery.setParameter(7, saveRouteTariffDataRequest.getInflationparm());
        storedProcedureQuery.setParameter(8, saveRouteTariffDataRequest.getValueparm1());
        storedProcedureQuery.setParameter(9, saveRouteTariffDataRequest.getValueparm2());
        storedProcedureQuery.setParameter(10, saveRouteTariffDataRequest.getStartdateparm());
        storedProcedureQuery.setParameter(11, saveRouteTariffDataRequest.getEnddateparm());
        storedProcedureQuery.setParameter(12, saveRouteTariffDataRequest.getPrencipal());
        storedProcedureQuery.setParameter(13, saveRouteTariffDataRequest.getTariffunitparm());
        storedProcedureQuery.setParameter(14, saveRouteTariffDataRequest.getBasedonparm());
        storedProcedureQuery.setParameter(15, saveRouteTariffDataRequest.getStatusparm());

        return (String) storedProcedureQuery.getSingleResult();
    }

    @PostMapping("/find-value")
    public CalculateTariffValueDataResponse calculateTariffaValue(@ApiParam("Calculate Tariffa Value") @RequestBody CalculateTariffValueDataRequest calculateTariffValueDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnTariffVaLue");
        storedProcedureQuery.setParameter(1, calculateTariffValueDataRequest.getRouteidparm());
        storedProcedureQuery.setParameter(2, calculateTariffValueDataRequest.getVehiclecategoryparm());

        List<CalculateTariffValueDataResponse> result = storedProcedureQuery.getResultList();

        if(result != null){
            return result.get(0);
        }

        return null ;

    }

    @GetMapping("/{id}/route-tariff")
    public ReturnRouteTariffByTariffIdDataResponse getLineByTariffData (@ApiParam("Retrieve Route Traiifa Data") @PathVariable(value = "id") long id) {

        if (id != 0) {
            StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnRouteTariffByTariffaID");
            storedProcedureQuery.setParameter(1, id);

            List<ReturnRouteTariffByTariffIdDataResponse> result = storedProcedureQuery.getResultList();

            if (!result.isEmpty()) {
                return result.get(0);
            } else {
                return null;
            }
        }
        return null ;
     }

    @DeleteMapping("/{id}")
    public String deleteTariffByTariffID(@ApiParam("Change Tariffa Status") @PathVariable(value = "id") long id){

         SaveRouteTariffDataRequest saveRouteTariffDataRequest = new SaveRouteTariffDataRequest();
         StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveRouteTariffData");
         storedProcedureQuery.setParameter(1, id);
         storedProcedureQuery.setParameter(2, saveRouteTariffDataRequest.getRouteidparm());
         storedProcedureQuery.setParameter(3, saveRouteTariffDataRequest.getTariffequtionparm());
         storedProcedureQuery.setParameter(4, saveRouteTariffDataRequest.getTariffstudyparm());
         storedProcedureQuery.setParameter(5, saveRouteTariffDataRequest.getFueltypeparm());
         storedProcedureQuery.setParameter(6, saveRouteTariffDataRequest.getVehiclecategoryparm());
         storedProcedureQuery.setParameter(7, saveRouteTariffDataRequest.getInflationparm());
         storedProcedureQuery.setParameter(8, saveRouteTariffDataRequest.getValueparm1());
         storedProcedureQuery.setParameter(9, saveRouteTariffDataRequest.getValueparm2());
         storedProcedureQuery.setParameter(10, saveRouteTariffDataRequest.getStartdateparm());
         storedProcedureQuery.setParameter(11, saveRouteTariffDataRequest.getEnddateparm());
         storedProcedureQuery.setParameter(12, saveRouteTariffDataRequest.getPrencipal());
         storedProcedureQuery.setParameter(13, saveRouteTariffDataRequest.getTariffunitparm());
         storedProcedureQuery.setParameter(14, saveRouteTariffDataRequest.getBasedonparm());
         storedProcedureQuery.setParameter(15, 3);

         return (String) storedProcedureQuery.getSingleResult();
     }
}

