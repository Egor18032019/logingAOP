package com.t1.loging.services;

import com.t1.loging.model.OrderRequest;
import com.t1.loging.store.Order;

import java.util.List;

public interface OrderServiceCommon {
    //В этих сервисах добавьте простые методы для демонстрации AOP, например,
    // методы для создания пользователя и добавления заказа для пользователя.
    Long addOrderForUserName(OrderRequest orderRequest);

    void addOrder(Order order);

    List<Order> getOrdersForUserId(Long id);
    List<Order>  getListOrdersById(Long id);
}
