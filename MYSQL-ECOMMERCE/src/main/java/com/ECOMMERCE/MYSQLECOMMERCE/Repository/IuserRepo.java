package com.ECOMMERCE.MYSQLECOMMERCE.Repository;

import com.ECOMMERCE.MYSQLECOMMERCE.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IuserRepo extends JpaRepository<User,Integer>{


    User findUserById(Integer id);
}
