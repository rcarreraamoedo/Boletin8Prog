/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8_1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class cantidad {
    Scanner sc = new Scanner(System.in);
    private double cantidade;
    private double incremento;
    private double cantidadeFinal;
    
    public cantidad(){
    }
    public cantidad(double cantidade, double incremento, double cantidadeFinal){
        this.cantidade=cantidade;
        this.incremento=incremento;
        this.cantidadeFinal=cantidadeFinal;
    }
    public void setcantidade(double cantidade){
        this.cantidade=cantidade;
    }
    public double getcantidade(){
        return  cantidade;
    }
    public void setincremento (double incremento){
        this.incremento=incremento;
    }
    public double getincremento(){
        return incremento;
    }
    public void setcantidadeFinal (double cantidadeFinal){
        this.cantidadeFinal=cantidadeFinal;
    } 
    public double getcantidadeFinal(){
        return cantidadeFinal;
    }
    
    public String calcularCant(){
        System.out.print("Escribe un número: ");
        cantidade = sc.nextDouble();
        if (cantidade<500){
        incremento = 0.05;
        cantidadeFinal = cantidade +(cantidade*incremento);
        }else if (cantidade>=500 && cantidade<=1000){
        incremento = 0.07;
        cantidadeFinal = cantidade +(cantidade*incremento);
        }else if (cantidade>1000 && cantidade<=5000){
        incremento = 0.15;
        cantidadeFinal = cantidade +(cantidade*incremento);
        }else{
        incremento = 0.03;
        cantidadeFinal = cantidade -(cantidade*incremento);   
        }
        return ("\nCantidade: "+cantidade+"\nIncremento:  "+Math.round(incremento*100)+"%"+"\nCantidade final "+cantidadeFinal);
    }
}
