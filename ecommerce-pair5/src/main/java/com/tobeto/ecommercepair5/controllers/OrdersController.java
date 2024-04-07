package com.tobeto.ecommercepair5.controllers;

import com.tobeto.ecommercepair5.services.abstracts.OrderService;
import com.tobeto.ecommercepair5.services.dtos.requests.orders.AddOrderRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.orders.UpdateOrderRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.orders.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@AllArgsConstructor
public class OrdersController {
    private OrderService orderService;

    @GetMapping
    public List<ListOrderResponse> getAll()
    {
        return orderService.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AddOrderResponse add(@RequestBody @Valid AddOrderRequest request)
    {
        return orderService.add(request);
    }

    @PutMapping
    public UpdateOrderResponse update(@RequestBody @Valid UpdateOrderRequest request)
    {
        return  orderService.update(request);
    }

    @DeleteMapping
    public DeleteOrderResponse delete(int id)
    {
        return orderService.delete(id);
    }

    @GetMapping(value = "/{id}")
    public GetOrderResponse getById(@PathVariable int id)
    {
        return orderService.getById(id);
    }

}
