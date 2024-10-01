package com.helen.api.controller;


import com.helen.api.model.Post;
import com.helen.api.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @Autowired
    private PostService postService;


    //http://localhost:8080/api/post
    @GetMapping("/api/post")
    public Post[] getAllPosts() {
        return postService.getAllPosts();
    }




}
