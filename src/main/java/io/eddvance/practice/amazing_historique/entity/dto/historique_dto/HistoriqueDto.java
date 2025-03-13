package io.eddvance.practice.amazing_historique.entity.dto.historique_dto;

import java.time.LocalDateTime;

public class HistoriqueDto {
    private Long id;
    private Integer nombre;
    private String langue;
    private LocalDateTime dateRecherche;

    public HistoriqueDto() {
    }

    public HistoriqueDto(Long id, Integer nombre, String langue, LocalDateTime dateRecherche) {
        this.id = id;
        this.nombre = nombre;
        this.langue = langue;
        this.dateRecherche = dateRecherche;
    }

    public Long getId() {
        return id;
    }

    public Integer getNombre() {
        return nombre;
    }

    public void setNombre(Integer nombre) {
        this.nombre = nombre;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public LocalDateTime getDateRecherche() {
        return dateRecherche;
    }

    public void setDateRecherche(LocalDateTime dateRecherche) {
        this.dateRecherche = dateRecherche;
    }
}