package com.aplication.restaurante.Modelo;
import javax.persistence.Id;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
@Table(name = "restaurante")
@Entity

   
   
    

    public class Camarero implements List<Camarero> {
        
        @Column(name = "nombre")
        private String nombre;
        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private int id;
        
        @Column(name = "puesto")
        private String puesto;
        
        @Column(name = "direccion")
        private String direccion;
        
        @Column(name = "telefono")
        private String telefono;
        // Atributos de Camarero
        private int numMesasAsignadas;
        public Camarero(int numMesasAsignadas, boolean tienePropinas, String nombre, int id, String puesto,
                String direccion, String telefono) {
            this.numMesasAsignadas = numMesasAsignadas;
            this.nombre = nombre;
            this.id = id;
            this.puesto = puesto;
            this.direccion = direccion;
            this.telefono = telefono;
        }
    
        public String getNombre() {
            return nombre;
        }
    
    
    
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
    
    
    
        public int getId() {
            return id;
        }
    
    
    
    
        public void setId(int id) {
            this.id = id;
        }
    
    
    
    
        public String getPuesto() {
            return puesto;
        }
    
    
    
    
        public void setPuesto(String puesto) {
            this.puesto = puesto;
        }
    
    
    
    
        public String getDireccion() {
            return direccion;
        }
    
    
    
    
        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }
    
    
    
    
        public String getTelefono() {
            return telefono;
        }
    
    
    
    
        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
    
       
    
        // Constructor de Camarero
        public Camarero(String nombre, int id, String puesto, String direccion, String telefono, int numMesasAsignadas, boolean tienePropinas) {
            super();
            this.numMesasAsignadas = numMesasAsignadas;
            
        }
        
    
        
    
        public Camarero(int i, String string, String string2, String string3, int j, String string4) {
        }
    
    
    
    
        // Métodos Getter y Setter de Camarero
        public int getNumMesasAsignadas() {
            return numMesasAsignadas;
        }
        
        public void setNumMesasAsignadas(int numMesasAsignadas) {
            this.numMesasAsignadas = numMesasAsignadas;
        }

        public static Camarero findById(String marca) {
            return null;
        }

        public Camarero findById(Long id2) {
            return null;
        }

        public Camarero save(Camarero camarero) {
            return null;
        }

        public void delete(Long id2) {
        }

        public List<Camarero> findAll() {
            return null;
        }

        public Camarero update(Long id2, Camarero camarero) {
            return null;
        }

        @Override
        public boolean add(Camarero arg0) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'add'");
        }

        @Override
        public void add(int arg0, Camarero arg1) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'add'");
        }

        @Override
        public boolean addAll(Collection<? extends Camarero> arg0) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'addAll'");
        }

        @Override
        public boolean addAll(int arg0, Collection<? extends Camarero> arg1) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'addAll'");
        }

        @Override
        public void clear() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'clear'");
        }

        @Override
        public boolean contains(Object arg0) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'contains'");
        }

        @Override
        public boolean containsAll(Collection<?> arg0) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'containsAll'");
        }

        @Override
        public Camarero get(int arg0) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'get'");
        }

        @Override
        public int indexOf(Object arg0) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'indexOf'");
        }

        @Override
        public boolean isEmpty() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
        }

        @Override
        public Iterator<Camarero> iterator() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'iterator'");
        }

        @Override
        public int lastIndexOf(Object arg0) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'lastIndexOf'");
        }

        @Override
        public ListIterator<Camarero> listIterator() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
        }

        @Override
        public ListIterator<Camarero> listIterator(int arg0) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
        }

        @Override
        public boolean remove(Object arg0) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'remove'");
        }

        @Override
        public Camarero remove(int arg0) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'remove'");
        }

        @Override
        public boolean removeAll(Collection<?> arg0) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'removeAll'");
        }

        @Override
        public boolean retainAll(Collection<?> arg0) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'retainAll'");
        }

        @Override
        public Camarero set(int arg0, Camarero arg1) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'set'");
        }

        @Override
        public int size() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'size'");
        }

        @Override
        public List<Camarero> subList(int arg0, int arg1) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'subList'");
        }

        @Override
        public Object[] toArray() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'toArray'");
        }

        @Override
        public <T> T[] toArray(T[] arg0) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'toArray'");
        }
       
        
    
      
    }

