package io.eddvance.practice.amazing_historique.api;


import io.eddvance.practice.amazing_historique.entity.historique_dto.HistoriqueDto;
import io.eddvance.practice.amazing_historique.service.HistoriqueServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/historique")
public class HistoriqueResource {

    private final HistoriqueServiceInterface historiqueService;

    public HistoriqueResource(HistoriqueServiceInterface historiqueService) {
        this.historiqueService = historiqueService;
    }

    @PostMapping("/add")
    public ResponseEntity<String> addHistorique(@RequestBody HistoriqueDto historiqueDto) {
        historiqueService.newHistorique(historiqueDto);
        String message = "Enregistrement réussi";
        return ResponseEntity.status(HttpStatus.CREATED).body(message);
    }

    @GetMapping("/list")
    public ResponseEntity<List<HistoriqueDto>> getAllHistorique() {
        List<HistoriqueDto> historiques = historiqueService.getAllHistorique();
        return ResponseEntity.ok(historiques);
    }
}