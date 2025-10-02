package c06_loops;

import java.util.*;
import java.util.Arrays;
import  java.lang.Math;

public class LoopsExercises {

    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while.

        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        //ArrayList<String> AR = new ArrayList<>() ;
        var miListaCadena = new ArrayList<String>();

        miListaCadena.add("Paco");
        miListaCadena.add("Pepe");
        miListaCadena.add("Manu");

        i = 0;
        do {
            System.out.println("Ocupa el indice " + i + " " + miListaCadena.get(i));
            i++;
        } while (i < miListaCadena.size());

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.


        for (var index = 0; index <= 50; index++) {
            if (index % 5 == 0) {
                System.out.println(index);
            }

        }

        // 4. Recorre un Array de 5 números e imprime la suma total. En Java, += es el operador de suma y asignación (también llamado operador de asignación compuesta),
        // que realiza una suma entre un operando y el valor de la derecha, y luego asigna el resultado a la variable de la izquierda

        int[] numeros = {1, 2, 3, 4, 5};

        var suma = 0;
        for (int index : numeros) {
            suma += i;
            System.out.println(suma);
            System.out.println(index);
        }

        // 5. Usa un for para recorrer un Array y mostrar sus valores.

        int[] arrayNumeros = {10, 20, 30, 40, 50};

        for (int index = 0; index < arrayNumeros.length; index++) {
            System.out.println(arrayNumeros[index]);
        }
        String[] arrayNombres = {"Carlos", "Pedro", "Juan", "Laura"};
        for (int j = 0; j < arrayNombres.length; j++) {
            System.out.println(arrayNombres[j]);
        }

        for (int pivote : arrayNumeros) {
            System.out.println(pivote);
        }
        for (String pivote : arrayNombres) {
            System.out.println(pivote);
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap.

        var miHashSetNumeros = new HashSet<Integer>();
        var miHashMap = new HashMap<Integer, String>();

        miHashSetNumeros.add(11);
        miHashSetNumeros.add(22);
        miHashSetNumeros.add(33);
        miHashSetNumeros.add(44);
        miHashSetNumeros.add(55);

        for(int pivote : miHashSetNumeros){
            System.out.println(pivote);
        }

        miHashMap.put(1,"Jose");
        miHashMap.put(2,"Maria");
        miHashMap.put(3,"Carlos");
        miHashMap.put(4,"Ruben");

        for(int pivote : miHashMap.keySet()){
            System.out.println(pivote);
        }
        for(String pivote : miHashMap.values()){
            System.out.println(pivote);

        }
        for (Map.Entry pivote : miHashMap.entrySet()) {
            System.out.println(pivote);
        }

        // 7. Imprime los números del 10 al 1 (descendente) con un bucle for.

        for (int k = 10; k >= 1; k--) {
            System.out.println(k );

        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.

        for (int p = 0; p < 20; p++){
            if (p % 3 == 0){
                continue;
            }
            System.out.println(p);
        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.

        int[] myArrayNegativo = {1,2,3,-4,5,6,7};
        for (int l=0; l < myArrayNegativo.length; l++ ){
            if ( myArrayNegativo[l] < 0 ){
                System.out.println("Se encontró un número negativo: " + myArrayNegativo[i]);
                break;
            }
        }

        // 10. Crea un programa que calcule el factorial de un número dado.

        var factor = (int)(Math.random() * 10);

        for (int f=2; f < factor; f++){
            factor*=f;
            System.out.println(factor);
        }


        System.out.println(factor);




    }
}
