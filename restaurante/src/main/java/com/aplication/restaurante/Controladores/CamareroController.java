package com.aplication.restaurante.Controladores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.aplication.restaurante.Modelo.Camarero;

import java.util.List;



public class CamareroController<RestauranteService, Restaurante> {
    @Controller
@RequestMapping("/restaurante")
public class RestauranteController {

    @Autowired
    private Camarero CamareroService;

    // Obtener todas las Camareros (GET)
    @GetMapping
    public ResponseEntity<List<Camarero>> getAllCamareros() {
        List<Camarero> Camareros = com.aplication.restaurante.Servicios.CamareroService.findAll();
        return new ResponseEntity<>(Camareros, HttpStatus.OK);
    }

    // Obtener una Camarero por ID (GET)
    @GetMapping("/{id}")
    public ResponseEntity<Camarero> getCamareroById(@PathVariable String id) {
        Camarero Camarero = com.aplication.restaurante.Modelo.Camarero.findById(id);
        return new ResponseEntity<>(Camarero, HttpStatus.OK);
    }

    // Obtener Camareros por marca (GET)
    @GetMapping("/marca")
    public ResponseEntity<List<Camarero>> getCamarerosPorMarca(@RequestParam String marca) {
        List<Camarero> Camareros = Camarero.findById(marca);
        return new ResponseEntity<>(Camareros, HttpStatus.OK);
    }

    //Obtener Camarero para editar en html
    @GetMapping("/detalle/{id}")
    public String verCamareroDetalle(@PathVariable Long id, Model model) {
        Camarero Camarero = CamareroService.findById(id);
        model.addAttribute("Camarero", Camarero);
        return "/views/Camareros/Camarero-detalle";
    }
    
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
public ResponseEntity<Camarero> createCamarero(@ModelAttribute Camarero Camarero) {
    Camarero newCamarero = CamareroService.save(Camarero);
    return new ResponseEntity<>(newCamarero, HttpStatus.CREATED);
}  

    // Actualizar una Camarero existente (PUT)
    @PutMapping("/{id}")
    public ResponseEntity<Camarero> updateCamarero(@PathVariable Long id, @RequestBody Camarero Camarero) {
        Camarero updatedCamarero = CamareroService.update(id, Camarero);
        return new ResponseEntity<>(updatedCamarero, HttpStatus.OK);
    }

    // Eliminar una Camarero por ID (DELETE)
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCamarero(@PathVariable Long id) {
        CamareroService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Creando la interfaz web
    public void CamareroController(Camarero CamareroService) {
        this.CamareroService = CamareroService;
    }

    @GetMapping("/listado-Camareros")
    public String listarCamareros(Model model) {
        List<Camarero> Camareros = CamareroService.findAll();
        model.addAttribute("Camareros", Camareros);
        model.addAttribute("Camarero", new Camarero(0, false, null, 0, null, null, null)); // Añade esta línea
        return "/views/Camareros/listado-Camareros";
    }

    public boolean isPresent() {
        return false;
    }

    public RestauranteController get() {
        return null;
    }

    public Object getModelo() {
        return null;
    }

    public void setModelo(Object modelo) {
    }

    public Object getMarca() {
        return null;
    }

    public void setMarca(Object marca) {
    }

    public Object getCliente() {
        return null;
    }

    public void setCliente(Object cliente) {
    }

    public void setId(RestauranteController restauranteController) {
    }

    /*
     * @GetMapping("/Camareros")
     * public String listarCamareros(Model model) {
     * List<Camarero> Camareros = CamareroService.findAll();
     * model.addAttribute("Camareros", Camareros);
     * return "listado-Camareros";
     * }
     */
  }
     
}

