package consultaferiados.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
@NoArgsConstructor //gera um construtor sem argumentos para mim
@AllArgsConstructor //gera um construtor com todas as minhas variaveis como parametro

public class Feriados {

    @JsonProperty("date")
    private String data;

    @JsonProperty("name")
    private String nome;

    @JsonProperty("type")
    private String tipo;
}
