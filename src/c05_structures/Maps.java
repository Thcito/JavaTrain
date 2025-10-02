package c05_structures;

import java.util.HashMap;
import java.util.HashSet;

public class Maps {


    public static void main (String[]args) {

        //Declaracion y creacion

        HashMap<String, String > names = new HashMap();
        var numbers = new HashMap <Integer, String>();

        //Tamaño

        System.out.println(names.size());

        //Añadir elemento

        names.put("Jose", "Thcito@gmail.com");
        names.put("Plata","Jplatalmeira@gmail.com");
        names.put("Thcito", "thdev@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        //Acceder a los elementos

        System.out.println(names.get("Jose"));
        System.out.println(names.get("jose"));


        //Verificar elemenos

        System.out.println(names.containsKey("Plata"));
        System.out.println(names.containsKey("plata"));

        System.out.println(names.containsValue("Jplatalmeira@gmail.com"));
        System.out.println(names.containsValue("jplatalmeira@gmail.com"));

        //Eliminar elementos

        System.out.println(names.remove("Jose"));
        System.out.println(names.remove("Plata"));
        System.out.println(names);

        //Limpiar HashMap

        //names.clear();
        System.out.println(names);

        //Otras operaciones
        names.put("Jose", "Thcito@gmail.com");
        System.out.println(names);

        names.put("Jose", "Thcitodev@gmail.com");//MACHACA el valor
        System.out.println(names);

        names.replace("Thcito","devth@gmail.com"); //Reemplaza el valor si existe
        System.out.println(names);

        names.putIfAbsent("Thcito","devth@gmail.com");
        System.out.println(names);

        //Otras operaciones

        System.out.println(names.isEmpty());
        var values = names.values();
        System.out.println(values);




    }
}
