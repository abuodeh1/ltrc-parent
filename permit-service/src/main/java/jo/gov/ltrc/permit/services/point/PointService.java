package jo.gov.ltrc.permit.services.point;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import jo.gov.ltrc.helper.DatabaseHelper;
import lombok.extern.log4j.Log4j2;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
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
@RequestMapping(value = "/api/point")
@Transactional( propagation = Propagation.SUPPORTS, readOnly = true )
@Log4j2
public class PointService {

    @PersistenceContext
    private EntityManager entityManager;


//    Start Add or Edit Methods

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
    @ApiOperation("Add or Edit Point")
    @PostMapping
    public String savePoint(@ApiParam("\t") @RequestBody SavePointDataRequest savePointDataRequest, HttpServletRequest request){

        log.debug(" SavePointDataRequest : " + savePointDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        savePointDataRequest.setIpaddressparm(request.getRemoteAddr());

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SavePointData", savePointDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        return (String) storedProcedureQuery.getSingleResult();

    }

//    End  Add or Edit Methods


//    Start Retrieve Methods

    @ApiOperation("Retrieve Point Find ")
    @PostMapping("/find-point")
    public List<ReturnPointResponse> findPoint(@ApiParam("\t") @RequestBody ReturnPointRequest returnPointRequest){

        List<ReturnPointResponse> result = findPointData(returnPointRequest);

        return result;
    }

    @ApiOperation("Retrieve Point Characteristics")
    @GetMapping("/{id}/characteristics")
    public Long getPointChar(@ApiParam("Point ID ") @PathVariable(value = "id") Long id){

       ReturnPointResponse returnPointResponse = getPointID(id);

       return (returnPointResponse != null ? returnPointResponse.getPointcharacteristic() : 0L );

    }

    @ApiOperation("Retrieve Parking Type")
    @GetMapping("/{id}/parking-type")
    public Long getParkingType(@ApiParam("Point ID") @PathVariable(value = "id") Long id){

        ReturnPointResponse returnPointResponse = getPointID(id);

        return (returnPointResponse != null ? returnPointResponse.getPointparkingtype() : 0L );

    }

    @ApiOperation("Retrieve Point Status")
    @GetMapping("/{id}/status")
    public Integer getPointStatus(@ApiParam("Point ID") @PathVariable(value = "id") Long id){

        ReturnPointResponse returnPointResponse = getPointID(id);

        return (returnPointResponse != null ? returnPointResponse.getPointstatus() : 0 );

    }

    @ApiOperation("Retrieve Point By ID")
    @GetMapping("/{id}")
    public  ReturnPointByIDResponse getPointByID(@ApiParam("Point ID") @PathVariable(value = "id") Long id){

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

//    End Retrieve Methods

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
    @ApiOperation("Change Point Status")
    @DeleteMapping("/{id}/principal/{principalid}")
    public String deletePoint(@ApiParam("Point ID") @PathVariable(value = "id") Long id,@ApiParam("Principal ID") @PathVariable(value = "principalid") Long principalid){

        ChangePointStatusData changePointStatusData = new ChangePointStatusData();
        changePointStatusData.setPointidparm(id);
        changePointStatusData.setPointstatusparm(3);
        changePointStatusData.setPrencipal(principalid);

        log.debug(" ChangePointStatusData : " + changePointStatusData.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ChangePointStatus", changePointStatusData);

        } catch (Exception e) {

            log.error(e.getMessage());

        }


        return (String)storedProcedureQuery.getSingleResult();
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

        log.debug(" ReturnPointRequest : " + returnPointRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null ;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "ReturnPoint", returnPointRequest);

        } catch (Exception e) {

            log.error(e.getMessage());

        }

        List<ReturnPointResponse> result = storedProcedureQuery.getResultList();

        return result;

    }

}
