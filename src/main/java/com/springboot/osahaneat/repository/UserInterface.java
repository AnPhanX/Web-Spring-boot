package com.springboot.osahaneat.repository;

import com.springboot.osahaneat.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserInterface extends JpaRepository<Users,Integer> {
    List<Users> findByUserNameAndPassword (String username, String password);
}
