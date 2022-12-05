/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practice.clt.controller;

import com.practice.clt.persistence.entity.Task;
import com.practice.clt.service.TaskService;
import com.practice.clt.service.dto.TaskInDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author aledesma
 */
@RestController    
@RequestMapping("/tasks")
public class TaskController {

    public TaskController(com.practice.clt.service.TaskService taskService) {
        this.taskService = taskService;
    }
    private final TaskService taskService;
    
    @PostMapping
    public Task createTask(@RequestBody TaskInDTO taskInDTO){
       return this.taskService.createTask(taskInDTO);
    }
    
    
}
