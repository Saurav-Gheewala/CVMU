package com.falconx.Talon_Tech.repository;

import com.falconx.Talon_Tech.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User , Integer>  {
    User findByEmail(String email);
}
