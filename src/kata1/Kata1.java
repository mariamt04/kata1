package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
       Person person = new Person ("María", "Montes", new Date(95,9,4));
        System.out.println(person.getName() + " " + person.getSurname() + " tiene " + person.getAge() + " años");     
    }
}
