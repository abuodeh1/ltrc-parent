package jo.gov.ltrc.permit.permit;

import com.fasterxml.jackson.databind.ObjectMapper;
import jo.gov.ltrc.permit.services.permit.*;
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
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
class PermitServiceTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;
    private List<ReturnPermitTypeFieldResponse> field;
    private List<ReturnPermitTypeFieldSettingResponse> setting;
    private List<ReturnPermitGeneralSearchResponse> general;
    private List<ReturnPermitTypeResponse> type;
    private List<ReturnPermitWorkingAsResponse> work;

    @Test
    @DisplayName("/api/permit/type-field - SavePermitTypeData Procedure")
    void addPermitTypeField() throws Exception {
        mockMvc.perform(post("/api/permit/type-field")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(status().isOk());

    }

    @Test
    @DisplayName("/api/permit/find/type-field - ReturnPermitTypeField Procedure")
    void getPermitTypeField() throws Exception {
        ReturnPermitTypeFieldResponse[] fields = objectMapper.readValue(
                mockMvc.perform(post("/api/permit/find/type-field")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnPermitTypeFieldResponse[].class);

        this.field = Arrays.asList(fields);

        if (field.size() > 0){
            mockMvc.perform(post("/api/permit/find/type-field")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].permitfieldid", greaterThan(0)));

        }else {
            mockMvc.perform(post("/api/permit/find/type-field")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/permit/find/type-field-setting - ReturnPermitTypeFieldSetting Procedure")
    void getPermitTypeFieldSetting() throws Exception {
        ReturnPermitTypeFieldSettingResponse[] settings = objectMapper.readValue(
                mockMvc.perform(post("/api/permit/find/type-field-setting")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnPermitTypeFieldSettingResponse[].class);

        this.setting = Arrays.asList(settings);

        if (setting.size() > 0){
            mockMvc.perform(post("/api/permit/find/type-field-setting")
                    .content("{}")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].permittypefieldsettingid", greaterThan(0)));
        }else{
            mockMvc.perform(post("/api/permit/find/type-field-setting")
                    .content("{}")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/permit/find/general - ReturnPermitGeneralSearch Procedure")
    void getPermitGeneralSearch() throws Exception {
        ReturnPermitGeneralSearchResponse[] generals = objectMapper.readValue(
                mockMvc.perform(post("/api/permit/find/general")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnPermitGeneralSearchResponse[].class);

        this.general = Arrays.asList(generals);

        if (general.size() > 0){
            mockMvc.perform(post("/api/permit/find/general")
                    .content("{}")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].status", greaterThan(0)));
        }else {
            mockMvc.perform(post("/api/permit/find/general")
                    .content("{}")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/permit - SavePermitData Procedure")
    void addPermit() throws Exception {
        mockMvc.perform(post("/api/permit")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(status().isOk());
//                .andExpect(jsonPath("$", containsString("E$42601$")));

    }

    @Test
    @DisplayName("/api/permit/find/type - ReturnPermitType Procedure")
    void getPermitType() throws Exception {
        ReturnPermitTypeResponse[] types = objectMapper.readValue(
                mockMvc.perform(post("/api/permit/find/type")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnPermitTypeResponse[].class);

        this.type = Arrays.asList(types);

        if (type.size() > 0 ){
            mockMvc.perform(post("/api/permit/find/type")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].permittypeid", greaterThan(0)));
        }else {
            mockMvc.perform(post("/api/permit/find/type")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/permit/working-as - ReturnPermitWorkingAs Procedure")
    void getPermitWorkingAs() throws Exception {
        ReturnPermitWorkingAsResponse[] works = objectMapper.readValue(
                mockMvc.perform(post("/api/permit/find/working-as")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnPermitWorkingAsResponse[].class);
        this.work = Arrays.asList(works);
        if (work.size() > 0){
            mockMvc.perform(post("/api/permit/find/working-as")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].permitworkingasid", greaterThan(0)));
        }else{
            mockMvc.perform(post("/api/permit/find/working-as")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk());
        }
    }
}