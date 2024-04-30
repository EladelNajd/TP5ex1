/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5;

/**
 *
 * @author LENOVO
 */
public class ClassificationDataset extends Dataset {
    public String[] labels ;
    public int numClasses ;

    public ClassificationDataset(String[] labels, int numClasses) {
        this.labels = labels;
        this.numClasses = numClasses;
    }
    public ClassificationDataset(String path,  boolean isTrain ) {
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
