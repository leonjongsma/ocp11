package nl.leonjongsma.working.with.streams.and.lambda.expressions;

import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class Question3 {
    public static void main(String[] args) {
        ToIntFunction<Double> ob = a -> (a.intValue() + 10);
        System.out.println(ob.applyAsInt(1.0));

        UnaryOperator<Integer> func = x -> x +10;
        System.out.println(func.apply(1));
    }
}
