package c07_functions;

import c05_structures.Arrays;

public class FunctionsExercises {


    public static void funcionSaludo() {
        System.out.println("Te saludo desde una funcion");
    }

    public static void funcionSaludoConParametro(String nombre) {
        System.out.println("Saludo con parametro para " + nombre);
    }

    public static void funcionSumaResta(int num1, int num2) {
        System.out.println("Restar " + num1 + " a " + num2 + " da un resultado de " + (num1 - num2));
    }

    public static void funcionCuadrado(int num1) {
        System.out.println("El cuadrado de " + num1 + " es " + (num1 * num1));
    }

    public static void funcionParImpar(int num1) {
        if (num1 % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }

    public static boolean funcionBoolean(int edad) {

        if (edad >= 18) {
            System.out.println("Con " + edad + " eres mayor de edad");
            return true;

        }

        System.out.println("Con " + edad + " eres menor de edad");
        return false;
    }

    public static boolean funcionCadena(String cadena) {
        if (cadena.isEmpty()) {
            System.out.println("La cadena esta vacia");
            return false;
        }
        System.out.println(cadena.length());
        return true;
    }

    public static double funcionArrayMedia(int[] numeros) {
        var suma = 0;
        for (int numero : numeros) {
            suma += numero;
            System.out.println(suma);
        }
        return suma / numeros.length;
    }

    public static double functionFactorial(double numFac) {
        long factorial = 1;

        for (int i = 1; i <= numFac; i++) {
            factorial = factorial * i;
            System.out.println("El factorial de " + numFac + " es: " + factorial);
        }
        return factorial;
    }

    public static void main(String[] args) {

        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
        funcionSaludo();
        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
        funcionSaludoConParametro("Thcito@gmail.com");
        // 3. Haz un metodo que reciba dos números enteros y devuelva su resta.
        funcionSumaResta(30, 15);
        // 4. Crea un metodo que calcule el cuadrado de un número (n * n).
        funcionCuadrado(25);
        // 5. Escribe una función que reciba un número y diga si es par o impar.
        funcionParImpar(3);
        // 6. Crea un metodo que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
        var state = funcionBoolean(15);
        System.out.println(state);
        // 7. Implementa una función que reciba una cadena y retorne su longitud.
        funcionCadena("Aprendiendo java");
        // 8. Crea un metodo que reciba un array de enteros, calcula su media y lo retorna.
        int[] arrayNumeros = {15, 12, 16};
        var media = funcionArrayMedia(arrayNumeros);
        System.out.println("La media del array es: " + media);
        // 9.  Escribe un metodo que reciba un número y retorna su factorial.
        functionFactorial(7);
        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.

    }


}





