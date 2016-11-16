package com.sv.model;
// Generated 11-13-2016 06:54:17 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * UndidadEjecutora generated by hbm2java
 */
public class UndidadEjecutora  implements java.io.Serializable {


     private String idUndidadEjecutora;
     private String nombre;
     private String jefeEncargado;
     private Set proyectos = new HashSet(0);

    public UndidadEjecutora() {
    }

	
    public UndidadEjecutora(String idUndidadEjecutora) {
        this.idUndidadEjecutora = idUndidadEjecutora;
    }
    public UndidadEjecutora(String idUndidadEjecutora, String nombre, String jefeEncargado, Set proyectos) {
       this.idUndidadEjecutora = idUndidadEjecutora;
       this.nombre = nombre;
       this.jefeEncargado = jefeEncargado;
       this.proyectos = proyectos;
    }
   
    public String getIdUndidadEjecutora() {
        return this.idUndidadEjecutora;
    }
    
    public void setIdUndidadEjecutora(String idUndidadEjecutora) {
        this.idUndidadEjecutora = idUndidadEjecutora;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getJefeEncargado() {
        return this.jefeEncargado;
    }
    
    public void setJefeEncargado(String jefeEncargado) {
        this.jefeEncargado = jefeEncargado;
    }
    public Set getProyectos() {
        return this.proyectos;
    }
    
    public void setProyectos(Set proyectos) {
        this.proyectos = proyectos;
    }




}


