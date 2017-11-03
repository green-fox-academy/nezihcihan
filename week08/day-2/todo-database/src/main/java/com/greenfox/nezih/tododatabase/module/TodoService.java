package com.greenfox.nezih.tododatabase.module;

import com.greenfox.nezih.tododatabase.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TodoService {


    @Autowired
    TodoRepository todoRepository;

    public List<Todo> findByTitle(String title) {
        return todoRepository.findAllByTitle(title);
    }

    public List<Todo> findActive(boolean isDone) {
        return todoRepository.findAllByIsDone(isDone);
    }

   
}