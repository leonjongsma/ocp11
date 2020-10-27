package nl.leon.ocp.javaobjectorientedapproach.overloading;

/**
 * @author : Leon Jongsma
 */
public class Animal {
    private int age;
    private String name;

    public Animal(int age, String name) {
        super(); // refers to constructor in java.lang.Object
        this.age = age;
        this.name = name;
    }

    public Animal(int age) {
        super(); // refers to constructor in java.lang.Object
        this.age = age;
        this.name = null;
    }
}
