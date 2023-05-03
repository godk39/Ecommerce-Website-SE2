package com.ecommerce.admin.controller;
import com.ecommerce.library.model.Order;
import com.ecommerce.library.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

    @RequestMapping(value = "/accept-order/{id}", method = {RequestMethod.PUT, RequestMethod.GET})
    public String acceptOrder(@PathVariable("id") Long id, RedirectAttributes attributes) {
        try {
            orderService.acceptOrder(id);
            attributes.addFlashAttribute("success", "Accept successfully");
        } catch (Exception e) {
            e.printStackTrace();
            attributes.addFlashAttribute("failed", "Accept failed!");
        }
        return "redirect:/orders";
    }

    @RequestMapping(value = "/decline-order/{id}", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String declineOrder(@PathVariable("id") Long id, RedirectAttributes attributes) {
        try {
            orderService.cancelOrder(id);
            attributes.addFlashAttribute("success", "Decline successfully");
        } catch (Exception e) {
            e.printStackTrace();
            attributes.addFlashAttribute("failed", "Decline failed!");
        }
        return "redirect:/orders";
    }

}
