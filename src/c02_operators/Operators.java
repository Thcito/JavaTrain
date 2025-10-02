package c02_operators;
public class Operators {

    public static void main(String[] args) {

        // OPERADORES

        // Aritméticos

        var a = 5;
        var b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        //Asignacion

        a = b;
        System.out.println(a);
        a = b * 2;
        System.out.println(a);
        a += 1;
        System.out.println(a); // a = a+1;
        a -= 1;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 2;
        System.out.println(a);
        a %= 2;
        System.out.println(a);
        System.out.println(b);

        //Comparacion (Relacionales)

        System.out.println(a == b);
        System.out.println(a == 0);

        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);

        //Logicos

        // Y (AND) Saldra true solo si todas las partes de la expresion son verdaderas
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println(3 > 2 && 5 == 2);

        // O (OR) Saldra false solo si todas las partes de la expresion son falsas
        System.out.println(true || true);
        System.out.println(true || true);
        System.out.println(true || true);
        System.out.println(true || true);

        System.out.println(3 > 2 || 5 == 2);

        //NO (NOT) da la vuelta al resultado
        System.out.println(!true);
        System.out.println(!false);

        System.out.println(!(3 > 2) || 5 == 2);

        //Unarios. Importante como el valor cambia antes o despues
        System.out.println(+b);
        System.out.println(-b);
        System.out.println(++b);
        System.out.println(b++);
        System.out.println(b);
        System.out.println(--b);
        System.out.println(b--);

        b++;
        System.out.println(++b);


    }

}