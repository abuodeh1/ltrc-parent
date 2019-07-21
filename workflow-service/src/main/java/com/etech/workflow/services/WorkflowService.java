package com.etech.workflow.services;

import com.etech.workflow.services.SaveServiceRequestDataRequest;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(value = "/api")
public class WorkflowService {

    @PersistenceContext
    private EntityManager entityManager;

    @PostMapping("/workflow")
    public String saveServiceRequestData(@RequestBody SaveServiceRequestDataRequest saveServiceRequestDataRequest) {

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("SaveServiceRequestDataRequest");
        storedProcedureQuery.setParameter(1, saveServiceRequestDataRequest.getServicerequestidparm());
        storedProcedureQuery.setParameter(2, saveServiceRequestDataRequest.getServicetypeparm());
        storedProcedureQuery.setParameter(3, saveServiceRequestDataRequest.getRequestedbyparm());
        storedProcedureQuery.setParameter(4, saveServiceRequestDataRequest.getRequestdateparm());
        storedProcedureQuery.setParameter(5, saveServiceRequestDataRequest.getApplicantphonenumberparm());
        storedProcedureQuery.setParameter(6, saveServiceRequestDataRequest.getApplicantemailparm());
        storedProcedureQuery.setParameter(7, saveServiceRequestDataRequest.getProvinceparm());
        storedProcedureQuery.setParameter(8, saveServiceRequestDataRequest.getGovernorateparm());
        storedProcedureQuery.setParameter(9, saveServiceRequestDataRequest.getMunicipalityparm());
        storedProcedureQuery.setParameter(10, saveServiceRequestDataRequest.getTerritoryparm());
        storedProcedureQuery.setParameter(11, saveServiceRequestDataRequest.getStatusparm());
        storedProcedureQuery.setParameter(12, saveServiceRequestDataRequest.getPrincepal());

        return (String) storedProcedureQuery.getSingleResult();
    }

    @GetMapping("/workflow")
    public List<ReturnServiceRequestResponse> returnServiceRequestData(@RequestBody ReturnServiceRequestRequest returnServiceRequestRequest) {

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("ReturnServiceRequest");
        storedProcedureQuery.setParameter(1, returnServiceRequestRequest.getMinServiceRequestIDParm());
        storedProcedureQuery.setParameter(2, returnServiceRequestRequest.getMaxServiceRequestIDParm());
        storedProcedureQuery.setParameter(3, returnServiceRequestRequest.getServiceTypeParm());
        storedProcedureQuery.setParameter(4, returnServiceRequestRequest.getRequestedByParm());
        storedProcedureQuery.setParameter(5, returnServiceRequestRequest.getMinRequestDateParm());
        storedProcedureQuery.setParameter(6, returnServiceRequestRequest.getMaxRequestDateParm());
        storedProcedureQuery.setParameter(7, returnServiceRequestRequest.getApplicantEmailParm());
        storedProcedureQuery.setParameter(8, returnServiceRequestRequest.getApplicantEmailParm());
        storedProcedureQuery.setParameter(9, returnServiceRequestRequest.getProvinceParm());
        storedProcedureQuery.setParameter(10, returnServiceRequestRequest.getGovernorateParm());
        storedProcedureQuery.setParameter(11, returnServiceRequestRequest.getMunicipalityParm());
        storedProcedureQuery.setParameter(12, returnServiceRequestRequest.getTerritoryParm());
        storedProcedureQuery.setParameter(13, returnServiceRequestRequest.getStatusParm());
        storedProcedureQuery.setParameter(14, returnServiceRequestRequest.getMinCreatedDateParm());
        storedProcedureQuery.setParameter(15, returnServiceRequestRequest.getMaxCreatedDateParm());
        storedProcedureQuery.setParameter(16, returnServiceRequestRequest.getMinModifiedDateParm());
        storedProcedureQuery.setParameter(17, returnServiceRequestRequest.getCreatedByParm());
        storedProcedureQuery.setParameter(18, returnServiceRequestRequest.getModifiedByParm());

        List<ReturnServiceRequestResponse> result = storedProcedureQuery.getResultList();

        return result;
    }

}
