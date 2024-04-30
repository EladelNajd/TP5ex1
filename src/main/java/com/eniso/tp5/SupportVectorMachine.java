/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5;

/**
 *
 * @author LENOVO
 */
public class SupportVectorMachine extends BaseModel {
    public int iterations;
    public double learningRate;

    public SupportVectorMachine(String name, int iterations, double learningRate) {
        this.name= name;
        this.iterations=iterations;
        this.learningRate=learningRate;
        
    }
    
    
    
    @Override
    public void train(Dataset dataset){
        System.out.println("support ");
    }


    @Override
     public double predict(Dataset dataset){
        return 3.14;
    }
}
