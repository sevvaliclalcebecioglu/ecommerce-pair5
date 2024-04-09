package com.tobeto.ecommercepair5.controllers;

import com.tobeto.ecommercepair5.services.abstracts.OrderService;
import com.tobeto.ecommercepair5.services.dtos.responses.order.*;
import com.tobeto.ecommercepair5.services.dtos.requests.order.*;
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

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AddOrderResponse add(@RequestBody @Valid AddOrderRequest request) {
        return orderService.add(request);
    }

    @PutMapping
    public UpdateOrderResponse update(@RequestBody @Valid UpdateOrderRequest request) {
        return orderService.update(request);
    }

    @DeleteMapping
    public DeleteOrderResponse delete(@RequestParam @Valid int id) {
        return orderService.delete(id);
    }

    @GetMapping
    public List<ListOrderResponse> response() {
        return orderService.getAll();
    }

    @GetMapping("/{getById}")
    public GetOrderResponse getById(@PathVariable int getById) {
        return orderService.getById(getById);
    }
}
