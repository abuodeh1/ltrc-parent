package jo.gov.ltrc.permit.services.point;

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
class PointServiceTest {

    @Autowired
    private  MockMvc mockMvc;

    @Autowired
    public ObjectMapper objectMapper;

    private List<ReturnPointResponse> point;
    private int randomPointIndex;

    @BeforeEach
    void setup() throws Exception {
        ReturnPointResponse[] points = objectMapper.readValue(
                mockMvc.perform(post("/api/point/find-point")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}")).andReturn().getResponse().getContentAsString(),
                ReturnPointResponse[].class);

        this.point = Arrays.asList(points);
        System.out.println(point.get(0));
    }

    @Test
    @DisplayName("/api/point/find - ReturnPoint Procedure")
    void findPoint() throws Exception {
        mockMvc.perform(post("/api/point/find-point")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("/api/point/{id} - ReturnPointByPointID Procedure")
    void getPointByID() throws Exception {
        if (point.size() > 0){
            randomPointIndex = (int) point.get(new Random().nextInt(point.size())).getPointid();
            mockMvc.perform(get("/api/point/" +randomPointIndex)
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.pointstatus" , greaterThan(0)));
        }else {
            mockMvc.perform(get("/api/point/1")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/point/{id}/characteristics - ReturnPoint Procedure")
    void getPointChar() throws Exception {
        if (point.size() > 0) {
            randomPointIndex = (int) point.get(new Random().nextInt(point.size())).getPointid();
            mockMvc.perform(get("/api/point/"+randomPointIndex+"/characteristics")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$", greaterThan(0)));
        }else {
            mockMvc.perform(get("/api/point/1/characteristics")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk());

        }
    }

    @Test
    @DisplayName("/api/point/{id}/parking-type - ReturnPoint Procedure")
    void getParkingType() throws Exception {
        if (point.size() > 0) {
            randomPointIndex = (int) point.get(new Random().nextInt(point.size())).getPointid();
            mockMvc.perform(get("/api/point/"+randomPointIndex+"/parking-type")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$", greaterThan(0)));
        }else{
            mockMvc.perform(get("/api/point/1/parking-type")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/point/{id}/status - ReturnPoint Procedure")
    void getPointStatus() throws Exception {
        if (point.size() > 0 ) {
            randomPointIndex = (int) point.get(new Random().nextInt(point.size())).getPointid();
            mockMvc.perform(get("/api/point/"+randomPointIndex+"/status")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$", greaterThan(0)));
        }else{
            mockMvc.perform(get("/api/point/1/status")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk());
        }
    }

    @Test
    @DisplayName("/api/point - SavePointData Procedure")
    void savePoint() throws Exception {
        mockMvc.perform(post("/api/point")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", containsString("E$23502$")));
    }

    @Test
    @DisplayName("/api/point/{id}/principal/{principalid} - ChangePointStatus Procedure")
    void deletePoint() throws Exception {
        if (point.size() > 0) {
            randomPointIndex = (int) point.get(new Random().nextInt(point.size())).getPointid();
            mockMvc.perform(delete("/api/point/"+randomPointIndex+"/principal/"+randomPointIndex)
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$", is("1$U")));
        }else{
            mockMvc.perform(delete("/api/point/1/principal/1")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{}"))
                    .andExpect(status().isOk());
        }
    }

}

