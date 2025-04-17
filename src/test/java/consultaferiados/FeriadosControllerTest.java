package consultaferiados;

import consultaferiados.controller.FeriadosController;
import consultaferiados.model.Feriados;
import consultaferiados.service.FeriadosService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.boot.test.mock.mockito.MockBean;

@WebMvcTest(FeriadosController.class)

public class FeriadosControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private FeriadosService feriadosService;

    @Test
    void deveRetornarFeriadosPorAno() throws Exception {
        List<Feriados> mockList = List.of(
                new Feriados("2025-01-01", "Confraternização Universal", "Nacional")
        );

        when(feriadosService.getFeriadosByAno("2025")).thenReturn(mockList);

        mockMvc.perform(get("/feriados/2025")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].date").value("2025-01-01"))
                .andExpect(jsonPath("$[0].name").value("Confraternização Universal"))
                .andExpect(jsonPath("$[0].type").value("Nacional"));
    }

    @Test
    void deveRetornarFeriadosPorAnoEMes() throws Exception {
        List<Feriados> mockList = List.of(
                new Feriados("2025-04-21", "Tiradentes", "Nacional")
        );

        when(feriadosService.getFeriadosByAnoEMes("2025", "04")).thenReturn(mockList);

        mockMvc.perform(get("/feriados/2025/04")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].date").value("2025-04-21"))
                .andExpect(jsonPath("$[0].name").value("Tiradentes"))
                .andExpect(jsonPath("$[0].type").value("Nacional"));
    }

    @Test
    void deveRetornarErroInternoAoBuscarFeriadosPorAno() throws Exception {
        when(feriadosService.getFeriadosByAno("2025")).thenThrow(new RuntimeException("Erro simulado"));

        mockMvc.perform(get("/feriados/2025")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isInternalServerError());
    }

    @Test
    void deveRetornarErroInternoAoBuscarFeriadosPorAnoEMes() throws Exception {
        when(feriadosService.getFeriadosByAnoEMes("2025", "04")).thenThrow(new RuntimeException("Erro simulado"));

        mockMvc.perform(get("/feriados/2025/04")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isInternalServerError());
    }
}
