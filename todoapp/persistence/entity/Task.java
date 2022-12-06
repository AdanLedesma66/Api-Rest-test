package com.sacavix.todoapp.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Data
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title; //titulo de la tarea
    private String descripcion; //descripcion de la tarea
    private LocalDateTime createDate; //fecha de creacion de la tarea
    private LocalDateTime eta; //fecha estimada de terminacion
    private boolean finished; //Tarea terminada
    private TaskStatus taskStatus; //Estado de la tarea


}

