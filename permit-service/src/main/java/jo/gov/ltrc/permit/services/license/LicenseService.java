package jo.gov.ltrc.permit.services.license;


import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import jo.gov.ltrc.helper.DatabaseHelper;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.Parameter;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;

@ApiResponses(value = {

        @ApiResponse(code = 500, message = "Error extracting results\n" +
                "--------- \n" +
                "Exception thrown if the response\n" +
                "does not match the mapping or data type\n" +
                "--------------------------------------------------------------------------------------------------\n" +
                "  \n" +
                "Database function doesn’t exist \n" +
                "------ \n" +
                "Exception thrown if the the data base function does not exist \n" +
                "or if the data base function does not match between request and response classes.\n ")
})


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/license")
@Log4j2
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
                            "N: Indicator for new record inserted successfully \n" +
                            "-----------------------------------------------------\n" +
                            "  \n" +
                            "Number$U\n" +
                            "----------\n" +
                            "Number :  Effected rows  \n" +
                            "$ : Special character to split concatenated strings \n" +
                            "U: Indicator for update successfully \n" +
                            "-----------------------------------------------------\n" +
                            "  \n" +
                            "E$Number$TEXT\n" +
                            "----------\n" +
                            "E : Indicator for Error\n" +
                            "$ : Special character to split concatenated strings\n" +
                            "Number : DataBase System Error Number\n" +
                            "TEXT : DataBase system Error Message\n"
            )
    })
    @ApiOperation("Add or Edit Operator License ")
    @PostMapping
    public String addOperatorLicense(@ApiParam("\t") @RequestBody SaveOperatorLicenseDataRequest saveOperatorLicenseDataRequest) {

        log.debug("SaveOperatorLicenseDataRequest : " + saveOperatorLicenseDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveOperatorLicenseData", saveOperatorLicenseDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());
        }

        return (String) storedProcedureQuery.getSingleResult();
    }


//    End Add or Edit Methods Code


//    Start Retrieve Methods Code

    @ApiOperation("Retrieve Operator License Information ")
    @PostMapping("/find")
    public List<ReturnOperatorLicenseInformationResponse> getOperatorLicenseInformation(@ApiParam("\t") @RequestBody ReturnOperatorLicenseInformationRequest returnOperatorLicenseInformationRequest) {

        log.debug("ReturnOperatorLicenseInformationRequest : " + returnOperatorLicenseInformationRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnOperatorLicenseInformation", returnOperatorLicenseInformationRequest);

        } catch (Exception e) {

            log.error(e.getMessage());
        }

        List<ReturnOperatorLicenseInformationResponse> result = storedProcedureQuery.getResultList();

        return result;
    }

    private Object callGetter(Object obj, String fieldName) {
        PropertyDescriptor pd;
        try {
            pd = new PropertyDescriptor(fieldName, obj.getClass());
            return pd.getReadMethod().invoke(obj);
        } catch (IntrospectionException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }


//    Start Retrieve Methods Code
}
