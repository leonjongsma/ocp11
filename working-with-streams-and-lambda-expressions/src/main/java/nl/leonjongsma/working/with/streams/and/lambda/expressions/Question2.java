package nl.leonjongsma.working.with.streams.and.lambda.expressions;

import java.util.function.Function;

public class Question2 {

    public static <T,U> void show(Function<T,U> f, T in) {
        System.out.println("Result is " + f.apply(in));
    }

    public static void main(String[] args) {
        show(s -> s.length(), "hello");
    }
}
