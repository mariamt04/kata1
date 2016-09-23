package kata1;

import java.util.Date;

public class Person {
     private final String name;
     private final String surname;
     private final Date birthdate;

  
    public Person(String name, String surname, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;
        this.surname = surname;
    }
     
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthdate() {
        return birthdate;
    }
     
    public int getAge() {
        return (int) ((new Date().getTime() - birthdate.getTime())/31536000000L);
    }
}
