/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop6;

/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Clase empaquetada desde el IDE");
        System.out.println("La suma es: "+suma(2,2));
        System.out.println("Nueva linea");
    }
    
    /**
     * REtorna una suma de dos enteros, a y b
     * @param a número entero primero
     * @param b numero entero segundo
     * @return la suma de a y b
     */
    public static int suma (int a, int b){
        return a+b;
    }        
}
