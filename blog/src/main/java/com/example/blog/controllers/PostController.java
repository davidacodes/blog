package com.example.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {



//    GET	/posts	posts index page
        @GetMapping("/posts")
        @ResponseBody
        public String posts() {
            return "Welcome to the posts!";
        }


//    GET	/posts/{id}	view an individual post
        @GetMapping("/posts/{id}")
        @ResponseBody
        public String getPost(@PathVariable String id) {
            return "Welcome to post: " + id;
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
