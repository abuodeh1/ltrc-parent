package jo.gov.ltrc.permit.services.tariffa;

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
@RequestMapping(value = "/api/tariff")
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
    public String  saveTariff(@ApiParam("\t") @RequestBody SaveRouteTariffDataRequest saveRouteTariffDataRequest){

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
    public String addInflationReferance(@ApiParam("\t") @RequestBody SaveInflationReferanceDataRequest saveInflationReferanceDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveInflationReferanceData");
        storedProcedureQuery.setParameter(1, saveInflationReferanceDataRequest.getInflationreferanceidparm());
        storedProcedureQuery.setParameter(2, saveInflationReferanceDataRequest.getInflationdirectionparm());
        storedProcedureQuery.setParameter(3, saveInflationReferanceDataRequest.getGasolineratioparm());
        storedProcedureQuery.setParameter(4, saveInflationReferanceDataRequest.getDieselratioparm());
        storedProcedureQuery.setParameter(5, saveInflationReferanceDataRequest.getGeneralrationparm());
        storedProcedureQuery.setParameter(6, saveInflationReferanceDataRequest.getStartdateparm());
        storedProcedureQuery.setParameter(7, saveInflationReferanceDataRequest.getPrincepel());
        storedProcedureQuery.setParameter(8, saveInflationReferanceDataRequest.getStatusparm());

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
    public String addTariffEquationData(@ApiParam("\t") @RequestBody SaveTariffEquationDataRequest saveTariffEquationDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveTariffEquationData");
        storedProcedureQuery.setParameter(1, saveTariffEquationDataRequest.getTariffequationidparm());
        storedProcedureQuery.setParameter(2, saveTariffEquationDataRequest.getVehiclecategoryparm());
        storedProcedureQuery.setParameter(3, saveTariffEquationDataRequest.getAdeddvalueparm());
        storedProcedureQuery.setParameter(4, saveTariffEquationDataRequest.getOperationparm());
        storedProcedureQuery.setParameter(5, saveTariffEquationDataRequest.getRoutecoefficientmultiplicationparm());
        storedProcedureQuery.setParameter(6, saveTariffEquationDataRequest.getStartdateparm());
        storedProcedureQuery.setParameter(7, saveTariffEquationDataRequest.getEnddateparm());
        storedProcedureQuery.setParameter(8, saveTariffEquationDataRequest.getEquationtextparm());
        storedProcedureQuery.setParameter(9, saveTariffEquationDataRequest.getLinetypeparm());
        storedProcedureQuery.setParameter(10, saveTariffEquationDataRequest.getStatusparm());
        storedProcedureQuery.setParameter(11, saveTariffEquationDataRequest.getPrincepal());

        return (String) storedProcedureQuery.getSingleResult() ;

    }

//    End Add or Edit Methods Code




//    Start Retrieve Methods Code

    @ApiOperation("Retrieve Route Traiifa Data By Tarrifa ID ")
    @GetMapping("/{id}/route-tariff")
    public ReturnRouteTariffByTariffIdDataResponse getRouteTariffByTariffData (@ApiParam("Tariffa ID ") @PathVariable(value = "id") long id) {

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

    @ApiOperation("Retrieve list of Tariffa Data")
    @PostMapping("/find-line")
    public List<ReturnLineByTariffDataResponse> getLineByTariffData(@ApiParam("\t") @RequestBody ReturnLineByTariffDataRequest returnLineByTariffDataRequest){

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

    @ApiOperation("Retrieve Tariff Equation ")
    @PostMapping("/find/equation")
    public List<ReturnTariffEquationDataResponse> getTariffEquation(@ApiParam("\t") @RequestBody ReturnTariffEquationDataRequest returnTariffEquationDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnTariffEquation");
        storedProcedureQuery.setParameter(1, returnTariffEquationDataRequest.getTariffequationidparm());
        storedProcedureQuery.setParameter(2, returnTariffEquationDataRequest.getVehiclecategoryparm());
        storedProcedureQuery.setParameter(3, returnTariffEquationDataRequest.getAdeddvalueparm());
        storedProcedureQuery.setParameter(4, returnTariffEquationDataRequest.getStartdateparm());
        storedProcedureQuery.setParameter(5, returnTariffEquationDataRequest.getEnddateparm());
        storedProcedureQuery.setParameter(6, returnTariffEquationDataRequest.getEquationtextparm());
        storedProcedureQuery.setParameter(7, returnTariffEquationDataRequest.getOperationparm());
        storedProcedureQuery.setParameter(8, returnTariffEquationDataRequest.getLinetypeparm());
        storedProcedureQuery.setParameter(9, returnTariffEquationDataRequest.getRoutecoefficientmultiplicationparm());
        storedProcedureQuery.setParameter(10, returnTariffEquationDataRequest.getStatusparm());


        List<ReturnTariffEquationDataResponse> result = storedProcedureQuery.getResultList() ;

        return result ;

    }

    //    End Retrieve Methods Code


    @ApiOperation("Calculate Tariffa Value")
    @PostMapping("/find-value")
    public CalculateTariffValueDataResponse calculateTariffaValue(@ApiParam("\t") @RequestBody CalculateTariffValueDataRequest calculateTariffValueDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnTariffVaLue");
        storedProcedureQuery.setParameter(1, calculateTariffValueDataRequest.getRouteidparm());
        storedProcedureQuery.setParameter(2, calculateTariffValueDataRequest.getVehiclecategoryparm());

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
    @ApiOperation("Change Tariffa Status")
    @DeleteMapping("/{id}")
    public String deleteTariffByTariffID(@ApiParam("Tarrifa ID ") @PathVariable(value = "id") long id){

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

