package com.aplication.restaurante.Repositorios;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aplication.restaurante.Controladores.CamareroController.RestauranteController;
import com.aplication.restaurante.Modelo.Camarero;
public class CamareroRepository {
 

public interface RestauranteRepository extends JpaRepository<RestauranteController, Long> {
    List<RestauranteController> findByMarca(String marca);
}
}
