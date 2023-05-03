package com.ecommerce.library.service.impl;

import com.ecommerce.library.model.Order;
import com.ecommerce.library.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public List<Order> findAll() {
        return null;
    }

    @Override
    public Order findById(Long id) {
        return null;
    }


    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<Order> findAllByActivated() {
        return null;
    }
}
