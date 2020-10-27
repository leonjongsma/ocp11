package nl.leon.ocp.javaobjectorientedapproach.functional;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 * @author : Leon Jongsma
 */
public class TestOperator {


    public static void main(String[] args) {
        System.out.println(testUnaryOperator("chirp"));
        System.out.println(testUnaryOperatorLamba("chirp"));
        System.out.println(testBinaryOperator("baby" , "chick"));
        System.out.println(testBinaryOperatorLamba("baby" , "chick"));
    }

    private static String testUnaryOperator(String input) {
        UnaryOperator<String> u = String::toUpperCase;
        return u.apply(input);
    }

    private static String testUnaryOperatorLamba(String input) {
        UnaryOperator<String> u= x -> x.toUpperCase();
        return u.apply(input);
    }

    private static String testBinaryOperator(String input1, String input2) {
        BinaryOperator<String> b = String::concat;
        return b.apply(input1,input2);
    }

    private static String testBinaryOperatorLamba(String input1, String input2) {
        BinaryOperator<String> b = (string, toadd) -> string.concat(toadd);
        return b.apply(input1,input2);
    }


}
