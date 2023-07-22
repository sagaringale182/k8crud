package com.k8crudmysql1.k8crud.repository;

import com.k8crudmysql1.k8crud.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
