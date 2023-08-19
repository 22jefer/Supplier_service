/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.Supplier_service.Controller;

import com.Js.Supplier_service.Entity.Supplier;
import com.Js.Supplier_service.Service.Supplier_service;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Asus
 */

@RestController
@RequestMapping("/api/supplier")
@AllArgsConstructor
public class Supplier_controller {
    
    private final Supplier_service supplier_service;
    
    @PostMapping
    public Supplier saveSupplier(@RequestBody Supplier supplier){
        return supplier_service.saveSupplier(supplier);
    }
    
    @GetMapping("/{id}")
    public Supplier getSupplierById(@PathVariable Integer id){
        return supplier_service.getSupplierById(id);    
    }
    
    @GetMapping
    public List<Supplier> allSupplier(){
        return supplier_service.AllSupplier();
    }
    
    @PutMapping
    public Supplier updateSupplier(@RequestBody Supplier supplier){
        return supplier_service.updateSupplier(supplier);
    }
    
    @DeleteMapping
    public void deleteSupplier(@RequestBody Supplier supplier){
        supplier_service.deleteSupplier(supplier);  
    }
    
    @DeleteMapping("/{id}")
    public void  deletedSupplierById(@PathVariable Integer id){
        supplier_service.deleteSupplierById(id);  
    } 

}
