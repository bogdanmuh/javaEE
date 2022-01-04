package MyModel;

import jsp.Person;

public class MyModel {
    public Person getPerson(){
        Person person = new Person();
        //..
        person.setName("Max");
        person.setAge(22);
        return person;
    }
}
