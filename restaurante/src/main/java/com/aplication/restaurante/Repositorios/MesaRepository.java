package com.aplication.restaurante.Repositorios;


    import org.springframework.data.jpa.repository.JpaRepository;

import com.aplication.restaurante.Modelo.Mesa;


public interface MesaRepository extends JpaRepository<Mesa, Long> {
}

