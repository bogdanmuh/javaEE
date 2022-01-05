package MyModel;

import jsp.Student;

public class MyModel {
    public Student getStudent(){
        Student person = new Student();
        //..
        person.setName("Max");
        person.setAge(22);
        return person;
    }
}
