package com.example.todo.service;

import com.example.todo.model.Task;
import com.example.todo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository ;

    public List<Task> listAllTasks(){
        return taskRepository.findAll();
    }

    public Task findByTaskId(int id) {
        return taskRepository.findByTaskID(id) ;
    }

}
