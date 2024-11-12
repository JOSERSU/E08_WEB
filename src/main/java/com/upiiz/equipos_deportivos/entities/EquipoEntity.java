package com.upiiz.equipos_deportivos.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@JsonIgnoreProperties({"jugadores_entity", "entrenadores_entity", "competencias_entity"})
public class EquipoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    //un equipo pertenece solo a una liga
    @ManyToOne(targetEntity = LigaEntity.class)
    private LigaEntity liga;

    @OneToMany(targetEntity = JugadorEntity.class, fetch = FetchType.LAZY, mappedBy = "equipo")
    private List<JugadorEntity> jugadores;

    @OneToOne(targetEntity = EntrenadorEntity.class)
    private EntrenadorEntity entrenador;

    @ManyToMany(targetEntity = CompetenciaEntity.class, fetch = FetchType.LAZY)
    private List<CompetenciaEntity> competencias;
}
