package com.aplication.restaurante.Servicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.stereotype.Service;

import com.aplication.restaurante.Controladores.CamareroController.RestauranteController;
import com.aplication.restaurante.Modelo.Camarero;

import java.util.List;
import java.util.Optional;


@Service
public class CamareroService {
    @Autowired
    private static RevisionRepository RestauranteRepository;

    // Encontrar todas las Restaurantes
    public static List<Camarero> findAll() {
        return ((CamareroService) RestauranteRepository).findAll();
    }

    // Encontrar una Restaurante por ID
    public RestauranteController findById(Long id) {
        RestauranteController Restaurante = ((CamareroService) RestauranteRepository).findById(id);
        if (Restaurante.isPresent()) {
            return Restaurante.get();
        } else {
            throw new RuntimeException("Restaurante no encontrada con el ID: " + id);
        }
    }

    // Encontrar una Restaurante por marca
    public List<RestauranteController> findByMarca(String marca) {
        // Aquí puedes implementar la lógica para filtrar las Restaurantes por marca
        // Ejemplo: Utilizar un repositorio para buscar las Restaurantes con la marca especificada
        return ((CamareroService) RestauranteRepository).findByMarca(marca);
    }

    // Guardar una Restaurante
    public RestauranteController save(RestauranteController Restaurante) {
        return ((CamareroService) RestauranteRepository).save(Restaurante);
    }

    // Actualizar una Restaurante existente
    public RestauranteController update(Long id, RestauranteController RestauranteDetails) {
        RestauranteController Restaurante = findById(id);

        Restaurante.setModelo(RestauranteDetails.getModelo());
        Restaurante.setMarca(RestauranteDetails.getMarca());
        Restaurante.setId(RestauranteDetails.get());
        Restaurante.setCliente(RestauranteDetails.getCliente());

        return ((CamareroService) RestauranteRepository).save(Restaurante);
    }

    // Eliminar una Restaurante por ID
    public void delete(RestauranteController restaurante2) {
        RestauranteController Restaurante = findById(restaurante2);
        ((CamareroService) RestauranteRepository).delete(Restaurante);
    }

    private RestauranteController findById(RestauranteController restaurante2) {
        return null;
    }
}

