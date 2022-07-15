package nl.leonjongsma.working.with.streams.and.lambda.expressions;

import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        Arrays.asList("Fred", "Jim", "Sheila")
                .stream()
                .peek(System.out::println)
                .allMatch(s -> s.startsWith("F"));
    }

}
