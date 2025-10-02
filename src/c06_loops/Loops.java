package c06_loops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Loops {

    public static void main (String[]args) {

        // - for controlado por contador

        for (int index = 0; index < 5; index++) {
            System.out.println("Hola , Java");

        }

        for (int index = 0; index >= -10; index--) {
            System.out.println(index);

        }

        String[] names = {"Jose", "Plata", "Almeira", "Pintor"};

        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }

        //- for each

        for (String name : names) {
            System.out.println(name);
        }

        var numbers = new HashSet<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        for (Integer number : numbers) {
            System.out.println(number);
        }

        var users = new HashMap<String, String>();

        users.put("Jose", "Jose@gmail.com");
        users.put("Plata", "Plataa@gmail.com");
        users.put("Almeira", "Almeira@gmail.com");

        for (Map.Entry<String, String> user : users.entrySet()) {
            System.out.println(user.getValue());
            System.out.println(user.getKey());
        }

        // - while (Lo repetimos mientras la condicion sea verdadera )

        int index = 0;
        while (index < 5) {
            System.out.println("Hola, Java");
            index++;

        }

        index = 0;
        while (index < names.length) {
            System.out.println(names[index]);
            index++;

        }

        index = 0;
        boolean find = false;
        while (!find) {
            System.out.println(names[index]);
            if (names[index].equals("Plata")){
                find = true;
            }
            index++;
        }

        // - do-while El "do" se ejecutara al menos una vez antes de evaluar la condicion
        // del "while"

        index = 0;
        do { System.out.println("Hola, Java");
            index++;
        } while (index < 5);

        // -- Control de bucles

        // -- break

        for(String name: names) {
            if (name.equals("Plata")) {
                break;

            } System.out.println(name);

        }

        // -- continue

        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

    }
}
