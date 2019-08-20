package jo.gov.ltrc.workflow.services;


import io.swagger.annotations.*;
import jo.gov.ltrc.helper.DatabaseHelper;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(value = "/api/workflow")
@Log4j2
public class WorkflowService {

    @PersistenceContext
    private EntityManager entityManager;




//    Start  Add or Edit Method Code

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
    @ApiOperation("")
    @PostMapping("/process-5.2.3")
    public String process_5_2_3(@ApiParam("\t") @RequestBody SaveApplicationTrnsfrOnrShpStrctrzDataRequest saveApplicationTrnsfrOnrShpStrctrzDataRequest , HttpServletRequest request){

        log.debug("SaveApplicationTrnsfrOnrShpStrctrzDataRequest : " + saveApplicationTrnsfrOnrShpStrctrzDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null;

        saveApplicationTrnsfrOnrShpStrctrzDataRequest.setIpaddressparm(request.getRemoteAddr());

            try {

                storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveApplicationTrnsfrOnrShpStrctrzData", saveApplicationTrnsfrOnrShpStrctrzDataRequest);

            } catch (Exception e) {

                log.error(e.getMessage());
            }

        return (String) storedProcedureQuery.getSingleResult() ;

    }

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
    @ApiOperation("")
    @PostMapping("/process-5.3")
    public String process_5_3(@ApiParam("\t") @RequestBody SaveApplicationBusRentingOfficeLicenseDataRequest saveApplicationBusRentingOfficeLicenseDataRequest , HttpServletRequest request){

        saveApplicationBusRentingOfficeLicenseDataRequest.setIpaddress(request.getRemoteAddr());

        return addApplicationBusRentingOfficeLicenseData(saveApplicationBusRentingOfficeLicenseDataRequest);

    }

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
    @ApiOperation("")
    @PostMapping("/process-5.7.6")
    public String process_5_7_6(@ApiParam("\t") @RequestBody SaveApplicationBusRentingOfficeLicenseDataRequest saveApplicationBusRentingOfficeLicenseDataRequest , HttpServletRequest request){

        saveApplicationBusRentingOfficeLicenseDataRequest.setIpaddress(request.getRemoteAddr());

        return addApplicationBusRentingOfficeLicenseData(saveApplicationBusRentingOfficeLicenseDataRequest);

    }

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
    @ApiOperation("")
    @PostMapping("/process-5.2.5")
    public String process_5_2_5(@ApiParam("\t") @RequestBody SaveApplicationBusRentingCompanyeLicenseDataRequest saveApplicationBusRentingCompanyeLicenseDataRequest, HttpServletRequest request){

        saveApplicationBusRentingCompanyeLicenseDataRequest.setIpaddress(request.getRemoteAddr());

        return addApplicationBusRentingCompanyeLicenseData(saveApplicationBusRentingCompanyeLicenseDataRequest);
    }

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
    @ApiOperation("")
    @PostMapping("/process-5.7.1")
    public String process_5_7_1(@ApiParam("\t") @RequestBody SaveApplicationBusRentingCompanyeLicenseDataRequest saveApplicationBusRentingCompanyeLicenseDataRequest, HttpServletRequest request){

        saveApplicationBusRentingCompanyeLicenseDataRequest.setIpaddress(request.getRemoteAddr());

        return addApplicationBusRentingCompanyeLicenseData(saveApplicationBusRentingCompanyeLicenseDataRequest);
    }

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
    @ApiOperation("")
    @PostMapping("/process-5.2.4")
    public String process_5_2_4(@ApiParam("\t") @RequestBody SaveApplicationCncltnRplcmntDataRequest saveApplicationCncltnRplcmntDataRequest, HttpServletRequest request){

        log.debug("SaveApplicationCncltnRplcmntDataRequest : " + saveApplicationCncltnRplcmntDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null;
        saveApplicationCncltnRplcmntDataRequest.setIpaddressparm(request.getRemoteAddr());

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveApplicationCncltnRplcmntData", saveApplicationCncltnRplcmntDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());
        }

        return (String) storedProcedureQuery.getSingleResult()  ;
    }

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
    @ApiOperation("")
    @PostMapping("/process-5.4.1")
    public String process_5_4_1(@ApiParam("\t") @RequestBody SaveApplicationOfficeCompanyOwnershipTransferDataRequest saveApplicationOfficeCompanyOwnershipTransferDataRequest, HttpServletRequest request){

        log.debug("SaveApplicationOfficeCompanyOwnershipTransferDataRequest : " + saveApplicationOfficeCompanyOwnershipTransferDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null;
        saveApplicationOfficeCompanyOwnershipTransferDataRequest.setIpaddressparm(request.getRemoteAddr());

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveApplicationOfficeCompanyOwnershipTransferData", saveApplicationOfficeCompanyOwnershipTransferDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());
        }

        return (String) storedProcedureQuery.getSingleResult() ;
    }

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
    @ApiOperation("")
    @PostMapping("/process-5.2.2")
    public String process_5_2_2(@ApiParam("\t") @RequestBody SaveApplicationParkingLotSiteTransferDataRequest saveApplicationParkingLotSiteTransferDataRequest , HttpServletRequest request){

        log.debug("SaveApplicationParkingLotSiteTransferDataRequest : " + saveApplicationParkingLotSiteTransferDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null;
        saveApplicationParkingLotSiteTransferDataRequest.setIpaddressparm(request.getRemoteAddr());

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveApplicationParkingLotSiteTransferData", saveApplicationParkingLotSiteTransferDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());
        }

        return (String) storedProcedureQuery.getSingleResult() ;

    }

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
    @ApiOperation("")
    @PostMapping("/process-5.6.1")
    public String process_5_6_1(@ApiParam("\t") @RequestBody SaveApplicationVehiclesOwnershipTransferDataRequest saveApplicationVehiclesOwnershipTransferDataRequest, HttpServletRequest request){

        log.debug("SaveApplicationVehiclesOwnershipTransferDataRequest : " + saveApplicationVehiclesOwnershipTransferDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null;
        saveApplicationVehiclesOwnershipTransferDataRequest.setIpaddressparm(request.getRemoteAddr());

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveApplicationVehiclesOwnershipTransferData", saveApplicationVehiclesOwnershipTransferDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());
        }

        return (String) storedProcedureQuery.getSingleResult() ;




    }

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
    @ApiOperation("")
    @PostMapping("/process-5.9.1")
    public String process_5_9_1(@ApiParam("\t") @RequestBody SaveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest, HttpServletRequest request){

        saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest.setIpaddressparm(request.getRemoteAddr());

       return addApplicationRenewPublicTransportPermitsOrTemporaryPermitsDat(saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest);
    }

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
    @ApiOperation("")
    @PostMapping("/process-5.9.2")
    public String process_5_9_2(@ApiParam("\t") @RequestBody SaveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest, HttpServletRequest request){

        saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest.setIpaddressparm(request.getRemoteAddr());

        return addApplicationRenewPublicTransportPermitsOrTemporaryPermitsDat(saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest);
    }

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
    @ApiOperation("")
    @PostMapping("/process-5.9.3")
    public String process_5_9_3(@ApiParam("\t") @RequestBody SaveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest, HttpServletRequest request){

        saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest.setIpaddressparm(request.getRemoteAddr());

        return addApplicationRenewPublicTransportPermitsOrTemporaryPermitsDat(saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest);
    }

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
    @ApiOperation("")
    @PostMapping("/process-5.9.4")
    public String process_5_9_4(@ApiParam("\t") @RequestBody SaveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest, HttpServletRequest request){

        saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest.setIpaddressparm(request.getRemoteAddr());

        return addApplicationRenewPublicTransportPermitsOrTemporaryPermitsDat(saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest);
    }

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
    @ApiOperation("")
    @PostMapping("/process-5.1.3")
    public String process_5_1_3(@ApiParam("\t") @RequestBody SaveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest ,HttpServletRequest request){

        saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest.setIpaddressparm(request.getRemoteAddr());

        return  addApplicationLicensingServiceofLuxuryCarAndInternationalCarri(saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest);
    }

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
    @ApiOperation("")
    @PostMapping("/process-5.4.3")
    public String process_5_4_3(@ApiParam("\t") @RequestBody SaveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest ,HttpServletRequest request){

        saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest.setIpaddressparm(request.getRemoteAddr());

        return  addApplicationLicensingServiceofLuxuryCarAndInternationalCarri(saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest);
    }

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
    @ApiOperation("")
    @PostMapping("/process-5.1.4")
    public String process_5_1_4(@ApiParam("\t") @RequestBody SaveApplicationLicensingOfMergerOfficeDataRequest saveApplicationLicensingOfMergerOfficeDataRequest ,HttpServletRequest request){

        log.debug("SaveApplicationLicensingOfMergerOfficeDataRequest : " + saveApplicationLicensingOfMergerOfficeDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null;
        saveApplicationLicensingOfMergerOfficeDataRequest.setIpaddressparm(request.getRemoteAddr());

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveApplicationLicensingOfMergerOfficeData", saveApplicationLicensingOfMergerOfficeDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());
        }

        return (String) storedProcedureQuery.getSingleResult() ;

    }

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
    @ApiOperation("")
    @PostMapping("/process-5.7.2")
    public String process_5_7_2(@ApiParam("\t") @RequestBody SaveApplicationOfficeCcompanylicenseRenewDataRequest saveApplicationOfficeCcompanylicenseRenewDataRequest, HttpServletRequest requset){

        saveApplicationOfficeCcompanylicenseRenewDataRequest.setIpaddressparm(requset.getRemoteAddr());

        return  addApplicationOfficeCcompanylicenseRenewData(saveApplicationOfficeCcompanylicenseRenewDataRequest);
    }

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
    @ApiOperation("")
    @PostMapping("/process-5.7.3")
    public String process_5_7_3(@ApiParam("\t") @RequestBody SaveApplicationOfficeCcompanylicenseRenewDataRequest saveApplicationOfficeCcompanylicenseRenewDataRequest, HttpServletRequest requset){

        saveApplicationOfficeCcompanylicenseRenewDataRequest.setIpaddressparm(requset.getRemoteAddr());

        return  addApplicationOfficeCcompanylicenseRenewData(saveApplicationOfficeCcompanylicenseRenewDataRequest);
    }

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
    @ApiOperation("")
    @PostMapping("/process-5.7.4")
    public String process_5_7_4(@ApiParam("\t") @RequestBody SaveApplicationOfficeCcompanylicenseRenewDataRequest saveApplicationOfficeCcompanylicenseRenewDataRequest, HttpServletRequest requset){

        saveApplicationOfficeCcompanylicenseRenewDataRequest.setIpaddressparm(requset.getRemoteAddr());

        return  addApplicationOfficeCcompanylicenseRenewData(saveApplicationOfficeCcompanylicenseRenewDataRequest);
    }

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
    @ApiOperation("")
    @PostMapping("/process-5.7.5")
    public String process_5_7_5(@ApiParam("\t") @RequestBody SaveApplicationOfficeCcompanylicenseRenewDataRequest saveApplicationOfficeCcompanylicenseRenewDataRequest, HttpServletRequest requset){

        saveApplicationOfficeCcompanylicenseRenewDataRequest.setIpaddressparm(requset.getRemoteAddr());

        return  addApplicationOfficeCcompanylicenseRenewData(saveApplicationOfficeCcompanylicenseRenewDataRequest);
    }

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
    @ApiOperation("")
    @PostMapping("/process-5.1.5")
    public String process_5_1_5(@ApiParam("\t") @RequestBody SaveApplicationSmartPermitsDataRequest saveApplicationSmartPermitsDataRequest, HttpServletRequest request){

        log.debug("SaveApplicationSmartPermitsDataRequest : " + saveApplicationSmartPermitsDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null;
        saveApplicationSmartPermitsDataRequest.setIpaddressparm(request.getRemoteAddr());

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveApplicationSmartPermitsData", saveApplicationSmartPermitsDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());
        }

        return (String) storedProcedureQuery.getSingleResult() ;
    }

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
    @ApiOperation("")
    @PostMapping("/process-5.8.1")
    public String process_5_8_1(@ApiParam("\t") @RequestBody SaveApplicationTariffFareDataRequest saveApplicationTariffFareDataRequest, HttpServletRequest request){

        log.debug("SaveApplicationTariffFareDataRequest : " + saveApplicationTariffFareDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null;
        saveApplicationTariffFareDataRequest.setIpaddressparm(request.getRemoteAddr());

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveApplicationTariffFareData", saveApplicationTariffFareDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());
        }

        return (String) storedProcedureQuery.getSingleResult() ;

    }

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
    @ApiOperation("")
    @PostMapping("/process-5.8.2")
    public String process_5_8_2(@ApiParam("\t") @RequestBody SaveApplicationRouteAmedmentDataRequest saveApplicationRouteAmedmentDataRequest, HttpServletRequest request){

        log.debug("SaveApplicationRouteAmedmentDataRequest : " + saveApplicationRouteAmedmentDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null;
        saveApplicationRouteAmedmentDataRequest.setIpaddressparm(request.getRemoteAddr());

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveApplicationRouteAmedmentData", saveApplicationRouteAmedmentDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());
        }

        return (String) storedProcedureQuery.getSingleResult() ;

    }

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
    @ApiOperation("")
    @PostMapping("/process-5.8.3")
    public String process_5_8_3(@ApiParam("\t") @RequestBody SaveApplicationExchangeLinesDataRequest saveApplicationExchangeLinesDataRequest, HttpServletRequest request){

        log.debug("SaveApplicationExchangeLinesDataRequest : " + saveApplicationExchangeLinesDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null;
        saveApplicationExchangeLinesDataRequest.setIpaddressparm(request.getRemoteAddr());

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveApplicationExchangeLinesData", saveApplicationExchangeLinesDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());
        }

        return (String) storedProcedureQuery.getSingleResult() ;

    }

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
    @ApiOperation("")
    @PostMapping("/process-5.5.3")
    public String process_5_5_3(@ApiParam("\t") @RequestBody SaveApplicationPrivateBusRegistrationDataRequest saveApplicationPrivateBusRegistrationDataRequest , HttpServletRequest request){

        log.debug("SaveApplicationPrivateBusRegistrationDataRequest : " + saveApplicationPrivateBusRegistrationDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null;
        saveApplicationPrivateBusRegistrationDataRequest.setIpaddressparm(request.getRemoteAddr());

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveApplicationPrivateBusRegistrationData", saveApplicationPrivateBusRegistrationDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());
        }

        return (String) storedProcedureQuery.getSingleResult() ;
    }


//    End Add or Edit Method Code


//    Start Shared Methods  Code

    private String addApplicationRenewPublicTransportPermitsOrTemporaryPermitsDat(SaveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest){

        log.debug("SaveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest : " + saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDat", saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());
        }

        return (String) storedProcedureQuery.getSingleResult() ;

    }

    private String addApplicationBusRentingCompanyeLicenseData(SaveApplicationBusRentingCompanyeLicenseDataRequest saveApplicationBusRentingCompanyeLicenseDataRequest){

        log.debug("SaveApplicationBusRentingCompanyeLicenseDataRequest : " + saveApplicationBusRentingCompanyeLicenseDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveApplicationBusRentingCompanyeLicenseData", saveApplicationBusRentingCompanyeLicenseDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());
        }

        return (String) storedProcedureQuery.getSingleResult() ;


    }

    private String addApplicationBusRentingOfficeLicenseData(SaveApplicationBusRentingOfficeLicenseDataRequest saveApplicationBusRentingOfficeLicenseDataRequest){

        log.debug("SaveApplicationBusRentingOfficeLicenseDataRequest : " + saveApplicationBusRentingOfficeLicenseDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveApplicationBusRentingOfficeLicenseData", saveApplicationBusRentingOfficeLicenseDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());
        }


        return (String) storedProcedureQuery.getSingleResult() ;


    }

    private String addApplicationLicensingServiceofLuxuryCarAndInternationalCarri(SaveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest){

        log.debug("SaveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest : " + saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveApplicationLicensingServiceofLuxuryCarAndInternationalCarri", saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());
        }

        return (String) storedProcedureQuery.getSingleResult() ;

    }

    private String addApplicationOfficeCcompanylicenseRenewData(SaveApplicationOfficeCcompanylicenseRenewDataRequest saveApplicationOfficeCcompanylicenseRenewDataRequest){

        log.debug("SaveApplicationOfficeCcompanylicenseRenewDataRequest : " + saveApplicationOfficeCcompanylicenseRenewDataRequest.toString());

        StoredProcedureQuery storedProcedureQuery = null;

        try {

            storedProcedureQuery = DatabaseHelper.buildStoredProcedureQueryWithRequestParams(entityManager, "SaveApplicationOfficeCcompanylicenseRenewData", saveApplicationOfficeCcompanylicenseRenewDataRequest);

        } catch (Exception e) {

            log.error(e.getMessage());
        }

        return (String) storedProcedureQuery.getSingleResult() ;

    }

//    End Shared Methods  Code
}
