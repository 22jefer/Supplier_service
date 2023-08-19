/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.Supplier_service.Service;

import com.Js.Supplier_service.Entity.Supplier;
import com.Js.Supplier_service.Repository.Supplier_repository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author Asus
 */

@Service
@AllArgsConstructor
public class Supplier_service {
    
    private final Supplier_repository supplier_repository;
    
    public Supplier saveSupplier(Supplier supplier){
        return supplier_repository.save(supplier);
    }
    
    public Supplier getSupplierById(Integer id){
        return supplier_repository.findById(id).get();
    }
    
    public List<Supplier> AllSupplier(){
        return supplier_repository.findAll();
    }
    
    public Supplier updateSupplier(Supplier supplier){
        return supplier_repository.save(supplier);
    }
    
    public void deleteSupplier(Supplier supplier){
        supplier_repository.delete(supplier);
    }
    
    public void deleteSupplierById(Integer id){
        supplier_repository.deleteById(id);
    }
    
}
