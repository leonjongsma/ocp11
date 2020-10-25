package nl.leon.ocp.javaobjectorientedapproach;

import java.util.Optional;

/**
 * @author : Leon Jongsma
 */
public class TestOptional {


    public static void main(String[] args) {
        System.out.println(average(90, 100));
        System.out.println(average());

        Optional<Double> opt = average(90, 100);
        opt.ifPresent(System.out::println);

        Optional<Double> opt2 = average();
        System.out.println(opt2.orElse(Double.NaN));
        System.out.println(opt2.orElseGet(() -> Math.random()));
        System.out.println(opt2.orElseThrow(() -> new IllegalStateException()));
    }

    public static Optional<Double> average(int... scores) {
        if (scores.length == 0)
            return Optional.empty();
        int sum = 0;
        for (int score: scores) {
            sum+= score;
        }
        return Optional.of((double) sum / scores.length);
    }
}
