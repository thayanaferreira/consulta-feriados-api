package consultaferiados.service;

import consultaferiados.model.Feriado;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FeriadoService {
    private static final String API_URL = "https://brasilapi.com.br/api/feriados/v1/";

    public List<Feriado> getFeriadosByAno(String ano) {
        RestTemplate restTemplate = new RestTemplate();
        Feriado[] feriados = restTemplate.getForObject(API_URL + ano, Feriado[].class);
        assert feriados != null;
        return List.of(feriados);
    }

    public List<Feriado> getFeriadosByAnoEMes(String ano, String mes) {
        List<Feriado> feriados = getFeriadosByAno(ano);
        return feriados.stream()
                .filter(f -> f.getDate().startsWith(ano + "-" + String.format("%02d", Integer.parseInt(mes))))
                .collect(Collectors.toList());
    }
}
