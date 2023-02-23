/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service;

import com.tienda.entily.Pais;
import com.tienda.repository.PaisRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Melissa Ruiz Cruz
 */
@Service
public class PaisService implements IPaisService {
    
    @Autowired 
    private PaisRepository paisRepository;
    
    @Override //Se re escribe sobre el metodo
    public List<Pais> listCountry() {
        return (List<Pais>)paisRepository.findAll(); }//El findAll viene de repository
    
}
