package jo.gov.ltrc.permit.services.operator;

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

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.greaterThan;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
class OperatorServiceTest {


    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;
    private List<ReturnOperatorByOperatorBasicInformationResponse> operator;
    private List<ReturnVehicleInformationResponse> vehicle;
    private List<ReturnDecisionResponse> decsion;
    private List<ReturnOperatorBranchResponse> operatorBranch;
    private List<ReturnVehicleGeneralSearchResponse> vehicleGeneral;
    private List<ReturnOperatorOfficeInformationResponse> office;
    private List<ReturnOperatorByVehicleInformationResponse> operatorByVehicle;
    private List<ReturnVehicleRouteResponse> vehicleRoute;
    private List<ReturnOperatorCategoryFieldResponse> categoryField;
    private List<ReturnOperatorCategoryFieldSettingResponse> categoryFieldSetting;
    private List<ReturnOperatorGeneralSearchResponse> general;


    @Test
    @DisplayName("/api/operator/branch - SaveOperatorBranchData Procedure")
    void addOperatorBranch() throws Exception {
        mockMvc.perform(post("/api/operator/branch")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("/api/operator - SaveOperatorData Procedure")
    void addOperator() throws Exception {
        mockMvc.perform(post("/api/operator")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("/api/operator/decision - SaveDecisionsData Procedure")
    void addDecision() throws Exception {
        mockMvc.perform(post("/api/operator/decision")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("/api/operator/vehicle - SaveVehicleDate Procedure")
    void addVehicle() throws Exception {
        mockMvc.perform(post("/api/operator/vehicle")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", containsString("E$55000$")));
    }

    @Test
    @DisplayName("/api/operator/vehicle-route - SaveVehicleRoute Procedure")
    void addVehicleRoute() throws Exception {
        mockMvc.perform(post("/api/operator/vehicle-route")
                .content("{}")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", containsString("E$23503$")));


    }

    @Test
    @DisplayName("/api/operator/find - ReturnOperatorByOperatorBasicInformation Procedure")
    void findOperator() throws Exception {
        ReturnOperatorByOperatorBasicInformationResponse[] operators = objectMapper.readValue(
                mockMvc.perform(post("/api/operator/find")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnOperatorByOperatorBasicInformationResponse[].class);

        this.operator = Arrays.asList(operators);
        

        if (operator.size() > 0){
            mockMvc.perform(post("/api/operator/find")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].operatorid", greaterThan(0)));
        }else {
            mockMvc.perform(post("/api/operator/find")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk());
        }

    }

    @Test
    @DisplayName("/api/operator/find/vehicle - ReturnVehicleInformation Procedure")
    void findVehicle() throws Exception {
        ReturnVehicleInformationResponse[] vehicles = objectMapper.readValue(
                mockMvc.perform(post("/api/operator/find/vehicle")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnVehicleInformationResponse[].class);

        this.vehicle = Arrays.asList(vehicles);
        

        if (vehicle.size() > 0){
            mockMvc.perform(post("/api/operator/find/vehicle")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].status", greaterThan(-1)));
        }else {
            mockMvc.perform(post("/api/operator/find/vehicle")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk());
        }
        
    }

    @Test
    @DisplayName("/api/operator/find/decision - ReturnDecision Procedure")
    void getDecision() throws Exception {
        ReturnDecisionResponse[] decsions = objectMapper.readValue(
                mockMvc.perform(post("/api/operator/find/decision")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnDecisionResponse[].class);

        this.decsion = Arrays.asList(decsions);

        if(decsion.size() > 0 ){
            mockMvc.perform(post("/api/operator/find/decision")
                    .content("{}")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].decisionsid", greaterThan(0)));
        }else {
            mockMvc.perform(post("/api/operator/find/decision")
                    .content("{}")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk());
        }
        
    }

    @Test
    @DisplayName("/api/operator/find/branch - ReturnOperatorBranch Procedure")
    void getOperatorBranch() throws Exception {
        ReturnOperatorBranchResponse[] operatorBranchs = objectMapper.readValue(
                mockMvc.perform(post("/api/operator/find/branch")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnOperatorBranchResponse[].class);

        this.operatorBranch = Arrays.asList(operatorBranchs);

        if (operatorBranch.size() > 0){
            mockMvc.perform(post("/api/operator/find/branch")
                    .content("{}")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].operatorbranchid", greaterThan(0)));
        }else{
            mockMvc.perform(post("/api/operator/find/branch")
                    .content("{}")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/operator/find/vehicle-general - ReturnVehicleGeneralSearch Procedure")
    void getVehicleGeneralSearch() throws Exception {
        ReturnVehicleGeneralSearchResponse[] vehicleGenerals = objectMapper.readValue(
                mockMvc.perform(post("/api/operator/find/vehicle-general")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnVehicleGeneralSearchResponse[].class);
        this.vehicleGeneral = Arrays.asList(vehicleGenerals);

        if (vehicleGeneral.size() > 0){
            mockMvc.perform(post("/api/operator/find/vehicle-general")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].status", greaterThan(-1)));
        }else {
            mockMvc.perform(post("/api/operator/find/vehicle-general")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/operator/find/office - ReturnOperatorOfficeInformation Procedure")
    void getOperatorOfficeInformation() throws Exception {
        ReturnOperatorOfficeInformationResponse[] offices = objectMapper.readValue(
                mockMvc.perform(post("/api/operator/find/office")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnOperatorOfficeInformationResponse[].class);
        this.office = Arrays.asList(offices);

        if (office.size() > 0){
            mockMvc.perform(post("/api/operator/find/office")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].operatorid", greaterThan(0)));
        }else {
            mockMvc.perform(post("/api/operator/find/office")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/operator/find/by-vehicle - ReturnOperatorByVehicleInformation Procedure")
    void getOperatorByVehicleInformation() throws Exception {
        ReturnOperatorByVehicleInformationResponse[] operatorByVehicles = objectMapper.readValue(
                mockMvc.perform(post("/api/operator/find/by-vehicle")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnOperatorByVehicleInformationResponse[].class);
        this.operatorByVehicle = Arrays.asList(operatorByVehicles);

        if (operatorByVehicle.size() > 0){
            mockMvc.perform(post("/api/operator/find/by-vehicle")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].operatorid", greaterThan(0)));
        }else {
            mockMvc.perform(post("/api/operator/find/by-vehicle")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/operator/find/vehicle-route - ReturnVehicleRoute Procedure")
    void getVehicleRoute() throws Exception {
        ReturnVehicleRouteResponse[] vehicleRoutes = objectMapper.readValue(
                mockMvc.perform(post("/api/operator/find/vehicle-route")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnVehicleRouteResponse[].class);
        this.vehicleRoute = Arrays.asList(vehicleRoutes);

        if (vehicleRoute.size() > 0){
            mockMvc.perform(post("/api/operator/find/vehicle-route")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].routeid", greaterThan(0)));
        }else {
            mockMvc.perform(post("/api/operator/find/vehicle-route")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/operator/find/category-field - ReturnOperatorCategoryField Procedure")
    void getOperatorCategoryField() throws Exception {
        ReturnOperatorCategoryFieldResponse[] categoryFields = objectMapper.readValue(
                mockMvc.perform(post("/api/operator/find/category-field")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnOperatorCategoryFieldResponse[].class);
        this.categoryField = Arrays.asList(categoryFields);

        if (categoryField.size() > 0){
            mockMvc.perform(post("/api/operator/find/category-field")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].operatorfieldid", greaterThan(0)));
        }else {
            mockMvc.perform(post("/api/operator/find/category-field")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/operator/find/category-field/setting - ReturnOperatorCategoryFieldSetting Procedure")
    void getOperatorCategoryFieldSetting() throws Exception {
        ReturnOperatorCategoryFieldSettingResponse[] categoryFieldSettings = objectMapper.readValue(
                mockMvc.perform(post("/api/operator/find/category-field/setting")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnOperatorCategoryFieldSettingResponse[].class);
        this.categoryFieldSetting = Arrays.asList(categoryFieldSettings);

        if (categoryFieldSetting.size() > 0){
            mockMvc.perform(post("/api/operator/find/category-field/setting")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].operatorcategroryfieldsettingid", greaterThan(0)));
        }else {
            mockMvc.perform(post("/api/operator/find/category-field/setting")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/operator/category - SaveOperatorCategroyData Procedure")
    void addOperatorCategroyData() throws Exception {
        mockMvc.perform(post("/api/operator/category")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("/api/operator/category-setting - SaveOperatorCategoryFieldSettingData Procedure")
    void addOperatorCategoryFieldSettingData()throws Exception {
        mockMvc.perform(post("/api/operator/category-setting")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("/api/operator/find/general - ReturnOperatorGeneralSearch Procedure")
    void findOperatorByGeneral() throws Exception {
        ReturnOperatorGeneralSearchResponse[] generals = objectMapper.readValue(
                mockMvc.perform(post("/api/operator/find/general")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnOperatorGeneralSearchResponse[].class);
        this.general = Arrays.asList(generals);

        if (general.size() > 0){
            mockMvc.perform(post("/api/operator/find/general")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].operatorid", greaterThan(0)));
        }else {
            mockMvc.perform(post("/api/operator/find/general")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk());
        }

    }

    @Test
    void getCarsCountByOperatorID() {
    }

    @Test
    void getCarsCountByOwnerNationalID() {
    }
}