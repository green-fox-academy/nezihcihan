package com.greenfox.nezih.tododatabase;

import com.greenfox.nezih.tododatabase.module.Assignee;
import com.greenfox.nezih.tododatabase.module.Todo;
import com.greenfox.nezih.tododatabase.repository.AssigneeRepository;
import com.greenfox.nezih.tododatabase.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoDatabaseApplication implements CommandLineRunner {
	@Autowired
	TodoRepository repository;
	@Autowired
	AssigneeRepository assigneeRepository;
	public static void main(String[] args) {
		SpringApplication.run(TodoDatabaseApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Todo("daily task",false,false));
		assigneeRepository.save(new Assignee("Nezih Ozsarac", "nezihcihan@hotmail.com"));
	}
}
