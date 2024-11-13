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
@Table(name = "ligas")
@JsonIgnoreProperties("equipos_entity")
public class LigaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String pais;
    private String presidente;


    //Una liga tiene muchos equipos
    //////@OneToMany(targetEntity = EquipoEntity.class, fetch = FetchType.LAZY, mappedBy = "liga")
    /////private List<EquipoEntity> equipos;

}
