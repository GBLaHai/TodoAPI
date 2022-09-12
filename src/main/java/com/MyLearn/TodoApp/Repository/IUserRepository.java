package com.MyLearn.TodoApp.Repository;

import com.MyLearn.TodoApp.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
}
