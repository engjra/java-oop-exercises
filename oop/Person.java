
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.printf("Hello, my name is %s and I am %d years old.%n", name, age);
    }

    public static void main(String[] args) {
        Person p = new Person("Engjellusha", 29);
        p.greet();  
    }
}
 

