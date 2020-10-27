package nl.leon.ocp.javaobjectorientedapproach.constructorsandfinalfields.errors;

/**
 * @author : Leon Jongsma
 */
public class A {

    /*
        does not compile since value is not initialized, fix is add it to constructor

     */
    private final String value;

    public A() {
        this.value="fixed";
    }

    public static void main(String[] args) {
        new A();
    }

}
