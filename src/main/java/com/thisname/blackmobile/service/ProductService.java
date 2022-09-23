package com.thisname.blackmobile.service;

import com.thisname.blackmobile.Models.Product;
import com.thisname.blackmobile.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // clase servidor
public class ProductService{

    @Autowired // Inyeccion de repositorio;
    private IProductRepository repository;

    public Product get(Integer id) { //busca un producto por id
        return repository.findById(id).get();
    }

    public List<Product> fiadAll() { //optiene una lista de productos de la base de datos
        return repository.findAll();
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }

    public void save(Product product){
        repository.save(product);
    }
}
