package com.example.todo.model;


import javax.persistence.*;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_ID")
    private int taskID ;

    private String taskName ;
    private String taskDescription;
    private String priority ;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_ID", nullable = false)
    private User userId ;

    public int getTaskID() { return taskID; }

    public void setTaskID(int taskID) { this.taskID = taskID; }

    public String getTaskName() { return taskName; }

    public void setTaskName(String taskName) { this.taskName = taskName; }

    public String getTaskDescription() { return taskDescription; }

    public void setTaskDescription(String taskDescription) { this.taskDescription = taskDescription; }

    public String getPriority() { return priority; }

    public void setPriority(String priority) { this.priority = priority; }

    public User getUserId() { return userId; }

    public void setUserId(User userId) { this.userId = userId; }
}
