package jo.gov.ltrc.permit.services.operator;


import javax.persistence.*;
import java.sql.Date;

@NamedStoredProcedureQueries({


        @NamedStoredProcedureQuery(
                name = "SaveOperatorBranchData" ,
                procedureName = "\"SaveOperatorBranchData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatorbranchidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatoridparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "provinceparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "governorateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "municipalityparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "territoryparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "neighborhoodparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "streetparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "basinparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "plotnoparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "poboxparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "telephoneparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "faxparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "mobilephoneparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "emailparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "aggreementreferencenumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "aggreementreferencedateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "vehiclecountparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "branchnameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "certificateregistrationnumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),

                }

        ),


        @NamedStoredProcedureQuery(
                name = "SaveOperatorData",
                procedureName = "\"SaveOperatorData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatoridparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "operatornationalidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "operatornameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatorclassificationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatorcategoryparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "provinceparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "governorateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "municipalityparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "territoryparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "streetparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "neighborhoodparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "emailparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "poboxparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "phonenumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "mobilephonenumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "faxnumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "licensepurposeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "officepropertyownerparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "plotnoparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "officeareaparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "servicescopeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "dateofcontractsigningparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "commercialnamerecordnumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "commercialnameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "commercialrecordnumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "commercialrecorddateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "employeesnumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "driversnumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "workingcarsnumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "basiccarsnumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "officeclosingdateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "remarksparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "feesstatusparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "licenseissuedateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "licenseexpiredateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "plotclassificationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "officefloorparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Double.class, name = "contractperiodparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "certificateregistrationnumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "basinparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),


                }
        ),


        @NamedStoredProcedureQuery(
                name = "SaveDecisionsData",
                procedureName = "\"SaveDecisionsData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "decisionsidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "decisionssourceparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "vehicleparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "decisionsreferenceparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "decisionsreferencedateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "decisionsreferencesubjectparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "governorateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "decisionstextparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "decisionstremparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "decisionstremdateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "decisionstremnumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),

                }
        ),


        @NamedStoredProcedureQuery(
                name = "SaveVehicleData",
                procedureName = "\"SaveVehicleData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "vehicleidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "registrationnumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "platenumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ownerparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "vehiclecategoryparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "operationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "remarksparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "yearofmanufactureparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "passengersnumberparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "manufacturerparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ownernameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "licenseexpirationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "addtionaldescriptionsparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "platecodeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "feesstatusparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "officeidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "officenameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "vehiclepermitparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "fueltypeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "vehicleentrydateparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatorparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "ownernationalidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),

                }
        ),

        @NamedStoredProcedureQuery(
                name = "SaveVehicleRoute",
                procedureName = "\"SaveVehicleRoute\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "vehiclerouteidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "vehicleidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "routeidparm"),
                }
        ),


        @NamedStoredProcedureQuery(
                name = "SaveOperatorCategroyData",
                procedureName = "\"SaveOperatorCategroyData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatorcategoryidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "operatorcategorynameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "operatorcategoryenglishnameparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatorcategoryclassificationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatorcategorydepartmentparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "vehiclecategoryparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "plateclassificationparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "linetypeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),
                }
        ),

        @NamedStoredProcedureQuery(
                name = "SaveOperatorCategoryFieldSettingData",
                procedureName = "\"SaveOperatorCategoryFieldSettingData\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatorcategroryfieldsettingidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatorcategoryidparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "operatorfieldparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "requiredparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "visibleparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "activeparm"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class, name = "princepel"),
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "statusparm"),

                }
        ),

        @NamedStoredProcedureQuery(
                name = "CnclPrmt",
                procedureName = "\"CnclPrmt\"",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class),

                }
        ),

})



@Entity
public class SingleResult {

    @Id
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
