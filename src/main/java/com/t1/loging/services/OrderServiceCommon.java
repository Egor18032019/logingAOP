package com.t1.loging.services;

import com.t1.loging.store.Order;

public interface OrderServiceCommon {
    //В этих сервисах добавьте простые методы для демонстрации AOP, например,
    // методы для создания пользователя и добавления заказа для пользователя.
    void addOrderForUserName(String userName, Order order);

    void addOrderForUserId(Long userId, Order order);
}
