package com.example.demo.taco.data;

import com.example.demo.taco.model.Order;

public interface OrderRepository {

    Order save(Order order);
}
