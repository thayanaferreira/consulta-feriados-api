package consultaferiados.service;

import consultaferiados.model.Feriados;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FeriadosService {
    //endpois da api externa, onde é so adicionar o ano. ex: https://brasilapi.com.br/api/feriados/v1/2025
    private static final String API_URL = "https://brasilapi.com.br/api/feriados/v1/";

    //lista filtrada por ano
    public List<Feriados> getFeriadosByAno(String ano) {
        RestTemplate restTemplate = new RestTemplate();
        Feriados[] feriados = restTemplate.getForObject(API_URL + ano, Feriados[].class);
        assert feriados != null;
        return List.of(feriados);
    }

    //lista filtrada por ano e mes
    public List<Feriados> getFeriadosByAnoEMes(String ano, String mes) {
        List<Feriados> feriados = getFeriadosByAno(ano);
        return feriados.stream()
                .filter(f -> f.getDate().startsWith(ano + "-" + String.format("%02d", Integer.parseInt(mes))))
                .collect(Collectors.toList());
    }
}
