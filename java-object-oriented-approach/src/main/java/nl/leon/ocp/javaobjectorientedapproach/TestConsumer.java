package nl.leon.ocp.javaobjectorientedapproach;

import java.util.function.Consumer;

/**
 * @author : Leon Jongsma
 */
public class TestConsumer {

    public static void main(String[] args) {

        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);

        c1.accept("Annie");
        c2.accept("Annie");

    }
}
