package com.example.blog.Respositories;

import com.example.blog.Models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository <Post, Long> {
    Post findById(long id);
}
