package com.aplication.restaurante.Controladores;

    import java.util.List;
    import java.util.UUID;
    import java.time.format.DateTimeFormatter;
    import java.time.LocalTime;
    
    
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.ModelAttribute;
    import org.springframework.web.bind.annotation.PathVariable;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.RequestMapping;
    import com.aplication.restaurante.Modelo.Plato;
import com.aplication.restaurante.Servicios.PlatoService;
    
    @Controller
    @RequestMapping("/plato")


    public class PlatoController {
    
   
    
    
        @Autowired
        private PlatoService platoService;
    
        //Añadir Eventos
        @PostMapping
        public String saveEvent(@ModelAttribute("event") Plato event) {
            String hourString = event.getHour().toString();
            event.setHour(convertToLocalTime(hourString));
            platoService.save(event);
            return "redirect:/plato/listado-eventos";
        }
        
    
        // Obtener todos los eventos (GET)
        @GetMapping
        public ResponseEntity<List<Plato>> getAllplato() {
            List<Plato> eventos = platoService.findAll();
            return new ResponseEntity<>(eventos, HttpStatus.OK);
        }
    
        // Obtener un evento por ID (GET)
      
    
        // Método para listar eventos
    @GetMapping("/listado-eventos")
    public String listarEventos(Model model) {
        List<Plato> eventos = platoService.findAll();
        model.addAttribute("eventos", eventos);
        model.addAttribute("evento", new Plato());
        model.addAttribute("newEvento", new Plato()); // Añade esta línea aquí
        return "/views/plato/plato-list";
    }
     
        
    @GetMapping("/event-details/{id}")
    public String showEventDetails(@PathVariable("id") UUID id, Model model) {
        String uuidString = id.toString(); // Convertir UUID a String
        Plato event = platoService.findByUuidString(uuidString);
        model.addAttribute("evento", event);
        return "/views/plato/event-details";
    }
    
    @PostMapping("/update")
    public String updateEvent(@ModelAttribute("evento") Plato event) {
        platoService.updateEvent(event);
        return "redirect:/plato";
    }
    
        //Convertir hora
        private LocalTime convertToLocalTime(String hourString) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            return LocalTime.parse(hourString, formatter);
        }
    } 

