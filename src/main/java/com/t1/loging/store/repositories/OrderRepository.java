package com.t1.loging.store.repositories;

import com.t1.loging.store.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findAllById(Long id);
}
