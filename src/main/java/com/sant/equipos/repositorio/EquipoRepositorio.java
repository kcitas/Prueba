package com.sant.equipos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sant.equipos.entidades.Equipo;

public interface EquipoRepositorio extends JpaRepository<Equipo, Long> {
}
