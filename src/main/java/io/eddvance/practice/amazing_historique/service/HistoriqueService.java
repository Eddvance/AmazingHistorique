package io.eddvance.practice.amazing_historique.service;

import io.eddvance.practice.amazing_historique.entity.historique.Historique;
import io.eddvance.practice.amazing_historique.entity.historique_dto.HistoriqueDto;
import io.eddvance.practice.amazing_historique.repository.HistoriqueRepositoryInterface;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class HistoriqueService implements HistoriqueServiceInterface {

    private final HistoriqueRepositoryInterface historiqueRepository;

    public HistoriqueService(HistoriqueRepositoryInterface historiqueRepository) {
        this.historiqueRepository = historiqueRepository;
    }

    @Override
    public void newHistorique(HistoriqueDto historiqueDto) {
        Historique historique = new Historique(historiqueDto.getNombre(), historiqueDto.getLangue(), LocalDateTime.now());
        historiqueRepository.save(historique);
        System.out.println(">> Historique inséré : id=" + historique.getId() + ", langue=" + historique.getLangue() + ", nombre=" + historique.getNombre() + ", localDateTime=" + historique.getLocalDateTime());
    }

    @Override
    public List<HistoriqueDto> getAllHistorique() {
        List<Historique> historiques = historiqueRepository.findAll();
        List<HistoriqueDto> list = new ArrayList<>();
        for (Historique historique : historiques) {
            HistoriqueDto historiqueDto = new HistoriqueDto(
                    historique.getId(),
                    historique.getNombre(),
                    historique.getLangue(),
                    historique.getLocalDateTime());
            list.add(historiqueDto);
        }
        return list;
    }
}