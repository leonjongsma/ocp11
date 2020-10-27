package nl.leon.ocp.javaobjectorientedapproach.functional;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author : Leon Jongsma
 */
public class TestFunction {
    public static void main(String[] args) {
        System.out.println(convertStringtoLength("cluck"));
        System.out.println(convertStringToLengthLambda("cluck"));
        System.out.println(concatStrings("baby", "chick"));
        System.out.println(concatStringsLambda("baby", "chick"));
    }

    public static Integer convertStringtoLength(String input) {
        Function<String, Integer> f1 = String::length;
        return f1.apply(input);
    }

    public static Integer convertStringToLengthLambda(String input) {
        Function<String, Integer> f1 = x -> x.length();
        return f1.apply(input);
    }

    public static String concatStrings(String input1, String input2) {
        BiFunction<String, String, String> b1 = String::concat;
        return b1.apply(input1,input2);
    }

    public static String concatStringsLambda(String input1, String input2) {
        BiFunction<String, String, String> b1 = (string, toAdd) -> string.concat(toAdd);
        return b1.apply(input1, input2);
    }
}
