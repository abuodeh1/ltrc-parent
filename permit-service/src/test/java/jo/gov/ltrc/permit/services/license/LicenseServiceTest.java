package jo.gov.ltrc.permit.services.license;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;


import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
class LicenseServiceTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;
    private List<ReturnOperatorLicenseInformationResponse> license;

    @Test
    @DisplayName("/api/license - SaveOperatorLicenseData Procedure")
    void addOperatorLicense() throws Exception {
        mockMvc.perform(post("/api/license")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", containsString("E$23503")));
    }

    @Test
    @DisplayName("/api/license/find - ReturnOperatorLicenseInformation Procedure")
    void getOperatorLicenseInformation() throws Exception {
        ReturnOperatorLicenseInformationResponse[] licenses = objectMapper.readValue(
                mockMvc.perform(post("/api/license/find")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnOperatorLicenseInformationResponse[].class);

        this.license = Arrays.asList(licenses);

        if (license.size() > 0 ){
            mockMvc.perform(post("/api/license/find")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].liecencsestatus", greaterThan(0)));
        }else {
            mockMvc.perform(post("/api/license/find")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk());
        }

    }
}