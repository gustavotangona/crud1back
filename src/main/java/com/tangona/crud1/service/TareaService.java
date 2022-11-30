/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tangona.crud1.service;

import com.tangona.crud1.model.Tarea;
import java.util.List;

/**
 *
 * @author 54387
 */
public interface TareaService {
    public List<Tarea> findAll();
    public Tarea save(Tarea tarea);
    public Tarea findById(Integer id);
    public void delete(Integer id);
    
}
