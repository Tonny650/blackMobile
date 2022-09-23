package com.thisname.blackmobile.controller;


import com.thisname.blackmobile.Models.Product;
import com.thisname.blackmobile.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product") //Ruta de metodos para trabajar con los productos(CRUD)
public class ProductController {

    @Autowired //Inyeccion de la clase de servicio
    private ProductService service;

    //-----------------------------------
    @GetMapping("") /**Ruta del metodo*/
    public List<Product> listProduct(){   /**----Regresa una lista de products en formato JSON-------**/
        return service.fiadAll();
    }

    @GetMapping("/{id}") /**Ruta del metodo*/
    public ResponseEntity<Product> getProduct(@PathVariable Integer id){
        try {
            Product product = service.get(id);                          /**Busca Un producto por id y lo retorna*/
            return new ResponseEntity<Product>(product,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/save") /**Ruta del metodo*/
    public void saveProduct(@RequestBody Product product){ /**Guardar un nuevo producto en base de datos*/
        service.save(product);
        
    }

    @DeleteMapping("/delete/{id}") /**Ruta del metodo*/
    public void deleteProduct(@PathVariable Integer id){
        service.delete(id);
        /**Elimina un producto en db por id*/
    }

}
