/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practice.clt.mapper;

import com.practice.clt.persistence.entity.Task;
import com.practice.clt.persistence.entity.TaskStatus;
import com.practice.clt.service.dto.TaskInDTO;
import java.time.LocalDateTime;
import org.springframework.stereotype.Component;

/**
 *
 * @author aledesma
 */
@Component
public class TaskInDTOToTask implements IMapper<TaskInDTO, Task>{
    
    
    @Override
    public Task map(TaskInDTO in) {
        Task task = new Task();
        task.setTitle(in.getTitle());
        task.setDescripcion(in.getDescripcion());
        task.setEta(in.getEta());
        task.setEta(LocalDateTime.now());
        task.setFinished(false);
        task.setTaskStatus(TaskStatus.ON_TIME);
        return task;
    }
    
}
