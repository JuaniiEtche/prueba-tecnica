package com.example.proyectoregistro.repository;

import com.example.proyectoregistro.entities.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {

    List<Reserva> findReservasByEstado(String estado);
}