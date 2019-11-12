/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8_3;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Boletin8_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Meses obxMeses = new Meses();
        Scanner sc = new Scanner(System.in);
        System.out.print("Teclea o número do mes: ");
        int numero = sc.nextInt();
        obxMeses.anoSwitch(numero);
    }
    
}
