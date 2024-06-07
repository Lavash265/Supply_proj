package org.example.supplyes_project.controller;

import org.example.supplyes_project.interfaces.DeliveryService;
import org.example.supplyes_project.models.Delivery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/deliveries")
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    @GetMapping
    public String getAllDeliveries(Model model) {
        List<Delivery> deliveries = deliveryService.getAllDeliveries();
        model.addAttribute("deliveries", deliveries);
        return "delivery-list";
    }

    @GetMapping("/add-deliveries")
    public String createDeliveriesForm(Model model) {
        model.addAttribute("deliveries", new Delivery());
        return "add-delivery";
    }

    @PostMapping("/add-deliveries")
    public String saveDelivery(@ModelAttribute Delivery delivery) {
        deliveryService.saveDelivery(delivery);
        return "redirect:/deliveries";
    }

    @GetMapping("/{id}")
    public Delivery getDeliveryById(@PathVariable int id) {
        return deliveryService.getDeliveryById(id);
    }

    @GetMapping("/update-delivery/{id}")
    public String getUpdateDeliveryView(Model model, @PathVariable int id) {
        Delivery delivery = new Delivery();
        delivery.setId(id);
        model.addAttribute("delivery", delivery);
        return "update-supplier";
    }

    @PostMapping("/update-delivery")
    public String updateDelivery(@ModelAttribute Delivery delivery) {
        deliveryService.updateDelivery(delivery);
        return "redirect:/deliveries";
    }

    @GetMapping("/delite-delivery/{id}")
    public String deleteDelivery(@PathVariable int id) {
        deliveryService.deleteDelivery(id);
        return "redirect:/deliveries";
    }
}