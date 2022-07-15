package nl.leonjongsma.working.with.streams.and.lambda.expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Question6 {

    public static<E> List<E> filterList(List<E> input, Predicate<E>condition) {
        List<E> output = new ArrayList<>();
        for (E e : input) {
            if (condition.test(e)) {
                output.add(e);
            }
        }
        return output;
    }
}
