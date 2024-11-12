package com.upiiz.equipos_deportivos.repositories;

import com.upiiz.equipos_deportivos.entities.EntrenadorEntity;
import com.upiiz.equipos_deportivos.entities.EquipoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipoRepository extends JpaRepository<EquipoEntity, Long> {
    //Get by ID
    @Query("SELECT eq FROM EquipoEntity eq WHERE eq.id = :id")
    EquipoEntity findEquipoEntityById(@Param("id") Long id);
}
