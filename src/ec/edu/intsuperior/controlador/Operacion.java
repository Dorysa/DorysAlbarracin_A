/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.controlador;

import  java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Operacion {
    static Scanner leer= new Scanner(System.in);
            
    public static int edad(int anio){
        int n, ed;
        System.out.println("Ingresa tu año de nacimieto");
        n= leer.nextInt();
        ed=anio-n;
        return ed;
    }
 
       public static void ejercicio11 () {
        
        int[] edades = {25, 30, 22, 28, 35};

                for (int i = 0; i < edades.length; i++) {
            System.out.println("Edad " + (i+1) + ": " + edades[i]);
        }
    }
      
    public static void ejercicio12() {
                String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

               for (String dia : diasSemana) {
            System.out.println(dia);
        }
    }
    
    public static void ejercicio13() {
        
        char[] palabra = {'H', 'o', 'l', 'a'};

        
        for (char letra : palabra) {
            System.out.print(letra);
        }
    }
   
    public static void ejercicio14() {
        
        char[][] tableroAjedrez = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tableroAjedrez[i][j] = '.';
            }
        }

        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tableroAjedrez[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void ejercicio15() {
        
        Producto[] productos = new Producto[10];
        productos[0] = new Producto();
        productos[0].nombre = "Manzana";
        productos[0].precio = 1.5;
        

        
        System.out.println("Nombre: " + productos[0].nombre);
        System.out.println("Precio: $" + productos[0].precio);
    }
}




