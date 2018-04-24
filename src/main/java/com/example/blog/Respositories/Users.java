package com.example.blog.Respositories;

import com.example.blog.Models.User;
import org.springframework.data.repository.CrudRepository;

public interface Users extends CrudRepository<User, Long>{
    User findByUsername(String username);
}
