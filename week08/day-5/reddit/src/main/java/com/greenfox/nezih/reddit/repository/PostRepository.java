package com.greenfox.nezih.reddit.repository;

import com.greenfox.nezih.reddit.module.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository  extends CrudRepository<Post, Long> {
    List<Post> findAllByContent(String content);
}
