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
public class Tarea2S1 {
    public static void main(String args[]){
    double s1,s2,s3,s4,s5,tots,pros;
    Scanner lectura= new Scanner(System.in);
    System.out.print ("Ingrese el sueldo del empleado 1: ");
    s1= lectura.nextDouble();
    System.out.print ("Ingrese el sueldo del empleado 2: ");
    s2= lectura.nextDouble();
    System.out.print ("Ingrese el sueldo del empleado 3: ");
    s3= lectura.nextDouble();
    System.out.print ("Ingrese el sueldo del empleado 4: ");
    s4=lectura.nextDouble();
    System.out.print ("Ingrese el sueldo del empleado 5: ");
    s5=lectura.nextDouble();
    tots=s1+s2+s3+s4+s5;
    pros=tots/5;
    System.out.println("La suma total de los sueldos es: "+tots);
    System.out.println("El promedio de los sueldos es: "+pros);
    
}
}