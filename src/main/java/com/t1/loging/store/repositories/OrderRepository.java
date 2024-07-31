package com.t1.loging.store.repositories;

import com.t1.loging.store.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
