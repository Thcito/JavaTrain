package c03_strings;
public class Strings {

    public static void main (String[] args) {

        //Cadenas de texto

        String name = "Jose";
        var surname = new String ("Plata"); //Redundante

        //Operaciones basicas

        //Concatenacion
        System.out.println(name + " " + surname);

        //Longitud
        System.out.println(name.length());

        //Obtener caracter
        System.out.println(name.charAt(name.length() - 1 ));

        //Substrings
        System.out.println(name.substring(2));
        System.out.println(name.substring(1, 3));

        //Mayusculas y minusculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        //Comprobar si tiene algo
        System.out.println("Hola, Java.".contains("Brais"));
        System.out.println("Hola, Java.".contains("AVA"));
        System.out.println("Hola, Java.".toUpperCase().contains("AVA"));

        //Comparacion
        System.out.println(name.equals("Jose"));
        System.out.println(name.equals("JOSE"));
        System.out.println(name.equalsIgnoreCase("JOSE"));

        // == VS. equals

        var a = "Jose";
        var b = "Jose";
        var c = new String("Jose") ;

        // Trim
        System.out.println(" Hola, me llamo jose ".trim());
        //Replace
        System.out.println(" Hola, me llamo jose ".replace("jose", "pepe"));

        //Format (interpolacion)
        var age = 38;
        System.out.println(String.format("Hola, %s. Tengo %d años.", name , age));

    }

}
