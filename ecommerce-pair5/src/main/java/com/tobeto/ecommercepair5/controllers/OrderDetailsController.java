package com.tobeto.ecommercepair5.controllers;

import com.tobeto.ecommercepair5.services.abstracts.OrderDetailService;
import com.tobeto.ecommercepair5.services.dtos.requests.orderdetail.*;
import com.tobeto.ecommercepair5.services.dtos.responses.orderdetail.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orderdetails")
@AllArgsConstructor
public class OrderDetailsController {
    private OrderDetailService orderDetailService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AddOrderDetailResponse add(@RequestBody @Valid AddOrderDetailRequest request) {
        return orderDetailService.add(request);
    }

    @PutMapping
    public UpdateOrderDetailResponse update(@RequestBody @Valid UpdateOrderDetailRequest request) {
        return orderDetailService.update(request);
    }

    @DeleteMapping
    public DeleteOrderDetailResponse delete(@RequestParam @Valid int id) {
        return orderDetailService.delete(id);
    }

    @GetMapping
    public List<ListOrderDetailResponse> response() {
        return orderDetailService.getAll();
    }

    @GetMapping("/{getById}")
    public GetOrderDetailResponse getById(@PathVariable int getById) {
        return orderDetailService.getById(getById);
    }
}
