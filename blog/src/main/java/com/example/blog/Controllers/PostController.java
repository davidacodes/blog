package com.example.blog.Controllers;

import com.example.blog.Models.Post;
import com.example.blog.Service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    PostService postSvc;

    public PostController(PostService postSvc) {
        this.postSvc = postSvc;
    }


    @GetMapping("/posts")
    public String index(Model model) {
        model.addAttribute("posts", postSvc.getAllPosts());
        return "/Post/index";
    }

    @GetMapping("/posts/{id}")
    public String show(@PathVariable long id, Model model) {
        model.addAttribute("post", postSvc.getPost(id));
        return "/Post/show";
    }

//    GET	/posts/create	view the form for creating a post
        @RequestMapping(path ="/posts/create", method = RequestMethod.GET)
        @ResponseBody
        public String createGet(){
            return "Welcome to the form.";
        }


//    POST	/posts/create	create a new post
        @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
        @ResponseBody
        public String createPost() {
            return "Thanks for posting.";
        }
}
