package com.t1.loging.controllers;

import com.t1.loging.model.OrderRequest;
import com.t1.loging.services.OrderService;
import com.t1.loging.store.Order;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/order")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class OrderControllers {
    OrderService orderService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<List<Order>> getOrder(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(orderService.getListOrdersById(id));
    }

    @PostMapping()
    public ResponseEntity<Long> greatTask(@RequestBody OrderRequest taskRequest) {
        Long id = orderService.addOrderForUserName(taskRequest);
        return ResponseEntity.status(HttpStatus.OK).body(id);
    }

}
