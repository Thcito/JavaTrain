package c04_conditionals;
import java.util.Scanner;
public class ConditionalsExercises {

    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        var edad = 18;

        if (edad >= 18) {
            System.out.println("Puede votar");
        } else if (edad < 18) {
            System.out.println("NO puedes votar");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        var num1 = 55;
        var num2 = 25;

        if (num1 > num2) {
            System.out.println("El " + num1 + " es mayor que " + num2);
        } else if (num1 < num2) {
            System.out.println("El " + num1 + " es menor que " + num2);
        } else if (num2 > num1) {
            System.out.println("El " + num2 + " es menor que " + num1);
        } else if (num1 < num2) {
            System.out.println("El " + num2 + " es menor que " + num1);
        } else if (num1 == num2 || num2 == num1) {
            System.out.println("Los numeros son iguales");

        }
        // 3. Dado un número, verifica si es positivo, negativo o cero.
        /*var numRandom = (int) (Math.random() * 101 );
         */
        var min = -100;
        var max = 100;
        var rango = max - min + 1;

        var numRandom = (int) (Math.random() * rango) + min;
        System.out.println(numRandom);
        if (numRandom < 0) {
            System.out.println(numRandom + " Es un numero negativo ");
        } else if (numRandom > 0 && numRandom < 100) { //Jamas saldra un numero mayor de 100 ya que le hemos asignado un rango a la variable numRandom.
            System.out.println(numRandom + " Es un numero positivo ");
        } else if (numRandom == 0) {
            System.out.println(" El valor es zero ");

        }
        // 4. Crea un programa que diga si un número es par o impar.
        var numRandomParImpar = (int) (Math.random() * 200);
        if (numRandomParImpar % 2 == 0) {
            System.out.println(numRandomParImpar + " Es numero par");

        } else {
            System.out.println(numRandomParImpar + " Es numero impar");

        }

        // 5. Verifica si un número está en el rango de 1 a 100.
        if (numRandomParImpar > 1 && numRandomParImpar <= 100) {
            System.out.println(numRandomParImpar + " Esta en el rango");

        } else {
            System.out.println(numRandomParImpar + " Esta fuera del rango");
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        var day = 3;
        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente"(80-100), "Aprobado"(50-80) o "Suspenso(0-49)" según la nota (0-100).
        var notas = (int) (Math.random() * 101);

        if (notas >= 0 && notas <= 49) {
            System.out.println("Con un " + notas + " estas suspenso");
        } else if (notas >= 50 && notas <= 80) {
            System.out.println("Con un " + notas + " estas aprobado");
        } else if (notas >= 80) {
            System.out.println("Con un " + notas + " tienes un sobresaliente");
        }
        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿ Que edad tienes ?");
        int edadScanner = entrada.nextInt();

        entrada.nextLine();

        System.out.println("¿ Vienes acompañado de tutor legal ?");
        String acompanado = entrada.nextLine();
        if (acompanado.equalsIgnoreCase("Si")) {

        } else if (acompanado.equalsIgnoreCase("No")) {

        } else {
            System.out.println("La respuesta debe ser unicamente si ó no");
            return;
        }


        System.out.println("El usuario tiene " + edadScanner + " y " + acompanado + " esta acompañado");


        if (edadScanner >= 15) {
            System.out.println("Puedes pasar al ser mayor de edad.");
        } else if (edadScanner < 15 && acompanado.equalsIgnoreCase("si")) {
            System.out.println("Puedes pasar con tu tutor legal");
        } else {
            System.out.println("No puedes pasar siendo menor de edad o sin tutor legal");
        }


        // 9. Crea un programa que diga si una letra es vocal o consonante.
        var letra = 'a';

        switch (letra) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(letra + " Es una vocal");
            default:
                System.out.println(letra + " Es una consonante");
        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.

        System.out.println("Introduce el valor de la primera variable");
        var a = entrada.nextInt();
        System.out.println("Introduce el valor de la segunda variable");
        var b = entrada.nextInt();
        System.out.println("Introduce el valor de la tercera variable");
        var c = entrada.nextInt();

        if (a > b && a > c) {
            System.out.println("A es la varible con el valor mas alto , " + a);
        } else if (b > a && b > c) {
            System.out.println("B es la varible con el valor mas alto , " + b );
        } else {
            System.out.println("C es la varible con el valor mas alto , " + c);
        }
        entrada.close();

    }
}
