package c08_oop;

public class Classes {

    public static void main(String[] args) {


        var person = new Person("Jose Plata", 35);

        // person.name = "Jose";
        // person.age = 35;

        person.sayHello();

        person.name = "Jose Plata";

        System.out.println(person.name);


        var person2 = new Person("Josele", 22);
        person2.sayHello();
    }

}
