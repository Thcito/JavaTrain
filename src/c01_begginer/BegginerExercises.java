package c01_begginer;

public class BegginerExercises {

    public static void main (String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String nombre = "Jose";
        // 2. Crea una variable de tipo int y asígnale tu edad.
        int edad = 35;
        // 3. Crea una variable double con tu altura en metros.
        double altura = 1.80;
        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean meGusta = true;
        // 5. Declara una constante con tu email.
        final String email = "jplata@gmail.com";
        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char inicial = 'J';
        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String localidad = "madrid";
        localidad = "cuenca";
        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 2 ;
        int b = 3 ;
        System.out.print("La suma de a y b es: " + (a + b) +"\n");
        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.print("El tipo de variable nombre es: " + nombre.getClass().getSimpleName()+"\n");
        System.out.print("El tipo de varible edad es: " + ((Object)edad).getClass().getSimpleName()+ "\n"); //casteo
        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        double prueba;
        prueba = 20.32;
        System.out.print(prueba);
    }
}
