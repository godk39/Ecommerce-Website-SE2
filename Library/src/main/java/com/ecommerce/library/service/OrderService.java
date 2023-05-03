package com.ecommerce.library.service;

<<<<<<< HEAD
import com.ecommerce.library.model.Category;
import com.ecommerce.library.model.Order;

import java.util.List;


public interface OrderService {
    List<Order> findAll();
    Order findById(Long id);
    void deleteById(Long id);
    List<Order> findAllByActivated();
=======
import com.ecommerce.library.model.Order;
import com.ecommerce.library.model.ShoppingCart;

public interface OrderService {
    Order findById(long id);
    void saveOrder(ShoppingCart cart);
    void acceptOrder(Long id);
    void cancelOrder(Long id);
>>>>>>> da61d2c9141ab50b0045e63643740883e4fdd868
}
