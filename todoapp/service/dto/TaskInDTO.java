package com.sacavix.todoapp.service.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TaskInDTO {

    private String title; //titulo de la tarea
    private String descripcion; //descripcion de la tarea
    private LocalDateTime eta; //fecha estimada de terminacion




}
