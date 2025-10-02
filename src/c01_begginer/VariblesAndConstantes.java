package c01_begginer;
public class VariblesAndConstantes {

    public static void main (String[] args){

        String name = "Jose";
        System.out.println(name);

        name = "Thcito";
        System.out.println(name);

        // name = 25; (no podemos cambiar le tipo de dato String a un int

        int age = 35;
        System.out.println(age);
        /* Nuevas versiones de JAVA tienen la INFERENCIA DE TIPO:
         la MV reconoce la variable segun el tipo de dato que
         usemos sin necesidad de indicar el tipo (tipar) de variable
         gracias a "var".
         */

        var email = "thcito@hotmail.com";
        System.out.println(email);


        //Constantes

        final String EMAIL = "thcito@hotmail.com";
        // email = "thcito2@gmail.com"; Es constante
        System.out.print(EMAIL);



    }
}
