/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sv.model.*;
/**
 *
 * @author daniel
 */
@RestController
public class MyRestController {
    public static List<Proyecto> staticList =new ArrayList<Proyecto>();
    
    @RequestMapping(value="/list/all", method =RequestMethod.GET)
    public List<Proyecto> listAll(){
        return staticList;
    }
    
    @RequestMapping(value = "guardar", method = RequestMethod.POST, headers = "Accept=application/json")
    public @ResponseBody Boolean save(
      @RequestBody Proyecto jsonString) throws Exception {
    Proyecto model = new Proyecto();
    model.setNombre(jsonString.getNombre());
    model.setDescripcion(jsonString.getDescripcion());
    model.setComoRealizar(jsonString.getComoRealizar());
    model.setFechaInicio(jsonString.getFechaInicio());
    model.setFechaFin(jsonString.getFechaFin());
    model.setUbicacion(jsonString.getUbicacion());
    model.setPropocito(jsonString.getPropocito());
    model.setPresupuesto(jsonString.getPresupuesto());
    model.setId(staticList.size());
    staticList.add(model);
    return true;
  }
   @RequestMapping(value = "actualizar", method = RequestMethod.POST, headers = "Accept=application/json")
  public @ResponseBody Boolean update(@RequestBody Proyecto jsonString) throws Exception {
    staticList.get(jsonString.getId()).setNombre(jsonString.getNombre());
    staticList.get(jsonString.getId()).setDescripcion(jsonString.getDescripcion());
    return true;
  }
  @RequestMapping(value = "eliminar", method = RequestMethod.POST, headers = "Accept=application/json")
  public @ResponseBody Boolean delete (@RequestBody Proyecto jsonString) throws Exception {
    staticList.remove(jsonString.getId());
    return true;
  } 
    
}
