package io.eddvance.practice.amazing_historique.controller.historique_controller;


import io.eddvance.practice.amazing_historique.entity.dto.historique_dto.HistoriqueDto;
import io.eddvance.practice.amazing_historique.service.HistoriqueServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/historique")
public class HistoriqueController {

    private final HistoriqueServiceInterface historiqueService;

    public HistoriqueController(HistoriqueServiceInterface historiqueService) {
        this.historiqueService = historiqueService;
    }

    @PostMapping("/add")
    public ResponseEntity<String> addHistorique(@RequestBody HistoriqueDto historiqueDto) {
        historiqueService.newHistorique(historiqueDto);
        String message = "Enregistrement réussi";
        return ResponseEntity.status(HttpStatus.CREATED).body(message);
    }
}