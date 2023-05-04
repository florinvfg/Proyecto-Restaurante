package com.aplication.restaurante.Servicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aplication.restaurante.Modelo.Mesa;
import com.aplication.restaurante.Repositorios.MesaRepository;

import java.util.List;
import java.util.Optional;

import javax.print.attribute.standard.Media;

@Service
public class MesaService {
   




    @Autowired
    private MesaRepository mesaRepository;

    public List<Mesa> findAll() {
        return mesaRepository.findAll();
    }

    public Mesa findById(Long id) {
        Optional<Mesa> optionalmesa = mesaRepository.findById(id);
        if (optionalmesa.isPresent()) {
            return optionalmesa.get();
        } else {
            throw new RuntimeException("Reparación no encontrada con el ID: " + id);
        }
    }

    public Mesa save(Mesa mesa) {
        return mesaRepository.save(mesa);
    }

    public Mesa update(Long id, Mesa mesa) {
        Mesa existingmesa = findById(id);
        existingmesa.setCliente(mesa.getCliente());
        existingmesa.setCamarero(mesa.getCamarero());
        existingmesa.setFechaEntrada(mesa.getFechaEntrada());
        existingmesa.setFechaSalida(mesa.getFechaSalida());
        existingmesa.setDescripcion(mesa.getDescripcion());
        existingmesa.setCosto(mesa.getCosto());
        return mesaRepository.save(existingmesa);
    }

    public void deleteById(Long id) {
        Mesa existingmesa = findById(id);
        mesaRepository.delete(existingmesa);
    }
}

