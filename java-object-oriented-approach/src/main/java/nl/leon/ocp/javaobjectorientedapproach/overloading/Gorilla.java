package nl.leon.ocp.javaobjectorientedapproach.overloading;

/**
 * @author : Leon Jongsma
 */
public class Gorilla extends Animal {

    public Gorilla(int age) {
        super(age,"Gorilla");
    }

    public Gorilla() {
        super(5);
    }
}
