package jo.gov.ltrc.permit.services.tariffa;

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
@RequestMapping(value = "/api/tariff")
@Log4j2
public class TariffaService {

    @PersistenceContext
    private EntityManager entityManager;


//    Start Add or Edit Methods Code

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
    @ApiOperation("Add or Edit Tariffa")
    @PostMapping
    public String  saveTariff(@ApiParam("\t") @RequestBody SaveRouteTariffDataRequest saveRouteTariffDataRequest, HttpServletRequest request){

        log.debug(" SaveRouteTariffDataRequest : " + saveRouteTariffDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        saveRouteTariffDataRequest.setIpaddressparm(request.getRemoteAddr());

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveRouteTariffData", saveRouteTariffDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        return (String) storedProcedureQuery.getSingleResult();
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
    @ApiOperation("Add or Edit Inflation Referance")
    @PostMapping("/inflation-referance")
    public String addInflationReferance(@ApiParam("\t") @RequestBody SaveInflationReferanceDataRequest saveInflationReferanceDataRequest, HttpServletRequest request){

        log.debug(" SaveInflationReferanceDataRequest : " + saveInflationReferanceDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        saveInflationReferanceDataRequest.setIpaddressparm(request.getRemoteAddr());

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveInflationReferanceData", saveInflationReferanceDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        return (String) storedProcedureQuery.getSingleResult() ;
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
    @ApiOperation("Add or EditTariff Equation ")
    @PostMapping("/equation")
    public String addTariffEquationData(@ApiParam("\t") @RequestBody SaveTariffEquationDataRequest saveTariffEquationDataRequest, HttpServletRequest request){

        log.debug(" SaveTariffEquationDataRequest : " + saveTariffEquationDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        saveTariffEquationDataRequest.setIpaddressparm(request.getRemoteAddr());

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveTariffEquationData", saveTariffEquationDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        return (String) storedProcedureQuery.getSingleResult() ;

    }

//    End Add or Edit Methods Code




//    Start Retrieve Methods Code

    @ApiOperation("Retrieve Route Tariff Data By Tariff ID ")
    @GetMapping("/{id}/route-tariff")
    public ReturnRouteTariffByTariffIdDataResponse getRouteTariffByTariffData (@ApiParam("Tariffa ID ") @PathVariable(value = "id") Long id) {

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

    @ApiOperation("Retrieve Tariff ")
    @PostMapping("/find-line")
    public List<ReturnLineByTariffDataResponse> getLineByTariffData(@ApiParam("\t") @RequestBody ReturnLineByTariffDataRequest returnLineByTariffDataRequest){

        log.debug(" ReturnLineByTariffDataRequest : " + returnLineByTariffDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnLineByTariffData", returnLineByTariffDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        List<ReturnLineByTariffDataResponse> result = storedProcedureQuery.getResultList();

        return result ;
    }

    @ApiOperation("Retrieve Tariff Equation ")
    @PostMapping("/find/equation")
    public List<ReturnTariffEquationDataResponse> getTariffEquation(@ApiParam("\t") @RequestBody ReturnTariffEquationDataRequest returnTariffEquationDataRequest){

        log.debug(" ReturnTariffEquationDataRequest : " + returnTariffEquationDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnTariffEquation", returnTariffEquationDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }


        List<ReturnTariffEquationDataResponse> result = storedProcedureQuery.getResultList() ;

        return result ;

    }

    @ApiOperation("Retrieve Inflation ")
    @PostMapping("/find/inflation")
    public List<ReturnInflationResponse> getInflation(@ApiParam("\t") @RequestBody ReturnInflationDataRequest returnInflationDataRequest){

        log.debug(" ReturnInflationDataRequest : " + returnInflationDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnInflation", returnInflationDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        List<ReturnInflationResponse> result = storedProcedureQuery.getResultList() ;

        return result ;
    }

    //    End Retrieve Methods Code


    @ApiOperation("Calculate Tariff Value")
    @PostMapping("/find-value")
    public CalculateTariffValueDataResponse calculateTariffaValue(@ApiParam("\t") @RequestBody CalculateTariffValueDataRequest calculateTariffValueDataRequest){

        log.debug(" CalculateTariffValueDataRequest : " + calculateTariffValueDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnTariffVaLue", calculateTariffValueDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        List<CalculateTariffValueDataResponse> result = storedProcedureQuery.getResultList();

        if(result != null){
            return result.get(0);
        }

        return null ;

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
    @ApiOperation("Change Tariff Status")
    @DeleteMapping("/{id}")
    public String deleteTariffByTariffID(@ApiParam("Tarrifa ID ") @PathVariable(value = "id") Long id){

         SaveRouteTariffDataRequest saveRouteTariffDataRequest = new SaveRouteTariffDataRequest();
        log.debug(" SaveRouteTariffDataRequest : " + saveRouteTariffDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;
        saveRouteTariffDataRequest.setRoutetariffidparm(id);
        saveRouteTariffDataRequest.setStatusparm(3);
        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveRouteTariffData", saveRouteTariffDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }


         return (String) storedProcedureQuery.getSingleResult();
     }
}

