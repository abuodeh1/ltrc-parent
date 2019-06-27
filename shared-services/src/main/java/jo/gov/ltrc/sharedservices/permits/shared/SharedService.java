package jo.gov.ltrc.sharedservices.permits.shared;

import io.swagger.annotations.*;
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
@RequestMapping(value = "/api")
public class SharedService {

    @PersistenceContext
    private EntityManager entityManager;


    @PostMapping("/country/find")
    public List<ReturnCountryResponse> findCountry(@ApiParam("Retrieved List of Countries") @RequestBody ReturnCountryRequest countryRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnCountry");
        storedProcedureQuery.setParameter(1, countryRequest.getCountryidparm());
        storedProcedureQuery.setParameter(2, countryRequest.getCountryarabicnameparm());
        storedProcedureQuery.setParameter(3, countryRequest.getCountryenglishnameparm());
        storedProcedureQuery.setParameter(4, countryRequest.getCountrycodeparm());

        List<ReturnCountryResponse> result = storedProcedureQuery.getResultList();

        return result;
    }


    @PostMapping("/region/find")
    public List<ReturnRegionResponse> findRegion(@ApiParam("Retrieve List of Regions") @RequestBody ReturnRegionRequest returnRegionRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnProvince");
        storedProcedureQuery.setParameter(1, returnRegionRequest.getProvinceidparm());
        storedProcedureQuery.setParameter(2, returnRegionRequest.getProvincearabicnameparm());
        storedProcedureQuery.setParameter(3, returnRegionRequest.getProvinceenglishnameparm());
        storedProcedureQuery.setParameter(4, returnRegionRequest.getProvincecodeparm());
        storedProcedureQuery.setParameter(5, returnRegionRequest.getCountryidparm());

        List<ReturnRegionResponse> result = storedProcedureQuery.getResultList();

        return result;

    }


    @PostMapping("/governorate/find")
    public List<ReturnGovernerateResponse> findGovernerate(@ApiParam("Retrieve List of Governorates") @RequestBody ReturnGovernerateRequest governerateRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnGovernorate");
        storedProcedureQuery.setParameter(1, governerateRequest.getGovernorateidparm());
        storedProcedureQuery.setParameter(2, governerateRequest.getGovernoratearabicnameparm());
        storedProcedureQuery.setParameter(3, governerateRequest.getGovernorateenglishnameparm());
        storedProcedureQuery.setParameter(4, governerateRequest.getGovernoratecodeparm());
        storedProcedureQuery.setParameter(5, governerateRequest.getCountryidparm());
        storedProcedureQuery.setParameter(6, governerateRequest.getProvinceidparm());

        List<ReturnGovernerateResponse> result = storedProcedureQuery.getResultList();

        return result;

    }


    @PostMapping("/municipality/find")
    public List<ReturnMunicipalityResponse> findMunicipality(@ApiParam("Retrieve List of Municipalities") @RequestBody ReturnMunicipalityRequest municipalityRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnMunicipality");
        storedProcedureQuery.setParameter(1, municipalityRequest.getMunicipalityidparm());
        storedProcedureQuery.setParameter(2, municipalityRequest.getMunicipalityarabicnameparm());
        storedProcedureQuery.setParameter(3, municipalityRequest.getMunicipalityenglishnameparm());
        storedProcedureQuery.setParameter(4, municipalityRequest.getMunicipalitycodeparm());
        storedProcedureQuery.setParameter(5, municipalityRequest.getGovernorateidparm());


        List<ReturnMunicipalityResponse> result = storedProcedureQuery.getResultList();

        return result;

    }


    @PostMapping("/area/find")
    public List<ReturnAreaResponse> findArea(@ApiParam("Retrieve List of Areas") @RequestBody ReturnAreaRequest returnAreaRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnTerritory");
        storedProcedureQuery.setParameter(1, returnAreaRequest.getTerritoryidparm());
        storedProcedureQuery.setParameter(2, returnAreaRequest.getTerritoryarabicnameparm());
        storedProcedureQuery.setParameter(3, returnAreaRequest.getTerritoryenglishnameparm());
        storedProcedureQuery.setParameter(4, returnAreaRequest.getTerritorycodeparm());
        storedProcedureQuery.setParameter(5, returnAreaRequest.getMunicipalityparm());


        List<ReturnAreaResponse> result = storedProcedureQuery.getResultList();

        return result;

    }


    @GetMapping("/vehicle-categories")
    public List<ReturnVehicleCategoriesResponse> getAllVehicleCategories(){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnAllVehicleCategories");

        List<ReturnVehicleCategoriesResponse> result = storedProcedureQuery.getResultList();

        return result ;
    }


    @GetMapping("/fuel-type")
    public List<ReturnFuelTypesResponse> getAllFuelTypes(){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnAllFuelTypes");

        List<ReturnFuelTypesResponse> result = storedProcedureQuery.getResultList();

        return result ;
    }

}
