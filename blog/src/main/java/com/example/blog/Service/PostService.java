package com.example.blog.Service;

import com.example.blog.Models.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private List<Post> posts;

    public PostService() {
        this.posts = new ArrayList<>();
        createPosts();
    }

    public List<Post> getAllPosts() {
        return posts;
    }

    public Post getPost(long id) {
        return posts.get(((int) id) -1);
    }

    public void createPosts() {
        posts.add(new Post("Test Title 1", "This is a test post"));
        posts.add(new Post("Test Title 2", "This is a test post"));
        posts.add(new Post("Test Title 3", "This is a test post"));
        posts.add(new Post("Test Title 4", "This is a test post"));
    }

}
