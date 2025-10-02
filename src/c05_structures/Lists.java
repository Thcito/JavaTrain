package c05_structures;

import java.util.ArrayList;

public class Lists   {

    public static void main (String [] args) {

        //Para trabajar de manera ordenada list

        //Declaracion y creacion
        ArrayList<String> names = new ArrayList<>();
        var numbers = new ArrayList<Integer>();

        //Tamaño
        System.out.println(names.size());

        //Insercion

        names.add("Jose");
        names.add("Plata");
        names.add("Thcito");
        System.out.println(names.size());

        //Acceso

        System.out.println(names.getFirst());
        System.out.println(names.getLast());
        System.out.println(names.get(1));

        //Modificacion

        names.set(2,"jplatalmeira@gmai.com");
        System.out.println(names.getLast());

        //Eliminar

        names.remove(2);
        System.out.println(names.size());

        //Busqueda

        System.out.println(names.contains("Jose"));
        System.out.println(names.contains("jplatalmeira@gmail.com"));

        //Limpieza

        names.add("Jose");
        System.out.println(names);
        names.clear();
        System.out.println(names.size());


    }
}
