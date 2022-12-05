/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practice.clt.service;

import com.practice.clt.mapper.TaskInDTOToTask;
import com.practice.clt.persistence.entity.Task;
import com.practice.clt.persistence.entity.repository.TaskRepository;
import com.practice.clt.service.dto.TaskInDTO;
import org.springframework.stereotype.Service;

/**
 *
 * @author aledesma
 */
@Service
public class TaskService {

    public TaskService(com.practice.clt.persistence.entity.repository.TaskRepository repository, com.practice.clt.mapper.TaskInDTOToTask mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }
    private final TaskRepository repository;
    private final TaskInDTOToTask mapper;
    
  
    public Task createTask (TaskInDTO taskInDTO){
        Task task = mapper.map(taskInDTO);
        return this.repository.save(task);

        
    }
    
    
}
