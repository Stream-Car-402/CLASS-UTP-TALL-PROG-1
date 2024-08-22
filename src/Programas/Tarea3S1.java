/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;

/**
 *
 * @author JAIME
 */
import java.util.Scanner;
public class Tarea3S1 {
    public static void main(String args[]){
        String empleado,cargo;
        Double ingr,gas,am,ab,as,aa;
        Scanner lectura= new Scanner (System.in);
        System.out.print ("Nombre del empleado: ");
        empleado= lectura.next ();
        System.out.print ("Cargo del empleado: ");
        cargo=lectura.next ();
        System.out.print ("Ingreso mensual del empleado: ");
        ingr=lectura.nextDouble();
        System.out.print ("Gasto mensual del empleado: ");
        gas=lectura.nextDouble();
        am=ingr-gas;
        ab=am*2;
        as=ab*3;
        aa=as*2;
        System.out.println("El empleado "+empleado+" con el cargo de "+cargo+" tiene un ingreso mensual de "+ingr+" y un gasto mensual de "+gas);
        System.out.println("Su ahorro mensual es: "+am);
        System.out.println("Su ahorro bimestral es: "+ab);
        System.out.println("Su ahorro semestral es: "+as);
        System.out.println("Su ahorro anual es: "+aa);

    }   
}
