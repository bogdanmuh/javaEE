package jsp;

// bean это обычный класс у которого есть конструктор по умолчанию,
// и все поля приватные и для каждого поля существует геттеры и сеттеры
public class Student {
    private String name ;
    private int age;
    public Student() {}
    public Student(int age) {
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
