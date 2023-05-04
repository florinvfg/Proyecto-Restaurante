package com.aplication.restaurante.Controladores;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.aplication.restaurante.Modelo.Mesa;
import com.aplication.restaurante.Servicios.MesaService;

import javax.validation.Valid;
import java.util.List;

@Controller //se utiliza para construir aplicaciones web y devuelve vistas.
//@RestController // es una versión especializada de @Controller que se utiliza para construir servicios RESTful y devuelve directamente objetos JSON. incompatible con @Controller
@RequestMapping("/api/mesaes")
public class MesaController {

    @Autowired
    private MesaService mesaService;

    @GetMapping
    public ResponseEntity<List<Mesa>> getAllmesaes() {
        List<Mesa> mesaes = mesaService.findAll();
        return new ResponseEntity<>(mesaes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mesa> getmesaById(@PathVariable Long id) {
        Mesa mesa = mesaService.findById(id);
        return new ResponseEntity<>(mesa, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Mesa> createmesa(@Valid @RequestBody Mesa mesa) {
        Mesa newmesa = mesaService.save(mesa);
        return new ResponseEntity<>(newmesa, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Mesa> updatemesa(@PathVariable Long id, @Valid @RequestBody Mesa mesa) {
        Mesa updatedmesa = mesaService.update(id, mesa);
        return new ResponseEntity<>(updatedmesa, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletemesa(@PathVariable Long id) {
        mesaService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}


