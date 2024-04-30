/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5;

/**
 *
 * @author LENOVO
 */
public class NeuralNetwork extends BaseModel {
    public int[] layers ;
    public String activationFunction;

    public NeuralNetwork(String device, int[] layers, String activationFunction) {
       this.device=device;
        this.layers = layers;
        this.activationFunction = activationFunction;
       
        
    }

   
     @Override
    public void train(Dataset dataset){
        System.out.println("reseau ");
    }
    @Override
     public double predict(Dataset dataset){
        return 3.11111;
    }
    
}
