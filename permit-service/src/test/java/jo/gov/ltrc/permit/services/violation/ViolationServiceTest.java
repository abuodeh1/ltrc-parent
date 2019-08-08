package jo.gov.ltrc.permit.services.violation;

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

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
class ViolationServiceTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;
    private List<ReturnViolationResponse> violation;
    private List<ReturnViolationTypeResponse> type;
    private List<ReturnViolationSubjectResponse> subject;
    private List<ReturnViolationPenaltyResponse> penalty;

    @Test
    @DisplayName("/api/violation - SaveViolationData Procedure")
    void addViolation() throws Exception {
        mockMvc.perform(post("/api/violation")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", containsString("E$23503$")));

    }

    @Test
    @DisplayName("/api/violation/find - ReturnViolation Procedure")
    void getViolation() throws Exception {
        ReturnViolationResponse[] violations = objectMapper.readValue(
                mockMvc.perform(post("/api/violation/find")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnViolationResponse[].class);

        this.violation = Arrays.asList(violations);

        if (violation.size() > 0){
            mockMvc.perform(post("/api/violation/find")
                    .content("{}")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].status", greaterThan(0)));
        }else {
            mockMvc.perform(post("/api/violation/find")
                    .content("{}")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/violation/find/type - ReturnViolationType Procedure")
    void getViolationType() throws Exception {
        ReturnViolationTypeResponse[] types = objectMapper.readValue(
                mockMvc.perform(post("/api/violation/find/type")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnViolationTypeResponse[].class);

        this.type = Arrays.asList(types);

        if (type.size() > 0 ) {
            mockMvc.perform(post("/api/violation/find/type")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].violationtypeid", greaterThan(0)));

        }else {
            mockMvc.perform(post("/api/violation/find/type")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk());

             }
    }

    @Test
    @DisplayName("/api/violation/find/subject - ReturnViolationSubject Procedure")
    void getViolationSubject() throws Exception {
        ReturnViolationSubjectResponse[] subjects = objectMapper.readValue(
                mockMvc.perform(post("/api/violation/find/subject")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnViolationSubjectResponse[].class);

        this.subject = Arrays.asList(subjects);

        if (subject.size() > 0 ){
            mockMvc.perform(post("/api/violation/find/subject")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].violationsubjectid", greaterThan(0)));
        }else{
            mockMvc.perform(post("/api/violation/find/subject")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/violation/find/penalty - ReturnViolationPenalty Procedure")
    void getViolationPenalty() throws Exception {
        ReturnViolationPenaltyResponse[] penalties = objectMapper.readValue(
                mockMvc.perform(post("/api/violation/find/penalty")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnViolationPenaltyResponse[].class);

        this.penalty = Arrays.asList(penalties);

        if (penalty.size() > 0 ){
            mockMvc.perform(post("/api/violation/find/penalty")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].violationpenaltyid", greaterThan(0)));

        }else{
            mockMvc.perform(post("/api/violation/find/penalty")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk());
        }
    }
}