package com.greenfox.nezih.tododatabase.repository;

import com.greenfox.nezih.tododatabase.module.Assignee;
import com.greenfox.nezih.tododatabase.module.Todo;
import org.springframework.data.repository.CrudRepository;

public interface AssigneeRepository extends CrudRepository<Assignee, Long> {

}
