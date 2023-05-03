package com.ecommerce.library.service;

import com.ecommerce.library.model.Order;
import com.ecommerce.library.model.ShoppingCart;

public interface OrderService {
    Order findById(long id);
    void saveOrder(ShoppingCart cart);
    void acceptOrder(Long id);
    void cancelOrder(Long id);
}
