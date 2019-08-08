package jo.gov.ltrc.workflow.services;


import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(value = "/api/workflow")
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

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveApplicationTrnsfrOnrShpStrctrzData");
        storedProcedureQuery.setParameter(1, saveApplicationTrnsfrOnrShpStrctrzDataRequest.getApplicationtrnsfronrshpstrctrzidparm());
        storedProcedureQuery.setParameter(2, saveApplicationTrnsfrOnrShpStrctrzDataRequest.get_1stoperatoridparm());
        storedProcedureQuery.setParameter(3, saveApplicationTrnsfrOnrShpStrctrzDataRequest.get_1stoperatornameparm());
        storedProcedureQuery.setParameter(4, saveApplicationTrnsfrOnrShpStrctrzDataRequest.getPhonenumberparm());
        storedProcedureQuery.setParameter(5, saveApplicationTrnsfrOnrShpStrctrzDataRequest.getEmailparm());
        storedProcedureQuery.setParameter(6, saveApplicationTrnsfrOnrShpStrctrzDataRequest.get_2ndoperatoridparm());
        storedProcedureQuery.setParameter(7, saveApplicationTrnsfrOnrShpStrctrzDataRequest.get_2ndoperatornameparm());
        storedProcedureQuery.setParameter(8, saveApplicationTrnsfrOnrShpStrctrzDataRequest.getVehicleidparm());
        storedProcedureQuery.setParameter(9, saveApplicationTrnsfrOnrShpStrctrzDataRequest.getNewownernationalidparm());
        storedProcedureQuery.setParameter(10, saveApplicationTrnsfrOnrShpStrctrzDataRequest.getNewownernameparm());
        storedProcedureQuery.setParameter(11, saveApplicationTrnsfrOnrShpStrctrzDataRequest.getHeadofservicedpartmentexplanationparm());
        storedProcedureQuery.setParameter(12, saveApplicationTrnsfrOnrShpStrctrzDataRequest.getHeadofservicedpartmentdecisionparm());
        storedProcedureQuery.setParameter(13, saveApplicationTrnsfrOnrShpStrctrzDataRequest.getDirectordirectoratepassengertransportexplanationparm());
        storedProcedureQuery.setParameter(14, saveApplicationTrnsfrOnrShpStrctrzDataRequest.getDirectordirectoratepassengertransportdecisionparm());
        storedProcedureQuery.setParameter(15, saveApplicationTrnsfrOnrShpStrctrzDataRequest.getPrincepel());
        storedProcedureQuery.setParameter(16, saveApplicationTrnsfrOnrShpStrctrzDataRequest.getStatusparm());
        storedProcedureQuery.setParameter(17, request.getRemoteAddr());
        storedProcedureQuery.setParameter(18, saveApplicationTrnsfrOnrShpStrctrzDataRequest.getServicedpartmentparm());


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

        return addApplicationBusRentingOfficeLicenseData(saveApplicationBusRentingOfficeLicenseDataRequest, request);

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

        return addApplicationBusRentingOfficeLicenseData(saveApplicationBusRentingOfficeLicenseDataRequest, request);

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

        return addApplicationBusRentingCompanyeLicenseData(saveApplicationBusRentingCompanyeLicenseDataRequest, request);
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

        return addApplicationBusRentingCompanyeLicenseData(saveApplicationBusRentingCompanyeLicenseDataRequest, request);
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

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveApplicationCncltnRplcmntData");
        storedProcedureQuery.setParameter(1, saveApplicationCncltnRplcmntDataRequest.getApplicationcncltnrplcmntidparm());
        storedProcedureQuery.setParameter(2, saveApplicationCncltnRplcmntDataRequest.getOperatoridparm());
        storedProcedureQuery.setParameter(3, saveApplicationCncltnRplcmntDataRequest.getOperatornameparm());
        storedProcedureQuery.setParameter(4, saveApplicationCncltnRplcmntDataRequest.getOperatornationalidparm());
        storedProcedureQuery.setParameter(5, saveApplicationCncltnRplcmntDataRequest.getPhonenumberparm());
        storedProcedureQuery.setParameter(6, saveApplicationCncltnRplcmntDataRequest.getEmailparm());
        storedProcedureQuery.setParameter(7, saveApplicationCncltnRplcmntDataRequest.getVehicleidparm());
        storedProcedureQuery.setParameter(8, saveApplicationCncltnRplcmntDataRequest.getCommercialrecordparm());
        storedProcedureQuery.setParameter(9, saveApplicationCncltnRplcmntDataRequest.getDvldexplanationparm());
        storedProcedureQuery.setParameter(10, saveApplicationCncltnRplcmntDataRequest.getHeadofservicedepartmentexplanationparm());
        storedProcedureQuery.setParameter(11, saveApplicationCncltnRplcmntDataRequest.getHeadofservicedepartmentdecisionparm());
        storedProcedureQuery.setParameter(12, saveApplicationCncltnRplcmntDataRequest.getDirectordirectoratepassengertransportexplanationparm());
        storedProcedureQuery.setParameter(13, saveApplicationCncltnRplcmntDataRequest.getDirectordirectoratepassengertransportdecisionparm());
        storedProcedureQuery.setParameter(14, saveApplicationCncltnRplcmntDataRequest.getPrincepel());
        storedProcedureQuery.setParameter(15, saveApplicationCncltnRplcmntDataRequest.getStatusparm());
        storedProcedureQuery.setParameter(16, request.getRemoteAddr());


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

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveApplicationOfficeCompanyOwnershipTransferData");
        storedProcedureQuery.setParameter(1, saveApplicationOfficeCompanyOwnershipTransferDataRequest.getApplicationofficecompanyownershiptransferidparm());
        storedProcedureQuery.setParameter(2, saveApplicationOfficeCompanyOwnershipTransferDataRequest.get_1stoperatoridparm());
        storedProcedureQuery.setParameter(3, saveApplicationOfficeCompanyOwnershipTransferDataRequest.get_1stoperatornameparm());
        storedProcedureQuery.setParameter(4, saveApplicationOfficeCompanyOwnershipTransferDataRequest.getPhonenumberparm());
        storedProcedureQuery.setParameter(5, saveApplicationOfficeCompanyOwnershipTransferDataRequest.getEmailparm());
        storedProcedureQuery.setParameter(6, saveApplicationOfficeCompanyOwnershipTransferDataRequest.get_2ndoperatoridparm());
        storedProcedureQuery.setParameter(7, saveApplicationOfficeCompanyOwnershipTransferDataRequest.get_2ndoperatornameparm());
        storedProcedureQuery.setParameter(8, saveApplicationOfficeCompanyOwnershipTransferDataRequest.getNewownernationalidparm());
        storedProcedureQuery.setParameter(9, saveApplicationOfficeCompanyOwnershipTransferDataRequest.getNewownernameparm());
        storedProcedureQuery.setParameter(10, saveApplicationOfficeCompanyOwnershipTransferDataRequest.getCommercialrecordparm());
        storedProcedureQuery.setParameter(11, saveApplicationOfficeCompanyOwnershipTransferDataRequest.getFinancialcommitmentparm());
        storedProcedureQuery.setParameter(12, saveApplicationOfficeCompanyOwnershipTransferDataRequest.getRentingcontractparm());
        storedProcedureQuery.setParameter(13, saveApplicationOfficeCompanyOwnershipTransferDataRequest.getSiteownershipparm());
        storedProcedureQuery.setParameter(14, saveApplicationOfficeCompanyOwnershipTransferDataRequest.getHeadofservicedpartmentexplanationparm());
        storedProcedureQuery.setParameter(15, saveApplicationOfficeCompanyOwnershipTransferDataRequest.getHeadofservicedpartmentdecisionparm());
        storedProcedureQuery.setParameter(16, saveApplicationOfficeCompanyOwnershipTransferDataRequest.getDirectordirectorateexplanationparm());
        storedProcedureQuery.setParameter(17, saveApplicationOfficeCompanyOwnershipTransferDataRequest.getDirectordirectoratedecisionparm());
        storedProcedureQuery.setParameter(18, saveApplicationOfficeCompanyOwnershipTransferDataRequest.getPrincepel());
        storedProcedureQuery.setParameter(19, saveApplicationOfficeCompanyOwnershipTransferDataRequest.getStatusparm());
        storedProcedureQuery.setParameter(20, request.getRemoteAddr());
        storedProcedureQuery.setParameter(21, saveApplicationOfficeCompanyOwnershipTransferDataRequest.getServicedpartmentparm());


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

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveApplicationParkingLotSiteTransferData");
        storedProcedureQuery.setParameter(1, saveApplicationParkingLotSiteTransferDataRequest.getApplicationparkinglotsitetransferidparm());
        storedProcedureQuery.setParameter(2, saveApplicationParkingLotSiteTransferDataRequest.getOperatoridparm());
        storedProcedureQuery.setParameter(3, saveApplicationParkingLotSiteTransferDataRequest.getOperatornameparm());
        storedProcedureQuery.setParameter(4, saveApplicationParkingLotSiteTransferDataRequest.getPhonenumberparm());
        storedProcedureQuery.setParameter(5, saveApplicationParkingLotSiteTransferDataRequest.getEmailparm());
        storedProcedureQuery.setParameter(6, saveApplicationParkingLotSiteTransferDataRequest.getOldsiteprovinceparm());
        storedProcedureQuery.setParameter(7, saveApplicationParkingLotSiteTransferDataRequest.getOldsitegovernorateparm());
        storedProcedureQuery.setParameter(8, saveApplicationParkingLotSiteTransferDataRequest.getOldsitemunicipalityparm());
        storedProcedureQuery.setParameter(9, saveApplicationParkingLotSiteTransferDataRequest.getOldsiteterritoryparm());
        storedProcedureQuery.setParameter(10, saveApplicationParkingLotSiteTransferDataRequest.getNewsiteprovinceparm());
        storedProcedureQuery.setParameter(11, saveApplicationParkingLotSiteTransferDataRequest.getNewsitegovernorateparm());
        storedProcedureQuery.setParameter(12, saveApplicationParkingLotSiteTransferDataRequest.getNewsitemunicipalityparm());
        storedProcedureQuery.setParameter(13, saveApplicationParkingLotSiteTransferDataRequest.getNewsiteterritoryparm());
        storedProcedureQuery.setParameter(14, saveApplicationParkingLotSiteTransferDataRequest.getNewownernationalidparm());
        storedProcedureQuery.setParameter(15, saveApplicationParkingLotSiteTransferDataRequest.getNewownernameparm());
        storedProcedureQuery.setParameter(16, saveApplicationParkingLotSiteTransferDataRequest.getFinancialcommitmentparm());
        storedProcedureQuery.setParameter(17, saveApplicationParkingLotSiteTransferDataRequest.getRentingcontractparm());
        storedProcedureQuery.setParameter(18, saveApplicationParkingLotSiteTransferDataRequest.getSiteownershipparm());
        storedProcedureQuery.setParameter(19, saveApplicationParkingLotSiteTransferDataRequest.getHeadofservicedepartmentexplanationparm());
        storedProcedureQuery.setParameter(20, saveApplicationParkingLotSiteTransferDataRequest.getHeadofservicedepartmentdecisionparm());
        storedProcedureQuery.setParameter(21, saveApplicationParkingLotSiteTransferDataRequest.getDisclosurecommitteeexplanationparm());
        storedProcedureQuery.setParameter(22, saveApplicationParkingLotSiteTransferDataRequest.getDisclosurecommitteedecisionparm());
        storedProcedureQuery.setParameter(23, saveApplicationParkingLotSiteTransferDataRequest.getPrincepel());
        storedProcedureQuery.setParameter(24, saveApplicationParkingLotSiteTransferDataRequest.getStatusparm());
        storedProcedureQuery.setParameter(25, request.getRemoteAddr());
        storedProcedureQuery.setParameter(26, saveApplicationParkingLotSiteTransferDataRequest.getServicedpartmentparm());
        storedProcedureQuery.setParameter(27, saveApplicationParkingLotSiteTransferDataRequest.getOperatornationalidparm());


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

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveApplicationVehiclesOwnershipTransferData");
        storedProcedureQuery.setParameter(1, saveApplicationVehiclesOwnershipTransferDataRequest.getApplicationvehiclesownershiptransferidparm());
        storedProcedureQuery.setParameter(2, saveApplicationVehiclesOwnershipTransferDataRequest.get_1stoperatoridparm());
        storedProcedureQuery.setParameter(3, saveApplicationVehiclesOwnershipTransferDataRequest.get_1stoperatornameparm());
        storedProcedureQuery.setParameter(4, saveApplicationVehiclesOwnershipTransferDataRequest.getPhonenumberparm());
        storedProcedureQuery.setParameter(5, saveApplicationVehiclesOwnershipTransferDataRequest.getEmailparm());
        storedProcedureQuery.setParameter(6, saveApplicationVehiclesOwnershipTransferDataRequest.get_2ndoperatoridparm());
        storedProcedureQuery.setParameter(7, saveApplicationVehiclesOwnershipTransferDataRequest.get_2ndoperatornameparm());
        storedProcedureQuery.setParameter(8, saveApplicationVehiclesOwnershipTransferDataRequest.getVehicleidparm());
        storedProcedureQuery.setParameter(9, saveApplicationVehiclesOwnershipTransferDataRequest.getNewownernationalidparm());
        storedProcedureQuery.setParameter(10, saveApplicationVehiclesOwnershipTransferDataRequest.getNewownernameparm());
        storedProcedureQuery.setParameter(11, saveApplicationVehiclesOwnershipTransferDataRequest.getHeadofservicedpartmentexplanationparm());
        storedProcedureQuery.setParameter(12, saveApplicationVehiclesOwnershipTransferDataRequest.getHeadofservicedpartmentdecisionparm());
        storedProcedureQuery.setParameter(13, saveApplicationVehiclesOwnershipTransferDataRequest.getDirectordirectoratepassengertransportexplanationparm());
        storedProcedureQuery.setParameter(14, saveApplicationVehiclesOwnershipTransferDataRequest.getDirectordirectoratepassengertransportdecisionparm());
        storedProcedureQuery.setParameter(15, saveApplicationVehiclesOwnershipTransferDataRequest.getPrincepel());
        storedProcedureQuery.setParameter(16, saveApplicationVehiclesOwnershipTransferDataRequest.getStatusparm());
        storedProcedureQuery.setParameter(17, request.getRemoteAddr());
        storedProcedureQuery.setParameter(18, saveApplicationVehiclesOwnershipTransferDataRequest.getServicedpartmentparm());
        storedProcedureQuery.setParameter(19, saveApplicationVehiclesOwnershipTransferDataRequest.getFinancialcommitmentparm());


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

       return addApplicationRenewPublicTransportPermitsOrTemporaryPermitsDat(saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest, request);
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

        return addApplicationRenewPublicTransportPermitsOrTemporaryPermitsDat(saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest, request);
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

        return addApplicationRenewPublicTransportPermitsOrTemporaryPermitsDat(saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest, request);
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

        return addApplicationRenewPublicTransportPermitsOrTemporaryPermitsDat(saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest, request);
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

        return  addApplicationLicensingServiceofLuxuryCarAndInternationalCarri(saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest, request);
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

        return  addApplicationLicensingServiceofLuxuryCarAndInternationalCarri(saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest, request);
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
    public String process_5_1_4(@ApiParam("\t") @RequestBody SaveApplicationLicensingOfMergerOfficeDataRequest saveApplicationLicensingOfMergerOfficeDataRequest ,HttpServletRequest requset){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveApplicationLicensingOfMergerOfficeData");
        storedProcedureQuery.setParameter(1, saveApplicationLicensingOfMergerOfficeDataRequest.getApplicationlicensingofmergerofficeidparm());
        storedProcedureQuery.setParameter(2, saveApplicationLicensingOfMergerOfficeDataRequest.get_1stoperatoridparm());
        storedProcedureQuery.setParameter(3, saveApplicationLicensingOfMergerOfficeDataRequest.get_1stoperatornameparm());
        storedProcedureQuery.setParameter(4, saveApplicationLicensingOfMergerOfficeDataRequest.get_2ndoperatoridparm());
        storedProcedureQuery.setParameter(5, saveApplicationLicensingOfMergerOfficeDataRequest.get_2ndoperatornameparm());
        storedProcedureQuery.setParameter(6, saveApplicationLicensingOfMergerOfficeDataRequest.getPhonenumberparm());
        storedProcedureQuery.setParameter(7, saveApplicationLicensingOfMergerOfficeDataRequest.getEmailparm());
        storedProcedureQuery.setParameter(8, saveApplicationLicensingOfMergerOfficeDataRequest.getProvinceparm());
        storedProcedureQuery.setParameter(9, saveApplicationLicensingOfMergerOfficeDataRequest.getGovernorateparm());
        storedProcedureQuery.setParameter(10, saveApplicationLicensingOfMergerOfficeDataRequest.getMunicipalityparm());
        storedProcedureQuery.setParameter(11, saveApplicationLicensingOfMergerOfficeDataRequest.getTerritoryparm());
        storedProcedureQuery.setParameter(12, saveApplicationLicensingOfMergerOfficeDataRequest.getVehicleidlistparm());
        storedProcedureQuery.setParameter(13, saveApplicationLicensingOfMergerOfficeDataRequest.getHodnocriminalrecordparm());
        storedProcedureQuery.setParameter(14, saveApplicationLicensingOfMergerOfficeDataRequest.getHodproffissionlicenseparm());
        storedProcedureQuery.setParameter(15, saveApplicationLicensingOfMergerOfficeDataRequest.getHodvehiclelistparm());
        storedProcedureQuery.setParameter(16, saveApplicationLicensingOfMergerOfficeDataRequest.getHodcommercialrecordparm());
        storedProcedureQuery.setParameter(17, saveApplicationLicensingOfMergerOfficeDataRequest.getHodpatentdirectorateoffinanceparm());
        storedProcedureQuery.setParameter(18, saveApplicationLicensingOfMergerOfficeDataRequest.getHoddvldexplanationparm());
        storedProcedureQuery.setParameter(19, saveApplicationLicensingOfMergerOfficeDataRequest.getHodparkinglotrentingcontractparm());
        storedProcedureQuery.setParameter(20, saveApplicationLicensingOfMergerOfficeDataRequest.getHodsiteownershipparm());
        storedProcedureQuery.setParameter(21, saveApplicationLicensingOfMergerOfficeDataRequest.getSitedetectionrequestreferenceparm());
        storedProcedureQuery.setParameter(22, saveApplicationLicensingOfMergerOfficeDataRequest.getSitedetection_1stoperatoridparm());
        storedProcedureQuery.setParameter(23, saveApplicationLicensingOfMergerOfficeDataRequest.getSitedetection_2ndoperatoridparm());
        storedProcedureQuery.setParameter(24, saveApplicationLicensingOfMergerOfficeDataRequest.getSitedetectionphonenumberparm());
        storedProcedureQuery.setParameter(25, saveApplicationLicensingOfMergerOfficeDataRequest.getSitedetectionemailparm());
        storedProcedureQuery.setParameter(26, saveApplicationLicensingOfMergerOfficeDataRequest.getSitedetectionprovinceparm());
        storedProcedureQuery.setParameter(27, saveApplicationLicensingOfMergerOfficeDataRequest.getSitedetectiongovernorateparm());
        storedProcedureQuery.setParameter(28, saveApplicationLicensingOfMergerOfficeDataRequest.getSitedetectionmunicipalityparm());
        storedProcedureQuery.setParameter(29, saveApplicationLicensingOfMergerOfficeDataRequest.getSitedetectionterritoryparm());
        storedProcedureQuery.setParameter(30, saveApplicationLicensingOfMergerOfficeDataRequest.getPrencipal());
        storedProcedureQuery.setParameter(31, saveApplicationLicensingOfMergerOfficeDataRequest.getStatusparm());
        storedProcedureQuery.setParameter(32, requset.getRemoteAddr());
        storedProcedureQuery.setParameter(33, saveApplicationLicensingOfMergerOfficeDataRequest.getServicedepartmentparm());

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

        return  addApplicationOfficeCcompanylicenseRenewData(saveApplicationOfficeCcompanylicenseRenewDataRequest, requset);
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

        return  addApplicationOfficeCcompanylicenseRenewData(saveApplicationOfficeCcompanylicenseRenewDataRequest, requset);
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

        return  addApplicationOfficeCcompanylicenseRenewData(saveApplicationOfficeCcompanylicenseRenewDataRequest, requset);
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

        return  addApplicationOfficeCcompanylicenseRenewData(saveApplicationOfficeCcompanylicenseRenewDataRequest, requset);
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

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveApplicationSmartPermitsData");
        storedProcedureQuery.setParameter(1, saveApplicationSmartPermitsDataRequest.getApplicationsmartpermitsidparm());
        storedProcedureQuery.setParameter(2, saveApplicationSmartPermitsDataRequest.getApplicantnationalidparm());
        storedProcedureQuery.setParameter(3, saveApplicationSmartPermitsDataRequest.getApplicantnameparm());
        storedProcedureQuery.setParameter(4, saveApplicationSmartPermitsDataRequest.getVehicleownernationalidparm());
        storedProcedureQuery.setParameter(5, saveApplicationSmartPermitsDataRequest.getVehicleownernameparm());
        storedProcedureQuery.setParameter(6, saveApplicationSmartPermitsDataRequest.getPhonenumberparm());
        storedProcedureQuery.setParameter(7, saveApplicationSmartPermitsDataRequest.getEmailparm());
        storedProcedureQuery.setParameter(8, saveApplicationSmartPermitsDataRequest.getProvinceparm());
        storedProcedureQuery.setParameter(9, saveApplicationSmartPermitsDataRequest.getGovernorateparm());
        storedProcedureQuery.setParameter(10, saveApplicationSmartPermitsDataRequest.getMunicipalityparm());
        storedProcedureQuery.setParameter(11, saveApplicationSmartPermitsDataRequest.getTerritoryparm());
        storedProcedureQuery.setParameter(12, saveApplicationSmartPermitsDataRequest.getVehicleidparm());
        storedProcedureQuery.setParameter(13, saveApplicationSmartPermitsDataRequest.getPermitidparm());
        storedProcedureQuery.setParameter(14, saveApplicationSmartPermitsDataRequest.getCategoryparm());
        storedProcedureQuery.setParameter(15, saveApplicationSmartPermitsDataRequest.getClassificationparm());
        storedProcedureQuery.setParameter(16, saveApplicationSmartPermitsDataRequest.getCertificateofdiseasefreeparm());
        storedProcedureQuery.setParameter(17, saveApplicationSmartPermitsDataRequest.getNocriminalrecordsparm());
        storedProcedureQuery.setParameter(18, saveApplicationSmartPermitsDataRequest.getCertificateofnon_occupancyparm());
        storedProcedureQuery.setParameter(19, saveApplicationSmartPermitsDataRequest.getFamilybookparm());
        storedProcedureQuery.setParameter(20, saveApplicationSmartPermitsDataRequest.getHodexplanationparm());
        storedProcedureQuery.setParameter(21, saveApplicationSmartPermitsDataRequest.getHoddecisionparm());
        storedProcedureQuery.setParameter(22, saveApplicationSmartPermitsDataRequest.getPrencipal());
        storedProcedureQuery.setParameter(23, saveApplicationSmartPermitsDataRequest.getStatusparm());
        storedProcedureQuery.setParameter(24, request.getRemoteAddr());
        storedProcedureQuery.setParameter(25, saveApplicationSmartPermitsDataRequest.getServicedepartmentparm());

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

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveApplicationTariffFareData");
        storedProcedureQuery.setParameter(1, saveApplicationTariffFareDataRequest.getApplicationtarifffareidparm());
        storedProcedureQuery.setParameter(2, saveApplicationTariffFareDataRequest.getOperatoridparm());
        storedProcedureQuery.setParameter(3, saveApplicationTariffFareDataRequest.getOperatornameparm());
        storedProcedureQuery.setParameter(4, saveApplicationTariffFareDataRequest.getApplicantnameparm());
        storedProcedureQuery.setParameter(5, saveApplicationTariffFareDataRequest.getPhonenumberparm());
        storedProcedureQuery.setParameter(6, saveApplicationTariffFareDataRequest.getEmailparm());
        storedProcedureQuery.setParameter(7, saveApplicationTariffFareDataRequest.getProvinceparm());
        storedProcedureQuery.setParameter(8, saveApplicationTariffFareDataRequest.getGovernorateparm());
        storedProcedureQuery.setParameter(9, saveApplicationTariffFareDataRequest.getMunicipalityparm());
        storedProcedureQuery.setParameter(10, saveApplicationTariffFareDataRequest.getTerritoryparm());
        storedProcedureQuery.setParameter(11, saveApplicationTariffFareDataRequest.getRouteidparm());
        storedProcedureQuery.setParameter(12, saveApplicationTariffFareDataRequest.getVehiclecategoryparm());
        storedProcedureQuery.setParameter(13, saveApplicationTariffFareDataRequest.getFuletypeparm());
        storedProcedureQuery.setParameter(14, saveApplicationTariffFareDataRequest.getSuggestedfareparm());
        storedProcedureQuery.setParameter(15, saveApplicationTariffFareDataRequest.getReasonparm());
        storedProcedureQuery.setParameter(16, saveApplicationTariffFareDataRequest.getDisclosurecommitteenewdistanceparm());
        storedProcedureQuery.setParameter(17, saveApplicationTariffFareDataRequest.getDisclosurecommitteeexplanationparm());
        storedProcedureQuery.setParameter(18, saveApplicationTariffFareDataRequest.getNewtariffparm());
        storedProcedureQuery.setParameter(19, saveApplicationTariffFareDataRequest.getTariffcalculatorexplanationparm());
        storedProcedureQuery.setParameter(20, saveApplicationTariffFareDataRequest.getStudyreferenceparm());
        storedProcedureQuery.setParameter(21, saveApplicationTariffFareDataRequest.getStudypathparm());
        storedProcedureQuery.setParameter(22, saveApplicationTariffFareDataRequest.getTariffcalculatordecisionparm());
        storedProcedureQuery.setParameter(23, saveApplicationTariffFareDataRequest.getDirectordirectoratepassengertransportexplanationparm());
        storedProcedureQuery.setParameter(24, saveApplicationTariffFareDataRequest.getDirectordirectoratepassengertransportdecisionparm());
        storedProcedureQuery.setParameter(25, saveApplicationTariffFareDataRequest.getPrencipal());
        storedProcedureQuery.setParameter(26, request.getRemoteAddr());
        storedProcedureQuery.setParameter(27, saveApplicationTariffFareDataRequest.getServicedepartmentparm());
        storedProcedureQuery.setParameter(28, saveApplicationTariffFareDataRequest.getStatusparm());

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

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveApplicationRouteAmedmentData");
        storedProcedureQuery.setParameter(1, saveApplicationRouteAmedmentDataRequest.getApplicationrouteamedmentidparm());
        storedProcedureQuery.setParameter(2, saveApplicationRouteAmedmentDataRequest.getOperatoridparm());
        storedProcedureQuery.setParameter(3, saveApplicationRouteAmedmentDataRequest.getOperatornameparm());
        storedProcedureQuery.setParameter(4, saveApplicationRouteAmedmentDataRequest.getPhonenumberparm());
        storedProcedureQuery.setParameter(5, saveApplicationRouteAmedmentDataRequest.getEmailparm());
        storedProcedureQuery.setParameter(6, saveApplicationRouteAmedmentDataRequest.getProvinceparm());
        storedProcedureQuery.setParameter(7, saveApplicationRouteAmedmentDataRequest.getGovernorateparm());
        storedProcedureQuery.setParameter(8, saveApplicationRouteAmedmentDataRequest.getMunicipalityparm());
        storedProcedureQuery.setParameter(9, saveApplicationRouteAmedmentDataRequest.getTerritoryparm());
        storedProcedureQuery.setParameter(10, saveApplicationRouteAmedmentDataRequest.getRouteidparm());
        storedProcedureQuery.setParameter(11, saveApplicationRouteAmedmentDataRequest.getCurrentroutelengthparm());
        storedProcedureQuery.setParameter(12, saveApplicationRouteAmedmentDataRequest.getSuggestedroutelengthparm());
        storedProcedureQuery.setParameter(13, saveApplicationRouteAmedmentDataRequest.getCurrentroutepassengersparm());
        storedProcedureQuery.setParameter(14, saveApplicationRouteAmedmentDataRequest.getSuggestedroutepassengersparm());
        storedProcedureQuery.setParameter(15, saveApplicationRouteAmedmentDataRequest.getSuggestedpointsparm());
        storedProcedureQuery.setParameter(16, saveApplicationRouteAmedmentDataRequest.getReasonparm());
        storedProcedureQuery.setParameter(17, saveApplicationRouteAmedmentDataRequest.getPassengertransportcommitteeexplanationparm());
        storedProcedureQuery.setParameter(18, saveApplicationRouteAmedmentDataRequest.getPassengertransportcommitteedecisionparm());
        storedProcedureQuery.setParameter(19, saveApplicationRouteAmedmentDataRequest.getDirectordirectoratepassengertransportexplanationparm());
        storedProcedureQuery.setParameter(20, saveApplicationRouteAmedmentDataRequest.getDirectordirectoratepassengertransportdecisionparm());
        storedProcedureQuery.setParameter(21, saveApplicationRouteAmedmentDataRequest.getPrencipal());
        storedProcedureQuery.setParameter(22, saveApplicationRouteAmedmentDataRequest.getStatusparm());
        storedProcedureQuery.setParameter(23, request.getRemoteAddr());
        storedProcedureQuery.setParameter(24, saveApplicationRouteAmedmentDataRequest.getServicedepartmentparm());

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

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveApplicationExchangeLinesData");
        storedProcedureQuery.setParameter(1, saveApplicationExchangeLinesDataRequest.getApplicationexchangelinesidparm());
        storedProcedureQuery.setParameter(2, saveApplicationExchangeLinesDataRequest.getOperatoridparm());
        storedProcedureQuery.setParameter(3, saveApplicationExchangeLinesDataRequest.getOperatornameparm());
        storedProcedureQuery.setParameter(4, saveApplicationExchangeLinesDataRequest.getNationalidparm());
        storedProcedureQuery.setParameter(5, saveApplicationExchangeLinesDataRequest.getPhonenumberparm());
        storedProcedureQuery.setParameter(6, saveApplicationExchangeLinesDataRequest.getEmailparm());
        storedProcedureQuery.setParameter(7, saveApplicationExchangeLinesDataRequest.get_1stvehicleidparm());
        storedProcedureQuery.setParameter(8, saveApplicationExchangeLinesDataRequest.get_2ndvehicleidparm());
        storedProcedureQuery.setParameter(9, saveApplicationExchangeLinesDataRequest.getReasonparm());
        storedProcedureQuery.setParameter(10, saveApplicationExchangeLinesDataRequest.getHeadofservicedepartmentexplanationparm());
        storedProcedureQuery.setParameter(11, saveApplicationExchangeLinesDataRequest.getHeadofservicedepartmentdecisionparm());
        storedProcedureQuery.setParameter(12, saveApplicationExchangeLinesDataRequest.getDirectordirectoratepassengertransportexplanationparm());
        storedProcedureQuery.setParameter(13, saveApplicationExchangeLinesDataRequest.getDirectordirectoratepassengertransportdecisionparm());
        storedProcedureQuery.setParameter(14, saveApplicationExchangeLinesDataRequest.getPrencipal());
        storedProcedureQuery.setParameter(15, saveApplicationExchangeLinesDataRequest.getStatusparm());
        storedProcedureQuery.setParameter(16, request.getRemoteAddr());
        storedProcedureQuery.setParameter(17, saveApplicationExchangeLinesDataRequest.getServicedepartmentparm());


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

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveApplicationPrivateBusRegistrationData");
        storedProcedureQuery.setParameter(1, saveApplicationPrivateBusRegistrationDataRequest.getApplicationprivatebusregistrationidparm());
        storedProcedureQuery.setParameter(2, saveApplicationPrivateBusRegistrationDataRequest.getApplicantnationalidparm());
        storedProcedureQuery.setParameter(3, saveApplicationPrivateBusRegistrationDataRequest.getOperatoridparm());
        storedProcedureQuery.setParameter(4, saveApplicationPrivateBusRegistrationDataRequest.getOperatornameparm());
        storedProcedureQuery.setParameter(5, saveApplicationPrivateBusRegistrationDataRequest.getPhonenumberparm());
        storedProcedureQuery.setParameter(6, saveApplicationPrivateBusRegistrationDataRequest.getEmailparm());
        storedProcedureQuery.setParameter(7, saveApplicationPrivateBusRegistrationDataRequest.getVehicleidparm());
        storedProcedureQuery.setParameter(8, saveApplicationPrivateBusRegistrationDataRequest.getCommercialrecordparm());
        storedProcedureQuery.setParameter(9, saveApplicationPrivateBusRegistrationDataRequest.getProffissionlicenseparm());
        storedProcedureQuery.setParameter(10, saveApplicationPrivateBusRegistrationDataRequest.getCustomreferenceparm());
        storedProcedureQuery.setParameter(11, saveApplicationPrivateBusRegistrationDataRequest.getNoobjectionparm());
        storedProcedureQuery.setParameter(12, saveApplicationPrivateBusRegistrationDataRequest.getLicensepurposesparm());
        storedProcedureQuery.setParameter(13, saveApplicationPrivateBusRegistrationDataRequest.getEvaluationcommitteeexplanationparm());
        storedProcedureQuery.setParameter(14, saveApplicationPrivateBusRegistrationDataRequest.getEvaluationcommitteedecisionparm());
        storedProcedureQuery.setParameter(15, saveApplicationPrivateBusRegistrationDataRequest.getHeadofservicedepartmentexplanationparm());
        storedProcedureQuery.setParameter(16, saveApplicationPrivateBusRegistrationDataRequest.getHeadofservicedepartmentdecisionparm());
        storedProcedureQuery.setParameter(17, saveApplicationPrivateBusRegistrationDataRequest.getDirectordirectoratepassengertransportexplanationparm());
        storedProcedureQuery.setParameter(18, saveApplicationPrivateBusRegistrationDataRequest.getDirectordirectoratepassengertransportdecisionparm());
        storedProcedureQuery.setParameter(19, saveApplicationPrivateBusRegistrationDataRequest.getPrencipal());
        storedProcedureQuery.setParameter(20, saveApplicationPrivateBusRegistrationDataRequest.getStatusparm());
        storedProcedureQuery.setParameter(21, request.getRemoteAddr());
        storedProcedureQuery.setParameter(22, saveApplicationPrivateBusRegistrationDataRequest.getServicedepartmentparm());


        return (String) storedProcedureQuery.getSingleResult() ;
    }


//    End Add or Edit Method Code


//    Start Shared Methods  Code

    private String addApplicationRenewPublicTransportPermitsOrTemporaryPermitsDat(SaveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest, HttpServletRequest request){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDat");
        storedProcedureQuery.setParameter(1, saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest.getApplicationrenewpublictransportpermitsortemporarypermitsidparm());
        storedProcedureQuery.setParameter(2, saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest.getPermitclassparm());
        storedProcedureQuery.setParameter(3, saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest.getOperatoridparm());
        storedProcedureQuery.setParameter(4, saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest.getOperatornameparm());
        storedProcedureQuery.setParameter(5, saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest.getNationalidparm());
        storedProcedureQuery.setParameter(6, saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest.getPhonenumberparm());
        storedProcedureQuery.setParameter(7, saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest.getVehicleidparm());
        storedProcedureQuery.setParameter(8, saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest.getEmailparm());
        storedProcedureQuery.setParameter(9, saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest.getFinancialcommitmentparm());
        storedProcedureQuery.setParameter(10, saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest.getAttachmentpathparm());
        storedProcedureQuery.setParameter(11, saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest.getAttachmentreferenceparm());
        storedProcedureQuery.setParameter(12, saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest.getDvldexplanationparm());
        storedProcedureQuery.setParameter(13, saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest.getGovernorateofficeexpalnationparm());
        storedProcedureQuery.setParameter(14, saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest.getDecisionparm());
        storedProcedureQuery.setParameter(15, saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest.getPrincepel());
        storedProcedureQuery.setParameter(16, saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest.getStatusparm());
        storedProcedureQuery.setParameter(17, saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest.getServicedepartmentparm());
        storedProcedureQuery.setParameter(18, request.getRemoteAddr());
        storedProcedureQuery.setParameter(19, saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest.getIssuestatusparm());
        storedProcedureQuery.setParameter(20, saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest.getRouteidparm());
        storedProcedureQuery.setParameter(21, saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest.getStartpontparm());
        storedProcedureQuery.setParameter(22, saveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDataRequest.getEndpointparm());


        return (String) storedProcedureQuery.getSingleResult() ;

    }

    private String addApplicationBusRentingCompanyeLicenseData(SaveApplicationBusRentingCompanyeLicenseDataRequest saveApplicationBusRentingCompanyeLicenseDataRequest, HttpServletRequest request){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveApplicationBusRentingCompanyeLicenseData");
        storedProcedureQuery.setParameter(1, saveApplicationBusRentingCompanyeLicenseDataRequest.getApplicationbusrentalofficelicenseidparm());
        storedProcedureQuery.setParameter(2, saveApplicationBusRentingCompanyeLicenseDataRequest.getApplicantnationalidparm());
        storedProcedureQuery.setParameter(3, saveApplicationBusRentingCompanyeLicenseDataRequest.getApplicantnameparm());
        storedProcedureQuery.setParameter(4, saveApplicationBusRentingCompanyeLicenseDataRequest.getPhonenumberparm());
        storedProcedureQuery.setParameter(5, saveApplicationBusRentingCompanyeLicenseDataRequest.getEmailparm());
        storedProcedureQuery.setParameter(6, saveApplicationBusRentingCompanyeLicenseDataRequest.getProvinceparm());
        storedProcedureQuery.setParameter(7, saveApplicationBusRentingCompanyeLicenseDataRequest.getGovernorateparm());
        storedProcedureQuery.setParameter(8, saveApplicationBusRentingCompanyeLicenseDataRequest.getMunicipalityparm());
        storedProcedureQuery.setParameter(9, saveApplicationBusRentingCompanyeLicenseDataRequest.getTerritoryparm());
        storedProcedureQuery.setParameter(10, saveApplicationBusRentingCompanyeLicenseDataRequest.getTechnicalfinancialstudyparm());
        storedProcedureQuery.setParameter(11, saveApplicationBusRentingCompanyeLicenseDataRequest.getEvaluationcommitteeexplanationparm());
        storedProcedureQuery.setParameter(12, saveApplicationBusRentingCompanyeLicenseDataRequest.getEvaluationcommitteedecisionparm());
        storedProcedureQuery.setParameter(13, saveApplicationBusRentingCompanyeLicenseDataRequest.getGeneraldirectorexplanationparm());
        storedProcedureQuery.setParameter(14, saveApplicationBusRentingCompanyeLicenseDataRequest.getGeneraldirectordecisionparm());
        storedProcedureQuery.setParameter(15, saveApplicationBusRentingCompanyeLicenseDataRequest.getDisclosurecommitteeexplanationparm());
        storedProcedureQuery.setParameter(16, saveApplicationBusRentingCompanyeLicenseDataRequest.getDisclosurecommitteedecisionparm());
        storedProcedureQuery.setParameter(17, saveApplicationBusRentingCompanyeLicenseDataRequest.getPrincepel());
        storedProcedureQuery.setParameter(18, saveApplicationBusRentingCompanyeLicenseDataRequest.getStatusparm());
        storedProcedureQuery.setParameter(19, request.getRemoteAddr());
        storedProcedureQuery.setParameter(20, saveApplicationBusRentingCompanyeLicenseDataRequest.getOperatoridparm());
        storedProcedureQuery.setParameter(21, saveApplicationBusRentingCompanyeLicenseDataRequest.getServicedepartmentparm());
        storedProcedureQuery.setParameter(22, saveApplicationBusRentingCompanyeLicenseDataRequest.getSubclassparm());
        storedProcedureQuery.setParameter(23, saveApplicationBusRentingCompanyeLicenseDataRequest.getIssuestatusparm());


        return (String) storedProcedureQuery.getSingleResult() ;


    }

    private String addApplicationBusRentingOfficeLicenseData(SaveApplicationBusRentingOfficeLicenseDataRequest saveApplicationBusRentingOfficeLicenseDataRequest, HttpServletRequest request){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveApplicationBusRentingOfficeLicenseData");
        storedProcedureQuery.setParameter(1, saveApplicationBusRentingOfficeLicenseDataRequest.getApplicationbusrentalofficelicenseidparm());
        storedProcedureQuery.setParameter(2, saveApplicationBusRentingOfficeLicenseDataRequest.getApplicantnationalidparm());
        storedProcedureQuery.setParameter(3, saveApplicationBusRentingOfficeLicenseDataRequest.getApplicantnameparm());
        storedProcedureQuery.setParameter(4, saveApplicationBusRentingOfficeLicenseDataRequest.getPhonenumberparm());
        storedProcedureQuery.setParameter(5, saveApplicationBusRentingOfficeLicenseDataRequest.getEmailparm());
        storedProcedureQuery.setParameter(6, saveApplicationBusRentingOfficeLicenseDataRequest.getProvinceparm());
        storedProcedureQuery.setParameter(7, saveApplicationBusRentingOfficeLicenseDataRequest.getGovernorateparm());
        storedProcedureQuery.setParameter(8, saveApplicationBusRentingOfficeLicenseDataRequest.getMunicipalityparm());
        storedProcedureQuery.setParameter(9, saveApplicationBusRentingOfficeLicenseDataRequest.getTerritoryparm());
        storedProcedureQuery.setParameter(10, saveApplicationBusRentingOfficeLicenseDataRequest.getTechnicalfinancialstudyparm());
        storedProcedureQuery.setParameter(11, saveApplicationBusRentingOfficeLicenseDataRequest.getEvaluationcommitteeexplanationparm());
        storedProcedureQuery.setParameter(12, saveApplicationBusRentingOfficeLicenseDataRequest.getEvaluationcommitteedecisionparm());
        storedProcedureQuery.setParameter(13, saveApplicationBusRentingOfficeLicenseDataRequest.getGeneraldirectorexplanationparm());
        storedProcedureQuery.setParameter(14, saveApplicationBusRentingOfficeLicenseDataRequest.getGeneraldirectordecisionparm());
        storedProcedureQuery.setParameter(15, saveApplicationBusRentingOfficeLicenseDataRequest.getDisclosurecommitteeexplanationparm());
        storedProcedureQuery.setParameter(16, saveApplicationBusRentingOfficeLicenseDataRequest.getDisclosurecommitteedecisionparm());
        storedProcedureQuery.setParameter(17, saveApplicationBusRentingOfficeLicenseDataRequest.getPrincepel());
        storedProcedureQuery.setParameter(18, saveApplicationBusRentingOfficeLicenseDataRequest.getStatusparm());
        storedProcedureQuery.setParameter(19, request.getRemoteAddr());


        return (String) storedProcedureQuery.getSingleResult() ;


    }

    private String addApplicationLicensingServiceofLuxuryCarAndInternationalCarri(SaveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest, HttpServletRequest request){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveApplicationLicensingServiceofLuxuryCarAndInternationalCarri");
        storedProcedureQuery.setParameter(1, saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest.getApplicationlicensingserviceofluxurycarandinternationalcarrierid());
        storedProcedureQuery.setParameter(2, saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest.getApplicantnationalidparm());
        storedProcedureQuery.setParameter(3, saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest.getApplicantnameparm());
        storedProcedureQuery.setParameter(4, saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest.getPhonenumberparm());
        storedProcedureQuery.setParameter(5, saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest.getEmailparm());
        storedProcedureQuery.setParameter(6, saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest.getProvinceparm());
        storedProcedureQuery.setParameter(7, saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest.getGovernorateparm());
        storedProcedureQuery.setParameter(8, saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest.getStudyreferenceparm());
        storedProcedureQuery.setParameter(9, saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest.getEvaluationcommitteeexplanationparm());
        storedProcedureQuery.setParameter(10, saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest.getEvaluationcommitteedecisionparm());
        storedProcedureQuery.setParameter(11, saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest.getGeneraldirectorexplanationparm());
        storedProcedureQuery.setParameter(12, saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest.getGeneraldirectordecisionparm());
        storedProcedureQuery.setParameter(13, saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest.getInitialapprovalreferenceforsitedetectionparm());
        storedProcedureQuery.setParameter(14, saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest.getInitialapprovalapplicantnationalidforsitedetectionparm());
        storedProcedureQuery.setParameter(15, saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest.getInitialapprovalapplicantnameforsitedetectionparm());
        storedProcedureQuery.setParameter(16, saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest.getInitialapprovalphonenumberforsitedetectionparm());
        storedProcedureQuery.setParameter(17, saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest.getInitialapprovalemailforsitedetectionparm());
        storedProcedureQuery.setParameter(18, saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest.getInitialapprovalprovinceforsitedetectionparm());
        storedProcedureQuery.setParameter(19, saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest.getInitialapprovagovernorateforsitedetectionparm());
        storedProcedureQuery.setParameter(20, saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest.getInitialapprovamunicipalityforsitedetectionparm());
        storedProcedureQuery.setParameter(21, saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest.getInitialapprovaterritoryforsitedetectionparm());
        storedProcedureQuery.setParameter(22, saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest.getInitialapprovaaddressforsitedetectionparm());
        storedProcedureQuery.setParameter(23, saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest.getHeadofservicedepartmentexplanationparm());
        storedProcedureQuery.setParameter(24, saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest.getHeadofservicedepartmentdecisionparm());
        storedProcedureQuery.setParameter(25, saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest.getPrincepel());
        storedProcedureQuery.setParameter(26, saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest.getStatusparm());
        storedProcedureQuery.setParameter(27, request.getRemoteAddr());
        storedProcedureQuery.setParameter(28, saveApplicationLicensingServiceofLuxuryCarAndInternationalCarriDataRequest.getServicedepartmentparm());


        return (String) storedProcedureQuery.getSingleResult() ;

    }

    private String addApplicationOfficeCcompanylicenseRenewData(SaveApplicationOfficeCcompanylicenseRenewDataRequest saveApplicationOfficeCcompanylicenseRenewDataRequest, HttpServletRequest request){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveApplicationOfficeCcompanylicenseRenewData");
        storedProcedureQuery.setParameter(1, saveApplicationOfficeCcompanylicenseRenewDataRequest.getOfficeccompanylicenserenewidparm());
        storedProcedureQuery.setParameter(2, saveApplicationOfficeCcompanylicenseRenewDataRequest.getOperatoridparm());
        storedProcedureQuery.setParameter(3, saveApplicationOfficeCcompanylicenseRenewDataRequest.getApplicantnameparm());
        storedProcedureQuery.setParameter(4, saveApplicationOfficeCcompanylicenseRenewDataRequest.getPhonenumberparm());
        storedProcedureQuery.setParameter(5, saveApplicationOfficeCcompanylicenseRenewDataRequest.getEmailparm());
        storedProcedureQuery.setParameter(6, saveApplicationOfficeCcompanylicenseRenewDataRequest.getProvinceparm());
        storedProcedureQuery.setParameter(7, saveApplicationOfficeCcompanylicenseRenewDataRequest.getGovernorateparm());
        storedProcedureQuery.setParameter(8, saveApplicationOfficeCcompanylicenseRenewDataRequest.getMunicipalityparm());
        storedProcedureQuery.setParameter(9, saveApplicationOfficeCcompanylicenseRenewDataRequest.getTerritoryparm());
        storedProcedureQuery.setParameter(10, saveApplicationOfficeCcompanylicenseRenewDataRequest.getVehiclelistparm());
        storedProcedureQuery.setParameter(11, saveApplicationOfficeCcompanylicenseRenewDataRequest.getPermitlistparm());
        storedProcedureQuery.setParameter(12, saveApplicationOfficeCcompanylicenseRenewDataRequest.getCertificateofnocriminalrecordconfirmationparm());
        storedProcedureQuery.setParameter(13, saveApplicationOfficeCcompanylicenseRenewDataRequest.getCareerlicenseforthepreviousyearconfirmationparm());
        storedProcedureQuery.setParameter(14, saveApplicationOfficeCcompanylicenseRenewDataRequest.getCommercialrecordconfirmationparm());
        storedProcedureQuery.setParameter(15, saveApplicationOfficeCcompanylicenseRenewDataRequest.getVehiclelistconfirmationparm());
        storedProcedureQuery.setParameter(16, saveApplicationOfficeCcompanylicenseRenewDataRequest.getPatentfromdirectorateoffinanceconfirmationparm());
        storedProcedureQuery.setParameter(17, saveApplicationOfficeCcompanylicenseRenewDataRequest.getParkinglotrentingcontractconfirmationparm());
        storedProcedureQuery.setParameter(18, saveApplicationOfficeCcompanylicenseRenewDataRequest.getSiteownershipconfirmationparm());
        storedProcedureQuery.setParameter(19, saveApplicationOfficeCcompanylicenseRenewDataRequest.getDisclosurecommitteerequestnumberparm());
        storedProcedureQuery.setParameter(20, saveApplicationOfficeCcompanylicenseRenewDataRequest.getDisclosurecommitteeoperatoridparm());
        storedProcedureQuery.setParameter(21, saveApplicationOfficeCcompanylicenseRenewDataRequest.getDisclosurecommitteephonenumberparm());
        storedProcedureQuery.setParameter(22, saveApplicationOfficeCcompanylicenseRenewDataRequest.getDisclosurecommitteeemailparm());
        storedProcedureQuery.setParameter(23, saveApplicationOfficeCcompanylicenseRenewDataRequest.getDisclosurecommitteeprovinceparm());
        storedProcedureQuery.setParameter(24, saveApplicationOfficeCcompanylicenseRenewDataRequest.getDisclosurecommitteegovernorateparm());
        storedProcedureQuery.setParameter(25, saveApplicationOfficeCcompanylicenseRenewDataRequest.getDisclosurecommitteemunicipalityparm());
        storedProcedureQuery.setParameter(26, saveApplicationOfficeCcompanylicenseRenewDataRequest.getDisclosurecommitteeterritoryparm());
        storedProcedureQuery.setParameter(27, saveApplicationOfficeCcompanylicenseRenewDataRequest.getPrencipal());
        storedProcedureQuery.setParameter(28, saveApplicationOfficeCcompanylicenseRenewDataRequest.getStatusparm());
        storedProcedureQuery.setParameter(29, request.getRemoteAddr());
        storedProcedureQuery.setParameter(30, saveApplicationOfficeCcompanylicenseRenewDataRequest.getServicedepartmentparm());


        return (String) storedProcedureQuery.getSingleResult() ;

    }

//    End Shared Methods  Code
}
