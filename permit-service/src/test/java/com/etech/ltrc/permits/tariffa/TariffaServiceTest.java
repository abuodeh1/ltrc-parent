package com.etech.ltrc.permits.tariffa;


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
class TariffaServiceTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;
    private List<ReturnTariffEquationDataResponse> tariffEquation;
//
//    private List<ReturnRouteTariffByTariffIdDataResponse> tariffa;
//
//    private List<ReturnTLineByLineDataResponse> line;
//
//    @BeforeEach
//    void setup() throws Exception {
//        ReturnLineByLineDataResponse[] lines = objectMapper.readValue(
//                mockMvc.perform(post("/api/line/find-line")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content("{}")).andReturn().getResponse().getContentAsString(),
//                ReturnLineByLineDataResponse[].class);
//
//        this.line = Arrays.asList(lines);
//        System.out.println("");
//    }

    @Test
    @DisplayName("/api/tariff/find-line - ReturnLineByTariffData Procedure")
    void getLineByTariffData() throws Exception {
        mockMvc.perform(post("/api/tariff/find-line")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(status().isOk());

    }

    @Test
    @DisplayName("/api/tariff - SaveRouteTariffData Procedure")
    void saveTariff() throws Exception {
        mockMvc.perform(post("/api/tariff")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$" , containsString("E$23503$")));
    }

    @Test
    @DisplayName("/api/tariff/find-value - ReturnTariffVaLue Procedure")
    void calculateTariffaValue() throws Exception {
        mockMvc.perform(post("/api/tariff/find-value")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("/api/tariff/{id}/route-tariff - ReturnRouteTariffByTariffaID Procedure")
    void getRouteTariifByTariffID() throws Exception {
        mockMvc.perform(get("/api/tariff/3/route-tariff")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

    }

    @Test
    void deleteTariffByTariffID() throws Exception {
        mockMvc.perform(delete("/api/tariff/0")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

    }

    @Test
    @DisplayName("/api/tariff/inflation-referance - SaveInflationReferanceData Procedure")
    void addInflationReferance() throws Exception {
        mockMvc.perform(post("/api/tariff/inflation-referance")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", containsString("42P01$relation")));
    }

    @Test
    @DisplayName("/api/tariff/{id}/route-tariff - ReturnRouteTariffByTariffaID Procedure")
    void getRouteTariffByTariffData() {

    }

    @Test
    @DisplayName("/api/tariff/find/equation - ReturnTariffEquation Procedure")
    void getTariffEquation() throws Exception {
        ReturnTariffEquationDataResponse tariffEquations[] = objectMapper.readValue(
                mockMvc.perform(post("/api/tariff/find/equation")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnTariffEquationDataResponse[].class);

        this.tariffEquation = Arrays.asList(tariffEquations);

        if (tariffEquation.size() > 0){
            mockMvc.perform(post("/api/tariff/find/equation")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.[0].tariffequationid", greaterThan(0)));
        }else {
            mockMvc.perform(post("/api/tariff/find/equation")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk());
        }

    }

}