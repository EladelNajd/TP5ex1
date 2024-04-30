/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5;

/**
 *
 * @author LENOVO
 */
public abstract class  BaseModel implements MachineLearningModel{
    public String name;
    public int version;
    public String description;
    public String device;

    void displayDetails(){
       System.out.println("name :"+this.name+" version: "+this.version+" description:"+this.description+" device :"+this.device);
    }

  
}
