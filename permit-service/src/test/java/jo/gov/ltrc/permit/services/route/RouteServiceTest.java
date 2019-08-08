package jo.gov.ltrc.permit.services.route;

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
 class RouteServiceTest {

   @Autowired
   private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    private List<ReturnRouteResponse> route;
    private List<ReturnRouteResponse> points;
    private List<ReturnLineByRouteDataResponse> line ;
    private int randomLineIndex;

    RouteServiceTest() throws Exception {
    }

    @BeforeEach
    void setup() throws Exception {
        ReturnRouteResponse[] routes = objectMapper.readValue(
                mockMvc.perform(post("/api/route/find")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnRouteResponse[].class);

        this.route = Arrays.asList(routes);
        System.out.println("");
    }

    @Test
    @DisplayName("/api/route/{id}/start-point - ReturnLineByRouteData Procedure  ")
    void getStartPoints() throws Exception {
        if (route.size() > 0 ) {
            randomLineIndex = (int) route.get(new Random().nextInt(route.size())).getRouteid();
                    mockMvc.perform(get("/api/route/"+randomLineIndex+"/start-point")
                            .contentType(MediaType.APPLICATION_JSON))
                            .andExpect(status().isOk())
                            .andExpect(jsonPath("$" , greaterThan(0)));
        }else{
            mockMvc.perform(get("/api/route/1/start-point")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk());

        }
    }

    @Test
    @DisplayName("/api/route/{id}/end-point - ReturnLineByRouteData Procedure")
    void getEndPoints()throws Exception {
        if (route.size() > 0) {
            randomLineIndex = (int) route.get(new Random().nextInt(route.size())).getRouteid();
            mockMvc.perform(get("/api/route/"+randomLineIndex+"/end-point")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$" , greaterThan(0)));
        }else {
            mockMvc.perform(get("/api/route/1/end-point")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/route/{id}/line-status - ReturnLineByRouteData Procedure")
    void getStatuses() throws Exception {
        if (route.size() > 0) {
            randomLineIndex = (int) route.get(new Random().nextInt(route.size())).getRouteid();
            mockMvc.perform(get("/api/route/"+randomLineIndex+"/end-point")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$" , greaterThan(0)));
        } else {
            mockMvc.perform(get("/api/route/1/end-point")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/route/find - ReturnRoute Procedure")
    void findRoute()throws Exception {
        if (route.size() > 0) {
            mockMvc.perform(post("/api/route/find")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$[0].routeid", greaterThan(0)));
        }else{
            mockMvc.perform(post("/api/route/find")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/route/{id}/point - ReturnRoutePoints Procedure")
    void getPoints() throws Exception {
        if (route.size() > 0) {
            randomLineIndex = (int) route.get(new Random().nextInt(route.size())).getRouteid();

            ReturnRouteResponse[] point = objectMapper.readValue(
                    mockMvc.perform(get("/api/route/" + randomLineIndex + "/point")
                            .contentType(MediaType.APPLICATION_JSON)
                            .content("{}")).andReturn().getResponse().getContentAsString(),
                    ReturnRouteResponse[].class);

            this.points = Arrays.asList(point);

            if (points.size() > 0) {
                mockMvc.perform(get("/api/route/" + randomLineIndex + "/point")
                        .contentType(MediaType.APPLICATION_JSON))
                        .andExpect(status().isOk())
                        .andExpect(jsonPath("$[0].routepointid", greaterThan(0)));
            } else {
                mockMvc.perform(get("/api/route/" + randomLineIndex + "/point")
                        .contentType(MediaType.APPLICATION_JSON))
                        .andExpect(status().isOk());
            }
        } else {
            mockMvc.perform(get("/api/route/1/point")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/route/find-line - ReturnLineByRouteData Procedure")
    void searchLines()throws Exception {
        ReturnLineByRouteDataResponse[] lines = objectMapper.readValue(
                mockMvc.perform(post("/api/route/find-line")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnLineByRouteDataResponse[].class);

        this.line = Arrays.asList(lines);

        if (line.size() > 0) {
            mockMvc.perform(post("/api/route/find-line")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$[0].lineid", greaterThan(0)));
        }else{
            mockMvc.perform(post("/api/route/find-line")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/route - SaveRouteData Procedure")
    void addRoute() throws Exception{
        mockMvc.perform(post("/api/route")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$" , containsString("E$23503$")));
    }

    @Test
    @DisplayName("/api/route/{id}/point - SaveRoutePointData Procedure")
    void addRoutePoint()throws Exception {
        mockMvc.perform(post("/api/route/1/point")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$" , containsString("E$23503$")));
    }

    @Test
    @DisplayName("/api/route/{id}/line - ReturnLineByRouteData Procedure")
    void getLineByRouteID()throws Exception {

        if (route.size() > 0) {
            randomLineIndex = (int) route.get(new Random().nextInt(route.size())).getRouteid();
            mockMvc.perform(get("/api/route/"+randomLineIndex+"/line")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.linestatus", greaterThan(0)));
        } else {
            mockMvc.perform(get("/api/route/1/line")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/{id}/principal/{principalid} - ChangeRouteStatus Procedure")
    void deleteRoute() throws Exception {
        if (route.size() > 0) {
            randomLineIndex = (int) route.get(new Random().nextInt(route.size())).getRouteid();
            mockMvc.perform(delete("/api/route/" + randomLineIndex + "/principal/1")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$", is("1$U")));
        } else {
            mockMvc.perform(delete("/api/route/0/principal/1")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$", is("0$U")));
        }
    }

}
