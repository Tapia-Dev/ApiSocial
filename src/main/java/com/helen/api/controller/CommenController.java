package com.helen.api.controller;

import com.helen.api.model.Comment;
import com.helen.api.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/get/")
public class CommenController {

    @Autowired
    private PostService postService;


    // http://localhost:8080/api/get/1
    @GetMapping("/{id}")
    public ResponseEntity<Comment>getCommet(@PathVariable int id){
      return new ResponseEntity<Comment>(postService.getComment(id),HttpStatus.OK);
    }


}
