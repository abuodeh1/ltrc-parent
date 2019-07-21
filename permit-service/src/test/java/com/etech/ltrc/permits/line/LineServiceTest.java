package com.etech.ltrc.permits.line;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
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
import java.util.Random;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
class LineServiceTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    private List<ReturnLineByLineDataResponse> line;
    private int randomLineIndex;

    @BeforeEach
    void setup() throws Exception {
        ReturnLineByLineDataResponse[] lines = objectMapper.readValue(
                mockMvc.perform(post("/api/line/find-line")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnLineByLineDataResponse[].class);

        this.line = Arrays.asList(lines);
        System.out.println("");
    }

    @Test
    @DisplayName("/api/line/types - ReturnAllLineType Procedure")
    void getLineTypes() throws Exception{
        mockMvc.perform(get("/api/line/types")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].linetypeid" , greaterThan(0)));
    }

    @Test
    @DisplayName("/api/line/{id}/start-point - ReturnLineByLineData Procedure")
    void getStartPoints() throws Exception {
        if (line.size() > 0) {
            randomLineIndex = (int) line.get(new Random().nextInt(line.size())).getLineid();
            mockMvc.perform(get("/api/line/"+randomLineIndex+"/start-point")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$", greaterThan(0)));
        }else{
            mockMvc.perform(get("/api/line/1/start-point")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/line/{id}/end-point - ReturnLineByLineData Procedure")
    void getLineEndPoints()throws Exception {
        if(line.size() > 0 ) {
            randomLineIndex = (int) line.get(new Random().nextInt(line.size())).getLineid();
            mockMvc.perform(get("/api/line/"+randomLineIndex+"/end-point")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$", greaterThan(0)));
        }else{
            mockMvc.perform(get("/api/line/1/end-point")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/line/{id}/status - ReturnLineByLineData Procedure")
    void getLineStatuses()throws Exception {
        if (line.size() > 0) {
            randomLineIndex = (int) line.get(new Random().nextInt(line.size())).getLineid();
            mockMvc.perform(get("/api/line/"+randomLineIndex+"/line-status")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$", greaterThan(0)));
        }else {
            mockMvc.perform(get("/api/line/1/line-status")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/line/find-line - ReturnLineByLineData Procedure")
    void searchLines() throws Exception {
        if (line.size() > 0) {
            mockMvc.perform(post("/api/line/find-line")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].linestatus", greaterThan(0)));

        }else {
            mockMvc.perform(post("/api/line/find-line")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk());

        }
    }

    @Test
    @DisplayName("/api/line - SaveLineData Procedure")
    void addLine() throws Exception{
        mockMvc.perform(post("/api/line")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$" , containsString("E$23502$")));

    }

    @Test
    @DisplayName("/api/line/{id} - ReturnLineByLineData Procedure")
    void getLineByLineID() throws Exception {
        if (line.size() > 0) {
            randomLineIndex = (int) line.get(new Random().nextInt(line.size())).getLineid();
            mockMvc.perform(get("/api/line/"+randomLineIndex)
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.linestatus", greaterThan(0)));
        }else{
            mockMvc.perform(get("/api/line/1")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/line/{id} - ChangeLineStatus Procedure")
    void deleteLine() throws Exception {
        if (line.size() > 0) {
            randomLineIndex = (int) line.get(new Random().nextInt(line.size())).getLineid();
            mockMvc.perform(delete("/api/line/"+randomLineIndex)
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$", is("1$U")));
        }else{
            mockMvc.perform(delete("/api/line/0")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/line/{id}/tariff - ReturnRouteTariffByLineID" )
    void getRouteTariffByLineID() throws Exception {
        if (line.size() > 0) {
            randomLineIndex = (int) line.get(new Random().nextInt(line.size())).getLineid();
            mockMvc.perform(get("/api/line/"+randomLineIndex+"/tariff")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk());
        }
    }

}