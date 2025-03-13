package io.eddvance.practice.amazing_historique.repository;

import io.eddvance.practice.amazing_historique.entity.historique.Historique;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoriqueRepositoryInterface extends JpaRepository<Historique, Long> {
}