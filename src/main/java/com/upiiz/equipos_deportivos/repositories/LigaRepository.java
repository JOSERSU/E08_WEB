package com.upiiz.equipos_deportivos.repositories;

import com.upiiz.equipos_deportivos.entities.EquipoEntity;
import com.upiiz.equipos_deportivos.entities.LigaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LigaRepository extends JpaRepository<LigaEntity, Long> {
    //Get by ID
    @Query("SELECT l FROM LigaEntity l WHERE l.id = :id")
    LigaEntity findLigaEntityById(@Param("id") Long id);
}
