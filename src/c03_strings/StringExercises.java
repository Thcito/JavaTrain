package c03_strings;
public class StringExercises {

    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        var saludo = ("Hola ");
        System.out.println(saludo + "estoy concatenando un string.");

        // 2. Muestra la longitud de una cadena de texto.
        System.out.println(saludo.length());
        // 3. Muestra el primer y último carácter de un string.
        System.out.println(saludo.charAt(0));
        System.out.println(saludo.charAt(3));

        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(saludo.toUpperCase());
        System.out.println(saludo.toLowerCase());
        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        var palabra = (" Busca la 2 palabra ");
        System.out.println(saludo.contains("la"));
        // 6. Formatea un string con un entero.
        var altura = 1.80;

        System.out.println(String.format("No soy muy alto, mido %f", altura));

        // 7. Elimina los espacios en blanco al principio y final de un string.
        System.out.println(palabra);
        System.out.println(palabra.trim());
        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println(palabra.replace(" ", "-"));
        // 9. Comprueba si dos strings son iguales.
        System.out.println(palabra.equals(altura));
        System.out.println(palabra.equals(" Busca la 2 palabra "));

        // 10. Comprueba si dos strings tienen la misma longitud.
        var comparar = "Estoy comparando";
        System.out.println(palabra.length() < comparar.length()); {

        }
    }
}

