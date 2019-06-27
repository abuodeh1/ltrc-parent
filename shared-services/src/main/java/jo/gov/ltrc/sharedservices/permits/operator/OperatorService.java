package jo.gov.ltrc.sharedservices.permits.operator;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

import javax.persistence.*;

@ApiResponses(value = {

        @ApiResponse(code = 500, message = "Exception thrown if the response does not match the mapping or data type : " +
                "Error extracting results.\n" +
                "Exception thrown if the the data base function does not exist or" +
                " if the data base function does not match between request and response classes : Database function doesn't exist.\n")
})


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(value = "/api/operator")
public class OperatorService {


    @PersistenceContext
    private EntityManager entityManager;


    @PostMapping("/operator-branch")
    public String addOperatorBranch(@RequestBody SaveOperatorBranchDataRequest saveOperatorBranchDataRequest){

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

        return (String) storedProcedureQuery.getSingleResult();

    }

    @PostMapping
    public String addOperator(@RequestBody SaveOperatorDataRequest saveOperatorDataRequest){

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveOperatorData");
        storedProcedureQuery.setParameter(1, saveOperatorDataRequest.getOperatoridparm());
        storedProcedureQuery.setParameter(2, saveOperatorDataRequest.getOperatornationalidparm());
        storedProcedureQuery.setParameter(3, saveOperatorDataRequest.getOperatornameparm());
        storedProcedureQuery.setParameter(4, saveOperatorDataRequest.getOperatorcomercialnameparm());
        storedProcedureQuery.setParameter(5, saveOperatorDataRequest.getOperatorclassificationparm());
        storedProcedureQuery.setParameter(6, saveOperatorDataRequest.getOperatorcategoryparm());
        storedProcedureQuery.setParameter(7, saveOperatorDataRequest.getProvinceparm());
        storedProcedureQuery.setParameter(8, saveOperatorDataRequest.getGovernorateparm());
        storedProcedureQuery.setParameter(9, saveOperatorDataRequest.getMunicipalityparm());
        storedProcedureQuery.setParameter(10, saveOperatorDataRequest.getTerritoryparm());
        storedProcedureQuery.setParameter(11, saveOperatorDataRequest.getStreetparm());
        storedProcedureQuery.setParameter(12, saveOperatorDataRequest.getNeighborhoodparm());
        storedProcedureQuery.setParameter(13, saveOperatorDataRequest.getEmailparm());
        storedProcedureQuery.setParameter(14, saveOperatorDataRequest.getPoboxparm());
        storedProcedureQuery.setParameter(15, saveOperatorDataRequest.getPhonenumberparm());
        storedProcedureQuery.setParameter(16, saveOperatorDataRequest.getMobilephonenumbrparm());
        storedProcedureQuery.setParameter(17, saveOperatorDataRequest.getFaxnumberparm());
        storedProcedureQuery.setParameter(18, saveOperatorDataRequest.getLicensepurposeparm());
        storedProcedureQuery.setParameter(19, saveOperatorDataRequest.getStatusparm());
        storedProcedureQuery.setParameter(20, saveOperatorDataRequest.getOfficepropertyownerparm());
        storedProcedureQuery.setParameter(21, saveOperatorDataRequest.getPlotnoparm());
        storedProcedureQuery.setParameter(22, saveOperatorDataRequest.getPlotclassificationparm());
        storedProcedureQuery.setParameter(23, saveOperatorDataRequest.getOfficeareaparm());
        storedProcedureQuery.setParameter(24, saveOperatorDataRequest.getOfficefloorparm());
        storedProcedureQuery.setParameter(25, saveOperatorDataRequest.getServicescopeparm());
        storedProcedureQuery.setParameter(26, saveOperatorDataRequest.getDateofcontractsigningparm());
        storedProcedureQuery.setParameter(27, saveOperatorDataRequest.getContractperiodparm());
        storedProcedureQuery.setParameter(28, saveOperatorDataRequest.getCommercialnamerecordnumberparm());
        storedProcedureQuery.setParameter(29, saveOperatorDataRequest.getCommercialnameparm());
        storedProcedureQuery.setParameter(30, saveOperatorDataRequest.getCommercialrecordnumberparm());
        storedProcedureQuery.setParameter(31, saveOperatorDataRequest.getCommercialrecorddateparm());
        storedProcedureQuery.setParameter(32, saveOperatorDataRequest.getEmployeesnumberparm());
        storedProcedureQuery.setParameter(33, saveOperatorDataRequest.getDriversnumberparm());
        storedProcedureQuery.setParameter(34, saveOperatorDataRequest.getWorkingcarsnumberparm());
        storedProcedureQuery.setParameter(35, saveOperatorDataRequest.getBasiccarsnumberparm());
        storedProcedureQuery.setParameter(36, saveOperatorDataRequest.getOfficeclosingdateparm());
        storedProcedureQuery.setParameter(37, saveOperatorDataRequest.getRemarksparm());

        return (String) storedProcedureQuery.getSingleResult();

    }

    @PostMapping("/decision")
    public String addDecision(@RequestBody SaveDecisionDataRequest saveDecisionDataRequest){

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

        return (String) storedProcedureQuery.getSingleResult();
    }
}
