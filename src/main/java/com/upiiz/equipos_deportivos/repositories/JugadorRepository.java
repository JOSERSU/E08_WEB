package com.upiiz.equipos_deportivos.repositories;

import com.upiiz.equipos_deportivos.entities.EquipoEntity;
import com.upiiz.equipos_deportivos.entities.JugadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface JugadorRepository extends JpaRepository<JugadorEntity, Long> {
    //Get by ID
    @Query("SELECT j FROM JugadorEntity j WHERE j.id = :id")
    JugadorEntity findJugadorEntityById(@Param("id") Long id);
}
