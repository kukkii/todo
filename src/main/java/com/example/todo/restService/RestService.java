package com.example.todo.restService;

import com.example.todo.model.Task;
import com.example.todo.model.User;
import com.example.todo.service.TaskService;
import com.example.todo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestService {

    @Autowired
    private UserService userService;
    @Autowired
    private TaskService taskService;


    @RequestMapping(value = "/tasks", method = RequestMethod.GET)
    public ResponseEntity<List<Task>> listAllTasks() {
        List<Task> task = taskService.listAllTasks();
        if (task.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(task, HttpStatus.OK);
    }

    @RequestMapping(value = "/task", method = RequestMethod.GET)
    public ResponseEntity<Task> getUser(@RequestParam("taskId") int taskId) {
        Task task = taskService.findByTaskId(taskId);
        if (task == null) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(task, HttpStatus.OK);
    }

    @RequestMapping(value = "/userNameConfirmation", method = RequestMethod.GET)
    public ResponseEntity<User> getUser(@RequestParam("userName") String userName) {
        User user = userService.findByUserName(userName);
        if (user == null) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
