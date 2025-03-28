package consultaferiados;

import consultaferiados.service.FeriadosService;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import org.springframework.web.client.RestTemplate;

public class FeriadosServiceTest {
    private FeriadosService feriadosService;
    private RestTemplate restTemplateMock;

    @BeforeEach
    void setUp() {
        restTemplateMock = Mockito.mock(RestTemplate.class);

    }
}
