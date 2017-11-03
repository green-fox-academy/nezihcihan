package com.greenfox.nezih.reddit.module;

import com.greenfox.nezih.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Component
public class PostService {
    @Autowired
    PostRepository postRepository;

    public void scoreUp(@PathVariable long id){
        Post post = postRepository.findOne(id);
        post.setScore(post.getScore()+1);
    }

    public void scoreDown(@PathVariable long id){
        Post post = postRepository.findOne(id);
        post.setScore(post.getScore() - 1);
    }
}
