package com.greenfox.nezih.tododatabase.repository;


import com.greenfox.nezih.tododatabase.module.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
    List<Todo> findAllByIsDone(boolean isDone);
    List<Todo> findAllByTitle(String title);

}
