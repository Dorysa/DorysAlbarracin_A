/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.modelo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicios {
     static Scanner leer = new Scanner(System.in);
      public static void ejercicio_1() {
        int a, b, c;
        System.out.println("Ingresa primer numero:");
        a = leer.nextInt();
        System.out.println("Ingresa segundo numero");
        b = leer.nextInt();
        System.out.println("Ingresa tercer numero");
        c = leer.nextInt();

        if (a > b && b > c) {
            System.out.println(a + ", " + b + ", " + c);
        } else {
            if (a > c && c > b) {
                System.out.println(a + ", " + c + ", " + b);
            } else {
                if (b > a && a > c) {
                    System.out.println(b + ", " + a + ", " + c);
                } else {
                    if (b > c && c > a) {
                        System.out.println(b + ", " + c + ", " + a);
                    } else {
                        if (c > a && a > b) {
                            System.out.println(c + ", " + a + ", " + b);
                        } else {
                            if (c > b && b > a);
                            System.out.println(c + ", " + b + ", " + a);

                        }
                    }
                }
            }
        }
    }

    public static void ejercicio_2() {
        int num;
        System.out.print("Introduzca un número entre 0 y 99.999: ");
        num = leer.nextInt();
        if (num < 10) {
            System.out.println("tiene 1 cifra");
        } else {
            if (num < 100) {
                System.out.println("tiene 2 cifras");
            } else {
                if (num < 1000) {
                    System.out.println("tiene 3 cifras");
                } else {
                    if (num < 10000) {
                        System.out.println("tiene 4 cifras");
                    } else {
                        if (num < 100000) {
                            System.out.println("tiene 5 cifras");
                        } else {
                        }
                    }
                }
            }
        }
    }

    public static void ejercicio_3() {
        int num;
        int dm, um, c, d, u;

        System.out.print("Introduzca un número entre 0 y 99.999: ");
        num = leer.nextInt();

        u = num % 10;
        num = num / 10;

        d = num % 10;
        num = num / 10;

        c = num % 10;
        num = num / 10;

        um = num % 10;
        num = num / 10;

        dm = num;

        System.out.println(u + " " + d + " " + c + " " + um + " " + dm);

        num = 10000 * u + 1000 * d + 100 * c + 10 * um + dm;
        System.out.println(num);
    }

    public static void ejercicio_4() {
        int num;
        int dm, um, c, d, u;

        System.out.println("Introduzca un numero entre 0 y 99.999: ");
        num = leer.nextInt();

        u = num % 10;
        num = num / 10;

        d = num % 10;
        num = num / 10;

        c = num % 10;
        num = num / 10;

        um = num % 10;
        num = num / 10;

        dm = num;

        if (dm == u && um == d) {
            System.out.println("el numero es capicua");
        } else {
            System.out.println("el numero NO es capicua");
        }

    }

    public static void ejercicio_5() {
        int nota;
        System.out.print("Introduzca una nota: ");
        nota = leer.nextInt();

        if (nota >= 0 && nota < 5) {
            System.out.println("INSUFICIENTE");
        } else {
            if (nota == 5) {
                System.out.println("SUFICIENTE");
            } else {
                if (nota == 6) {
                    System.out.println("BIEN");
                } else {
                    if (nota == 7 || nota == 8) {
                        System.out.println("NOTABLE");
                    } else {
                        if (nota == 9 || nota == 10) {
                            System.out.println("SOBRESALIENTE");
                        }
                    }
                }
            }
        }
    }

    public static void ejercicio_6() {
        int num;
        System.out.print("Introduzca un numero: ");
        num = leer.nextInt();
        while (num != 0) {
            if (num > 0) {
                System.out.println("Positivo");
            } else {
                System.out.println("Negativo");
            }

            System.out.print("Introduzca otro numero: ");
            num = leer.nextInt();
        }

    }

    public static void ejercicio_7() {
        int num, cuadrado;
        System.out.print("Introduzca numero: ");
        num = leer.nextInt();
        while (num >= 0) {
            cuadrado = num * num;
            System.out.println(num + "² es igual a " + cuadrado);
            System.out.print("Introduzca otro numero: ");
            num = leer.nextInt();
        }
    }

    public static void ejercicio_8() {
        int num, contador;

        System.out.print("Introduzca un numero: ");
        num = leer.nextInt();
        contador = 0;

        while (num > 0) {
            contador = contador + 1;
            System.out.print("Introduzca otro numero: ");
            num = leer.nextInt();
        }
        System.out.println("Se han introducido: " + contador + " numeros");

    }

    public static void ejercicio_9() {
        int n, num;
        System.out.print("Introduce N: ");
        n = leer.nextInt();
        System.out.print("Introduce número: ");
        num = leer.nextInt();

        while (num != n) {
            if (num > n) {
                System.out.println("menor");
            } else {
                System.out.println("mayor");
            }
            System.out.print("Introduce número: ");
            num = leer.nextInt();
        }

        System.out.println("acertaste...");
    }

    public static void ejercicio10() {
        int num, suma;
        suma = 0;
        do {
            System.out.print("Introduzca un numero: ");
            num = leer.nextInt();
            suma = suma + num;
        } while (num != 0);

        System.out.println("La suma de todos los numeros es: " + suma);

    }
    
}
