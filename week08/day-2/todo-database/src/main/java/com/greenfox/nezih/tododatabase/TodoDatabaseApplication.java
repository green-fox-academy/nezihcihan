package com.greenfox.nezih.tododatabase;

import com.greenfox.nezih.tododatabase.module.Todo;
import com.greenfox.nezih.tododatabase.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoDatabaseApplication implements CommandLineRunner {
	@Autowired
	TodoRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(TodoDatabaseApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Todo("daily task",false,false));
		repository.save(new Todo("make the beds", true,true));
		repository.save(new Todo("do the washing up",true,false));
		repository.save(new Todo("clean the bathroom and the kitchen",true,true));
		repository.save(new Todo("wipe all the surfaces with cloth",true,false));
		repository.save(new Todo("remove the grease",true,true));
		repository.save(new Todo("tidy up",false,false));
		repository.save(new Todo("throw away the rubbish",true,true));
		repository.save(new Todo("broom",true,false));
		repository.save(new Todo("wash the floors",true,false));
		repository.save(new Todo("mop",true,true));
		repository.save(new Todo("vacuum the carpet",false,false));
		repository.save(new Todo("vacuum cleaner/hoover",true,true));
		repository.save(new Todo("dust the furniture",true,false));

	}
}
