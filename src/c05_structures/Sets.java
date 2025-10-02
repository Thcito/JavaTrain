package c05_structures;

import java.util.ArrayList;
import java.util.HashSet;

public class Sets {

    public static void main (String [] args) {
        //Para busqueda mejor set
        //La manera en la que se indexa es con un hash no con indice, es mas rapido.

        //Declaracion y creacion
        HashSet<String> names = new HashSet<>();

        var numbers = new HashSet <Integer>();

        //Tamaño

        System.out.println(names.size());

        //Añadir elemento

        names.add("Jose");
        names.add("Plata");
        names.add("Thcito");
        names.add("jplatalmeira@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        //Eliminar elementos

        names.remove("Jose");
        System.out.println(names.size());


        //Buscar elementos

        System.out.println(names.contains("Jose"));
        System.out.println(names.contains("jplatalmeira@gmail.com"));

        //No acepta duplicados
        System.out.println(names);
        names.add("Jose");
        names.add("Jose");
        names.add("Jose");
        System.out.println(names);

        //Conjutos

        // names.addAll(numbers); Error por incompatibilidad de datos

        var countries = new HashSet <String>();
        countries.add("España");
        countries.add("Mexico");
        countries.add("Argentina");
        countries.add("Thcito");

        names.addAll(countries);
        System.out.println(names);

        names.removeAll(countries);
        System.out.println(names);

        names.retainAll(countries);
        System.out.println(names);

    }
}
