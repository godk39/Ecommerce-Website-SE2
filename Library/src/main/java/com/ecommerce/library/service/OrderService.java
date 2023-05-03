package com.ecommerce.library.service;

import com.ecommerce.library.model.Category;
import com.ecommerce.library.model.Order;

import java.util.List;


public interface OrderService {
    List<Order> findAll();
    Order findById(Long id);
    void deleteById(Long id);
    List<Order> findAllByActivated();
}
