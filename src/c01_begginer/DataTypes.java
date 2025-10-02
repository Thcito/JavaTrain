package c01_begginer;
public class DataTypes {

    public static void main (String []args) {


        //Tipos de datos primitivos

        //Numeros enteros
        byte myByte = 1; //8 bits (rango de -128 a 127)
        short myShort = 100; // 16 bits (rango de -32,768 a 32,767)
        int myInt = 35; // 32 bits (rango de -2^31 a 2^31-1)
        long myLong = 1000000 ; // 64 bits (rango de -2^63 a 2^63-1).

        //Numéricos de punto flotante
        float myFloat =19.99f;//El sufijo 'f' es necesario para indicar que es float
        //32 bits (números decimales de precisión simple)
        double myDouble = 1.79; // 64 bits (números decimales de precisión doble).

        //Caracter
        char mychar = 'j'; //16 bits (almacena un solo carácter Unicode, entre comillas simples

        //Logico
        boolean myBoolean = true; //Representa un valor de true o false.

        System.out.print("Hoy es dia " + myByte + " de septiembre, mi numero favorito es el " +
                myShort + " tengo " + myInt + " años y " + myLong + " de euros. La temperatura es de " + myFloat + " y mido " + myDouble + " Mi nombre comienza por la letra " +
                + mychar);



    }
}
