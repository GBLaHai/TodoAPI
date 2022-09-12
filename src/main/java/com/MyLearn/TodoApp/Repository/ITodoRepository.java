package com.MyLearn.TodoApp.Repository;

import com.MyLearn.TodoApp.Entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITodoRepository extends JpaRepository<Todo, Long> {
}
