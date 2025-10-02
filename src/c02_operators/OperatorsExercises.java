package c02_operators;
public class OperatorsExercises {

    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.
        var a = 5;
        var b = 10;
        var c = a + b;
        System.out.println(c);

        // 2. Crea una variable para cada tipo de operación de asignación o asignacion compuesta.
        c += 1;
        System.out.println(c);
        c -= 1;
        System.out.println(c);
        c *= 2;
        System.out.println(c);
        c /= 2;
        System.out.println(c);
        c %= 1;
        System.out.println(c);

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        System.out.println(a == 5);
        System.out.println(a != 4);
        System.out.println(a >= 5);

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println(a < 3);
        System.out.println(a <= 4);
        System.out.println(a != 5);

        // 5. Utiliza el operador lógico and.Unicamente para true ambas verdaderas
        System.out.println(5 < 6 && 5 == 5);
        System.out.println(5 >= 5 && 4 > 6);

        // 6. Utiliza el operador lógico or. Unicamente para false todas falsas
        System.out.println(b == 15 || b >= 12);
        System.out.println(25 <= 26 || b != 10);

        // 7. Combina ambos operadores lógicos.

        // 8. Añade alguna negación.
        System.out.println(b > 9 && !(1 < 2));

        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        System.out.println(b);
        System.out.println(+b);
        System.out.println(-b);
        System.out.println(b++);
        System.out.println(b);
        System.out.println(++b);
        System.out.println(b--);
        System.out.println(b);
        System.out.println(--b);

        // 10. Combina operadores aritméticos, de comparación y lógicos.
        System.out.println(((a + b) >= 15) && 15 != b + a);

    }
}
