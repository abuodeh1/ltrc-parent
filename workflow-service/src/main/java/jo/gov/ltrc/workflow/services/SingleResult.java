package jo.gov.ltrc.workflow.services;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@NamedStoredProcedureQueries({
       
        @NamedStoredProcedureQuery(
                name = "SaveServiceRequestDataRequest",
                procedureName = "\"SaveServiceRequestData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = ""),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = ""),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = ""),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = ""),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = ""),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = ""),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = ""),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = ""),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = ""),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = ""),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = ""),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = ""),
                }
        ),

        @NamedStoredProcedureQuery(
                name = "SaveApplicationTrnsfrOnrShpStrctrzData",
                procedureName = "\"SaveApplicationTrnsfrOnrShpStrctrzData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "applicationtrnsfronrshpstrctrzidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "_1stoperatoridparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "_1stoperatornameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "phonenumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "emailparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "_2ndoperatoridparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "_2ndoperatornameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "vehicleidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "newownernationalidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "newownernameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "headofservicedpartmentexplanationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "headofservicedpartmentdecisionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "directordirectoratepassengertransportexplanationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "directordirectoratepassengertransportdecisionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ipaddressparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "servicedpartmentparm"),


                }

        ),

        @NamedStoredProcedureQuery(
                name = "SaveApplicationBusRentingOfficeLicenseData",
                procedureName = "\"SaveApplicationBusRentingOfficeLicenseData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "applicationbusrentalofficelicenseidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "applicantnationalidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "applicantnameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "phonenumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "emailparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "provinceparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "governorateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "municipalityparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "territoryparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "technicalfinancialstudyparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "evaluationcommitteeexplanationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "evaluationcommitteedecisionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "generaldirectorexplanationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "generaldirectordecisionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "disclosurecommitteeexplanationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "disclosurecommitteedecisionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ipaddress"),

                }

        ),

        @NamedStoredProcedureQuery(
                name = "SaveApplicationBusRentingCompanyeLicenseData",
                procedureName = "\"SaveApplicationBusRentingCompanyeLicenseData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "applicationbusrentalofficelicenseidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "applicantnationalidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "applicantnameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "phonenumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "emailparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "provinceparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "governorateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "municipalityparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "territoryparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "technicalfinancialstudyparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "evaluationcommitteeexplanationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "evaluationcommitteedecisionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "generaldirectorexplanationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "generaldirectordecisionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "disclosurecommitteeexplanationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "disclosurecommitteedecisionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ipaddress"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatoridparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "servicedepartmentparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "subclassparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "issuestatusparm"),

                }

        ),

        @NamedStoredProcedureQuery(
                name = "SaveApplicationCncltnRplcmntData",
                procedureName = "\"SaveApplicationCncltnRplcmntData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "applicationcncltnrplcmntidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatoridparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "operatornameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "operatornationalidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "phonenumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "emailparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "vehicleidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "commercialrecordparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "dvldexplanationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "headofservicedepartmentexplanationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "headofservicedepartmentdecisionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "directordirectoratepassengertransportexplanationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "directordirectoratepassengertransportdecisionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ipaddressparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "servicedepartmentparm"),


                }

        ),

        @NamedStoredProcedureQuery(
                name = "SaveApplicationOfficeCompanyOwnershipTransferData",
                procedureName = "\"SaveApplicationOfficeCompanyOwnershipTransferData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "applicationofficecompanyownershiptransferidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "_1stoperatoridparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "_1stoperatornameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "phonenumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "emailparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "_2ndoperatoridparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "_2ndoperatornameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "newownernationalidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class,name = "newownernameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class,name = "commercialrecordparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class,name = "financialcommitmentparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "rentingcontractparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "siteownershipparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "headofservicedpartmentexplanationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "headofservicedpartmentdecisionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "directordirectorateexplanationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "directordirectoratedecisionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ipaddressparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "servicedpartmentparm"),


                }

        ),

        @NamedStoredProcedureQuery(
                name = "SaveApplicationParkingLotSiteTransferData",
                procedureName = "\"SaveApplicationParkingLotSiteTransferData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "applicationparkinglotsitetransferidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatoridparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "operatornameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "phonenumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "emailparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "oldsiteprovinceparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "oldsitegovernorateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "oldsitemunicipalityparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "oldsiteterritoryparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "newsiteprovinceparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "newsitegovernorateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "newsitemunicipalityparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "newsiteterritoryparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "newownernationalidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "newownernameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "financialcommitmentparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "rentingcontractparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "siteownershipparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "headofservicedepartmentexplanationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "headofservicedepartmentdecisionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "disclosurecommitteeexplanationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "disclosurecommitteedecisionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ipaddressparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "servicedpartmentparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "operatornationalidparm"),

                }

        ),

        @NamedStoredProcedureQuery(
                name = "SaveApplicationVehiclesOwnershipTransferData",
                procedureName = "\"SaveApplicationVehiclesOwnershipTransferData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "applicationvehiclesownershiptransferidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "_1stoperatoridparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "_1stoperatornameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "phonenumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "emailparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "_2ndoperatoridparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "_2ndoperatornameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "vehicleidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class,name = "newownernationalidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class,name = "newownernameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class,name = "headofservicedpartmentexplanationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "headofservicedpartmentdecisionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "directordirectoratepassengertransportexplanationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "directordirectoratepassengertransportdecisionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ipaddressparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "servicedpartmentparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "financialcommitmentparm"),

                }

        ),

        @NamedStoredProcedureQuery(
                name = "SaveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDat",
                procedureName = "\"SaveApplicationRenewPublicTransportPermitsOrTemporaryPermitsDat\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "applicationrenewpublictransportpermitsortemporarypermitsidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "permitclassparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatoridparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "operatornameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "nationalidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "phonenumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "vehicleidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "emailparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "financialcommitmentparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "attachmentpathparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "attachmentreferenceparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "dvldexplanationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "governorateofficeexpalnationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "decisionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "servicedepartmentparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ipaddressparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "issuestatusparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "routeidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "startpontparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "endpointparm"),

                }

        ),

        @NamedStoredProcedureQuery(
                name = "SaveApplicationLicensingServiceofLuxuryCarAndInternationalCarri",
                procedureName = "\"SaveApplicationLicensingServiceofLuxuryCarAndInternationalCarri\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "applicationlicensingserviceofluxurycarandinternationalcarrierid"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "applicantnationalidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "applicantnameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "phonenumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "emailparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "provinceparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "governorateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "studyreferenceparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "evaluationcommitteeexplanationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "evaluationcommitteedecisionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "generaldirectorexplanationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "generaldirectordecisionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "initialapprovalreferenceforsitedetectionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "initialapprovalapplicantnationalidforsitedetectionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "initialapprovalapplicantnameforsitedetectionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "initialapprovalphonenumberforsitedetectionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "initialapprovalemailforsitedetectionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "initialapprovalprovinceforsitedetectionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "initialapprovagovernorateforsitedetectionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "initialapprovamunicipalityforsitedetectionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "initialapprovaterritoryforsitedetectionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "initialapprovaaddressforsitedetectionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "headofservicedepartmentexplanationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "headofservicedepartmentdecisionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ipaddressparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "servicedepartmentparm"),

                }

        ),

        @NamedStoredProcedureQuery(
                name = "SaveApplicationLicensingOfMergerOfficeData",
                procedureName = "\"SaveApplicationLicensingOfMergerOfficeData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "applicationlicensingofmergerofficeidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "_1stoperatoridparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "_1stoperatornameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "_2ndoperatoridparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "_2ndoperatornameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "phonenumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "emailparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "provinceparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "governorateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "municipalityparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "territoryparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "vehicleidlistparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "hodnocriminalrecordparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "hodproffissionlicenseparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "hodvehiclelistparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "hodcommercialrecordparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "hodpatentdirectorateoffinanceparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "hoddvldexplanationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "hodparkinglotrentingcontractparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "hodsiteownershipparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "sitedetectionrequestreferenceparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "sitedetection_1stoperatoridparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "sitedetection_2ndoperatoridparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "sitedetectionphonenumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "sitedetectionemailparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "sitedetectionprovinceparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "sitedetectiongovernorateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "sitedetectionmunicipalityparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "sitedetectionterritoryparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "prencipal"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ipaddressparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "servicedepartmentparm"),

                }

        ),

        @NamedStoredProcedureQuery(
                name = "SaveApplicationOfficeCcompanylicenseRenewData",
                procedureName = "\"SaveApplicationOfficeCcompanylicenseRenewData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "officeccompanylicenserenewidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatoridparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "applicantnameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "phonenumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "emailparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "provinceparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "governorateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "municipalityparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "territoryparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "vehiclelistparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "permitlistparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "certificateofnocriminalrecordconfirmationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "careerlicenseforthepreviousyearconfirmationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "commercialrecordconfirmationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "vehiclelistconfirmationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "patentfromdirectorateoffinanceconfirmationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "parkinglotrentingcontractconfirmationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "siteownershipconfirmationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "disclosurecommitteerequestnumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "disclosurecommitteeoperatoridparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "disclosurecommitteephonenumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "disclosurecommitteeemailparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "disclosurecommitteeprovinceparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "disclosurecommitteegovernorateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "disclosurecommitteemunicipalityparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "disclosurecommitteeterritoryparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "prencipal"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ipaddressparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "servicedepartmentparm"),

                }

        ),

        @NamedStoredProcedureQuery(
                name = "SaveApplicationSmartPermitsData",
                procedureName = "\"SaveApplicationSmartPermitsData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "applicationsmartpermitsidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "applicantnationalidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "applicantnameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "vehicleownernationalidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "vehicleownernameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "phonenumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "emailparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "provinceparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "governorateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "municipalityparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "territoryparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "vehicleidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "permitidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "categoryparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "classificationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "certificateofdiseasefreeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "nocriminalrecordsparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "certificateofnon_occupancyparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "familybookparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "hodexplanationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "hoddecisionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "prencipal"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ipaddressparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "servicedepartmentparm"),

                }

        ),

        @NamedStoredProcedureQuery(
                name = "SaveApplicationTariffFareData",
                procedureName = "\"SaveApplicationTariffFareData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "applicationtarifffareidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatoridparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "operatornameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "applicantnameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "phonenumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "emailparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "provinceparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "governorateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "municipalityparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "territoryparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "routeidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "vehiclecategoryparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "fuletypeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "suggestedfareparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "reasonparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "disclosurecommitteenewdistanceparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "disclosurecommitteeexplanationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "newtariffparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "tariffcalculatorexplanationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "studyreferenceparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "studypathparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "tariffcalculatordecisionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "directordirectoratepassengertransportexplanationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "directordirectoratepassengertransportdecisionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "prencipal"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ipaddressparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "servicedepartmentparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "currenttariffparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Boolean.class, name = "difficultterrainparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "numberofworkingdaysparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Boolean.class, name = "routhasbeenmodifiedparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "routelengthparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "othersparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "gisdistanceparm"),

                }

        ),

        @NamedStoredProcedureQuery(
                name = "SaveApplicationRouteAmedmentData",
                procedureName = "\"SaveApplicationRouteAmedmentData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "applicationrouteamedmentidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatoridparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "operatornameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "phonenumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "emailparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "provinceparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "governorateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "municipalityparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "territoryparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "routeidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "currentroutelengthparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "suggestedroutelengthparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "currentroutepassengersparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "suggestedroutepassengersparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "suggestedpointsparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "reasonparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "passengertransportcommitteeexplanationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "passengertransportcommitteedecisionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "directordirectoratepassengertransportexplanationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "directordirectoratepassengertransportdecisionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "prencipal"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ipaddressparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "servicedepartmentparm"),

                }

        ),

        @NamedStoredProcedureQuery(
                name = "SaveApplicationExchangeLinesData",
                procedureName = "\"SaveApplicationExchangeLinesData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "applicationexchangelinesidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatoridparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "operatornameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "nationalidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "phonenumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "emailparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "_1stvehicleidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "_2ndvehicleidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "reasonparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "headofservicedepartmentexplanationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "headofservicedepartmentdecisionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "directordirectoratepassengertransportexplanationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "directordirectoratepassengertransportdecisionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "prencipal"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ipaddressparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "servicedepartmentparm"),

                }

        ),

        @NamedStoredProcedureQuery(
                name = "SaveApplicationPrivateBusRegistrationData",
                procedureName = "\"SaveApplicationPrivateBusRegistrationData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class,  name = "applicationprivatebusregistrationidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class,  name = "applicantnationalidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class,  name = "operatoridparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "operatornameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "phonenumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "emailparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "vehicleidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "commercialrecordparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "proffissionlicenseparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "customreferenceparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "noobjectionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "licensepurposesparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "evaluationcommitteeexplanationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "evaluationcommitteedecisionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "headofservicedepartmentexplanationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "headofservicedepartmentdecisionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "directordirectoratepassengertransportexplanationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "directordirectoratepassengertransportdecisionparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "prencipal"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ipaddressparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "servicedepartmentparm"),

                }

        ),

        @NamedStoredProcedureQuery(
                name = "SaveApplicationForPassengerTransportLicenseData",
                procedureName = "\"SaveApplicationForPassengerTransportLicenseData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "applicationforpassengertransportlicenseidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "applicantnationalidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "applicantnameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "mobilephoneparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "emailparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatoridparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "provinceparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "governorateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "municipalityparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "territoryparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "licensetypeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "commercialrecordnumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "technicalstudyreferenceparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "applicationdateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "applicationsreceivingcommitteeexplanationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "prencipal"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ipaddressparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "servicedepartmentparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "technicalstudyreferencecommitteeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "commercialrecordnumbercommitteeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "licensetypecommitteeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "territorycommitteeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "municipalitycommitteeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "governoratecommitteeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "provincecommitteeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatoridcommitteeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "emailcommitteeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "mobilephonecommitteeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "applicantnamecommitteeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "applicantnationalidcommitteeparm"),

                }

        ),


})
@Entity
public class SingleResult implements Serializable {

    @Id
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
