package com.t1.loging.services;

import com.t1.loging.model.OrderRequest;
import com.t1.loging.store.Order;
import com.t1.loging.store.User;
import com.t1.loging.store.repositories.OrderRepository;
import com.t1.loging.store.repositories.UserRepository;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class OrderService implements OrderServiceCommon {
    UserRepository userRepository;
    OrderRepository orderRepository;

    public OrderService(UserRepository userRepository, OrderRepository orderRepository) {
        this.userRepository = userRepository;
        this.orderRepository = orderRepository;
    }

    @Override
    public Long addOrderForUserName(OrderRequest orderRequest) {
        User user = userRepository.findByName(orderRequest.getUserName());
        Order order = new Order(orderRequest.getDescription(), orderRequest.getStatus(), user.getId());
        orderRepository.save(order);
        System.out.println("addOrderForUserName");
        return order.getId();
    }

    @Override
    public void addOrder(Order order) {
        orderRepository.save(order);
    }

    @Override
    public List<Order> getOrdersForUserId(Long id) {
        Optional<User> savedUser = userRepository.findById(id);
        if (savedUser.isPresent()) {
            return savedUser.get().getOrders();
        }
        return new ArrayList<>();
    }

    @Override
    public List<Order> getListOrdersById(Long id) {
        List<Order> orders = userRepository.findById(id).get().getOrders();
        return orders;
    }


}
