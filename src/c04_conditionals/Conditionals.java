package c04_conditionals;
public class Conditionals {

    public static void main(String[] args) {

        //Condicionales  PARA COMPROBAR CONDICIONES (TRUE FALSE)

        var age = 16;

        if (age > 18) {
            System.out.println("El usuario es mayor de edad");
        } else if (age == 18) {
            System.out.println("El usuario acaba de cumplir 18");
        } else {
            System.out.println("El usuario es menor de edad");

        }

        //Switch INSPECCIONAR VALOR DE LA VARIABLE E IGUALANDOLO AL CASE

        var day = 6;

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
            default:
                System.out.println("No es lunes, martes o miercoles");
        }
    }
}
