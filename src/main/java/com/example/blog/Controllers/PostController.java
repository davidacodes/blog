package com.example.blog.Controllers;

import com.example.blog.Models.Post;
import com.example.blog.Service.PostService;
import com.example.blog.Respositories.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    private final PostService postSvc;
    private final PostRepository postDao;

    public PostController(PostService postSvc, PostRepository postDao) {
        this.postSvc = postSvc;
        this.postDao = postDao;
    }

    @GetMapping(path = "/")
    public String home() {
        return "redirect:/posts";
    }




    @GetMapping(path = "/posts")
    public String index(Model model) {
        model.addAttribute("posts", postDao.findAll());
        return "posts/index";
    }

    @GetMapping(path = "/posts/{id}")
    public String show(@PathVariable long id, Model model) {
        model.addAttribute("post", postSvc.getPost(id));
        return "posts/show";
    }

    // Create a post

    @GetMapping (path = "/posts/create")
    public String getCreate(Model model){
        model.addAttribute("post", new Post());
        return "posts/create";
    }

    @PostMapping (path = "/posts/create")
    public String createPost(@ModelAttribute Post post) {
        postDao.save(post);
        return "redirect:/posts";
    }


    // Editing a post



    @GetMapping(path = "/posts/{id}/edit")
    public String getEdit(Model model, @PathVariable long id) {
        model.addAttribute("post", postDao.findById(id));
        return "/posts/edit";
    }

    @PostMapping(path = "/posts/edit")
    public String handleEdit(@ModelAttribute Post post){
        Post editedPost = postDao.findById(post.getId());
        editedPost.setTitle(post.getTitle());
        editedPost.setBody(post.getBody());
        postDao.save(post);
        return "redirect:/posts";
    }

    @PostMapping(path = "/posts/{id}/delete")
    public String deletePost(@PathVariable long id){
        postDao.delete(id);
        return "redirect:/posts";
    }
}
