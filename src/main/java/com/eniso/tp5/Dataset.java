/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5;

/**
 *
 * @author LENOVO
 */
public abstract class Dataset {
    protected boolean isTrain ;
    protected String path;
    public abstract void chargement();
    public abstract void pretraitement();
}
