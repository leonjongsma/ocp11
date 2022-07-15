package nl.leonjongsma.working.with.streams.and.lambda.expressions;

import java.util.function.BiFunction;

public class Question5 {
    public static void main(String[] args) {
        BiFunction<String, Number, String> funct1 = (final String s, Number n) -> String.format(s, n);
        BiFunction<String, Number, String> funct2 = (s, n) -> s + n;
    }
}
