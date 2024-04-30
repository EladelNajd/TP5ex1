/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5;

/**
 *
 * @author LENOVO
 */
public class RegressionDataset extends Dataset {
    public int numFeatures;
    public double[] targets;

    public RegressionDataset(String path,  boolean isTrain) {
        this.path = path;
        this.isTrain=isTrain;
    }
    
      @Override
    public  void chargement(){
        System.out.println("chargement message");
    };
    @Override
    public  void pretraitement(){
        System.out.println("pretraitement message");
    };
    
    
}
