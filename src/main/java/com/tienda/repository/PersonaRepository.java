/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.repository;

import com.tienda.entily.Pais;
import com.tienda.entily.Persona;import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Melissa Ruiz Cruz
 */
public interface PersonaRepository extends CrudRepository<Persona,Long>{
    
}
