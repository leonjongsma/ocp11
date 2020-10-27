package nl.leon.ocp.javaobjectorientedapproach.functional;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * @author : Leon Jongsma
 */
public class TestPredicate {

    public static void main(String[] args) {
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();

        System.out.println(p1.test(""));
        System.out.println(p2.test(""));


        BiPredicate<String, String> b1 = String::startsWith;
        BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);

        System.out.println(b1.test("chicken", "chick"));
        System.out.println(b2.test("chicken", "chick"));

        new TestPredicate().combinePredicates();
    }


    private void combinePredicates() {
        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");
        Predicate brownEggs = egg.and(brown);
        System.out.println(egg.test("egg"));
        System.out.println(egg.test("brown"));
        System.out.println(brown.test("egg"));
        System.out.println(brown.test("brown"));
        System.out.println(brownEggs.test("egg"));
        System.out.println(brownEggs.test("brown"));
        System.out.println(brownEggs.test("brownegg"));
        System.out.println(brownEggs.test("eggbrown"));
    }
}
