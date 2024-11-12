package com.upiiz.equipos_deportivos.services;

import com.upiiz.equipos_deportivos.repositories.CompetenciaRepository;
import com.upiiz.equipos_deportivos.entities.CompetenciaEntity;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompetenciaService {
    @Autowired
    CompetenciaRepository competenciaRepository;

    public List<CompetenciaEntity> obtenerTodos() {
        return competenciaRepository.findAll();
    }

    public CompetenciaEntity guardarCompetencia(CompetenciaEntity competencia) {
        return competenciaRepository.save(competencia);
    }

    public Optional<CompetenciaEntity> obtenerCompetenciaPorId(Long id) {
        return Optional.ofNullable(competenciaRepository.findCompetenciaEntityById(id));
    }

    @Transactional
    public void deleteCompetencia(Long id) {
        competenciaRepository.deleteById(id);
    }

    public CompetenciaEntity actualizarCompetencia(CompetenciaEntity equipo) {
        return competenciaRepository.save(equipo);
    }
}

