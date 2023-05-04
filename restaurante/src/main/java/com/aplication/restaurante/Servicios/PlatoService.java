package com.aplication.restaurante.Servicios;

import java.util.List;
import java.util.UUID;

import com.aplication.restaurante.Modelo.Plato;
import com.aplication.restaurante.Modelo.Plato.plato;
import com.aplication.restaurante.Repositorios.PlatoRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PlatoService {
    @Autowired
    private PlatoRepository platoRepository;

    // Encontrar todos los eventos
    public List<Plato> findAll() {
        return platoRepository.findAll();
    }

    // Encontrar evento por UUID en formato de cadena
    public Plato findByUuidString(String id) {
        return platoRepository.findByIdString(id); // Debe ser findByUuidString en lugar de findByIdString
    }

   
    //guardar eventos
    public void save(plato event) {
        platoRepository.saveAll(event);
    }

    //actualizar eventos
    public plato updateEvent(plato event) {
        return platoRepository.save(event);
    }


    public void save(Plato event) {
    }

  

    public plato findById(UUID id) {
        return null;
    }

   

    public void updateEvent(Plato event) {
    }
    
}
