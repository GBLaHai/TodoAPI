package com.MyLearn.TodoApp;

import com.MyLearn.TodoApp.Entity.Todo;
import com.MyLearn.TodoApp.Entity.User;
import com.MyLearn.TodoApp.Repository.ITodoRepository;
import com.MyLearn.TodoApp.Repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoAppApplication implements CommandLineRunner {

	@Autowired
	private IUserRepository userRepository;
	@Autowired
	private ITodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(TodoAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setUsername("Manh Hai");
		user.setPassword("123456");

		Todo todo = new Todo();
		todo.setContent("Learn Spring Boot");

		user.getTodoList().add(todo);

		userRepository.save(user);
	}
}
