package com.example.todo.restService;

import com.example.todo.service.TaskService;
import com.example.todo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestService {

    @Autowired
    private UserService userService;
    @Autowired
    private TaskService taskService;

}
