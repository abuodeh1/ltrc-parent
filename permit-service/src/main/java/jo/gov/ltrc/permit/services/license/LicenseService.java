package jo.gov.ltrc.permit.services.license;


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
@RequestMapping("/api/license")
public class LicenseService {

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
    @ApiOperation("Add or Edit Operator License ")
    @PostMapping
    public String addOperatorLicense(@ApiParam("\t") @RequestBody jo.gov.ltrc.permit.services.license.SaveOperatorLicenseDataRequest saveOperatorLicenseDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveOperatorLicenseData");
        storedProcedureQuery.setParameter(1, saveOperatorLicenseDataRequest.getOperatorlicenseidparm());
        storedProcedureQuery.setParameter(2, saveOperatorLicenseDataRequest.getIssuedateparm());
        storedProcedureQuery.setParameter(3, saveOperatorLicenseDataRequest.getOperatoridparm());
        storedProcedureQuery.setParameter(4, saveOperatorLicenseDataRequest.getLicensestartdateparm());
        storedProcedureQuery.setParameter(5, saveOperatorLicenseDataRequest.getLicenseenddateparm());
        storedProcedureQuery.setParameter(6, saveOperatorLicenseDataRequest.getLiecencsestatusparm());
        storedProcedureQuery.setParameter(7, saveOperatorLicenseDataRequest.getPrintingdateparm());
        storedProcedureQuery.setParameter(8, saveOperatorLicenseDataRequest.getCounterparm());
        storedProcedureQuery.setParameter(9, saveOperatorLicenseDataRequest.getPrincepel());

        return (String) storedProcedureQuery.getSingleResult() ;
    }



//    End Add or Edit Methods Code


//    Start Retrieve Methods Code

    @ApiOperation("Retrieve Operator License Information ")
    @PostMapping("/find")
    public List<jo.gov.ltrc.permit.services.license.ReturnOperatorLicenseInformationResponse> getOperatorLicenseInformation(@ApiParam("\t") @RequestBody jo.gov.ltrc.permit.services.license.ReturnOperatorLicenseInformationRequest returnOperatorLicenseInformationRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnOperatorLicenseInformation");
        storedProcedureQuery.setParameter(1, returnOperatorLicenseInformationRequest.getMinoperatorlicenseidparm());
        storedProcedureQuery.setParameter(2, returnOperatorLicenseInformationRequest.getMaxoperatorlicenseidparm());
        storedProcedureQuery.setParameter(3, returnOperatorLicenseInformationRequest.getMinissuedateparm());
        storedProcedureQuery.setParameter(4, returnOperatorLicenseInformationRequest.getMaxissuedateparm());
        storedProcedureQuery.setParameter(5, returnOperatorLicenseInformationRequest.getMinoperatoridparm());
        storedProcedureQuery.setParameter(6, returnOperatorLicenseInformationRequest.getMaxoperatoridparm());
        storedProcedureQuery.setParameter(7, returnOperatorLicenseInformationRequest.getMinlicensestartdateparm());
        storedProcedureQuery.setParameter(8, returnOperatorLicenseInformationRequest.getMaxlicensestartdateparm());
        storedProcedureQuery.setParameter(9, returnOperatorLicenseInformationRequest.getMinlicenseenddateparm());
        storedProcedureQuery.setParameter(10, returnOperatorLicenseInformationRequest.getMaxlicenseenddateparm());
        storedProcedureQuery.setParameter(11, returnOperatorLicenseInformationRequest.getMinprintingdateparm());
        storedProcedureQuery.setParameter(12, returnOperatorLicenseInformationRequest.getMaxprintingdateparm());
        storedProcedureQuery.setParameter(13, returnOperatorLicenseInformationRequest.getMincounterparm());
        storedProcedureQuery.setParameter(14, returnOperatorLicenseInformationRequest.getMaxcounterparm());
        storedProcedureQuery.setParameter(15, returnOperatorLicenseInformationRequest.getOperatornameparm());
        storedProcedureQuery.setParameter(16, returnOperatorLicenseInformationRequest.getOperatorcategoryparm());
        storedProcedureQuery.setParameter(17, returnOperatorLicenseInformationRequest.getLiecencsestatusparm());
        storedProcedureQuery.setParameter(18, returnOperatorLicenseInformationRequest.getPagesize());
        storedProcedureQuery.setParameter(19, returnOperatorLicenseInformationRequest.getPageindex());
        storedProcedureQuery.setParameter(20, returnOperatorLicenseInformationRequest.getSorttype());
        storedProcedureQuery.setParameter(21 , returnOperatorLicenseInformationRequest.getSortby());


        List<jo.gov.ltrc.permit.services.license.ReturnOperatorLicenseInformationResponse> result = storedProcedureQuery.getResultList();

        return result ;
    }


//    Start Retrieve Methods Code
}
