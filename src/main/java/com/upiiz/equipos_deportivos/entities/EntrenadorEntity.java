package com.upiiz.equipos_deportivos.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@JsonIgnoreProperties("equipos_entity")
public class EntrenadorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String edad;
    private String nacionalidad;

    @OneToOne(mappedBy = "entrenador")
    private EquipoEntity equipo;

}
