package jo.gov.ltrc.permit.shared;

import jo.gov.ltrc.permit.services.shared.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.greaterThan;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
 class SharedServiceTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    private List<ReturnCountryResponse> country;
    private List<ReturnRegionResponse> region;
    private List<ReturnGovernerateResponse> governerate;
    private List<ReturnMunicipalityResponse> municipality;
    private List<ReturnAreaResponse> area;
    private List<ReturnVehicleCategoriesResponse> vehicleCategorie ;
    private List<ReturnFuelTypesResponse> fuelType ;
    private List<ReturnOperatorClassificationDataResponse> classification;
//    private List<ReturnOperatorCategoryDataResponse> category;
    private List<ReturnLicensePurposeDataResponse> licensePurpose;
    private List<ReturnPlateClassificationResponse> pC;
    private List<ReturnOperatorScreenSectionResponse> screen;
    private List<ReturnServiceDepartmentResponse> serviceD;


    @Test
    @DisplayName("/api/country/find - ReturnCountry Procedure")
    public void findCountry() throws Exception {

        ReturnCountryResponse[] countrys = objectMapper.readValue(
                mockMvc.perform(post("/api/country/find")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnCountryResponse[].class);

        this.country = Arrays.asList(countrys);
        System.out.println("");

        if (country.size() > 0) {
            mockMvc.perform(post("/api/country/find")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].countryid", greaterThan(0)));
        }else {
            mockMvc.perform(post("/api/country/find")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/region/find - ReturnCountry Procedure")
    void findRegion() throws Exception {

        ReturnRegionResponse[] regions = objectMapper.readValue(
                mockMvc.perform(post("/api/region/find")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnRegionResponse[].class);

        this.region = Arrays.asList(regions);
        System.out.println("");

        if (region.size() > 0 ) {
            mockMvc.perform(post("/api/region/find")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].provinceID" , greaterThan(0)));
        }else {
            mockMvc.perform(post("/api/region/find")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk());

        }
    }

    @Test
    @DisplayName("/api/governorate/find - ReturnCountry Procedure")
    void findGovernerate() throws Exception {

        ReturnGovernerateResponse[] governerates = objectMapper.readValue(
                mockMvc.perform(post("/api/governorate/find")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnGovernerateResponse[].class);

        this.governerate = Arrays.asList(governerates);
        System.out.println("");

        if (governerate.size() > 0) {
            mockMvc.perform(post("/api/governorate/find")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].governorateID", greaterThan(0)));
        }else{
            mockMvc.perform(post("/api/governorate/find")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/municipality/find - ReturnCountry Procedure")
    void findMunicipality() throws Exception {

        ReturnMunicipalityResponse[] municipalitys = objectMapper.readValue(
                mockMvc.perform(post("/api/municipality/find")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnMunicipalityResponse[].class);

        this.municipality = Arrays.asList(municipalitys);
        System.out.println("");

        if (municipality.size() > 0 ) {
            mockMvc.perform(post("/api/municipality/find")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].municipalityID" , greaterThan(0)));
        }else {
            mockMvc.perform(post("/api/municipality/find")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/area/find - ReturnCountry Procedure")
    void findArea() throws Exception {

        ReturnAreaResponse[] areas = objectMapper.readValue(
                mockMvc.perform(post("/api/area/find")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnAreaResponse[].class);

        this.area = Arrays.asList(areas);
        System.out.println("");

        if (area.size() > 0) {
            mockMvc.perform(post("/api/area/find")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].territoryID" , greaterThan(0)));
        }else {
            mockMvc.perform(post("/api/area/find")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/vehicle-categories - ReturnAllVehicleCategories Procedure")
    void getAllVehicleCategories() throws Exception {

        ReturnVehicleCategoriesResponse[] vehicleCategories = objectMapper.readValue(
                mockMvc.perform(get("/api/vehicle-categories")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnVehicleCategoriesResponse[].class);

        this.vehicleCategorie = Arrays.asList(vehicleCategories);
        System.out.println("");

        if (vehicleCategorie.size() > 0 ) {
            mockMvc.perform(get("/api/vehicle-categories")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].vehiclecategoryid" , greaterThan(0)));
        }else {
            mockMvc.perform(get("/api/vehicle-categories")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/fuel-type - ReturnAllFuelTypes Procedure")
    void getAllFuelTypes() throws Exception {

        ReturnFuelTypesResponse[] fuelTypes = objectMapper.readValue(
                mockMvc.perform(get("/api/fuel-type")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnFuelTypesResponse[].class);

        this.fuelType = Arrays.asList(fuelTypes);
        System.out.println("");

        if (fuelType.size() > 0) {
            mockMvc.perform(get("/api/fuel-type")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].fueltypeid", greaterThan(0)));
        }else {
            mockMvc.perform(get("/api/fuel-type")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk());
        }
    }

//    @Test
//    @DisplayName("/api/operator-category/find - ReturnOperatorCategory Procedure")
//    void getOperatorCategory() throws Exception {
//        ReturnOperatorCategoryDataResponse[] categorys = objectMapper.readValue(
//                mockMvc.perform(post("/api/operator-category/find")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content("{}")).andReturn().getResponse().getContentAsString(),
//                ReturnOperatorCategoryDataResponse[].class);
//
//        this.category = Arrays.asList(categorys);
//        System.out.println("");
//
//        if (category.size() > 0){
//            mockMvc.perform(post("/api/operator-category/find")
//                    .contentType(MediaType.APPLICATION_JSON)
//                    .content("{}"))
//                    .andExpect(status().isOk())
//                    .andExpect(jsonPath("$.[0].operatorcategoryid", greaterThan(0) ));
//        }else {
//            mockMvc.perform(post("/api/operator-category/find")
//                    .contentType(MediaType.APPLICATION_JSON)
//                    .content("{}"))
//                    .andExpect(status().isOk());
//        }
//    }

    @Test
    @DisplayName("/api/operator-classification/find - ReturnOperatorClassification Procedure")
    void getOperatorClassification() throws Exception {
        ReturnOperatorClassificationDataResponse[] classifications = objectMapper.readValue(
                mockMvc.perform(post("/api/operator-classification/find")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnOperatorClassificationDataResponse[].class);

        this.classification = Arrays.asList(classifications);
        System.out.println("");

        if (classification.size() > 0){
            mockMvc.perform(post("/api/operator-classification/find")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].operatorclassificationid", greaterThan(0)));
        }else {
            mockMvc.perform(post("/api/operator-classification/find")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/license-purpose/find - ReturnLicensepurpose Procedure")
    void getLicensePurpose() throws Exception {
        ReturnLicensePurposeDataResponse[] licensePurposes = objectMapper.readValue(
                mockMvc.perform(post("/api/license-purpose/find")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnLicensePurposeDataResponse[].class);

        this.licensePurpose = Arrays.asList(licensePurposes);
        System.out.println("");

        if (licensePurpose.size() > 0){
            mockMvc.perform(post("/api/license-purpose/find")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].licensepurposeid", greaterThan(0)));

        }else{
            mockMvc.perform(post("/api/license-purpose/find")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/plate-classification/find - ReturnPlateClassification Procedure")
    void getPlateClassification() throws Exception {
        ReturnPlateClassificationResponse[] pc = objectMapper.readValue(
                mockMvc.perform(post("/api/plate-classification/find")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnPlateClassificationResponse[].class);

        this.pC = Arrays.asList(pc);
        System.out.println("");

        if (pC.size() > 0){
            mockMvc.perform(post("/api/plate-classification/find")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].plateclassificationid", greaterThan(0)));

        }else{
            mockMvc.perform(post("/api/plate-classification/find")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/operator-screen/find - ReturnOperatorScreenSection Procedure")
    void getOperatorScreenSection() throws Exception {
        ReturnOperatorScreenSectionResponse[] screens = objectMapper.readValue(
                mockMvc.perform(post("/api/operator-screen/find")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnOperatorScreenSectionResponse[].class);

        this.screen = Arrays.asList(screens);
        System.out.println("");

        if (screen.size() > 0){
            mockMvc.perform(post("/api/operator-screen/find")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].operatorfieldsection", greaterThan(0)));

        }else{
            mockMvc.perform(post("/api/operator-screen/find")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/service-department/find - ReturnServiceDepartment Procedure")
    void getServiceDepartment() throws Exception {
        ReturnServiceDepartmentResponse[] serviceDs = objectMapper.readValue(
                mockMvc.perform(post("/api/service-department/find")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnServiceDepartmentResponse[].class);

        this.serviceD = Arrays.asList(serviceDs);

        if (serviceD.size() > 0){
            mockMvc.perform(post("/api/service-department/find")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].servicedepartmentid", greaterThan(0)));

        }else{
            mockMvc.perform(post("/api/service-department/find")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/characteristic - SaveCharacteristicData Procedure")
    void addCharacteristic() throws Exception {
        mockMvc.perform(post("/api/characteristic")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("/api/county - SaveCountryData Procedure")
    void addCountry() throws Exception {
        mockMvc.perform(post("/api/country")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("/api/governorate - SaveGovernorateData Procedure")
    void addGovernorate() throws Exception {
        mockMvc.perform(post("/api/governorate")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("/api/municipality - SaveMunicipalityData Procedure")
    void addMunicipality() throws Exception {
        mockMvc.perform(post("/api/municipality")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("/api/territory - SaveTerritoryData Procedure")
    void addTerritory() throws Exception {
        mockMvc.perform(post("/api/territory")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("/api/parking-type - SaveParkingTypeData Procedure")
    void addParkingType() throws Exception {
        mockMvc.perform(post("/api/parking-type")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("/api/line-type - SaveLineTypeData Procedure")
    void addLineType() throws Exception {
        mockMvc.perform(post("/api/line-type")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("/api/fuel-type - SaveFuelTypeData Procedure")
    void addFuelType() throws Exception {
        mockMvc.perform(post("/api/fuel-type")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("/api/plate-classification - SavePlateClassificationData Procedure")
    void addPlateClassification() throws Exception {
        mockMvc.perform(post("/api/plate-classification")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("/api/transportation-class - SaveTransportationClassData Procedure")
    void addTransportationClass() throws Exception {
        mockMvc.perform(post("/api/transportation-class")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("/api/period-class - SavePeriodCalssData Procedure")
    void addPeriodCalss() throws Exception {
        mockMvc.perform(post("/api/period-class")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("/api/operator-classification - SaveOperatorClassificationData Procedure")
    void addOperatorClassification() throws Exception {
        mockMvc.perform(post("/api/operator-classification")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(status().isOk());
    }
}