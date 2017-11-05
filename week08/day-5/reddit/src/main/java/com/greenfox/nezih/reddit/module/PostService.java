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

    public void scoreUp(long id) {
        postRepository.findOne(id).setScore(postRepository.findOne(id).getScore() + 1);
        postRepository.save(postRepository.findOne(id));
    }

    public void scoreDown(long id) {
        postRepository.findOne(id).setScore(postRepository.findOne(id).getScore() - 1);
        postRepository.save(postRepository.findOne(id));
    }
}
