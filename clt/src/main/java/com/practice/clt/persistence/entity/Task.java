/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practice.clt.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.Data;

/**
 *
 * @author aledesma
 */
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
