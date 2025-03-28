package consultaferiados;

import consultaferiados.model.Feriados;
import consultaferiados.service.FeriadosService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FeriadosServiceTest {

    private FeriadosService feriadosService;

    @BeforeEach
    void setUp() {
        RestTemplate restTemplateMock = Mockito.mock(RestTemplate.class);
        feriadosService = new FeriadosService() {
            @Override
            public List<Feriados> getFeriadosByAno(String ano) {
                Feriados[] mockData = {
                        new Feriados("Confraternização Universal", "2025-01-01", "Nacional"),
                        new Feriados("Tiradentes", "2025-04-21", "Nacional")
                };
                return List.of(mockData);
            }
        };
    }

    @Test
    void deveRetornarTodosOsFeriadosDoAno() {
        List<Feriados> feriados = feriadosService.getFeriadosByAno("2025");
        assertNotNull(feriados);
        assertEquals(2, feriados.size());
    }

    @Test
    void deveFiltrarFeriadosPorMes() {
        List<Feriados> feriados = feriadosService.getFeriadosByAnoEMes("2025", "04");
        assertEquals(1, feriados.size());
        assertEquals("Tiradentes", feriados.get(0).getNome());
    }
}

