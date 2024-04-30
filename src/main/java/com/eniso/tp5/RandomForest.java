/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5;

/**
 *
 * @author LENOVO
 */
public class RandomForest extends BaseModel {
    public int numTrees ;
    public int maxDepth ;

    public RandomForest( String description,int numTrees, int maxDepth) {
       this.description=description;
        this.numTrees = numTrees;
        this.maxDepth = maxDepth;
    }

    
      @Override
    public void train(Dataset dataset){
        System.out.println("foret aleatoire ");
    }
    @Override
     public double predict(Dataset dataset){
        return 3.11111;
    }
    
}
