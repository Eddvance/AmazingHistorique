package io.eddvance.practice.amazing_historique.service;

import io.eddvance.practice.amazing_historique.entity.dto.historique_dto.HistoriqueDto;

import java.util.List;

public interface HistoriqueServiceInterface {

    void newHistorique(HistoriqueDto historiqueDto);

    List<HistoriqueDto> getAllHistorique();
}