package com.helen.api.repositoty;


import com.helen.api.model.Comment;
import com.helen.api.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class PostRepository {

    @Value("${API_URL}")
    private String apiUrl;

    @Value("${API_BASE_URL}")
    private String apiBaseURL;
    @Autowired
    private RestTemplate restTemplate;

    public Post[] getAllPosts() {
        return restTemplate.getForObject(apiUrl, Post[].class);
    }

    public Comment getCommentById(int id) {
        String url = apiBaseURL + id;
        return restTemplate.getForObject(url, Comment.class);
    }


}
