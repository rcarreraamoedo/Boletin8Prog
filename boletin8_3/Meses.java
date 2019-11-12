/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8_3;

/**
 *
 * @author usuario
 */
public class Meses {
    public void anoSwitch (int numero){
        switch(numero){
            case 1: System.out.println("1...Enero = 31 días");break;
            case 2: System.out.println("2...Febrero = 28 días");break;   
            case 3: System.out.println("3...Marzo = 31 días");break;
            case 4: System.out.println("4...Abril = 30 días");break;
            case 5: System.out.println("5...Mayo = 31 días");break;
            case 6: System.out.println("6...Junio = 30 días");break;
            case 7: System.out.println("7...Julio = 31 días");break;
            case 8: System.out.println("8...Agosto = 31 días");break;
            case 9: System.out.println("9...Septiembre = 30 días");break;
            case 10: System.out.println("10...Octubre = 31 días"); break;
            case 11: System.out.println("11...Noviembre = 30 días");break;
            case 12: System.out.println("12...Diciembre = 31 días");break;
    }
}
}