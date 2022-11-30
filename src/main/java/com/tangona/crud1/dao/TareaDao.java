/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tangona.crud1.dao;


import com.tangona.crud1.model.Tarea;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author 54387
 */
public interface TareaDao extends CrudRepository<Tarea,Integer> {
    
}
