package com.ECOMMERCE.MYSQLECOMMERCE.Repository;

import com.ECOMMERCE.MYSQLECOMMERCE.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IaddRepo extends JpaRepository<Address,Integer> {
}
