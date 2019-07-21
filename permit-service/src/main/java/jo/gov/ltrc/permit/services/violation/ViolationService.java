package com.etech.ltrc.permits.violation;

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
@RequestMapping("/api/violation")
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
    public String addViolation(@ApiParam("\t") @RequestBody SaveViolationDataRequest saveViolationDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveViolationData");
        storedProcedureQuery.setParameter(1, saveViolationDataRequest.getViolationidparm());
        storedProcedureQuery.setParameter(2, saveViolationDataRequest.getViolationdateparm());
        storedProcedureQuery.setParameter(3, saveViolationDataRequest.getViolationbyparm());
        storedProcedureQuery.setParameter(4, saveViolationDataRequest.getViolationtypeparm());
        storedProcedureQuery.setParameter(5, saveViolationDataRequest.getViolationsubjectparm());
        storedProcedureQuery.setParameter(6, saveViolationDataRequest.getViolationpenaltyparm());
        storedProcedureQuery.setParameter(7, saveViolationDataRequest.getStatusparm());
        storedProcedureQuery.setParameter(8, saveViolationDataRequest.getVehicleparm());
        storedProcedureQuery.setParameter(9, saveViolationDataRequest.getDriverparm());
        storedProcedureQuery.setParameter(10, saveViolationDataRequest.getLineidparm());
        storedProcedureQuery.setParameter(11, saveViolationDataRequest.getViolationreferenceparm());
        storedProcedureQuery.setParameter(12, saveViolationDataRequest.getViolationreferencedateparm());
        storedProcedureQuery.setParameter(13, saveViolationDataRequest.getCancellationofarrestorderreferenceparm());
        storedProcedureQuery.setParameter(14, saveViolationDataRequest.getCancellationofarrestorderdateparm());
        storedProcedureQuery.setParameter(15, saveViolationDataRequest.getPrincepel());
        storedProcedureQuery.setParameter(16, saveViolationDataRequest.getOperatorparm());


        return (String) storedProcedureQuery.getSingleResult() ;
    }

//    End Add or Edit Methods Code




//    Start Retrieve Methods Code

    @ApiOperation("Retrieve Violation ")
    @PostMapping("/find")
    public List<ReturnViolationResponse> getViolation(@ApiParam("\t") @RequestBody ReturnViolationDataRequest returnViolationDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnViolation");
        storedProcedureQuery.setParameter(1, returnViolationDataRequest.getMinviolationidparm());
        storedProcedureQuery.setParameter(2, returnViolationDataRequest.getMaxviolationidparm());
        storedProcedureQuery.setParameter(3, returnViolationDataRequest.getMinviolationdateparm());
        storedProcedureQuery.setParameter(4, returnViolationDataRequest.getMaxviolationdateparm());
        storedProcedureQuery.setParameter(5, returnViolationDataRequest.getViolationtypeparm());
        storedProcedureQuery.setParameter(6, returnViolationDataRequest.getViolationsubjectparm());
        storedProcedureQuery.setParameter(7, returnViolationDataRequest.getViolationpenaltyparm());
        storedProcedureQuery.setParameter(8, returnViolationDataRequest.getRegistrationnumberparm());
        storedProcedureQuery.setParameter(9, returnViolationDataRequest.getPlatecodeparm());
        storedProcedureQuery.setParameter(10, returnViolationDataRequest.getPlatenumberparm());
        storedProcedureQuery.setParameter(11, returnViolationDataRequest.getDriverparm());
        storedProcedureQuery.setParameter(12, returnViolationDataRequest.getLineidparm());
        storedProcedureQuery.setParameter(13, returnViolationDataRequest.getStatusparm());
        storedProcedureQuery.setParameter(14, returnViolationDataRequest.getVehicleparm());
        storedProcedureQuery.setParameter(15, returnViolationDataRequest.getOperatoridparm());
        storedProcedureQuery.setParameter(16, returnViolationDataRequest.getOperatornameparm());
        storedProcedureQuery.setParameter(17, returnViolationDataRequest.getViolationreferenceparm());
        storedProcedureQuery.setParameter(18, returnViolationDataRequest.getMinviolationreferencedateparm());
        storedProcedureQuery.setParameter(19, returnViolationDataRequest.getMaxviolationreferencedateparm());
        storedProcedureQuery.setParameter(20, returnViolationDataRequest.getCancellationofarrestorderreferenceparm());
        storedProcedureQuery.setParameter(21, returnViolationDataRequest.getMincancellationofarrestorderdateparm());
        storedProcedureQuery.setParameter(22, returnViolationDataRequest.getMaxcancellationofarrestorderdateparm());
        storedProcedureQuery.setParameter(23, returnViolationDataRequest.getPrincepel());
        storedProcedureQuery.setParameter(24, returnViolationDataRequest.getViolationByParm());
        storedProcedureQuery.setParameter(25, returnViolationDataRequest.getPagesize());
        storedProcedureQuery.setParameter(26, returnViolationDataRequest.getPageindex());
        storedProcedureQuery.setParameter(27, returnViolationDataRequest.getSorttype());
        storedProcedureQuery.setParameter(28, returnViolationDataRequest.getSortby());


        List<ReturnViolationResponse> result = storedProcedureQuery.getResultList() ;

        return result ;

    }

    @ApiOperation("Retrieve Violation Type ")
    @PostMapping("/find/type")
    public List<ReturnViolationTypeResponse> getViolationType(@ApiParam("\t") @RequestBody ReturnViolationTypeDataRequest returnViolationTypeDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnViolationType");
        storedProcedureQuery.setParameter(1, returnViolationTypeDataRequest.getViolationtypeidparm());
        storedProcedureQuery.setParameter(2, returnViolationTypeDataRequest.getViolationtypenameparm());

        List<ReturnViolationTypeResponse> result = storedProcedureQuery.getResultList() ;

        return result ;
    }

    @ApiOperation("Retrieve Violation Subject ")
    @PostMapping("/find/subject")
    public List<ReturnViolationSubjectResponse> getViolationSubject(@ApiParam("\t") @RequestBody ReturnViolationSubjectDataRequest returnViolationSubjectDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnViolationSubject");
        storedProcedureQuery.setParameter(1, returnViolationSubjectDataRequest.getViolationsubjectidparm());
        storedProcedureQuery.setParameter(2, returnViolationSubjectDataRequest.getViolationsubjectnameparm());

        List<ReturnViolationSubjectResponse> result = storedProcedureQuery.getResultList() ;

        return  result ;
    }

    @ApiOperation("Retrieve Violation Penalty ")
    @PostMapping("/find/penalty")
    public List<ReturnViolationPenaltyResponse> getViolationPenalty (@ApiParam("\t") @RequestBody ReturnViolationPenaltyDataRequest returnViolationPenaltyDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnViolationPenalty");
        storedProcedureQuery.setParameter(1, returnViolationPenaltyDataRequest.getViolationpenaltyidparm());
        storedProcedureQuery.setParameter(2, returnViolationPenaltyDataRequest.getViolationpenaltynameparm());


        List<ReturnViolationPenaltyResponse> result = storedProcedureQuery.getResultList() ;

        return  result ;
    }



//    End Retrieve Methods Code
}
