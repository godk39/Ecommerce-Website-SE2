package com.ecommerce.library.repository;

import com.ecommerce.library.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD

public interface OrderRepository extends JpaRepository<Order, Long> {
=======
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    Order findById(long id);
>>>>>>> da61d2c9141ab50b0045e63643740883e4fdd868
}
