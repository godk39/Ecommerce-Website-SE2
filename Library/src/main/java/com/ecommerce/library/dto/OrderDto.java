package com.ecommerce.library.dto;

import com.ecommerce.library.model.Customer;
import com.ecommerce.library.model.OrderDetail;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

public class OrderDto {
    private Long id;
    private Date orderDate;
    private Date deliveryDate;
    private double totalPrice;
    private double shippingFee;
    private String orderStatus;
    private String notes;

    private Customer customer;

    private List<OrderDetail> orderDetailList;
}
