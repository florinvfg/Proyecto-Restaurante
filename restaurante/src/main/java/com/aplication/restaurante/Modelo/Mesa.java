package com.aplication.restaurante.Modelo;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


@Table(name = "mesa")
@Entity
public class Mesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "mesa_id")
    private Mesa mesa;

    @Column(name = "fecha_entrada")
    private LocalDateTime fechaEntrada;

    @Column(name = "fecha_salida")
    private LocalDateTime fechaSalida;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "costo")
    private Double costo;

   

    private Mesa Mesa;

    public void mesa() {
    }

    @Autowired
    public void mesa(Cliente cliente, Mesa mesa, LocalDateTime fechaEntrada, LocalDateTime fechaSalida,
            String descripcion, Double costo) {
        this.cliente = cliente;
        this.mesa = mesa;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.descripcion = descripcion;
        this.costo = costo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mesa getmesa() {
        return getmesa();
    }

    public void setmesa(Mesa mesa) {
        this.Mesa = mesa;
    }

    public LocalDateTime getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDateTime fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public Mesa save(Mesa existingmesa) {
        //creamos el metodo para guardar la mesa
        return null;
    }

    public void delete(Mesa existingmesa) {
    }

    public List<Mesa> findAll() {
        return null;
    }

    public Optional<Mesa> findById(Long id2) {
        return null;
    }

    public Object getCamarero() {
        return null;
    }

    public void setCamarero(Object camarero) {
    }


    
}

