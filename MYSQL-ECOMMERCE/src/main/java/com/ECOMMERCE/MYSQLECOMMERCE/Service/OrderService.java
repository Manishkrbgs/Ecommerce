package com.ECOMMERCE.MYSQLECOMMERCE.Service;

import com.ECOMMERCE.MYSQLECOMMERCE.Model.OrderEntity;
import com.ECOMMERCE.MYSQLECOMMERCE.Repository.IorderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    IorderRepo iorderRepo;
    public void addOrder(OrderEntity orderEntity) {
        iorderRepo.save(orderEntity);
    }

    public Optional<OrderEntity> getorderbyid(Integer id) {
        return iorderRepo.findById(id);
    }
}
