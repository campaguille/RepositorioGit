package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduzca su nombre: ");
        String nombre = sc.nextLine();
        
        System.out.println("Hola " + nombre + ", encantado de conocerte");
    }
    
}
