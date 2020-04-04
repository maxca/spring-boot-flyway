package com.samark.flywaymysql.product;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tbl_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    private String productName;
    private Integer quantity;
    private double price;
}
