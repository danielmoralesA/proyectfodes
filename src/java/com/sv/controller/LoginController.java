/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sv.model.*;
/**
 *
 * @author daniel
 */


@Controller
//@RequestMapping("/login.htm")
public class LoginController {
    @RequestMapping(value="/login.htm",method = RequestMethod.GET)
    public String helloWorld(ModelMap modelMap) {
        System.out.println("on method");
        modelMap.put("printme", "Hello Spring !!");
        return "index";
    }
    @RequestMapping(value = "/proyectos",method = RequestMethod.GET)
    public String proyectos(ModelMap modelMap){
        return "proyectos";
    }
        
    
    


    }
