package com.ecommerce.library.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "order_detail")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_detail_id")
    private Long id;

    private int quantity;
    private double totalPrice;
    private double unitPrice;

<<<<<<< HEAD
    @ManyToOne(fetch = FetchType.LAZY)
=======
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
>>>>>>> da61d2c9141ab50b0045e63643740883e4fdd868
    @JoinColumn(name = "order_id", referencedColumnName = "order_id")
    private Order order;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    private Product product;
}