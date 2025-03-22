package io.eddvance.practice.amazing_historique.entity.historique;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "historique")
public class Historique {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, name = "nombre")
    private int nombre;
    @Column(nullable = false, name = "langue")
    private String langue;
    @Column(nullable = false, name = "local_date_time")
    private LocalDateTime localDateTime;

    public Historique() {
    }

    public Historique(int nombre, String langue, LocalDateTime localdateTime) {
        this.nombre = nombre;
        this.langue = langue;
        this.localDateTime = localdateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
