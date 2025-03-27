package consultaferiados.controller;

import consultaferiados.model.Feriados;
import consultaferiados.service.FeriadosService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/feriados")
class FeriadosController {
    //feriadoService é a variável que guarda o meu objeto service que foi injetado pelo springboot.
    private final FeriadosService feriadosService;

    public FeriadosController(FeriadosService feriadosService) {
        this.feriadosService = feriadosService;
    }

    @GetMapping("/{ano}")
    public ResponseEntity<List<Feriados>> getFeriadosPorAno(@PathVariable String ano){
        try {
            List<Feriados> feriados = feriadosService.getFeriadosByAno(ano);
            return ResponseEntity.ok(feriados);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/{ano}/{mes}")
    public ResponseEntity<List<Feriados>> getFeriadosPorAnoEMes(@PathVariable String ano, @PathVariable String mes){
        try {
            List<Feriados> feriados = feriadosService.getFeriadosByAnoEMes(ano, mes);
            return ResponseEntity.ok(feriados);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
