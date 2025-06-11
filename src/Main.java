class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("sinjwu", 31);
        Person p2 = new Person("wlmoon", 18);
    }
}