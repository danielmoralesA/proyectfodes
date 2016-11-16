package com.sv.model;
// Generated 11-13-2016 06:54:17 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Proyecto generated by hbm2java
 */
public class Proyecto  implements java.io.Serializable {


     private Integer id;
     private UndidadEjecutora undidadEjecutora;
     private String nombre;
     private String descripcion;
     private String comoRealizar;
     private Date fechaInicio;
     private Date fechaFin;
     private String ubicacion;
     private String propocito;
     private Float presupuesto;
     private Float cantidadUsada;
     private Set informeses = new HashSet(0);
     private Set actividadeses = new HashSet(0);

    public Proyecto() {
    }

	
    public Proyecto(UndidadEjecutora undidadEjecutora) {
        this.undidadEjecutora = undidadEjecutora;
    }
    public Proyecto(UndidadEjecutora undidadEjecutora, String nombre, String descripcion, String comoRealizar, Date fechaInicio, Date fechaFin, String ubicacion, String propocito, Float presupuesto, Float cantidadUsada, Set informeses, Set actividadeses) {
       this.undidadEjecutora = undidadEjecutora;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.comoRealizar = comoRealizar;
       this.fechaInicio = fechaInicio;
       this.fechaFin = fechaFin;
       this.ubicacion = ubicacion;
       this.propocito = propocito;
       this.presupuesto = presupuesto;
       this.cantidadUsada = cantidadUsada;
       this.informeses = informeses;
       this.actividadeses = actividadeses;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public UndidadEjecutora getUndidadEjecutora() {
        return this.undidadEjecutora;
    }
    
    public void setUndidadEjecutora(UndidadEjecutora undidadEjecutora) {
        this.undidadEjecutora = undidadEjecutora;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getComoRealizar() {
        return this.comoRealizar;
    }
    
    public void setComoRealizar(String comoRealizar) {
        this.comoRealizar = comoRealizar;
    }
    public Date getFechaInicio() {
        return this.fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public Date getFechaFin() {
        return this.fechaFin;
    }
    
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    public String getUbicacion() {
        return this.ubicacion;
    }
    
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public String getPropocito() {
        return this.propocito;
    }
    
    public void setPropocito(String propocito) {
        this.propocito = propocito;
    }
    public Float getPresupuesto() {
        return this.presupuesto;
    }
    
    public void setPresupuesto(Float presupuesto) {
        this.presupuesto = presupuesto;
    }
    public Float getCantidadUsada() {
        return this.cantidadUsada;
    }
    
    public void setCantidadUsada(Float cantidadUsada) {
        this.cantidadUsada = cantidadUsada;
    }
    public Set getInformeses() {
        return this.informeses;
    }
    
    public void setInformeses(Set informeses) {
        this.informeses = informeses;
    }
    public Set getActividadeses() {
        return this.actividadeses;
    }
    
    public void setActividadeses(Set actividadeses) {
        this.actividadeses = actividadeses;
    }




}

