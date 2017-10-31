package com.greenfox.nezih.todos.repository;

import com.greenfox.nezih.todos.module.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
