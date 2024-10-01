package com.helen.api.service;


import com.helen.api.model.Comment;
import com.helen.api.model.Post;
import com.helen.api.repositoty.PostRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private static final Logger logger = LoggerFactory.getLogger(PostService.class);

    @Autowired
    private PostRepository postRepository;

    // Obtener todos los posts
    public Post[] getAllPosts() {
        return postRepository.getAllPosts();
    }

    public Comment getComment(int id){
        return postRepository.getCommentById(id);
    }

    public List<String> getNames(){

        List<String> list = new ArrayList<>();
        list.add("Alan");
        list.add("Nicky");
        list.add("Fatima");
        logger.info("Imprimiendo la lista de nombres {} exito", list);
        return list;
    }
}
