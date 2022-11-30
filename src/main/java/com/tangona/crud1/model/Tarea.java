
package com.tangona.crud1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tb_tarea")

@SuppressWarnings({"PersistenceUnitPresent", "SerializableClass"})
public class Tarea {
    
  @Id
  @Column(name="Id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  
  @Column(name="Tarea")
  private String ntarea;
  
  @Column(name="Finalizado")
  private Boolean finalizado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTarea() {
        return ntarea;
    }

    public void setTarea(String ntarea) {
        this.ntarea = ntarea;
    }

    public Boolean getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(Boolean finalizado) {
        this.finalizado = finalizado;
    }
  
  
    
    
}
