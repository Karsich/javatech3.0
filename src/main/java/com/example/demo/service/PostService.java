package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.PostRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;

    public List<Post> listAllPosts(){
        return StreamSupport.stream(postRepository.findAll().spliterator(), false).toList();
    }

    public PostService(){
    }
    public void create(String text) {
        Post post = new Post(null, text, new Date());
        postRepository.save(post);
    }
}
