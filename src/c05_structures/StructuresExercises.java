package c05_structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class StructuresExercises {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
        int[] values = new int[5];
        System.out.println(values.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println(values[0]);
        values[0] = 10;
        System.out.println(values[0]);

        // 3. Crea un ArrayList vacío.
        var numeros = new ArrayList<Integer>();
        System.out.println(numeros.size());
        System.out.println(numeros);

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        numeros.add(0);
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        System.out.println(numeros);
        numeros.remove(3);
        System.out.println(numeros);

        // 5. Crea un HashSet con 2 valores diferentes.
        var nombres = new HashSet<String>();
        nombres.add("Jose");
        nombres.add("Plata");
        System.out.println(nombres);

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        nombres.add("Jose");
        nombres.add("Manuel");
        System.out.println(nombres);
        System.out.println(nombres.size());

        // 7. Elimina uno de los elementos del HashSet.
        nombres.remove("Manuel");
        System.out.println(nombres);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        var phoneNumber = new HashMap<String, Integer>();
        phoneNumber.put("Jose", 678462597);
        phoneNumber.put("Mama", 627321863);
        phoneNumber.put("Casa", 917061481);
        System.out.println(phoneNumber.size());
        System.out.println(phoneNumber);

        // 9. Modifica uno de los contactos y elimina otro.
        phoneNumber.replace("Mama", 600121314);
        System.out.println(phoneNumber);
        phoneNumber.remove("Casa");
        System.out.println(phoneNumber);

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.

        //No se pueden modificar valores ya que se le pasan en la creacion del array y el tamaño no varia
        String[] frutas = {"Manzana", "Platano", "Melon"};
        System.out.println(frutas.length);
        System.out.println(frutas[0]);
        System.out.println(Arrays.asList(frutas));

        //Una lista nos permite modificar los valores in situ.
        ArrayList<String> miListaFrutas = new ArrayList<>(Arrays.asList(frutas));
        miListaFrutas.add("Naranja");
        System.out.println(miListaFrutas);

        //Un set nos devuelve los datos de forma desordenada ya que a cada dato se le asigna un "HASH"
        HashSet<String> miSetFrutas = new HashSet<>(miListaFrutas);
        System.out.println(miSetFrutas);
        miSetFrutas.add("Fresa");
        System.out.println(miSetFrutas);


        //HashMap asigna una llave y un valor.
        var miMapFrutas = new HashMap<String, String>();

        for (String elemento : miSetFrutas) {
            miMapFrutas.put(elemento, elemento);
        }
        System.out.println(miMapFrutas);


    }
}
