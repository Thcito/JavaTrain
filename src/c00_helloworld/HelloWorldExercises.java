package c00_helloworld;

//Esta clase es pública y se puede usar desde cualquier
// otro paquete.

public class HelloWorldExercises {

    // Es la firma del metodo principal en Java, el punto de entrada
//  obligatorio que la Máquina Virtual de Java (JVM) busca y ejecuta
//  para iniciar una aplicación independiente
    //public: de acceso publico desde fuera de la clase
    //static: el metodo pertenece a la clase misma no a una
    //instancia particular de ella
    //void: el metodo no tiene valor de retorno.
    //main: punto de inicio de ejecucion de codigo para JVM
    //String[]args: Parametro cadena de texto
    public static void main (String[] args ) {

        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
        System.out.println("Jose Plata Almeira");
        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
        System.out.println("Hola \n Mundo"   );
        // 3. Añade un comentario sobre lo que hace cada línea del programa.
        // Imprime texto por pantalla
        // 4. Crea un comentario en varias líneas.

        // 5. Imprime tu edad, tu color favorito y tu ciudad.
        System.out.println(" 35, negro, Madrid");
        // 6. Explora los diferentes System.XXX.println(); más allá de "out".

        // 7. Utiliza varios println para imprimir una frase.
        System.out.println("hola caracola! ");// con salto de linea

        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
        String carafeliz =
                """
                          *** \s
                        * ^ ^ *
                        *  __ *
                          *** \s""";

        System.out.println(carafeliz);

        // 9. Intenta ejecutar el programa sin el metodo main y observa el error.

        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
    }

}
