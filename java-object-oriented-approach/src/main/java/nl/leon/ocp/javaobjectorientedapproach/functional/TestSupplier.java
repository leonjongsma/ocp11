package nl.leon.ocp.javaobjectorientedapproach.functional;

import java.util.ArrayList;
import java.util.function.Supplier;

/**
 * @author : Leon Jongsma
 */
public class TestSupplier {


    public static void main(String[] args) {

        Supplier<StringBuilder> s1 = StringBuilder::new;
        Supplier<StringBuilder> s2 = () -> new StringBuilder();


        System.out.println(s1.get());
        System.out.println(s2.get());


        Supplier<ArrayList<String>> s3 = ArrayList<String>::new;

        ArrayList<String> a1 = s3.get();

        System.out.println(a1);

        System.out.println(s3);
    }
}
