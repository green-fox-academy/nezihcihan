package com.greenfox.nezih.reddit;
import com.greenfox.nezih.reddit.module.Post;
import com.greenfox.nezih.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {

	@Autowired
	PostRepository postRepository;

	public static void main(String[] args) {
		SpringApplication.run(RedditApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		for (int i = 0; i <5 ; i++) {
			postRepository.save(new Post("post" + i, 1));
		}
	}
}


