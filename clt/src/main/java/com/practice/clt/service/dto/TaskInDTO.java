/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practice.clt.service.dto;

import java.time.LocalDateTime;
import lombok.Data;

/**
 *
 * @author aledesma
 */
@Data
public class TaskInDTO {
    
    private String title; //titulo de la tarea
    private String descripcion; //descripcion de la tarea
    private LocalDateTime eta; //fecha estimada de terminacion

     
    
}
