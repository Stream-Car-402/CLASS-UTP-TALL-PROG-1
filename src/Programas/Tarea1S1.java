package Programas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JAIME
 */
import java.util.Scanner;
public class Tarea1S1 {
    public static void main(String args[]){
        String cliente,producto;
        double pre,cant,subt,igv,totpag;
        Scanner lectura= new Scanner(System.in);
        System.out.print ("Nombre del cliente: ");
        cliente= lectura.next();
        System.out.print ("Nombre del producto: ");
        producto=lectura.next();
        System.out.print ("Ingrese el precio: ");
        pre= lectura.nextDouble ();
        System.out.print ("Ingrese la cantidad: ");
        cant= lectura.nextDouble ();
        subt=pre*cant;
        igv=subt*0.18;
        totpag=subt+cant;
        System.out.println ("El cliente "+cliente+" compro "+cant+" del producto: "+producto);
        System.out.println ("El costo sin IGV es: "+subt);
        System.out.println ("El costo del IGV es: "+igv);
        System.out.println ("El total a pagar es: "+totpag);           
    }
}
