package com.etech.ltrc.permits.operator;

import io.swagger.annotations.*;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.persistence.*;
import java.util.ArrayList;
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
@RequestMapping(value = "/api/operator")
public class OperatorService {


    @PersistenceContext
    private EntityManager entityManager;

//  Start Add or Edit Methods

    @ApiOperation("Add or Edit Operator Branch ")
    @PostMapping("/branch")
    public String addOperatorBranch(@ApiParam(value = "\t") @RequestBody SaveOperatorBranchDataRequest saveOperatorBranchDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveOperatorBranchData");
        storedProcedureQuery.setParameter(1, saveOperatorBranchDataRequest.getOperatorbranchidparm());
        storedProcedureQuery.setParameter(2, saveOperatorBranchDataRequest.getOperatoridparm());
        storedProcedureQuery.setParameter(3, saveOperatorBranchDataRequest.getProvinceparm());
        storedProcedureQuery.setParameter(4, saveOperatorBranchDataRequest.getGovernorateparm());
        storedProcedureQuery.setParameter(5, saveOperatorBranchDataRequest.getMunicipalityparm());
        storedProcedureQuery.setParameter(6, saveOperatorBranchDataRequest.getTerritoryparm());
        storedProcedureQuery.setParameter(7, saveOperatorBranchDataRequest.getNeighborhoodparm());
        storedProcedureQuery.setParameter(8, saveOperatorBranchDataRequest.getStreetparm());
        storedProcedureQuery.setParameter(9, saveOperatorBranchDataRequest.getBasinparm());
        storedProcedureQuery.setParameter(10, saveOperatorBranchDataRequest.getPlotnoparm());
        storedProcedureQuery.setParameter(11, saveOperatorBranchDataRequest.getPoboxparm());
        storedProcedureQuery.setParameter(12, saveOperatorBranchDataRequest.getTelephoneparm());
        storedProcedureQuery.setParameter(13, saveOperatorBranchDataRequest.getFaxparm());
        storedProcedureQuery.setParameter(14, saveOperatorBranchDataRequest.getMobilephoneparm());
        storedProcedureQuery.setParameter(15, saveOperatorBranchDataRequest.getEmailparm());
        storedProcedureQuery.setParameter(16, saveOperatorBranchDataRequest.getAggreementreferencenumberparm());
        storedProcedureQuery.setParameter(17, saveOperatorBranchDataRequest.getAggreementreferencedateparm());
        storedProcedureQuery.setParameter(18, saveOperatorBranchDataRequest.getVehiclecountparm());
        storedProcedureQuery.setParameter(19, saveOperatorBranchDataRequest.getBranchnameparm());
        storedProcedureQuery.setParameter(20 ,saveOperatorBranchDataRequest.getCertificateregistrationnumberparm());
        storedProcedureQuery.setParameter(21, saveOperatorBranchDataRequest.getStatusparm());
        storedProcedureQuery.setParameter(22, saveOperatorBranchDataRequest.getPrincepel());

        return (String) storedProcedureQuery.getSingleResult();

    }

    @ApiOperation("Add or Edit Operator ")
    @PostMapping
    public String addOperator(@ApiParam(value = "\t") @RequestBody SaveOperatorDataRequest saveOperatorDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveOperatorData");
        storedProcedureQuery.setParameter(1, saveOperatorDataRequest.getOperatoridparm());
        storedProcedureQuery.setParameter(2, saveOperatorDataRequest.getOperatornationalidparm());
        storedProcedureQuery.setParameter(3, saveOperatorDataRequest.getOperatornameparm());
        storedProcedureQuery.setParameter(4, saveOperatorDataRequest.getOperatorclassificationparm());
        storedProcedureQuery.setParameter(5, saveOperatorDataRequest.getOperatorcategoryparm());
        storedProcedureQuery.setParameter(6, saveOperatorDataRequest.getProvinceparm());
        storedProcedureQuery.setParameter(7, saveOperatorDataRequest.getGovernorateparm());
        storedProcedureQuery.setParameter(8, saveOperatorDataRequest.getMunicipalityparm());
        storedProcedureQuery.setParameter(9, saveOperatorDataRequest.getTerritoryparm());
        storedProcedureQuery.setParameter(10, saveOperatorDataRequest.getStreetparm());
        storedProcedureQuery.setParameter(11, saveOperatorDataRequest.getNeighborhoodparm());
        storedProcedureQuery.setParameter(12, saveOperatorDataRequest.getEmailparm());
        storedProcedureQuery.setParameter(13, saveOperatorDataRequest.getPoboxparm());
        storedProcedureQuery.setParameter(14, saveOperatorDataRequest.getPhonenumberparm());
        storedProcedureQuery.setParameter(15, saveOperatorDataRequest.getMobilephonenumberparm());
        storedProcedureQuery.setParameter(16, saveOperatorDataRequest.getFaxnumberparm());
        storedProcedureQuery.setParameter(17, saveOperatorDataRequest.getLicensepurposeparm());
        storedProcedureQuery.setParameter(18, saveOperatorDataRequest.getStatusparm());
        storedProcedureQuery.setParameter(19, saveOperatorDataRequest.getOfficepropertyownerparm());
        storedProcedureQuery.setParameter(20, saveOperatorDataRequest.getPlotnoparm());
        storedProcedureQuery.setParameter(21, saveOperatorDataRequest.getOfficeareaparm());
        storedProcedureQuery.setParameter(22, saveOperatorDataRequest.getServicescopeparm());
        storedProcedureQuery.setParameter(23, saveOperatorDataRequest.getDateofcontractsigningparm());
        storedProcedureQuery.setParameter(24, saveOperatorDataRequest.getCommercialnamerecordnumberparm());
        storedProcedureQuery.setParameter(25, saveOperatorDataRequest.getCommercialnameparm());
        storedProcedureQuery.setParameter(26, saveOperatorDataRequest.getCommercialrecordnumberparm());
        storedProcedureQuery.setParameter(27, saveOperatorDataRequest.getCommercialrecorddateparm());
        storedProcedureQuery.setParameter(28, saveOperatorDataRequest.getEmployeesnumberparm());
        storedProcedureQuery.setParameter(29, saveOperatorDataRequest.getDriversnumberparm());
        storedProcedureQuery.setParameter(30, saveOperatorDataRequest.getWorkingcarsnumberparm());
        storedProcedureQuery.setParameter(31, saveOperatorDataRequest.getBasiccarsnumberparm());
        storedProcedureQuery.setParameter(32, saveOperatorDataRequest.getOfficeclosingdateparm());
        storedProcedureQuery.setParameter(33, saveOperatorDataRequest.getRemarksparm());
        storedProcedureQuery.setParameter(34, saveOperatorDataRequest.getFeesstatusparm());
        storedProcedureQuery.setParameter(35, saveOperatorDataRequest.getLicenseissuedateparm());
        storedProcedureQuery.setParameter(36, saveOperatorDataRequest.getLicenseexpiredateparm());
        storedProcedureQuery.setParameter(37, saveOperatorDataRequest.getPlotclassificationparm());
        storedProcedureQuery.setParameter(38, saveOperatorDataRequest.getOfficefloorparm());
        storedProcedureQuery.setParameter(39, saveOperatorDataRequest.getContractperiodparm());
        storedProcedureQuery.setParameter(40, saveOperatorDataRequest.getCertificateregistrationnumberparm());
        storedProcedureQuery.setParameter(41, saveOperatorDataRequest.getBasinparm());
        storedProcedureQuery.setParameter(42, saveOperatorDataRequest.getPrincepel());


        return (String) storedProcedureQuery.getSingleResult();

    }

    @ApiOperation("Add or Edit Decision")
    @PostMapping("/decision")
    public String addDecision(@ApiParam(value = "\t") @RequestBody SaveDecisionDataRequest saveDecisionDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveDecisionsData");
        storedProcedureQuery.setParameter(1, saveDecisionDataRequest.getDecisionsidparm());
        storedProcedureQuery.setParameter(2, saveDecisionDataRequest.getDecisionssourceparm());
        storedProcedureQuery.setParameter(3, saveDecisionDataRequest.getVehicleparm());
        storedProcedureQuery.setParameter(4, saveDecisionDataRequest.getDecisionsreferenceparm());
        storedProcedureQuery.setParameter(5, saveDecisionDataRequest.getDecisionsreferencedateparm());
        storedProcedureQuery.setParameter(6, saveDecisionDataRequest.getDecisionsreferencesubjectparm());
        storedProcedureQuery.setParameter(7, saveDecisionDataRequest.getGovernorateparm());
        storedProcedureQuery.setParameter(8, saveDecisionDataRequest.getDecisionstextparm());
        storedProcedureQuery.setParameter(9, saveDecisionDataRequest.getDecisionstremparm());
        storedProcedureQuery.setParameter(10, saveDecisionDataRequest.getDecisionstremdateparm());
        storedProcedureQuery.setParameter(11, saveDecisionDataRequest.getDecisionstremnumberparm());
        storedProcedureQuery.setParameter(12, saveDecisionDataRequest.getPrincepel());
        storedProcedureQuery.setParameter(13, saveDecisionDataRequest.getStatusparm());

        return (String) storedProcedureQuery.getSingleResult();
    }

    @ApiOperation("Add or Edit Vehicle ")
    @PostMapping("/vehicle")
    public String addVehicle(@ApiParam(value = "\t") @RequestBody SaveVehicleDataRequest saveVehicleDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveVehicleData");
        storedProcedureQuery.setParameter(1, saveVehicleDataRequest.getVehicleidparm());
        storedProcedureQuery.setParameter(2, saveVehicleDataRequest.getRegistrationnumberparm());
        storedProcedureQuery.setParameter(3, saveVehicleDataRequest.getPlatenumberparm());
        storedProcedureQuery.setParameter(4, saveVehicleDataRequest.getOwnerparm());
        storedProcedureQuery.setParameter(5, saveVehicleDataRequest.getVehiclecategoryparm());
        storedProcedureQuery.setParameter(6, saveVehicleDataRequest.getOperationparm());
        storedProcedureQuery.setParameter(7, saveVehicleDataRequest.getStatusparm());
        storedProcedureQuery.setParameter(8, saveVehicleDataRequest.getRemarksparm());
        storedProcedureQuery.setParameter(9, saveVehicleDataRequest.getYearofmanufactureparm());
        storedProcedureQuery.setParameter(10, saveVehicleDataRequest.getPassengersnumberparm());
        storedProcedureQuery.setParameter(11, saveVehicleDataRequest.getManufacturerparm());
        storedProcedureQuery.setParameter(12, saveVehicleDataRequest.getOwnernameparm());
        storedProcedureQuery.setParameter(13, saveVehicleDataRequest.getLicenseexpirationparm());
        storedProcedureQuery.setParameter(14, saveVehicleDataRequest.getAddtionaldescriptionsparm());
        storedProcedureQuery.setParameter(15, saveVehicleDataRequest.getPlatecodeparm());
        storedProcedureQuery.setParameter(16, saveVehicleDataRequest.getFeesstatusparm());
        storedProcedureQuery.setParameter(17, saveVehicleDataRequest.getOfficeidparm());
        storedProcedureQuery.setParameter(18, saveVehicleDataRequest.getOfficenameparm());
        storedProcedureQuery.setParameter(19, saveVehicleDataRequest.getVehiclepermitparm());
        storedProcedureQuery.setParameter(20, saveVehicleDataRequest.getFueltypeparm());
        storedProcedureQuery.setParameter(21, saveVehicleDataRequest.getVehicleentrydateparm());
        storedProcedureQuery.setParameter(22, saveVehicleDataRequest.getOperatorparm());
        storedProcedureQuery.setParameter(23, saveVehicleDataRequest.getOwnernationalidparm());
        storedProcedureQuery.setParameter(24, saveVehicleDataRequest.getPrincepel());

        return (String) storedProcedureQuery.getSingleResult() ;


    }

    @ApiOperation("Add or Edit Vehicle Route ")
    @PostMapping("/vehicle-route")
    public String addVehicleRoute(@ApiParam(value = "\t") @RequestBody SaveVehicleRouteDataRequest saveVehicleRouteDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveVehicleRoute");
        storedProcedureQuery.setParameter(1, saveVehicleRouteDataRequest.getVehiclerouteidparm());
        storedProcedureQuery.setParameter(2, saveVehicleRouteDataRequest.getVehicleidparm());
        storedProcedureQuery.setParameter(3, saveVehicleRouteDataRequest.getRouteidparm());

        return  (String) storedProcedureQuery.getSingleResult();
    }

    @ApiOperation("Add or Edit Operator Category Data ")
    @PostMapping("/category")
    public String addOperatorCategroyData(@ApiParam("\t") @RequestBody SaveOperatorCategroyDataRequest saveOperatorCategroyDataRequest) {

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveOperatorCategroyData");
        storedProcedureQuery.setParameter(1, saveOperatorCategroyDataRequest.getOperatorcategoryidparm());
        storedProcedureQuery.setParameter(2, saveOperatorCategroyDataRequest.getOperatorcategorynameparm());
        storedProcedureQuery.setParameter(3, saveOperatorCategroyDataRequest.getOperatorcategoryenglishnameparm());
        storedProcedureQuery.setParameter(4, saveOperatorCategroyDataRequest.getOperatorcategoryclassificationparm());
        storedProcedureQuery.setParameter(5, saveOperatorCategroyDataRequest.getOperatorcategorydepartmentparm());
        storedProcedureQuery.setParameter(6, saveOperatorCategroyDataRequest.getVehiclecategoryparm());
        storedProcedureQuery.setParameter(7, saveOperatorCategroyDataRequest.getPlateclassificationparm());
        storedProcedureQuery.setParameter(8, saveOperatorCategroyDataRequest.getLinetypeparm());
        storedProcedureQuery.setParameter(9, saveOperatorCategroyDataRequest.getPrincepel());
        storedProcedureQuery.setParameter(10, saveOperatorCategroyDataRequest.getStatusparm());

        String result = (String) storedProcedureQuery.getSingleResult();

        if (!result.startsWith("E")) {
            long categoryId = Long.valueOf(result.substring(0, result.indexOf("$")));

            if (saveOperatorCategroyDataRequest.getField() != null) {
                if (saveOperatorCategroyDataRequest.getOperatorcategoryidparm() == 0) {

                    saveOperatorCategroyDataRequest.getField().forEach(field -> {
                        field.setOperatorcategoryidparm(categoryId);
                        addOperatorCategoryFieldSettingData(field);
                    });
                } else {
                    saveOperatorCategroyDataRequest.getField().forEach(field -> {
                        field.setOperatorcategoryidparm(saveOperatorCategroyDataRequest.getOperatorcategoryidparm());
                        addOperatorCategoryFieldSettingData(field);
                    });


                }
            }
        }
        return result;
    }

//    @ApiOperation("Add or Edit Operator Category Field Setting Data")
//    @PostMapping("/category-setting")
    private  String addOperatorCategoryFieldSettingData (@ApiParam("\t") @RequestBody SaveOperatorCategoryFieldSettingDataRequest saveOperatorCategoryFieldSettingDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveOperatorCategoryFieldSettingData");
        storedProcedureQuery.setParameter(1, saveOperatorCategoryFieldSettingDataRequest.getOperatorcategroryfieldsettingidparm());
        storedProcedureQuery.setParameter(2, saveOperatorCategoryFieldSettingDataRequest.getOperatorcategoryidparm());
        storedProcedureQuery.setParameter(3, saveOperatorCategoryFieldSettingDataRequest.getOperatorfieldparm());
        storedProcedureQuery.setParameter(4, saveOperatorCategoryFieldSettingDataRequest.getRequiredparm());
        storedProcedureQuery.setParameter(5, saveOperatorCategoryFieldSettingDataRequest.getVisibleparm());
        storedProcedureQuery.setParameter(6, saveOperatorCategoryFieldSettingDataRequest.getActiveparm());
        storedProcedureQuery.setParameter(7, saveOperatorCategoryFieldSettingDataRequest.getPrincepel());
        storedProcedureQuery.setParameter(8, saveOperatorCategoryFieldSettingDataRequest.getStatusparm());

        return (String) storedProcedureQuery.getSingleResult() ;

    }

//    End Add Methods


//  Start  Retrieve Methods

    @ApiOperation("Retrieve Operator By Basic Information")
    @PostMapping("/find")
    public List<ReturnOperatorByOperatorBasicInformationResponse> findOperatorByBasicInformation(@ApiParam(value = "\t") @RequestBody ReturnOperatorByOperatorBasicInformationDataRequest returnOperatorByOperatorBasicInformationDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnOperatorByOperatorBasicInformation");
        storedProcedureQuery.setParameter(1, returnOperatorByOperatorBasicInformationDataRequest.getMinoperatoridparm());
        storedProcedureQuery.setParameter(2, returnOperatorByOperatorBasicInformationDataRequest.getMaxoperatoridparm());
        storedProcedureQuery.setParameter(3, returnOperatorByOperatorBasicInformationDataRequest.getLicenseissuedateparm());
        storedProcedureQuery.setParameter(4, returnOperatorByOperatorBasicInformationDataRequest.getLicenseexpiredateparm());
        storedProcedureQuery.setParameter(5, returnOperatorByOperatorBasicInformationDataRequest.getOperatorclassificationparm());
        storedProcedureQuery.setParameter(6, returnOperatorByOperatorBasicInformationDataRequest.getOperatorcategoryparm());
        storedProcedureQuery.setParameter(7, returnOperatorByOperatorBasicInformationDataRequest.getOperatornationalidparm());
        storedProcedureQuery.setParameter(8, returnOperatorByOperatorBasicInformationDataRequest.getOperatornameparm());
        storedProcedureQuery.setParameter(9, returnOperatorByOperatorBasicInformationDataRequest.getOperatorcomercialnameparm());
        storedProcedureQuery.setParameter(10, returnOperatorByOperatorBasicInformationDataRequest.getProvinceparm());
        storedProcedureQuery.setParameter(11, returnOperatorByOperatorBasicInformationDataRequest.getGovernorateparm());
        storedProcedureQuery.setParameter(12, returnOperatorByOperatorBasicInformationDataRequest.getMunicipalityparm());
        storedProcedureQuery.setParameter(13, returnOperatorByOperatorBasicInformationDataRequest.getTerritoryparm());
        storedProcedureQuery.setParameter(14, returnOperatorByOperatorBasicInformationDataRequest.getStreetparm());
        storedProcedureQuery.setParameter(15, returnOperatorByOperatorBasicInformationDataRequest.getNeighborhoodparm());
        storedProcedureQuery.setParameter(16, returnOperatorByOperatorBasicInformationDataRequest.getEmaiparml());
        storedProcedureQuery.setParameter(17, returnOperatorByOperatorBasicInformationDataRequest.getPoboxparm());
        storedProcedureQuery.setParameter(18, returnOperatorByOperatorBasicInformationDataRequest.getPhonenumberparm());
        storedProcedureQuery.setParameter(19, returnOperatorByOperatorBasicInformationDataRequest.getMobilephonenumberparm());
        storedProcedureQuery.setParameter(20, returnOperatorByOperatorBasicInformationDataRequest.getFaxnumberparm());
        storedProcedureQuery.setParameter(21, returnOperatorByOperatorBasicInformationDataRequest.getLicensepurposeparm());
        storedProcedureQuery.setParameter(22, returnOperatorByOperatorBasicInformationDataRequest.getStatusparm());
        storedProcedureQuery.setParameter(23, returnOperatorByOperatorBasicInformationDataRequest.getFeesstatusparm());


        List<ReturnOperatorByOperatorBasicInformationResponse> result = storedProcedureQuery.getResultList();

        return result ;

    }

    @ApiOperation("Retrieve Operator By General Search ")
    @PostMapping("/find/general")
    public List<ReturnOperatorGeneralSearchResponse> findOperatorByGeneral(@ApiParam(value = "\t") @RequestBody ReturnOperatorGeneralSearchDataRequest returnOperatorGeneralSearchDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnOperatorGeneralSearch");
        storedProcedureQuery.setParameter(1, returnOperatorGeneralSearchDataRequest.getMinoperatoridparm());
        storedProcedureQuery.setParameter(2, returnOperatorGeneralSearchDataRequest.getMaxoperatoridparm());
        storedProcedureQuery.setParameter(3, returnOperatorGeneralSearchDataRequest.getOperatorclassificationparm());
        storedProcedureQuery.setParameter(4, returnOperatorGeneralSearchDataRequest.getOperatorcategoryparm());
        storedProcedureQuery.setParameter(5, returnOperatorGeneralSearchDataRequest.getProvinceparm());
        storedProcedureQuery.setParameter(6, returnOperatorGeneralSearchDataRequest.getGovernorateparm());
        storedProcedureQuery.setParameter(7, returnOperatorGeneralSearchDataRequest.getMunicipalityparm());
        storedProcedureQuery.setParameter(8, returnOperatorGeneralSearchDataRequest.getTerritoryparm());
        storedProcedureQuery.setParameter(9, returnOperatorGeneralSearchDataRequest.getStatusparm());
        storedProcedureQuery.setParameter(10, returnOperatorGeneralSearchDataRequest.getEmployeesnumberparm());
        storedProcedureQuery.setParameter(11, returnOperatorGeneralSearchDataRequest.getDriversnumberparm());
        storedProcedureQuery.setParameter(12, returnOperatorGeneralSearchDataRequest.getWorkingcarsnumberparm());
        storedProcedureQuery.setParameter(13, returnOperatorGeneralSearchDataRequest.getBasiccarsnumberparm());
        storedProcedureQuery.setParameter(14, returnOperatorGeneralSearchDataRequest.getFeesstatusparm());
        storedProcedureQuery.setParameter(15, returnOperatorGeneralSearchDataRequest.getOfficeareaparm());
        storedProcedureQuery.setParameter(16, returnOperatorGeneralSearchDataRequest.getLicensepurposeparm());
        storedProcedureQuery.setParameter(17, returnOperatorGeneralSearchDataRequest.getOperatornationalidparm());
        storedProcedureQuery.setParameter(18, returnOperatorGeneralSearchDataRequest.getOperatornameparm());
        storedProcedureQuery.setParameter(19, returnOperatorGeneralSearchDataRequest.getOperatorcomercialnameparm());
        storedProcedureQuery.setParameter(20, returnOperatorGeneralSearchDataRequest.getOperatorclassificationnameparm());
        storedProcedureQuery.setParameter(21, returnOperatorGeneralSearchDataRequest.getOperatorcategorynameparm());
        storedProcedureQuery.setParameter(22, returnOperatorGeneralSearchDataRequest.getProvincearabicnameparm());
        storedProcedureQuery.setParameter(23, returnOperatorGeneralSearchDataRequest.getGovernoratearabicnameparm());
        storedProcedureQuery.setParameter(24, returnOperatorGeneralSearchDataRequest.getMunicipalityarabicnameparm());
        storedProcedureQuery.setParameter(25, returnOperatorGeneralSearchDataRequest.getTerritoryarabicnameparm());
        storedProcedureQuery.setParameter(26, returnOperatorGeneralSearchDataRequest.getStreetparm());
        storedProcedureQuery.setParameter(27, returnOperatorGeneralSearchDataRequest.getNeighborhoodparm());
        storedProcedureQuery.setParameter(28, returnOperatorGeneralSearchDataRequest.getEmailparm());
        storedProcedureQuery.setParameter(29, returnOperatorGeneralSearchDataRequest.getPoboxparm());
        storedProcedureQuery.setParameter(30, returnOperatorGeneralSearchDataRequest.getPhonenumberparm());
        storedProcedureQuery.setParameter(31, returnOperatorGeneralSearchDataRequest.getMobilephonenumberparm());
        storedProcedureQuery.setParameter(32, returnOperatorGeneralSearchDataRequest.getFaxnumberparm());
        storedProcedureQuery.setParameter(33, returnOperatorGeneralSearchDataRequest.getContractperiodparm());
        storedProcedureQuery.setParameter(34, returnOperatorGeneralSearchDataRequest.getCommercialnamerecordnumberparm());
        storedProcedureQuery.setParameter(35, returnOperatorGeneralSearchDataRequest.getCommercialnameparm());
        storedProcedureQuery.setParameter(36, returnOperatorGeneralSearchDataRequest.getCommercialrecordnumberparm());
        storedProcedureQuery.setParameter(37, returnOperatorGeneralSearchDataRequest.getOfficepropertyownerparm());
        storedProcedureQuery.setParameter(38, returnOperatorGeneralSearchDataRequest.getPlotnoparm());
        storedProcedureQuery.setParameter(39, returnOperatorGeneralSearchDataRequest.getPlotclassificationparm());
        storedProcedureQuery.setParameter(40, returnOperatorGeneralSearchDataRequest.getOfficefloorparm());
        storedProcedureQuery.setParameter(41, returnOperatorGeneralSearchDataRequest.getServicescopeparm());
        storedProcedureQuery.setParameter(42, returnOperatorGeneralSearchDataRequest.getLicensepurposenameparm());
        storedProcedureQuery.setParameter(43, returnOperatorGeneralSearchDataRequest.getRemarksparm());
        storedProcedureQuery.setParameter(44, returnOperatorGeneralSearchDataRequest.getLicenseissuedateparm());
        storedProcedureQuery.setParameter(45, returnOperatorGeneralSearchDataRequest.getDateofcontractsigningparm());
        storedProcedureQuery.setParameter(46, returnOperatorGeneralSearchDataRequest.getLicenseexpiredateparm());
        storedProcedureQuery.setParameter(47, returnOperatorGeneralSearchDataRequest.getOfficeclosingdateparm());
        storedProcedureQuery.setParameter(48, returnOperatorGeneralSearchDataRequest.getCommercialrecorddateparm());
        storedProcedureQuery.setParameter(49, returnOperatorGeneralSearchDataRequest.getPagesize());
        storedProcedureQuery.setParameter(50, returnOperatorGeneralSearchDataRequest.getPageindex());
        storedProcedureQuery.setParameter(51, returnOperatorGeneralSearchDataRequest.getSorttype());
        storedProcedureQuery.setParameter(52, returnOperatorGeneralSearchDataRequest.getSortby());

        List<ReturnOperatorGeneralSearchResponse> result = storedProcedureQuery.getResultList() ;

        return result ;

    }

    @ApiOperation("Retrieve Vehicle Information")
    @PostMapping("/find/vehicle")
    public List<ReturnVehicleInformationResponse> findVehicle(@ApiParam(value = "\t") @RequestBody ReturnVehicleInformationDataRequest returnVehicleInformationDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnVehicleInformation");
        storedProcedureQuery.setParameter(1, returnVehicleInformationDataRequest.getRegistrationnumberparm());
        storedProcedureQuery.setParameter(2, returnVehicleInformationDataRequest.getPlatecodeparm());
        storedProcedureQuery.setParameter(3, returnVehicleInformationDataRequest.getPlatenumberparm());
        storedProcedureQuery.setParameter(4, returnVehicleInformationDataRequest.getManufacturerparm());
        storedProcedureQuery.setParameter(5, returnVehicleInformationDataRequest.getOfficenameparm());
        storedProcedureQuery.setParameter(6, returnVehicleInformationDataRequest.getVehiclestatusparm());
        storedProcedureQuery.setParameter(7, returnVehicleInformationDataRequest.getVehiclecategoryparm());
        storedProcedureQuery.setParameter(8, returnVehicleInformationDataRequest.getFueltypeparm());
        storedProcedureQuery.setParameter(9, returnVehicleInformationDataRequest.getOperatorparm());
        storedProcedureQuery.setParameter(10, returnVehicleInformationDataRequest.getPermitstatusparm());
        storedProcedureQuery.setParameter(11, returnVehicleInformationDataRequest.getPermitidparm());
        storedProcedureQuery.setParameter(12, returnVehicleInformationDataRequest.getVehicleentrydateparm());
        storedProcedureQuery.setParameter(13, returnVehicleInformationDataRequest.getDeliverydateparm());

        List<ReturnVehicleInformationResponse> result = storedProcedureQuery.getResultList();

        return result;

    }

    @ApiOperation("Retrieve Decisions Data ")
    @PostMapping("/find/decision")
    public List<ReturnDecisionResponse> getDecision(@ApiParam("\t") @RequestBody ReturnDecisionDataRequest returnDecisionDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnDecision");
        storedProcedureQuery.setParameter(1 , returnDecisionDataRequest.getDecisionsidparm());
        storedProcedureQuery.setParameter(2, returnDecisionDataRequest.getDecisionssourceparm());
        storedProcedureQuery.setParameter(3, returnDecisionDataRequest.getVehicleparm());
        storedProcedureQuery.setParameter(4, returnDecisionDataRequest.getPlatecodeparm());
        storedProcedureQuery.setParameter(5, returnDecisionDataRequest.getPlatenumberparm());
        storedProcedureQuery.setParameter(6, returnDecisionDataRequest.getDecisionsreferenceparm());
        storedProcedureQuery.setParameter(7, returnDecisionDataRequest.getDecisionsreferencedateparm());
        storedProcedureQuery.setParameter(8, returnDecisionDataRequest.getDecisionsreferencesubjectparm());
        storedProcedureQuery.setParameter(9, returnDecisionDataRequest.getGovernorateparm());
        storedProcedureQuery.setParameter(10, returnDecisionDataRequest.getGovernoratearabicnameparm());
        storedProcedureQuery.setParameter(11, returnDecisionDataRequest.getDecisionstextparm());
        storedProcedureQuery.setParameter(12, returnDecisionDataRequest.getDecisionstermparm());
        storedProcedureQuery.setParameter(13, returnDecisionDataRequest.getDecisionstermdateparm());
        storedProcedureQuery.setParameter(14, returnDecisionDataRequest.getDecisionstermnumberparm());

        List<ReturnDecisionResponse> result = storedProcedureQuery.getResultList();

        return result ;
    }

    @ApiOperation("Retrieve Branch Operator ")
    @PostMapping("/find/branch")
    public List<ReturnOperatorBranchResponse> getOperatorBranch(@ApiParam("\t") @RequestBody ReturnOperatorBranchDataRequest returnOperatorBranchDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnOperatorBranch");
        storedProcedureQuery.setParameter(1, returnOperatorBranchDataRequest.getMinoperatorbranchidparm());
        storedProcedureQuery.setParameter(2, returnOperatorBranchDataRequest.getMaxoperatorbranchidparm());
        storedProcedureQuery.setParameter(3, returnOperatorBranchDataRequest.getMinoperatoridparm());
        storedProcedureQuery.setParameter(4, returnOperatorBranchDataRequest.getMaxoperatoridparm());
        storedProcedureQuery.setParameter(5, returnOperatorBranchDataRequest.getOperatornameparm());
        storedProcedureQuery.setParameter(6, returnOperatorBranchDataRequest.getProvinceparm());
        storedProcedureQuery.setParameter(7, returnOperatorBranchDataRequest.getProvincearabicnameparm());
        storedProcedureQuery.setParameter(8, returnOperatorBranchDataRequest.getGovernorateparm());
        storedProcedureQuery.setParameter(9, returnOperatorBranchDataRequest.getGovernoratearabicnameparm());
        storedProcedureQuery.setParameter(10, returnOperatorBranchDataRequest.getMunicipalityparm());
        storedProcedureQuery.setParameter(11, returnOperatorBranchDataRequest.getMunicipalityarabicnameparm());
        storedProcedureQuery.setParameter(12, returnOperatorBranchDataRequest.getTerritoryparm());
        storedProcedureQuery.setParameter(13, returnOperatorBranchDataRequest.getTerritoryarabicnameparm());
        storedProcedureQuery.setParameter(14, returnOperatorBranchDataRequest.getNeighborhoodparm());
        storedProcedureQuery.setParameter(15, returnOperatorBranchDataRequest.getStreetparm());
        storedProcedureQuery.setParameter(16, returnOperatorBranchDataRequest.getBasinparm());
        storedProcedureQuery.setParameter(17, returnOperatorBranchDataRequest.getPlotnoparm());
        storedProcedureQuery.setParameter(18, returnOperatorBranchDataRequest.getPoboxparm());
        storedProcedureQuery.setParameter(19, returnOperatorBranchDataRequest.getTelephoneparm());
        storedProcedureQuery.setParameter(20, returnOperatorBranchDataRequest.getFaxparm());
        storedProcedureQuery.setParameter(21, returnOperatorBranchDataRequest.getMobilephoneparm());
        storedProcedureQuery.setParameter(22, returnOperatorBranchDataRequest.getEmailparm());
        storedProcedureQuery.setParameter(23, returnOperatorBranchDataRequest.getAggreementreferencenumberparm());
        storedProcedureQuery.setParameter(24, returnOperatorBranchDataRequest.getAggreementreferencedateparm());
        storedProcedureQuery.setParameter(25, returnOperatorBranchDataRequest.getMinvehiclecountparm());
        storedProcedureQuery.setParameter(26, returnOperatorBranchDataRequest.getMaxvehiclecountparm());
        storedProcedureQuery.setParameter(27, returnOperatorBranchDataRequest.getBranchnameparm());
        storedProcedureQuery.setParameter(28, returnOperatorBranchDataRequest.getStatusparm());
        storedProcedureQuery.setParameter(29, returnOperatorBranchDataRequest.getPagesize());
        storedProcedureQuery.setParameter(30, returnOperatorBranchDataRequest.getPageindex());
        storedProcedureQuery.setParameter(31, returnOperatorBranchDataRequest.getSorttype());
        storedProcedureQuery.setParameter(32, returnOperatorBranchDataRequest.getSortby());

        List<ReturnOperatorBranchResponse> result = storedProcedureQuery.getResultList();

        return result ;
    }

    @ApiOperation("Retrieve Vehicle By General Search ")
    @PostMapping("/find/vehicle-general")
    public List<ReturnVehicleGeneralSearchResponse> getVehicleGeneralSearch(@ApiParam("\t") @RequestBody ReturnVehicleGeneralSearchDataRequest returnVehicleGeneralSearchDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnVehicleGeneralSearch");
        storedProcedureQuery.setParameter(1, returnVehicleGeneralSearchDataRequest.getMinvehicleidparm());
        storedProcedureQuery.setParameter(2, returnVehicleGeneralSearchDataRequest.getMaxvehicleidparm());
        storedProcedureQuery.setParameter(3, returnVehicleGeneralSearchDataRequest.getRegistrationnumberparm());
        storedProcedureQuery.setParameter(4, returnVehicleGeneralSearchDataRequest.getPlatenumberparm());
        storedProcedureQuery.setParameter(5, returnVehicleGeneralSearchDataRequest.getVehiclecategoryparm());
        storedProcedureQuery.setParameter(6, returnVehicleGeneralSearchDataRequest.getVehiclecategorynameparm());
        storedProcedureQuery.setParameter(7, returnVehicleGeneralSearchDataRequest.getOperationparm());
        storedProcedureQuery.setParameter(8, returnVehicleGeneralSearchDataRequest.getStatusparm());
        storedProcedureQuery.setParameter(9, returnVehicleGeneralSearchDataRequest.getRemarksparm());
        storedProcedureQuery.setParameter(10, returnVehicleGeneralSearchDataRequest.getYearofmanufactureparm());
        storedProcedureQuery.setParameter(11, returnVehicleGeneralSearchDataRequest.getPassengersnumberparm());
        storedProcedureQuery.setParameter(12, returnVehicleGeneralSearchDataRequest.getManufacturerparm());
        storedProcedureQuery.setParameter(13, returnVehicleGeneralSearchDataRequest.getOwnernameparm());
        storedProcedureQuery.setParameter(14, returnVehicleGeneralSearchDataRequest.getLicenseexpirationparm());
        storedProcedureQuery.setParameter(15, returnVehicleGeneralSearchDataRequest.getAddtionaldescriptionsparm());
        storedProcedureQuery.setParameter(16, returnVehicleGeneralSearchDataRequest.getPlatecodeparm());
        storedProcedureQuery.setParameter(17, returnVehicleGeneralSearchDataRequest.getFeesstatusparm());
        storedProcedureQuery.setParameter(18, returnVehicleGeneralSearchDataRequest.getOfficeidparm());
        storedProcedureQuery.setParameter(19, returnVehicleGeneralSearchDataRequest.getOfficenameparm());
        storedProcedureQuery.setParameter(20, returnVehicleGeneralSearchDataRequest.getFueltypeparm());
        storedProcedureQuery.setParameter(21, returnVehicleGeneralSearchDataRequest.getFueltypenameparm());
        storedProcedureQuery.setParameter(22 ,returnVehicleGeneralSearchDataRequest.getVehicleentrydateparm());
        storedProcedureQuery.setParameter(23, returnVehicleGeneralSearchDataRequest.getOwnerparm());
        storedProcedureQuery.setParameter(24, returnVehicleGeneralSearchDataRequest.getOperatorparm());
        storedProcedureQuery.setParameter(25, returnVehicleGeneralSearchDataRequest.getVehiclepermitparm());
        storedProcedureQuery.setParameter(26, returnVehicleGeneralSearchDataRequest.getOperatornameparm());
        storedProcedureQuery.setParameter(27, returnVehicleGeneralSearchDataRequest.getPagesize());
        storedProcedureQuery.setParameter(28, returnVehicleGeneralSearchDataRequest.getPageindex());
        storedProcedureQuery.setParameter(29, returnVehicleGeneralSearchDataRequest.getSorttype());
        storedProcedureQuery.setParameter(30, returnVehicleGeneralSearchDataRequest.getSortby());

        List<ReturnVehicleGeneralSearchResponse> result = storedProcedureQuery.getResultList();

        return result ;

    }

    @ApiOperation("Retrieve Operator Office Information ")
    @PostMapping("/find/office")
    public List<ReturnOperatorOfficeInformationResponse> getOperatorOfficeInformation(@ApiParam("\t") @RequestBody ReturnOperatorOfficeInformationDataRequest returnOperatorOfficeInformationDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnOperatorOfficeInformation");
        storedProcedureQuery.setParameter(1, returnOperatorOfficeInformationDataRequest.getCertificateregistrationnumberparm());
        storedProcedureQuery.setParameter(2, returnOperatorOfficeInformationDataRequest.getCommercialrecordnumberparm());
        storedProcedureQuery.setParameter(3, returnOperatorOfficeInformationDataRequest.getCommercialnamerecordnumberparm());
        storedProcedureQuery.setParameter(4, returnOperatorOfficeInformationDataRequest.getMinemployeesnumberparm());
        storedProcedureQuery.setParameter(5, returnOperatorOfficeInformationDataRequest.getMaxemployeesnumberparm());
        storedProcedureQuery.setParameter(6, returnOperatorOfficeInformationDataRequest.getMindriversnumberparm());
        storedProcedureQuery.setParameter(7, returnOperatorOfficeInformationDataRequest.getMaxdriversnumberparm());
        storedProcedureQuery.setParameter(8, returnOperatorOfficeInformationDataRequest.getMinbasiccarsnumberparm());
        storedProcedureQuery.setParameter(9, returnOperatorOfficeInformationDataRequest.getMaxbasiccarsnumberparm());
        storedProcedureQuery.setParameter(10, returnOperatorOfficeInformationDataRequest.getMinworkingcarsnumberparm());
        storedProcedureQuery.setParameter(11, returnOperatorOfficeInformationDataRequest.getMaxworkingcarsnumberparm());
        storedProcedureQuery.setParameter(12, returnOperatorOfficeInformationDataRequest.getServicescopeparm());
        storedProcedureQuery.setParameter(13, returnOperatorOfficeInformationDataRequest.getOfficeclosingdateparm());


        List<ReturnOperatorOfficeInformationResponse> result = storedProcedureQuery.getResultList();

        return result ;
    }

    @ApiOperation("Retrieve Operator By Vehicle Information ")
    @PostMapping("/find/by-vehicle")
    public List<ReturnOperatorByVehicleInformationResponse> getOperatorByVehicleInformation(@ApiParam("\t") @RequestBody ReturnOperatorByVehicleInformationDataRequest returnOperatorByVehicleInformationDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnOperatorByVehicleInformation");
        storedProcedureQuery.setParameter(1, returnOperatorByVehicleInformationDataRequest.getRegistrationnumberparm());
        storedProcedureQuery.setParameter(2, returnOperatorByVehicleInformationDataRequest.getPermitstatusparm());
        storedProcedureQuery.setParameter(3, returnOperatorByVehicleInformationDataRequest.getPlatecodeparm());
        storedProcedureQuery.setParameter(4, returnOperatorByVehicleInformationDataRequest.getPlatenumberparm());
        storedProcedureQuery.setParameter(5, returnOperatorByVehicleInformationDataRequest.getMindeliverydateparm());
        storedProcedureQuery.setParameter(6, returnOperatorByVehicleInformationDataRequest.getMaxdeliverydateparm());
        storedProcedureQuery.setParameter(7, returnOperatorByVehicleInformationDataRequest.getVehiclecategoryparm());
        storedProcedureQuery.setParameter(8, returnOperatorByVehicleInformationDataRequest.getManufacturerparm());
        storedProcedureQuery.setParameter(9, returnOperatorByVehicleInformationDataRequest.getStatusparm());
        storedProcedureQuery.setParameter(10, returnOperatorByVehicleInformationDataRequest.getFeesstatusparm());
        storedProcedureQuery.setParameter(11, returnOperatorByVehicleInformationDataRequest.getUsagepurposeparm());
        storedProcedureQuery.setParameter(12, returnOperatorByVehicleInformationDataRequest.getMinlicenseexpirationparm());
        storedProcedureQuery.setParameter(13, returnOperatorByVehicleInformationDataRequest.getMaxlicenseexpirationparm());
        storedProcedureQuery.setParameter(14, returnOperatorByVehicleInformationDataRequest.getMinyearofmanufactureparm());
        storedProcedureQuery.setParameter(15, returnOperatorByVehicleInformationDataRequest.getMaxyearofmanufactureparm());
        storedProcedureQuery.setParameter(16, returnOperatorByVehicleInformationDataRequest.getMinpassengersnumberparm());
        storedProcedureQuery.setParameter(17, returnOperatorByVehicleInformationDataRequest.getMaxpassengersnumberparm());
        storedProcedureQuery.setParameter(18, returnOperatorByVehicleInformationDataRequest.getOwnerparm());
        storedProcedureQuery.setParameter(19, returnOperatorByVehicleInformationDataRequest.getOwnernameparm());
        storedProcedureQuery.setParameter(20, returnOperatorByVehicleInformationDataRequest.getFueltypeparm());
        storedProcedureQuery.setParameter(21, returnOperatorByVehicleInformationDataRequest.getAddtionaldescriptionsparm());
        storedProcedureQuery.setParameter(22, returnOperatorByVehicleInformationDataRequest.getPagesize());
        storedProcedureQuery.setParameter(23, returnOperatorByVehicleInformationDataRequest.getPageindex());
        storedProcedureQuery.setParameter(24, returnOperatorByVehicleInformationDataRequest.getSorttype());
        storedProcedureQuery.setParameter(25, returnOperatorByVehicleInformationDataRequest.getSortby());


        List<ReturnOperatorByVehicleInformationResponse> result = storedProcedureQuery.getResultList();

        return result;

    }

    @ApiOperation("Retrieve Vehicle Route Date ")
    @PostMapping("/find/vehicle-route")
    public List<ReturnVehicleRouteResponse> getVehicleRoute(@ApiParam("'t") @RequestBody ReturnVehicleRouteDataRequest returnVehicleRouteDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnVehicleRoute");
        storedProcedureQuery.setParameter(1, returnVehicleRouteDataRequest.getVehiclerouteidparm());
        storedProcedureQuery.setParameter(2, returnVehicleRouteDataRequest.getVehicleidparm());
        storedProcedureQuery.setParameter(3, returnVehicleRouteDataRequest.getRegistrationnumberparm());
        storedProcedureQuery.setParameter(4, returnVehicleRouteDataRequest.getRouteidparm());
        storedProcedureQuery.setParameter(5, returnVehicleRouteDataRequest.getRoutenameparm());

        List<ReturnVehicleRouteResponse> result = storedProcedureQuery.getResultList();

        return result ;
    }

    @ApiOperation("Retrieve Operator Category Date ")
    @PostMapping("/find/category")
    public List<ReturnOperatorCategoryDTO> getOperatorCategory(@ApiParam("\t") @RequestBody ReturnOperatorCategoryDataRequest returnOperatorCategoryDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnOperatorCategory");
        storedProcedureQuery.setParameter(1, returnOperatorCategoryDataRequest.getOperatorcategoryidparm());
        storedProcedureQuery.setParameter(2, returnOperatorCategoryDataRequest.getOperatorcategorynameparm());
        storedProcedureQuery.setParameter(3, returnOperatorCategoryDataRequest.getOperatorcategoryenglishnameparm());
        storedProcedureQuery.setParameter(4, returnOperatorCategoryDataRequest.getOperatorcategoryclassificationparm());
        storedProcedureQuery.setParameter(5, returnOperatorCategoryDataRequest.getOperatorclassificationnameparm());
        storedProcedureQuery.setParameter(6, returnOperatorCategoryDataRequest.getOperatorcategorydepartmentparm());
        storedProcedureQuery.setParameter(7, returnOperatorCategoryDataRequest.getServicedepartmentnameparm());
        storedProcedureQuery.setParameter(8, returnOperatorCategoryDataRequest.getVehiclecategoryparm());
        storedProcedureQuery.setParameter(9, returnOperatorCategoryDataRequest.getVehiclecategorynameparm());
        storedProcedureQuery.setParameter(10, returnOperatorCategoryDataRequest.getPlateclassificationparm());
        storedProcedureQuery.setParameter(11, returnOperatorCategoryDataRequest.getPlateclassificationnameparm());
        storedProcedureQuery.setParameter(12, returnOperatorCategoryDataRequest.getLinetypeparm());
        storedProcedureQuery.setParameter(13, returnOperatorCategoryDataRequest.getLinetypenameparm());
        storedProcedureQuery.setParameter(14, returnOperatorCategoryDataRequest.getPagesize());
        storedProcedureQuery.setParameter(15, returnOperatorCategoryDataRequest.getPageindex());
        storedProcedureQuery.setParameter(16, returnOperatorCategoryDataRequest.getSorttype());
        storedProcedureQuery.setParameter(17, returnOperatorCategoryDataRequest.getSortby());

        List<ReturnOperatorCategoryResponse> resultCategory = storedProcedureQuery.getResultList();

        List<ReturnOperatorCategoryDTO> returnOperatorCategoryDTOList = new ArrayList<>();

        resultCategory.forEach( result -> {
            ReturnOperatorCategoryDTO returnOperatorCategoryDTO = new ReturnOperatorCategoryDTO();
            BeanUtils.copyProperties(result, returnOperatorCategoryDTO);

            ReturnOperatorCategoryFieldSettingDataRequest request = new ReturnOperatorCategoryFieldSettingDataRequest();
            request.setOperatorcategoryidparm(result.getOperatorcategoryid());

            returnOperatorCategoryDTO.setField(getOperatorCategoryFieldSetting(request));
            returnOperatorCategoryDTOList.add(returnOperatorCategoryDTO);
        } );

        return returnOperatorCategoryDTOList ;

    }

    @ApiOperation("Retrieve Operator Category Field ")
    @PostMapping("/find/category-field")
    public List<ReturnOperatorCategoryFieldResponse> getOperatorCategoryField(@ApiParam("\t") @RequestBody ReturnOperatorCategoryFieldDataRequest returnOperatorCategoryFieldDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnOperatorCategoryField");
        storedProcedureQuery.setParameter(1, returnOperatorCategoryFieldDataRequest.getOperatorfieldidparm());
        storedProcedureQuery.setParameter(2, returnOperatorCategoryFieldDataRequest.getOperatorfieldnameparm());
        storedProcedureQuery.setParameter(3, returnOperatorCategoryFieldDataRequest.getOperatorfieldsectionparm());

        List<ReturnOperatorCategoryFieldResponse> result = storedProcedureQuery.getResultList();

        return  result ;
    }

    @ApiOperation("Retrieve Operator Category Field Setting ")
    @PostMapping("/find/category-field/setting")
    public List<ReturnOperatorCategoryFieldSettingResponse> getOperatorCategoryFieldSetting(@ApiParam("\t") @RequestBody ReturnOperatorCategoryFieldSettingDataRequest returnOperatorCategoryFieldSettingDataRequest ){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnOperatorCategoryFieldSetting");
        storedProcedureQuery.setParameter(1, returnOperatorCategoryFieldSettingDataRequest.getOperatorcategroryfieldsettingidparm());
        storedProcedureQuery.setParameter(2, returnOperatorCategoryFieldSettingDataRequest.getOperatorcategoryidparm());
        storedProcedureQuery.setParameter(3, returnOperatorCategoryFieldSettingDataRequest.getOperatorcategorynameparm());
        storedProcedureQuery.setParameter(4, returnOperatorCategoryFieldSettingDataRequest.getOperatorfieldparm());
        storedProcedureQuery.setParameter(5, returnOperatorCategoryFieldSettingDataRequest.getOperatorfieldnameparm());
        storedProcedureQuery.setParameter(6, returnOperatorCategoryFieldSettingDataRequest.getOperatorfieldsectionparm());
        storedProcedureQuery.setParameter(7, returnOperatorCategoryFieldSettingDataRequest.getRequiredparm());
        storedProcedureQuery.setParameter(8, returnOperatorCategoryFieldSettingDataRequest.getVisibleparm());
        storedProcedureQuery.setParameter(9, returnOperatorCategoryFieldSettingDataRequest.getActiveparm());


        List<ReturnOperatorCategoryFieldSettingResponse> result = storedProcedureQuery.getResultList();

        return result ;

    }

    @ApiOperation("Retrieve Cars Count By Operator ID")
    @GetMapping("/{id}/cars")
    public Object getCarsCountByOperatorID(@ApiParam("Operator ID") @PathVariable(value = "id") long id){

        Query nativeQuery = entityManager.createNativeQuery("SELECT sum(carcount) from  public.\"ReturnCarsCount\"(operatoridparm   =>" + id + ")");

        return nativeQuery.getSingleResult();
    }

    @ApiOperation("Retrieve Cars Count By Owner National ID")
    @GetMapping("/owner/{id}/cars")
    public Object getCarsCountByOwnerNationalID(@ApiParam("Owner National ID") @PathVariable(value = "id") String id) {

        Query nativeQuery = entityManager.createNativeQuery("SELECT sum(carcount) from  public.\"ReturnCarsCount\"(ownernationalidparm   =>'" + id + "')");

        return nativeQuery.getSingleResult();
    }
    //  End Retrieve Methods
}
