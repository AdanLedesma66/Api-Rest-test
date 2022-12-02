/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.practice.clt.mapper;

/**
 *
 * @author aledesma
 */
public interface IMapper <I, O>{
    public O map(I in);
}
