package com.upiiz.equipos_deportivos.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class JugadorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String edad;
    private String nacionalidad;
    private String posicion;

    @ManyToOne(targetEntity = EquipoEntity.class)
    private EquipoEntity equipo;

}
