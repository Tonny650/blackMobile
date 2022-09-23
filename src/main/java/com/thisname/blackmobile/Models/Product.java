package com.thisname.blackmobile.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
@Getter @Setter
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tag;
    private String name;
    private String description;
    private String img;
    private double price;
    private float discount;


    public Product() {
    }

    public Product(Integer id, String tag, String name, String description, String img, double price, float discount) {
        this.id = id;
        this.tag = tag;
        this.name = name;
        this.description = description;
        this.img = img;
        this.price = price;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", tag='" + tag + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", img='" + img + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }

}
