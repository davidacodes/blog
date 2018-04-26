package com.example.blog.Service;

import com.example.blog.Models.Post;
import com.example.blog.Respositories.PostRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private final PostRepository postDao;

    public PostService(PostRepository postDao) {
        this.postDao = postDao;
    }

    public Post findOne(long id) {
        return postDao.findOne(id);
    }

    public Iterable<Post> findAll() {
        return postDao.findAll();
    }

    public void save(Post post) {
        postDao.save(post);
    }

//    public void delete(long id) {
//        postDao.deleteById(id);
//    }



//    private List<Post> posts;
//
//    public PostService() {
//        this.posts = new ArrayList<>();
//        createPosts();
//    }
//
//    public List<Post> getAllPosts() {
//        return posts;
//    }
//
//    public void save (Post post){
//        //Set id based on length
//        post.setId(posts.size());
//        // Add post to post list
//        posts.add(post);
//    }
//
//    public Post getPost(long id) {
//        return posts.get(((int) id) -1);
//    }
//
//    public void createPosts() {
//        posts.add(new Post("Test Title 1", "This is a test post"));
//        posts.add(new Post("Test Title 2", "This is a test post"));
//        posts.add(new Post("Test Title 3", "This is a test post"));
//        posts.add(new Post("Test Title 4", "This is a test post"));
//    }

}
