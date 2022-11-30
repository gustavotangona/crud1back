/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tangona.crud1.service;

import com.tangona.crud1.dao.TareaDao;
import com.tangona.crud1.model.Tarea;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author 54387
 */
@Service
public class TareaServiceImp implements TareaService{
    @Autowired
    private TareaDao tareaDao;
    
    @Override
    @Transactional(readOnly= true)
    public List<Tarea> findAll(){
        return (List<Tarea>) tareaDao.findAll();
    }
    
    @Override
    @Transactional(readOnly= false)
    public Tarea save(Tarea tarea){
        return tareaDao.save(tarea);
        
    }
    
    @Override
    @Transactional(readOnly= true)
   public Tarea findById(Integer id){
       
      return tareaDao.findById(id).orElse(null);
   } 
   
    @Override
    @Transactional(readOnly= false)
   public void delete(Integer id){
       tareaDao.deleteById(id);
   }
    
}
