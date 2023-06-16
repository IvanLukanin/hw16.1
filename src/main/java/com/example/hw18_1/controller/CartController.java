package com.example.hw18_1.controller;

import com.example.hw18_1.service.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Set;

@RestController
@RequestMapping("/order")

public class CartController {
    private final CartService service;

    public CartController(CartService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public void add(@RequestParam("ID") Set<Integer> ids){
        service.add(ids);
    }
    @GetMapping("/add")
    public Collection<Integer> get(){
        return service.get();
    }
}