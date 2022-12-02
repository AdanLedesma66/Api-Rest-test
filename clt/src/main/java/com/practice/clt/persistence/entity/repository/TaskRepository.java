/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practice.clt.persistence.entity.repository;

import com.practice.clt.persistence.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author aledesma
 */
public interface TaskRepository extends JpaRepository<Task, Long>{
   
}
