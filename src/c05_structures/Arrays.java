package c05_structures;

public class Arrays {

    public static void main (String [] args)  {
        //Arrays es una estructura que puede almacenar datos del mismo tipo (en java) indexados a nivel de secuencia.

        //Declaracion y creacion

        int[] numeros = {1,2,3,4,5};
        int[] miArrayEnteros = new int[5];
        miArrayEnteros[2] = 10;
        System.out.println("posuion" +numeros[3]);
        System.out.println("Posuion" + miArrayEnteros[2]);

        String[] nombres = {"Carlos","Pedro","Juan","Laura"};
        String[] miArrayCadena = new String[4];


        int[] numbers = new int[3];
        System.out.println(numbers);

        String[] names = {"Jose","Plata","Thcito" };
        System.out.println(names);


        //Acceso
        System.out.println(numbers[0]);
        System.out.println(names[0]);

        System.out.println((new int[3])[0]);


        //Modificacion
        numbers[0] = 1;
        numbers[1] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        //numbers[3] = 2; Error

        System.out.println(names[2]);
        names[2] = "jplatalmeira@gmail.com";
        System.out.println(names[2]);

        System.out.println(names.length);
        names[2] = null;
        System.out.println(names[2]);
        System.out.println(names.length);

        //numbers[2] = null; Error

        boolean[] booleans = new boolean[5];
        System.out.println(booleans[4]);


    }

}
