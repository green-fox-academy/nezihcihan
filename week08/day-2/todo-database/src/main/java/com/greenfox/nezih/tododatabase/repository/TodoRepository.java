package com.greenfox.nezih.tododatabase.repository;


import com.greenfox.nezih.tododatabase.module.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
