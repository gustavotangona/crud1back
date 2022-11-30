/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tangona.crud1.controller;

import com.tangona.crud1.model.Tarea;
import com.tangona.crud1.service.TareaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 54387
 */
@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api")
public class TareaController {
    @Autowired
    private TareaService tareaService; 
    
    //listar
    @GetMapping("/tareas")
    public List<Tarea> listar(){
        
        return tareaService.findAll();
    }
    
    // Guardar
    @PostMapping("/tareas")
    
    public Tarea guardar(@RequestBody Tarea tarea){
        
        return tareaService.save(tarea);
    }
    
    //get una tarea
    @GetMapping("/tareas/{id}")
    public Tarea getUnaTarea(@PathVariable Integer id){
        
        return tareaService.findById(id);
    }
    
    //Modificar
    @PutMapping("/tareas/{id}")
    
    public Tarea modificar(@RequestBody Tarea tarea, @PathVariable Integer id){
        
        Tarea tareaActual= tareaService.findById(id);
        tareaActual.setTarea(tarea.getTarea());
        tareaActual.setFinalizado(tarea.getFinalizado());
        return tareaService.save(tareaActual);
        
    }
    
    // Eliminar
    @DeleteMapping("/tareas/{id}")
    
    public void eliminar(@PathVariable Integer id){
        
        tareaService.delete(id);
    }
    
            
    } 
