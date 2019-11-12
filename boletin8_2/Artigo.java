/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8_2;

import java.util.Scanner;

/**
 *
 * @author rcarreraamoedo
 */
public class Artigo {
    Scanner sc = new Scanner(System.in);
    private int prezo;
    private int unidades;
    private double desconto;
    private double TotalPagar;
    
    
    public Artigo(){
    }
    
    public Artigo(int prezo, int unidades, double desconto, double TotalPagar){
        this.prezo=prezo;
        this.unidades=unidades;
        this.desconto=desconto;
        this.TotalPagar=TotalPagar;
    }
    
    public void setPrezo(int prezo){
        this.prezo=prezo;
    }
    public int getPrezo(){
        return prezo;
    }
    public void setUnidades(int unidades){
        this.unidades=unidades;
    }
    public int getUnidades(){
        return unidades;
    }
    public void setDesconto(double desconto){
        this.desconto=desconto;
    }
    public double getDesconto(){
        return desconto;
    }
    public void setTotalPagar(double TotalPagar){
        this.TotalPagar=TotalPagar;
    }
    public double getTotalPagar(){
        return TotalPagar;
    }
    public String CalcularTotal(){
        System.out.print("Escribe o prezo unitario do artigo: ");
        prezo = sc.nextInt();
        System.out.print("Escribre o número de unidades vendidas: ");
        unidades = sc.nextInt();
        if (unidades<100){
        TotalPagar = prezo * unidades;
        }
        else if (100<= unidades && unidades<200) {
            if (prezo > 4000) {
                desconto = 0.05;
            } else {
                desconto = 0.02;
            }
            TotalPagar = unidades * prezo * desconto;
        } else if (unidades >= 200) {
            if (prezo > 4000) {
                desconto = 0.10;
            } else {
                desconto = 0.08;  
            }
            TotalPagar = unidades * prezo * desconto;
        } else {
        TotalPagar = unidades * prezo * desconto;    
        }
    return ("\nUnidades: "+unidades+"\nPrezo Unitario: "+prezo+"\nDesconto: "+desconto+" % \nTotal a Pagar: "+TotalPagar+" €");
    }
}
