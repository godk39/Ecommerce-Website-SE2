package com.ecommerce.admin.controller;
import com.ecommerce.library.model.Category;
import com.ecommerce.library.model.Order;
import com.ecommerce.library.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import java.security.Principal;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public String orders(Model model, Principal principal){
        if(principal == null){
            return "redirect:/login";
        }
        List<Order> orders = orderService.findAll();
        model.addAttribute("orders", orders);
        model.addAttribute("size", orders.size());
        model.addAttribute("title", "Manage Orders");
        return "orders";
    }


}
