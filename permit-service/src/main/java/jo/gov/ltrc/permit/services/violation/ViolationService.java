package jo.gov.ltrc.permit.services.violation;

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
@RequestMapping("/api/violation")
@Log4j2
public class ViolationService {

    @PersistenceContext
    private EntityManager entityManager;

//    Start Add or Edit Methods Code


    @ApiResponses(value = {

            @ApiResponse(code = 200, message =
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
    @ApiOperation("Add or Edit Violation Data ")
    @PostMapping
    public String addViolation(@ApiParam("\t") @RequestBody SaveViolationDataRequest saveViolationDataRequest, HttpServletRequest request){

        log.debug(" SaveViolationDataRequest : " + saveViolationDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        saveViolationDataRequest.setIpaddressparm(request.getRemoteAddr());

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveViolationData", saveViolationDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }


        return (String) storedProcedureQuery.getSingleResult() ;
    }

//    End Add or Edit Methods Code




//    Start Retrieve Methods Code

    @ApiOperation("Retrieve Violation ")
    @PostMapping("/find")
    public List<ReturnViolationResponse> getViolation(@ApiParam("\t") @RequestBody ReturnViolationDataRequest returnViolationDataRequest){

        log.debug(" ReturnViolationDataRequest : " + returnViolationDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnViolation", returnViolationDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }


        List<ReturnViolationResponse> result = storedProcedureQuery.getResultList() ;

        return result ;

    }

    @ApiOperation("Retrieve Violation Type ")
    @PostMapping("/find/type")
    public List<ReturnViolationTypeResponse> getViolationType(@ApiParam("\t") @RequestBody ReturnViolationTypeDataRequest returnViolationTypeDataRequest){

        log.debug(" ReturnViolationTypeDataRequest : " + returnViolationTypeDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnViolationType", returnViolationTypeDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        List<ReturnViolationTypeResponse> result = storedProcedureQuery.getResultList() ;

        return result ;
    }

    @ApiOperation("Retrieve Violation Subject ")
    @PostMapping("/find/subject")
    public List<ReturnViolationSubjectResponse> getViolationSubject(@ApiParam("\t") @RequestBody ReturnViolationSubjectDataRequest returnViolationSubjectDataRequest){

        log.debug(" ReturnViolationSubjectDataRequest : " + returnViolationSubjectDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnViolationSubject", returnViolationSubjectDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        List<ReturnViolationSubjectResponse> result = storedProcedureQuery.getResultList() ;

        return  result ;
    }

    @ApiOperation("Retrieve Violation Penalty ")
    @PostMapping("/find/penalty")
    public List<ReturnViolationPenaltyResponse> getViolationPenalty (@ApiParam("\t") @RequestBody ReturnViolationPenaltyDataRequest returnViolationPenaltyDataRequest){

        log.debug(" ReturnViolationPenaltyDataRequest : " + returnViolationPenaltyDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnViolationPenalty", returnViolationPenaltyDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }


        List<ReturnViolationPenaltyResponse> result = storedProcedureQuery.getResultList() ;

        return  result ;
    }



//    End Retrieve Methods Code
}
