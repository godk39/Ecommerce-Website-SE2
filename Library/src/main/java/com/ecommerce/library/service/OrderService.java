package com.ecommerce.library.service;

import com.ecommerce.library.model.Order;

import java.util.List;
import com.ecommerce.library.model.ShoppingCart;


public interface OrderService {
    List<Order> findAll();
    Order findById(Long id);
    List<Order> findAllByActivated();
    void saveOrder(ShoppingCart cart);
    void acceptOrder(Long id);
    void cancelOrder(Long id);

}
