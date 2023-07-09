package com.ECOMMERCE.MYSQLECOMMERCE.Repository;

import com.ECOMMERCE.MYSQLECOMMERCE.Model.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IorderRepo extends JpaRepository<OrderEntity,Integer>{
}
